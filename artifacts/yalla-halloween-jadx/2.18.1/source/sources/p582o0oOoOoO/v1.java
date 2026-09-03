package p582o0oOoOoO;

import android.content.Context;
import androidx.compose.ui.platform.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p261o00ooOoO.u;
import p587o0oOoo0O.oO0OOo0o;
import p587o0oOoo0O.ooOOOOoo;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final v1 f46902OooO00o = new v1();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function2<oOO00O, Integer, Unit> f46903OooO0O0 = (o00) o00O0000.OooO0O0(100011079, false, OooO00o.f46905Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static Function2<oOO00O, Integer, Unit> f46904OooO0OO = (o00) o00O0000.OooO0O0(1801841770, false, OooO0O0.f46906Oooo0o);

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f46905Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                oO0OOo0o.OooO00o.OooO00o(ooOOOOoo.f47088OooO00o, ooo00o2, 6);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f46906Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                int i = ((Context) ooo00o2.OooOO0o(o0O0O00.f6591OooO0O0)).getResources().getDisplayMetrics().widthPixels;
                v1 v1Var = v1.f46902OooO00o;
                u.OooO00o(false, v1.f46903OooO0O0, ooo00o2, 48, 1);
            }
            return Unit.INSTANCE;
        }
    }
}
