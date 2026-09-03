package o0O0OOOo;

import com.google.auto.value.AutoValue;
import com.qiniu.android.http.ResponseInfo;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f35633OooO00o;

    static {
        Long l = 10485760L;
        Integer num = 200;
        Integer numValueOf = Integer.valueOf(ResponseInfo.UnknownError);
        Long l2 = 604800000L;
        Integer num2 = 81920;
        String strOooO0Oo = l == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " loadBatchSize");
        }
        if (numValueOf == null) {
            strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " eventCleanUpAge");
        }
        if (num2 == null) {
            strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo(strOooO0Oo, " maxBlobByteSizePerRow");
        }
        if (!strOooO0Oo.isEmpty()) {
            throw new IllegalStateException(p016OooOoO0.OooOo00.OooO0Oo("Missing required properties:", strOooO0Oo));
        }
        f35633OooO00o = new OooO00o(l.longValue(), num.intValue(), numValueOf.intValue(), l2.longValue(), num2.intValue());
    }

    public abstract int OooO00o();

    public abstract long OooO0O0();

    public abstract int OooO0OO();

    public abstract int OooO0Oo();

    public abstract long OooO0o0();
}
