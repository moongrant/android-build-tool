package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable.OooO00o f9386Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CircularProgressDrawable f9387Oooo0oO;

    public OooO0O0(CircularProgressDrawable circularProgressDrawable, CircularProgressDrawable.OooO00o oooO00o) {
        this.f9387Oooo0oO = circularProgressDrawable;
        this.f9386Oooo0o = oooO00o;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        this.f9387Oooo0oO.OooO00o(1.0f, this.f9386Oooo0o, true);
        CircularProgressDrawable.OooO00o oooO00o = this.f9386Oooo0o;
        oooO00o.f9373OooOO0O = oooO00o.f9369OooO0o0;
        oooO00o.f9374OooOO0o = oooO00o.f9368OooO0o;
        oooO00o.f9376OooOOO0 = oooO00o.f9370OooO0oO;
        oooO00o.OooO00o((oooO00o.f9372OooOO0 + 1) % oooO00o.f9363OooO.length);
        CircularProgressDrawable circularProgressDrawable = this.f9387Oooo0oO;
        if (!circularProgressDrawable.f9361OoooO0) {
            circularProgressDrawable.f9362OoooO00 += 1.0f;
            return;
        }
        circularProgressDrawable.f9361OoooO0 = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.f9386Oooo0o.OooO0O0(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f9387Oooo0oO.f9362OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }
}
