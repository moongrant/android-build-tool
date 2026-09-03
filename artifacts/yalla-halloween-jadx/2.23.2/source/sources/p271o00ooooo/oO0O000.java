package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.zzfu;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O000 implements zzo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f40601OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzfu f40602OooO0O0;

    public oO0O000(zzfu zzfuVar, String str) {
        this.f40602OooO0O0 = zzfuVar;
        this.f40601OooO00o = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map = (Map) this.f40602OooO0O0.f15492OooO0Oo.getOrDefault(this.f40601OooO00o, null);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
