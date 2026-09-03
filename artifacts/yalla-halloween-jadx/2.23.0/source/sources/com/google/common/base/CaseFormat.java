package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum CaseFormat {
    LOWER_HYPHEN { // from class: com.google.common.base.CaseFormat.OooO00o
        @Override // com.google.common.base.CaseFormat
        public final String OooO0O0(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            return caseFormat == CaseFormat.UPPER_UNDERSCORE ? com.google.common.base.OooO0OO.OooO0OO(str.replace('-', '_')) : super.OooO0O0(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public final String OooO0Oo(String str) {
            return com.google.common.base.OooO0OO.OooO0O0(str);
        }
    },
    LOWER_UNDERSCORE { // from class: com.google.common.base.CaseFormat.OooO0O0
        @Override // com.google.common.base.CaseFormat
        public final String OooO0O0(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                return str.replace('_', '-');
            }
            return caseFormat == CaseFormat.UPPER_UNDERSCORE ? com.google.common.base.OooO0OO.OooO0OO(str) : super.OooO0O0(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public final String OooO0Oo(String str) {
            return com.google.common.base.OooO0OO.OooO0O0(str);
        }
    },
    LOWER_CAMEL { // from class: com.google.common.base.CaseFormat.OooO0OO
        @Override // com.google.common.base.CaseFormat
        public final String OooO0OO(String str) {
            return com.google.common.base.OooO0OO.OooO0O0(str);
        }

        @Override // com.google.common.base.CaseFormat
        public final String OooO0Oo(String str) {
            return CaseFormat.OooO00o(str);
        }
    },
    UPPER_CAMEL { // from class: com.google.common.base.CaseFormat.OooO0o
        @Override // com.google.common.base.CaseFormat
        public final String OooO0Oo(String str) {
            return CaseFormat.OooO00o(str);
        }
    },
    UPPER_UNDERSCORE { // from class: com.google.common.base.CaseFormat.OooO
        @Override // com.google.common.base.CaseFormat
        public final String OooO0O0(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                return com.google.common.base.OooO0OO.OooO0O0(str.replace('_', '-'));
            }
            return caseFormat == CaseFormat.LOWER_UNDERSCORE ? com.google.common.base.OooO0OO.OooO0O0(str) : super.OooO0O0(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public final String OooO0Oo(String str) {
            return com.google.common.base.OooO0OO.OooO0OO(str);
        }
    };

    private final com.google.common.base.OooO0o wordBoundary;
    private final String wordSeparator;

    CaseFormat() {
        throw null;
    }

    CaseFormat(com.google.common.base.OooO0o.OooO00o oooO00o, String str) {
        this.wordBoundary = oooO00o;
        this.wordSeparator = str;
    }

    public static String OooO00o(String str) {
        if (str.isEmpty()) {
            return str;
        }
        boolean z = false;
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            z = true;
        }
        if (z) {
            cCharAt = (char) (cCharAt ^ ' ');
        }
        String strOooO0O0 = com.google.common.base.OooO0OO.OooO0O0(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(strOooO0O0).length() + 1);
        sb.append(cCharAt);
        sb.append(strOooO0O0);
        return sb.toString();
    }

    public String OooO0O0(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int length = 0;
        int iOooO0O0 = -1;
        while (true) {
            iOooO0O0 = this.wordBoundary.OooO0O0(iOooO0O0 + 1, str);
            if (iOooO0O0 == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder((caseFormat.wordSeparator.length() * 4) + str.length());
                sb.append(caseFormat.OooO0OO(str.substring(length, iOooO0O0)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(caseFormat.OooO0Oo(str.substring(length, iOooO0O0)));
            }
            sb.append(caseFormat.wordSeparator);
            length = this.wordSeparator.length() + iOooO0O0;
        }
        if (length == 0) {
            return caseFormat.OooO0OO(str);
        }
        Objects.requireNonNull(sb);
        sb.append(caseFormat.OooO0Oo(str.substring(length)));
        return sb.toString();
    }

    public String OooO0OO(String str) {
        return OooO0Oo(str);
    }

    public abstract String OooO0Oo(String str);
}
