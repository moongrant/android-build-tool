package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f4179OooO0Oo;

    public /* synthetic */ OooO0o(int i) {
        this.f4179OooO0Oo = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4179OooO0Oo) {
            case 0:
                return LayoutNode.ZComparator$lambda$38((LayoutNode) obj, (LayoutNode) obj2);
            default:
                return ((androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0) ((List) obj).get(0)).compareTo((androidx.media3.exoplayer.trackselection.OooO0O0.OooOO0) ((List) obj2).get(0));
        }
    }
}
