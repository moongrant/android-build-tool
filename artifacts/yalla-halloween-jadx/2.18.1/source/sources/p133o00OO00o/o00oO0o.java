package p133o00OO00o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f31291Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooO0o f31292Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f31293Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f31294Oooo0oo;

    public o00oO0o(o0OoOo0 o0oooo1, o0OoOo0.OooO0o oooO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f31291Oooo = o0oooo1;
        this.f31292Oooo0o = oooO0o;
        this.f31293Oooo0oO = viewPropertyAnimator;
        this.f31294Oooo0oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31293Oooo0oO.setListener(null);
        this.f31294Oooo0oo.setAlpha(1.0f);
        this.f31294Oooo0oo.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f31294Oooo0oo.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f31291Oooo.OooO0oo(this.f31292Oooo0o.f31339OooO0O0);
        this.f31291Oooo.f31321OooOOO.remove(this.f31292Oooo0o.f31339OooO0O0);
        this.f31291Oooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o0OoOo0 o0oooo1 = this.f31291Oooo;
        RecyclerView.oo0o0Oo oo0o0oo = this.f31292Oooo0o.f31339OooO0O0;
        Objects.requireNonNull(o0oooo1);
    }
}
