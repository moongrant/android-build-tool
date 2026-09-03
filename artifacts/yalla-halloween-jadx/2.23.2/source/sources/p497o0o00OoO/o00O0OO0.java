package p497o0o00OoO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f49846OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0O f49847OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(long j, oo0O oo0o) {
        super(0);
        this.f49846OooO0Oo = j;
        this.f49847OooO0o0 = oo0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableStateFlow<Boolean> silenced;
        String userIdx = String.valueOf(this.f49846OooO0Oo);
        RoomUserInfoModel roomUserInfoModel = this.f49847OooO0o0.f49904OooO0o0;
        int i = (roomUserInfoModel == null || (silenced = roomUserInfoModel.getSilenced()) == null || silenced.getValue().booleanValue()) ? 0 : 1;
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        String str = "{\"to\":" + userIdx + ",\"silence\":" + i + "}";
        RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10006, str);
        }
        return Unit.INSTANCE;
    }
}
