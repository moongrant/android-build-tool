package p256o00ooOO0;

import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabw;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oOO0 extends zabw {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<zabe> f40349OooO00o;

    public oo0oOO0(zabe zabeVar) {
        this.f40349OooO00o = new WeakReference<>(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabeVar = this.f40349OooO00o.get();
        if (zabeVar == null) {
            return;
        }
        zabeVar.f14366OooO0O0.lock();
        try {
            if (zabeVar.f14365OooO) {
                zabeVar.OooO0Oo();
            }
        } finally {
            zabeVar.f14366OooO0O0.unlock();
        }
    }
}
