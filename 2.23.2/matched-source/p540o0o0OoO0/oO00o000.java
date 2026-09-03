package p540o0o0OoO0;

import android.app.Activity;
import android.content.Context;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.code.android.util.o000O00O;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO00o000 f54955OooO0Oo = new oO00o000();

    public oO00o000() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
        o0oo0000.OooO00o.OooO0OO("102231", MapsKt.mapOf(new Pair("type", Integer.valueOf(!o0000ooVar.OooOO0() ? 1 : 0))));
        if (OooO0O0.f24533OoooOOO.OooO00o().OooOO0o() && !o0000ooVar.OooO()) {
            o000O00.OooO00o(o000000.request_permission_open_apply_mic);
        } else if (o0000ooVar.OooOO0()) {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                o000O o000o = new o000O(activityOooO0O0);
                o000o.OooOOoo(o000000.close_apply_mic_confirm_tip);
                o000o.OooOo0O(oO00OOOo.f54949OooO0Oo);
                o000o.OooOOOO(o000000.Turn_Off);
                o000o.OooOo0(oO00OOo0.f54950OooO0Oo);
                o000o.OooOO0o();
            }
        } else {
            oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (oo0ooo0oOooO0o0.OooO0O0("roomFirstOpenApplyMic" + o0O00oO0.OooOOo0().getValue(), true)) {
                Context context2 = o000O00O.f13421OooO00o;
                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O1 != null) {
                    o000O o000o2 = new o000O(activityOooO0O1);
                    o000o2.OooOo00(o0000.OooO0OO(o000000.first_open_apply_mic_tip));
                    o000o2.OooOo0O(oO00Oo00.f54952OooO0Oo);
                    o000o2.OooOOOo(o0000.OooO0OO(o000000.Turn_On));
                    o000o2.OooOo0(oO00Oo0.f54951OooO0Oo);
                    o000o2.OooOO0(oOOoOOO0.f55019OooO0Oo);
                    o000o2.OooOO0o();
                }
            } else {
                OooO00o.f24529OooOo0.f48501OooO0O0.setValue(Boolean.FALSE);
                RoomMike.MicApplySwitchOpenRequest.Builder builderNewBuilder = RoomMike.MicApplySwitchOpenRequest.newBuilder();
                builderNewBuilder.setRoomId(OooO00o.f24516OooO0o0.OooO0o0());
                T value = o0O00oO0.OooOOo0().getValue();
                Intrinsics.checkNotNull(value);
                builderNewBuilder.setUserId(((Number) value).longValue());
                builderNewBuilder.setOp(1);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(1001106, builderNewBuilder.build().toByteArray());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
