package com.yalla.yalla.module.account;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.module_service.BaseModuleServiceInitializer;
import com.yalla.yalla.module.account.ui.screen.AccountScreen;
import com.yalla.yalla.module.account.ui.screen.DeleteAccountFirstWanScreen;
import com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonFirstChooseScreen;
import com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonSecondChooseScreen;
import com.yalla.yalla.module.account.ui.screen.LinkedAccountsScreen;
import kotlin.Metadata;
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;
import p439o0OoOo.oo0o0Oo;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/module/account/AccountModuleServiceInitializer;", "Lcom/yalla/yalla/common/module_service/BaseModuleServiceInitializer;", "<init>", "()V", "Account_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class AccountModuleServiceInitializer extends BaseModuleServiceInitializer {
    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final Object OooO00o() {
        return new oo0o0Oo();
    }

    @Override // com.yalla.yalla.common.module_service.BaseModuleServiceInitializer
    public final void OooO0O0() {
        OooO<Activity, o00O00OO> oooO = o00O00.f53494OooO00o;
        o00O00.OooO0oo(AccountScreen.INSTANCE);
        o00O00.OooO0oo(DeleteAccountFirstWanScreen.INSTANCE);
        o00O00.OooO0oo(DeleteAccountReasonFirstChooseScreen.INSTANCE);
        o00O00.OooO0oo(DeleteAccountReasonSecondChooseScreen.INSTANCE);
        o00O00.OooO0oo(LinkedAccountsScreen.INSTANCE);
    }
}
