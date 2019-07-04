package com.liqimoon.mybatisplusdemo.model.enums;
import com.liqimoon.mybatisplusdemo.model.base.interfaces.BaseValueEnum;

/**
 * @author liqimoon
 * @version 1.0
 * @date 2019/5/25 17:23
 */
public enum GenericQueryEnum implements BaseValueEnum<String> {

    /**
     * GenericQueryEnum es通用查询 查询条件枚举
     */
     IS_EQUAL("equal"),
     IS_NOT_EQUAL("not_equal"),
     IS_GREATERTHAN("greaterthan"),
     IS_GREATERTHANOREQUAL("greaterthanorequal"),
     IS_LESSTHAN("lessthan"),
     IS_LESSTHANOREQUAL("lessthanorequal"),
     IS_CONTAIN("contain"),
     IS_NOTCONTAIN("not_contain"),
     IS_BETWEEN("between"),
     IS_NOT_BETWEEN("not_between");

    private String value;

    GenericQueryEnum(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
