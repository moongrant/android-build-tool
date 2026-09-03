package p511o0o0O;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000O;
import com.facebook.FacebookSdk;
import com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager;
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
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftLayoutShowSelectViewManager$easyClosePage$1", f = "GiftLayoutShowSelectViewManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ GiftLayoutShowSelectViewManager f50926OooO0Oo;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftLayoutShowSelectViewManager f50927OooO00o;

        public OooO00o(GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager) {
            this.f50927OooO00o = giftLayoutShowSelectViewManager;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = this.f50927OooO00o;
            giftLayoutShowSelectViewManager.getClass();
            SVGAView svgaLoading = giftLayoutShowSelectViewManager.f27558OooO0OO.f44182OooO0OO;
            Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
            o000O.OooO0O0(svgaLoading);
            o00Ooo.OooO0Oo().OooOO0O();
            FrameLayout frameLayout = giftLayoutShowSelectViewManager.f27557OooO0O0;
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
    public OooOOOO(GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f50926OooO0Oo = giftLayoutShowSelectViewManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOOO(this.f50926OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), oo000o.easy_dialog_anim_exit_bottom_alpha);
        GiftLayoutShowSelectViewManager giftLayoutShowSelectViewManager = this.f50926OooO0Oo;
        animationLoadAnimation.setAnimationListener(new OooO00o(giftLayoutShowSelectViewManager));
        giftLayoutShowSelectViewManager.f27557OooO0O0.startAnimation(animationLoadAnimation);
        return Unit.INSTANCE;
    }
}
