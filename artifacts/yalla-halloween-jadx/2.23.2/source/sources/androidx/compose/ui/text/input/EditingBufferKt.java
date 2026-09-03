package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3461updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM3316getLengthimpl;
        int iM3318getMinimpl = TextRange.m3318getMinimpl(j);
        int iM3317getMaximpl = TextRange.m3317getMaximpl(j);
        if (TextRange.m3322intersects5zctL8(j2, j)) {
            if (TextRange.m3310contains5zctL8(j2, j)) {
                iM3318getMinimpl = TextRange.m3318getMinimpl(j2);
                iM3317getMaximpl = iM3318getMinimpl;
            } else {
                if (TextRange.m3310contains5zctL8(j, j2)) {
                    iM3316getLengthimpl = TextRange.m3316getLengthimpl(j2);
                } else if (TextRange.m3311containsimpl(j2, iM3318getMinimpl)) {
                    iM3318getMinimpl = TextRange.m3318getMinimpl(j2);
                    iM3316getLengthimpl = TextRange.m3316getLengthimpl(j2);
                } else {
                    iM3317getMaximpl = TextRange.m3318getMinimpl(j2);
                }
                iM3317getMaximpl -= iM3316getLengthimpl;
            }
        } else if (iM3317getMaximpl > TextRange.m3318getMinimpl(j2)) {
            iM3318getMinimpl -= TextRange.m3316getLengthimpl(j2);
            iM3316getLengthimpl = TextRange.m3316getLengthimpl(j2);
            iM3317getMaximpl -= iM3316getLengthimpl;
        }
        return TextRangeKt.TextRange(iM3318getMinimpl, iM3317getMaximpl);
    }
}
