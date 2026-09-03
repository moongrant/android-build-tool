package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzmo;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0O implements o0O0OOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzll f37387OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0ooO f37388OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f37389OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O00o0 f37390OooO0Oo;

    public o0O0O0O(oo0ooO oo0ooo, o0O00o0 o0o00o1, zzll zzllVar) {
        this.f37388OooO0O0 = oo0ooo;
        this.f37389OooO0OO = o0o00o1.OooO0OO(zzllVar);
        this.f37390OooO0Oo = o0o00o1;
        this.f37387OooO00o = zzllVar;
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final void OooO00o(Object obj) {
        this.f37388OooO0O0.OooO0oO(obj);
        this.f37390OooO0Oo.OooO0O0(obj);
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final void OooO0O0(Object obj, byte[] bArr, int i, int i2, o00OO0O0 o00oo0o1) throws IOException {
        zzke zzkeVar = (zzke) obj;
        if (zzkeVar.zzc == zzmo.zzc()) {
            zzkeVar.zzc = zzmo.OooO00o();
        }
        throw null;
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final void OooO0OO(Object obj, o0OOOO00 o0oooo01) throws IOException {
        this.f37390OooO0Oo.OooO00o(obj);
        throw null;
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final boolean OooO0Oo(Object obj) {
        this.f37390OooO0Oo.OooO00o(obj);
        throw null;
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final int OooO0o(Object obj) {
        oo0ooO oo0ooo = this.f37388OooO0O0;
        int iOooO0O0 = oo0ooo.OooO0O0(oo0ooo.OooO0OO(obj));
        if (!this.f37389OooO0OO) {
            return iOooO0O0;
        }
        this.f37390OooO0Oo.OooO00o(obj);
        throw null;
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final int OooO0o0(Object obj) {
        int iHashCode = this.f37388OooO0O0.OooO0OO(obj).hashCode();
        if (!this.f37389OooO0OO) {
            return iHashCode;
        }
        this.f37390OooO0Oo.OooO00o(obj);
        throw null;
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final void OooO0oO(Object obj, Object obj2) {
        oo0ooO oo0ooo = this.f37388OooO0O0;
        Class cls = oo0OOoo.f37460OooO00o;
        oo0ooo.OooO0oo(obj, oo0ooo.OooO0Oo(oo0ooo.OooO0OO(obj), oo0ooo.OooO0OO(obj2)));
        if (this.f37389OooO0OO) {
            this.f37390OooO0Oo.OooO00o(obj2);
            throw null;
        }
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final boolean OooO0oo(Object obj, Object obj2) {
        if (!this.f37388OooO0O0.OooO0OO(obj).equals(this.f37388OooO0O0.OooO0OO(obj2))) {
            return false;
        }
        if (!this.f37389OooO0OO) {
            return true;
        }
        this.f37390OooO0Oo.OooO00o(obj);
        this.f37390OooO0Oo.OooO00o(obj2);
        throw null;
    }

    @Override // p334o0OO00o.o0O0OOOo
    public final Object zze() {
        return this.f37387OooO00o.zzbF().zzaG();
    }
}
