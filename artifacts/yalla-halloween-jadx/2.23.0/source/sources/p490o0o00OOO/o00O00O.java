package p490o0o00OOO;

import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48641OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48642OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48641OooO0Oo = o000o;
        this.f48642OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jLongValue = this.f48642OooO0o0.getUserId().getValue().longValue();
        o000O o000o = this.f48641OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102187");
        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, o000o.f48470OooO00o, String.valueOf(jLongValue), true, 4);
        return Unit.INSTANCE;
    }
}
