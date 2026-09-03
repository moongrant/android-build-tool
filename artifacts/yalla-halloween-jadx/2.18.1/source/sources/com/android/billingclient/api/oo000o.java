package com.android.billingclient.api;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzs;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo000o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f11325Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f11326Oooo0oO;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f11325Oooo0o = i;
        this.f11326Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11325Oooo0o) {
            case 0:
                o0OOO0o o0ooo0o2 = (o0OOO0o) this.f11326Oooo0oO;
                o0ooo0o2.f11324OooO0OO.f11217OooO00o = 0;
                o0ooo0o2.f11324OooO0OO.f11221OooO0o = null;
                o0ooo0o2.OooO00o(o000OOo.f11307OooOOO0);
                break;
            default:
                zzs zzsVar = ((zzid) this.f11326Oooo0oO).f16248OooOOO;
                zzsVar.f16321OooO00o.zzaz().zzg();
                if (zzsVar.OooO0O0()) {
                    if (zzsVar.OooO0OO()) {
                        zzsVar.f16321OooO00o.zzm().f37781OooOo00.zzb(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        zzsVar.f16321OooO00o.zzq().OooO0OO(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx", bundle);
                    } else {
                        String strZza = zzsVar.f16321OooO00o.zzm().f37781OooOo00.zza();
                        if (TextUtils.isEmpty(strZza)) {
                            zzsVar.f16321OooO00o.zzay().zzh().zza("Cache still valid but referrer not found");
                        } else {
                            long jZza = ((zzsVar.f16321OooO00o.zzm().f37780OooOo0.zza() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strZza);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jZza);
                            Object obj = pair.first;
                            zzsVar.f16321OooO00o.zzq().OooO0OO(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                        }
                        zzsVar.f16321OooO00o.zzm().f37781OooOo00.zzb(null);
                    }
                    zzsVar.f16321OooO00o.zzm().f37780OooOo0.zzb(0L);
                    break;
                }
                break;
        }
    }
}
