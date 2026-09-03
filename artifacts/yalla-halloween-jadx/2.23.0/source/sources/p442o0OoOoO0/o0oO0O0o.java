package p442o0OoOoO0;

import com.yalla.yalla.model.event.EventCreateStateModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.module.event.ui.screen.EventCreateScreen;
import com.yalla.yalla.module.event.vm.EventViewModel;
import com.yalla.yalla.module.event.vm.RoomEventInfoViewModel;
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
import p377o0OOoOo.o000O000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.event.ui.page.RoomEventInfoPage$RoomEventInfoCreator$1$1", f = "RoomEventInfoPage.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {})
public final class o0oO0O0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46287OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f46288OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomEventInfoViewModel f46289OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.page.RoomEventInfoPage$RoomEventInfoCreator$1$1$1", f = "RoomEventInfoPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<EventCreateStateModel, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46290OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f46290OooO0Oo = obj;
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
            EventCreateScreen.INSTANCE.createEvent((EventCreateStateModel) this.f46290OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.ui.page.RoomEventInfoPage$RoomEventInfoCreator$1$1$2", f = "RoomEventInfoPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<ApiResult<EventCreateStateModel>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomEventInfoViewModel f46291OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomEventInfoViewModel roomEventInfoViewModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f46291OooO0Oo = roomEventInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f46291OooO0Oo, continuation);
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
            this.f46291OooO0Oo.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(RoomEventInfoViewModel roomEventInfoViewModel, EventViewModel eventViewModel, Continuation<? super o0oO0O0o> continuation) {
        super(2, continuation);
        this.f46289OooO0o0 = roomEventInfoViewModel;
        this.f46288OooO0o = eventViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0oO0O0o(this.f46289OooO0o0, this.f46288OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0oO0O0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46287OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long roomId = this.f46288OooO0o.getRoomId();
            RoomEventInfoViewModel roomEventInfoViewModel = this.f46289OooO0o0;
            MutableSharedFlow<ApiResult<EventCreateStateModel>> createEventState = roomEventInfoViewModel.getCreateEventState(roomId);
            OooO00o oooO00o = new OooO00o(null);
            OooO0O0 oooO0O0 = new OooO0O0(roomEventInfoViewModel, null);
            this.f46287OooO0Oo = 1;
            if (o000O000.OooO00o(createEventState, oooO00o, oooO0O0, this, 10) == coroutine_suspended) {
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
