package p587o0oOoo0O;

import android.os.Bundle;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventCreateStateModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import com.yalla.yalla.ui.vm.room.RoomEventInfoViewModel;
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
import o000O00O.OooO0OO;
import o0o0000.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOoo.o000O;
import p591o0oOooOo.x3;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.page.RoomEventInfoPage$RoomEventInfoCreator$1$1", f = "RoomEventInfoPage.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
public final class oO00O0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f47042Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomEventInfoViewModel f47043Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47044Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.page.RoomEventInfoPage$RoomEventInfoCreator$1$1$1", f = "RoomEventInfoPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<EventCreateStateModel, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f47045Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f47045Oooo0o = obj;
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
            EventCreateStateModel eventCreateStateModel = (EventCreateStateModel) this.f47045Oooo0o;
            EventModel eventModel = new EventModel();
            if (eventCreateStateModel != null) {
                eventModel.setRoomId(eventCreateStateModel.getRoomId());
                eventModel.setRoomIdx(eventCreateStateModel.getRoomIdx());
                eventModel.setRoomName(eventCreateStateModel.getRoomName());
                eventModel.setCreateToken(eventCreateStateModel.getCreateToken());
            }
            Bundle bundleOooO00o = OooO0OO.OooO00o();
            bundleOooO00o.putSerializable("key", eventModel);
            o000O.OooO00o(x3.f47361OooO00o, bundleOooO00o);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.page.RoomEventInfoPage$RoomEventInfoCreator$1$1$2", f = "RoomEventInfoPage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<ApiResult<EventCreateStateModel>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RoomEventInfoViewModel f47046Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomEventInfoViewModel roomEventInfoViewModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f47046Oooo0o = roomEventInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f47046Oooo0o, continuation);
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
            this.f47046Oooo0o.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o(RoomEventInfoViewModel roomEventInfoViewModel, EventViewModel eventViewModel, Continuation<? super oO00O0o> continuation) {
        super(2, continuation);
        this.f47043Oooo0oO = roomEventInfoViewModel;
        this.f47044Oooo0oo = eventViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO00O0o(this.f47043Oooo0oO, this.f47044Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO00O0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47042Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<ApiResult<EventCreateStateModel>> createEventState = this.f47043Oooo0oO.getCreateEventState(this.f47044Oooo0oo.getRoomId());
            OooO00o oooO00o = new OooO00o(null);
            OooO0O0 oooO0O0 = new OooO0O0(this.f47043Oooo0oO, null);
            this.f47042Oooo0o = 1;
            if (o000oOoO.OooO00o(createEventState, oooO00o, oooO0O0, this, 10) == coroutine_suspended) {
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
