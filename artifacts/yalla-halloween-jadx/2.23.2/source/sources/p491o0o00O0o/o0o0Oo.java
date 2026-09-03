package p491o0o00O0o;

import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function1<AccountBindInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneBindActivity f49062OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(PhoneBindActivity phoneBindActivity) {
        super(1);
        this.f49062OooO0Oo = phoneBindActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AccountBindInfo accountBindInfo) {
        AccountBindInfo accountBindInfo2 = accountBindInfo;
        if (accountBindInfo2 != null) {
            String isPh = accountBindInfo2.getIsPh().length() > 4 ? accountBindInfo2.getIsPh() : "";
            PhoneBindActivity phoneBindActivity = this.f49062OooO0Oo;
            phoneBindActivity.f24789OooOo0 = isPh;
            phoneBindActivity.OooOoO0();
        }
        return Unit.INSTANCE;
    }
}
