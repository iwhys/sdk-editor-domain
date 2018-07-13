package com.iwhys.classeditor.domain.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 13/07/2018 07:37
 * Description: 标记替换方法操作
 *
 * @author 王洪胜
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface EditMethod {

    String value() default "";
}
