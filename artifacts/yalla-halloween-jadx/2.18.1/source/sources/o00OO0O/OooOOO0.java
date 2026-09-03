package o00OO0O;

import android.os.Bundle;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventCreateStateModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;
import p584o0oOoo.o000O;
import p591o0oOooOo.x3;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.app.base.adapter.roomExplore.RoomExploreEventsManagerKt$CreateEvents$1$1$2$1$1$1", f = "RoomExploreEventsManager.kt", i = {}, l = {357}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f31359Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f31360Oooo0oO;

    @DebugMetadata(c = "com.app.base.adapter.roomExplore.RoomExploreEventsManagerKt$CreateEvents$1$1$2$1$1$1$1", f = "RoomExploreEventsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<EventCreateStateModel, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f31361Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f31361Oooo0o = obj;
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
            EventCreateStateModel eventCreateStateModel = (EventCreateStateModel) this.f31361Oooo0o;
            o0O00000.OooO0OO("Room_explore_Everts_establish_Create");
            EventModel eventModel = new EventModel();
            if (eventCreateStateModel != null) {
                eventModel.setRoomId(eventCreateStateModel.getRoomId());
                eventModel.setRoomIdx(eventCreateStateModel.getRoomIdx());
                eventModel.setRoomName(eventCreateStateModel.getRoomName());
                eventModel.setCreateToken(eventCreateStateModel.getCreateToken());
            }
            Bundle bundleOooO00o = o000O00O.OooO0OO.OooO00o();
            bundleOooO00o.putSerializable("key", eventModel);
            o000O.OooO00o(x3.f47361OooO00o, bundleOooO00o);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(EventViewModel eventViewModel, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f31360Oooo0oO = eventViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOO0(this.f31360Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f31359Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventViewModel eventViewModel = this.f31360Oooo0oO;
            MutableSharedFlow<ApiResult<EventCreateStateModel>> createEventState = eventViewModel.getCreateEventState(eventViewModel.getRoomIdForUser());
            OooO00o oooO00o = new OooO00o(null);
            this.f31359Oooo0o = 1;
            if (o0o0000.o000oOoO.OooO00o(createEventState, oooO00o, null, this, 14) == coroutine_suspended) {
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
