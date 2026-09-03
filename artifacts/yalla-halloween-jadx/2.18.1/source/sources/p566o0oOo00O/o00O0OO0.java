package p566o0oOo00O;

import com.yalla.yalla.common.model.SupportInfo;
import com.yalla.yalla.ui.activity.user.SupportTopActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SupportTopActivity f45265Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SupportInfo.UserData f45266Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(SupportTopActivity supportTopActivity, SupportInfo.UserData userData) {
        super(0);
        this.f45265Oooo0o = supportTopActivity;
        this.f45266Oooo0oO = userData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SupportTopActivity supportTopActivity = this.f45265Oooo0o;
        Objects.requireNonNull(supportTopActivity);
        UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, supportTopActivity, String.valueOf(this.f45266Oooo0oO.getUserId()), false, 12);
        return null;
    }
}
