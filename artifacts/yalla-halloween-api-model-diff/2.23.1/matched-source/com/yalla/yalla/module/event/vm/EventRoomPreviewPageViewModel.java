package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.EventRepo$getRoomEvent$$inlined$call$1;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomEventListModel;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.ArrayList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;
import p409o0Oo0Oo.o00O0OO0;
import p410o0Oo0Oo0.o00O0O;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventRoomPreviewPageViewModel;", "Lcom/yalla/yalla/module/event/vm/EventViewModel;", "Lo00o00oO/o000;", "Lcom/yalla/yalla/model/event/EventModel;", "eventRoomPreviewPager", "Lo00o00oO/o000;", "getEventRoomPreviewPager", "()Lo00o00oO/o000;", "", ContributionFragment.ARG_1, "<init>", "(J)V", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class EventRoomPreviewPageViewModel extends EventViewModel {
    public static final int $stable = 8;

    @NotNull
    private final o000<EventModel> eventRoomPreviewPager;

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel$eventRoomPreviewPager$1", f = "EventRoomPreviewPageViewModel.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<EventModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23639OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f23640OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f23641OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EventRoomPreviewPageViewModel f23642OooO0oO;

        /* JADX INFO: renamed from: com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0301OooO00o extends Lambda implements Function1<EventModel, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final C0301OooO00o f23643OooO0Oo = new C0301OooO00o();

            public C0301OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(EventModel eventModel) {
                EventModel event = eventModel;
                Intrinsics.checkNotNullParameter(event, "event");
                long id = event.getId();
                o00O0OO0 o00o0oo0OooOo0o = o00O0O.OooO00o().OooOo0o();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                return Boolean.valueOf(o00o0oo0OooOo0o.OooO0O0(3, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), String.valueOf(id)) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f23640OooO0o = j;
            this.f23642OooO0oO = eventRoomPreviewPageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f23640OooO0o, this.f23642OooO0oO, continuation);
            oooO00o.f23641OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<EventModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<EventModel> arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f23639OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f23641OooO0o0 != 1) {
                    return new o000Oo0(null, true, false);
                }
                this.f23639OooO0Oo = 1;
                String strOooO0O0 = oo000o.OooO0O0("/Webservers/Event/GetListByRoom");
                o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0O0, "url", strOooO0O0, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f23640OooO0o), "roomid");
                obj = OooOOO.OooO0Oo(new EventRepo$getRoomEvent$$inlined$call$1(o0oooooOooO00o, null), this);
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
            if (roomEventListModel == null || (arrayList = roomEventListModel.getEventList()) == null) {
                arrayList = new ArrayList<>();
            }
            CollectionsKt.removeAll((List) arrayList, (Function1) C0301OooO00o.f23643OooO0Oo);
            this.f23642OooO0oO.updateTimeDivision(arrayList);
            return ApiResult.toPagingLoadResource$default(apiResult, arrayList, false, 2, null);
        }
    }

    public EventRoomPreviewPageViewModel() {
        this(0L, 1, null);
    }

    @NotNull
    public final o000<EventModel> getEventRoomPreviewPager() {
        return this.eventRoomPreviewPager;
    }

    public EventRoomPreviewPageViewModel(long j) {
        this.eventRoomPreviewPager = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(j, this, null));
    }

    public /* synthetic */ EventRoomPreviewPageViewModel(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
