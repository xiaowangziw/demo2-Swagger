package com.example.demo.untils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于匹配Excel文件和类字段的对应关系。
 * @author shiyan
 * @Date 2019/9/11
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelElement {

    String value();//对应的excel列名

    Class<?> type() default String.class;//单元格的java类型

    String pattern() default "yyyy/MM/dd HH:mm:ss";//时间格式

    boolean notNull() default false;//是否允许为空，默认false
}
