package p650o0ooo;

import androidx.appcompat.widget.AppCompatImageView;
import com.code.android.util.o000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f59173OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(w1 w1Var) {
        super(4);
        this.f59173OooO0Oo = w1Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        CharSequence charSequence2 = charSequence;
        num.intValue();
        num2.intValue();
        num3.intValue();
        if (charSequence2 != null) {
            int length = charSequence2.length();
            w1 w1Var = this.f59173OooO0Oo;
            w1Var.OooOOO(length > w1Var.OooOOOO().f44441OooO0oO.currRange, true);
            if (w1Var.OooOOOO().f44436OooO0O0.hasFocus()) {
                if (charSequence2.length() > 0) {
                    AppCompatImageView editNumberClear = w1Var.OooOOOO().f44437OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(editNumberClear, "editNumberClear");
                    o000O.OooOOOO(editNumberClear);
                } else {
                    AppCompatImageView editNumberClear2 = w1Var.OooOOOO().f44437OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(editNumberClear2, "editNumberClear");
                    o000O.OooO0O0(editNumberClear2);
                }
            } else {
                AppCompatImageView editNumberClear3 = w1Var.OooOOOO().f44437OooO0OO;
                Intrinsics.checkNotNullExpressionValue(editNumberClear3, "editNumberClear");
                o000O.OooO0O0(editNumberClear3);
            }
        }
        return Unit.INSTANCE;
    }
}
