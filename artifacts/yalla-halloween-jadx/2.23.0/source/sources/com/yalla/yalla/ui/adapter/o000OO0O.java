package com.yalla.yalla.ui.adapter;

import android.os.Looper;
import android.widget.EditText;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EditText f27546OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(EditText editText) {
        super(4);
        this.f27546OooO0Oo = editText;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        CharSequence charSequenceTrim;
        CharSequence charSequence2 = charSequence;
        num.intValue();
        num2.intValue();
        num3.intValue();
        EditText tvContent = this.f27546OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        Intrinsics.checkNotNullParameter(tvContent, "<this>");
        if (Intrinsics.areEqual(charSequence2, ZegoConstants.ZegoVideoDataAuxPublishingStream)) {
            tvContent.setText(StringsKt.trim(charSequence2));
        }
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        Intrinsics.checkNotNullParameter(tvContent, "<this>");
        if ((charSequence2 != null ? charSequence2.length() : 0) > 0) {
            if (((charSequence2 == null || (charSequenceTrim = StringsKt.trim(charSequence2)) == null) ? 0 : charSequenceTrim.length()) == 0) {
                tvContent.setText(charSequence2 != null ? StringsKt.trim(charSequence2) : null);
            }
        }
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        Intrinsics.checkNotNullParameter(tvContent, "<this>");
        Intrinsics.checkNotNullParameter("  ", "regex");
        Intrinsics.checkNotNullParameter(ZegoConstants.ZegoVideoDataAuxPublishingStream, "replacement");
        if (charSequence2 != null && StringsKt.OooO0o(charSequence2, "  ")) {
            String strReplace = new Regex("  ").replace(charSequence2, ZegoConstants.ZegoVideoDataAuxPublishingStream);
            tvContent.setText(strReplace);
            tvContent.setSelection(strReplace.length());
        }
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        Intrinsics.checkNotNullParameter(tvContent, "<this>");
        if ((charSequence2 != null ? charSequence2.length() : 0) >= 60) {
            String strOooO0O0 = p417o0OoO0.o000O0.OooO0O0(oO00OOo0.send_moment_poll_item_option_max_char, tvContent);
            if (!(strOooO0O0 == null || StringsKt.isBlank(strOooO0O0))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0O0, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
