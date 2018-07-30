package com.iwhys.classeditor.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on 19/07/2018 09:41
 * Description:编辑方法注解,支持切面规则
 *
 * @author 王洪胜
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface EditMethod {
    /**
     * 标记被需要被编辑的方法,支持正则
     */
    String value();
}
