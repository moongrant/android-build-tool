package p511o0o0O;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
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
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutHideSelectViewManager$easyClosePage$1", f = "GiftLayoutHideSelectViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftLayoutHideSelectViewManager f50924OooO0Oo;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftLayoutHideSelectViewManager f50925OooO00o;

        public OooO00o(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager) {
            this.f50925OooO00o = giftLayoutHideSelectViewManager;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = this.f50925OooO00o;
            giftLayoutHideSelectViewManager.getClass();
            SVGAView svgaLoading = giftLayoutHideSelectViewManager.f27539OooO0OO.f44155OooO0O0;
            Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
            o000O.OooO0O0(svgaLoading);
            o00Ooo.OooO0Oo().OooOO0O();
            FrameLayout frameLayout = giftLayoutHideSelectViewManager.f27538OooO0O0;
            frameLayout.removeAllViews();
            o000O.OooO0O0(frameLayout);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@Nullable Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f50924OooO0Oo = giftLayoutHideSelectViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOO0(this.f50924OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oo000o.easy_dialog_anim_exit_bottom_alpha);
        GiftLayoutHideSelectViewManager giftLayoutHideSelectViewManager = this.f50924OooO0Oo;
        animationLoadAnimation.setAnimationListener(new OooO00o(giftLayoutHideSelectViewManager));
        giftLayoutHideSelectViewManager.f27538OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
