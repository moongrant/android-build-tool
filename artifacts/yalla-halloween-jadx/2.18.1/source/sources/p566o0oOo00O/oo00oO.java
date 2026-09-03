package p566o0oOo00O;

import android.view.View;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class oo00oO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45396Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(UserInfoActivity userInfoActivity) {
        super(1);
        this.f45396Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o0O00000.OooO0OO("Me_profile_edit");
        UserInfoEditActivity.OooO00o oooO00o = UserInfoEditActivity.f23493o0ooOOo;
        UserInfoActivity userInfoActivity = this.f45396Oooo0o;
        Objects.requireNonNull(userInfoActivity);
        oooO00o.OooO00o(userInfoActivity, this.f45396Oooo0o.f23457OooooOO);
        return Unit.INSTANCE;
    }
}
