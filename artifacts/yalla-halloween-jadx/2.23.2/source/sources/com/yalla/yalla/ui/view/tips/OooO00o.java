package com.yalla.yalla.ui.view.tips;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import java.util.Objects;
import o00000O.OooO0OO;
import p401o0Oo0O00.OooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends OooO<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public GiftGuideView f30831OooO;

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

    @Override // p401o0Oo0O00.OooO
    public final void OooO0O0() {
    }

    @Override // p401o0Oo0O00.OooO
    public final int OooO0o0() {
        return oo0o0Oo.layout_gift_dialog_tips;
    }

    @Override // p401o0Oo0O00.OooO
    public final void OooO0oo() {
        GiftGuideView giftGuideView = (GiftGuideView) findViewById(o0OO00O.gift_guide_root);
        this.f30831OooO = giftGuideView;
        giftGuideView.setOnDismissListener(new OooO0OO(this));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    @Override // p400o0Oo0O0.OooOO0O
    public final void onClickNotDouble(View view) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // p401o0Oo0O00.OooO, android.app.Dialog
    public final void show() {
        super.show();
    }
}
