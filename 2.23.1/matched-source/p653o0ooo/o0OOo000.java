package p653o0ooo;

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
import p416o0Oo0oO.oO0OOo0o;
import p417o0Oo0oO0.o00Oo0;
import p474o0OoooOO.oo0oO0;
import p482o0o000O.o00oO0o;
import p565o0oOo000.o000OOo;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOo000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OOo000 f58086OooO0Oo = new o0OOo000();

    public o0OOo000() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00oO0o o00oo0o2 = OooO00o.f24525OooO0oO;
        h0.OooO0OO("102231", MapsKt.mapOf(new Pair("type", Integer.valueOf(!o00oo0o2.OooOO0() ? 1 : 0))));
        if (OooO0O0.f24541OoooOOO.OooO00o().OooOO0o() && !o00oo0o2.OooO()) {
            o000O00.OooO00o(o000OOo.request_permission_open_apply_mic);
        } else if (o00oo0o2.OooOO0()) {
            Context context = o000O00O.f13430OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                o000O o000o = new o000O(activityOooO0O0);
                o000o.OooOOoo(o000OOo.close_apply_mic_confirm_tip);
                o000o.OooOo0O(o0OOO00.f58082OooO0Oo);
                o000o.OooOOOO(o000OOo.Turn_Off);
                o000o.OooOo0(o0OOO0.f58081OooO0Oo);
                o000o.OooOO0o();
            }
        } else {
            oO0OOo0o oo0ooo0oOooO0o0 = o00Oo0.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            if (oo0ooo0oOooO0o0.OooO0O0("roomFirstOpenApplyMic" + oo0oO0.OooOOo0().getValue(), true)) {
                Context context2 = o000O00O.f13430OooO00o;
                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O1 != null) {
                    o000O o000o2 = new o000O(activityOooO0O1);
                    o000o2.OooOo00(o0000.OooO0OO(o000OOo.first_open_apply_mic_tip));
                    o000o2.OooOo0O(o0OOO0OO.f58083OooO0Oo);
                    o000o2.OooOOOo(o0000.OooO0OO(o000OOo.Turn_On));
                    o000o2.OooOo0(o0OOOO00.f58084OooO0Oo);
                    o000o2.OooOO0(o0OOOO0o.f58085OooO0Oo);
                    o000o2.OooOO0o();
                }
            } else {
                OooO00o.f24537OooOo0.f48587OooO0O0.setValue(Boolean.FALSE);
                RoomMike.MicApplySwitchOpenRequest.Builder builderNewBuilder = RoomMike.MicApplySwitchOpenRequest.newBuilder();
                builderNewBuilder.setRoomId(OooO00o.f24524OooO0o0.OooO0o0());
                T value = oo0oO0.OooOOo0().getValue();
                Intrinsics.checkNotNull(value);
                builderNewBuilder.setUserId(((Number) value).longValue());
                builderNewBuilder.setOp(1);
                RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(1001106, builderNewBuilder.build().toByteArray());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
