package p669oO0Oo;

import android.app.Activity;
import android.content.Context;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
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
import p157o00OoOO0.o0OO00O;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p475o0o000.o000000;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0o00O f60684OooO0Oo = new o0O0o00O();

    public o0O0o00O() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000000 o000000Var = OooO00o.f24979OooO0oO;
        o0OO000.OooO0O0("102231", MapsKt.mapOf(new Pair("type", Integer.valueOf(!o000000Var.OooOO0() ? 1 : 0))));
        if (OooO0O0.f24995OoooOOO.OooO00o().OooOO0o() && !o000000Var.OooO()) {
            o000O00O.OooO00o(oO00OOo0.request_permission_open_apply_mic);
        } else if (o000000Var.OooOO0()) {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
                o0oo00o2.OooOOoo(oO00OOo0.close_apply_mic_confirm_tip);
                o0oo00o2.OooOo0O(o0O0OO0.f60676OooO0Oo);
                o0oo00o2.OooOOOO(oO00OOo0.Turn_Off);
                o0oo00o2.OooOo0(o0O0OOO0.f60677OooO0Oo);
                o0oo00o2.OooOO0o();
            }
        } else {
            o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (o0o0o00OooO0o0.OooO0O0("roomFirstOpenApplyMic" + o000000O.OooOOo0().getValue(), true)) {
                Context context2 = o000O0.f10354OooO00o;
                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O1 != null) {
                    o0OO00O o0oo00o3 = new o0OO00O(activityOooO0O1);
                    o0oo00o3.OooOo00(o0000.OooO0OO(oO00OOo0.first_open_apply_mic_tip));
                    o0oo00o3.OooOo0O(o0O0OOOo.f60678OooO0Oo);
                    o0oo00o3.OooOOOo(o0000.OooO0OO(oO00OOo0.Turn_On));
                    o0oo00o3.OooOo0(oo0OOoo.f60811OooO0Oo);
                    o0oo00o3.OooOO0(o0O0o000.f60683OooO0Oo);
                    o0oo00o3.OooOO0o();
                }
            } else {
                OooO00o.f24991OooOo0.f47432OooO0O0.setValue(Boolean.FALSE);
                RoomMike.MicApplySwitchOpenRequest.Builder builderNewBuilder = RoomMike.MicApplySwitchOpenRequest.newBuilder();
                builderNewBuilder.setRoomId(OooO00o.f24978OooO0o0.OooO0o0());
                T value = o000000O.OooOOo0().getValue();
                Intrinsics.checkNotNull(value);
                builderNewBuilder.setUserId(((Number) value).longValue());
                builderNewBuilder.setOp(1);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(1001106, builderNewBuilder.build().toByteArray());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
