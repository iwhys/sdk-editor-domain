package com.iwhys.sdkeditor.domain;

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
    /**
     * 标记需要被替换的类所在包的标识
     * 依赖库格式[group:name:version]取<font color="red"><b>[name:version]</b></font>作为标识
     * 如：原依赖[androidx.core:core:1.3.0] 取[core:1.3.0]作为标识
     */
    String value() default "";
}
