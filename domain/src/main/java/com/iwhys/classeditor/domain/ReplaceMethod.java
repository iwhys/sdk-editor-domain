package com.iwhys.classeditor.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 19/07/2018 09:38
 * Description: 替换方法注解, 用于标记被替换方法的实现方法,要被替换方法的完整方法签名
 *
 * @author 王洪胜
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface ReplaceMethod {
    /**
     * 标记需要被替换的方法,value无实际意义
     */
    String value() default "";
}
