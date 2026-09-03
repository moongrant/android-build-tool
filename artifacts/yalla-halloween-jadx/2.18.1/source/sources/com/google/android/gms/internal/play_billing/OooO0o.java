package com.google.android.gms.internal.play_billing;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends zzu {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient int f16051Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final transient int f16052Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzu f16053OoooO00;

    public OooO0o(zzu zzuVar, int i, int i2) {
        this.f16053OoooO00 = zzuVar;
        this.f16052Oooo0oo = i;
        this.f16051Oooo = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO0O0() {
        return this.f16053OoooO00.OooO0OO() + this.f16052Oooo0oo + this.f16051Oooo;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int OooO0OO() {
        return this.f16053OoooO00.OooO0OO() + this.f16052Oooo0oo;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    @CheckForNull
    public final Object[] OooO0o0() {
        return this.f16053OoooO00.OooO0o0();
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzm.zza(i, this.f16051Oooo, "index");
        return this.f16053OoooO00.get(i + this.f16052Oooo0oo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16051Oooo;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzu subList(int i, int i2) {
        zzm.zzc(i, i2, this.f16051Oooo);
        zzu zzuVar = this.f16053OoooO00;
        int i3 = this.f16052Oooo0oo;
        return zzuVar.subList(i + i3, i2 + i3);
    }
}
