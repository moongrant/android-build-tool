package o0O0O00;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOO f35231OooO00o = new OooOOO(OooO00o.f35233Oooo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooOOO f35232OooO0O0 = new OooOOO(C0360OooO0O0.f35234Oooo0o);

    public /* synthetic */ class OooO00o extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f35233Oooo0o = new OooO00o();

        public OooO00o() {
            super(2, MathKt.class, "min", "min(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* JADX INFO: renamed from: o0O0O00.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public /* synthetic */ class C0360OooO0O0 extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0360OooO0O0 f35234Oooo0o = new C0360OooO0O0();

        public C0360OooO0O0() {
            super(2, MathKt.class, "max", "max(II)I", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
