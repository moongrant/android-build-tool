package p490o0o00OOO;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O f48633OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f48634OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(o000O o000o, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f48633OooO0Oo = o000o;
        this.f48634OooO0o0 = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int iIntValue = this.f48634OooO0o0.getPremiumLevel().getValue().intValue();
        o000O o000o = this.f48633OooO0Oo;
        o000o.getClass();
        o0OO000.OooO00o("102193");
        int i = PremiumActivity.f27140Oooo0oO;
        PremiumActivity.OooO00o.OooO00o(o000o.f48470OooO00o, PremiumLevel.INSTANCE.of(Integer.valueOf(iIntValue)));
        return Unit.INSTANCE;
    }
}
