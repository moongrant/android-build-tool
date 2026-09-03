package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.RoomEventRepo$getRoomEventHistory$$inlined$call$1;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO;
import p143o00Oo000.OooO0O0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/module/event/vm/RoomEventHistoryViewModel;", "Lo0Oo00oO/o0O0O00;", "Lcom/yalla/yalla/model/event/EventModel;", "", "lastNodeTime", "Lkotlin/Pair;", "", "filterMarkTimeNode", "Ljava/lang/String;", "Lo00Oo000/OooO0O0;", "eventHistoryPager", "Lo00Oo000/OooO0O0;", "getEventHistoryPager", "()Lo00Oo000/OooO0O0;", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomEventHistoryViewModel extends o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    private String lastNodeTime = "";

    @NotNull
    private final OooO0O0<EventModel> eventHistoryPager = new OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.RoomEventHistoryViewModel$eventHistoryPager$1", f = "RoomEventHistoryViewModel.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nRoomEventHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEventHistoryViewModel.kt\ncom/yalla/yalla/module/event/vm/RoomEventHistoryViewModel$eventHistoryPager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1864#2,3:39\n*S KotlinDebug\n*F\n+ 1 RoomEventHistoryViewModel.kt\ncom/yalla/yalla/module/event/vm/RoomEventHistoryViewModel$eventHistoryPager$1\n*L\n19#1:39,3\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super OooO<EventModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24124OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f24126OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = RoomEventHistoryViewModel.this.new OooO00o(continuation);
            oooO00o.f24126OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super OooO<EventModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24124OooO0Oo;
            RoomEventHistoryViewModel roomEventHistoryViewModel = RoomEventHistoryViewModel.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f24126OooO0o0;
                if (i2 == 1) {
                    roomEventHistoryViewModel.lastNodeTime = "";
                }
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0();
                this.f24124OooO0Oo = 1;
                String strOooO0O0 = o000OOo0.OooO0O0("/Webservers/Event/GetHistoryList");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0O0, "url", strOooO0O0, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(jOooO0o0), "roomid");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageIndex");
                obj = OooOOO.OooO0Oo(new RoomEventRepo$getRoomEventHistory$$inlined$call$1(o0o0oooOooO00o, null), this);
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
        String strOooO0OO = o0000oo.OooO0OO(eventModel.getEventStartTime(), "dd/MM yyyy");
        if (Intrinsics.areEqual(strOooO0OO, str)) {
            return new Pair<>(Boolean.FALSE, str);
        }
        eventModel.setNewTimeNode(true);
        return new Pair<>(Boolean.TRUE, strOooO0OO);
    }

    @NotNull
    public final OooO0O0<EventModel> getEventHistoryPager() {
        return this.eventHistoryPager;
    }
}
