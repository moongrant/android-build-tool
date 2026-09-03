package p502o0o00oOO;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OO0O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f49541OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(long j) {
        super(1);
        this.f49541OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        long j = this.f49541OooO0Oo;
        if (j > 0) {
            Room.UserInfoRequest.Builder builderNewBuilder = Room.UserInfoRequest.newBuilder();
            builderNewBuilder.setUserid(j);
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oo(10060, builderNewBuilder.build().toByteArray());
            }
        }
        return Unit.INSTANCE;
    }
}
