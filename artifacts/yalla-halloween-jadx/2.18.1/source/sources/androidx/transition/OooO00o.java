package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p101o000oOoo.oO000OOo;
import p101o000oOoo.oO00OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Matrix f9498Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f9499Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Matrix f9500Oooo0oO = new Matrix();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f9501Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform f9502OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.OooO f9503OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ View f9504OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.OooO0o f9505OoooO0O;

    public OooO00o(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, ChangeTransform.OooO oooO, ChangeTransform.OooO0o oooO0o) {
        this.f9502OoooO = changeTransform;
        this.f9501Oooo0oo = z;
        this.f9498Oooo = matrix;
        this.f9504OoooO00 = view;
        this.f9503OoooO0 = oooO;
        this.f9505OoooO0O = oooO0o;
    }

    public final void OooO00o(Matrix matrix) {
        this.f9500Oooo0oO.set(matrix);
        this.f9504OoooO00.setTag(oO000OOo.transition_transform, this.f9500Oooo0oO);
        this.f9503OoooO0.OooO00o(this.f9504OoooO00);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9499Oooo0o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f9499Oooo0o) {
            if (this.f9501Oooo0oo && this.f9502OoooO.f9475o0OoOo0) {
                OooO00o(this.f9498Oooo);
            } else {
                this.f9504OoooO00.setTag(oO000OOo.transition_transform, null);
                this.f9504OoooO00.setTag(oO000OOo.parent_matrix, null);
            }
        }
        oO00OO0O.f29748OooO00o.OooO0o0(this.f9504OoooO00, null);
        this.f9503OoooO0.OooO00o(this.f9504OoooO00);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        OooO00o(this.f9505OoooO0O.f9487OooO00o);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        ChangeTransform.Oooo0o(this.f9504OoooO00, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }
}
