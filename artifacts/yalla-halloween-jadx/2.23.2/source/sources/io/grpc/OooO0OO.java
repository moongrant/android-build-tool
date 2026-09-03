package io.grpc;

import com.google.common.base.OooOO0;
import com.google.common.base.o0O0O00;
import com.google.common.base.o0OoOo0;
import com.google.common.io.BaseEncoding;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes5.dex */
@NotThreadSafe
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f32467OooO00o = Logger.getLogger(OooO0OO.class.getName());

    @Immutable
    public static abstract class OooO00o<T> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final BitSet f32468OooO0OO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f32469OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Object f32470OooO0O0;

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
            f32468OooO0OO = bitSet;
        }

        public OooO00o(String str, Object obj) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o0OoOo0.OooO(lowerCase, "name");
            o0OoOo0.OooO0o0(!lowerCase.isEmpty(), "token must have at least 1 tchar");
            if (lowerCase.equals("connection")) {
                OooO0OO.f32467OooO00o.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i = 0; i < lowerCase.length(); i++) {
                char cCharAt = lowerCase.charAt(i);
                if (!f32468OooO0OO.get(cCharAt)) {
                    throw new IllegalArgumentException(o0O0O00.OooO00o("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                }
            }
            this.f32469OooO00o = lowerCase;
            lowerCase.getBytes(OooOO0.f18590OooO00o);
            this.f32470OooO0O0 = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f32469OooO00o.equals(((OooO00o) obj).f32469OooO00o);
        }

        public final int hashCode() {
            return this.f32469OooO00o.hashCode();
        }

        public final String toString() {
            return o0oOO.OooO0O0(new StringBuilder("Key{name='"), this.f32469OooO00o, "'}");
        }
    }

    public static final class OooO0O0<T> extends OooO00o<T> {
        public OooO0O0(String str, InterfaceC0379OooO0OO interfaceC0379OooO0OO) {
            super(str, interfaceC0379OooO0OO);
            o0OoOo0.OooO0oO(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        }
    }

    /* JADX INFO: renamed from: io.grpc.OooO0OO$OooO0OO, reason: collision with other inner class name */
    @Immutable
    public interface InterfaceC0379OooO0OO<T> {
    }

    static {
        BaseEncoding.OooO0OO oooO0OO = BaseEncoding.f19245OooO00o;
        if (oooO0OO.f19257OooO0Oo == null) {
            return;
        }
        oooO0OO.OooO0o0(oooO0OO.f19256OooO0OO);
    }

    public final String toString() {
        return "Metadata()";
    }
}
