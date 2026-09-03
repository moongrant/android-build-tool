package p519o0o0O0oO;

import android.annotation.SuppressLint;
import android.view.View;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import p391o0Oo0.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class x2 extends OooOO0<String, AbsListenerTag> {
    public x2(ShowImageActivity showImageActivity) {
        super(showImageActivity, 0);
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.dialog_save_image_layout;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == oO00O0oO.dialog_save_image_layout_bg) {
            dismiss();
        } else if (id == oO00O0oO.dialog_save_image_layout_save) {
            OooOO0(this.f44398OooO0o0, AbsListenerTag.Ok);
            dismiss();
        }
    }
}
