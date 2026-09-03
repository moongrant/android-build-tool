package p501o0o00o;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.FacebookSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager;
import com.yalla.yalla.common.ui.view.SVGAView;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p497o0o00Oo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.ui.dialog.giftDialog.GiftBlindWebManager$easyClosePage$1", f = "GiftBlindWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindWebManager f41391Oooo0o;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftBlindWebManager f41392OooO00o;

        public OooO00o(GiftBlindWebManager giftBlindWebManager) {
            this.f41392OooO00o = giftBlindWebManager;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            Objects.requireNonNull(this.f41392OooO00o);
            SVGAView sVGAView = this.f41392OooO00o.f20888OooO0OO.f49624OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView);
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            OooOOO0.OooO0Oo().OooOO0O();
            this.f41392OooO00o.f20887OooO0O0.removeAllViews();
            oOO00O.OooO00o(this.f41392OooO00o.f20887OooO0O0);
            Objects.requireNonNull(this.f41392OooO00o);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@Nullable Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(GiftBlindWebManager giftBlindWebManager, Continuation<? super Oooo0> continuation) {
        super(2, continuation);
        this.f41391Oooo0o = giftBlindWebManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo0(this.f41391Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), R.anim.easy_dialog_anim_exit_bottom_alpha);
        animationLoadAnimation.setAnimationListener(new OooO00o(this.f41391Oooo0o));
        this.f41391Oooo0o.f20887OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
