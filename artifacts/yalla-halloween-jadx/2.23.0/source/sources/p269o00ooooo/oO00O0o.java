package p269o00ooooo;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzs;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzik f41277OooO0Oo;

    public oO00O0o(zzik zzikVar) {
        this.f41277OooO0Oo = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzs zzsVar = this.f41277OooO0Oo.f16045OooOO0o;
        zzgd zzgdVar = zzsVar.f16118OooO00o;
        zzgdVar.zzaB().zzg();
        if (zzsVar.OooO0O0()) {
            if (zzsVar.OooO0OO()) {
                zzgdVar.zzm().f41225OooOo0.zzb(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                zzgdVar.zzq().OooO0OO(bundle, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx");
            } else {
                String strZza = zzgdVar.zzm().f41225OooOo0.zza();
                if (TextUtils.isEmpty(strZza)) {
                    zzgdVar.zzaA().zzh().zza("Cache still valid but referrer not found");
                } else {
                    long jZza = zzgdVar.zzm().f41227OooOo0O.zza() / 3600000;
                    Uri uri = Uri.parse(strZza);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jZza - 1) * 3600000);
                    Object obj = pair.first;
                    zzgdVar.zzq().OooO0OO((Bundle) pair.second, obj == null ? "app" : (String) obj, "_cmp");
                }
                zzgdVar.zzm().f41225OooOo0.zzb(null);
            }
            zzgdVar.zzm().f41227OooOo0O.zzb(0L);
        }
    }
}
