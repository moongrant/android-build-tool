package p198o00o0OoO;

import androidx.camera.core.impl.OooOOOO;
import com.google.auto.value.AutoValue;
import com.qiniu.android.http.ResponseInfo;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class o00O0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000O f39077OooO00o;

    static {
        Long l = 10485760L;
        Integer num = 200;
        Integer numValueOf = Integer.valueOf(ResponseInfo.UnknownError);
        Long l2 = 604800000L;
        Integer num2 = 81920;
        String strOooO00o = l == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            strOooO00o = strOooO00o.concat(" loadBatchSize");
        }
        if (numValueOf == null) {
            strOooO00o = OooOOOO.OooO00o(strOooO00o, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            strOooO00o = OooOOOO.OooO00o(strOooO00o, " eventCleanUpAge");
        }
        if (num2 == null) {
            strOooO00o = OooOOOO.OooO00o(strOooO00o, " maxBlobByteSizePerRow");
        }
        if (!strOooO00o.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
        f39077OooO00o = new o000O(l.longValue(), num.intValue(), numValueOf.intValue(), l2.longValue(), num2.intValue());
    }

    public abstract int OooO00o();

    public abstract long OooO0O0();

    public abstract int OooO0OO();

    public abstract int OooO0Oo();

    public abstract long OooO0o0();
}
