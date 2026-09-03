package o00000O;

import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p053o00000oO.o0000;
import p053o00000oO.o0000O00;
import p053o00000oO.o0000Ooo;
import p146o00Oo0.o00000O0;
import p146o00Oo0.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final oo0o0Oo OooO00o(@NotNull oo0o0Oo style, @NotNull LayoutDirection layoutDirection) {
        o0000.OooO oooO;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "direction");
        o00Oo0 style2 = style.f26920OooO00o;
        int i = oo000o.f26917OooO0o0;
        Intrinsics.checkNotNullParameter(style2, "style");
        o0000O0.OooOOO0 oooOOO0OooO0OO = style2.f26878OooO00o.OooO0OO(o00Ooo.f26891Oooo);
        long j = o0000O0O.o00Oo0.OooO0Oo(style2.f26879OooO0O0) ? oo000o.f26913OooO00o : style2.f26879OooO0O0;
        o0000O00 o0000o00 = style2.f26880OooO0OO;
        if (o0000o00 == null) {
            o0000O00.OooO00o oooO00o = o0000O00.f27145OoooO00;
            o0000o00 = o0000O00.f27147OoooOO0;
        }
        o0000O00 o0000o01 = o0000o00;
        o0000Ooo o0000ooo = style2.f26881OooO0Oo;
        o0000Ooo o0000ooo2 = new o0000Ooo(o0000ooo != null ? o0000ooo.f27154OooO00o : 0);
        o0000 o0000Var = style2.f26883OooO0o0;
        o0000 o0000Var2 = new o0000(o0000Var != null ? o0000Var.f27129OooO00o : 1);
        p053o00000oO.o000OOo o000ooo2 = style2.f26882OooO0o;
        if (o000ooo2 == null) {
            o00000oO.o000OOo.OooO00o oooO00o2 = p053o00000oO.o000OOo.f27163Oooo;
            o00000oO.o000OOo.OooO00o oooO00o3 = p053o00000oO.o000OOo.f27163Oooo;
            o000ooo2 = p053o00000oO.o000OOo.f27164OoooO00;
        }
        String str = style2.f26884OooO0oO;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j2 = o0000O0O.o00Oo0.OooO0Oo(style2.f26885OooO0oo) ? oo000o.f26914OooO0O0 : style2.f26885OooO0oo;
        o0000O0.OooO00o oooO00o4 = style2.f26877OooO;
        o0000O0.OooO00o oooO00o5 = new o0000O0.OooO00o(oooO00o4 != null ? oooO00o4.f27271OooO00o : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        o0000O0.OooOOO oooOOO = style2.f26886OooOO0;
        if (oooOOO == null) {
            oooOOO = o0000O0.OooOOO.f27285OooO0Oo;
        }
        o0000O0.OooOOO oooOOO2 = oooOOO;
        o0000.OooO oooO2 = style2.f26887OooOO0O;
        if (oooO2 == null) {
            List<o0000.OooOO0> listOooO00o = o0000.OooOOO0.f26588OooO00o.OooO00o();
            ArrayList arrayList = new ArrayList(listOooO00o.size());
            int size = listOooO00o.size();
            int i2 = 0;
            while (i2 < size) {
                arrayList.add(new o0000.OooO0o(listOooO00o.get(i2)));
                i2++;
                size = size;
                listOooO00o = listOooO00o;
            }
            oooO = new o0000.OooO(arrayList);
        } else {
            oooO = oooO2;
        }
        long j3 = style2.f26888OooOO0o;
        o00000O0.OooO00o oooO00o6 = o00000O0.f32084OooO0O0;
        if (!(j3 != o00000O0.f32083OooO)) {
            j3 = oo000o.f26915OooO0OO;
        }
        long j4 = j3;
        o0000O0.OooO oooO3 = style2.f26890OooOOO0;
        if (oooO3 == null) {
            oooO3 = o0000O0.OooO.f27266OooO0OO;
        }
        o0000O0.OooO oooO4 = oooO3;
        o000OO00 o000oo01 = style2.f26889OooOOO;
        if (o000oo01 == null) {
            o000OO00.OooO00o oooO00o7 = o000OO00.f32126OooO0Oo;
            o000oo01 = o000OO00.f32127OooO0o0;
        }
        o00Oo0 o00oo1 = new o00Oo0(oooOOO0OooO0OO, j, o0000o01, o0000ooo2, o0000Var2, o000ooo2, str2, j2, oooO00o5, oooOOO2, oooO, j4, oooO4, o000oo01);
        OooOo00 style3 = style.f26921OooO0O0;
        int i3 = OooOo.f26811OooO0O0;
        Intrinsics.checkNotNullParameter(style3, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "direction");
        o0000O0.OooO0o oooO0o = style3.f26812OooO00o;
        int i4 = 5;
        o0000O0.OooO0o oooO0o2 = new o0000O0.OooO0o(oooO0o != null ? oooO0o.f27281OooO00o : 5);
        o0000O0.OooOO0 oooOO1 = style3.f26813OooO0O0;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (oooOO1 != null && oooOO1.f27282OooO00o == 3) {
            int i5 = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i5 == 1) {
                i4 = 4;
            } else if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (oooOO1 == null) {
            int i6 = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i6 == 1) {
                i4 = 1;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = 2;
            }
        } else {
            i4 = oooOO1.f27282OooO00o;
        }
        o0000O0.OooOO0 oooOO2 = new o0000O0.OooOO0(i4);
        long j5 = o0000O0O.o00Oo0.OooO0Oo(style3.f26814OooO0OO) ? OooOo.f26810OooO00o : style3.f26814OooO0OO;
        o0000O0.OooOOOO oooOOOO = style3.f26815OooO0Oo;
        if (oooOOOO == null) {
            o0000O0.OooOOOO.OooO00o oooO00o8 = o0000O0.OooOOOO.f27289OooO0OO;
            oooOOOO = o0000O0.OooOOOO.f27290OooO0Oo;
        }
        return new oo0o0Oo(o00oo1, new OooOo00(oooO0o2, oooOO2, j5, oooOOOO, style3.f26817OooO0o0, style3.f26816OooO0o), style.f26922OooO0OO);
    }
}
