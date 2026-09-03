package o0000O00;

import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.text.InternalTextApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o00000O.o000000;
import o00000O.o00Oo0;
import o0000O0.OooOOO;
import o0000O0.OooOOO0;
import org.jetbrains.annotations.NotNull;
import p053o00000oO.o0000O00;
import p053o00000oO.o0000Ooo;
import p053o00000oO.o000OOo;
import p053o00000oO.o0Oo0oo;
import p068o0000oo.o000OO;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    @NotNull
    public static final SpannableString OooO00o(@NotNull o00000O.OooO00o oooO00o, @NotNull o0000O0O.OooO density, @NotNull o000OOo.OooO0O0 fontFamilyResolver) {
        OooOOO0 oooO0O0;
        o0000O00 o0000o00;
        int i;
        int i2;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        SpannableString spannableString = new SpannableString(oooO00o.f26756Oooo0o);
        List<o00000O.OooO00o.OooO0O0<o00Oo0>> list = oooO00o.f26757Oooo0oO;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            o00000O.OooO00o.OooO0O0<o00Oo0> oooO0O1 = list.get(i3);
            o00Oo0 o00oo1 = oooO0O1.f26768OooO00o;
            int i4 = oooO0O1.f26769OooO0O0;
            int i5 = oooO0O1.f26770OooO0OO;
            long jOooO0O0 = o00oo1.OooO0O0();
            int i6 = i3;
            long j = o00oo1.f26860OooO0O0;
            o0000O00 o0000o01 = o00oo1.f26861OooO0OO;
            o0000Ooo o0000ooo = o00oo1.f26862OooO0Oo;
            OooOOO oooOOO = o00oo1.f26867OooOO0;
            List<o00000O.OooO00o.OooO0O0<o00Oo0>> list2 = list;
            o0000.OooO oooO = o00oo1.f26868OooOO0O;
            String str2 = str;
            long j2 = o00oo1.f26869OooOO0o;
            int i7 = size;
            o0000O0.OooO oooO2 = o00oo1.f26871OooOOO0;
            if (o00000O0.OooO0Oo(jOooO0O0, o00oo1.OooO0O0())) {
                oooO0O0 = o00oo1.f26859OooO00o;
            } else {
                o00000O0.OooO00o oooO00o2 = o00000O0.f32063OooO0O0;
                oooO0O0 = (jOooO0O0 > o00000O0.f32062OooO ? 1 : (jOooO0O0 == o00000O0.f32062OooO ? 0 : -1)) != 0 ? new o0000O0.OooO0O0(jOooO0O0) : OooOOO0.OooO00o.f27268OooO00o;
            }
            o000OO.OooO0OO(spannableString, oooO0O0.OooO00o(), i4, i5);
            o000OO.OooO0Oo(spannableString, j, density, i4, i5);
            if (o0000o01 == null && o0000ooo == null) {
                i2 = 33;
            } else {
                if (o0000o01 == null) {
                    o0000O00.OooO00o oooO00o3 = o0000O00.f27125Oooo0oO;
                    o0000o00 = o0000O00.f27128OoooO0;
                }
                if (o0000ooo != null) {
                    o0000o00 = o0000o01;
                    i = o0000ooo.f27135OooO00o;
                } else {
                    o0000o00 = o0000o01;
                    i = 0;
                }
                StyleSpan styleSpan = new StyleSpan(o0Oo0oo.OooO0O0(o0000o00, i));
                i2 = 33;
                spannableString.setSpan(styleSpan, i4, i5, 33);
            }
            if (oooO2 != null) {
                if (oooO2.OooO00o(o0000O0.OooO.f27247OooO0Oo)) {
                    spannableString.setSpan(new UnderlineSpan(), i4, i5, i2);
                }
                if (oooO2.OooO00o(o0000O0.OooO.f27248OooO0o0)) {
                    spannableString.setSpan(new StrikethroughSpan(), i4, i5, i2);
                }
            }
            if (oooOOO != null) {
                spannableString.setSpan(new ScaleXSpan(oooOOO.f27266OooO00o), i4, i5, i2);
            }
            o000OO.OooO0o0(spannableString, oooO, i4, i5);
            o000OO.OooO0O0(spannableString, j2, i4, i5);
            i3 = i6 + 1;
            list = list2;
            str = str2;
            size = i7;
        }
        String str3 = str;
        int length = oooO00o.length();
        List<o00000O.OooO00o.OooO0O0<? extends Object>> list3 = oooO00o.f26755Oooo;
        ArrayList arrayList = new ArrayList(list3.size());
        int size2 = list3.size();
        for (int i8 = 0; i8 < size2; i8++) {
            o00000O.OooO00o.OooO0O0<? extends Object> oooO0O2 = list3.get(i8);
            o00000O.OooO00o.OooO0O0<? extends Object> oooO0O3 = oooO0O2;
            if ((oooO0O3.f26768OooO00o instanceof o00000O.o000OOo) && o00000O.OooO0O0.OooO0OO(0, length, oooO0O3.f26769OooO0O0, oooO0O3.f26770OooO0OO)) {
                arrayList.add(oooO0O2);
            }
        }
        int size3 = arrayList.size();
        int i9 = 0;
        while (i9 < size3) {
            o00000O.OooO00o.OooO0O0 oooO0O4 = (o00000O.OooO00o.OooO0O0) arrayList.get(i9);
            o00000O.o000OOo o000ooo2 = (o00000O.o000OOo) oooO0O4.f26768OooO00o;
            int i10 = oooO0O4.f26769OooO0O0;
            int i11 = oooO0O4.f26770OooO0OO;
            String str4 = str3;
            Intrinsics.checkNotNullParameter(o000ooo2, str4);
            if (!(o000ooo2 instanceof o000000)) {
                throw new NoWhenBranchMatchedException();
            }
            o000000 o000000Var = (o000000) o000ooo2;
            Intrinsics.checkNotNullParameter(o000000Var, str4);
            TtsSpan ttsSpanBuild = new TtsSpan.VerbatimBuilder(o000000Var.f26803OooO00o).build();
            Intrinsics.checkNotNullExpressionValue(ttsSpanBuild, "builder.build()");
            spannableString.setSpan(ttsSpanBuild, i10, i11, 33);
            i9++;
            str3 = str4;
        }
        return spannableString;
    }
}
