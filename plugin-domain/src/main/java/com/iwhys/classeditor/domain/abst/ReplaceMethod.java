package com.iwhys.classeditor.domain.abst;

/**
 * Created on 15/07/2018 22:20
 * Description: 完全替换原方法
 *
 * @author 王洪胜
 */
public abstract class ReplaceMethod<T> extends MethodEditor {

    public ReplaceMethod(Object thisObject, Object[] originArgs) {
        super(thisObject, originArgs);
    }

    public abstract T getReplaceResult();
}
