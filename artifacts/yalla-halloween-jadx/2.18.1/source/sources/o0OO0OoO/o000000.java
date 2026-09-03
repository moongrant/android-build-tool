package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.measurement.internal.zzfp;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 extends p021OooOooo.oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzfp f37537OooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(zzfp zzfpVar) {
        super(20);
        this.f37537OooO = zzfpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p021OooOooo.oo000o
    public final Object OooO00o(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        zzfp zzfpVar = this.f37537OooO;
        zzfpVar.OooO00o();
        Preconditions.checkNotEmpty(str);
        if (!zzfpVar.zzo(str)) {
            return null;
        }
        if (!zzfpVar.f16176OooO0oo.containsKey(str) || zzfpVar.f16176OooO0oo.getOrDefault(str, null) == 0) {
            zzfpVar.OooO0o0(str);
        } else {
            zzfpVar.OooO0o(str, (zzfe) zzfpVar.f16176OooO0oo.getOrDefault(str, null));
        }
        return (zzc) zzfpVar.f16177OooOO0.snapshot().get(str);
    }
}
