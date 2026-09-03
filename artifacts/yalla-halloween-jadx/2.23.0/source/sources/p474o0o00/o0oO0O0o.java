package p474o0o00;

import android.view.View;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f47340OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f47340OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        ClientCodeType clientCodeType = ClientCodeType.Register;
        SmsCodeActivity smsCodeActivity = this.f47340OooO0Oo;
        if (clientCodeType == smsCodeActivity.f25303OooOo0O) {
            o0OO000.OooO00o("101056");
        }
        if (ClientCodeType.Retrieve == smsCodeActivity.f25303OooOo0O) {
            o0OO000.OooO00o("101058");
        }
        smsCodeActivity.Oooo000(false);
        return Unit.INSTANCE;
    }
}
