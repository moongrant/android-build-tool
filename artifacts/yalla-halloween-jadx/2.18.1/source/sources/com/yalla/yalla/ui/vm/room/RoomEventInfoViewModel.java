package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.app.base.model.RoomModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.RoomEventListModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p159o00OoOO.o000O00O;
import p520o0o0O0O0.Oooo0;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R+\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/RoomEventInfoViewModel;", "Lcom/yalla/yalla/ui/vm/event/EventViewModel;", "", "<set-?>", "isCanCreate$delegate", "Lo000oOoO/o0O00OO;", "isCanCreate", "()Z", "setCanCreate", "(Z)V", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/model/EventModel;", "eventInfoPager", "Lo0ooO00/o000O0;", "getEventInfoPager", "()Lo0ooO00/o000O0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomEventInfoViewModel extends EventViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: isCanCreate$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO isCanCreate = o0OOO00.OooO0Oo(Boolean.FALSE);

    @NotNull
    private final o000O0<EventModel> eventInfoPager = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomEventInfoViewModel$eventInfoPager$1", f = "RoomEventInfoViewModel.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<EventModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26098Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f26099Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = RoomEventInfoViewModel.this.new OooO00o(continuation);
            oooO00o.f26099Oooo0oO = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<EventModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26098Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f26099Oooo0oO != 1) {
                    return new o000OO0O(true, null, false);
                }
                Oooo0 oooo0 = Oooo0.f42257OooO00o;
                RoomModel roomModel = o000O00O.OooO().f32429Oooo0oO;
                long id = roomModel != null ? roomModel.getId() : 0L;
                this.f26098Oooo0o = 1;
                obj = oooo0.OooO0oO(id, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            RoomEventInfoViewModel roomEventInfoViewModel = RoomEventInfoViewModel.this;
            ApiResult apiResult = (ApiResult) obj;
            RoomEventListModel roomEventListModel = (RoomEventListModel) apiResult.getData();
            roomEventInfoViewModel.updateTimeDivision(roomEventListModel != null ? roomEventListModel.getEventList() : null);
            RoomEventListModel roomEventListModel2 = (RoomEventListModel) apiResult.getData();
            roomEventInfoViewModel.setCanCreate(roomEventListModel2 != null ? roomEventListModel2.getIsCanCreate() : false);
            RoomEventListModel roomEventListModel3 = (RoomEventListModel) apiResult.getData();
            return ApiResult.toPagingLoadResource$default(apiResult, roomEventListModel3 != null ? roomEventListModel3.getEventList() : null, false, 2, null);
        }
    }

    @NotNull
    public final o000O0<EventModel> getEventInfoPager() {
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
