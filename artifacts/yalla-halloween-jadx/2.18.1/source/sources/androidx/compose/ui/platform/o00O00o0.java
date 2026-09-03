package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o;
import p100o000oOoO.o0O0O0o0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
public final class o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O00o0 f6471OooO00o = new o00O00o0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00OO0O0> f6472OooO0O0 = (p100o000oOoO.o00OOOOo) p100o000oOoO.o00OO0O0.OooO0O0(o.f29323OooO00o, OooO00o.f6473Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<o00OO0O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6473Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ o00OO0O0 invoke() {
            return null;
        }
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final o00OO0O0 OooO00o(@Nullable p100o000oOoO.oOO00O ooo00o) {
        ooo00o.OooO0o0(-1059476185);
        o00OO0O0 o00oo0o1 = (o00OO0O0) ooo00o.OooOO0o(f6472OooO0O0);
        if (o00oo0o1 == null) {
            ooo00o.OooO0o0(1835581880);
            p054o00000oo.o00OO000 o00oo001 = (p054o00000oo.o00OO000) ooo00o.OooOO0o(o000.f6361OooOO0o);
            if (o00oo001 == null) {
                ooo00o.Oooo0o0();
                o00oo0o1 = null;
            } else {
                ooo00o.OooO0o0(1157296644);
                boolean zOooo0oo = ooo00o.Oooo0oo(o00oo001);
                Object objOooO0o = ooo00o.OooO0o();
                if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = new o000O0o(o00oo001);
                    ooo00o.Oooo00o(objOooO0o);
                }
                ooo00o.Oooo0o0();
                o00oo0o1 = (o000O0o) objOooO0o;
                ooo00o.Oooo0o0();
            }
        }
        ooo00o.Oooo0o0();
        return o00oo0o1;
    }
}
