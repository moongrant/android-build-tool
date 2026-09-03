package o000000;

import androidx.compose.ui.node.LayoutNode;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Map<o0O0O00.OooO00o, Integer> f26677OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LayoutNode f26678OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f26679OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f26680OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f26681OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f26682OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f26683OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f26684OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public LayoutNode f26685OooO0oo;

    public o0OoOo0(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f26678OooO00o = layoutNode;
        this.f26679OooO0O0 = true;
        this.f26677OooO = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<o0O0O00.OooO00o, java.lang.Integer>] */
    public static final void OooO0OO(o0OoOo0 o0oooo1, o0O0O00.OooO00o oooO00o, int i, oo000o oo000oVar) {
        float f = i;
        long jOooO00o = o00O0O.OooOO0.OooO00o(f, f);
        while (true) {
            jOooO00o = oo000oVar.o0000OOo(jOooO00o);
            oo000oVar = oo000oVar.f26701OoooO0;
            Intrinsics.checkNotNull(oo000oVar);
            if (Intrinsics.areEqual(oo000oVar, o0oooo1.f26678OooO00o.f6165o00Ooo)) {
                break;
            } else if (oo000oVar.o00000().OooO0o0().containsKey(oooO00o)) {
                float fOooOo0o = oo000oVar.OooOo0o(oooO00o);
                jOooO00o = o00O0O.OooOO0.OooO00o(fOooOo0o, fOooOo0o);
            }
        }
        int iRoundToInt = oooO00o instanceof o0O0O00.OooOOO ? MathKt.roundToInt(o00O0O.OooO.OooO0Oo(jOooO00o)) : MathKt.roundToInt(o00O0O.OooO.OooO0OO(jOooO00o));
        ?? r5 = o0oooo1.f26677OooO;
        if (r5.containsKey(oooO00o)) {
            int iIntValue = ((Number) MapsKt.getValue(o0oooo1.f26677OooO, oooO00o)).intValue();
            o0O0O00.OooOOO oooOOO = o0O0O00.OooO0O0.f35231OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            iRoundToInt = oooO00o.f35230OooO00o.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRoundToInt)).intValue();
        }
        r5.put(oooO00o, Integer.valueOf(iRoundToInt));
    }

    public final boolean OooO00o() {
        return this.f26680OooO0OO || this.f26683OooO0o0 || this.f26682OooO0o || this.f26684OooO0oO;
    }

    public final boolean OooO0O0() {
        OooO0Oo();
        return this.f26685OooO0oo != null;
    }

    public final void OooO0Oo() {
        LayoutNode layoutNode;
        o0OoOo0 o0oooo1;
        o0OoOo0 o0oooo2;
        if (OooO00o()) {
            layoutNode = this.f26678OooO00o;
        } else {
            LayoutNode layoutNodeOooOOoo = this.f26678OooO00o.OooOOoo();
            if (layoutNodeOooOOoo == null) {
                return;
            }
            layoutNode = layoutNodeOooOOoo.f6154OooooOo.f26685OooO0oo;
            if (layoutNode == null || !layoutNode.f6154OooooOo.OooO00o()) {
                LayoutNode layoutNode2 = this.f26685OooO0oo;
                if (layoutNode2 == null || layoutNode2.f6154OooooOo.OooO00o()) {
                    return;
                }
                LayoutNode layoutNodeOooOOoo2 = layoutNode2.OooOOoo();
                if (layoutNodeOooOOoo2 != null && (o0oooo2 = layoutNodeOooOOoo2.f6154OooooOo) != null) {
                    o0oooo2.OooO0Oo();
                }
                LayoutNode layoutNodeOooOOoo3 = layoutNode2.OooOOoo();
                layoutNode = (layoutNodeOooOOoo3 == null || (o0oooo1 = layoutNodeOooOOoo3.f6154OooooOo) == null) ? null : o0oooo1.f26685OooO0oo;
            }
        }
        this.f26685OooO0oo = layoutNode;
    }
}
