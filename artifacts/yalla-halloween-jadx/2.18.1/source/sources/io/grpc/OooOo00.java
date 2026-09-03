package io.grpc;

import com.google.common.io.BaseEncoding;
import java.util.BitSet;
import java.util.Locale;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/* JADX INFO: loaded from: classes3.dex */
@NotThreadSafe
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o<String> f26373OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final BaseEncoding f26374OooO0O0;

    @Immutable
    public static abstract class OooO<T> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final BitSet f26375OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f26376OooO00o;

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
            f26375OooO0O0 = bitSet;
        }

        public OooO(String str, boolean z) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o0OOOO0o.OooOOOO.OooOO0(lowerCase, "name");
            o0OOOO0o.OooOOOO.OooO0Oo(!lowerCase.isEmpty(), "token must have at least 1 tchar");
            for (int i = 0; i < lowerCase.length(); i++) {
                char cCharAt = lowerCase.charAt(i);
                if ((!z || cCharAt != ':' || i != 0) && !f26375OooO0O0.get(cCharAt)) {
                    throw new IllegalArgumentException(o0OOOO0o.o000oOoO.OooO00o("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
                }
            }
            this.f26376OooO00o = lowerCase;
            lowerCase.getBytes(o0OOOO0o.OooO0o.f38230OooO00o);
        }

        public static <T> OooO<T> OooO00o(String str, OooO0o<T> oooO0o) {
            return new OooO0OO(str, oooO0o);
        }

        public static <T> OooO<T> OooO0O0(String str, boolean z, OooOO0O<T> oooOO0O) {
            return new OooOO0(str, z, oooOO0O, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f26376OooO00o.equals(((OooO) obj).f26376OooO00o);
        }

        public final int hashCode() {
            return this.f26376OooO00o.hashCode();
        }

        public final String toString() {
            return p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("Key{name='"), this.f26376OooO00o, "'}");
        }
    }

    public class OooO00o {
    }

    public class OooO0O0 implements OooO0o<String> {
    }

    public static class OooO0OO<T> extends OooO<T> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0o<T> f26377OooO0OO;

        public OooO0OO(String str, OooO0o oooO0o) {
            super(str, false);
            o0OOOO0o.OooOOOO.OooO0oo(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f26377OooO0OO = oooO0o;
        }
    }

    public interface OooO0o<T> {
    }

    public static final class OooOO0<T> extends OooO<T> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooOO0O<T> f26378OooO0OO;

        public OooOO0(String str, boolean z, OooOO0O oooOO0O, OooO00o oooO00o) {
            super(str, z);
            o0OOOO0o.OooOOOO.OooO0oo(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f26378OooO0OO = oooOO0O;
        }
    }

    @Immutable
    public interface OooOO0O<T> {
    }

    static {
        BaseEncoding.OooO0OO oooO0OO = BaseEncoding.f18708OooO00o;
        Character ch = oooO0OO.f18718OooO0OO;
        BaseEncoding.OooO0OO oooO0OOOooO00o = oooO0OO;
        if (ch != null) {
            oooO0OOOooO00o = oooO0OO.OooO00o(oooO0OO.f18717OooO0O0);
        }
        f26374OooO0O0 = oooO0OOOooO00o;
    }

    public final String toString() {
        return "Metadata()";
    }
}
