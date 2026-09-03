package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p027Oooo0o.o000oOoO;
import p043OooooO0.o00;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OOOO0o f46420OooO00o = new o0OOOO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static Function3<o000oOoO, oOO00O, Integer, Unit> f46421OooO0O0 = (o00) o00O0000.OooO0O0(204090571, false, OooO00o.f46422Oooo0o);

    public static final class OooO00o extends Lambda implements Function3<o000oOoO, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f46422Oooo0o = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o000oOoO o000oooo2, oOO00O ooo00o, Integer num) {
            o000oOoO item = o000oooo2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                o0000oo.OooO0OO(12, null, ooo00o2, 6, 2);
            }
            return Unit.INSTANCE;
        }
    }
}
