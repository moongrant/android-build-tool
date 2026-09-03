package p650o0ooo;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Dialog {
    public f(@NonNull TaskActivity taskActivity) {
        super(taskActivity);
        requestWindowFeature(1);
        setContentView(oo0o0Oo.dialog_oldrogue);
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable());
        window.setGravity(48);
        window.setWindowAnimations(o000000O.anim_dialog_top);
        ImageView imageView = (ImageView) findViewById(o0OO00O.iv_anin_bg);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(12000L);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        imageView.startAnimation(rotateAnimation);
    }
}
