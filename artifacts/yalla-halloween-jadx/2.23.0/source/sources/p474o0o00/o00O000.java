package p474o0o00;

import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p386o0OOooOo.o00O0O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function1<LoginListModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f47260OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(PasswordActivity passwordActivity) {
        super(1);
        this.f47260OooO0Oo = passwordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoginListModel loginListModel) {
        PasswordActivity.OooOo(this.f47260OooO0Oo);
        o00O0O0O.OooO00o("AFEventLogin", null);
        return Unit.INSTANCE;
    }
}
