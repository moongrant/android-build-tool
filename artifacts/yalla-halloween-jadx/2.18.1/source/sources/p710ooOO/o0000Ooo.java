package p710ooOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Intrinsics;
import o000000.oo000o;
import org.jetbrains.annotations.NotNull;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f53457OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o0000Ooo f53458OooO0OO = new o0000Ooo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OOo<o0000O00> f53459OooO00o = new o000OOo<>(new o0000O00[16]);

    public static final class OooO00o {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    public final void OooO00o() {
        oo000o oo000oVar;
        LayoutNode layoutNodeOooOOoo;
        LayoutNode layoutNodeOooOOoo2;
        if (!this.f53459OooO00o.OooOO0()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        o000OOo<o0000O00> o000ooo2 = this.f53459OooO00o;
        int i = o000ooo2.f3664Oooo0oo;
        if (i > 0) {
            o0000O00[] o0000o00Arr = o000ooo2.f3662Oooo0o;
            int i2 = 0;
            do {
                o000OOo<o0OO00O> o000ooo3 = o0000o00Arr[i2].f53456Oooo0oO;
                int i3 = o000ooo3.f3664Oooo0oo;
                o0OO00O o0oo00o2 = null;
                if (i3 > 0) {
                    o0OO00O[] o0oo00oArr = o000ooo3.f3662Oooo0o;
                    int i4 = 0;
                    do {
                        o0OO00O o0oo00o3 = o0oo00oArr[i4];
                        if (o0oo00o2 == null || (oo000oVar = o0oo00o2.f53485OoooOo0) == null || (layoutNodeOooOOoo = oo000oVar.f26702OoooO00) == null) {
                            o0oo00o2 = o0oo00o3;
                        } else {
                            oo000o oo000oVar2 = o0oo00o3.f53485OoooOo0;
                            if (oo000oVar2 != null && (layoutNodeOooOOoo2 = oo000oVar2.f26702OoooO00) != null) {
                                while (layoutNodeOooOOoo.f6140OoooO > layoutNodeOooOOoo2.f6140OoooO) {
                                    layoutNodeOooOOoo = layoutNodeOooOOoo.OooOOoo();
                                    Intrinsics.checkNotNull(layoutNodeOooOOoo);
                                }
                                while (layoutNodeOooOOoo2.f6140OoooO > layoutNodeOooOOoo.f6140OoooO) {
                                    layoutNodeOooOOoo2 = layoutNodeOooOOoo2.OooOOoo();
                                    Intrinsics.checkNotNull(layoutNodeOooOOoo2);
                                }
                                while (!Intrinsics.areEqual(layoutNodeOooOOoo.OooOOoo(), layoutNodeOooOOoo2.OooOOoo())) {
                                    layoutNodeOooOOoo = layoutNodeOooOOoo.OooOOoo();
                                    Intrinsics.checkNotNull(layoutNodeOooOOoo);
                                    layoutNodeOooOOoo2 = layoutNodeOooOOoo2.OooOOoo();
                                    Intrinsics.checkNotNull(layoutNodeOooOOoo2);
                                }
                                LayoutNode layoutNodeOooOOoo3 = layoutNodeOooOOoo.OooOOoo();
                                Intrinsics.checkNotNull(layoutNodeOooOOoo3);
                                o000OOo<LayoutNode> o000oooOooOo0 = layoutNodeOooOOoo3.OooOo0();
                                if (o000oooOooOo0.OooO0oo(layoutNodeOooOOoo) >= o000oooOooOo0.OooO0oo(layoutNodeOooOOoo2)) {
                                    o0oo00o2 = o0oo00o3;
                                }
                            }
                        }
                        i4++;
                    } while (i4 < i3);
                }
                if (o0oo00o2 != null) {
                    o0000O0.OooO0o(o0oo00o2);
                }
                i2++;
            } while (i2 < i);
        }
    }
}
