package p497o0o00OoO;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.activity.OooOo00;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o0oo0000.OooO00o;
import p205o00o0o0o.o000O;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49886OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49887OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49886OooO0Oo = oo0o;
        this.f49887OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue = this.f49887OooO0o0.getUserId().getValue().longValue();
        oo0O oo0o = this.f49886OooO0Oo;
        oo0o.getClass();
        boolean z = true;
        if (((Boolean) oo0O.OooO0Oo(jLongValue).getFirst()).booleanValue()) {
            OooO00o.OooO0O0("102196");
            o000O o000o = new o000O(oo0o.f49626OooO00o);
            o000o.OooOo00(o0000.OooO0OO(o000000.remove_to_mic));
            o000o.OooOo(true);
            o000o.OooOo0(new o00OO(jLongValue));
            o000o.OooOO0o();
        } else {
            OooO00o.OooO0O0("102195");
            o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
            int iOooO0o = o0000ooVar.OooO0o();
            if (o0000ooVar.OooO0o0() >= 0) {
                RoomMike.MicInviteFromApplyRequest.Builder builderNewBuilder = RoomMike.MicInviteFromApplyRequest.newBuilder();
                builderNewBuilder.setTarget(jLongValue);
                builderNewBuilder.setRoomId(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0());
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                builderNewBuilder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                builderNewBuilder.setFromApplyMicList(false);
                RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(1001103, builderNewBuilder.build().toByteArray());
                }
            } else if (iOooO0o >= 0) {
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    o000O o000o2 = new o000O(activityOooO0O0);
                    o000o2.OooOOoo(o000000.only_locked_mic);
                    o000o2.OooOo0O(o00OO00O.f49857OooO0Oo);
                    o000o2.OooOo0(new o00OO0O0(jLongValue));
                    o000o2.OooOO0o();
                }
            } else {
                String strOooO0OO = o0000.OooO0OO(o000000.microom_code_1005);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            OooO00o.OooO0O0("102197");
        }
        return Unit.INSTANCE;
    }
}
