package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00o0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f43575Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f43575Oooo0o = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ClientCodeType clientCodeType;
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getCode() == 105 && ((clientCodeType = this.f43575Oooo0o.f21821Ooooo00) == ClientCodeType.Login || clientCodeType == ClientCodeType.Register)) {
            o0O00000.OooO0OO("Sign_phone_fail");
        }
        return Unit.INSTANCE;
    }
}
