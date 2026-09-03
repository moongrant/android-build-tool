package p669oO0Oo;

import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.app.base.protobuf.room.RoomMike;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p475o0o000.o000000;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0O00 f60671OooO0Oo = new o0O0O00();

    public o0O0O00() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o000000 o000000Var = OooO00o.f24979OooO0oO;
        if (o000000Var.OooOO0O()) {
            o0OO000.OooO00o("102235");
        } else {
            o0OO000.OooO00o("102234");
        }
        boolean z = !o000000Var.OooOO0O();
        RoomMike.MicApplyRequest.Builder builderNewBuilder = RoomMike.MicApplyRequest.newBuilder();
        builderNewBuilder.setRoomId(OooO00o.f24978OooO0o0.OooO0o0());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        builderNewBuilder.setUserId(((Number) OooO0OO.OooO0O0()).longValue());
        builderNewBuilder.setOp(z ? 1 : 2);
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oo(1001100, builderNewBuilder.build().toByteArray());
        }
        return Unit.INSTANCE;
    }
}
