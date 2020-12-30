package com.cos.reflect.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 함수 or 필드 or 클래스 위에 작성
@Retention(RetentionPolicy.RUNTIME) //실행시점 런타임, 컴파일
public @interface RequestMapping {
	String value();
}
