package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.material.OooO00o;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzap {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15885OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15886OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f15887OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f15888OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzas f15889OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f15890OooO0o0;

    public zzap(zzgd zzgdVar, String str, String str2, String str3, long j, Bundle bundle) {
        zzas zzasVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f15885OooO00o = str2;
        this.f15886OooO0O0 = str3;
        this.f15887OooO0OO = true == TextUtils.isEmpty(str) ? null : str;
        this.f15888OooO0Oo = j;
        this.f15890OooO0o0 = 0L;
        if (bundle == null || bundle.isEmpty()) {
            zzasVar = new zzas(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgdVar.zzaA().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objOooO0Oo = zzgdVar.zzv().OooO0Oo(bundle2.get(next), next);
                    if (objOooO0Oo == null) {
                        zzgdVar.zzaA().zzk().zzb("Param value can't be null", zzgdVar.zzj().OooO0o0(next));
                        it.remove();
                    } else {
                        zzgdVar.zzv().OooOOOO(bundle2, next, objOooO0Oo);
                    }
                }
            }
            zzasVar = new zzas(bundle2);
        }
        this.f15889OooO0o = zzasVar;
    }

    public final zzap OooO00o(zzgd zzgdVar, long j) {
        return new zzap(zzgdVar, this.f15887OooO0OO, this.f15885OooO00o, this.f15886OooO0O0, this.f15888OooO0Oo, j, this.f15889OooO0o);
    }

    public final String toString() {
        String string = this.f15889OooO0o.toString();
        StringBuilder sb = new StringBuilder("Event{appId='");
        sb.append(this.f15885OooO00o);
        sb.append("', name='");
        return OooO00o.OooO0O0(sb, this.f15886OooO0O0, "', params=", string, "}");
    }

    public zzap(zzgd zzgdVar, String str, String str2, String str3, long j, long j2, zzas zzasVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzasVar);
        this.f15885OooO00o = str2;
        this.f15886OooO0O0 = str3;
        this.f15887OooO0OO = true == TextUtils.isEmpty(str) ? null : str;
        this.f15888OooO0Oo = j;
        this.f15890OooO0o0 = j2;
        if (j2 != 0 && j2 > j) {
            zzgdVar.zzaA().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzet.OooO0Oo(str2), zzet.OooO0Oo(str3));
        }
        this.f15889OooO0o = zzasVar;
    }
}
