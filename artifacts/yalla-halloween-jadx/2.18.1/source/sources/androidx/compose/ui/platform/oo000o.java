package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends Lambda implements Function1<LayoutNode, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oo000o f6627Oooo0o = new oo000o();

    public oo000o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode layoutNode) {
        o00000O0.OooOOOO oooOOOOOooO0OO;
        LayoutNode parent = layoutNode;
        Intrinsics.checkNotNullParameter(parent, "parent");
        o00000O0.OooOo oooOoOooO0Oo = o00000O0.o00Oo0.OooO0Oo(parent);
        return Boolean.valueOf((oooOoOooO0Oo == null || (oooOOOOOooO0OO = oooOoOooO0Oo.OooO0OO()) == null || !oooOOOOOooO0OO.f26935Oooo0oO) ? false : true);
    }
}
