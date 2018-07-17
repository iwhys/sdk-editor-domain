package com.iwhys.classeditor.domain.interf;

/**
 * Created on 16/07/2018 17:46
 * Description: 内部使用的方法代理实现类
 *
 * @author 王洪胜
 */
public class InternalMethodProxyImpl<T, R> implements MethodProxy {

    private final T thisObject;
    private final Object[] args;

    public InternalMethodProxyImpl(T thisObject, Object[] args){
        this.thisObject = thisObject;
        if (args == null) {
            args = new Object[0];
        }
        this.args = args;
    }

    @Override
    public T getThis() {
        return thisObject;
    }

    @Override
    public Object[] getArgs() {
        return args;
    }

    @Override
    public R invoke(Object[] args) {
        return null;
    }
}
