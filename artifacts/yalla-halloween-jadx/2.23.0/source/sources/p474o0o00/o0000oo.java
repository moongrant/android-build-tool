package p474o0o00;

import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo extends Lambda implements Function1<LoginListModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47241OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(LoginActivity loginActivity) {
        super(1);
        this.f47241OooO0Oo = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoginListModel loginListModel) {
        this.f47241OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}
