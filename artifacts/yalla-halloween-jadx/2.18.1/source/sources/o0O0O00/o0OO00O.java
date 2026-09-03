package o0O0O00;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O implements o000O0O0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f35297OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f35298OooO0O0;

    public o0OO00O(o0OOO0o o0ooo0o2, Object obj) {
        this.f35297OooO00o = o0ooo0o2;
        this.f35298OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, androidx.compose.ui.node.LayoutNode>] */
    @Override // o0O0O00.o000O0O0.OooO00o
    public final int OooO00o() {
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0;
        LayoutNode layoutNode = (LayoutNode) this.f35297OooO00o.f35307OooO0oo.get(this.f35298OooO0O0);
        if (layoutNode == null || (o000oooOooOo0 = layoutNode.OooOo0()) == null) {
            return 0;
        }
        return o000oooOooOo0.f3664Oooo0oo;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, androidx.compose.ui.node.LayoutNode>] */
    @Override // o0O0O00.o000O0O0.OooO00o
    public final void OooO0O0(int i, long j) {
        LayoutNode layoutNode = (LayoutNode) this.f35297OooO00o.f35307OooO0oo.get(this.f35298OooO0O0);
        if (layoutNode == null || !layoutNode.OooOoo0()) {
            return;
        }
        int i2 = layoutNode.OooOo0().f3664Oooo0oo;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!(!layoutNode.f6156Oooooo0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        LayoutNode layoutNode2 = this.f35297OooO00o.f35300OooO00o;
        layoutNode2.f6145OoooOOO = true;
        o000000.o00Ooo.OooO00o(layoutNode).OooO0O0(layoutNode.OooOo0().f3662Oooo0o[i], j);
        layoutNode2.f6145OoooOOO = false;
    }

    @Override // o0O0O00.o000O0O0.OooO00o
    public final void dispose() {
        this.f35297OooO00o.OooO0OO();
        LayoutNode layoutNodeRemove = this.f35297OooO00o.f35307OooO0oo.remove(this.f35298OooO0O0);
        if (layoutNodeRemove != null) {
            o0OOO0o o0ooo0o2 = this.f35297OooO00o;
            if (!(o0ooo0o2.f35309OooOO0O > 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            int iIndexOf = ((OoooOOO.o000OOo.OooO00o) o0ooo0o2.f35300OooO00o.OooOOo()).indexOf(layoutNodeRemove);
            int i = ((OoooOOO.o000OOo.OooO00o) this.f35297OooO00o.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo;
            o0OOO0o o0ooo0o3 = this.f35297OooO00o;
            int i2 = o0ooo0o3.f35309OooOO0O;
            if (!(iIndexOf >= i - i2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            o0ooo0o3.f35308OooOO0++;
            o0ooo0o3.f35309OooOO0O = i2 - 1;
            int i3 = ((OoooOOO.o000OOo.OooO00o) o0ooo0o3.f35300OooO00o.OooOOo()).f3665Oooo0o.f3664Oooo0oo;
            o0OOO0o o0ooo0o4 = this.f35297OooO00o;
            int i4 = (i3 - o0ooo0o4.f35309OooOO0O) - o0ooo0o4.f35308OooOO0;
            o0ooo0o4.OooO0Oo(iIndexOf, i4, 1);
            this.f35297OooO00o.OooO00o(i4);
        }
    }
}
