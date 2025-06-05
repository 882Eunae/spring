package com.yedam.app.sample;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;
@Component
@Data 
@RequiredArgsConstructor 
public class Restaurant { 
   private final Chef chef; 
} 