package p445o0OoOoo;

import com.yalla.yalla.model.event.EventCreateStateModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o000O000;
import p560o0oOo000.o00000O0;
import p560o0oOo000.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.event.ui.view.ExploreEventKt$CreateEvents$1$1$2$1$1$1", f = "ExploreEvent.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
public final class o0O00o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f46363OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.view.ExploreEventKt$CreateEvents$1$1$2$1$1$1$1", f = "ExploreEvent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<EventCreateStateModel, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventCreateStateModel eventCreateStateModel, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00000O0 o00000o1 = o0000OO0.f56183OooO0O0;
            if (o00000o1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("event");
                o00000o1 = null;
            }
            o00000o1.OooO00o();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o0(EventViewModel eventViewModel, Continuation<? super o0O00o0> continuation) {
        super(2, continuation);
        this.f46363OooO0o0 = eventViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O00o0(this.f46363OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O00o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46362OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventViewModel eventViewModel = this.f46363OooO0o0;
            MutableSharedFlow<ApiResult<EventCreateStateModel>> createEventState = eventViewModel.getCreateEventState(eventViewModel.getRoomIdForUser());
            OooO00o oooO00o = new OooO00o(null);
            this.f46362OooO0Oo = 1;
            if (o000O000.OooO00o(createEventState, oooO00o, null, this, 14) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
