package o00000OO;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Pair<Integer, Integer> f27067OooO00o = new Pair<>(0, 0);

    @NotNull
    public static final TextDirectionHeuristic OooO00o(int i) {
        if (i == 0) {
            TextDirectionHeuristic LTR = TextDirectionHeuristics.LTR;
            Intrinsics.checkNotNullExpressionValue(LTR, "LTR");
            return LTR;
        }
        if (i == 1) {
            TextDirectionHeuristic RTL = TextDirectionHeuristics.RTL;
            Intrinsics.checkNotNullExpressionValue(RTL, "RTL");
            return RTL;
        }
        if (i == 2) {
            TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR;
        }
        if (i == 3) {
            TextDirectionHeuristic FIRSTSTRONG_RTL = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_RTL, "FIRSTSTRONG_RTL");
            return FIRSTSTRONG_RTL;
        }
        if (i == 4) {
            TextDirectionHeuristic ANYRTL_LTR = TextDirectionHeuristics.ANYRTL_LTR;
            Intrinsics.checkNotNullExpressionValue(ANYRTL_LTR, "ANYRTL_LTR");
            return ANYRTL_LTR;
        }
        if (i != 5) {
            TextDirectionHeuristic FIRSTSTRONG_LTR2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR2, "FIRSTSTRONG_LTR");
            return FIRSTSTRONG_LTR2;
        }
        TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
        Intrinsics.checkNotNullExpressionValue(LOCALE, "LOCALE");
        return LOCALE;
    }
}
