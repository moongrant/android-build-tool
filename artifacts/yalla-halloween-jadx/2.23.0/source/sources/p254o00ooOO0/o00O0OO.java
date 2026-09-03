package p254o00ooOO0;

import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabw;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO extends zabw {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<zabe> f40958OooO00o;

    public o00O0OO(zabe zabeVar) {
        this.f40958OooO00o = new WeakReference<>(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabeVar = this.f40958OooO00o.get();
        if (zabeVar == null) {
            return;
        }
        zabeVar.f14842OooO0O0.lock();
        try {
            if (zabeVar.f14841OooO) {
                zabeVar.OooO0Oo();
            }
        } finally {
            zabeVar.f14842OooO0O0.unlock();
        }
    }
}
