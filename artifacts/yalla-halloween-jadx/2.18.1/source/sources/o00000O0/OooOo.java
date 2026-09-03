package o00000O0;

import java.util.Map;
import java.util.Objects;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import o000000.o00000;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends o000000.o00Oo0<OooOo, Oooo000> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(@NotNull o000000.oo000o wrapped, @NotNull Oooo000 modifier) {
        super(wrapped, modifier);
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
    }

    @Override // o000000.o00Oo0
    public final void OooO00o() {
        this.f26651Oooo = true;
        o00000 o00000Var = this.f26652Oooo0o.f26702OoooO00.f6143OoooO0O;
        if (o00000Var != null) {
            o00000Var.OooOOO();
        }
    }

    @Override // o000000.o00Oo0
    public final void OooO0O0() {
        this.f26651Oooo = false;
        o00000 o00000Var = this.f26652Oooo0o.f26702OoooO00.f6143OoooO0O;
        if (o00000Var != null) {
            o00000Var.OooOOO();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map<o00000O0.o0Oo0oo<?>, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.LinkedHashMap, java.util.Map<o00000O0.o0Oo0oo<?>, java.lang.Object>] */
    @NotNull
    public final OooOOOO OooO0OO() {
        OooOo oooOo = (OooOo) this.f26654Oooo0oo;
        OooOo oooOo2 = null;
        if (oooOo == null) {
            o000000.oo000o oo000oVarO00000Oo = this.f26652Oooo0o.o00000Oo();
            if (oo000oVarO00000Oo != null) {
                while (oo000oVarO00000Oo != null && !o000000.OooOO0O.OooO00o(oo000oVarO00000Oo.f26713OooooOO, 2)) {
                    oo000oVarO00000Oo = oo000oVarO00000Oo.o00000Oo();
                }
                if (oo000oVarO00000Oo != null && (oooOo = (OooOo) oo000oVarO00000Oo.f26713OooooOO[2]) != null) {
                    o000000.oo000o oo000oVarO00000Oo2 = oooOo.f26652Oooo0o;
                    while (oo000oVarO00000Oo2 != null) {
                        if (oooOo != null) {
                            oooOo2 = oooOo;
                            break;
                        }
                        oo000oVarO00000Oo2 = oo000oVarO00000Oo2.o00000Oo();
                        oooOo = oo000oVarO00000Oo2 != null ? (OooOo) oo000oVarO00000Oo2.f26713OooooOO[2] : null;
                    }
                }
            }
        } else {
            o000000.oo000o oo000oVarO00000Oo3 = oooOo.f26652Oooo0o;
            while (oo000oVarO00000Oo3 != null) {
                if (oooOo != null) {
                    oooOo2 = oooOo;
                    break;
                }
                oo000oVarO00000Oo3 = oo000oVarO00000Oo3.o00000Oo();
                oooOo = oo000oVarO00000Oo3 != null ? (OooOo) oo000oVarO00000Oo3.f26713OooooOO[2] : null;
            }
        }
        if (oooOo2 == null || ((Oooo000) this.f26653Oooo0oO).o0ooOO0().f26936Oooo0oo) {
            return ((Oooo000) this.f26653Oooo0oO).o0ooOO0();
        }
        OooOOOO oooOOOOOooO0OO = ((Oooo000) this.f26653Oooo0oO).o0ooOO0().OooO0OO();
        OooOOOO peer = oooOo2.OooO0OO();
        Intrinsics.checkNotNullParameter(peer, "peer");
        if (peer.f26935Oooo0oO) {
            oooOOOOOooO0OO.f26935Oooo0oO = true;
        }
        if (peer.f26936Oooo0oo) {
            oooOOOOOooO0OO.f26936Oooo0oo = true;
        }
        for (Map.Entry entry : peer.f26934Oooo0o.entrySet()) {
            o0Oo0oo<?> o0oo0oo2 = (o0Oo0oo) entry.getKey();
            Object value = entry.getValue();
            if (!oooOOOOOooO0OO.f26934Oooo0o.containsKey(o0oo0oo2)) {
                oooOOOOOooO0OO.f26934Oooo0o.put(o0oo0oo2, value);
            } else if (value instanceof OooO00o) {
                Object obj = oooOOOOOooO0OO.f26934Oooo0o.get(o0oo0oo2);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                OooO00o oooO00o = (OooO00o) obj;
                Map<o0Oo0oo<?>, Object> map = oooOOOOOooO0OO.f26934Oooo0o;
                String str = oooO00o.f26904OooO00o;
                if (str == null) {
                    str = ((OooO00o) value).f26904OooO00o;
                }
                Function function = oooO00o.f26905OooO0O0;
                if (function == null) {
                    function = ((OooO00o) value).f26905OooO0O0;
                }
                map.put(o0oo0oo2, new OooO00o(str, function));
            }
        }
        return oooOOOOOooO0OO;
    }

    @NotNull
    public final String toString() {
        return super.toString() + " id: " + ((Oooo000) this.f26653Oooo0oO).getId() + " config: " + ((Oooo000) this.f26653Oooo0oO).o0ooOO0();
    }
}
