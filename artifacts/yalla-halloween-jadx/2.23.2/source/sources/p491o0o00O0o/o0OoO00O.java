package p491o0o00O0o;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.account.OooOO0;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p423o0OoO0OO.o00O0O00;
import p423o0OoO0OO.o00O0OOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f49059OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f49059OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        PhoneNumberActivity phoneNumberActivity = this.f49059OooO0Oo;
        if (zBooleanValue) {
            int i = PhoneNumberActivity.f24807OooOoO;
            TextView tvRegister = phoneNumberActivity.OooOoO().f44373OooO;
            Intrinsics.checkNotNullExpressionValue(tvRegister, "tvRegister");
            o000O.OooOOOO(tvRegister);
            TextView tvRegister2 = phoneNumberActivity.OooOoO().f44373OooO;
            Intrinsics.checkNotNullExpressionValue(tvRegister2, "tvRegister");
            String string = o0000.OooO0OO(o000000.sign_up_here);
            int iOooO00o = o0000.OooO00o(o0OOO0o.color_00d8c9);
            OooOO0 clickListener = new OooOO0(phoneNumberActivity);
            Intrinsics.checkNotNullParameter(tvRegister2, "<this>");
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            CharSequence text = tvRegister2.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default(text, string, 0, false, 6, (Object) null);
            int length = string.length() + iIndexOf$default;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tvRegister2.getText());
            o00O0O00 o00o0o01 = new o00O0O00(clickListener);
            if (iIndexOf$default != -1 && length != -1) {
                spannableStringBuilder.setSpan(o00o0o01, iIndexOf$default, length, 33);
            }
            if (iIndexOf$default >= 0) {
                try {
                    int length2 = string.length() + iIndexOf$default;
                    if (length2 > tvRegister2.getText().length()) {
                        length2 = tvRegister2.getText().length();
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf$default, length2, 33);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            tvRegister2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            tvRegister2.setMovementMethod(LinkMovementMethod.getInstance());
            tvRegister2.setHighlightColor(o00O0OOO.OooO00o(o0OOO0o.transparent, tvRegister2));
        } else {
            int i2 = PhoneNumberActivity.f24807OooOoO;
            TextView tvRegister3 = phoneNumberActivity.OooOoO().f44373OooO;
            Intrinsics.checkNotNullExpressionValue(tvRegister3, "tvRegister");
            o000O.OooO0O0(tvRegister3);
        }
        return Unit.INSTANCE;
    }
}
