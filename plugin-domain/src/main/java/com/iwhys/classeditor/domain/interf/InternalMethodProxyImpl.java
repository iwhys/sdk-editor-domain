package com.iwhys.classeditor.domain.interf;

/**
 * Created on 16/07/2018 17:46
 * Description: 内部使用的方法代理实现类
 *
 * @author 王洪胜
 */
public class InternalMethodProxyImpl implements MethodProxy {

    private final Object thisObject;
    private final Object[] args;

    public InternalMethodProxyImpl(Object thisObject, Object[] args){
        this.thisObject = thisObject;
        if (args == null) {
            args = new Object[0];
        }
        this.args = args;
    }

    @Override
    public Object getThis() {
        return thisObject;
    }

    @Override
    public Object[] getArgs() {
        return args;
    }

    @Override
    public Object invoke(Object[] args) {
        return null;
    }
}
