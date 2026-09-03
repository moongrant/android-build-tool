package o00OOOOo;

import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import com.chad.library.adapter.base.BaseViewHolder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f37350OooO00o = 1;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f37351OooO0O0 = false;

    public void OooO00o(BaseViewHolder baseViewHolder) {
        int i = this.f37350OooO00o;
        if (i == 1) {
            baseViewHolder.setVisible(OooO0o0(), false);
            baseViewHolder.setVisible(OooO0Oo(), false);
            int iOooO0OO = OooO0OO();
            if (iOooO0OO != 0) {
                baseViewHolder.setVisible(iOooO0OO, false);
                return;
            }
            return;
        }
        if (i == 2) {
            baseViewHolder.setVisible(OooO0o0(), true);
            baseViewHolder.setVisible(OooO0Oo(), false);
            int iOooO0OO2 = OooO0OO();
            if (iOooO0OO2 != 0) {
                baseViewHolder.setVisible(iOooO0OO2, false);
                return;
            }
            return;
        }
        if (i == 3) {
            baseViewHolder.setVisible(OooO0o0(), false);
            baseViewHolder.setVisible(OooO0Oo(), true);
            int iOooO0OO3 = OooO0OO();
            if (iOooO0OO3 != 0) {
                baseViewHolder.setVisible(iOooO0OO3, false);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        baseViewHolder.setVisible(OooO0o0(), false);
        baseViewHolder.setVisible(OooO0Oo(), false);
        int iOooO0OO4 = OooO0OO();
        if (iOooO0OO4 != 0) {
            baseViewHolder.setVisible(iOooO0OO4, true);
        }
    }

    @LayoutRes
    public abstract int OooO0O0();

    @IdRes
    public abstract int OooO0OO();

    @IdRes
    public abstract int OooO0Oo();

    public void OooO0o(int i) {
        this.f37350OooO00o = i;
    }

    @IdRes
    public abstract int OooO0o0();
}
