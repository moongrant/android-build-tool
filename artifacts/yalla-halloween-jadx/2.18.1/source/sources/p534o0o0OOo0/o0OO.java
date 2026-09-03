package p534o0o0OOo0;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p028Oooo0o0.o00O0O0O;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f43566Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43567Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(Ref.IntRef intRef, SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f43566Oooo0o = intRef;
        this.f43567Oooo0oO = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        StringBuilder sbOooO00o;
        Integer num2 = num;
        this.f43566Oooo0o.element = num2 != null ? num2.intValue() : 0;
        if (num2 != null && num2.intValue() == 1) {
            ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12567OooO00o;
            String strOooO0OO = OooOOO.OooO0OO(R.string.verification_code_send_successed);
            String[] strArr = new String[1];
            if (oo000o.OooO0o0()) {
                sbOooO00o = new StringBuilder();
                sbOooO00o.append(this.f43567Oooo0oO.f21851OooooOo);
                sbOooO00o.append('+');
            } else {
                sbOooO00o = o00O0O0O.OooO00o('+');
                sbOooO00o.append(this.f43567Oooo0oO.f21851OooooOo);
            }
            strArr[0] = sbOooO00o.toString();
            oooO0O0.OooO0O0(OooOo.OooO00o(strOooO0OO, strArr));
        } else if (num2 != null && num2.intValue() == 2) {
            ToastUtil.f12567OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.verification_code_send_whatsapp));
        }
        return Unit.INSTANCE;
    }
}
