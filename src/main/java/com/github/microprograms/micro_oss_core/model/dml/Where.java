package com.github.microprograms.micro_oss_core.model.dml;

import java.util.Arrays;

import com.github.microprograms.micro_oss_core.model.dml.ComplexCondition.TypeEnum;

public class Where {

    public static ComplexCondition and(Condition... conditions) {
        return new ComplexCondition(TypeEnum.and, Arrays.asList(conditions));
    }

    public static ComplexCondition or(Condition... conditions) {
        return new ComplexCondition(TypeEnum.or, Arrays.asList(conditions));
    }
}
