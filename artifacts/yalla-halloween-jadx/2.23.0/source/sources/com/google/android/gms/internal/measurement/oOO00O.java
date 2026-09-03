package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;
import p023Oooo00o.oO00Oo00;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O extends oo0o0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15616OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zzim f15617OooO0O0;

    public oOO00O(Context context, @Nullable zzim zzimVar) {
        this.f15616OooO00o = context;
        this.f15617OooO0O0 = zzimVar;
    }

    @Override // com.google.android.gms.internal.measurement.oo0o0O0
    public final Context OooO00o() {
        return this.f15616OooO00o;
    }

    @Override // com.google.android.gms.internal.measurement.oo0o0O0
    @Nullable
    public final zzim OooO0O0() {
        return this.f15617OooO0O0;
    }

    public final boolean equals(Object obj) {
        zzim zzimVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof oo0o0O0) {
            oo0o0O0 oo0o0o0 = (oo0o0O0) obj;
            if (this.f15616OooO00o.equals(oo0o0o0.OooO00o()) && ((zzimVar = this.f15617OooO0O0) != null ? zzimVar.equals(oo0o0o0.OooO0O0()) : oo0o0o0.OooO0O0() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15616OooO00o.hashCode() ^ 1000003;
        zzim zzimVar = this.f15617OooO0O0;
        return (iHashCode * 1000003) ^ (zzimVar == null ? 0 : zzimVar.hashCode());
    }

    public final String toString() {
        return oO00Oo00.OooO00o("FlagsContext{context=", this.f15616OooO00o.toString(), ", hermeticFileOverrides=", String.valueOf(this.f15617OooO0O0), "}");
    }
}
