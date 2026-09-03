package p176o00OoooO;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class oO0Oo0oo extends Dialog {
    public oO0Oo0oo(@NonNull Context context) {
        super(context);
        requestWindowFeature(1);
        setContentView(R.layout.dialog_oldrogue);
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable());
        window.setGravity(48);
        window.setWindowAnimations(R.style.anim_dialog_top);
        ImageView imageView = (ImageView) findViewById(R.id.iv_anin_bg);
        RotateAnimation rotateAnimation = new RotateAnimation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(12000L);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        imageView.startAnimation(rotateAnimation);
    }
}
