package p491o0o00O0o;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p037OoooOo0.o000O0o;
import p562o0oOo000.o000000;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f49021OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f49022OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(Ref.IntRef intRef, SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f49021OooO0Oo = intRef;
        this.f49022OooO0o0 = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        StringBuilder sbOooO0O0;
        Integer num2 = num;
        this.f49021OooO0Oo.element = num2 != null ? num2.intValue() : 0;
        if (num2 != null && num2.intValue() == 1) {
            String strOooO0OO = o0000.OooO0OO(o000000.verification_code_send_successed);
            String[] strArr = new String[1];
            boolean zOooO0o0 = OooOo00.OooO0o0();
            SmsCodeActivity smsCodeActivity = this.f49022OooO0o0;
            if (zOooO0o0) {
                sbOooO0O0 = o000O0o.OooO0O0(smsCodeActivity.f24845OooOo, "+");
            } else {
                String str = smsCodeActivity.f24845OooOo;
                StringBuilder sb = new StringBuilder("+");
                sb.append(str);
                sbOooO0O0 = sb;
            }
            strArr[0] = sbOooO0O0.toString();
            String strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
            if (!StringsKt.isBlank(strOooO00o)) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (num2 != null && num2.intValue() == 2) {
            String strOooO0OO2 = o0000.OooO0OO(o000000.verification_code_send_whatsapp);
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
