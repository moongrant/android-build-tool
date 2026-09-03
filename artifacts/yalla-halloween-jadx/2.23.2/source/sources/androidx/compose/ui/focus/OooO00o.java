package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import o000O.OooOo;
import o000O.Oooo000;
import p080o000OoO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements o00000O0.OooO00o {
    public /* synthetic */ OooO00o(AnalyticsListener.OooO00o oooO00o, OooOo oooOo, Oooo000 oooo000) {
    }

    public static int OooO00o(LayoutNode layoutNode) {
        return layoutNode.getNodes().getHead().getAggregateChildKindSet();
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).Ooooo00();
    }
}
