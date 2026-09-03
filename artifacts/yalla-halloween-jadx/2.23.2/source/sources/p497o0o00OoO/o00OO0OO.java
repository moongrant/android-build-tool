package p497o0o00OoO;

import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0O f49859OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f49860OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(oo0O oo0o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f49859OooO0Oo = oo0o;
        this.f49860OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o = this.f49859OooO0Oo;
        boolean z = oo0o.f49903OooO0Oo.isVerify;
        RoomUserInfoModel roomUserInfoModel = this.f49860OooO0o0;
        if (z) {
            oo0o.OooO0oO(roomUserInfoModel.getUserId().getValue().longValue());
        } else {
            oo0o.OooO0o(roomUserInfoModel.getUserId().getValue().longValue(), o0000.OooO0OO(o000000.addbuddy));
        }
        return Unit.INSTANCE;
    }
}
