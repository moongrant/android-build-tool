package o0O0O00;

import androidx.compose.ui.node.LayoutNode;
import java.util.Iterator;
import p100o000oOoO.o00O0OO;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo f35287OooO00o;

    public o000OO0O(oO0Oo oo0oo) {
        this.f35287OooO00o = oo0oo;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.LinkedHashMap, java.util.Map<androidx.compose.ui.node.LayoutNode, o0O0O00.o0OOO0o$OooO00o>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, androidx.compose.ui.node.LayoutNode>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, androidx.compose.ui.node.LayoutNode>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.LinkedHashMap, java.util.Map<androidx.compose.ui.node.LayoutNode, o0O0O00.o0OOO0o$OooO00o>] */
    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        o0OOO0o o0ooo0oOooO00o = ((o000O0O0) this.f35287OooO00o.getValue()).OooO00o();
        LayoutNode layoutNode = o0ooo0oOooO00o.f35300OooO00o;
        layoutNode.f6145OoooOOO = true;
        Iterator it = o0ooo0oOooO00o.f35305OooO0o0.values().iterator();
        while (it.hasNext()) {
            o00O0OO o00o0oo2 = ((o0OOO0o.OooO00o) it.next()).f35313OooO0OO;
            if (o00o0oo2 != null) {
                o00o0oo2.dispose();
            }
        }
        o0ooo0oOooO00o.f35300OooO00o.Oooo();
        layoutNode.f6145OoooOOO = false;
        o0ooo0oOooO00o.f35305OooO0o0.clear();
        o0ooo0oOooO00o.f35304OooO0o.clear();
        o0ooo0oOooO00o.f35309OooOO0O = 0;
        o0ooo0oOooO00o.f35308OooOO0 = 0;
        o0ooo0oOooO00o.f35307OooO0oo.clear();
        o0ooo0oOooO00o.OooO0OO();
    }
}
