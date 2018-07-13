package com.iwhys.classeditor.domain.interf;

/**
 * Created on 13/07/2018 08:16
 * Description: 方法编辑器
 *
 * @author 王洪胜
 */
public interface MethodEditor {

    Object[] editArgs(Object host, Object[] originArgs);

    <T> T editResult(Object host, T originResult);

    void beforeMethod(Object host, Object[] originArgs);

    void afterMethod(Object host, Object originArgs);

}
