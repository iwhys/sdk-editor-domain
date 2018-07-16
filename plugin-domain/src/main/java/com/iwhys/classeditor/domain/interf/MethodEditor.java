package com.iwhys.classeditor.domain.interf;

/**
 * Created on 16/07/2018 12:41
 * Description: 被编辑的方法信息实体
 *
 * @author 王洪胜
 */
public interface MethodEditor {

    Object getThis();

    Object[] gerArgs();

    Object proceed(Object[] args);

}
