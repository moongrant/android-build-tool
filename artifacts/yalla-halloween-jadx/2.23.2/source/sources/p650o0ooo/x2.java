package p650o0ooo;

import android.annotation.SuppressLint;
import android.view.View;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import p401o0Oo0O00.OooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ResourceAsColor"})
public final class x2 extends OooO<String, AbsListenerTag> {
    public x2(ShowImageActivity showImageActivity) {
        super(showImageActivity, 0);
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.dialog_save_image_layout;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == o0OO00O.dialog_save_image_layout_bg) {
            dismiss();
        } else if (id == o0OO00O.dialog_save_image_layout_save) {
            OooOO0(this.f43650OooO0o0, AbsListenerTag.Ok);
            dismiss();
        }
    }
}
