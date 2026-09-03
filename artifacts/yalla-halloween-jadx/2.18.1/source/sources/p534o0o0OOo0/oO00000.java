package p534o0o0OOo0;

import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.o0OO00O;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00000 implements o0OO00O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43605OooO00o;

    public oO00000(SmsCodeActivity smsCodeActivity) {
        this.f43605OooO00o = smsCodeActivity;
    }

    @Override // o00Ooo0.o0OO00O.OooO00o
    public final void OooO00o(long j, @NotNull String phoneNumnber) {
        Intrinsics.checkNotNullParameter(phoneNumnber, "phoneNumnber");
        if (OooO0OO.OooO00o(phoneNumnber) || !Intrinsics.areEqual(phoneNumnber, this.f43605OooO00o.f21851OooooOo)) {
            return;
        }
        SmsCodeActivity smsCodeActivity = this.f43605OooO00o;
        if (smsCodeActivity.f21854OoooooO != 2 || !smsCodeActivity.f21855Ooooooo) {
            smsCodeActivity.Oooo0().f50761OooO.setEnabled(false);
            this.f43605OooO00o.Oooo0().f50761OooO.setTextColor(o000O0O0.OooO00o(R.color.color_alpha_38));
            this.f43605OooO00o.Oooo0().f50761OooO.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.Resend_SMS_xxx), String.valueOf(j / ((long) 1000))));
            return;
        }
        TextView textView = smsCodeActivity.Oooo0().f50776OooOOOo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSmsTime");
        o00O0O.OooO(textView);
        TextView textView2 = this.f43605OooO00o.Oooo0().f50781OooOo00;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvWhatsAppTime");
        o00O0O.OooO(textView2);
        this.f43605OooO00o.Oooo0().f50775OooOOOO.setEnabled(false);
        this.f43605OooO00o.Oooo0().f50779OooOOoo.setEnabled(false);
        this.f43605OooO00o.Oooo0().f50770OooOO0.setEnabled(false);
        TextView textView3 = this.f43605OooO00o.Oooo0().f50776OooOOOo;
        StringBuilder sb = new StringBuilder();
        long j2 = j / ((long) 1000);
        sb.append(j2);
        sb.append('s');
        textView3.setText(sb.toString());
        TextView textView4 = this.f43605OooO00o.Oooo0().f50781OooOo00;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j2);
        sb2.append('s');
        textView4.setText(sb2.toString());
        this.f43605OooO00o.Oooo0().f50775OooOOOO.setTextColor(o000O0O0.OooO00o(R.color.color_CCCCCC));
        this.f43605OooO00o.Oooo0().f50776OooOOOo.setTextColor(o000O0O0.OooO00o(R.color.color_CCCCCC));
        this.f43605OooO00o.Oooo0().f50779OooOOoo.setTextColor(o000O0O0.OooO00o(R.color.color_CCCCCC));
        this.f43605OooO00o.Oooo0().f50781OooOo00.setTextColor(o000O0O0.OooO00o(R.color.color_CCCCCC));
        this.f43605OooO00o.Oooo0().f50764OooO0OO.setBackgroundResource(R.drawable.account_sms_send);
        this.f43605OooO00o.Oooo0().f50765OooO0Oo.setBackgroundResource(R.drawable.account_whats_app_send);
        SmsCodeActivity smsCodeActivity2 = this.f43605OooO00o;
        if (smsCodeActivity2.f21852Oooooo) {
            smsCodeActivity2.Oooo0().f50764OooO0OO.setBackgroundResource(R.drawable.account_whats_app_send);
            this.f43605OooO00o.Oooo0().f50765OooO0Oo.setBackgroundResource(R.drawable.account_sms_send);
        }
    }

    @Override // o00Ooo0.o0OO00O.OooO00o
    public final void OooO0O0() {
        o0OO00O.f32654OooO0O0 = null;
        SmsCodeActivity smsCodeActivity = this.f43605OooO00o;
        if (smsCodeActivity.f21854OoooooO != 2 || !smsCodeActivity.f21855Ooooooo) {
            smsCodeActivity.Oooo0().f50761OooO.setEnabled(true);
            this.f43605OooO00o.Oooo0().f50761OooO.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
            this.f43605OooO00o.Oooo0().f50761OooO.setText(R.string.Resend_SMS);
            return;
        }
        TextView textView = smsCodeActivity.Oooo0().f50776OooOOOo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSmsTime");
        o00O0O.OooO00o(textView);
        TextView textView2 = this.f43605OooO00o.Oooo0().f50781OooOo00;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvWhatsAppTime");
        o00O0O.OooO00o(textView2);
        this.f43605OooO00o.Oooo0().f50775OooOOOO.setEnabled(true);
        this.f43605OooO00o.Oooo0().f50779OooOOoo.setEnabled(true);
        this.f43605OooO00o.Oooo0().f50770OooOO0.setEnabled(true);
        this.f43605OooO00o.Oooo0().f50775OooOOOO.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
        this.f43605OooO00o.Oooo0().f50779OooOOoo.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
        this.f43605OooO00o.Oooo0().f50764OooO0OO.setBackgroundResource(R.drawable.account_sms);
        this.f43605OooO00o.Oooo0().f50765OooO0Oo.setBackgroundResource(R.drawable.account_whats_app);
        SmsCodeActivity smsCodeActivity2 = this.f43605OooO00o;
        if (smsCodeActivity2.f21852Oooooo) {
            smsCodeActivity2.Oooo0().f50764OooO0OO.setBackgroundResource(R.drawable.account_whats_app);
            this.f43605OooO00o.Oooo0().f50765OooO0Oo.setBackgroundResource(R.drawable.account_sms);
        }
    }
}
