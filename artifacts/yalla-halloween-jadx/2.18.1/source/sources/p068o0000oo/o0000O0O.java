package p068o0000oo;

import android.graphics.Typeface;
import android.text.Spannable;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000O.o00Oo0;
import p052o00000o0.o0000oo;
import p053o00000oO.o0000;
import p053o00000oO.o0000O00;
import p053o00000oO.o0000Ooo;
import p053o00000oO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O extends Lambda implements Function3<o00Oo0, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Spannable f27949Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function4<o000OOo, o0000O00, o0000Ooo, o0000, Typeface> f27950Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000O0O(Spannable spannable, Function4<? super o000OOo, ? super o0000O00, ? super o0000Ooo, ? super o0000, ? extends Typeface> function4) {
        super(3);
        this.f27949Oooo0o = spannable;
        this.f27950Oooo0oO = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00Oo0 o00oo1, Integer num, Integer num2) {
        o00Oo0 spanStyle = o00oo1;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        Spannable spannable = this.f27949Oooo0o;
        Function4<o000OOo, o0000O00, o0000Ooo, o0000, Typeface> function4 = this.f27950Oooo0oO;
        o000OOo o000ooo2 = spanStyle.f26863OooO0o;
        o0000O00 o0000o00 = spanStyle.f26861OooO0OO;
        if (o0000o00 == null) {
            o0000O00.OooO00o oooO00o = o0000O00.f27125Oooo0oO;
            o0000o00 = o0000O00.f27128OoooO0;
        }
        o0000Ooo o0000ooo = spanStyle.f26862OooO0Oo;
        o0000Ooo o0000ooo2 = new o0000Ooo(o0000ooo != null ? o0000ooo.f27135OooO00o : 0);
        o0000 o0000Var = spanStyle.f26864OooO0o0;
        spannable.setSpan(new o0000oo(function4.invoke(o000ooo2, o0000o00, o0000ooo2, new o0000(o0000Var != null ? o0000Var.f27110OooO00o : 1))), iIntValue, iIntValue2, 33);
        return Unit.INSTANCE;
    }
}
