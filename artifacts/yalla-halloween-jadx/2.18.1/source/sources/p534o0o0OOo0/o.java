package p534o0o0OOo0;

import android.view.View;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43512Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f43512Oooo0o = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        if (ClientCodeType.Register == this.f43512Oooo0o.f21849OooooO0) {
            o0O00000.OooO0OO("resend_verify_code");
        }
        if (ClientCodeType.Retrieve == this.f43512Oooo0o.f21849OooooO0) {
            o0O00000.OooO0OO("Forgot_password_recend");
        }
        this.f43512Oooo0o.Oooo0OO(false);
        return Unit.INSTANCE;
    }
}
