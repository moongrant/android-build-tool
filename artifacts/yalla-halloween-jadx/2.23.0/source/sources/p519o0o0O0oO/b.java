package p519o0o0O0oO;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Dialog {
    public b(@NonNull TaskActivity taskActivity) {
        super(taskActivity);
        requestWindowFeature(1);
        setContentView(oO00OO0O.dialog_oldrogue);
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable());
        window.setGravity(48);
        window.setWindowAnimations(oO00Oo00.anim_dialog_top);
        ImageView imageView = (ImageView) findViewById(oO00O0oO.iv_anin_bg);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(12000L);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        imageView.startAnimation(rotateAnimation);
    }
}
