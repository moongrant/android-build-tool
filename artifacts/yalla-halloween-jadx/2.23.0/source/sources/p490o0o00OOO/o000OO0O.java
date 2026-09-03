package p490o0o00OOO;

import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.app.base.protobuf.room.RoomMike;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f48619OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(long j) {
        super(0);
        this.f48619OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomMike.MicInviteFromApplyRequest.Builder builderNewBuilder = RoomMike.MicInviteFromApplyRequest.newBuilder();
        builderNewBuilder.setTarget(this.f48619OooO0Oo);
        builderNewBuilder.setRoomId(OooO00o.f24978OooO0o0.OooO0o0());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        builderNewBuilder.setUserId(((Number) OooO0OO.OooO0O0()).longValue());
        builderNewBuilder.setFromApplyMicList(false);
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001103, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
