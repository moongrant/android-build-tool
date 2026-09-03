package o000000;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final p036OoooOOO.o000OOo<LayoutNode> f26657OooO00o = new p036OoooOOO.o000OOo<>(new LayoutNode[16]);

    public final void OooO00o(LayoutNode layoutNode) {
        p036OoooOOO.o000OOo<Pair<oo000o, o0O0O00.o0000O0>> o000ooo2;
        int i;
        int i2 = 0;
        if (layoutNode.f6144OoooOO0 == LayoutNode.LayoutState.Idle && !layoutNode.f6159o000000 && !layoutNode.f6161o000OOo && layoutNode.f6156Oooooo0 && (o000ooo2 = layoutNode.f6171o0OO00O) != null && (i = o000ooo2.f3664Oooo0oo) > 0) {
            Pair<oo000o, o0O0O00.o0000O0>[] pairArr = o000ooo2.f3662Oooo0o;
            int i3 = 0;
            do {
                Pair<oo000o, o0O0O00.o0000O0> pair = pairArr[i3];
                pair.getSecond().OooOoo(pair.getFirst());
                i3++;
            } while (i3 < i);
        }
        layoutNode.f6179oo0o0Oo = false;
        p036OoooOOO.o000OOo<LayoutNode> o000oooOooOo0 = layoutNode.OooOo0();
        int i4 = o000oooOooOo0.f3664Oooo0oo;
        if (i4 > 0) {
            LayoutNode[] layoutNodeArr = o000oooOooOo0.f3662Oooo0o;
            do {
                OooO00o(layoutNodeArr[i2]);
                i2++;
            } while (i2 < i4);
        }
    }
}
