package p591o0oOooOo;

import android.os.Bundle;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventCreateStateModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventDetailViewModel;
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

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.event.EventDetailScreen$toolbarMenuDialog$1$1", f = "EventDetailScreen.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class h4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f47243Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f47244Oooo0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.event.EventDetailScreen$toolbarMenuDialog$1$1$1", f = "EventDetailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<EventCreateStateModel, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f47245Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ EventDetailViewModel f47246Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EventDetailViewModel eventDetailViewModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f47246Oooo0oO = eventDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f47246Oooo0oO, continuation);
            oooO00o.f47245Oooo0o = obj;
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
            EventCreateStateModel eventCreateStateModel = (EventCreateStateModel) this.f47245Oooo0o;
            EventModel eventModel = this.f47246Oooo0oO.getEventModel();
            if (eventCreateStateModel != null && eventModel != null) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.event.EventDetailScreen$toolbarMenuDialog$1$1$2", f = "EventDetailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<ApiResult<EventCreateStateModel>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ EventDetailViewModel f47247Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(EventDetailViewModel eventDetailViewModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f47247Oooo0o = eventDetailViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f47247Oooo0o, continuation);
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
            this.f47247Oooo0o.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(EventDetailViewModel eventDetailViewModel, Continuation<? super h4> continuation) {
        super(2, continuation);
        this.f47244Oooo0oO = eventDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new h4(this.f47244Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((h4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47243Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EventDetailViewModel eventDetailViewModel = this.f47244Oooo0oO;
            MutableSharedFlow<ApiResult<EventCreateStateModel>> createEventState = eventDetailViewModel.getCreateEventState(eventDetailViewModel.getEventModel().getRoomId());
            OooO00o oooO00o = new OooO00o(this.f47244Oooo0oO, null);
            OooO0O0 oooO0O0 = new OooO0O0(this.f47244Oooo0oO, null);
            this.f47243Oooo0o = 1;
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
