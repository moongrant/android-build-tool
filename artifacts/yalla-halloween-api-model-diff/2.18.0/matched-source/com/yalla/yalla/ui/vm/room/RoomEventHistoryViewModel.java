package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO.o000O00O;
import p522o0o0O0O0.o000OOo0;
import p623o0oo0o0o.oo00o;
import p632o0ooO00.o000O0O0;
import p632o0ooO00.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/RoomEventHistoryViewModel;", "Lo00OO/OooO00o;", "Lcom/yalla/yalla/model/EventModel;", "", "lastNodeTime", "Lkotlin/Pair;", "", "filterMarkTimeNode", "Ljava/lang/String;", "Lo0ooO00/o000O0Oo;", "eventHistoryPager", "Lo0ooO00/o000O0Oo;", "getEventHistoryPager", "()Lo0ooO00/o000O0Oo;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomEventHistoryViewModel extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private String lastNodeTime = "";

    @NotNull
    private final o000O0Oo<EventModel> eventHistoryPager = new o000O0Oo<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomEventHistoryViewModel$eventHistoryPager$1", f = "RoomEventHistoryViewModel.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000O0O0<EventModel>>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f26114Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ int f26116OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = RoomEventHistoryViewModel.this.new OooO00o(continuation);
            oooO00o.f26116OoooO00 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000O0O0<EventModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26114Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f26116OoooO00;
                if (i2 == 1) {
                    RoomEventHistoryViewModel.this.lastNodeTime = "";
                }
                o000OOo0 o000ooo1 = o000OOo0.f42613OooO00o;
                long id = o000O00O.OooO().f32452OoooO00.getId();
                this.f26114Oooo = 1;
                obj = o000ooo1.OooO00o(id, i2, this);
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
            List list = (List) apiResult.getData();
            if (list != null) {
                RoomEventHistoryViewModel roomEventHistoryViewModel = RoomEventHistoryViewModel.this;
                int i3 = 0;
                for (Object obj2 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Pair pairFilterMarkTimeNode = roomEventHistoryViewModel.filterMarkTimeNode((EventModel) obj2, roomEventHistoryViewModel.lastNodeTime);
                    roomEventHistoryViewModel.lastNodeTime = (String) pairFilterMarkTimeNode.getSecond();
                    if (((Boolean) pairFilterMarkTimeNode.getFirst()).booleanValue() && i3 > 0) {
                        ((EventModel) list.get(i3 - 1)).setHasNextTimeNode(true);
                    }
                    i3 = i4;
                }
            }
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Boolean, String> filterMarkTimeNode(EventModel eventModel, String str) {
        String strOooO0OO = oo00o.f48643OooO00o.OooO0OO(eventModel.getEventStartTime(), "dd/MM yyyy");
        if (Intrinsics.areEqual(strOooO0OO, str)) {
            return new Pair<>(Boolean.FALSE, str);
        }
        eventModel.setNewTimeNode(true);
        return new Pair<>(Boolean.TRUE, strOooO0OO);
    }

    @NotNull
    public final o000O0Oo<EventModel> getEventHistoryPager() {
        return this.eventHistoryPager;
    }
}
