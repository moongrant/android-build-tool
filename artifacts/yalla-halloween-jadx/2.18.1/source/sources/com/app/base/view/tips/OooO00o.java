package com.app.base.view.tips;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.weieyu.yalla.R;
import java.util.Objects;
import p146o00Oo000.OooO0O0;
import p189o00o00oO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends OooO0O0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public GiftGuideView f12239OoooO0;

    public OooO00o(Context context) {
        super(context, 0);
        Window window = getWindow();
        Objects.requireNonNull(window);
        try {
            window.getDecorView().setSystemUiVisibility(4352);
        } catch (Exception e) {
            e.printStackTrace();
        }
        OooOO0o(119);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
    }

    public static void OooOOO(OooO00o oooO00o) {
        super.dismiss();
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0O0() {
    }

    @Override // p146o00Oo000.OooO0O0
    public final int OooO0o0() {
        return R.layout.layout_gift_dialog_tips;
    }

    @Override // p146o00Oo000.OooO0O0
    public final void OooO0oo() {
        GiftGuideView giftGuideView = (GiftGuideView) findViewById(R.id.gift_guide_root);
        this.f12239OoooO0 = giftGuideView;
        giftGuideView.setOnDismissListener(new o0OO00O(this, 0));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // p146o00Oo000.OooO0O0, android.app.Dialog
    public final void show() {
        super.show();
    }
}
