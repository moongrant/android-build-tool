package p541o0o0Oo0o;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p205o00o0o0o.o000O0o;
import p565o0oOo000.o000OOo;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f54745OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54746OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(int i, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f54745OooO0Oo = mixedRoomActivity;
        this.f54746OooO0o0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO0O0.OooO00o oooO00o = OooO0O0.f24541OoooOOO;
        boolean zOooOOO = oooO00o.OooO00o().OooOOO();
        int i = this.f54746OooO0o0;
        MixedRoomActivity mixedRoomActivity = this.f54745OooO0Oo;
        if (zOooOOO || (oooO00o.OooO00o().OooOO0o() && Intrinsics.areEqual(oooO00o.OooO00o().f24569OooOoOO.getValue(), Boolean.TRUE))) {
            o000O0o o000o0o2 = new o000O0o(mixedRoomActivity, null);
            o000o0o2.OooOOO0(o0000.OooO0OO(o000OOo.host_take_mic));
            o000o0o2.OooOOO0(o0000.OooO0OO(o000OOo.host_lock_mic));
            o000o0o2.OooOOOo(new o0O0o000(i, mixedRoomActivity));
            o000o0o2.OooOO0o();
        } else {
            if (oooO00o.OooO00o().OooOOO0() && !((Boolean) OooO00o.f24524OooO0o0.f48427OooO0o0.getValue()).booleanValue()) {
                h0.OooO0O0("302013");
                Integer value = oooO00o.OooO00o().f24560OooOOo0.getValue();
                if (value == null) {
                    value = 0;
                }
                int iIntValue = value.intValue();
                String strOooO00o = iIntValue > 0 ? o0000O.OooO00o(o0000.OooO0OO(o000OOo.title_Room_onMic), String.valueOf(iIntValue)) : o0000.OooO0OO(o000OOo.title_Room_onMic_0);
                o000O o000o = new o000O(mixedRoomActivity);
                o000o.OooOo00(strOooO00o);
                o000o.OooOo0O(o0O0o00O.f54744OooO0Oo);
                o000o.OooOo0(new o0O0o0(iIntValue));
                o000o.OooOO0o();
            } else if (OooO00o.f24525OooO0oO.f48527OooO00o.getValue().booleanValue()) {
                o000O o000o2 = new o000O(mixedRoomActivity);
                o000o2.OooOOoo(o000OOo.Switch_Mic);
                o000o2.OooOOOO(o000OOo.Switch);
                o000o2.OooOo0(new o0oOo0O0(i));
                o000o2.OooOo(true);
                o000o2.OooOO0o();
            } else {
                int i2 = this.f54746OooO0o0;
                RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
                if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(OooO00o.f24524OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
                    Context context = o000O00O.f13430OooO00o;
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        PermissionGroupReveal.RevealGroupType revealGroupType = PermissionGroupReveal.f32341OooO00o;
                        com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, revealGroupType, null, new o0O(i2, 0L, com.yalla.yalla.util.permission.OooO00o.OooO00o(activityOooO0O0, revealGroupType), false));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
