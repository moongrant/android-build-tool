package p474o0o00;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p037OoooOo0.o000Oo0;
import p584o0oOooO0.oO00OOo0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f47296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f47297OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(Ref.IntRef intRef, SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f47296OooO0Oo = intRef;
        this.f47297OooO0o0 = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        StringBuilder sbOooO0O0;
        Integer num2 = num;
        this.f47296OooO0Oo.element = num2 != null ? num2.intValue() : 0;
        if (num2 != null && num2.intValue() == 1) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.verification_code_send_successed);
            String[] strArr = new String[1];
            boolean zOooO0o0 = OooO.OooO0o0();
            SmsCodeActivity smsCodeActivity = this.f47297OooO0o0;
            if (zOooO0o0) {
                sbOooO0O0 = o000Oo0.OooO0O0(smsCodeActivity.f25300OooOo, "+");
            } else {
                String str = smsCodeActivity.f25300OooOo;
                StringBuilder sb = new StringBuilder("+");
                sb.append(str);
                sbOooO0O0 = sb;
            }
            strArr[0] = sbOooO0O0.toString();
            String strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
            if (!StringsKt.isBlank(strOooO00o)) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        } else if (num2 != null && num2.intValue() == 2) {
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.verification_code_send_whatsapp);
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
