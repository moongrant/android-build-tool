package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0Oo0oo;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfd extends zzka implements zzlm {
    public zzfd() {
        super(zzfe.zza);
    }

    public final int zza() {
        return ((zzfe) this.f15978Oooo0oO).zzb();
    }

    public final zzfc zzb(int i) {
        return ((zzfe) this.f15978Oooo0oO).zzd(i);
    }

    public final zzfd zzc() {
        if (this.f15979Oooo0oo) {
            OooO0Oo();
            this.f15979Oooo0oo = false;
        }
        zzfe.OooOOO0((zzfe) this.f15978Oooo0oO);
        return this;
    }

    public final zzfd zzd(int i, zzfb zzfbVar) {
        if (this.f15979Oooo0oo) {
            OooO0Oo();
            this.f15979Oooo0oo = false;
        }
        zzfe.OooOO0o((zzfe) this.f15978Oooo0oO, i, (zzfc) zzfbVar.zzaE());
        return this;
    }

    public final String zze() {
        return ((zzfe) this.f15978Oooo0oO).zzi();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzfe) this.f15978Oooo0oO).zzj());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzfe) this.f15978Oooo0oO).zzk());
    }

    public /* synthetic */ zzfd(o0Oo0oo o0oo0oo2) {
        super(zzfe.zza);
    }
}
