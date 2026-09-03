package p474o0o00;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.account.OooOO0;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p417o0OoO0.o000;
import p417o0OoO0.o000O0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47286OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f47286OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        boolean zBooleanValue = it.booleanValue();
        PhoneNumberActivity phoneNumberActivity = this.f47286OooO0Oo;
        if (zBooleanValue) {
            int i = PhoneNumberActivity.f25262OooOoO;
            TextView textView = phoneNumberActivity.OooOoO().f59419OooO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvRegister");
            o000OO00.OooOOOO(textView);
            TextView textView2 = phoneNumberActivity.OooOoO().f59419OooO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvRegister");
            String string = o0000.OooO0OO(oO00OOo0.sign_up_here);
            int iOooO00o = o0000.OooO00o(oO00O0o.color_00d8c9);
            OooOO0 clickListener = new OooOO0(phoneNumberActivity);
            Intrinsics.checkNotNullParameter(textView2, "<this>");
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            CharSequence text = textView2.getText();
            Intrinsics.checkNotNullExpressionValue(text, "text");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default(text, string, 0, false, 6, (Object) null);
            int length = string.length() + iIndexOf$default;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView2.getText());
            o000 o000Var = new o000(clickListener);
            if (iIndexOf$default != -1 && length != -1) {
                spannableStringBuilder.setSpan(o000Var, iIndexOf$default, length, 33);
            }
            if (iIndexOf$default >= 0) {
                try {
                    int length2 = string.length() + iIndexOf$default;
                    if (length2 > textView2.getText().length()) {
                        length2 = textView2.getText().length();
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf$default, length2, 33);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            textView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setHighlightColor(o000O0.OooO00o(oO00O0o.transparent, textView2));
        } else {
            int i2 = PhoneNumberActivity.f25262OooOoO;
            TextView textView3 = phoneNumberActivity.OooOoO().f59419OooO;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvRegister");
            o000OO00.OooO0O0(textView3);
        }
        return Unit.INSTANCE;
    }
}
