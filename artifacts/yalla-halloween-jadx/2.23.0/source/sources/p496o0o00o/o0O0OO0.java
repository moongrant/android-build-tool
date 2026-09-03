package p496o0o00o;

import androidx.camera.core.impl.o00OOO00;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49074OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49074OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        UserInfoActivity userInfoActivity = this.f49074OooO0Oo;
        String str3 = userInfoActivity.f27245OooOo0O;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (o00OOO00.OooO0O0(str3)) {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(userInfoActivity);
            oooO00o.OooO00o(OooO.OooO00o());
            oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(str2);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0O0(2, o0000.OooO00o(oO00O0o.white));
            oooO00o.OooO0Oo(userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57687OooOOOo);
        }
        return Unit.INSTANCE;
    }
}
