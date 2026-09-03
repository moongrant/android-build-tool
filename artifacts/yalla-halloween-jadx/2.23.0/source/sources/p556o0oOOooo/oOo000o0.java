package p556o0oOOooo;

import com.yalla.yalla.ui.view.EmojiFaceView;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p539o0o0OoOO.y0;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView$initData$1$2", f = "SendMomentEmojiAtPollView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOo000o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ y0 f56151OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EditTextSpan f56152OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<EmojiFaceView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EditTextSpan f56153OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EditTextSpan editTextSpan) {
            super(1);
            this.f56153OooO0Oo = editTextSpan;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EmojiFaceView emojiFaceView) {
            EmojiFaceView emojiFaceView2 = emojiFaceView;
            if (emojiFaceView2 != null) {
                int i = EmojiFaceView.f30386OooO0oo;
                EditTextSpan editText = this.f56153OooO0Oo;
                Intrinsics.checkNotNullParameter(editText, "editText");
                emojiFaceView2.editText = editText;
                emojiFaceView2.isMomentPage = true;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000o0(y0 y0Var, EditTextSpan editTextSpan, Continuation<? super oOo000o0> continuation) {
        super(2, continuation);
        this.f56151OooO0Oo = y0Var;
        this.f56152OooO0o0 = editTextSpan;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOo000o0(this.f56151OooO0Oo, this.f56152OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOo000o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f56151OooO0Oo.f55753OooO0o0 = new OooO00o(this.f56152OooO0o0);
        return Unit.INSTANCE;
    }
}
