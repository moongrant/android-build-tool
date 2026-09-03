package p034OoooO0O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o00O000o;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.o00OO0OO;
import p023Oooo00O.o0OO00O;
import p023Oooo00O.oo0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO00O f3552OooO00o = new o0OO00O(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o00OO0O0<OooO, o0OO00O> f3553OooO0O0 = (o00OO0OO) oo0O.OooO00o(OooO00o.f3556Oooo0o, OooO0O0.f3557Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f3554OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final o00O000o<OooO> f3555OooO0Oo;

    public static final class OooO00o extends Lambda implements Function1<OooO, o0OO00O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f3556Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0OO00O invoke(OooO oooO) {
            long j = oooO.f30395OooO00o;
            if (OooOO0.OooO0OO(j)) {
                return new o0OO00O(OooO.OooO0OO(j), OooO.OooO0Oo(j));
            }
            o0OO00O o0oo00o2 = o0O0O00.f3552OooO00o;
            return o0O0O00.f3552OooO00o;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0OO00O, OooO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f3557Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OooO invoke(o0OO00O o0oo00o2) {
            o0OO00O it = o0oo00o2;
            Intrinsics.checkNotNullParameter(it, "it");
            return new OooO(OooOO0.OooO00o(it.f1207OooO00o, it.f1208OooO0O0));
        }
    }

    static {
        long jOooO00o = OooOO0.OooO00o(0.01f, 0.01f);
        f3554OooO0OO = jOooO00o;
        f3555OooO0Oo = new o00O000o<>(new OooO(jOooO00o), 3);
    }
}
