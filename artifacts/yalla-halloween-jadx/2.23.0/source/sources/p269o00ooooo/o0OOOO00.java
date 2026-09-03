package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzfu;
import p188o00o0O.OooOO0;
import p188o00o0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOOO00 extends OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzfu f41234OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(zzfu zzfuVar) {
        super(20);
        this.f41234OooO = zzfuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p188o00o0O.OooOo
    public final Object OooO00o(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        zzfu zzfuVar = this.f41234OooO;
        zzfuVar.OooO00o();
        Preconditions.checkNotEmpty(str);
        if (!zzfuVar.zzo(str)) {
            return null;
        }
        OooOO0 oooOO1 = zzfuVar.f15972OooO0oo;
        if (!oooOO1.containsKey(str) || oooOO1.getOrDefault(str, null) == 0) {
            zzfuVar.OooO0o0(str);
        } else {
            zzfuVar.OooO0o(str, (zzff) oooOO1.getOrDefault(str, null));
        }
        return (zzc) zzfuVar.f15973OooOO0.snapshot().get(str);
    }
}
