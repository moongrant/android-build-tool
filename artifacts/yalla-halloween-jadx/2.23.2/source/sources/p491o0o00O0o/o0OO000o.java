package p491o0o00O0o;

import android.view.View;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f49039OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f49039OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        ClientCodeType clientCodeType = ClientCodeType.Register;
        SmsCodeActivity smsCodeActivity = this.f49039OooO0Oo;
        if (clientCodeType == smsCodeActivity.f24848OooOo0O) {
            OooO00o.OooO0O0("101056");
        }
        if (ClientCodeType.Retrieve == smsCodeActivity.f24848OooOo0O) {
            OooO00o.OooO0O0("101058");
        }
        smsCodeActivity.Oooo000(false);
        return Unit.INSTANCE;
    }
}
