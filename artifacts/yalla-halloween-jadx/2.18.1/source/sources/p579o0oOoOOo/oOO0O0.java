package p579o0oOoOOo;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.FacebookSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog;
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

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.GiftBlindHistoryDialog$easyClosePage$1", f = "GiftBlindHistoryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GiftBlindHistoryDialog f46080Oooo0o;

    public static final class OooO00o implements Animation.AnimationListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GiftBlindHistoryDialog f46081OooO00o;

        public OooO00o(GiftBlindHistoryDialog giftBlindHistoryDialog) {
            this.f46081OooO00o = giftBlindHistoryDialog;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(@Nullable Animation animation) {
            SVGAView sVGAView = this.f46081OooO00o.OooOOO().f50783OooO0O0;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            oOO00O.OooO00o(sVGAView);
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            OooOOO0.OooO0Oo().OooOO0O();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(@Nullable Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(@Nullable Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0(GiftBlindHistoryDialog giftBlindHistoryDialog, Continuation<? super oOO0O0> continuation) {
        super(2, continuation);
        this.f46080Oooo0o = giftBlindHistoryDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOO0O0(this.f46080Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        AnimationUtils.loadAnimation(FacebookSdk.getApplicationContext(), R.anim.easy_dialog_anim_exit_bottom_alpha).setAnimationListener(new OooO00o(this.f46080Oooo0o));
        return Unit.INSTANCE;
    }
}
