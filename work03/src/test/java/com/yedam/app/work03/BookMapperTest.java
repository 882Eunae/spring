package com.yedam.app.work03; 

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.yedam.app.work03.mapper.BookMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
    "classpath:spring/datasource-context.xml",
    "classpath:spring/mybatis-context.xml"
})
public class BookMapperTest {

    @Autowired
    BookMapper bookMapper;

    @Test
    public void 전체조회() {
        bookMapper.findAll().forEach(book -> System.out.println(book.getTitle()));
    }
}
