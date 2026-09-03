package p534o0o0OOo0;

import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00 extends Lambda implements Function1<LoginListModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f43537Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(LoginActivity loginActivity) {
        super(1);
        this.f43537Oooo0o = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoginListModel loginListModel) {
        this.f43537Oooo0o.finish();
        return Unit.INSTANCE;
    }
}
