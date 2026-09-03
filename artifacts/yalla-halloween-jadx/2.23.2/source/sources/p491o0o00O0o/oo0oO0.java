package p491o0o00O0o;

import android.widget.ImageView;
import android.widget.TextView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oO0 implements s0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f49079OooO00o;

    public oo0oO0(SmsCodeActivity smsCodeActivity) {
        this.f49079OooO00o = smsCodeActivity;
    }

    @Override // o0oOooo0.s0.OooO00o
    public final void OooO00o() {
        s0.f57274OooO0O0 = null;
        SmsCodeActivity smsCodeActivity = this.f49079OooO00o;
        if (smsCodeActivity.f24852OooOoOO != 2 || !smsCodeActivity.f24854OooOoo0) {
            smsCodeActivity.OooOooO().f44285OooO.setEnabled(true);
            smsCodeActivity.OooOooO().f44285OooO.setTextColor(o0000.OooO00o(o0OOO0o.color_00d8c9));
            smsCodeActivity.OooOooO().f44285OooO.setText(o000000.Resend_SMS);
            return;
        }
        TextView tvSmsTime = smsCodeActivity.OooOooO().f44300OooOOOo;
        Intrinsics.checkNotNullExpressionValue(tvSmsTime, "tvSmsTime");
        o000O.OooO0O0(tvSmsTime);
        TextView tvWhatsAppTime = smsCodeActivity.OooOooO().f44305OooOo00;
        Intrinsics.checkNotNullExpressionValue(tvWhatsAppTime, "tvWhatsAppTime");
        o000O.OooO0O0(tvWhatsAppTime);
        smsCodeActivity.OooOooO().f44299OooOOOO.setEnabled(true);
        smsCodeActivity.OooOooO().f44303OooOOoo.setEnabled(true);
        smsCodeActivity.OooOooO().f44294OooOO0.setEnabled(true);
        TextView textView = smsCodeActivity.OooOooO().f44299OooOOOO;
        int i = o0OOO0o.color_00d8c9;
        textView.setTextColor(o0000.OooO00o(i));
        smsCodeActivity.OooOooO().f44303OooOOoo.setTextColor(o0000.OooO00o(i));
        ImageView imageView = smsCodeActivity.OooOooO().f44288OooO0OO;
        int i2 = o0Oo0oo.account_sms;
        imageView.setBackgroundResource(i2);
        ImageView imageView2 = smsCodeActivity.OooOooO().f44289OooO0Oo;
        int i3 = o0Oo0oo.account_whats_app;
        imageView2.setBackgroundResource(i3);
        if (smsCodeActivity.f24850OooOoO) {
            smsCodeActivity.OooOooO().f44288OooO0OO.setBackgroundResource(i3);
            smsCodeActivity.OooOooO().f44289OooO0Oo.setBackgroundResource(i2);
        }
    }

    @Override // o0oOooo0.s0.OooO00o
    public final void OooO0O0(long j, @NotNull String phoneNumnber) {
        Intrinsics.checkNotNullParameter(phoneNumnber, "phoneNumnber");
        if (OooOo00.OooO00o(phoneNumnber)) {
            return;
        }
        SmsCodeActivity smsCodeActivity = this.f49079OooO00o;
        if (Intrinsics.areEqual(phoneNumnber, smsCodeActivity.f24845OooOo)) {
            if (smsCodeActivity.f24852OooOoOO != 2 || !smsCodeActivity.f24854OooOoo0) {
                smsCodeActivity.OooOooO().f44285OooO.setEnabled(false);
                smsCodeActivity.OooOooO().f44285OooO.setTextColor(o0000.OooO00o(o0OOO0o.color_alpha_38));
                smsCodeActivity.OooOooO().f44285OooO.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.Resend_SMS_xxx), String.valueOf(j / ((long) 1000))));
                return;
            }
            TextView tvSmsTime = smsCodeActivity.OooOooO().f44300OooOOOo;
            Intrinsics.checkNotNullExpressionValue(tvSmsTime, "tvSmsTime");
            o000O.OooOOOO(tvSmsTime);
            TextView tvWhatsAppTime = smsCodeActivity.OooOooO().f44305OooOo00;
            Intrinsics.checkNotNullExpressionValue(tvWhatsAppTime, "tvWhatsAppTime");
            o000O.OooOOOO(tvWhatsAppTime);
            smsCodeActivity.OooOooO().f44299OooOOOO.setEnabled(false);
            smsCodeActivity.OooOooO().f44303OooOOoo.setEnabled(false);
            smsCodeActivity.OooOooO().f44294OooOO0.setEnabled(false);
            long j2 = j / ((long) 1000);
            smsCodeActivity.OooOooO().f44300OooOOOo.setText(j2 + "s");
            smsCodeActivity.OooOooO().f44305OooOo00.setText(j2 + "s");
            TextView textView = smsCodeActivity.OooOooO().f44299OooOOOO;
            int i = o0OOO0o.color_CCCCCC;
            textView.setTextColor(o0000.OooO00o(i));
            smsCodeActivity.OooOooO().f44300OooOOOo.setTextColor(o0000.OooO00o(i));
            smsCodeActivity.OooOooO().f44303OooOOoo.setTextColor(o0000.OooO00o(i));
            smsCodeActivity.OooOooO().f44305OooOo00.setTextColor(o0000.OooO00o(i));
            ImageView imageView = smsCodeActivity.OooOooO().f44288OooO0OO;
            int i2 = o0Oo0oo.account_sms_send;
            imageView.setBackgroundResource(i2);
            ImageView imageView2 = smsCodeActivity.OooOooO().f44289OooO0Oo;
            int i3 = o0Oo0oo.account_whats_app_send;
            imageView2.setBackgroundResource(i3);
            if (smsCodeActivity.f24850OooOoO) {
                smsCodeActivity.OooOooO().f44288OooO0OO.setBackgroundResource(i3);
                smsCodeActivity.OooOooO().f44289OooO0Oo.setBackgroundResource(i2);
            }
        }
    }
}
