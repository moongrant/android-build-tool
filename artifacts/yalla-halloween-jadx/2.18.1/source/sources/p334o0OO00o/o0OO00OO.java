package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzmo;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00OO extends oo0ooO {
    @Override // p334o0OO00o.oo0ooO
    public final /* synthetic */ void OooO(Object obj, o0OOOO00 o0oooo01) throws IOException {
        ((zzmo) obj).zzi(o0oooo01);
    }

    @Override // p334o0OO00o.oo0ooO
    public final /* synthetic */ int OooO00o(Object obj) {
        return ((zzmo) obj).zza();
    }

    @Override // p334o0OO00o.oo0ooO
    public final /* synthetic */ int OooO0O0(Object obj) {
        return ((zzmo) obj).zzb();
    }

    @Override // p334o0OO00o.oo0ooO
    public final /* synthetic */ Object OooO0OO(Object obj) {
        return ((zzke) obj).zzc;
    }

    @Override // p334o0OO00o.oo0ooO
    public final Object OooO0Oo(Object obj, Object obj2) {
        zzmo zzmoVar = (zzmo) obj2;
        if (zzmoVar.equals(zzmo.zzc())) {
            return obj;
        }
        zzmo zzmoVar2 = (zzmo) obj;
        int i = zzmoVar2.f15989OooO00o + zzmoVar.f15989OooO00o;
        int[] iArrCopyOf = Arrays.copyOf(zzmoVar2.f15990OooO0O0, i);
        System.arraycopy(zzmoVar.f15990OooO0O0, 0, iArrCopyOf, zzmoVar2.f15989OooO00o, zzmoVar.f15989OooO00o);
        Object[] objArrCopyOf = Arrays.copyOf(zzmoVar2.f15991OooO0OO, i);
        System.arraycopy(zzmoVar.f15991OooO0OO, 0, objArrCopyOf, zzmoVar2.f15989OooO00o, zzmoVar.f15989OooO00o);
        return new zzmo(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // p334o0OO00o.oo0ooO
    public final /* bridge */ /* synthetic */ void OooO0o(Object obj, int i, long j) {
        ((zzmo) obj).OooO0O0(i << 3, Long.valueOf(j));
    }

    @Override // p334o0OO00o.oo0ooO
    public final /* synthetic */ Object OooO0o0() {
        return zzmo.OooO00o();
    }

    @Override // p334o0OO00o.oo0ooO
    public final void OooO0oO(Object obj) {
        ((zzke) obj).zzc.zzf();
    }

    @Override // p334o0OO00o.oo0ooO
    public final /* synthetic */ void OooO0oo(Object obj, Object obj2) {
        ((zzke) obj).zzc = (zzmo) obj2;
    }
}
