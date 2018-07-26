package com.iwhys.classeditor.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 19/07/2018 09:38
 * Description: 替换类注解,用于标记被替换类的实现类
 *
 * @author 王洪胜
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface ReplaceClass {
    String value() default "";
}
