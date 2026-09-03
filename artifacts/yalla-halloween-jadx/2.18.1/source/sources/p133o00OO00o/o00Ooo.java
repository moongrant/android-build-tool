package p133o00OO00o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31285Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.oo0o0Oo f31286Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f31287Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f31288Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f31289OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f31290OoooO00;

    public o00Ooo(o0OoOo0 o0oooo1, RecyclerView.oo0o0Oo oo0o0oo, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f31289OoooO0 = o0oooo1;
        this.f31286Oooo0o = oo0o0oo;
        this.f31287Oooo0oO = i;
        this.f31288Oooo0oo = view;
        this.f31285Oooo = i2;
        this.f31290OoooO00 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f31287Oooo0oO != 0) {
            this.f31288Oooo0oo.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        if (this.f31285Oooo != 0) {
            this.f31288Oooo0oo.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31290OoooO00.setListener(null);
        this.f31289OoooO0.OooO0oo(this.f31286Oooo0o);
        this.f31289OoooO0.f31320OooOO0o.remove(this.f31286Oooo0o);
        this.f31289OoooO0.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f31289OoooO0);
    }
}
