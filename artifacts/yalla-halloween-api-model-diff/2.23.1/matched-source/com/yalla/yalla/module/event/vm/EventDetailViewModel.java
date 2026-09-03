package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.repository.EventRepo$delete$$inlined$call$1;
import com.yalla.yalla.data.repository.EventRepo$detail$$inlined$call$1;
import com.yalla.yalla.data.repository.EventRepo$getSubPage$$inlined$call$1;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;
import p383o0OOoOo0.Oooo000;
import p414o0Oo0o0O.o000O000;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bA\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR+\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010$\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R+\u0010,\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00106\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0013\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+R+\u0010:\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0013\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventDetailViewModel;", "Lcom/yalla/yalla/module/event/vm/EventViewModel;", "", "updateRoomEventState", "getDetail", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "delete", "Lcom/yalla/yalla/model/event/EventModel;", "_eventModel", "Lcom/yalla/yalla/model/event/EventModel;", "get_eventModel", "()Lcom/yalla/yalla/model/event/EventModel;", "set_eventModel", "(Lcom/yalla/yalla/model/event/EventModel;)V", "Lcom/code/android/uikit/contentstate/ContentState;", "<set-?>", "contentState$delegate", "Landroidx/compose/runtime/MutableState;", "getContentState", "()Lcom/code/android/uikit/contentstate/ContentState;", "setContentState", "(Lcom/code/android/uikit/contentstate/ContentState;)V", "contentState", "eventModel$delegate", "getEventModel", "setEventModel", "eventModel", "", "isOpenDesc$delegate", "isOpenDesc", "()Z", "setOpenDesc", "(Z)V", "isDelete$delegate", "isDelete", "setDelete", "", "eventNumber$delegate", "getEventNumber", "()I", "setEventNumber", "(I)V", "eventNumber", "deleteEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getDeleteEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setDeleteEvent", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "eventDescMaxLineCount$delegate", "getEventDescMaxLineCount", "setEventDescMaxLineCount", "eventDescMaxLineCount", "havMore$delegate", "getHavMore", "setHavMore", "havMore", "Lo00o00oO/o000;", "Lcom/yalla/yalla/model/user/UserInfoModel;", "getSubsPage", "Lo00o00oO/o000;", "getGetSubsPage", "()Lo00o00oO/o000;", "<init>", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEventDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventDetailViewModel.kt\ncom/yalla/yalla/module/event/vm/EventDetailViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,87:1\n81#2:88\n107#2,2:89\n81#2:91\n107#2,2:92\n81#2:94\n107#2,2:95\n81#2:97\n107#2,2:98\n81#2:100\n107#2,2:101\n81#2:103\n107#2,2:104\n81#2:106\n107#2,2:107\n*S KotlinDebug\n*F\n+ 1 EventDetailViewModel.kt\ncom/yalla/yalla/module/event/vm/EventDetailViewModel\n*L\n23#1:88\n23#1:89,2\n24#1:91\n24#1:92,2\n25#1:94\n25#1:95,2\n26#1:97\n26#1:98,2\n27#1:100\n27#1:101,2\n29#1:103\n29#1:104,2\n30#1:106\n30#1:107,2\n*E\n"})
public final class EventDetailViewModel extends EventViewModel {
    public static final int $stable = 8;

    @NotNull
    private EventModel _eventModel;

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState contentState;

    @NotNull
    private MutableSharedFlow<Boolean> deleteEvent;

    /* JADX INFO: renamed from: eventDescMaxLineCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState eventDescMaxLineCount;

    /* JADX INFO: renamed from: eventModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState eventModel;

    /* JADX INFO: renamed from: eventNumber$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState eventNumber;

    @NotNull
    private final o000<UserInfoModel> getSubsPage;

    /* JADX INFO: renamed from: havMore$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState havMore;

    /* JADX INFO: renamed from: isDelete$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isDelete;

    /* JADX INFO: renamed from: isOpenDesc$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isOpenDesc;

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventDetailViewModel$delete$1$1", f = "EventDetailViewModel.kt", i = {1}, l = {73, 77, 79}, m = "invokeSuspend", n = {"subscribeEvent"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f23626OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f23628OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableSharedFlow<ApiResult<String>> f23629OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MutableSharedFlow<ApiResult<String>> mutableSharedFlow, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f23629OooO0oO = mutableSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventDetailViewModel.this.new OooO00o(this.f23629OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0087 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ApiResult<String> apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23628OooO0o0;
            EventDetailViewModel eventDetailViewModel = EventDetailViewModel.this;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult = this.f23626OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                    this.f23626OooO0Oo = null;
                    this.f23628OooO0o0 = 3;
                    if (this.f23629OooO0oO.emit(apiResult, this) == coroutine_suspended) {
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
            long id = eventDetailViewModel.getEventModel().getId();
            this.f23628OooO0o0 = 1;
            String strOooO0O0 = oo000o.OooO0O0("/Webservers/Event/Delete");
            o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0O0, "url", strOooO0O0, 1);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(id), "eventId");
            obj = OooOOO.OooO0Oo(new EventRepo$delete$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                eventDetailViewModel.setDelete(true);
                eventDetailViewModel.updateRoomEventState();
                MutableSharedFlow<Boolean> deleteEvent = eventDetailViewModel.getDeleteEvent();
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.f23626OooO0Oo = apiResult;
                this.f23628OooO0o0 = 2;
                if (deleteEvent.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f23626OooO0Oo = null;
            this.f23628OooO0o0 = 3;
            if (this.f23629OooO0oO.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventDetailViewModel$getDetail$1", f = "EventDetailViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23630OooO0Oo;

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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ContentState contentState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23630OooO0Oo;
            EventDetailViewModel eventDetailViewModel = EventDetailViewModel.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long id = eventDetailViewModel.get_eventModel().getId();
                this.f23630OooO0Oo = 1;
                String strOooO0O0 = oo000o.OooO0O0("/Webservers/Event/GetInfo");
                o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0O0, "url", strOooO0O0, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(id), "eventid");
                obj = OooOOO.OooO0Oo(new EventRepo$detail$$inlined$call$1(o0oooooOooO00o, null), this);
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
            if (apiResult.isSuccess()) {
                EventModel eventModel = (EventModel) apiResult.getData();
                if (eventModel != null) {
                    eventDetailViewModel.setEventModel(eventModel);
                    eventDetailViewModel.setEventNumber(eventDetailViewModel.getEventModel().getEventNumber());
                }
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                Long l = (Long) oo0oO0.OooOOo0().getValue();
                eventDetailViewModel.setHavMore(l == null || l.longValue() != eventDetailViewModel.getEventModel().getCreatorUserId() || eventDetailViewModel.getEventModel().getIsCanDelete() || eventDetailViewModel.getEventModel().getIsCanCopy());
                eventDetailViewModel.setContentState(ContentState.Content);
            } else {
                if (apiResult.getError().getCode() == 2060) {
                    eventDetailViewModel.updateRoomEventState();
                }
                ApiError error = apiResult.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
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

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventDetailViewModel$getSubsPage$1", f = "EventDetailViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<UserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23632OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f23634OooO0o0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = EventDetailViewModel.this.new OooO0OO(continuation);
            oooO0OO.f23634OooO0o0 = ((Number) obj).intValue();
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<UserInfoModel>> continuation) {
            return ((OooO0OO) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23632OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f23634OooO0o0;
                long id = EventDetailViewModel.this.getEventModel().getId();
                this.f23632OooO0Oo = 1;
                String strOooO0O0 = oo000o.OooO0O0("Webservers/Event/GetSubPage");
                o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0O0, "url", strOooO0O0, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(id), "eventid");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new EventRepo$getSubPage$$inlined$call$1(o0oooooOooO00o, null), this);
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
        this.contentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);
        this.eventModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(this._eventModel, null, 2, null);
        this.isOpenDesc = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.isDelete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.eventNumber = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.deleteEvent = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.eventDescMaxLineCount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
        this.havMore = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        getDetail();
        this.getSubsPage = new o000<>(ViewModelKt.getViewModelScope(this), new OooO0OO(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRoomEventState() {
        String mid = getEventModel().getMid();
        Intrinsics.checkNotNullParameter(mid, "mid");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000O000(mid, null), 2, null);
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
    public final o000<UserInfoModel> getGetSubsPage() {
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
