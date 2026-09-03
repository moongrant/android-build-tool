package p520o0o0O0oo;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.facebook.FacebookSdk;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO000o00;
import p641o0ooOOOO.x8;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$easyClosePage$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class r5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f53329OooO0Oo;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f53330OooO00o;

        public OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
            this.f53330OooO00o = giftCustomMadeWebManager;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53330OooO00o;
            giftCustomMadeWebManager.f27999OooO0Oo = false;
            x8 x8Var = giftCustomMadeWebManager.f27998OooO0OO;
            SVGAView sVGAView = x8Var.f59336OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView);
            TextView textView = x8Var.f59337OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
            o000OO00.OooO0O0(textView);
            FrameLayout frameLayout = giftCustomMadeWebManager.f27997OooO0O0;
            frameLayout.removeAllViews();
            o000OO00.OooO0O0(frameLayout);
            Function0<Unit> function0 = giftCustomMadeWebManager.f28002OooO0oO;
            if (function0 != null) {
                function0.invoke();
                giftCustomMadeWebManager.f28002OooO0oO = null;
            }
            giftCustomMadeWebManager.f28004OooOO0 = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@Nullable Animation animation) {
            this.f53330OooO00o.f28004OooOO0 = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super r5> continuation) {
        super(2, continuation);
        this.f53329OooO0Oo = giftCustomMadeWebManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new r5(this.f53329OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((r5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oO000o00.easy_dialog_anim_exit_bottom_alpha);
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53329OooO0Oo;
        animationLoadAnimation.setAnimationListener(new OooO00o(giftCustomMadeWebManager));
        giftCustomMadeWebManager.f27997OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
