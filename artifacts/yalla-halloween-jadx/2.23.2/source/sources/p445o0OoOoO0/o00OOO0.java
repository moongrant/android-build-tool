package p445o0OoOoO0;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.repository.AppConfigRepo;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f47327OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f47328OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f47329OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f47330OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(OpenAuthManager openAuthManager, ScreenNavigationActivity screenNavigationActivity, o0oOo0O0 o0ooo0o1, LinkedAccountsVM linkedAccountsVM) {
        super(0);
        this.f47327OooO0Oo = screenNavigationActivity;
        this.f47329OooO0o0 = linkedAccountsVM;
        this.f47328OooO0o = o0ooo0o1;
        this.f47330OooO0oO = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AppConfigRepo.f24292OooO00o.getClass();
        MutableLiveData<Boolean> mutableLiveData = AppConfigRepo.f24293OooO0O0;
        o0oOo0O0 o0ooo0o1 = this.f47328OooO0o;
        OpenAuthManager openAuthManager = this.f47330OooO0oO;
        ScreenNavigationActivity screenNavigationActivity = this.f47327OooO0Oo;
        mutableLiveData.observe(screenNavigationActivity, new o0O00o0.OooO(new o00OOO00(openAuthManager, screenNavigationActivity, o0ooo0o1, this.f47329OooO0o0)));
        return Unit.INSTANCE;
    }
}
