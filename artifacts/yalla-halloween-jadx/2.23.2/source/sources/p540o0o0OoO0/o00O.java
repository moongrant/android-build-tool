package p540o0o0OoO0;

import com.app.base.protobuf.room.RoomMike;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f54687OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(long j) {
        super(0);
        this.f54687OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z = OooO00o.f24517OooO0oO.OooO0oO() > 0;
        RoomMike.MicInviteFromApplyRequest.Builder builderNewBuilder = RoomMike.MicInviteFromApplyRequest.newBuilder();
        builderNewBuilder.setTarget(this.f54687OooO0Oo);
        builderNewBuilder.setRoomId(OooO00o.f24516OooO0o0.OooO0o0());
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        builderNewBuilder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        builderNewBuilder.setFromApplyMicList(z);
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001103, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
