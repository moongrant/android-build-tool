package p534o0o0OOo0;

import com.app.base.http.ApiEvent;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p141o00OOoo.OooO;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0OOOo extends Lambda implements Function1<LoginListModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f43558Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(PasswordActivity passwordActivity) {
        super(1);
        this.f43558Oooo0o = passwordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoginListModel loginListModel) {
        o0O00000.OooO0OO("Sign_up_success");
        PasswordActivity.OooOoo(this.f43558Oooo0o);
        OooO.OooO00o("AFEventLogin", null);
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        ApiEvent apiEvent = new ApiEvent();
        Objects.requireNonNull(this.f43558Oooo0o);
        apiEvent.OooO00o(70);
        return Unit.INSTANCE;
    }
}
