package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0o000 implements o0OO000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzmi f15549OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO00 f15550OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f15551OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O000O f15552OooO0Oo;

    public o0O0o000(o0OOO00 o0ooo00, o0O000O o0o000o, zzmi zzmiVar) {
        this.f15550OooO0O0 = o0ooo00;
        this.f15551OooO0OO = o0o000o.OooO0OO(zzmiVar);
        this.f15552OooO0Oo = o0o000o;
        this.f15549OooO00o = zzmiVar;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final void OooO00o(Object obj) {
        this.f15550OooO0O0.OooO0oO(obj);
        this.f15552OooO0Oo.OooO0O0(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final void OooO0O0(Object obj, o0O00000 o0o00000) throws IOException {
        this.f15552OooO0Oo.OooO00o(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final int OooO0OO(Object obj) {
        int iHashCode = this.f15550OooO0O0.OooO0Oo(obj).hashCode();
        if (!this.f15551OooO0OO) {
            return iHashCode;
        }
        this.f15552OooO0Oo.OooO00o(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final void OooO0Oo(Object obj, byte[] bArr, int i, int i2, o00OOOO0 o00oooo1) throws IOException {
        zzlb zzlbVar = (zzlb) obj;
        if (zzlbVar.zzc == zznl.zzc()) {
            zzlbVar.zzc = zznl.OooO00o();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final void OooO0o(Object obj, Object obj2) {
        Class cls = oo0oO0.f15639OooO00o;
        o0OOO00 o0ooo00 = this.f15550OooO0O0;
        o0ooo00.OooO0oo(obj, o0ooo00.OooO0o0(o0ooo00.OooO0Oo(obj), o0ooo00.OooO0Oo(obj2)));
        if (this.f15551OooO0OO) {
            this.f15552OooO0Oo.OooO00o(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final int OooO0o0(Object obj) {
        o0OOO00 o0ooo00 = this.f15550OooO0O0;
        int iOooO0O0 = o0ooo00.OooO0O0(o0ooo00.OooO0Oo(obj));
        if (!this.f15551OooO0OO) {
            return iOooO0O0;
        }
        this.f15552OooO0Oo.OooO00o(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final boolean OooO0oO(Object obj, Object obj2) {
        o0OOO00 o0ooo00 = this.f15550OooO0O0;
        if (!o0ooo00.OooO0Oo(obj).equals(o0ooo00.OooO0Oo(obj2))) {
            return false;
        }
        if (!this.f15551OooO0OO) {
            return true;
        }
        o0O000O o0o000o = this.f15552OooO0Oo;
        o0o000o.OooO00o(obj);
        o0o000o.OooO00o(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final boolean OooO0oo(Object obj) {
        this.f15552OooO0Oo.OooO00o(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.o0OO000o
    public final Object zze() {
        zzmi zzmiVar = this.f15549OooO00o;
        return zzmiVar instanceof zzlb ? (zzlb) ((zzlb) zzmiVar).OooOO0o(4) : zzmiVar.zzbJ().zzaF();
    }
}
