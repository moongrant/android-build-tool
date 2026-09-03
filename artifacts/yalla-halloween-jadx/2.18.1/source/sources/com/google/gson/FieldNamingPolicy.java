package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;
import p028Oooo0o0.o00O0O0O;
import p386o0OOoo0O.o000O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class FieldNamingPolicy implements o000O0 {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    public static final FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES;

    public final enum OooO00o extends FieldNamingPolicy {
        public OooO00o() {
            super("IDENTITY", 0, null);
        }

        @Override // p386o0OOoo0O.o000O0
        public final String OooO00o(Field field) {
            return field.getName();
        }
    }

    static {
        OooO00o oooO00o = new OooO00o();
        IDENTITY = oooO00o;
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.OooO0O0
            @Override // p386o0OOoo0O.o000O0
            public final String OooO00o(Field field) {
                return FieldNamingPolicy.OooO0Oo(field.getName());
            }
        };
        UPPER_CAMEL_CASE = fieldNamingPolicy;
        FieldNamingPolicy fieldNamingPolicy2 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.OooO0OO
            @Override // p386o0OOoo0O.o000O0
            public final String OooO00o(Field field) {
                return FieldNamingPolicy.OooO0Oo(FieldNamingPolicy.OooO0O0(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = fieldNamingPolicy2;
        FieldNamingPolicy fieldNamingPolicy3 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.OooO0o
            @Override // p386o0OOoo0O.o000O0
            public final String OooO00o(Field field) {
                return FieldNamingPolicy.OooO0O0(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = fieldNamingPolicy3;
        FieldNamingPolicy fieldNamingPolicy4 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.OooO
            @Override // p386o0OOoo0O.o000O0
            public final String OooO00o(Field field) {
                return FieldNamingPolicy.OooO0O0(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = fieldNamingPolicy4;
        FieldNamingPolicy fieldNamingPolicy5 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.OooOO0
            @Override // p386o0OOoo0O.o000O0
            public final String OooO00o(Field field) {
                return FieldNamingPolicy.OooO0O0(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = fieldNamingPolicy5;
        FieldNamingPolicy fieldNamingPolicy6 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.OooOO0O
            @Override // p386o0OOoo0O.o000O0
            public final String OooO00o(Field field) {
                return FieldNamingPolicy.OooO0O0(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = fieldNamingPolicy6;
        $VALUES = new FieldNamingPolicy[]{oooO00o, fieldNamingPolicy, fieldNamingPolicy2, fieldNamingPolicy3, fieldNamingPolicy4, fieldNamingPolicy5, fieldNamingPolicy6};
    }

    public FieldNamingPolicy(String str, int i, OooO00o oooO00o) {
        super(str, i);
    }

    public static String OooO0O0(String str, char c) {
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

    public static String OooO0Oo(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    StringBuilder sbOooO00o = o00O0O0O.OooO00o(upperCase);
                    sbOooO00o.append(str.substring(1));
                    return sbOooO00o.toString();
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) $VALUES.clone();
    }
}
