package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f8927Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.oo0o0Oo f8928Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f8929Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f8930Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f8931OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f8932OoooO00;

    public OooOOO(OooOO0 oooOO1, RecyclerView.oo0o0Oo oo0o0oo, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f8931OoooO0 = oooOO1;
        this.f8928Oooo0o = oo0o0oo;
        this.f8929Oooo0oO = i;
        this.f8930Oooo0oo = view;
        this.f8927Oooo = i2;
        this.f8932OoooO00 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f8929Oooo0oO != 0) {
            this.f8930Oooo0oo.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        if (this.f8927Oooo != 0) {
            this.f8930Oooo0oo.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f8932OoooO00.setListener(null);
        this.f8931OoooO0.OooO0oo(this.f8928Oooo0o);
        this.f8931OoooO0.f8903OooOOOo.remove(this.f8928Oooo0o);
        this.f8931OoooO0.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f8931OoooO0);
    }
}
