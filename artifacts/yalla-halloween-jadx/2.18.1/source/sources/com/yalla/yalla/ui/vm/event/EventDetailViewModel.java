package com.yalla.yalla.ui.vm.event;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import code.easy.contentstate.ContentState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.EventModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o0o0000.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.OooOo00;
import p520o0o0O0O0.Oooo0;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bA\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR+\u0010%\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R+\u0010*\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R+\u00102\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020,8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u001a\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R+\u00106\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020,8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R+\u0010:\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u001a\u001a\u0004\b8\u0010&\"\u0004\b9\u0010(R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/yalla/yalla/ui/vm/event/EventDetailViewModel;", "Lcom/yalla/yalla/ui/vm/event/EventViewModel;", "", "updateRoomEventState", "getDetail", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "delete", "Lcom/yalla/yalla/model/EventModel;", "_eventModel", "Lcom/yalla/yalla/model/EventModel;", "get_eventModel", "()Lcom/yalla/yalla/model/EventModel;", "set_eventModel", "(Lcom/yalla/yalla/model/EventModel;)V", "", "deleteEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getDeleteEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setDeleteEvent", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "Lcode/easy/contentstate/ContentState;", "<set-?>", "contentState$delegate", "Lo000oOoO/o0O00OO;", "getContentState", "()Lcode/easy/contentstate/ContentState;", "setContentState", "(Lcode/easy/contentstate/ContentState;)V", "contentState", "eventModel$delegate", "getEventModel", "setEventModel", "eventModel", "isOpenDesc$delegate", "isOpenDesc", "()Z", "setOpenDesc", "(Z)V", "isDelete$delegate", "isDelete", "setDelete", "", "eventNumber$delegate", "getEventNumber", "()I", "setEventNumber", "(I)V", "eventNumber", "eventDescMaxLineCount$delegate", "getEventDescMaxLineCount", "setEventDescMaxLineCount", "eventDescMaxLineCount", "havMore$delegate", "getHavMore", "setHavMore", "havMore", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/common/model/UserInfoModel;", "getSubsPage", "Lo0ooO00/o000O0;", "getGetSubsPage", "()Lo0ooO00/o000O0;", "<init>", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EventDetailViewModel extends EventViewModel {
    public static final int $stable = 8;

    @NotNull
    private EventModel _eventModel;

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO contentState;

    @NotNull
    private MutableSharedFlow<Boolean> deleteEvent;

    /* JADX INFO: renamed from: eventDescMaxLineCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO eventDescMaxLineCount;

    /* JADX INFO: renamed from: eventModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO eventModel;

    /* JADX INFO: renamed from: eventNumber$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO eventNumber;

    @NotNull
    private final o000O0<UserInfoModel> getSubsPage;

    /* JADX INFO: renamed from: havMore$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO havMore;

    /* JADX INFO: renamed from: isDelete$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO isDelete;

    /* JADX INFO: renamed from: isOpenDesc$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO isOpenDesc;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventDetailViewModel$delete$1$1", f = "EventDetailViewModel.kt", i = {1}, l = {73, 77, 79}, m = "invokeSuspend", n = {"subscribeEvent"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow<ApiResult<String>> f25421Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f25422Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25423Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableSharedFlow<ApiResult<String>> mutableSharedFlow, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25421Oooo = mutableSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventDetailViewModel.this.new OooO00o(this.f25421Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0074 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ApiResult<String> apiResult;
            MutableSharedFlow<ApiResult<String>> mutableSharedFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25423Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult = this.f25422Oooo0o;
                    ResultKt.throwOnFailure(obj);
                    mutableSharedFlow = this.f25421Oooo;
                    this.f25422Oooo0o = null;
                    this.f25423Oooo0oO = 3;
                    if (mutableSharedFlow.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Oooo0 oooo0 = Oooo0.f42257OooO00o;
            long id = EventDetailViewModel.this.getEventModel().getId();
            this.f25423Oooo0oO = 1;
            obj = oooo0.OooO0O0(id, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                EventDetailViewModel.this.setDelete(true);
                EventDetailViewModel.this.updateRoomEventState();
                MutableSharedFlow<Boolean> deleteEvent = EventDetailViewModel.this.getDeleteEvent();
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.f25422Oooo0o = apiResult;
                this.f25423Oooo0oO = 2;
                if (deleteEvent.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            mutableSharedFlow = this.f25421Oooo;
            this.f25422Oooo0o = null;
            this.f25423Oooo0oO = 3;
            if (mutableSharedFlow.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventDetailViewModel$getDetail$1", f = "EventDetailViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25425Oooo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventDetailViewModel.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ContentState contentState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25425Oooo0o;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0 oooo0 = Oooo0.f42257OooO00o;
                long id = EventDetailViewModel.this.get_eventModel().getId();
                this.f25425Oooo0o = 1;
                obj = oooo0.OooO0OO(id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EventDetailViewModel eventDetailViewModel = EventDetailViewModel.this;
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                EventModel eventModel = (EventModel) apiResult.getData();
                if (eventModel != null) {
                    eventDetailViewModel.setEventModel(eventModel);
                    eventDetailViewModel.setEventNumber(eventDetailViewModel.getEventModel().getEventNumber());
                }
                Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                long creatorUserId = eventDetailViewModel.getEventModel().getCreatorUserId();
                if (value != null && value.longValue() == creatorUserId && !eventDetailViewModel.getEventModel().getIsCanDelete() && !eventDetailViewModel.getEventModel().getIsCanCopy()) {
                    z = false;
                }
                eventDetailViewModel.setHavMore(z);
                eventDetailViewModel.setContentState(ContentState.Content);
            } else {
                if (apiResult.getError().getCode() == 2060) {
                    eventDetailViewModel.updateRoomEventState();
                }
                ApiError error = apiResult.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                if (apiResult.getError().getCode() == 2060) {
                    LiveEventBus.get("EVENT_DELETED").post(Boxing.boxLong(eventDetailViewModel.getEventModel().getId()));
                    contentState = ContentState.Empty;
                } else {
                    contentState = ContentState.Error;
                }
                eventDetailViewModel.setContentState(contentState);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventDetailViewModel$getSubsPage$1", f = "EventDetailViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25427Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f25428Oooo0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = EventDetailViewModel.this.new OooO0OO(continuation);
            oooO0OO.f25428Oooo0oO = ((Number) obj).intValue();
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<UserInfoModel>> continuation) {
            return ((OooO0OO) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25427Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f25428Oooo0oO;
                Oooo0 oooo0 = Oooo0.f42257OooO00o;
                long id = EventDetailViewModel.this.getEventModel().getId();
                this.f25427Oooo0o = 1;
                obj = oooo0.OooOO0(id, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    public EventDetailViewModel(@NotNull EventModel _eventModel) {
        Intrinsics.checkNotNullParameter(_eventModel, "_eventModel");
        this._eventModel = _eventModel;
        this.contentState = o0OOO00.OooO0Oo(ContentState.Loading);
        this.eventModel = o0OOO00.OooO0Oo(this._eventModel);
        this.isOpenDesc = o0OOO00.OooO0Oo(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.isDelete = o0OOO00.OooO0Oo(bool);
        this.eventNumber = o0OOO00.OooO0Oo(0);
        this.deleteEvent = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.eventDescMaxLineCount = o0OOO00.OooO0Oo(-1);
        this.havMore = o0OOO00.OooO0Oo(bool);
        getDetail();
        this.getSubsPage = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO0OO(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRoomEventState() {
        String mid = getEventModel().getMid();
        Intrinsics.checkNotNullParameter(mid, "mid");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooOo00(mid, null), 2, null);
    }

    @NotNull
    public final MutableSharedFlow<ApiResult<String>> delete() {
        MutableSharedFlow<ApiResult<String>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(mutableSharedFlowMutableSharedFlow$default, null), 2, null);
        return mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getContentState() {
        return (ContentState) this.contentState.getValue();
    }

    @NotNull
    public final MutableSharedFlow<Boolean> getDeleteEvent() {
        return this.deleteEvent;
    }

    public final void getDetail() {
        setContentState(ContentState.Loading);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getEventDescMaxLineCount() {
        return ((Number) this.eventDescMaxLineCount.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final EventModel getEventModel() {
        return (EventModel) this.eventModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getEventNumber() {
        return ((Number) this.eventNumber.getValue()).intValue();
    }

    @NotNull
    public final o000O0<UserInfoModel> getGetSubsPage() {
        return this.getSubsPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHavMore() {
        return ((Boolean) this.havMore.getValue()).booleanValue();
    }

    @NotNull
    public final EventModel get_eventModel() {
        return this._eventModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDelete() {
        return ((Boolean) this.isDelete.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isOpenDesc() {
        return ((Boolean) this.isOpenDesc.getValue()).booleanValue();
    }

    public final void setContentState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.contentState.setValue(contentState);
    }

    public final void setDelete(boolean z) {
        this.isDelete.setValue(Boolean.valueOf(z));
    }

    public final void setDeleteEvent(@NotNull MutableSharedFlow<Boolean> mutableSharedFlow) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<set-?>");
        this.deleteEvent = mutableSharedFlow;
    }

    public final void setEventDescMaxLineCount(int i) {
        this.eventDescMaxLineCount.setValue(Integer.valueOf(i));
    }

    public final void setEventModel(@NotNull EventModel eventModel) {
        Intrinsics.checkNotNullParameter(eventModel, "<set-?>");
        this.eventModel.setValue(eventModel);
    }

    public final void setEventNumber(int i) {
        this.eventNumber.setValue(Integer.valueOf(i));
    }

    public final void setHavMore(boolean z) {
        this.havMore.setValue(Boolean.valueOf(z));
    }

    public final void setOpenDesc(boolean z) {
        this.isOpenDesc.setValue(Boolean.valueOf(z));
    }

    public final void set_eventModel(@NotNull EventModel eventModel) {
        Intrinsics.checkNotNullParameter(eventModel, "<set-?>");
        this._eventModel = eventModel;
    }
}
