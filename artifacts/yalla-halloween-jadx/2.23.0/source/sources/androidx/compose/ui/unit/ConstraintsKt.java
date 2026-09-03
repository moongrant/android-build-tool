package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import p046Oooooo0.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Constraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", AppMeasurementSdk.ConditionalUserProperty.VALUE, "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (i4 >= i3) {
            if (i >= 0 && i3 >= 0) {
                return Constraints.INSTANCE.m3740createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
            }
            throw new IllegalArgumentException(o0O00o0.OooO00o("minWidth(", i, ") and minHeight(", i3, ") must be >= 0").toString());
        }
        throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    private static final int addMaxWithMinimum(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : RangesKt.coerceAtLeast(i + i2, 0);
    }

    @Stable
    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m3744constrain4WqzIAM(long j, long j2) {
        return IntSizeKt.IntSize(RangesKt.coerceIn(IntSize.m3925getWidthimpl(j2), Constraints.m3735getMinWidthimpl(j), Constraints.m3733getMaxWidthimpl(j)), RangesKt.coerceIn(IntSize.m3924getHeightimpl(j2), Constraints.m3734getMinHeightimpl(j), Constraints.m3732getMaxHeightimpl(j)));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m3745constrainN9IONVI(long j, long j2) {
        return Constraints(RangesKt.coerceIn(Constraints.m3735getMinWidthimpl(j2), Constraints.m3735getMinWidthimpl(j), Constraints.m3733getMaxWidthimpl(j)), RangesKt.coerceIn(Constraints.m3733getMaxWidthimpl(j2), Constraints.m3735getMinWidthimpl(j), Constraints.m3733getMaxWidthimpl(j)), RangesKt.coerceIn(Constraints.m3734getMinHeightimpl(j2), Constraints.m3734getMinHeightimpl(j), Constraints.m3732getMaxHeightimpl(j)), RangesKt.coerceIn(Constraints.m3732getMaxHeightimpl(j2), Constraints.m3734getMinHeightimpl(j), Constraints.m3732getMaxHeightimpl(j)));
    }

    @Stable
    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m3746constrainHeightK40F9xA(long j, int i) {
        return RangesKt.coerceIn(i, Constraints.m3734getMinHeightimpl(j), Constraints.m3732getMaxHeightimpl(j));
    }

    @Stable
    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m3747constrainWidthK40F9xA(long j, int i) {
        return RangesKt.coerceIn(i, Constraints.m3735getMinWidthimpl(j), Constraints.m3733getMaxWidthimpl(j));
    }

    @Stable
    /* JADX INFO: renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m3748isSatisfiedBy4WqzIAM(long j, long j2) {
        int iM3735getMinWidthimpl = Constraints.m3735getMinWidthimpl(j);
        int iM3733getMaxWidthimpl = Constraints.m3733getMaxWidthimpl(j);
        int iM3925getWidthimpl = IntSize.m3925getWidthimpl(j2);
        if (iM3735getMinWidthimpl <= iM3925getWidthimpl && iM3925getWidthimpl <= iM3733getMaxWidthimpl) {
            int iM3734getMinHeightimpl = Constraints.m3734getMinHeightimpl(j);
            int iM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(j);
            int iM3924getHeightimpl = IntSize.m3924getHeightimpl(j2);
            if (iM3734getMinHeightimpl <= iM3924getHeightimpl && iM3924getHeightimpl <= iM3732getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m3749offsetNN6EwU(long j, int i, int i2) {
        return Constraints(RangesKt.coerceAtLeast(Constraints.m3735getMinWidthimpl(j) + i, 0), addMaxWithMinimum(Constraints.m3733getMaxWidthimpl(j), i), RangesKt.coerceAtLeast(Constraints.m3734getMinHeightimpl(j) + i2, 0), addMaxWithMinimum(Constraints.m3732getMaxHeightimpl(j), i2));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m3750offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m3749offsetNN6EwU(j, i, i2);
    }
}
