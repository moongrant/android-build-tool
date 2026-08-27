package com.yalla.yalla.module.account;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.api.result.ApiResult;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.data.repository.o00Ooo;
import com.yalla.yalla.mixedroom.roomdata.o0ooOOo;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.model.RegistrationRewardDefaultModule;
import com.yalla.yalla.model.RegistrationRewardDialogType;
import com.yalla.yalla.model.user.MyUserInfoModel;
import com.yalla.yalla.module.account.ui.acitivity.ChangeRegionActivity;
import com.yalla.yalla.module.account.ui.acitivity.EmailActivity;
import com.yalla.yalla.module.account.ui.acitivity.LoginActivity;
import com.yalla.yalla.module.account.ui.acitivity.PasswordActivity;
import com.yalla.yalla.module.account.ui.acitivity.PhoneNumberActivity;
import com.yalla.yalla.module.account.ui.acitivity.SmsCodeActivity;
import com.yalla.yalla.module.account.ui.dialog.OooOOOO;
import com.yalla.yalla.module.account.ui.screen.AccountScreen;
import com.yalla.yalla.module.account.ui.screen.LinkedAccountsScreen;
import com.yalla.yalla.repository.Account;
import com.yalla.yalla.statistical.buriedpoint.BuriedPointEventParameter$LoginFrom;
import com.yalla.yalla.statistical.business.BusinessEvent;
import com.yalla.yalla.util.Oooo000;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p469o0OooooO.oOO0OO;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public final class OooO0OO implements p445o0Ooo.OooO0O0 {
    @Override // p445o0Ooo.OooO0O0
    public final void OooO(@NotNull Activity context, boolean z, @NotNull BuriedPointEventParameter$LoginFrom from) {
        Intrinsics.checkNotNullParameter(context, "activity");
        Intrinsics.checkNotNullParameter(from, "from");
        int i = LoginActivity.f50306OooOoo0;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(from, "from");
        Intent intent = new Intent(context, (Class<?>) LoginActivity.class);
        intent.putExtra("from", from);
        intent.putExtra("bottomAnim", z);
        context.startActivity(intent);
    }

    @Override // p445o0Ooo.OooO0O0
    public final void OooO00o(@Nullable Activity activity) {
        if (activity != null) {
            activity.startActivity(new Intent(activity, (Class<?>) ChangeRegionActivity.class));
        }
    }

    @Override // p445o0Ooo.OooO0O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(@Nullable final o0ooOOo o0ooooo2, @Nullable Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1318008142);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(o0ooooo2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            OooOOOO.OooO0Oo(RegistrationRewardDialogType.GameOverNumber, RegistrationRewardDefaultModule.Game, o0ooooo2, composerStartRestartGroup, ((i2 << 6) & 896) | 54);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yalla.yalla.module.account.OooO0O0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    OooO0OO tmp0_rcvr = this.f50240OooO0oO;
                    Intrinsics.checkNotNullParameter(tmp0_rcvr, "$tmp0_rcvr");
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    tmp0_rcvr.OooO0O0(o0ooooo2, (Composer) obj, iUpdateChangedFlags);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Override // p445o0Ooo.OooO0O0
    public final void OooO0OO() {
        AccountScreen.INSTANCE.navigate();
    }

    @Override // p445o0Ooo.OooO0O0
    public final void OooO0Oo() {
        LinkedAccountsScreen.INSTANCE.navigate();
    }

    @Override // p445o0Ooo.OooO0O0
    public final void OooO0o(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = EmailActivity.f50289OooOoo0;
        EmailActivity.OooO00o.OooO00o(activity, null, ClientCodeType.BingingPhone, null, 8);
    }

    @Override // p445o0Ooo.OooO0O0
    public final boolean OooO0o0(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return (activity instanceof PhoneNumberActivity) || (activity instanceof SmsCodeActivity) || (activity instanceof PasswordActivity);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p445o0Ooo.OooO0O0
    @Nullable
    public final Object OooO0oO(@NotNull ContinuationImpl continuationImpl) {
        AccountModuleService$loginByVisitor$1 accountModuleService$loginByVisitor$1;
        if (continuationImpl instanceof AccountModuleService$loginByVisitor$1) {
            accountModuleService$loginByVisitor$1 = (AccountModuleService$loginByVisitor$1) continuationImpl;
            int i = accountModuleService$loginByVisitor$1.f50231OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountModuleService$loginByVisitor$1.f50231OooO = i - Integer.MIN_VALUE;
            } else {
                accountModuleService$loginByVisitor$1 = new AccountModuleService$loginByVisitor$1(this, continuationImpl);
            }
        } else {
            accountModuleService$loginByVisitor$1 = new AccountModuleService$loginByVisitor$1(this, continuationImpl);
        }
        Object objOooOOO = accountModuleService$loginByVisitor$1.f50232OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = accountModuleService$loginByVisitor$1.f50231OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooOOO);
            String countryCode = Oooo000.OooO0O0(new Oooo000()).getCountryCode();
            accountModuleService$loginByVisitor$1.f50231OooO = 1;
            objOooOOO = o00Ooo.f48615OooO00o.OooOOO(0, countryCode, accountModuleService$loginByVisitor$1);
            if (objOooOOO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooOOO);
        }
        ApiResult apiResult = (ApiResult) objOooOOO;
        if (apiResult.isSuccess()) {
            LoginModel loginModel = (LoginModel) apiResult.getData();
            MyUserInfoModel user = loginModel != null ? loginModel.getData() : null;
            LoginToken token = loginModel != null ? loginModel.getToken() : null;
            if (user != null && token != null) {
                oOO0OO.OooO0OO().f93873OooOOO.OooO0OO(Boxing.boxBoolean(loginModel.getIsGameFirst()));
                Account account = Account.f74684OooO00o;
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(token, "token");
                Account.Oooo0o(token);
                Account.Oooo0oO(true, user);
                Account.f74689OooO0o0 = loginModel.getIsFirst();
                if (loginModel.getIsFirst()) {
                    BusinessEvent.OooO0o();
                }
                oOO0OO.OooO0OO().f93863OooO0O0.OooO0OO(Boxing.boxInt(user.getStartupPage()));
                LiveEventBus.get("UPDATE_DOMAIN").post(Boxing.boxBoolean(true));
            }
        }
        return apiResult;
    }

    @Override // p445o0Ooo.OooO0O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0oo(@NotNull RegistrationRewardDialogType dialogType, @NotNull Function0<Unit> onDismissListener, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(dialogType, "dialogType");
        Intrinsics.checkNotNullParameter(onDismissListener, "onDismissListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1923431981);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(dialogType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissListener) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            OooOOOO.OooO0Oo(dialogType, RegistrationRewardDefaultModule.Room, onDismissListener, composerStartRestartGroup, ((i2 << 3) & 896) | (i2 & 14) | 48);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(this, dialogType, onDismissListener, i, 0));
        }
    }

    @Override // p445o0Ooo.OooO0O0
    public final void OooOO0(@NotNull Activity activity, @Nullable ClientCodeType clientCodeType) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i = PhoneNumberActivity.f50374OooOooO;
        PhoneNumberActivity.OooO00o.OooO00o(activity, null, clientCodeType);
    }
}
