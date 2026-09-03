package p254o00ooO0O;

import androidx.compose.runtime.Composable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p549o0oO0O0o.o000O;
import p549o0oO0O0o.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public final class o00 {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O f34231Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f34232Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f34233Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O o000o, long j, boolean z) {
            super(0);
            this.f34231Oooo0o = o000o;
            this.f34232Oooo0oO = j;
            this.f34233Oooo0oo = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f34231Oooo0o.OooO00o(this.f34232Oooo0oO, this.f34233Oooo0oo, o000OO00.f44601OooO0O0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f34234Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f34235Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f34236Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, boolean z, int i) {
            super(2);
            this.f34234Oooo0o = j;
            this.f34235Oooo0oO = z;
            this.f34236Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00.OooO00o(this.f34234Oooo0o, this.f34235Oooo0oO, ooo00o, this.f34236Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(long j, boolean z, @Nullable oOO00O ooo00o, int i) {
        int i2;
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1847825797);
        if ((i & 14) == 0) {
            i2 = (ooo00oOooOOo.OooOO0(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ooo00oOooOOo.OooO0OO(z) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && ooo00oOooOOo.OooOo0()) {
            ooo00oOooOOo.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o000O o000oOooO00o = o000OO00.OooO00o(ooo00oOooOOo);
            o00000O0 o00000o1 = new o00000O0(j);
            Boolean boolValueOf = Boolean.valueOf(z);
            ooo00oOooOOo.OooO0o0(1618982084);
            boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o00000o1) | ooo00oOooOOo.Oooo0oo(o000oOooO00o) | ooo00oOooOOo.Oooo0oo(boolValueOf);
            Object objOooO0o = ooo00oOooOOo.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new OooO00o(o000oOooO00o, j, z);
                ooo00oOooOOo.Oooo00o(objOooO0o);
            }
            ooo00oOooOOo.Oooo0o0();
            o00Oo00.OooO0oO((Function0) objOooO0o, ooo00oOooOOo);
        }
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(j, z, i));
    }
}
