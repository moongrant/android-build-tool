package p653o0ooo;

import com.app.base.protobuf.room.RoomMike;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OOOO00 f58084OooO0Oo = new o0OOOO00();

    public o0OOOO00() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.f24537OooOo0.f48587OooO0O0.setValue(Boolean.FALSE);
        RoomMike.MicApplySwitchOpenRequest.Builder builderNewBuilder = RoomMike.MicApplySwitchOpenRequest.newBuilder();
        builderNewBuilder.setRoomId(OooO00o.f24524OooO0o0.OooO0o0());
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        builderNewBuilder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        builderNewBuilder.setOp(1);
        RoomLiveService roomLiveService = RoomLiveService.f24604OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001106, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
