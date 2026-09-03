package p334o0OO00o;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzih;
import javax.annotation.Nullable;
import p060o0000o.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O extends o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37314OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zzih f37315OooO0O0;

    public o00O00O(Context context, @Nullable zzih zzihVar) {
        this.f37314OooO00o = context;
        this.f37315OooO0O0 = zzihVar;
    }

    @Override // p334o0OO00o.o00O0OO0
    public final Context OooO00o() {
        return this.f37314OooO00o;
    }

    @Override // p334o0OO00o.o00O0OO0
    @Nullable
    public final zzih OooO0O0() {
        return this.f37315OooO0O0;
    }

    public final boolean equals(Object obj) {
        zzih zzihVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o00O0OO0) {
            o00O0OO0 o00o0oo1 = (o00O0OO0) obj;
            if (this.f37314OooO00o.equals(o00o0oo1.OooO00o()) && ((zzihVar = this.f37315OooO0O0) != null ? zzihVar.equals(o00o0oo1.OooO0O0()) : o00o0oo1.OooO0O0() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f37314OooO00o.hashCode() ^ 1000003) * 1000003;
        zzih zzihVar = this.f37315OooO0O0;
        return iHashCode ^ (zzihVar == null ? 0 : zzihVar.hashCode());
    }

    public final String toString() {
        return oo000o.OooO00o("FlagsContext{context=", this.f37314OooO00o.toString(), ", hermeticFileOverrides=", String.valueOf(this.f37315OooO0O0), "}");
    }
}
