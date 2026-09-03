package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.EventRepo$getRoomEvent$$inlined$call$1;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomEventListModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO;
import p143o00Oo000.OooO0O0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p403o0Oo0OOo.o0OO00o0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R+\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/module/event/vm/RoomEventInfoViewModel;", "Lcom/yalla/yalla/module/event/vm/EventViewModel;", "", "<set-?>", "isCanCreate$delegate", "Landroidx/compose/runtime/MutableState;", "isCanCreate", "()Z", "setCanCreate", "(Z)V", "Lo00Oo000/OooO0O0;", "Lcom/yalla/yalla/model/event/EventModel;", "eventInfoPager", "Lo00Oo000/OooO0O0;", "getEventInfoPager", "()Lo00Oo000/OooO0O0;", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomEventInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEventInfoViewModel.kt\ncom/yalla/yalla/module/event/vm/RoomEventInfoViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,28:1\n81#2:29\n107#2,2:30\n*S KotlinDebug\n*F\n+ 1 RoomEventInfoViewModel.kt\ncom/yalla/yalla/module/event/vm/RoomEventInfoViewModel\n*L\n15#1:29\n15#1:30,2\n*E\n"})
public final class RoomEventInfoViewModel extends EventViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: isCanCreate$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isCanCreate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    private final OooO0O0<EventModel> eventInfoPager = new OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.RoomEventInfoViewModel$eventInfoPager$1", f = "RoomEventInfoViewModel.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super OooO<EventModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24127OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f24129OooO0o0;

        /* JADX INFO: renamed from: com.yalla.yalla.module.event.vm.RoomEventInfoViewModel$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0304OooO00o extends Lambda implements Function1<EventModel, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0304OooO00o f24130OooO0Oo = new C0304OooO00o();

            public C0304OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(EventModel eventModel) {
                EventModel event = eventModel;
                Intrinsics.checkNotNullParameter(event, "event");
                long id = event.getId();
                o0OO00o0 o0oo00o0OooOo0O = o000OOo.OooO00o().OooOo0O();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                return Boolean.valueOf(o0oo00o0OooOo0O.OooO0O0(3, ((Number) OooO0OO.OooO0O0()).longValue(), String.valueOf(id)) != null);
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = RoomEventInfoViewModel.this.new OooO00o(continuation);
            oooO00o.f24129OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super OooO<EventModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<EventModel> eventList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24127OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f24129OooO0o0 != 1) {
                    return new OooO(null, true, false);
                }
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                this.f24127OooO0Oo = 1;
                String strOooO0O0 = o000OOo0.OooO0O0("/Webservers/Event/GetListByRoom");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0O0, "url", strOooO0O0, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "roomid");
                obj = OooOOO.OooO0Oo(new EventRepo$getRoomEvent$$inlined$call$1(o0o0oooOooO00o, null), this);
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
            RoomEventListModel roomEventListModel = (RoomEventListModel) apiResult.getData();
            List<EventModel> eventList2 = roomEventListModel != null ? roomEventListModel.getEventList() : null;
            RoomEventInfoViewModel roomEventInfoViewModel = RoomEventInfoViewModel.this;
            roomEventInfoViewModel.updateTimeDivision(eventList2);
            RoomEventListModel roomEventListModel2 = (RoomEventListModel) apiResult.getData();
            roomEventInfoViewModel.setCanCreate(roomEventListModel2 != null ? roomEventListModel2.getIsCanCreate() : false);
            RoomEventListModel roomEventListModel3 = (RoomEventListModel) apiResult.getData();
            if (roomEventListModel3 != null && (eventList = roomEventListModel3.getEventList()) != null) {
                Boxing.boxBoolean(CollectionsKt.removeAll((List) eventList, (Function1) C0304OooO00o.f24130OooO0Oo));
            }
            RoomEventListModel roomEventListModel4 = (RoomEventListModel) apiResult.getData();
            return ApiResult.toPagingLoadResource$default(apiResult, roomEventListModel4 != null ? roomEventListModel4.getEventList() : null, false, 2, null);
        }
    }

    @NotNull
    public final OooO0O0<EventModel> getEventInfoPager() {
        return this.eventInfoPager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isCanCreate() {
        return ((Boolean) this.isCanCreate.getValue()).booleanValue();
    }

    public final void setCanCreate(boolean z) {
        this.isCanCreate.setValue(Boolean.valueOf(z));
    }
}
