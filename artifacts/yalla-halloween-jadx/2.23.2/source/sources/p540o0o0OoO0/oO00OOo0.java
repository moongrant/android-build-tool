package p540o0o0OoO0;

import com.app.base.protobuf.room.RoomMike;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO00OOo0 f54950OooO0Oo = new oO00OOo0();

    public oO00OOo0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.f24529OooOo0.f48501OooO0O0.setValue(Boolean.FALSE);
        RoomMike.MicApplySwitchOpenRequest.Builder builderNewBuilder = RoomMike.MicApplySwitchOpenRequest.newBuilder();
        builderNewBuilder.setRoomId(OooO00o.f24516OooO0o0.OooO0o0());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        builderNewBuilder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        builderNewBuilder.setOp(2);
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001106, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
