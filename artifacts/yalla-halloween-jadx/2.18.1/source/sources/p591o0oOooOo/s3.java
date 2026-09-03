package p591o0oOooOo;

import android.app.Activity;
import android.content.Context;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoModel f47338Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(UserInfoModel userInfoModel) {
        super(0);
        this.f47338Oooo0o = userInfoModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context contextOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        Activity activity = contextOooO0O0 instanceof Activity ? (Activity) contextOooO0O0 : null;
        if (activity != null) {
            UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, activity, OooO.OooO(Long.valueOf(this.f47338Oooo0o.getUserId()), ""), false, 12);
        }
        return Unit.INSTANCE;
    }
}
