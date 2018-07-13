package com.iwhys.classeditor.domain.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 06/07/2018 15:05
 * Description: 标记编辑类操作
 *
 * @author 王洪胜
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface EditClass {

    String value() default "";
}
