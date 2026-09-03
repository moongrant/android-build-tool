package p564o0oOo0O;

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
import p587o0oOooOO.t;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView$initData$1$2", f = "SendMomentEmojiAtPollView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t f56360OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EditTextSpan f56361OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<EmojiFaceView, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EditTextSpan f56362OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EditTextSpan editTextSpan) {
            super(1);
            this.f56362OooO0Oo = editTextSpan;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(EmojiFaceView emojiFaceView) {
            EmojiFaceView emojiFaceView2 = emojiFaceView;
            if (emojiFaceView2 != null) {
                int i = EmojiFaceView.f29840OooO0oo;
                EditTextSpan editText = this.f56362OooO0Oo;
                Intrinsics.checkNotNullParameter(editText, "editText");
                emojiFaceView2.editText = editText;
                emojiFaceView2.isMomentPage = true;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(t tVar, EditTextSpan editTextSpan, Continuation<? super o0OO000o> continuation) {
        super(2, continuation);
        this.f56360OooO0Oo = tVar;
        this.f56361OooO0o0 = editTextSpan;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO000o(this.f56360OooO0Oo, this.f56361OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OO000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f56360OooO0Oo.f56981OooO0o0 = new OooO00o(this.f56361OooO0o0);
        return Unit.INSTANCE;
    }
}
