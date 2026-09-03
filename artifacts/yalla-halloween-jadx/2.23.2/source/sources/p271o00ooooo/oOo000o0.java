package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzfu;
import p190o00o0O.OooO;
import p190o00o0O.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo000o0 extends OooOo00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzfu f40785OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000o0(zzfu zzfuVar) {
        super(20);
        this.f40785OooO = zzfuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p190o00o0O.OooOo00
    public final Object OooO00o(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        zzfu zzfuVar = this.f40785OooO;
        zzfuVar.OooO00o();
        Preconditions.checkNotEmpty(str);
        if (!zzfuVar.zzo(str)) {
            return null;
        }
        OooO oooO = zzfuVar.f15496OooO0oo;
        if (!oooO.containsKey(str) || oooO.getOrDefault(str, null) == 0) {
            zzfuVar.OooO0o0(str);
        } else {
            zzfuVar.OooO0o(str, (zzff) oooO.getOrDefault(str, null));
        }
        return (zzc) zzfuVar.f15497OooOO0.snapshot().get(str);
    }
}
