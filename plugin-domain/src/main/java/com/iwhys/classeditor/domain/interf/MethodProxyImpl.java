package com.iwhys.classeditor.domain.interf;

/**
 * Created on 16/07/2018 17:46
 * Description:
 *
 * @author 王洪胜
 */
public class MethodProxyImpl implements MethodProxy {

    private final Object thisObject;
    private final Object[] args;
    private final Class<?> returnType;

    public MethodProxyImpl(Object thisObject, Object[] args, Class<?> returnType){
        this.thisObject = thisObject;
        if (args == null) {
            args = new Object[0];
        }
        this.args = args;
        this.returnType = returnType;
    }

    @Override
    public Object getThis() {
        return thisObject;
    }

    @Override
    public Object[] gerArgs() {
        return args;
    }

    @Override
    public Class<?> getReturnType() {
        return returnType;
    }

    @Override
    public Object invoke(Object[] args) {
        return null;
    }
}
