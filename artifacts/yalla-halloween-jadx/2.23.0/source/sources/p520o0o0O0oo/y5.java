package p520o0o0O0oo;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.facebook.FacebookSdk;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager;
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
import p408o0Oo0o0O.o00Oo0;
import p584o0oOooO0.oO000o00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager$easyClosePage$1", f = "GiftLayoutHideSelectViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class y5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftLayoutHideSelectViewManager f53413OooO0Oo;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftLayoutHideSelectViewManager f53414OooO00o;

        public OooO00o(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager) {
            this.f53414OooO00o = giftLayoutHideSelectViewManager;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = this.f53414OooO00o;
            giftLayoutHideSelectViewManager.getClass();
            SVGAView sVGAView = giftLayoutHideSelectViewManager.f28010OooO0OO.f59402OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView);
            o00Oo0.OooO0Oo().OooOO0O();
            FrameLayout frameLayout = giftLayoutHideSelectViewManager.f28009OooO0O0;
            frameLayout.removeAllViews();
            o000OO00.OooO0O0(frameLayout);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@Nullable Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager, Continuation<? super y5> continuation) {
        super(2, continuation);
        this.f53413OooO0Oo = giftLayoutHideSelectViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new y5(this.f53413OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((y5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oO000o00.easy_dialog_anim_exit_bottom_alpha);
        GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = this.f53413OooO0Oo;
        animationLoadAnimation.setAnimationListener(new OooO00o(giftLayoutHideSelectViewManager));
        giftLayoutHideSelectViewManager.f28009OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
