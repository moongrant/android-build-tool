package p139o00OOOo0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.weieyu.yalla.R;
import p146o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ResourceAsColor"})
public final class o00O0OO extends OooO0O0<String, AbsListenerTag> {
    public o00O0OO(Context context) {
        super(context, 0);
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.dialog_save_image_layout;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.dialog_save_image_layout_bg) {
            dismiss();
        } else if (id == R.id.dialog_save_image_layout_save) {
            OooOO0(AbsListenerTag.Ok);
            dismiss();
        }
    }
}
