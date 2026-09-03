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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f11341Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f11342OoooO00;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f11341Oooo = i;
        this.f11342OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11341Oooo) {
            case 0:
                o0OOO0o o0ooo0o2 = (o0OOO0o) this.f11342OoooO00;
                o0ooo0o2.f11340OooO0OO.f11233OooO00o = 0;
                o0ooo0o2.f11340OooO0OO.f11237OooO0o = null;
                o0ooo0o2.OooO00o(o000OOo.f11323OooOOO0);
                break;
            default:
                zzs zzsVar = ((zzid) this.f11342OoooO00).f16266OooOOO;
                zzsVar.f16339OooO00o.zzaz().zzg();
                if (zzsVar.OooO0O0()) {
                    if (zzsVar.OooO0OO()) {
                        zzsVar.f16339OooO00o.zzm().f37921OooOo00.zzb(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        zzsVar.f16339OooO00o.zzq().OooO0OO(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_cmpx", bundle);
                    } else {
                        String strZza = zzsVar.f16339OooO00o.zzm().f37921OooOo00.zza();
                        if (TextUtils.isEmpty(strZza)) {
                            zzsVar.f16339OooO00o.zzay().zzh().zza("Cache still valid but referrer not found");
                        } else {
                            long jZza = ((zzsVar.f16339OooO00o.zzm().f37920OooOo0.zza() / 3600000) - 1) * 3600000;
                            Uri uri = Uri.parse(strZza);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", jZza);
                            Object obj = pair.first;
                            zzsVar.f16339OooO00o.zzq().OooO0OO(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                        }
                        zzsVar.f16339OooO00o.zzm().f37921OooOo00.zzb(null);
                    }
                    zzsVar.f16339OooO00o.zzm().f37920OooOo0.zzb(0L);
                    break;
                }
                break;
        }
    }
}
