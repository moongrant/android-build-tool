package p348o0OOO0oO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f38182Oooo0o;

    public OooOO0(BaseTransientBottomBar baseTransientBottomBar) {
        this.f38182Oooo0o = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f38182Oooo0o.OooO0o();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f38182Oooo0o.f17695OooO0Oo;
        snackbarContentLayout.f17739Oooo0o.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        long j = 180;
        long j2 = 70;
        snackbarContentLayout.f17739Oooo0o.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.f17740Oooo0oO.getVisibility() == 0) {
            snackbarContentLayout.f17740Oooo0oO.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            snackbarContentLayout.f17740Oooo0oO.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
