package p477o0o000O;

import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;
import p475o0o000.o000000;
import p533o0o0Oo0.oo0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseLoginRoom$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRoomMicMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMicMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMicMsgProcessor$parseLoginRoom$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,451:1\n1#2:452\n*E\n"})
public final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLoginInformation f47618OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(RoomLoginInformation roomLoginInformation, Continuation<? super o00Oo0> continuation) {
        super(2, continuation);
        this.f47618OooO0Oo = roomLoginInformation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Oo0(this.f47618OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String topinapplylist;
        RoomUserInfoModel newUser;
        MutableStateFlow<Long> userId;
        RoomUserInfoModel newUser2;
        MutableStateFlow<Long> userId2;
        RoomUserInfoModel newUser3;
        MutableStateFlow<Long> userId3;
        RoomUserInfoModel newUser4;
        MutableStateFlow<Long> userId4;
        RoomUserInfoModel newUser5;
        MutableStateFlow<Long> userId5;
        RoomUserInfoModel newUser6;
        MutableStateFlow<Long> userId6;
        RoomUserInfoModel newUser7;
        MutableStateFlow<Long> userId7;
        RoomUserInfoModel newUser8;
        MutableStateFlow<Long> userId8;
        RoomUserInfoModel newUser9;
        MutableStateFlow<Long> userId9;
        RoomUserInfoModel newUser10;
        MutableStateFlow<Long> userId10;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o000000 o000000Var = OooO00o.f24979OooO0oO;
        RoomLoginInformation roomLoginInformation = this.f47618OooO0Oo;
        RoomLoginInformation.RoomBean room = roomLoginInformation.getRoom();
        o000000Var.f47379OooOO0.setValue(Boolean.valueOf(room != null && room.getMictype() == 1));
        ArrayList arrayList = OooO00o.f24973OooO00o;
        RoomLoginInformation.MIC micone = roomLoginInformation.getMicone();
        Object obj2 = null;
        OooO00o.OooO0o(micone != null ? micone.getNewUser() : null);
        RoomLoginInformation.MIC mictwo = roomLoginInformation.getMictwo();
        OooO00o.OooO0o(mictwo != null ? mictwo.getNewUser() : null);
        RoomLoginInformation.MIC micthree = roomLoginInformation.getMicthree();
        OooO00o.OooO0o(micthree != null ? micthree.getNewUser() : null);
        RoomLoginInformation.MIC micfour = roomLoginInformation.getMicfour();
        OooO00o.OooO0o(micfour != null ? micfour.getNewUser() : null);
        RoomLoginInformation.MIC micfive = roomLoginInformation.getMicfive();
        OooO00o.OooO0o(micfive != null ? micfive.getNewUser() : null);
        RoomLoginInformation.MIC micone2 = roomLoginInformation.getMicone();
        boolean zOooO00o = com.code.android.util.o000000.OooO00o(micone2 != null ? Boxing.boxInt(micone2.getState()) : null);
        RoomLoginInformation.MIC micone3 = roomLoginInformation.getMicone();
        long jLongValue = 0;
        o000000Var.OooOOo0((micone3 == null || (newUser10 = micone3.getNewUser()) == null || (userId10 = newUser10.getUserId()) == null) ? 0L : userId10.getValue().longValue(), 0, zOooO00o);
        RoomLoginInformation.MIC mictwo2 = roomLoginInformation.getMictwo();
        boolean zOooO00o2 = com.code.android.util.o000000.OooO00o(mictwo2 != null ? Boxing.boxInt(mictwo2.getState()) : null);
        RoomLoginInformation.MIC mictwo3 = roomLoginInformation.getMictwo();
        o000000Var.OooOOo0((mictwo3 == null || (newUser9 = mictwo3.getNewUser()) == null || (userId9 = newUser9.getUserId()) == null) ? 0L : userId9.getValue().longValue(), 1, zOooO00o2);
        RoomLoginInformation.MIC micthree2 = roomLoginInformation.getMicthree();
        boolean zOooO00o3 = com.code.android.util.o000000.OooO00o(micthree2 != null ? Boxing.boxInt(micthree2.getState()) : null);
        RoomLoginInformation.MIC micthree3 = roomLoginInformation.getMicthree();
        o000000Var.OooOOo0((micthree3 == null || (newUser8 = micthree3.getNewUser()) == null || (userId8 = newUser8.getUserId()) == null) ? 0L : userId8.getValue().longValue(), 2, zOooO00o3);
        RoomLoginInformation.MIC micfour2 = roomLoginInformation.getMicfour();
        boolean zOooO00o4 = com.code.android.util.o000000.OooO00o(micfour2 != null ? Boxing.boxInt(micfour2.getState()) : null);
        RoomLoginInformation.MIC micfour3 = roomLoginInformation.getMicfour();
        o000000Var.OooOOo0((micfour3 == null || (newUser7 = micfour3.getNewUser()) == null || (userId7 = newUser7.getUserId()) == null) ? 0L : userId7.getValue().longValue(), 3, zOooO00o4);
        RoomLoginInformation.MIC micfive2 = roomLoginInformation.getMicfive();
        boolean zOooO00o5 = com.code.android.util.o000000.OooO00o(micfive2 != null ? Boxing.boxInt(micfive2.getState()) : null);
        RoomLoginInformation.MIC micfive3 = roomLoginInformation.getMicfive();
        o000000Var.OooOOo0((micfive3 == null || (newUser6 = micfive3.getNewUser()) == null || (userId6 = newUser6.getUserId()) == null) ? 0L : userId6.getValue().longValue(), 4, zOooO00o5);
        if (o000000Var.OooOO0o()) {
            RoomLoginInformation.MIC micsix = roomLoginInformation.getMicsix();
            OooO00o.OooO0o(micsix != null ? micsix.getNewUser() : null);
            RoomLoginInformation.MIC micseven = roomLoginInformation.getMicseven();
            OooO00o.OooO0o(micseven != null ? micseven.getNewUser() : null);
            RoomLoginInformation.MIC miceight = roomLoginInformation.getMiceight();
            OooO00o.OooO0o(miceight != null ? miceight.getNewUser() : null);
            RoomLoginInformation.MIC micnine = roomLoginInformation.getMicnine();
            OooO00o.OooO0o(micnine != null ? micnine.getNewUser() : null);
            RoomLoginInformation.MIC micten = roomLoginInformation.getMicten();
            OooO00o.OooO0o(micten != null ? micten.getNewUser() : null);
            RoomLoginInformation.MIC micsix2 = roomLoginInformation.getMicsix();
            boolean zOooO00o6 = com.code.android.util.o000000.OooO00o(micsix2 != null ? Boxing.boxInt(micsix2.getState()) : null);
            RoomLoginInformation.MIC micsix3 = roomLoginInformation.getMicsix();
            o000000Var.OooOOo0((micsix3 == null || (newUser5 = micsix3.getNewUser()) == null || (userId5 = newUser5.getUserId()) == null) ? 0L : userId5.getValue().longValue(), 5, zOooO00o6);
            RoomLoginInformation.MIC micseven2 = roomLoginInformation.getMicseven();
            boolean zOooO00o7 = com.code.android.util.o000000.OooO00o(micseven2 != null ? Boxing.boxInt(micseven2.getState()) : null);
            RoomLoginInformation.MIC micseven3 = roomLoginInformation.getMicseven();
            o000000Var.OooOOo0((micseven3 == null || (newUser4 = micseven3.getNewUser()) == null || (userId4 = newUser4.getUserId()) == null) ? 0L : userId4.getValue().longValue(), 6, zOooO00o7);
            RoomLoginInformation.MIC miceight2 = roomLoginInformation.getMiceight();
            boolean zOooO00o8 = com.code.android.util.o000000.OooO00o(miceight2 != null ? Boxing.boxInt(miceight2.getState()) : null);
            RoomLoginInformation.MIC miceight3 = roomLoginInformation.getMiceight();
            o000000Var.OooOOo0((miceight3 == null || (newUser3 = miceight3.getNewUser()) == null || (userId3 = newUser3.getUserId()) == null) ? 0L : userId3.getValue().longValue(), 7, zOooO00o8);
            RoomLoginInformation.MIC micnine2 = roomLoginInformation.getMicnine();
            boolean zOooO00o9 = com.code.android.util.o000000.OooO00o(micnine2 != null ? Boxing.boxInt(micnine2.getState()) : null);
            RoomLoginInformation.MIC micnine3 = roomLoginInformation.getMicnine();
            o000000Var.OooOOo0((micnine3 == null || (newUser2 = micnine3.getNewUser()) == null || (userId2 = newUser2.getUserId()) == null) ? 0L : userId2.getValue().longValue(), 8, zOooO00o9);
            RoomLoginInformation.MIC micten2 = roomLoginInformation.getMicten();
            boolean zOooO00o10 = com.code.android.util.o000000.OooO00o(micten2 != null ? Boxing.boxInt(micten2.getState()) : null);
            RoomLoginInformation.MIC micten3 = roomLoginInformation.getMicten();
            if (micten3 != null && (newUser = micten3.getNewUser()) != null && (userId = newUser.getUserId()) != null) {
                jLongValue = userId.getValue().longValue();
            }
            o000000Var.OooOOo0(jLongValue, 9, zOooO00o10);
        }
        RoomLoginInformation.RoomBean room2 = roomLoginInformation.getRoom();
        o000000Var.f47381OooOO0o.setValue(Boolean.valueOf(room2 != null && room2.getMicapplyopen()));
        RoomLoginInformation.RoomBean room3 = roomLoginInformation.getRoom();
        if (room3 == null || (topinapplylist = room3.getTopinapplylist()) == null) {
            topinapplylist = "";
        }
        o000000Var.OooOOOO(topinapplylist);
        RoomLoginInformation.RoomBean room4 = roomLoginInformation.getRoom();
        o000000Var.OooOOO(room4 != null ? room4.getApplylistlen() : -1);
        OooO00o.f24978OooO0o0.f47493OooO0oo.setValue(Boolean.valueOf(roomLoginInformation.getNoisereduce()));
        for (Object obj3 : o000000Var.f47380OooOO0O) {
            long jLongValue2 = ((oo0O) obj3).f54838OooO0OO.getValue().longValue();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && jLongValue2 == l.longValue()) {
                obj2 = obj3;
                break;
            }
        }
        OooO00o.f24979OooO0oO.f47371OooO00o.setValue(Boxing.boxBoolean(((oo0O) obj2) != null));
        return Unit.INSTANCE;
    }
}
