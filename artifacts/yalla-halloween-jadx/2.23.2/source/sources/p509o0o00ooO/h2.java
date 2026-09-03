package p509o0o00ooO;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieAnimationView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class h2 extends p1 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final LottieAnimationView f50687OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final int[] f50688OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final int[] f50689OooOoO0;

    public static final class OooO00o implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f50690OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ h2 f50691OooO0o0;

        public OooO00o(ChatModel chatModel, h2 h2Var) {
            this.f50690OooO0Oo = chatModel;
            this.f50691OooO0o0 = h2Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ChatModel chatModel = this.f50690OooO0Oo;
            if (chatModel.getNumber() > 0) {
                int number = chatModel.getNumber();
                h2 h2Var = this.f50691OooO0o0;
                if (number <= h2Var.f50689OooOoO0.length) {
                    h2Var.f50687OooOo.clearAnimation();
                    h2Var.f50687OooOo.setImageResource(h2Var.f50689OooOoO0[chatModel.getNumber() - 1]);
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f50692OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ h2 f50693OooO0o0;

        public OooO0O0(ChatModel chatModel, h2 h2Var) {
            this.f50692OooO0Oo = chatModel;
            this.f50693OooO0o0 = h2Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ChatModel chatModel = this.f50692OooO0Oo;
            if (chatModel.getNumber() > 0) {
                int number = chatModel.getNumber();
                h2 h2Var = this.f50693OooO0o0;
                if (number <= h2Var.f50688OooOoO.length) {
                    h2Var.f50687OooOo.clearAnimation();
                    h2Var.f50687OooOo.setImageResource(h2Var.f50688OooOoO[chatModel.getNumber() - 1]);
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
    public h2(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(o0OO00O.chatline_iv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f50687OooOo = (LottieAnimationView) viewFindViewById;
        this.f50689OooOoO0 = new int[]{o0Oo0oo.icon_anim_dice_1, o0Oo0oo.icon_anim_dice_2, o0Oo0oo.icon_anim_dice_3, o0Oo0oo.icon_anim_dice_4, o0Oo0oo.icon_anim_dice_5, o0Oo0oo.icon_anim_dice_6};
        this.f50688OooOoO = new int[]{o0Oo0oo.icon_anim_jsb_s, o0Oo0oo.icon_anim_jsb_j, o0Oo0oo.icon_anim_jsb_b};
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO00o() {
        return false;
    }

    @Override // p509o0o00ooO.p1
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        ViewGroup viewGroup = this.f50758OooOO0;
        viewGroup.setBackground(null);
        viewGroup.setPadding(0, 0, 0, 0);
        long jCurrentTimeMillis = System.currentTimeMillis() - model.getPlayTime();
        int type = model.getType();
        LottieAnimationView lottieAnimationView = this.f50687OooOo;
        if (type == 9) {
            if (jCurrentTimeMillis <= 3000) {
                lottieAnimationView.OooO0OO();
                lottieAnimationView.setAnimation("lottie/lottie_anim_dice.json");
                lottieAnimationView.setImageAssetsFolder("lottie/anim_file_dice/");
                lottieAnimationView.setRepeatCount(5);
                lottieAnimationView.f11736OooO0oo.f11762OooO0o.addListener(new OooO00o(model, this));
                lottieAnimationView.OooO0oO();
                return;
            }
            if (model.getNumber() > 0) {
                int number = model.getNumber();
                int[] iArr = this.f50689OooOoO0;
                if (number <= iArr.length) {
                    lottieAnimationView.clearAnimation();
                    lottieAnimationView.setImageResource(iArr[model.getNumber() - 1]);
                    return;
                }
                return;
            }
            return;
        }
        if (model.getType() == 10) {
            if (jCurrentTimeMillis <= 3000) {
                lottieAnimationView.setAnimation("lottie/lottie_anim_jsb.json");
                lottieAnimationView.setImageAssetsFolder("lottie/anim_file_jsb/");
                lottieAnimationView.setRepeatCount(5);
                lottieAnimationView.f11736OooO0oo.f11762OooO0o.addListener(new OooO0O0(model, this));
                lottieAnimationView.OooO0oO();
                return;
            }
            if (model.getNumber() > 0) {
                int number2 = model.getNumber();
                int[] iArr2 = this.f50688OooOoO;
                if (number2 <= iArr2.length) {
                    lottieAnimationView.clearAnimation();
                    lottieAnimationView.setImageResource(iArr2[model.getNumber() - 1]);
                }
            }
        }
    }

    @Override // p509o0o00ooO.p1
    public final boolean OooO0Oo() {
        return false;
    }
}
