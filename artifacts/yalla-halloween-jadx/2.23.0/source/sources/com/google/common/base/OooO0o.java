package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class OooO0o implements o0OoOo0<Character> {

    public static final class OooO extends AbstractC0226OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final OooO f19067OooO0o0 = new OooO();

        @Override // com.google.common.base.OooO0o
        public final int OooO0O0(int i, CharSequence charSequence) {
            o000oOoO.OooOO0(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.OooO0o
        public final boolean OooO0OO(char c) {
            return false;
        }
    }

    public static abstract class OooO00o extends OooO0o {
        @Override // com.google.common.base.o0OoOo0
        @Deprecated
        public final boolean apply(Character ch) {
            return OooO0OO(ch.charValue());
        }
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final char f19068OooO0Oo = 'A';

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final char f19069OooO0o0 = 'Z';

        @Override // com.google.common.base.OooO0o
        public final boolean OooO0OO(char c) {
            return this.f19068OooO0Oo <= c && c <= this.f19069OooO0o0;
        }

        public final String toString() {
            String strOooO00o = OooO0o.OooO00o(this.f19068OooO0Oo);
            String strOooO00o2 = OooO0o.OooO00o(this.f19069OooO0o0);
            StringBuilder sb = new StringBuilder(String.valueOf(strOooO00o2).length() + String.valueOf(strOooO00o).length() + 27);
            sb.append("CharMatcher.inRange('");
            sb.append(strOooO00o);
            sb.append("', '");
            sb.append(strOooO00o2);
            sb.append("')");
            return sb.toString();
        }
    }

    public static final class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final char f19070OooO0Oo;

        public OooO0OO(char c) {
            this.f19070OooO0Oo = c;
        }

        @Override // com.google.common.base.OooO0o
        public final boolean OooO0OO(char c) {
            return c == this.f19070OooO0Oo;
        }

        public final String toString() {
            String strOooO00o = OooO0o.OooO00o(this.f19070OooO0Oo);
            StringBuilder sb = new StringBuilder(String.valueOf(strOooO00o).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(strOooO00o);
            sb.append("')");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.OooO0o$OooO0o, reason: collision with other inner class name */
    public static abstract class AbstractC0226OooO0o extends OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f19071OooO0Oo = "CharMatcher.none()";

        public final String toString() {
            return this.f19071OooO0Oo;
        }
    }

    public static String OooO00o(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int OooO0O0(int i, CharSequence charSequence) {
        int length = charSequence.length();
        o000oOoO.OooOO0(i, length);
        while (i < length) {
            if (OooO0OO(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean OooO0OO(char c);
}
