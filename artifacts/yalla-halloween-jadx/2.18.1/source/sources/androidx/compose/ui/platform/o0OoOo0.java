package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends androidx.core.view.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f6620OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f6621OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f6622OooO0o0;

    public o0OoOo0(LayoutNode layoutNode, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f6620OooO0Oo = layoutNode;
        this.f6622OooO0o0 = androidComposeView;
        this.f6621OooO0o = androidComposeView2;
    }

    @Override // androidx.core.view.OooO00o
    public final void OooO0Oo(@NotNull View host, @NotNull p072o000O0o0.o0000OO0 info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f7862OooO00o.onInitializeAccessibilityNodeInfo(host, info.f28194OooO00o);
        o00000O0.OooOo outerSemanticsEntity = o00000O0.o00Oo0.OooO0Oo(this.f6620OooO0Oo);
        Intrinsics.checkNotNull(outerSemanticsEntity);
        Intrinsics.checkNotNullParameter(outerSemanticsEntity, "outerSemanticsEntity");
        outerSemanticsEntity.OooO0OO();
        ((o00000O0.Oooo000) outerSemanticsEntity.f26653Oooo0oO).getId();
        LayoutNode layoutNodeOooO00o = o00000O0.o00Oo0.OooO00o(outerSemanticsEntity.f26652Oooo0o.f26702OoooO00, o00000O0.o00O0O.OooO0O0.f26951Oooo0o);
        o00000O0.OooOo oooOoOooO0Oo = layoutNodeOooO00o != null ? o00000O0.o00Oo0.OooO0Oo(layoutNodeOooO00o) : null;
        o00000O0.o00O0O o00o0o2 = oooOoOooO0Oo != null ? new o00000O0.o00O0O(oooOoOooO0Oo, false) : null;
        Intrinsics.checkNotNull(o00o0o2);
        int i = o00o0o2.f26947OooO0o;
        if (i == this.f6622OooO0o0.getF6209OoooOOo().OooO00o().f26947OooO0o) {
            i = -1;
        }
        info.o000oOoO(this.f6621OooO0o, i);
    }
}
