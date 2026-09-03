package p032OoooO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f3366OooO00o = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function3<Function2<? super oOO00O, ? super Integer, Unit>, oOO00O, Integer, Unit> f3367OooO0O0 = (o00) o00O0000.OooO0O0(434140383, false, OooO00o.f3369Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static Function3<Function2<? super oOO00O, ? super Integer, Unit>, oOO00O, Integer, Unit> f3368OooO0OO = (o00) o00O0000.OooO0O0(-34833998, false, OooO0O0.f3370Oooo0o);

    public static final class OooO00o extends Lambda implements Function3<Function2<? super oOO00O, ? super Integer, ? extends Unit>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f3369Oooo0o = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super oOO00O, ? super Integer, ? extends Unit> function2, oOO00O ooo00o, Integer num) {
            Function2<? super oOO00O, ? super Integer, ? extends Unit> innerTextField = function2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o2.Oooo0oo(innerTextField) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                innerTextField.invoke(ooo00o2, Integer.valueOf(iIntValue & 14));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<Function2<? super oOO00O, ? super Integer, ? extends Unit>, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f3370Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Function2<? super oOO00O, ? super Integer, ? extends Unit> function2, oOO00O ooo00o, Integer num) {
            Function2<? super oOO00O, ? super Integer, ? extends Unit> innerTextField = function2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((iIntValue & 14) == 0) {
                iIntValue |= ooo00o2.Oooo0oo(innerTextField) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                innerTextField.invoke(ooo00o2, Integer.valueOf(iIntValue & 14));
            }
            return Unit.INSTANCE;
        }
    }
}
