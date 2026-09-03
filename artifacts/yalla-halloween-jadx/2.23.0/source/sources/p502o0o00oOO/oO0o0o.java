package p502o0o00oOO;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieAnimationView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0o0o extends o0OOO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final LottieAnimationView f49619OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final int[] f49620OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final int[] f49621OooOoO0;

    public static final class OooO00o implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ChatModel f49622OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO0o0o f49623OooO0o0;

        public OooO00o(ChatModel chatModel, oO0o0o oo0o0o) {
            this.f49622OooO0Oo = chatModel;
            this.f49623OooO0o0 = oo0o0o;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ChatModel chatModel = this.f49622OooO0Oo;
            if (chatModel.getNumber() > 0) {
                int number = chatModel.getNumber();
                oO0o0o oo0o0o = this.f49623OooO0o0;
                if (number <= oo0o0o.f49621OooOoO0.length) {
                    oo0o0o.f49619OooOo.clearAnimation();
                    oo0o0o.f49619OooOo.setImageResource(oo0o0o.f49621OooOoO0[chatModel.getNumber() - 1]);
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
        public final /* synthetic */ ChatModel f49624OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO0o0o f49625OooO0o0;

        public OooO0O0(ChatModel chatModel, oO0o0o oo0o0o) {
            this.f49624OooO0Oo = chatModel;
            this.f49625OooO0o0 = oo0o0o;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ChatModel chatModel = this.f49624OooO0Oo;
            if (chatModel.getNumber() > 0) {
                int number = chatModel.getNumber();
                oO0o0o oo0o0o = this.f49625OooO0o0;
                if (number <= oo0o0o.f49620OooOoO.length) {
                    oo0o0o.f49619OooOo.clearAnimation();
                    oo0o0o.f49619OooOo.setImageResource(oo0o0o.f49620OooOoO[chatModel.getNumber() - 1]);
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
    public oO0o0o(@NotNull View view, @NotNull MixedRoomActivity activity) {
        super(view, activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(oO00O0oO.chatline_iv);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.chatline_iv)");
        this.f49619OooOo = (LottieAnimationView) viewFindViewById;
        this.f49621OooOoO0 = new int[]{oOo00OO0.icon_anim_dice_1, oOo00OO0.icon_anim_dice_2, oOo00OO0.icon_anim_dice_3, oOo00OO0.icon_anim_dice_4, oOo00OO0.icon_anim_dice_5, oOo00OO0.icon_anim_dice_6};
        this.f49620OooOoO = new int[]{oOo00OO0.icon_anim_jsb_s, oOo00OO0.icon_anim_jsb_j, oOo00OO0.icon_anim_jsb_b};
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO00o() {
        return false;
    }

    @Override // p502o0o00oOO.o0OOO0
    public final void OooO0OO(int i, @NotNull ChatModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        super.OooO0OO(i, model);
        ViewGroup viewGroup = this.f49456OooOO0;
        viewGroup.setBackground(null);
        viewGroup.setPadding(0, 0, 0, 0);
        long jCurrentTimeMillis = System.currentTimeMillis() - model.getPlayTime();
        int type = model.getType();
        LottieAnimationView lottieAnimationView = this.f49619OooOo;
        if (type == 9) {
            if (jCurrentTimeMillis <= 3000) {
                lottieAnimationView.OooO0OO();
                lottieAnimationView.setAnimation("lottie/lottie_anim_dice.json");
                lottieAnimationView.setImageAssetsFolder("lottie/anim_file_dice/");
                lottieAnimationView.setRepeatCount(5);
                lottieAnimationView.f8646OooO0oo.f8672OooO0o.addListener(new OooO00o(model, this));
                lottieAnimationView.OooO0oO();
                return;
            }
            if (model.getNumber() > 0) {
                int number = model.getNumber();
                int[] iArr = this.f49621OooOoO0;
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
                lottieAnimationView.f8646OooO0oo.f8672OooO0o.addListener(new OooO0O0(model, this));
                lottieAnimationView.OooO0oO();
                return;
            }
            if (model.getNumber() > 0) {
                int number2 = model.getNumber();
                int[] iArr2 = this.f49620OooOoO;
                if (number2 <= iArr2.length) {
                    lottieAnimationView.clearAnimation();
                    lottieAnimationView.setImageResource(iArr2[model.getNumber() - 1]);
                }
            }
        }
    }

    @Override // p502o0o00oOO.o0OOO0
    public final boolean OooO0Oo() {
        return false;
    }
}
