package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f48584OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000O f48585OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(long j, o000O o000o) {
        super(0);
        this.f48584OooO0Oo = j;
        this.f48585OooO0o0 = o000o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableStateFlow<Boolean> silenced;
        String userIdx = String.valueOf(this.f48584OooO0Oo);
        RoomUserInfoModel roomUserInfoModel = this.f48585OooO0o0.f48596OooO0o0;
        int i = (roomUserInfoModel == null || (silenced = roomUserInfoModel.getSilenced()) == null || silenced.getValue().booleanValue()) ? 0 : 1;
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        String str = "{\"to\":" + userIdx + ",\"silence\":" + i + "}";
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        if (roomLiveService != null) {
            roomLiveService.OooO0oO(10006, str);
        }
        return Unit.INSTANCE;
    }
}
