package com.yalla.yalla.ui.vm.event;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.RoomEventListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p520o0o0O0O0.Oooo0;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/vm/event/EventRoomPreviewPageViewModel;", "Lcom/yalla/yalla/ui/vm/event/EventViewModel;", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/model/EventModel;", "eventRoomPreviewPager", "Lo0ooO00/o000O0;", "getEventRoomPreviewPager", "()Lo0ooO00/o000O0;", "", ContributionFragment.ARG_1, "<init>", "(J)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EventRoomPreviewPageViewModel extends EventViewModel {
    public static final int $stable = 8;

    @NotNull
    private final o000O0<EventModel> eventRoomPreviewPager;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventRoomPreviewPageViewModel$eventRoomPreviewPager$1", f = "EventRoomPreviewPageViewModel.kt", i = {}, l = {12}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<EventModel>>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventRoomPreviewPageViewModel f25434Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25435Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f25436Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f25437Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25437Oooo0oo = j;
            this.f25434Oooo = eventRoomPreviewPageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25437Oooo0oo, this.f25434Oooo, continuation);
            oooO00o.f25436Oooo0oO = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<EventModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<EventModel> arrayList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25435Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f25436Oooo0oO != 1) {
                    return new o000OO0O(true, null, false);
                }
                Oooo0 oooo0 = Oooo0.f42257OooO00o;
                long j = this.f25437Oooo0oo;
                this.f25435Oooo0o = 1;
                obj = oooo0.OooO0oO(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel = this.f25434Oooo;
            ApiResult apiResult = (ApiResult) obj;
            RoomEventListModel roomEventListModel = (RoomEventListModel) apiResult.getData();
            if (roomEventListModel == null || (arrayList = roomEventListModel.getEventList()) == null) {
                arrayList = new ArrayList<>();
            }
            eventRoomPreviewPageViewModel.updateTimeDivision(arrayList);
            return ApiResult.toPagingLoadResource$default(apiResult, arrayList, false, 2, null);
        }
    }

    public EventRoomPreviewPageViewModel() {
        this(0L, 1, null);
    }

    public EventRoomPreviewPageViewModel(long j) {
        this.eventRoomPreviewPager = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(j, this, null));
    }

    @NotNull
    public final o000O0<EventModel> getEventRoomPreviewPager() {
        return this.eventRoomPreviewPager;
    }

    public /* synthetic */ EventRoomPreviewPageViewModel(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
