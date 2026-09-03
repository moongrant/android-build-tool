package p491o0o00O0o;

import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p390o0OOooo.o00000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function1<LoginListModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f48985OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(PasswordActivity passwordActivity) {
        super(1);
        this.f48985OooO0Oo = passwordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoginListModel loginListModel) {
        PasswordActivity.OooOo(this.f48985OooO0Oo);
        o00000.OooO00o("AFEventLogin", null);
        return Unit.INSTANCE;
    }
}
