package p540o0o0OoO0;

import com.app.base.protobuf.room.RoomMike;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00OOO0 f54715OooO0Oo = new o00OOO0();

    public o00OOO0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
        if (o0000ooVar.OooOO0O()) {
            o0oo0000.OooO00o.OooO0O0("102235");
        } else {
            o0oo0000.OooO00o.OooO0O0("102234");
        }
        boolean z = !o0000ooVar.OooOO0O();
        RoomMike.MicApplyRequest.Builder builderNewBuilder = RoomMike.MicApplyRequest.newBuilder();
        builderNewBuilder.setRoomId(OooO00o.f24516OooO0o0.OooO0o0());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        builderNewBuilder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        builderNewBuilder.setOp(z ? 1 : 2);
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001100, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
