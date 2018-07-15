package com.iwhys.classeditor.domain.abst;

/**
 * Created on 15/07/2018 22:28
 * Description: 编辑方法
 *
 * @author 王洪胜
 */
public abstract class EditMethod<T> extends MethodEditor {

    public EditMethod(Object thisObject, Object[] originArgs) {
        super(thisObject, originArgs);
    }

    /**
     * 方法执行之前编辑参数
     * @return 编辑之后的参数,供原方法使用
     */
    public Object[] editArgs() {
        return originArgs;
    }

    /**
     * 方法返回之前编辑结果
     * @param originResult 原方法调用生成的结果
     * @return 新的结果
     */
    public T editResult(T originResult) {
        return originResult;
    }
}
