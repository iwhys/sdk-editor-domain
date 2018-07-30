package com.iwhys.classeditor.domain;

/**
 * Created on 18/07/2018 17:47
 * Description:编辑方法的接口定义
 *
 * @author 王洪胜
 */
public interface IEditMethod {

    /**
     * 对方法进行编辑的实现逻辑
     * @param thisObj 调用方法的实例对象
     * @param args 方法的参数
     * @param method 真实方法的代理对象
     * @return 方法执行的返回值
     */
    Object performEdit(Object thisObj, Object[] args, IMethod method) throws Throwable;

}
