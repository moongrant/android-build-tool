package p556o0oOOooo;

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
import p367o0OOo0o0.OooOOOO;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.moment.SendMomentEmojiAtPollView$initData$1$1", f = "SendMomentEmojiAtPollView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOo0000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SendMomentEmojiAtPollView f56147OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EditTextSpan f56148OooO0o0;

    public static final class OooO00o extends Lambda implements Function2<Boolean, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SendMomentEmojiAtPollView f56149OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(SendMomentEmojiAtPollView sendMomentEmojiAtPollView) {
            super(2);
            this.f56149OooO0Oo = sendMomentEmojiAtPollView;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, Integer num) {
            boolean zBooleanValue = bool.booleanValue();
            num.intValue();
            this.f56149OooO0Oo.getBinding().f57546OooO0o0.setImageResource(zBooleanValue ? oO00OOO.iv_room_emoji_gray : oO00OOO.ic_moment_chat_keyboard_gray);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(SendMomentEmojiAtPollView sendMomentEmojiAtPollView, EditTextSpan editTextSpan, Continuation<? super oOo0000O> continuation) {
        super(2, continuation);
        this.f56147OooO0Oo = sendMomentEmojiAtPollView;
        this.f56148OooO0o0 = editTextSpan;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOo0000O(this.f56147OooO0Oo, this.f56148OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOo0000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SendMomentEmojiAtPollView sendMomentEmojiAtPollView = this.f56147OooO0Oo;
        MutableState<OooOOOO> mutableState = sendMomentEmojiAtPollView.f31190OooOO0o;
        OooOOOO oooOOOO = new OooOOOO(sendMomentEmojiAtPollView.getPanelLayoutState(), this.f56148OooO0o0);
        oooOOOO.f43971OooO0OO = new OooO00o(sendMomentEmojiAtPollView);
        mutableState.setValue(oooOOOO);
        return Unit.INSTANCE;
    }
}
