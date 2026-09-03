package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class OooO implements o00O0O<Character> {

    /* JADX INFO: renamed from: com.google.common.base.OooO$OooO, reason: collision with other inner class name */
    public static final class C0222OooO extends OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final C0222OooO f18581OooO0o0 = new C0222OooO();

        @Override // com.google.common.base.OooO
        public final int OooO0O0(int i, CharSequence charSequence) {
            o0OoOo0.OooOO0(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.OooO
        public final boolean OooO0OO(char c) {
            return false;
        }
    }

    public static abstract class OooO00o extends OooO {
        @Override // com.google.common.base.o00O0O
        @Deprecated
        public final boolean apply(Character ch) {
            return OooO0OO(ch.charValue());
        }
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final char f18582OooO0Oo = 'A';

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final char f18583OooO0o0 = 'Z';

        @Override // com.google.common.base.OooO
        public final boolean OooO0OO(char c) {
            return this.f18582OooO0Oo <= c && c <= this.f18583OooO0o0;
        }

        public final String toString() {
            String strOooO00o = OooO.OooO00o(this.f18582OooO0Oo);
            String strOooO00o2 = OooO.OooO00o(this.f18583OooO0o0);
            StringBuilder sb = new StringBuilder(com.google.common.base.OooO0o.OooO00o(strOooO00o2, com.google.common.base.OooO0o.OooO00o(strOooO00o, 27)));
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
        public final char f18584OooO0Oo;

        public OooO0OO(char c) {
            this.f18584OooO0Oo = c;
        }

        @Override // com.google.common.base.OooO
        public final boolean OooO0OO(char c) {
            return c == this.f18584OooO0Oo;
        }

        public final String toString() {
            String strOooO00o = OooO.OooO00o(this.f18584OooO0Oo);
            StringBuilder sb = new StringBuilder(com.google.common.base.OooO0o.OooO00o(strOooO00o, 18));
            sb.append("CharMatcher.is('");
            sb.append(strOooO00o);
            sb.append("')");
            return sb.toString();
        }
    }

    public static abstract class OooO0o extends OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final String f18585OooO0Oo = "CharMatcher.none()";

        public final String toString() {
            return this.f18585OooO0Oo;
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
        o0OoOo0.OooOO0(i, length);
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
