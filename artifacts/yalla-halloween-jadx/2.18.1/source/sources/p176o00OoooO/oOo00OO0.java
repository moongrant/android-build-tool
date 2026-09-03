package p176o00OoooO;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.annotation.NonNull;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class oOo00OO0 extends Dialog {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f32889Oooo0o;

    public oOo00OO0(@NonNull Activity activity) {
        super(activity);
        Window window = getWindow();
        window.requestFeature(1);
        window.setContentView(R.layout.dialog_scaning_music);
        window.setBackgroundDrawableResource(R.color.transparent);
        window.setDimAmount(0.3f);
        window.setGravity(17);
        setCanceledOnTouchOutside(false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        window.setAttributes(attributes);
        window.findViewById(R.id.iv_close).setOnClickListener(new oO00O0o(this));
        this.f32889Oooo0o = window.findViewById(R.id.iv_scanning);
        RotateAnimation rotateAnimation = new RotateAnimation(360.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(3000L);
        rotateAnimation.setRepeatCount(Integer.MAX_VALUE);
        this.f32889Oooo0o.startAnimation(rotateAnimation);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }
}
