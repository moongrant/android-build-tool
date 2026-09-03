package p504o0o00oO0;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f50296OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f50296OooO0Oo = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102092");
        RoomUserInfoModel roomUserInfoModel = this.f50296OooO0Oo;
        if (!roomUserInfoModel.isUnLoginUser().getValue().booleanValue()) {
            OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0.postValue(roomUserInfoModel);
        }
        return Unit.INSTANCE;
    }
}
