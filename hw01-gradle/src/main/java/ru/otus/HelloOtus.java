package ru.otus;

import com.google.common.base.CaseFormat;

public class HelloOtus {

    public static void main(String[] args) {
        String snakeCase = "example_text_for_guava_case_format";
        String camelCase = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, snakeCase);
        System.out.println(camelCase);
    }
}
