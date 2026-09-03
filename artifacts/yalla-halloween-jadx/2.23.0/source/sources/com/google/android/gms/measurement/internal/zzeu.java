package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.compiler.plugins.kotlin.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeu {

    @NonNull
    public final String zza;

    @NonNull
    public final String zzb;
    public final long zzc;

    @NonNull
    public final Bundle zzd;

    public zzeu(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzeu zzb(zzau zzauVar) {
        return new zzeu(zzauVar.zza, zzauVar.zzc, zzauVar.zzb.zzc(), zzauVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String string = this.zzd.toString();
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("origin=", str, ",name=", str2, ",params=");
        sbOooO0OO.append(string);
        return sbOooO0OO.toString();
    }

    public final zzau zza() {
        return new zzau(this.zza, new zzas(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
