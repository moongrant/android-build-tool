package p348o0OOO0oO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f38183Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f38184Oooo0oO;

    public OooOO0O(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f38184Oooo0oO = baseTransientBottomBar;
        this.f38183Oooo0o = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f38184Oooo0oO.OooO0o0();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f38184Oooo0oO.f17695OooO0Oo;
        snackbarContentLayout.f17739Oooo0o.setAlpha(1.0f);
        long j = 180;
        long j2 = 0;
        snackbarContentLayout.f17739Oooo0o.animate().alpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.f17740Oooo0oO.getVisibility() == 0) {
            snackbarContentLayout.f17740Oooo0oO.setAlpha(1.0f);
            snackbarContentLayout.f17740Oooo0oO.animate().alpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(j).setStartDelay(j2).start();
        }
    }
}
