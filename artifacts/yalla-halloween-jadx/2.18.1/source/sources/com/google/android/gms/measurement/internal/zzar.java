package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import p058o0000OoO.OooO;
import p130o00O0oo.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzar {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f16089OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f16090OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f16091OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f16092OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzau f16093OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f16094OooO0o0;

    public zzar(zzfy zzfyVar, String str, String str2, String str3, long j, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f16089OooO00o = str2;
        this.f16090OooO0O0 = str3;
        this.f16091OooO0OO = true == TextUtils.isEmpty(str) ? null : str;
        this.f16092OooO0Oo = j;
        this.f16094OooO0o0 = 0L;
        if (bundle == null || bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfyVar.zzay().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objOooO0o0 = zzfyVar.zzv().OooO0o0(next, bundle2.get(next));
                    if (objOooO0o0 == null) {
                        zzfyVar.zzay().zzk().zzb("Param value can't be null", zzfyVar.zzj().OooO0o0(next));
                        it.remove();
                    } else {
                        zzfyVar.zzv().OooOOOO(bundle2, next, objOooO0o0);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        }
        this.f16093OooO0o = zzauVar;
    }

    public final zzar OooO00o(zzfy zzfyVar, long j) {
        return new zzar(zzfyVar, this.f16091OooO0OO, this.f16089OooO00o, this.f16090OooO0O0, this.f16092OooO0Oo, j, this.f16093OooO0o);
    }

    public final String toString() {
        String str = this.f16089OooO00o;
        String str2 = this.f16090OooO0O0;
        return OooO.OooO00o(o00oOoo.OooO00o("Event{appId='", str, "', name='", str2, "', params="), this.f16093OooO0o.toString(), "}");
    }

    public zzar(zzfy zzfyVar, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.f16089OooO00o = str2;
        this.f16090OooO0O0 = str3;
        this.f16091OooO0OO = true == TextUtils.isEmpty(str) ? null : str;
        this.f16092OooO0Oo = j;
        this.f16094OooO0o0 = j2;
        if (j2 != 0 && j2 > j) {
            zzfyVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeo.OooO0o0(str2), zzeo.OooO0o0(str3));
        }
        this.f16093OooO0o = zzauVar;
    }
}
