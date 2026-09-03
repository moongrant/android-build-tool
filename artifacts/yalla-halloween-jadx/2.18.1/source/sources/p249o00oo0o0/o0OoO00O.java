package p249o00oo0o0;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import com.chad.library.adapter.base.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OoO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f34190OooO00o = 1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f34191OooO0O0 = false;

    public final void OooO(OooO00o oooO00o, boolean z) {
        oooO00o.OooOO0o(OooO0o0(), z);
    }

    public void OooO00o(OooO00o oooO00o) {
        int i = this.f34190OooO00o;
        if (i == 1) {
            OooO(oooO00o, false);
            OooO0oo(oooO00o, false);
            OooO0oO(oooO00o, false);
            return;
        }
        if (i == 2) {
            OooO(oooO00o, true);
            OooO0oo(oooO00o, false);
            OooO0oO(oooO00o, false);
        } else if (i == 3) {
            OooO(oooO00o, false);
            OooO0oo(oooO00o, true);
            OooO0oO(oooO00o, false);
        } else {
            if (i != 4) {
                return;
            }
            OooO(oooO00o, false);
            OooO0oo(oooO00o, false);
            OooO0oO(oooO00o, true);
        }
    }

    @LayoutRes
    public abstract int OooO0O0();

    @IdRes
    public abstract int OooO0OO();

    @IdRes
    public abstract int OooO0Oo();

    public void OooO0o(int i) {
        this.f34190OooO00o = i;
    }

    @IdRes
    public abstract int OooO0o0();

    public final void OooO0oO(OooO00o oooO00o, boolean z) {
        int iOooO0OO = OooO0OO();
        if (iOooO0OO != 0) {
            oooO00o.OooOO0o(iOooO0OO, z);
        }
    }

    public final void OooO0oo(OooO00o oooO00o, boolean z) {
        oooO00o.OooOO0o(OooO0Oo(), z);
    }
}
