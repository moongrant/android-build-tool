package p557o0oOOoOo;

import android.app.Activity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.weieyu.yalla.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Activity f44671OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Animation f44672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Animation f44673OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Animation f44674OooO0Oo;

    public oO00O0o0(Activity activity) {
        this.f44671OooO00o = activity;
        this.f44672OooO0O0 = AnimationUtils.loadAnimation(activity, R.anim.fade_in_anim);
        AnimationUtils.loadAnimation(this.f44671OooO00o, R.anim.fade2_in_anim);
        this.f44673OooO0OO = AnimationUtils.loadAnimation(this.f44671OooO00o, R.anim.fade_out_anim);
        this.f44674OooO0Oo = AnimationUtils.loadAnimation(this.f44671OooO00o, R.anim.thepinanim);
    }
}
