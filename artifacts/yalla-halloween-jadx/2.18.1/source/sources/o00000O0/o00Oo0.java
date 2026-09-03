package o00000O0;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {
    public static final LayoutNode OooO00o(LayoutNode layoutNode, Function1 function1) {
        for (LayoutNode layoutNodeOooOOoo = layoutNode.OooOOoo(); layoutNodeOooOOoo != null; layoutNodeOooOOoo = layoutNodeOooOOoo.OooOOoo()) {
            if (((Boolean) function1.invoke(layoutNodeOooOOoo)).booleanValue()) {
                return layoutNodeOooOOoo;
            }
        }
        return null;
    }

    public static final List<OooOo> OooO0O0(LayoutNode layoutNode, List<OooOo> list) {
        o000OOo<LayoutNode> o000oooOooOo00 = layoutNode.OooOo00();
        int i = o000oooOooOo00.f3664Oooo0oo;
        if (i > 0) {
            int i2 = 0;
            LayoutNode[] layoutNodeArr = o000oooOooOo00.f3662Oooo0o;
            do {
                LayoutNode layoutNode2 = layoutNodeArr[i2];
                OooOo oooOoOooO0Oo = OooO0Oo(layoutNode2);
                if (oooOoOooO0Oo != null) {
                    list.add(oooOoOooO0Oo);
                } else {
                    OooO0O0(layoutNode2, list);
                }
                i2++;
            } while (i2 < i);
        }
        return list;
    }

    @Nullable
    public static final OooOo OooO0OO(@NotNull LayoutNode layoutNode) {
        OooOo oooOo;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        o000000.oo000o oo000oVarO00000Oo = layoutNode.f6166o00o0O.f26635OoooO0;
        while (oo000oVarO00000Oo != null && !o000000.OooOO0O.OooO00o(oo000oVarO00000Oo.f26713OooooOO, 2)) {
            oo000oVarO00000Oo = oo000oVarO00000Oo.o00000Oo();
        }
        if (oo000oVarO00000Oo == null || (oooOo = (OooOo) oo000oVarO00000Oo.f26713OooooOO[2]) == null) {
            return null;
        }
        o000000.oo000o oo000oVarO00000Oo2 = oooOo.f26652Oooo0o;
        while (oo000oVarO00000Oo2 != null) {
            while (oooOo != null) {
                if (((Oooo000) oooOo.f26653Oooo0oO).o0ooOO0().f26935Oooo0oO) {
                    return oooOo;
                }
                oooOo = (OooOo) oooOo.f26654Oooo0oo;
            }
            oo000oVarO00000Oo2 = oo000oVarO00000Oo2.o00000Oo();
            oooOo = oo000oVarO00000Oo2 != null ? (OooOo) oo000oVarO00000Oo2.f26713OooooOO[2] : null;
        }
        return null;
    }

    @Nullable
    public static final OooOo OooO0Oo(@NotNull LayoutNode layoutNode) {
        OooOo oooOo;
        Intrinsics.checkNotNullParameter(layoutNode, "<this>");
        o000000.oo000o oo000oVarO00000Oo = layoutNode.f6166o00o0O.f26635OoooO0;
        while (oo000oVarO00000Oo != null && !o000000.OooOO0O.OooO00o(oo000oVarO00000Oo.f26713OooooOO, 2)) {
            oo000oVarO00000Oo = oo000oVarO00000Oo.o00000Oo();
        }
        if (oo000oVarO00000Oo == null || (oooOo = (OooOo) oo000oVarO00000Oo.f26713OooooOO[2]) == null) {
            return null;
        }
        o000000.oo000o oo000oVarO00000Oo2 = oooOo.f26652Oooo0o;
        while (oo000oVarO00000Oo2 != null) {
            if (oooOo != null) {
                return oooOo;
            }
            oo000oVarO00000Oo2 = oo000oVarO00000Oo2.o00000Oo();
            oooOo = oo000oVarO00000Oo2 != null ? (OooOo) oo000oVarO00000Oo2.f26713OooooOO[2] : null;
        }
        return null;
    }
}
