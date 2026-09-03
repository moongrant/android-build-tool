package io.grpc;

import com.google.common.base.o000oOoO;
import com.google.common.base.oo0o0Oo;
import com.google.common.io.BaseEncoding;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes5.dex */
@NotThreadSafe
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f33002OooO00o = Logger.getLogger(OooO0OO.class.getName());

    @Immutable
    public static abstract class OooO00o<T> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final BitSet f33003OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f33004OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f33005OooO0O0;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            f33003OooO0OO = bitSet;
        }

        public OooO00o(String str, Object obj) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o000oOoO.OooO(lowerCase, "name");
            o000oOoO.OooO0o0(!lowerCase.isEmpty(), "token must have at least 1 tchar");
            if (lowerCase.equals("connection")) {
                OooO0OO.f33002OooO00o.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i = 0; i < lowerCase.length(); i++) {
                char cCharAt = lowerCase.charAt(i);
                if (!f33003OooO0OO.get(cCharAt)) {
                    throw new IllegalArgumentException(oo0o0Oo.OooO00o("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                }
            }
            this.f33004OooO00o = lowerCase;
            lowerCase.getBytes(com.google.common.base.OooO.f19057OooO00o);
            this.f33005OooO0O0 = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f33004OooO00o.equals(((OooO00o) obj).f33004OooO00o);
        }

        public final int hashCode() {
            return this.f33004OooO00o.hashCode();
        }

        public final String toString() {
            return o0O00o0.OooO0O0(new StringBuilder("Key{name='"), this.f33004OooO00o, "'}");
        }
    }

    public static final class OooO0O0<T> extends OooO00o<T> {
        public OooO0O0(String str, InterfaceC0380OooO0OO interfaceC0380OooO0OO) {
            super(str, interfaceC0380OooO0OO);
            o000oOoO.OooO0oO(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        }
    }

    /* JADX INFO: renamed from: io.grpc.OooO0OO$OooO0OO, reason: collision with other inner class name */
    @Immutable
    public interface InterfaceC0380OooO0OO<T> {
    }

    static {
        BaseEncoding.OooO0OO oooO0OO = BaseEncoding.f19721OooO00o;
        if (oooO0OO.f19733OooO0Oo == null) {
            return;
        }
        oooO0OO.OooO0o0(oooO0OO.f19732OooO0OO);
    }

    public final String toString() {
        return "Metadata()";
    }
}
