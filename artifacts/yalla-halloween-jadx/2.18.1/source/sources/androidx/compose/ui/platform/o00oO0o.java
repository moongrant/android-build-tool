package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function1<LayoutNode, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00oO0o f6559Oooo0o = new o00oO0o();

    public o00oO0o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LayoutNode layoutNode) {
        LayoutNode it = layoutNode;
        Intrinsics.checkNotNullParameter(it, "it");
        o00000O0.OooOo oooOoOooO0Oo = o00000O0.o00Oo0.OooO0Oo(it);
        o00000O0.OooOOOO oooOOOOOooO0OO = oooOoOooO0Oo != null ? oooOoOooO0Oo.OooO0OO() : null;
        boolean z = false;
        if (oooOOOOOooO0OO != null && oooOOOOOooO0OO.f26935Oooo0oO) {
            o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26915OooO00o;
            if (oooOOOOOooO0OO.OooO0O0(o00000O0.OooOOO.f26914OooO)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
