package p286o0O0O0oO;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class oo000o {

    @AutoValue.Builder
    public static abstract class OooO00o {
        public final OooO00o OooO00o(String str, int i) {
            OooO0Oo().put(str, String.valueOf(i));
            return this;
        }

        public final OooO00o OooO0O0(String str, String str2) {
            OooO0Oo().put(str, str2);
            return this;
        }

        public abstract oo000o OooO0OO();

        public abstract Map<String, String> OooO0Oo();

        public abstract OooO00o OooO0o(String str);

        public abstract OooO00o OooO0o0(long j);

        public abstract OooO00o OooO0oO(long j);
    }

    public static OooO00o OooO00o() {
        o000oOoO.OooO0O0 oooO0O0 = new o000oOoO.OooO0O0();
        oooO0O0.f35480OooO0o = new HashMap();
        return oooO0O0;
    }

    public abstract long OooO();

    public final String OooO0O0(String str) {
        String str2 = OooO0OO().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> OooO0OO();

    @Nullable
    public abstract Integer OooO0Oo();

    public abstract long OooO0o();

    public abstract o00Ooo OooO0o0();

    public final int OooO0oO(String str) {
        String str2 = OooO0OO().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String OooO0oo();

    public final OooO00o OooOO0() {
        o000oOoO.OooO0O0 oooO0O0 = new o000oOoO.OooO0O0();
        oooO0O0.OooO0o(OooO0oo());
        oooO0O0.f35477OooO0O0 = OooO0Oo();
        oooO0O0.OooO0oo(OooO0o0());
        oooO0O0.OooO0o0(OooO0o());
        oooO0O0.OooO0oO(OooO());
        oooO0O0.f35480OooO0o = new HashMap(OooO0OO());
        return oooO0O0;
    }
}
