package o00OO0O;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f31351OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function3<p027Oooo0o.o000oOoO, oOO00O, Integer, Unit> f31352OooO0O0 = (o00) o00O0000.OooO0O0(2095152857, false, C0339OooO00o.f31353Oooo0o);

    /* JADX INFO: renamed from: o00OO0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0339OooO00o extends Lambda implements Function3<p027Oooo0o.o000oOoO, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0339OooO00o f31353Oooo0o = new C0339OooO00o();

        public C0339OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(p027Oooo0o.o000oOoO o000oooo2, oOO00O ooo00o, Integer num) {
            p027Oooo0o.o000oOoO item = o000oooo2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                com.yalla.support.common.util.OooOOOO.OooO0OO(ooo00o2, 0);
            }
            return Unit.INSTANCE;
        }
    }
}
