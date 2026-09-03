package p546o0o0Ooo0;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.data.o0OoOo0;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O00oO f44529Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f44530Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00o0(oO0O00oO oo0o00oo, RoomUserInfoModel roomUserInfoModel) {
        super(0);
        this.f44529Oooo0o = oo0o00oo;
        this.f44530Oooo0oO = roomUserInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oO0O00oO oo0o00oo = this.f44529Oooo0o;
        if (oo0o00oo.f44533OooO0Oo.isVerify) {
            oo0o00oo.OooO0o(this.f44530Oooo0oO.getUserId());
        } else {
            oo0o00oo.f44365OooO00o.f11780o00000O0.addFriend(this.f44530Oooo0oO.getUserId(), o000O0O0.OooO0OO(R.string.addbuddy)).observe(oo0o00oo.f44365OooO00o, o0OoOo0.f20640OooO0OO);
        }
        return Unit.INSTANCE;
    }
}
