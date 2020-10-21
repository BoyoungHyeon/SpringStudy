package com.sist.di2;
import java.util.*;
public class ApplicationContext {
	private Map map=new HashMap();
	public ApplicationContext(String path){
		
	}
	public Object getBean(String key){
		return map.get(key);
	}
}
