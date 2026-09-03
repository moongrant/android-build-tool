package p331o0O0oooO;

import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabw;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O0Oo extends zabw {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<zabe> f37098OooO00o;

    public o0O0O0Oo(zabe zabeVar) {
        this.f37098OooO00o = new WeakReference<>(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabeVar = this.f37098OooO00o.get();
        if (zabeVar == null) {
            return;
        }
        zabe.OooO0OO(zabeVar);
    }
}
