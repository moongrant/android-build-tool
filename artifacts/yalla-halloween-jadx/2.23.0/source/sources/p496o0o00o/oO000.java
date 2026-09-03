package p496o0o00o;

import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49126OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49126OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        UserInfoEditActivity userInfoEditActivity = this.f49126OooO0Oo;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(userInfoEditActivity);
        oooO00o.OooO00o(OooO.OooO00o());
        oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(str);
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0O0(2, o0000.OooO00o(oO00O0o.white));
        int i = UserInfoEditActivity.f27283Oooo0oO;
        oooO00o.OooO0Oo(userInfoEditActivity.OooOoO().f58083OooO0oo);
        return Unit.INSTANCE;
    }
}
