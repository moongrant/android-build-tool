package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum FieldNamingPolicy implements com.google.gson.OooO0O0 {
    IDENTITY { // from class: com.google.gson.FieldNamingPolicy.OooO00o
        @Override // com.google.gson.OooO0O0
        public final String OooO00o(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.OooO0O0
        @Override // com.google.gson.OooO0O0
        public final String OooO00o(Field field) {
            return FieldNamingPolicy.OooO0OO(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.OooO0OO
        @Override // com.google.gson.OooO0O0
        public final String OooO00o(Field field) {
            return FieldNamingPolicy.OooO0OO(FieldNamingPolicy.OooO0O0(' ', field.getName()));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.OooO0o
        @Override // com.google.gson.OooO0O0
        public final String OooO00o(Field field) {
            return FieldNamingPolicy.OooO0O0('_', field.getName()).toUpperCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.OooO
        @Override // com.google.gson.OooO0O0
        public final String OooO00o(Field field) {
            return FieldNamingPolicy.OooO0O0('_', field.getName()).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.OooOO0
        @Override // com.google.gson.OooO0O0
        public final String OooO00o(Field field) {
            return FieldNamingPolicy.OooO0O0('-', field.getName()).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.google.gson.FieldNamingPolicy.OooOO0O
        @Override // com.google.gson.OooO0O0
        public final String OooO00o(Field field) {
            return FieldNamingPolicy.OooO0O0('.', field.getName()).toLowerCase(Locale.ENGLISH);
        }
    };

    FieldNamingPolicy() {
        throw null;
    }

    public static String OooO0O0(char c, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String OooO0OO(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }
}
