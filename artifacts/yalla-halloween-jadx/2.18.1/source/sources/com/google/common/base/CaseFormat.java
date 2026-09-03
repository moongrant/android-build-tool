package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN;
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final o0OOOO0o.OooO0OO wordBoundary;
    private final String wordSeparator;

    public static enum OooO00o extends CaseFormat {
        public OooO00o(o0OOOO0o.OooO0OO oooO0OO) {
            super("LOWER_HYPHEN", 0, oooO0OO, "-", null);
        }
    }

    static {
        OooO00o oooO00o = new OooO00o(new o0OOOO0o.OooO0OO.C0378OooO0OO('-'));
        LOWER_HYPHEN = oooO00o;
        CaseFormat caseFormat = new CaseFormat(new o0OOOO0o.OooO0OO.C0378OooO0OO('_')) { // from class: com.google.common.base.CaseFormat.OooO0O0
        };
        LOWER_UNDERSCORE = caseFormat;
        CaseFormat caseFormat2 = new CaseFormat(new o0OOOO0o.OooO0OO.OooO0O0()) { // from class: com.google.common.base.CaseFormat.OooO0OO
        };
        LOWER_CAMEL = caseFormat2;
        CaseFormat caseFormat3 = new CaseFormat(new o0OOOO0o.OooO0OO.OooO0O0()) { // from class: com.google.common.base.CaseFormat.OooO0o
        };
        UPPER_CAMEL = caseFormat3;
        CaseFormat caseFormat4 = new CaseFormat(new o0OOOO0o.OooO0OO.C0378OooO0OO('_')) { // from class: com.google.common.base.CaseFormat.OooO
        };
        UPPER_UNDERSCORE = caseFormat4;
        $VALUES = new CaseFormat[]{oooO00o, caseFormat, caseFormat2, caseFormat3, caseFormat4};
    }

    public CaseFormat(String str, int i, o0OOOO0o.OooO0OO oooO0OO, String str2, OooO00o oooO00o) {
        super(str, i);
        this.wordBoundary = oooO0OO;
        this.wordSeparator = str2;
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }
}
