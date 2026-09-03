package p533o0o0Oo0;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o00O0O;
import p157o00OoOO0.o0OO00O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f54769OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54770OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(int i, MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f54769OooO0Oo = mixedRoomActivity;
        this.f54770OooO0o0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO0O0.OooO00o oooO00o = OooO0O0.f24995OoooOOO;
        boolean zOooOOO = oooO00o.OooO00o().OooOOO();
        int i = this.f54770OooO0o0;
        MixedRoomActivity mixedRoomActivity = this.f54769OooO0Oo;
        if (zOooOOO || (oooO00o.OooO00o().OooOO0o() && Intrinsics.areEqual(oooO00o.OooO00o().f25023OooOoOO.getValue(), Boolean.TRUE))) {
            o00O0O o00o0o2 = new o00O0O(mixedRoomActivity, null);
            o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.host_take_mic));
            o00o0o2.OooOOO0(o0000.OooO0OO(oO00OOo0.host_lock_mic));
            o00o0o2.OooOOOo(new o00O0O0(i, mixedRoomActivity));
            o00o0o2.OooOO0o();
        } else {
            if (oooO00o.OooO00o().OooOOO0() && !((Boolean) OooO00o.f24978OooO0o0.f47491OooO0o0.getValue()).booleanValue()) {
                o0OO000.OooO00o("302013");
                Integer value = oooO00o.OooO00o().f25014OooOOo0.getValue();
                if (value == null) {
                    value = 0;
                }
                int iIntValue = value.intValue();
                String strOooO00o = iIntValue > 0 ? o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.title_Room_onMic), String.valueOf(iIntValue)) : o0000.OooO0OO(oO00OOo0.title_Room_onMic_0);
                o0OO00O o0oo00o2 = new o0OO00O(mixedRoomActivity);
                o0oo00o2.OooOo00(strOooO00o);
                o0oo00o2.OooOo0O(o00O0O0O.f54768OooO0Oo);
                o0oo00o2.OooOo0(new o00O0OO0(iIntValue));
                o0oo00o2.OooOO0o();
            } else if (OooO00o.f24979OooO0oO.f47371OooO00o.getValue().booleanValue()) {
                o0OO00O o0oo00o3 = new o0OO00O(mixedRoomActivity);
                o0oo00o3.OooOOoo(oO00OOo0.Switch_Mic);
                o0oo00o3.OooOOOO(oO00OOo0.Switch);
                o0oo00o3.OooOo0(new oo0o0O0(i));
                o0oo00o3.OooOo(true);
                o0oo00o3.OooOO0o();
            } else {
                int i2 = this.f54770OooO0o0;
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null ? Intrinsics.areEqual(roomLiveService.OooO0OO(OooO00o.f24978OooO0o0.OooO0o0()), Boolean.TRUE) : false) {
                    Context context = o000O0.f10354OooO00o;
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        PermissionGroupReveal.RevealGroupType revealGroupType = PermissionGroupReveal.f32879OooO00o;
                        com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, revealGroupType, null, new o00O0OOO(i2, 0L, com.yalla.yalla.util.permission.OooO00o.OooO00o(activityOooO0O0, revealGroupType), false));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
