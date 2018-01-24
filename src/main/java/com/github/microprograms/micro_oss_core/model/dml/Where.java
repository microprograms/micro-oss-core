package com.github.microprograms.micro_oss_core.model.dml;

import java.util.ArrayList;
import java.util.List;

import com.github.microprograms.micro_oss_core.model.dml.ComplexCondition.TypeEnum;

public class Where {

    public static ComplexCondition and(Condition... conditions) {
        return new ComplexCondition(TypeEnum.and, buildListIgnoreNull(conditions));
    }

    public static ComplexCondition or(Condition... conditions) {
        return new ComplexCondition(TypeEnum.or, buildListIgnoreNull(conditions));
    }

    @SuppressWarnings("unchecked")
    private static <T> List<T> buildListIgnoreNull(T... objs) {
        List<T> list = new ArrayList<>();
        if (objs != null) {
            for (T x : objs) {
                if (x != null) {
                    list.add(x);
                }
            }
        }
        return list;
    }
}
