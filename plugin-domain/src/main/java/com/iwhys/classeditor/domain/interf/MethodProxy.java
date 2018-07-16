package com.iwhys.classeditor.domain.interf;

/**
 * Created on 16/07/2018 12:41
 * Description: 被编辑的方法信息代理
 *
 * @author 王洪胜
 */
public interface MethodProxy {

    Object getThis();

    Object[] gerArgs();

    Class<?> getReturnType();

    Object invoke(Object[] args);

}
