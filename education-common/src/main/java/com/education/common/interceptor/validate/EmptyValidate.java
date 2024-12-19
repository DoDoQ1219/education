package com.education.common.interceptor.validate;


import com.education.common.utils.ObjectUtils;
import com.education.common.utils.Result;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 非空参数校验
 * @author zengjintao
 * @version 1.0
 * @create_at 2020/12/24 12:14
 */
public class EmptyValidate extends AbstractValidate {


    @Override
    public boolean supportParamType(Object paramValue) {
        return true;
    }

    @Override
    public void validateParam(HttpServletRequest request, HttpServletResponse response,
                              Integer errorCode, String errorMsg, Object paramValue) {
        if (ObjectUtils.isEmpty(paramValue)) {
            Result.renderJson(response, Result.fail(errorCode, errorMsg));
            return;
        }
    }
}
