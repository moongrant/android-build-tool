package p485o0o000oO;

import com.code.android.util.o000000;
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
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;
import p541o0o0OoOO.oo00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseLoginRoom$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRoomMicMsgProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMicMsgProcessor.kt\ncom/yalla/yalla/service/room/processor/RoomMicMsgProcessor$parseLoginRoom$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,451:1\n1#2:452\n*E\n"})
public final class o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomLoginInformation f48665OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(RoomLoginInformation roomLoginInformation, Continuation<? super o00> continuation) {
        super(2, continuation);
        this.f48665OooO0Oo = roomLoginInformation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00(this.f48665OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
        RoomLoginInformation roomLoginInformation = this.f48665OooO0Oo;
        RoomLoginInformation.RoomBean room = roomLoginInformation.getRoom();
        o0000ooVar.f48584OooOO0.setValue(Boolean.valueOf(room != null && room.getMictype() == 1));
        ArrayList arrayList = OooO00o.f24511OooO00o;
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
        boolean zOooO00o = o000000.OooO00o(micone2 != null ? Boxing.boxInt(micone2.getState()) : null);
        RoomLoginInformation.MIC micone3 = roomLoginInformation.getMicone();
        long jLongValue = 0;
        o0000ooVar.OooOOo0((micone3 == null || (newUser10 = micone3.getNewUser()) == null || (userId10 = newUser10.getUserId()) == null) ? 0L : userId10.getValue().longValue(), 0, zOooO00o);
        RoomLoginInformation.MIC mictwo2 = roomLoginInformation.getMictwo();
        boolean zOooO00o2 = o000000.OooO00o(mictwo2 != null ? Boxing.boxInt(mictwo2.getState()) : null);
        RoomLoginInformation.MIC mictwo3 = roomLoginInformation.getMictwo();
        o0000ooVar.OooOOo0((mictwo3 == null || (newUser9 = mictwo3.getNewUser()) == null || (userId9 = newUser9.getUserId()) == null) ? 0L : userId9.getValue().longValue(), 1, zOooO00o2);
        RoomLoginInformation.MIC micthree2 = roomLoginInformation.getMicthree();
        boolean zOooO00o3 = o000000.OooO00o(micthree2 != null ? Boxing.boxInt(micthree2.getState()) : null);
        RoomLoginInformation.MIC micthree3 = roomLoginInformation.getMicthree();
        o0000ooVar.OooOOo0((micthree3 == null || (newUser8 = micthree3.getNewUser()) == null || (userId8 = newUser8.getUserId()) == null) ? 0L : userId8.getValue().longValue(), 2, zOooO00o3);
        RoomLoginInformation.MIC micfour2 = roomLoginInformation.getMicfour();
        boolean zOooO00o4 = o000000.OooO00o(micfour2 != null ? Boxing.boxInt(micfour2.getState()) : null);
        RoomLoginInformation.MIC micfour3 = roomLoginInformation.getMicfour();
        o0000ooVar.OooOOo0((micfour3 == null || (newUser7 = micfour3.getNewUser()) == null || (userId7 = newUser7.getUserId()) == null) ? 0L : userId7.getValue().longValue(), 3, zOooO00o4);
        RoomLoginInformation.MIC micfive2 = roomLoginInformation.getMicfive();
        boolean zOooO00o5 = o000000.OooO00o(micfive2 != null ? Boxing.boxInt(micfive2.getState()) : null);
        RoomLoginInformation.MIC micfive3 = roomLoginInformation.getMicfive();
        o0000ooVar.OooOOo0((micfive3 == null || (newUser6 = micfive3.getNewUser()) == null || (userId6 = newUser6.getUserId()) == null) ? 0L : userId6.getValue().longValue(), 4, zOooO00o5);
        if (o0000ooVar.OooOO0o()) {
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
            boolean zOooO00o6 = o000000.OooO00o(micsix2 != null ? Boxing.boxInt(micsix2.getState()) : null);
            RoomLoginInformation.MIC micsix3 = roomLoginInformation.getMicsix();
            o0000ooVar.OooOOo0((micsix3 == null || (newUser5 = micsix3.getNewUser()) == null || (userId5 = newUser5.getUserId()) == null) ? 0L : userId5.getValue().longValue(), 5, zOooO00o6);
            RoomLoginInformation.MIC micseven2 = roomLoginInformation.getMicseven();
            boolean zOooO00o7 = o000000.OooO00o(micseven2 != null ? Boxing.boxInt(micseven2.getState()) : null);
            RoomLoginInformation.MIC micseven3 = roomLoginInformation.getMicseven();
            o0000ooVar.OooOOo0((micseven3 == null || (newUser4 = micseven3.getNewUser()) == null || (userId4 = newUser4.getUserId()) == null) ? 0L : userId4.getValue().longValue(), 6, zOooO00o7);
            RoomLoginInformation.MIC miceight2 = roomLoginInformation.getMiceight();
            boolean zOooO00o8 = o000000.OooO00o(miceight2 != null ? Boxing.boxInt(miceight2.getState()) : null);
            RoomLoginInformation.MIC miceight3 = roomLoginInformation.getMiceight();
            o0000ooVar.OooOOo0((miceight3 == null || (newUser3 = miceight3.getNewUser()) == null || (userId3 = newUser3.getUserId()) == null) ? 0L : userId3.getValue().longValue(), 7, zOooO00o8);
            RoomLoginInformation.MIC micnine2 = roomLoginInformation.getMicnine();
            boolean zOooO00o9 = o000000.OooO00o(micnine2 != null ? Boxing.boxInt(micnine2.getState()) : null);
            RoomLoginInformation.MIC micnine3 = roomLoginInformation.getMicnine();
            o0000ooVar.OooOOo0((micnine3 == null || (newUser2 = micnine3.getNewUser()) == null || (userId2 = newUser2.getUserId()) == null) ? 0L : userId2.getValue().longValue(), 8, zOooO00o9);
            RoomLoginInformation.MIC micten2 = roomLoginInformation.getMicten();
            boolean zOooO00o10 = o000000.OooO00o(micten2 != null ? Boxing.boxInt(micten2.getState()) : null);
            RoomLoginInformation.MIC micten3 = roomLoginInformation.getMicten();
            if (micten3 != null && (newUser = micten3.getNewUser()) != null && (userId = newUser.getUserId()) != null) {
                jLongValue = userId.getValue().longValue();
            }
            o0000ooVar.OooOOo0(jLongValue, 9, zOooO00o10);
        }
        RoomLoginInformation.RoomBean room2 = roomLoginInformation.getRoom();
        o0000ooVar.f48586OooOO0o.setValue(Boolean.valueOf(room2 != null && room2.getMicapplyopen()));
        RoomLoginInformation.RoomBean room3 = roomLoginInformation.getRoom();
        if (room3 == null || (topinapplylist = room3.getTopinapplylist()) == null) {
            topinapplylist = "";
        }
        o0000ooVar.OooOOOO(topinapplylist);
        RoomLoginInformation.RoomBean room4 = roomLoginInformation.getRoom();
        o0000ooVar.OooOOO(room4 != null ? room4.getApplylistlen() : -1);
        OooO00o.f24516OooO0o0.f48466OooO0oo.setValue(Boolean.valueOf(roomLoginInformation.getNoisereduce()));
        for (Object obj3 : o0000ooVar.f48585OooOO0O) {
            long jLongValue2 = ((oo00) obj3).f55307OooO0OO.getValue().longValue();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && jLongValue2 == l.longValue()) {
                obj2 = obj3;
                break;
            }
        }
        OooO00o.f24517OooO0oO.f48576OooO00o.setValue(Boxing.boxBoolean(((oo00) obj2) != null));
        return Unit.INSTANCE;
    }
}
