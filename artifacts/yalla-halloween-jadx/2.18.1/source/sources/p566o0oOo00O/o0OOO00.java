package p566o0oOo00O;

import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditBioActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45330Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO00(UserInfoEditActivity userInfoEditActivity) {
        super(0);
        this.f45330Oooo0o = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoEditBioActivity.OooO00o oooO00o = UserInfoEditBioActivity.f23522OooooOO;
        UserInfoEditActivity userInfoEditActivity = this.f45330Oooo0o;
        Objects.requireNonNull(userInfoEditActivity);
        oooO00o.OooO00o(userInfoEditActivity, this.f45330Oooo0o.OooOooo().f50504OooOOO0.getText().toString());
        return Unit.INSTANCE;
    }
}
