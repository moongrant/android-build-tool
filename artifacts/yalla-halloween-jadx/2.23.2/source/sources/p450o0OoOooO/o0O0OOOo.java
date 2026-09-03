package p450o0OoOooO;

import com.yalla.yalla.model.event.EventCreateStateModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.module.event.ui.screen.EventCreateScreen;
import com.yalla.yalla.module.event.vm.EventViewModel;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.event.ui.screen.EventDisplayScreenKt$EventDisplayToolbar$1$3$1", f = "EventDisplayScreen.kt", i = {}, l = {Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0OOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f47549OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47550OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.screen.EventDisplayScreenKt$EventDisplayToolbar$1$3$1$1", f = "EventDisplayScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<EventCreateStateModel, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f47551OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f47551OooO0Oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EventCreateStateModel eventCreateStateModel, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(eventCreateStateModel, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            EventCreateScreen.INSTANCE.createEvent((EventCreateStateModel) this.f47551OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.screen.EventDisplayScreenKt$EventDisplayToolbar$1$3$1$2", f = "EventDisplayScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<ApiResult<EventCreateStateModel>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ EventViewModel f47552OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(EventViewModel eventViewModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f47552OooO0Oo = eventViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f47552OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ApiResult<EventCreateStateModel> apiResult, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f47552OooO0Oo.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(EventViewModel eventViewModel, Continuation<? super o0O0OOOo> continuation) {
        super(2, continuation);
        this.f47550OooO0o0 = eventViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0OOOo(this.f47550OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0OOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47549OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventViewModel eventViewModel = this.f47550OooO0o0;
            MutableSharedFlow<ApiResult<EventCreateStateModel>> createEventState = eventViewModel.getCreateEventState(eventViewModel.getRoomIdForUser());
            OooO00o oooO00o = new OooO00o(null);
            OooO0O0 oooO0O0 = new OooO0O0(eventViewModel, null);
            this.f47549OooO0Oo = 1;
            if (o00O0O.OooO00o(createEventState, oooO00o, oooO0O0, this, 10) == coroutine_suspended) {
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
