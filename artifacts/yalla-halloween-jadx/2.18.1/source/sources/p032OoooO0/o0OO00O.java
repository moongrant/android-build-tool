package p032OoooO0;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import o00000O.o0OOO0o;
import o0000O0O.o000oOoO;
import o0O0O00.OooO0O0;
import o0O0O00.OooOOOO;
import o0O0O00.OooOo00;
import o0O0O00.o000000;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o000OOo;
import o0O0O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import p047Oooooo0.oo00o;
import p047Oooooo0.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f3362OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Function1<o0OOO0o, Unit> f3363OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f3364Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0OO00O(o0O0000O o0o0000o2, Function1<? super o0OOO0o, Unit> function1) {
        this.f3362OooO00o = o0o0000o2;
        this.f3363OooO0O0 = function1;
    }

    @Override // o0O0O00.o000000
    @NotNull
    public final o000000O OooO00o(@NotNull o00000O0 measure, @NotNull List<? extends o0O0O00> measurables, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        o0O0000O o0o0000o2 = this.f3362OooO00o;
        oo00o oo00oVarOooO0oO = oo0o0O0.OooO0oO(oo0o0O0.f4157OooO0O0.OooO00o(), null, false);
        try {
            oo00o oo00oVarOooO = oo00oVarOooO0oO.OooO();
            try {
                o0O000 o0o000OooO0OO = o0o0000o2.OooO0OO();
                o0OOO0o o0ooo0o2 = o0o000OooO0OO != null ? o0o000OooO0OO.f3314OooO00o : null;
                oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                oo00oVarOooO0oO.OooO0OO();
                oOO00O textDelegate = this.f3362OooO00o.f3319OooO00o;
                LayoutDirection layoutDirection = measure.getLayoutDirection();
                Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                o0OOO0o o0ooo0oOooO0OO = textDelegate.OooO0OO(j, layoutDirection, o0ooo0o2);
                Triple triple = new Triple(Integer.valueOf((int) (o0ooo0oOooO0OO.f26879OooO0OO >> 32)), Integer.valueOf(o000oOoO.OooO0O0(o0ooo0oOooO0OO.f26879OooO0OO)), o0ooo0oOooO0OO);
                int iIntValue = ((Number) triple.component1()).intValue();
                int iIntValue2 = ((Number) triple.component2()).intValue();
                o0OOO0o o0ooo0o3 = (o0OOO0o) triple.component3();
                if (!Intrinsics.areEqual(o0ooo0o2, o0ooo0o3)) {
                    this.f3362OooO00o.f3325OooO0oO.setValue(new o0O000(o0ooo0o3));
                    this.f3363OooO0O0.invoke(o0ooo0o3);
                }
                return measure.OooOooo(iIntValue, iIntValue2, MapsKt.mapOf(TuplesKt.to(OooO0O0.f35231OooO00o, Integer.valueOf(MathKt.roundToInt(o0ooo0o3.f26880OooO0Oo))), TuplesKt.to(OooO0O0.f35232OooO0O0, Integer.valueOf(MathKt.roundToInt(o0ooo0o3.f26882OooO0o0)))), OooO00o.f3364Oooo0o);
            } catch (Throwable th) {
                oo00oVarOooO0oO.OooOOOo(oo00oVarOooO);
                throw th;
            }
        } catch (Throwable th2) {
            oo00oVarOooO0oO.OooO0OO();
            throw th2;
        }
    }

    @Override // o0O0O00.o000000
    public final /* synthetic */ int OooO0O0(OooOo00 oooOo00, List list, int i) {
        return o000OOo.OooO0Oo(this, oooOo00, list, i);
    }

    @Override // o0O0O00.o000000
    public final int OooO0OO(@NotNull OooOo00 oooOo00, @NotNull List<? extends OooOOOO> measurables, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        this.f3362OooO00o.f3319OooO00o.OooO0Oo(LayoutNode.this.f6152OooooO0);
        return this.f3362OooO00o.f3319OooO00o.OooO00o();
    }

    @Override // o0O0O00.o000000
    public final /* synthetic */ int OooO0Oo(OooOo00 oooOo00, List list, int i) {
        return o000OOo.OooO00o(this, oooOo00, list, i);
    }

    @Override // o0O0O00.o000000
    public final /* synthetic */ int OooO0o0(OooOo00 oooOo00, List list, int i) {
        return o000OOo.OooO0OO(this, oooOo00, list, i);
    }
}
