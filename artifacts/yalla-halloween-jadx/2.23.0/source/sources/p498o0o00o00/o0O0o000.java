package p498o0o00o00;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49328OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49328OooO0Oo = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102092");
        RoomUserInfoModel roomUserInfoModel = this.f49328OooO0Oo;
        if (!roomUserInfoModel.isUnLoginUser().getValue().booleanValue()) {
            OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0.postValue(roomUserInfoModel);
        }
        return Unit.INSTANCE;
    }
}
