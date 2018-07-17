package com.iwhys.classeditor.domain.interf;

/**
 * Created on 16/07/2018 12:41
 * Description: 被编辑的方法信息代理
 *
 * @author 王洪胜
 */
public interface MethodProxy {

    /**
     * 方法的宿主对象
     * @return 实例方法返回实例对象,静态方法返回null
     */
    Object getThis();

    /**
     * 方法的参数
     * @return 方法参数集合
     */
    Object[] getArgs();

    /**
     * 调用方法
     * @param args 方法参数
     * @return 方法返回值
     */
    Object invoke(Object[] args);

}
