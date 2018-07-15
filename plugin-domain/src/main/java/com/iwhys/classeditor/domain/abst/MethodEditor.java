package com.iwhys.classeditor.domain.abst;

/**
 * Created on 13/07/2018 08:16
 * Description: 方法编辑器
 *
 * @author 王洪胜
 */
public abstract class MethodEditor {

    protected final Object thisObject;
    protected final Object[] originArgs;

    MethodEditor(Object thisObject, Object[] originArgs){
        this.thisObject = thisObject;
        this.originArgs = originArgs;
    }

}
