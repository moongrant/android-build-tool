package com.google.android.gms.internal.measurement;

import android.content.Context;
import javax.annotation.Nullable;
import p023Oooo00o.oO00OOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO extends o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15000OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zzim f15001OooO0O0;

    public o00O00OO(Context context, @Nullable zzim zzimVar) {
        this.f15000OooO00o = context;
        this.f15001OooO0O0 = zzimVar;
    }

    @Override // com.google.android.gms.internal.measurement.o00O0OO
    public final Context OooO00o() {
        return this.f15000OooO00o;
    }

    @Override // com.google.android.gms.internal.measurement.o00O0OO
    @Nullable
    public final zzim OooO0O0() {
        return this.f15001OooO0O0;
    }

    public final boolean equals(Object obj) {
        zzim zzimVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0OO) {
            o00O0OO o00o0oo2 = (o00O0OO) obj;
            if (this.f15000OooO00o.equals(o00o0oo2.OooO00o()) && ((zzimVar = this.f15001OooO0O0) != null ? zzimVar.equals(o00o0oo2.OooO0O0()) : o00o0oo2.OooO0O0() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f15000OooO00o.hashCode() ^ 1000003;
        zzim zzimVar = this.f15001OooO0O0;
        return (iHashCode * 1000003) ^ (zzimVar == null ? 0 : zzimVar.hashCode());
    }

    public final String toString() {
        return oO00OOOo.OooO00o("FlagsContext{context=", this.f15000OooO00o.toString(), ", hermeticFileOverrides=", String.valueOf(this.f15001OooO0O0), "}");
    }
}
