package p496o0o00o;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p579o0oOoo.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49073OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49073OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        oO00O0oO oo00o0oo = this.f49073OooO0Oo.f27243OooOo0;
        if (oo00o0oo != null) {
            oo00o0oo.OooO00o(str2);
        }
        return Unit.INSTANCE;
    }
}
