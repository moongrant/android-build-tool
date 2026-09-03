package p601o0oo00Oo;

import android.os.Looper;
import android.widget.EditText;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import p074o000O0oo.OooOOO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000o0 extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EditText f48250Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(EditText editText) {
        super(4);
        this.f48250Oooo0o = editText;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        CharSequence charSequenceTrim;
        CharSequence charSequence2 = charSequence;
        num.intValue();
        num2.intValue();
        num3.intValue();
        EditText tvContent = this.f48250Oooo0o;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        Intrinsics.checkNotNullParameter(tvContent, "<this>");
        if (Intrinsics.areEqual(charSequence2, ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
            tvContent.setText(StringsKt.trim(charSequence2));
        }
        EditText tvContent2 = this.f48250Oooo0o;
        Intrinsics.checkNotNullExpressionValue(tvContent2, "tvContent");
        Intrinsics.checkNotNullParameter(tvContent2, "<this>");
        if ((charSequence2 != null ? charSequence2.length() : 0) > 0) {
            if (((charSequence2 == null || (charSequenceTrim = StringsKt.trim(charSequence2)) == null) ? 0 : charSequenceTrim.length()) == 0) {
                tvContent2.setText(charSequence2 != null ? StringsKt.trim(charSequence2) : null);
            }
        }
        EditText tvContent3 = this.f48250Oooo0o;
        Intrinsics.checkNotNullExpressionValue(tvContent3, "tvContent");
        Intrinsics.checkNotNullParameter(tvContent3, "<this>");
        Intrinsics.checkNotNullParameter("  ", "regex");
        Intrinsics.checkNotNullParameter(ZegoConstants.ZegoVideoDataAuxPublishingStream, "replacement");
        if (charSequence2 != null && StringsKt__StringsKt.contains$default(charSequence2, "  ", false, 2, (Object) null)) {
            String strReplace = new Regex("  ").replace(charSequence2, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            tvContent3.setText(strReplace);
            tvContent3.setSelection(strReplace.length());
        }
        EditText tvContent4 = this.f48250Oooo0o;
        Intrinsics.checkNotNullExpressionValue(tvContent4, "tvContent");
        Intrinsics.checkNotNullParameter(tvContent4, "<this>");
        if ((charSequence2 != null ? charSequence2.length() : 0) >= 60) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.send_moment_poll_item_option_max_char);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
