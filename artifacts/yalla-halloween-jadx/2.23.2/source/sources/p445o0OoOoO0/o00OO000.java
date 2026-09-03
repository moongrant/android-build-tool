package p445o0OoOoO0;

import android.content.Intent;
import com.yalla.yalla.ui.activity.account.PhoneBindActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f47320OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f47321OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(LinkedAccountsVM linkedAccountsVM, ScreenNavigationActivity screenNavigationActivity) {
        super(0);
        this.f47320OooO0Oo = linkedAccountsVM;
        this.f47321OooO0o0 = screenNavigationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkedAccountsVM linkedAccountsVM = this.f47320OooO0Oo;
        if (linkedAccountsVM.getAccountBindInfo() != null) {
            int i = PhoneBindActivity.f24787OooOo0o;
            String bindPhoneInfo = linkedAccountsVM.getBindPhoneInfo();
            String countryCode = linkedAccountsVM.getCountryCode();
            ScreenNavigationActivity activity = this.f47321OooO0o0;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intent intent = new Intent(activity, (Class<?>) PhoneBindActivity.class);
            intent.putExtra("ACCOUNT_BIND_PHONE", bindPhoneInfo);
            intent.putExtra("ACCOUNT_BIND_PHONE_COUNTRY_CODE", countryCode);
            activity.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
