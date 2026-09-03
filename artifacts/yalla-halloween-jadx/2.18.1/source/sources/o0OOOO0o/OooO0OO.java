package o0OOOO0o;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class OooO0OO implements OooOo00<Character> {

    public static final class OooO extends OooO0o {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public static final OooO f38223Oooo0oO = new OooO();

        public OooO() {
            super("CharMatcher.none()");
        }

        @Override // o0OOOO0o.OooO0OO
        public final boolean OooO0O0(char c) {
            return false;
        }
    }

    public static abstract class OooO00o extends OooO0OO {
        @Override // o0OOOO0o.OooOo00
        @Deprecated
        public final boolean apply(Character ch) {
            return OooO0O0(ch.charValue());
        }
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final char f38224Oooo0o = 'A';

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final char f38225Oooo0oO = 'Z';

        @Override // o0OOOO0o.OooO0OO
        public final boolean OooO0O0(char c) {
            return this.f38224Oooo0o <= c && c <= this.f38225Oooo0oO;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CharMatcher.inRange('");
            sbOooO0o0.append(OooO0OO.OooO00o(this.f38224Oooo0o));
            sbOooO0o0.append("', '");
            sbOooO0o0.append(OooO0OO.OooO00o(this.f38225Oooo0oO));
            sbOooO0o0.append("')");
            return sbOooO0o0.toString();
        }
    }

    /* JADX INFO: renamed from: o0OOOO0o.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0378OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final char f38226Oooo0o;

        public C0378OooO0OO(char c) {
            this.f38226Oooo0o = c;
        }

        @Override // o0OOOO0o.OooO0OO
        public final boolean OooO0O0(char c) {
            return c == this.f38226Oooo0o;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CharMatcher.is('");
            sbOooO0o0.append(OooO0OO.OooO00o(this.f38226Oooo0o));
            sbOooO0o0.append("')");
            return sbOooO0o0.toString();
        }
    }

    public static abstract class OooO0o extends OooO00o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final String f38227Oooo0o;

        public OooO0o(String str) {
            this.f38227Oooo0o = str;
        }

        public final String toString() {
            return this.f38227Oooo0o;
        }
    }

    @VisibleForTesting
    public static final class OooOO0 extends OooO0o {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public static final int f38228Oooo0oO = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public static final OooOO0 f38229Oooo0oo = new OooOO0();

        public OooOO0() {
            super("CharMatcher.whitespace()");
        }

        @Override // o0OOOO0o.OooO0OO
        public final boolean OooO0O0(char c) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f38228Oooo0oO) == c;
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

    public abstract boolean OooO0O0(char c);
}
