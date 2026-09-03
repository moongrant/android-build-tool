package p650o0ooo;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.annotation.NonNull;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class z2 extends Dialog {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f59248OooO0Oo;

    public z2(@NonNull Activity activity) {
        super(activity);
        Window window = getWindow();
        window.requestFeature(1);
        window.setContentView(oo0o0Oo.dialog_scaning_music);
        window.setBackgroundDrawableResource(o0OOO0o.transparent);
        window.setDimAmount(0.3f);
        window.setGravity(17);
        setCanceledOnTouchOutside(false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        window.setAttributes(attributes);
        window.findViewById(o0OO00O.iv_close).setOnClickListener(new y2(this));
        this.f59248OooO0Oo = window.findViewById(o0OO00O.iv_scanning);
        RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(3000L);
        rotateAnimation.setRepeatCount(Integer.MAX_VALUE);
        this.f59248OooO0Oo.startAnimation(rotateAnimation);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }
}
