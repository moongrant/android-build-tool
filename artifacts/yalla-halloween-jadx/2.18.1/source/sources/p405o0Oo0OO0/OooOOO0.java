package p405o0Oo0OO0;

import android.animation.Animator;
import com.opensource.svgaplayer.SVGAImageView;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooO f39060Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f39061Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f39062Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ SVGAImageView f39063Oooo0oo;

    public OooOOO0(int i, int i2, SVGAImageView sVGAImageView, OooO oooO) {
        this.f39061Oooo0o = i;
        this.f39062Oooo0oO = i2;
        this.f39063Oooo0oo = sVGAImageView;
        this.f39060Oooo = oooO;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@Nullable Animator animator) {
        SVGAImageView sVGAImageView = this.f39063Oooo0oo;
        int i = SVGAImageView.f19424OoooO0;
        Objects.requireNonNull(sVGAImageView);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Nullable Animator animator) {
        SVGAImageView sVGAImageView = this.f39063Oooo0oo;
        int i = SVGAImageView.f19424OoooO0;
        Objects.requireNonNull(sVGAImageView);
        this.f39063Oooo0oo.OooO0Oo();
        if (!this.f39063Oooo0oo.getClearsAfterStop()) {
            if (this.f39063Oooo0oo.getFillMode() == SVGAImageView.FillMode.Backward) {
                this.f39060Oooo.OooO0O0(this.f39061Oooo0o);
            } else if (this.f39063Oooo0oo.getFillMode() == SVGAImageView.FillMode.Forward) {
                this.f39060Oooo.OooO0O0(this.f39062Oooo0oO);
            }
        }
        OooO0o f19425Oooo = this.f39063Oooo0oo.getF19425Oooo();
        if (f19425Oooo != null) {
            f19425Oooo.onFinished();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@Nullable Animator animator) {
        OooO0o f19425Oooo = this.f39063Oooo0oo.getF19425Oooo();
        if (f19425Oooo != null) {
            f19425Oooo.onRepeat();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@Nullable Animator animator) {
        SVGAImageView sVGAImageView = this.f39063Oooo0oo;
        int i = SVGAImageView.f19424OoooO0;
        Objects.requireNonNull(sVGAImageView);
    }
}
