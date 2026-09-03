package p474o0o00;

import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function1<AccountBindInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneBindActivity f47268OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(PhoneBindActivity phoneBindActivity) {
        super(1);
        this.f47268OooO0Oo = phoneBindActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AccountBindInfo accountBindInfo) {
        AccountBindInfo accountBindInfo2 = accountBindInfo;
        if (accountBindInfo2 != null) {
            String isPh = accountBindInfo2.getIsPh().length() > 4 ? accountBindInfo2.getIsPh() : "";
            PhoneBindActivity phoneBindActivity = this.f47268OooO0Oo;
            phoneBindActivity.f25243OooOo0 = isPh;
            phoneBindActivity.OooOoO0();
        }
        return Unit.INSTANCE;
    }
}
