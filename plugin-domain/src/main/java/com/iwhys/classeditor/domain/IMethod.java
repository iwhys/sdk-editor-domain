package com.iwhys.classeditor.domain;

/**
 * Created on 24/07/2018 13:09
 * Description: 方法的代理
 *
 * @author 王洪胜
 */
public interface IMethod {

    /**
     * 调用方法
     * @param thisObject 调用方的实例对象
     * @param args 方法参数
     * @return 方法返回值
     */
    Object invoke(Object thisObject, Object[] args);

}
