package com.google.zxing.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum CharacterSetECI {
    Cp437(new String[0], 0),
    ISO8859_1(new String[]{"ISO-8859-1"}, 1),
    ISO8859_2(2, 4),
    ISO8859_3(3, 5),
    ISO8859_4(4, 6),
    ISO8859_5(5, 7),
    ISO8859_6(6, 8),
    ISO8859_7(7, 9),
    ISO8859_8(8, 10),
    ISO8859_9(9, 11),
    ISO8859_10(10, 12),
    ISO8859_11(11, 13),
    ISO8859_13(12, 15),
    ISO8859_14(13, 16),
    ISO8859_15(14, 17),
    ISO8859_16(15, 18),
    SJIS(16, 20),
    Cp1250(17, 21),
    Cp1251(18, 22),
    Cp1252(19, 23),
    Cp1256(20, 24),
    UnicodeBigUnmarked(21, 25),
    UTF8(22, 26),
    ASCII(new String[]{"US-ASCII"}, 23),
    Big5(new String[0], 24),
    GB18030(25, 29),
    EUC_KR(26, 30);

    private final String[] otherEncodingNames;
    private final int[] values;
    private static final Map<Integer, CharacterSetECI> VALUE_TO_ECI = new HashMap();
    private static final Map<String, CharacterSetECI> NAME_TO_ECI = new HashMap();

    static {
        for (CharacterSetECI characterSetECI : values()) {
            for (int i : characterSetECI.values) {
                VALUE_TO_ECI.put(Integer.valueOf(i), characterSetECI);
            }
            NAME_TO_ECI.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.otherEncodingNames) {
                NAME_TO_ECI.put(str, characterSetECI);
            }
        }
    }

    CharacterSetECI() {
        throw null;
    }

    CharacterSetECI(int i, int i2) {
        this.values = new int[]{i2};
        this.otherEncodingNames = strArr;
    }

    public static CharacterSetECI OooO00o(String str) {
        return NAME_TO_ECI.get(str);
    }

    public final int OooO0O0() {
        return this.values[0];
    }

    CharacterSetECI(String[] strArr, int i) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }
}
