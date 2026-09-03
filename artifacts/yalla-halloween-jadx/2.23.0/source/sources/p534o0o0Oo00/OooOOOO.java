package p534o0o0Oo00;

import android.text.Editable;
import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.ui.view.rich_edit_text.AtUserSpan;
import com.yalla.yalla.ui.view.rich_edit_text.RichEditText;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o0O0OOO.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p426o0OoOO.o0OOO0o;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRichTextFieldController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RichTextFieldController.kt\ncom/yalla/yalla/ui/composable/rich_text_filed/RichTextFieldController\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,177:1\n13644#2,3:178\n13579#2,2:181\n*S KotlinDebug\n*F\n+ 1 RichTextFieldController.kt\ncom/yalla/yalla/ui/composable/rich_text_filed/RichTextFieldController\n*L\n140#1:178,3\n165#1:181,2\n*E\n"})
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Regex f54849OooO00o = new Regex("/\\[MRF_1000[0-9]{2} ");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f54850OooO0O0 = 200;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f54851OooO0OO = 50;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public RichEditText f54852OooO0Oo;

    public static final class OooO00o extends Lambda implements Function1<MatchResult, CharSequence> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54853OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(MatchResult matchResult) {
            MatchResult it = matchResult;
            Intrinsics.checkNotNullParameter(it, "it");
            return StringsKt.dropLast(it.getValue(), 1);
        }
    }

    public final boolean OooO00o() {
        CharSequence charSequenceTrim;
        Editable text;
        RichEditText richEditText = this.f54852OooO0Oo;
        if (richEditText == null || (text = richEditText.getText()) == null || (charSequenceTrim = StringsKt.trim(text)) == null) {
            charSequenceTrim = "";
        }
        if (charSequenceTrim.length() == 0) {
            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.please_input_dynamic));
            return false;
        }
        if (OooO0Oo() == 0) {
            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.please_input_dynamic));
            return false;
        }
        RichEditText richEditText2 = this.f54852OooO0Oo;
        if ((richEditText2 != null ? richEditText2.getEmojiFaceCount() : 0) > this.f54851OooO0OO) {
            o000O00O.OooO0O0(StringsKt.OooOoO(o0000.OooO0OO(oO00OOo0.char_room_edit1), "50", String.valueOf(this.f54851OooO0OO)));
            return false;
        }
        if (OooO0Oo() <= this.f54850OooO0O0) {
            return true;
        }
        o000O00O.OooO0O0(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Input_a_maximum_of_xxx_characters), o0OOO0o.OooO00o(this.f54850OooO0O0)));
        return false;
    }

    public final void OooO0O0() {
        OooOOO0.OooO0OO("AAQQA", "clear");
        RichEditText richEditText = this.f54852OooO0Oo;
        if (richEditText != null) {
            richEditText.setText("");
        }
    }

    @NotNull
    public final MomentSendContentModel OooO0OO() {
        Spanned spanned;
        AtUserSpan[] atUserSpanArr;
        RichEditText richEditText = this.f54852OooO0Oo;
        Spanned editableText = richEditText != null ? richEditText.getEditableText() : null;
        if (editableText == null) {
            return new MomentSendContentModel("");
        }
        if (editableText.length() == 0) {
            return new MomentSendContentModel("");
        }
        StringBuilder sb = new StringBuilder(editableText);
        AtUserSpan[] atUserSpanArr2 = (AtUserSpan[]) editableText.getSpans(0, editableText.length(), AtUserSpan.class);
        ArrayList arrayList = new ArrayList();
        if (atUserSpanArr2 != null) {
            int length = atUserSpanArr2.length;
            int i = 0;
            int i2 = 0;
            int length2 = 0;
            StringBuilder sb2 = sb;
            while (i < length) {
                AtUserSpan atUserSpan = atUserSpanArr2[i];
                int i3 = i2 + 1;
                int spanStart = editableText.getSpanStart(atUserSpan) - length2;
                int spanEnd = editableText.getSpanEnd(atUserSpan) - length2;
                String strOooO00o = OooO0OO.OooO00o.OooO00o("@{", i2, "}");
                try {
                    StringBuilder sbReplace = sb2.replace(spanStart, spanEnd, strOooO00o);
                    Intrinsics.checkNotNullExpressionValue(sbReplace, "stringBuilder.replace(at…rStart, atUserEnd, atTag)");
                    try {
                        length2 += (spanEnd - spanStart) - strOooO00o.length();
                        spanned = editableText;
                        atUserSpanArr = atUserSpanArr2;
                        try {
                            arrayList.add(new MomentSendContentAtModel(String.valueOf(atUserSpan.f31276OooO0o0), atUserSpan.f31275OooO0o));
                            sb2 = sbReplace;
                        } catch (Exception e) {
                            e = e;
                            sb2 = sbReplace;
                            OooOO0.OooO00o().OooO0O0(new Throwable("message = " + ((Object) sb2) + ", index = " + i2 + ", atUserStart = " + spanStart + ", atUserEnd = " + spanEnd, e));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        spanned = editableText;
                        atUserSpanArr = atUserSpanArr2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    spanned = editableText;
                    atUserSpanArr = atUserSpanArr2;
                }
                i++;
                i2 = i3;
                editableText = spanned;
                atUserSpanArr2 = atUserSpanArr;
            }
            sb = sb2;
        }
        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(this.f54849OooO00o.replace(sb, OooO00o.f54853OooO0Oo));
        momentSendContentModel.setAt(arrayList);
        return momentSendContentModel;
    }

    public final int OooO0Oo() {
        Editable editableText;
        RichEditText richEditText = this.f54852OooO0Oo;
        if (richEditText == null || (editableText = richEditText.getEditableText()) == null) {
            return 0;
        }
        int length = editableText.length();
        RichEditText richEditText2 = this.f54852OooO0Oo;
        int emojiFaceCount = richEditText2 != null ? richEditText2.getEmojiFaceCount() : 0;
        RichEditText richEditText3 = this.f54852OooO0Oo;
        if (richEditText3 != null) {
            richEditText3.getEmojiFaceCount();
        }
        return (length - (emojiFaceCount * 13)) + emojiFaceCount;
    }
}
