package p133o00OO00o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f31346Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooO0o f31347Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f31348Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f31349Oooo0oo;

    public oo000o(o0OoOo0 o0oooo1, o0OoOo0.OooO0o oooO0o, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f31346Oooo = o0oooo1;
        this.f31347Oooo0o = oooO0o;
        this.f31348Oooo0oO = viewPropertyAnimator;
        this.f31349Oooo0oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31348Oooo0oO.setListener(null);
        this.f31349Oooo0oo.setAlpha(1.0f);
        this.f31349Oooo0oo.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f31349Oooo0oo.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f31346Oooo.OooO0oo(this.f31347Oooo0o.f31338OooO00o);
        this.f31346Oooo.f31321OooOOO.remove(this.f31347Oooo0o.f31338OooO00o);
        this.f31346Oooo.OooOOoo();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o0OoOo0 o0oooo1 = this.f31346Oooo;
        RecyclerView.oo0o0Oo oo0o0oo = this.f31347Oooo0o.f31338OooO00o;
        Objects.requireNonNull(o0oooo1);
    }
}
