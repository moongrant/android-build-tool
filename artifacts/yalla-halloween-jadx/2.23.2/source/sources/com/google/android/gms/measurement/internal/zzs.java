package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzgd f15642OooO00o;

    public zzs(zzgd zzgdVar) {
        this.f15642OooO00o = zzgdVar;
    }

    @WorkerThread
    public final void OooO00o(Bundle bundle, String str) {
        String string;
        zzgd zzgdVar = this.f15642OooO00o;
        zzgdVar.zzaB().zzg();
        if (zzgdVar.zzJ()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        zzgdVar.zzm().f40781OooOo0.zzb(string);
        zzgdVar.zzm().f40783OooOo0O.zzb(zzgdVar.zzax().currentTimeMillis());
    }

    public final boolean OooO0O0() {
        return this.f15642OooO00o.zzm().f40783OooOo0O.zza() > 0;
    }

    public final boolean OooO0OO() {
        if (!OooO0O0()) {
            return false;
        }
        zzgd zzgdVar = this.f15642OooO00o;
        return zzgdVar.zzax().currentTimeMillis() - zzgdVar.zzm().f40783OooOo0O.zza() > zzgdVar.zzf().zzi(null, zzeg.zzS);
    }
}
