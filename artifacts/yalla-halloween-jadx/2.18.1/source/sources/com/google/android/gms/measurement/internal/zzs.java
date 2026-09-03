package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzfy f16321OooO00o;

    public zzs(zzfy zzfyVar) {
        this.f16321OooO00o = zzfyVar;
    }

    @WorkerThread
    public final void OooO00o(String str, Bundle bundle) {
        String string;
        this.f16321OooO00o.zzaz().zzg();
        if (this.f16321OooO00o.zzJ()) {
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
        this.f16321OooO00o.zzm().f37781OooOo00.zzb(string);
        this.f16321OooO00o.zzm().f37780OooOo0.zzb(this.f16321OooO00o.zzav().currentTimeMillis());
    }

    public final boolean OooO0O0() {
        return this.f16321OooO00o.zzm().f37780OooOo0.zza() > 0;
    }

    public final boolean OooO0OO() {
        return OooO0O0() && this.f16321OooO00o.zzav().currentTimeMillis() - this.f16321OooO00o.zzm().f37780OooOo0.zza() > this.f16321OooO00o.zzf().zzi(null, zzeb.zzQ);
    }
}
