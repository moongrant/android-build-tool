package o00OO0O0;

import android.animation.Animator;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.app.base.model.ChatModel;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000000 extends OooOO0O {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final int[] f31424OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final LottieAnimationView f31425OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final int[] f31426OooOOoo;

    public static final class OooO00o implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatModel f31427Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000000 f31428Oooo0oO;

        public OooO00o(ChatModel chatModel, o000000 o000000Var) {
            this.f31427Oooo0o = chatModel;
            this.f31428Oooo0oO = o000000Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            int i = this.f31427Oooo0o.number;
            if (i > 0) {
                o000000 o000000Var = this.f31428Oooo0oO;
                if (i <= o000000Var.f31424OooOOo.length) {
                    o000000Var.f31425OooOOo0.clearAnimation();
                    o000000 o000000Var2 = this.f31428Oooo0oO;
                    o000000Var2.f31425OooOOo0.setImageResource(o000000Var2.f31424OooOOo[this.f31427Oooo0o.number - 1]);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    public static final class OooO0O0 implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ChatModel f31429Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000000 f31430Oooo0oO;

        public OooO0O0(ChatModel chatModel, o000000 o000000Var) {
            this.f31429Oooo0o = chatModel;
            this.f31430Oooo0oO = o000000Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            int i = this.f31429Oooo0o.number;
            if (i > 0) {
                o000000 o000000Var = this.f31430Oooo0oO;
                if (i <= o000000Var.f31426OooOOoo.length) {
                    o000000Var.f31425OooOOo0.clearAnimation();
                    o000000 o000000Var2 = this.f31430Oooo0oO;
                    o000000Var2.f31425OooOOo0.setImageResource(o000000Var2.f31426OooOOoo[this.f31429Oooo0o.number - 1]);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(@NotNull FragmentActivity activity, @NotNull View view) {
        super(activity, view);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(R.id.chatline_iv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.chatline_iv)");
        this.f31425OooOOo0 = (LottieAnimationView) viewFindViewById;
        this.f31424OooOOo = new int[]{R.drawable.icon_anim_dice_1, R.drawable.icon_anim_dice_2, R.drawable.icon_anim_dice_3, R.drawable.icon_anim_dice_4, R.drawable.icon_anim_dice_5, R.drawable.icon_anim_dice_6};
        this.f31426OooOOoo = new int[]{R.drawable.icon_anim_jsb_s, R.drawable.icon_anim_jsb_j, R.drawable.icon_anim_jsb_b};
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO00o() {
        return false;
    }

    @Override // o00OO0O0.OooOO0O
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        this.f31392OooOO0O.setBackground(null);
        this.f31392OooOO0O.setPadding(0, 0, 0, 0);
        long jCurrentTimeMillis = System.currentTimeMillis() - model.playTime;
        int i2 = model.type;
        if (i2 == 9) {
            if (jCurrentTimeMillis <= 3000) {
                this.f31425OooOOo0.OooO0Oo();
                this.f31425OooOOo0.setAnimation("lottie/lottie_anim_dice.json");
                this.f31425OooOOo0.setImageAssetsFolder("lottie/anim_file_dice/");
                this.f31425OooOOo0.setRepeatCount(5);
                this.f31425OooOOo0.OooO0OO(new OooO00o(model, this));
                this.f31425OooOOo0.OooOO0();
                return;
            }
            int i3 = model.number;
            if (i3 <= 0 || i3 > this.f31424OooOOo.length) {
                return;
            }
            this.f31425OooOOo0.clearAnimation();
            this.f31425OooOOo0.setImageResource(this.f31424OooOOo[model.number - 1]);
            return;
        }
        if (i2 == 10) {
            if (jCurrentTimeMillis <= 3000) {
                this.f31425OooOOo0.setAnimation("lottie/lottie_anim_jsb.json");
                this.f31425OooOOo0.setImageAssetsFolder("lottie/anim_file_jsb/");
                this.f31425OooOOo0.setRepeatCount(5);
                this.f31425OooOOo0.OooO0OO(new OooO0O0(model, this));
                this.f31425OooOOo0.OooOO0();
                return;
            }
            int i4 = model.number;
            if (i4 <= 0 || i4 > this.f31426OooOOoo.length) {
                return;
            }
            this.f31425OooOOo0.clearAnimation();
            this.f31425OooOOo0.setImageResource(this.f31426OooOOoo[model.number - 1]);
        }
    }

    @Override // o00OO0O0.OooOO0O
    public final boolean OooO0Oo() {
        return false;
    }
}
