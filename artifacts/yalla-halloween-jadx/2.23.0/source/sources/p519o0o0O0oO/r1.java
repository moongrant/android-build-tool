package p519o0o0O0oO;

import androidx.appcompat.widget.AppCompatImageView;
import com.code.android.util.o000OO00;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends Lambda implements Function4<CharSequence, Integer, Integer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t1 f53129OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t1 t1Var) {
        super(4);
        this.f53129OooO0Oo = t1Var;
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
            t1 t1Var = this.f53129OooO0Oo;
            t1Var.OooOOO(length > t1Var.OooOOOO().f58839OooO0oO.currRange, true);
            if (t1Var.OooOOOO().f58834OooO0O0.hasFocus()) {
                if (charSequence2.length() > 0) {
                    AppCompatImageView appCompatImageView = t1Var.OooOOOO().f58835OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.editNumberClear");
                    o000OO00.OooOOOO(appCompatImageView);
                } else {
                    AppCompatImageView appCompatImageView2 = t1Var.OooOOOO().f58835OooO0OO;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.editNumberClear");
                    o000OO00.OooO0O0(appCompatImageView2);
                }
            } else {
                AppCompatImageView appCompatImageView3 = t1Var.OooOOOO().f58835OooO0OO;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.editNumberClear");
                o000OO00.OooO0O0(appCompatImageView3);
            }
        }
        return Unit.INSTANCE;
    }
}
