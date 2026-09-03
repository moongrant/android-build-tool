package com.yalla.yalla.ui.view.tips;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import java.util.Objects;
import p391o0Oo0.OooOO0;
import p568o0oOoO.o0OOOO00;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o extends OooOO0<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public GiftGuideView f31372OooO;

    public OooO00o(MixedRoomActivity mixedRoomActivity) {
        super(mixedRoomActivity, 0);
        Window window = getWindow();
        Objects.requireNonNull(window);
        try {
            window.getDecorView().setSystemUiVisibility(4352);
        } catch (Exception e) {
            e.printStackTrace();
        }
        OooOO0O(119);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
    }

    public static void OooOO0o(OooO00o oooO00o) {
        super.dismiss();
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0O0() {
    }

    @Override // p391o0Oo0.OooOO0
    public final int OooO0o0() {
        return oO00OO0O.layout_gift_dialog_tips;
    }

    @Override // p391o0Oo0.OooOO0
    public final void OooO0oo() {
        GiftGuideView giftGuideView = (GiftGuideView) findViewById(oO00O0oO.gift_guide_root);
        this.f31372OooO = giftGuideView;
        giftGuideView.setOnDismissListener(new o0OOOO00(this));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    @Override // p629o0ooO0O0.o00000OO
    public final void onClickNotDouble(View view) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // p391o0Oo0.OooOO0, android.app.Dialog
    public final void show() {
        super.show();
    }
}
