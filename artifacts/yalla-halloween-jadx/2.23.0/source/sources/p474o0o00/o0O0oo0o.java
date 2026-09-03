package p474o0o00;

import android.widget.ImageView;
import android.widget.TextView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oOOO00;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo0o implements oOOO00.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f47323OooO00o;

    public o0O0oo0o(SmsCodeActivity smsCodeActivity) {
        this.f47323OooO00o = smsCodeActivity;
    }

    @Override // o0oOoo.oOOO00.OooO00o
    public final void OooO00o() {
        oOOO00.f56669OooO0O0 = null;
        SmsCodeActivity smsCodeActivity = this.f47323OooO00o;
        if (smsCodeActivity.f25307OooOoOO != 2 || !smsCodeActivity.f25309OooOoo0) {
            smsCodeActivity.OooOooO().f57869OooO.setEnabled(true);
            smsCodeActivity.OooOooO().f57869OooO.setTextColor(o0000.OooO00o(oO00O0o.color_00d8c9));
            smsCodeActivity.OooOooO().f57869OooO.setText(oO00OOo0.Resend_SMS);
            return;
        }
        TextView textView = smsCodeActivity.OooOooO().f57884OooOOOo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSmsTime");
        o000OO00.OooO0O0(textView);
        TextView textView2 = smsCodeActivity.OooOooO().f57889OooOo00;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvWhatsAppTime");
        o000OO00.OooO0O0(textView2);
        smsCodeActivity.OooOooO().f57883OooOOOO.setEnabled(true);
        smsCodeActivity.OooOooO().f57887OooOOoo.setEnabled(true);
        smsCodeActivity.OooOooO().f57878OooOO0.setEnabled(true);
        TextView textView3 = smsCodeActivity.OooOooO().f57883OooOOOO;
        int i = oO00O0o.color_00d8c9;
        textView3.setTextColor(o0000.OooO00o(i));
        smsCodeActivity.OooOooO().f57887OooOOoo.setTextColor(o0000.OooO00o(i));
        ImageView imageView = smsCodeActivity.OooOooO().f57872OooO0OO;
        int i2 = oOo00OO0.account_sms;
        imageView.setBackgroundResource(i2);
        ImageView imageView2 = smsCodeActivity.OooOooO().f57873OooO0Oo;
        int i3 = oOo00OO0.account_whats_app;
        imageView2.setBackgroundResource(i3);
        if (smsCodeActivity.f25305OooOoO) {
            smsCodeActivity.OooOooO().f57872OooO0OO.setBackgroundResource(i3);
            smsCodeActivity.OooOooO().f57873OooO0Oo.setBackgroundResource(i2);
        }
    }

    @Override // o0oOoo.oOOO00.OooO00o
    public final void OooO0O0(long j, @NotNull String phoneNumnber) {
        Intrinsics.checkNotNullParameter(phoneNumnber, "phoneNumnber");
        if (OooOo00.OooO00o(phoneNumnber)) {
            return;
        }
        SmsCodeActivity smsCodeActivity = this.f47323OooO00o;
        if (Intrinsics.areEqual(phoneNumnber, smsCodeActivity.f25300OooOo)) {
            if (smsCodeActivity.f25307OooOoOO != 2 || !smsCodeActivity.f25309OooOoo0) {
                smsCodeActivity.OooOooO().f57869OooO.setEnabled(false);
                smsCodeActivity.OooOooO().f57869OooO.setTextColor(o0000.OooO00o(oO00O0o.color_alpha_38));
                smsCodeActivity.OooOooO().f57869OooO.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Resend_SMS_xxx), String.valueOf(j / ((long) 1000))));
                return;
            }
            TextView textView = smsCodeActivity.OooOooO().f57884OooOOOo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSmsTime");
            o000OO00.OooOOOO(textView);
            TextView textView2 = smsCodeActivity.OooOooO().f57889OooOo00;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvWhatsAppTime");
            o000OO00.OooOOOO(textView2);
            smsCodeActivity.OooOooO().f57883OooOOOO.setEnabled(false);
            smsCodeActivity.OooOooO().f57887OooOOoo.setEnabled(false);
            smsCodeActivity.OooOooO().f57878OooOO0.setEnabled(false);
            long j2 = j / ((long) 1000);
            smsCodeActivity.OooOooO().f57884OooOOOo.setText(j2 + "s");
            smsCodeActivity.OooOooO().f57889OooOo00.setText(j2 + "s");
            TextView textView3 = smsCodeActivity.OooOooO().f57883OooOOOO;
            int i = oO00O0o.color_CCCCCC;
            textView3.setTextColor(o0000.OooO00o(i));
            smsCodeActivity.OooOooO().f57884OooOOOo.setTextColor(o0000.OooO00o(i));
            smsCodeActivity.OooOooO().f57887OooOOoo.setTextColor(o0000.OooO00o(i));
            smsCodeActivity.OooOooO().f57889OooOo00.setTextColor(o0000.OooO00o(i));
            ImageView imageView = smsCodeActivity.OooOooO().f57872OooO0OO;
            int i2 = oOo00OO0.account_sms_send;
            imageView.setBackgroundResource(i2);
            ImageView imageView2 = smsCodeActivity.OooOooO().f57873OooO0Oo;
            int i3 = oOo00OO0.account_whats_app_send;
            imageView2.setBackgroundResource(i3);
            if (smsCodeActivity.f25305OooOoO) {
                smsCodeActivity.OooOooO().f57872OooO0OO.setBackgroundResource(i3);
                smsCodeActivity.OooOooO().f57873OooO0Oo.setBackgroundResource(i2);
            }
        }
    }
}
