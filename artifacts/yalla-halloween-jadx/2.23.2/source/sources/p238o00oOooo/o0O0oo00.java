package p238o00oOooo;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class o0O0oo00 {

    @AutoValue.Builder
    public static abstract class OooO00o {
        public final void OooO00o(String str, String str2) {
            Map<String, String> map = ((o0O0OOOo.OooO00o) this).f40003OooO0o;
            if (map == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put(str, str2);
        }
    }

    public final o0O0OOOo.OooO00o OooO() {
        o0O0OOOo.OooO00o oooO00o = new o0O0OOOo.OooO00o();
        oooO00o.OooO0Oo(OooO0oO());
        oooO00o.f40000OooO0O0 = OooO0OO();
        oooO00o.OooO0OO(OooO0Oo());
        oooO00o.f40002OooO0Oo = Long.valueOf(OooO0o0());
        oooO00o.f40004OooO0o0 = Long.valueOf(OooO0oo());
        oooO00o.f40003OooO0o = new HashMap(OooO0O0());
        return oooO00o;
    }

    public final String OooO00o(String str) {
        String str2 = OooO0O0().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> OooO0O0();

    @Nullable
    public abstract Integer OooO0OO();

    public abstract o0oOo0O0 OooO0Oo();

    public final int OooO0o(String str) {
        String str2 = OooO0O0().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract long OooO0o0();

    public abstract String OooO0oO();

    public abstract long OooO0oo();
}
