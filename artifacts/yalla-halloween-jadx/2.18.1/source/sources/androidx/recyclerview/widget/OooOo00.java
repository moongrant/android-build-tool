package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f8964Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0.OooO0o f8965Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f8966Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f8967Oooo0oo;

    public OooOo00(OooOO0 oooOO1, OooOO0.OooO0o oooO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f8964Oooo = oooOO1;
        this.f8965Oooo0o = oooO0o;
        this.f8966Oooo0oO = viewPropertyAnimator;
        this.f8967Oooo0oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f8966Oooo0oO.setListener(null);
        this.f8967Oooo0oo.setAlpha(1.0f);
        this.f8967Oooo0oo.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f8967Oooo0oo.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f8964Oooo.OooO0oo(this.f8965Oooo0o.f8918OooO0O0);
        this.f8964Oooo.f8904OooOOo.remove(this.f8965Oooo0o.f8918OooO0O0);
        this.f8964Oooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        OooOO0 oooOO1 = this.f8964Oooo;
        RecyclerView.oo0o0Oo oo0o0oo = this.f8965Oooo0o.f8918OooO0O0;
        Objects.requireNonNull(oooOO1);
    }
}
