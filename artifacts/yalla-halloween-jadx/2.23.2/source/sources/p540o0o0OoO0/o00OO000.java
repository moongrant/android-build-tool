package p540o0o0OoO0;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.activity.OooOo00;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
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
public final class o00OO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f54709OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(long j) {
        super(0);
        this.f54709OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102236");
        o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
        int iOooO0o = o0000ooVar.OooO0o();
        int iOooO0o0 = o0000ooVar.OooO0o0();
        boolean z = true;
        long j = this.f54709OooO0Oo;
        if (iOooO0o0 >= 0) {
            z = o0000ooVar.OooO0oO() > 0;
            RoomMike.MicInviteFromApplyRequest.Builder builderNewBuilder = RoomMike.MicInviteFromApplyRequest.newBuilder();
            builderNewBuilder.setTarget(j);
            builderNewBuilder.setRoomId(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0());
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            builderNewBuilder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            builderNewBuilder.setFromApplyMicList(z);
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(1001103, builderNewBuilder.build().toByteArray());
            }
        } else if (iOooO0o >= 0) {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                o000O o000o = new o000O(activityOooO0O0);
                o000o.OooOOoo(o000000.only_locked_mic);
                o000o.OooOo0O(oo0oOO0.f55051OooO0Oo);
                o000o.OooOo0(new o00O(j));
                o000o.OooOO0o();
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
        return Unit.INSTANCE;
    }
}
