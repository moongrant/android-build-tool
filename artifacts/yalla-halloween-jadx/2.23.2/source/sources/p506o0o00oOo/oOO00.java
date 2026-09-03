package p506o0o00oOo;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.oOOO00Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50514OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50514OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        oOOO00Oo oooo00oo = this.f50514OooO0Oo.f26778OooOo0;
        if (oooo00oo != null) {
            oooo00oo.OooO00o(str2);
        }
        return Unit.INSTANCE;
    }
}
