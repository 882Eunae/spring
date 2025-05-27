package com.yedam;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

/**
 * Application Lifecycle Listener implementation class applicationListener
 *
 */
public class applicationListener implements ServletContextListener, ServletRequestListener, ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public applicationListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    }

    // 애플리케이션 시작될 때 이벤트 핸들러 
    public void contextInitialized(ServletContextEvent sce)  { 
      System.out.println("어플리케이션 시작");
    }

	// 애플리케이션 종료될때 이벤트 핸들러 
    public void contextDestroyed(ServletContextEvent sce)  { 
    	 System.out.println("어플리케이션 종료");
    }

	//request 생성될때 이벤트 핸들러 
    public void requestInitialized(ServletRequestEvent sre)  { 
         System.out.println("request 속성 추가");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }


    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
        System.out.println("속성추가");
    }
	
}
