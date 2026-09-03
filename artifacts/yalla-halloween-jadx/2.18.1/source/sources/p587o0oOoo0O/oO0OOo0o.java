package p587o0oOoo0O;

import androidx.compose.runtime.Composable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes3.dex */
public interface oO0OOo0o {

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0oOoo0O.oO0OOo0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0414OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ oO0OOo0o f47062Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ int f47063Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0414OooO00o(oO0OOo0o oo0ooo0o, int i) {
                super(2);
                this.f47062Oooo0o = oo0ooo0o;
                this.f47063Oooo0oO = i;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(oOO00O ooo00o, Integer num) {
                num.intValue();
                this.f47062Oooo0o.OooO0O0(ooo00o, this.f47063Oooo0oO | 1);
                return Unit.INSTANCE;
            }
        }

        @Composable
        public static void OooO00o(@NotNull oO0OOo0o oo0ooo0o, @Nullable oOO00O ooo00o, int i) {
            int i2;
            oOO00O ooo00oOooOOo = ooo00o.OooOOo(1082469183);
            if ((i & 14) == 0) {
                i2 = (ooo00oOooOOo.Oooo0oo(oo0ooo0o) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 11) == 2 && ooo00oOooOOo.OooOo0()) {
                ooo00oOooOOo.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                oo0ooo0o.OooO00o("", ooo00oOooOOo, ((i2 << 3) & 112) | 6);
            }
            oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new C0414OooO00o(oo0ooo0o, i));
        }
    }

    @Composable
    void OooO00o(@NotNull String str, @Nullable oOO00O ooo00o, int i);

    @Composable
    void OooO0O0(@Nullable oOO00O ooo00o, int i);
}
