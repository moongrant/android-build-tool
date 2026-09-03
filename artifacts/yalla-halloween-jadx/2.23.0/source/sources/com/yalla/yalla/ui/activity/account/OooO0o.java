package com.yalla.yalla.ui.activity.account;

import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.vm.account.PhNumberVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p157o00OoOO0.o0OO00O;
import p375o0OOoOO.o00000O0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f25213OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f25214OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f25215OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(PhoneNumberActivity phoneNumberActivity, String str, String str2) {
        super(1);
        this.f25213OooO0Oo = phoneNumberActivity;
        this.f25215OooO0o0 = str;
        this.f25214OooO0o = str2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ClientCodeType clientCodeType;
        Boolean bool2 = bool;
        Boolean bool3 = Boolean.FALSE;
        boolean zAreEqual = Intrinsics.areEqual(bool2, bool3);
        String str = this.f25214OooO0o;
        String str2 = this.f25215OooO0o0;
        PhoneNumberActivity phoneNumberActivity = this.f25213OooO0Oo;
        if (zAreEqual && phoneNumberActivity.f25266OooOo00 == ClientCodeType.Login) {
            o0OO00O o0oo00o2 = new o0OO00O(phoneNumberActivity);
            String string = phoneNumberActivity.getString(oO00OOo0.phone_register_tip);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.phone_register_tip)");
            o0oo00o2.OooOo00(string);
            String string2 = phoneNumberActivity.getString(oO00OOo0.sign_up);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.sign_up)");
            o0oo00o2.OooOOOo(string2);
            o0oo00o2.OooOo0(new OooO0OO(phoneNumberActivity, str2, str));
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOO0o();
        } else if (!Intrinsics.areEqual(bool2, bool3) || (clientCodeType = phoneNumberActivity.f25266OooOo00) == ClientCodeType.Login) {
            Boolean bool4 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool2, bool4)) {
                ClientCodeType clientCodeType2 = phoneNumberActivity.f25266OooOo00;
                ClientCodeType clientCodeType3 = ClientCodeType.Login;
                if (clientCodeType2 == clientCodeType3) {
                    PhNumberVM.savePhoneInfo$default(phoneNumberActivity.OooOoOO(), this.f25215OooO0o0, this.f25214OooO0o, null, 4, null);
                    int i = PasswordActivity.f25224OooOoOO;
                    PasswordActivity.OooO00o.OooO00o(phoneNumberActivity, str2, str, null, clientCodeType3);
                } else if (Intrinsics.areEqual(bool2, bool4) && phoneNumberActivity.f25266OooOo00 != ClientCodeType.Login) {
                    ApiError error = new ApiError(1011, "", null, 4, null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                }
            } else if (Intrinsics.areEqual(bool2, bool4)) {
                ApiError error2 = new ApiError(1011, "", null, 4, null);
                Intrinsics.checkNotNullParameter(error2, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error2, null), 3, null);
            }
        } else {
            int i2 = SmsCodeActivity.f25298Oooo0;
            SmsCodeActivity.OooO00o.OooO00o(phoneNumberActivity, this.f25215OooO0o0, this.f25214OooO0o, clientCodeType, 0, null, 0, phoneNumberActivity.f25269OooOoO0, false, 368);
            PhNumberVM.savePhoneInfo$default(phoneNumberActivity.OooOoOO(), this.f25215OooO0o0, this.f25214OooO0o, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
