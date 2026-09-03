package p490o0o00OOO;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p157o00OoOO0.o0OO00O;
import p464o0Oooo.o000000O;
import p475o0o000.o000000;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48663OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48664OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48663OooO0Oo = o000o;
        this.f48664OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue = this.f48664OooO0o0.getUserId().getValue().longValue();
        o000O o000o = this.f48663OooO0Oo;
        o000o.getClass();
        boolean z = true;
        if (((Boolean) o000O.OooO0Oo(jLongValue).getFirst()).booleanValue()) {
            o0OO000.OooO00o("102196");
            o0OO00O o0oo00o2 = new o0OO00O(o000o.f48470OooO00o);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.remove_to_mic));
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOo0(new o000OO00(jLongValue));
            o0oo00o2.OooOO0o();
        } else {
            o0OO000.OooO00o("102195");
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            int iOooO0o = o000000Var.OooO0o();
            if (o000000Var.OooO0o0() >= 0) {
                RoomMike.MicInviteFromApplyRequest.Builder builderNewBuilder = RoomMike.MicInviteFromApplyRequest.newBuilder();
                builderNewBuilder.setTarget(jLongValue);
                builderNewBuilder.setRoomId(OooO00o.f24978OooO0o0.OooO0o0());
                o000000O o000000o2 = o000000O.f46674OooO00o;
                builderNewBuilder.setUserId(((Number) OooO0OO.OooO0O0()).longValue());
                builderNewBuilder.setFromApplyMicList(false);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(1001103, builderNewBuilder.build().toByteArray());
                }
            } else if (iOooO0o >= 0) {
                Context context = o000O0.f10354OooO00o;
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    o0OO00O o0oo00o3 = new o0OO00O(activityOooO0O0);
                    o0oo00o3.OooOOoo(oO00OOo0.only_locked_mic);
                    o0oo00o3.OooOo0O(o000O0Oo.f48614OooO0Oo);
                    o0oo00o3.OooOo0(new o000OO0O(jLongValue));
                    o0oo00o3.OooOO0o();
                }
            } else {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.microom_code_1005);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            o0OO000.OooO00o("102197");
        }
        return Unit.INSTANCE;
    }
}
