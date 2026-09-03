package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m3451updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM3306getLengthimpl;
        int iM3308getMinimpl = TextRange.m3308getMinimpl(j);
        int iM3307getMaximpl = TextRange.m3307getMaximpl(j);
        if (TextRange.m3312intersects5zctL8(j2, j)) {
            if (TextRange.m3300contains5zctL8(j2, j)) {
                iM3308getMinimpl = TextRange.m3308getMinimpl(j2);
                iM3307getMaximpl = iM3308getMinimpl;
            } else {
                if (TextRange.m3300contains5zctL8(j, j2)) {
                    iM3306getLengthimpl = TextRange.m3306getLengthimpl(j2);
                } else if (TextRange.m3301containsimpl(j2, iM3308getMinimpl)) {
                    iM3308getMinimpl = TextRange.m3308getMinimpl(j2);
                    iM3306getLengthimpl = TextRange.m3306getLengthimpl(j2);
                } else {
                    iM3307getMaximpl = TextRange.m3308getMinimpl(j2);
                }
                iM3307getMaximpl -= iM3306getLengthimpl;
            }
        } else if (iM3307getMaximpl > TextRange.m3308getMinimpl(j2)) {
            iM3308getMinimpl -= TextRange.m3306getLengthimpl(j2);
            iM3306getLengthimpl = TextRange.m3306getLengthimpl(j2);
            iM3307getMaximpl -= iM3306getLengthimpl;
        }
        return TextRangeKt.TextRange(iM3308getMinimpl, iM3307getMaximpl);
    }
}
