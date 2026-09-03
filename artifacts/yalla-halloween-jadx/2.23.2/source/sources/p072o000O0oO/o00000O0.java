package p072o000O0oO;

import androidx.media3.exoplayer.offline.OooO00o;
import androidx.media3.exoplayer.offline.OooO0O0;
import androidx.media3.exoplayer.offline.OooO0OO;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import o000Oo0.OooOO0;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00000O0 implements OooOO0.OooO00o, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34352OooO0Oo;

    public /* synthetic */ o00000O0(Object obj) {
        this.f34352OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        MainExploreFragment.initView$lambda$4((MainExploreFragment) this.f34352OooO0Oo);
    }

    @Override // o000Oo0.OooOO0.OooO00o
    public final void onProgress(long j, long j2) {
        OooO0O0.OooO00o oooO00o = ((OooO0OO) this.f34352OooO0Oo).f7840OooO0o0;
        if (oooO00o == null) {
            return;
        }
        float f = (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j;
        OooO00o.OooO0o oooO0o = (OooO00o.OooO0o) oooO00o;
        oooO0o.f7828OooO0o.f34350OooO00o = j2;
        oooO0o.f7828OooO0o.f34351OooO0O0 = f;
        if (j != oooO0o.f7834OooOO0o) {
            oooO0o.f7834OooOO0o = j;
            OooO00o.OooO0O0 oooO0O0 = oooO0o.f7826OooO;
            if (oooO0O0 != null) {
                oooO0O0.obtainMessage(10, (int) (j >> 32), (int) j, oooO0o).sendToTarget();
            }
        }
    }
}
