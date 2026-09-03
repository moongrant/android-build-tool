package p669oO0Oo;

import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.app.base.protobuf.room.RoomMike;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0OOO0 f60677OooO0Oo = new o0O0OOO0();

    public o0O0OOO0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.f24991OooOo0.f47432OooO0O0.setValue(Boolean.FALSE);
        RoomMike.MicApplySwitchOpenRequest.Builder builderNewBuilder = RoomMike.MicApplySwitchOpenRequest.newBuilder();
        builderNewBuilder.setRoomId(OooO00o.f24978OooO0o0.OooO0o0());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        builderNewBuilder.setUserId(((Number) OooO0OO.OooO0O0()).longValue());
        builderNewBuilder.setOp(2);
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001106, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
