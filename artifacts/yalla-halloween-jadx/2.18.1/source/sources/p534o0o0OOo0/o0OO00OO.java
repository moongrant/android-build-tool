package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00OO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f43572Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f43573Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f43574Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(PhoneNumberActivity phoneNumberActivity, String str, String str2) {
        super(1);
        this.f43572Oooo0o = phoneNumberActivity;
        this.f43573Oooo0oO = str;
        this.f43574Oooo0oo = str2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2;
        ClientCodeType clientCodeType;
        ClientCodeType clientCodeType2;
        PhoneNumberActivity phoneNumberActivity;
        ClientCodeType clientCodeType3;
        Boolean bool3 = bool;
        Boolean bool4 = Boolean.FALSE;
        if (Intrinsics.areEqual(bool3, bool4)) {
            PhoneNumberActivity phoneNumberActivity2 = this.f43572Oooo0o;
            if (phoneNumberActivity2.f21821Ooooo00 == ClientCodeType.Login) {
                SmsCodeActivity.OooO00o oooO00o = SmsCodeActivity.f21845o00Ooo;
                SmsCodeActivity.OooO00o.OooO00o(phoneNumberActivity2, this.f43573Oooo0oO, this.f43574Oooo0oo, ClientCodeType.Register, 0, null, 112);
            } else if (Intrinsics.areEqual(bool3, bool4) || (clientCodeType3 = (phoneNumberActivity = this.f43572Oooo0o).f21821Ooooo00) == ClientCodeType.Login) {
                bool2 = Boolean.TRUE;
                if (Intrinsics.areEqual(bool3, bool2)) {
                    clientCodeType = this.f43572Oooo0o.f21821Ooooo00;
                    clientCodeType2 = ClientCodeType.Login;
                    if (clientCodeType == clientCodeType2) {
                        o0O00000.OooO0OO("Log_in");
                        PasswordActivity.f21781OoooooO.OooO00o(this.f43572Oooo0o, this.f43573Oooo0oO, this.f43574Oooo0oo, null, clientCodeType2);
                    } else if (Intrinsics.areEqual(bool3, bool2) && this.f43572Oooo0o.f21821Ooooo00 != ClientCodeType.Login) {
                        ApiError error = new ApiError(1011, "");
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                    }
                } else if (Intrinsics.areEqual(bool3, bool2)) {
                    ApiError error2 = new ApiError(1011, "");
                    Intrinsics.checkNotNullParameter(error2, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error2, null), 3, null);
                }
            } else {
                SmsCodeActivity.OooO00o oooO00o2 = SmsCodeActivity.f21845o00Ooo;
                SmsCodeActivity.OooO00o.OooO00o(phoneNumberActivity, this.f43573Oooo0oO, this.f43574Oooo0oo, clientCodeType3, 0, null, 112);
            }
        } else if (Intrinsics.areEqual(bool3, bool4)) {
            bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool3, bool2)) {
                clientCodeType = this.f43572Oooo0o.f21821Ooooo00;
                clientCodeType2 = ClientCodeType.Login;
                if (clientCodeType == clientCodeType2) {
                    o0O00000.OooO0OO("Log_in");
                    PasswordActivity.f21781OoooooO.OooO00o(this.f43572Oooo0o, this.f43573Oooo0oO, this.f43574Oooo0oo, null, clientCodeType2);
                } else if (Intrinsics.areEqual(bool3, bool2)) {
                    ApiError error3 = new ApiError(1011, "");
                    Intrinsics.checkNotNullParameter(error3, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error3, null), 3, null);
                }
            } else if (Intrinsics.areEqual(bool3, bool2)) {
                ApiError error4 = new ApiError(1011, "");
                Intrinsics.checkNotNullParameter(error4, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error4, null), 3, null);
            }
        } else {
            bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool3, bool2)) {
                clientCodeType = this.f43572Oooo0o.f21821Ooooo00;
                clientCodeType2 = ClientCodeType.Login;
                if (clientCodeType == clientCodeType2) {
                    o0O00000.OooO0OO("Log_in");
                    PasswordActivity.f21781OoooooO.OooO00o(this.f43572Oooo0o, this.f43573Oooo0oO, this.f43574Oooo0oo, null, clientCodeType2);
                } else if (Intrinsics.areEqual(bool3, bool2)) {
                    ApiError error5 = new ApiError(1011, "");
                    Intrinsics.checkNotNullParameter(error5, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error5, null), 3, null);
                }
            } else if (Intrinsics.areEqual(bool3, bool2)) {
                ApiError error6 = new ApiError(1011, "");
                Intrinsics.checkNotNullParameter(error6, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error6, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
