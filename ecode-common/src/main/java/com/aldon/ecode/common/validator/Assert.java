package com.aldon.ecode.common.validator;

import com.aldon.ecode.common.exception.BizException;
import org.apache.commons.lang3.StringUtils;

/**
 * 数据校验
 *
 * @author aldon
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new BizException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new BizException(message);
        }
    }
}
