package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static /* synthetic */ Pair OooO00o(Selectable selectable, long j, long j2, Offset offset, boolean z, LayoutCoordinates layoutCoordinates, SelectionAdjustment selectionAdjustment, Selection selection, int i, Object obj) {
        if (obj == null) {
            return selectable.mo885updateSelectionqCDeeow(j, j2, offset, (i & 8) != 0 ? true : z, layoutCoordinates, selectionAdjustment, (i & 64) != 0 ? null : selection);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSelection-qCDeeow");
    }
}
