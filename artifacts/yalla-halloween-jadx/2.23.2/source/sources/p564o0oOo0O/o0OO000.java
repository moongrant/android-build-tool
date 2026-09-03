package p564o0oOo0O;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p371o0OOo0oO.oo000o;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView$initData$1$1", f = "SendMomentEmojiAtPollView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SendMomentEmojiAtPollView f56357OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EditTextSpan f56358OooO0o0;

    public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SendMomentEmojiAtPollView f56359OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SendMomentEmojiAtPollView sendMomentEmojiAtPollView) {
            super(2);
            this.f56359OooO0Oo = sendMomentEmojiAtPollView;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            num.intValue();
            this.f56359OooO0Oo.getBinding().f44557OooO0o0.setImageResource(zBooleanValue ? o0O0O00.iv_room_emoji_gray : o0O0O00.ic_moment_chat_keyboard_gray);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(SendMomentEmojiAtPollView sendMomentEmojiAtPollView, EditTextSpan editTextSpan, Continuation<? super o0OO000> continuation) {
        super(2, continuation);
        this.f56357OooO0Oo = sendMomentEmojiAtPollView;
        this.f56358OooO0o0 = editTextSpan;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OO000(this.f56357OooO0Oo, this.f56358OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OO000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SendMomentEmojiAtPollView sendMomentEmojiAtPollView = this.f56357OooO0Oo;
        MutableState<oo000o> mutableState = sendMomentEmojiAtPollView.f30649OooOO0o;
        oo000o oo000oVar = new oo000o(sendMomentEmojiAtPollView.getPanelLayoutState(), this.f56358OooO0o0);
        oo000oVar.f43183OooO0OO = new OooO00o(sendMomentEmojiAtPollView);
        mutableState.setValue(oo000oVar);
        return Unit.INSTANCE;
    }
}
