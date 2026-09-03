package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.db.table.SquareEventRoom;
import com.yalla.yalla.model.SquareEventRoomModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p407o0Oo0Oo.o0OO00o0;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p544o0o0o00O.o0O0o00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEventRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRepo.kt\ncom/yalla/yalla/data/repository/EventRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n62#2:88\n62#2:90\n62#2:91\n62#2:92\n62#2:93\n62#2:94\n62#2:95\n62#2:96\n62#2:97\n62#2:98\n62#2:99\n62#2:100\n1#3:89\n*S KotlinDebug\n*F\n+ 1 EventRepo.kt\ncom/yalla/yalla/data/repository/EventRepo\n*L\n16#1:88\n24#1:90\n30#1:91\n33#1:92\n39#1:93\n42#1:94\n64#1:95\n68#1:96\n72#1:97\n77#1:98\n81#1:99\n85#1:100\n*E\n"})
public final class EventRepo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final EventRepo f22462OooO00o = new EventRepo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventRepo", f = "EventRepo.kt", i = {}, l = {88}, m = "getEventJoinRoom", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f22463OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22464OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22463OooO0Oo = obj;
            this.f22464OooO0o |= Integer.MIN_VALUE;
            return EventRepo.this.OooO00o(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super ApiResult<List<SquareEventRoomModel>>> continuation) {
        OooO00o oooO00o;
        List<SquareEventRoomModel> squareEventRoomModelList;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f22464OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f22464OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f22463OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f22464OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String url = oo000o.OooO0O0("/Webservers/Event/GetJoinRoomList");
            Intrinsics.checkNotNullParameter(url, "url");
            EventRepo$getEventJoinRoom$$inlined$call$1 eventRepo$getEventJoinRoom$$inlined$call$1 = new EventRepo$getEventJoinRoom$$inlined$call$1(new o0ooOOo(url, 0), null);
            oooO00o.f22464OooO0o = 1;
            objOooO0Oo = OooOOO.OooO0Oo(eventRepo$getEventJoinRoom$$inlined$call$1, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (apiResult.isSuccess() && (squareEventRoomModelList = (List) apiResult.getData()) != null) {
            Intrinsics.checkNotNullParameter(squareEventRoomModelList, "squareEventRoomModelList");
            for (SquareEventRoomModel squareEventRoomModel : squareEventRoomModelList) {
                o0OO00o0 o0oo00o0OooOo0O = o00Oo0.OooO00o().OooOo0O();
                Intrinsics.checkNotNullExpressionValue(o0oo00o0OooOo0O, "getSquareEventRoomDao(...)");
                long userId = squareEventRoomModel.getUserId();
                long roomId = squareEventRoomModel.getRoomId();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Long l = (Long) o0O00oO0.OooOOo0().getValue();
                long jLongValue = 0;
                SquareEventRoom squareEventRoomOooO0OO = o0oo00o0OooOo0O.OooO0OO(l == null ? 0L : l.longValue(), userId, roomId);
                if (squareEventRoomOooO0OO == null) {
                    squareEventRoomModel.setNewRoomEvent(true);
                    o0OO00o0 o0oo00o0OooOo0O2 = o00Oo0.OooO00o().OooOo0O();
                    SquareEventRoom squareEventRoom = new SquareEventRoom();
                    squareEventRoom.setMid(o0O0o00O.f55755OooO00o.OooO00o(Long.valueOf(squareEventRoomModel.getUserId())));
                    Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
                    if (l2 != null) {
                        Intrinsics.checkNotNull(l2);
                        jLongValue = l2.longValue();
                    }
                    squareEventRoom.setUserId(jLongValue);
                    squareEventRoom.setTargetId(squareEventRoomModel.getUserId());
                    squareEventRoom.setRoomId(squareEventRoomModel.getRoomId());
                    o0oo00o0OooOo0O2.OooO00o(squareEventRoom);
                } else {
                    long userId2 = squareEventRoomOooO0OO.getUserId();
                    Long l3 = (Long) o0O00oO0.OooOOo0().getValue();
                    if (l3 != null && userId2 == l3.longValue() && squareEventRoomOooO0OO.getTargetId() == squareEventRoomModel.getUserId() && squareEventRoomOooO0OO.getRoomId() == squareEventRoomModel.getRoomId() && squareEventRoomOooO0OO.getEventCreateTime() != squareEventRoomModel.getEventCreateTime()) {
                        squareEventRoomModel.setNewRoomEvent(true);
                    } else {
                        squareEventRoomModel.setNewRoomEvent(false);
                    }
                }
            }
        }
        return objOooO0Oo;
    }
}
