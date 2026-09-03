package o0OO0OoO;

import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.zzfp;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements zzo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f37535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzfp f37536OooO0O0;

    public o00000(zzfp zzfpVar, String str) {
        this.f37536OooO0O0 = zzfpVar;
        this.f37535OooO00o = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f37536OooO0O0.f16172OooO0Oo.getOrDefault(this.f37535OooO00o, null);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
