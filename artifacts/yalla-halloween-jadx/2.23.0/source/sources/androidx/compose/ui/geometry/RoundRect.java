package androidx.compose.ui.geometry;

import androidx.compose.animation.Oooo0;
import androidx.compose.runtime.Immutable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BP\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0011J\u0019\u0010#\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010%\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0011J\u0019\u0010'\u001a\u00020\bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010\u0011J\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.Jf\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u000205HÖ\u0001J(\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0000H\u0002J\b\u0010<\u001a\u00020=H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u000b\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\n\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", ViewHierarchyConstants.DIMENSION_LEFT_KEY, "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RoundRect {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final RoundRect Zero = RoundRectKt.m1490RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.INSTANCE.m1421getZerokKHJgLs());

    @Nullable
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final RoundRect getZero() {
            return RoundRect.Zero;
        }
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }

    @NotNull
    public static final RoundRect getZero() {
        return INSTANCE.getZero();
    }

    private final float minRadius(float min, float radius1, float radius2, float limit) {
        float f = radius1 + radius2;
        if (f > limit) {
            return !((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Math.min(min, limit / f) : min;
        }
        return min;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, CornerRadius.m1412getYimpl(this.bottomLeftCornerRadius), CornerRadius.m1412getYimpl(this.topLeftCornerRadius), getHeight()), CornerRadius.m1411getXimpl(this.topLeftCornerRadius), CornerRadius.m1411getXimpl(this.topRightCornerRadius), getWidth()), CornerRadius.m1412getYimpl(this.topRightCornerRadius), CornerRadius.m1412getYimpl(this.bottomRightCornerRadius), getHeight()), CornerRadius.m1411getXimpl(this.bottomRightCornerRadius), CornerRadius.m1411getXimpl(this.bottomLeftCornerRadius), getWidth());
        RoundRect roundRect2 = new RoundRect(this.left * fMinRadius, this.top * fMinRadius, this.right * fMinRadius, this.bottom * fMinRadius, CornerRadiusKt.CornerRadius(CornerRadius.m1411getXimpl(this.topLeftCornerRadius) * fMinRadius, CornerRadius.m1412getYimpl(this.topLeftCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1411getXimpl(this.topRightCornerRadius) * fMinRadius, CornerRadius.m1412getYimpl(this.topRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1411getXimpl(this.bottomRightCornerRadius) * fMinRadius, CornerRadius.m1412getYimpl(this.bottomRightCornerRadius) * fMinRadius), CornerRadiusKt.CornerRadius(CornerRadius.m1411getXimpl(this.bottomLeftCornerRadius) * fMinRadius, CornerRadius.m1412getYimpl(this.bottomLeftCornerRadius) * fMinRadius), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name and from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name and from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x008d  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0113  */
    /* JADX WARN: Code duplicated, block: B:28:0x0124  */
    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m1482containsk4lQ0M(long point) {
        float fM1436getXimpl;
        float fM1437getYimpl;
        float fM1411getXimpl;
        float fM1412getYimpl;
        if (Offset.m1436getXimpl(point) < this.left || Offset.m1436getXimpl(point) >= this.right || Offset.m1437getYimpl(point) < this.top || Offset.m1437getYimpl(point) >= this.bottom) {
            return false;
        }
        RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
        if (Offset.m1436getXimpl(point) < CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius) + this.left) {
            if (Offset.m1437getYimpl(point) < CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius) + this.top) {
                fM1436getXimpl = (Offset.m1436getXimpl(point) - this.left) - CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
                fM1437getYimpl = (Offset.m1437getYimpl(point) - this.top) - CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
                fM1411getXimpl = CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
                fM1412getYimpl = CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topLeftCornerRadius);
            } else {
                if (Offset.m1436getXimpl(point) > this.right - CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topRightCornerRadius)) {
                    if (Offset.m1436getXimpl(point) > this.right - CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius)) {
                        if (Offset.m1436getXimpl(point) < CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) + this.left) {
                        }
                        return true;
                    }
                    if (Offset.m1436getXimpl(point) < CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) + this.left) {
                    }
                    return true;
                }
                if (Offset.m1437getYimpl(point) >= CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topRightCornerRadius) + this.top) {
                    fM1436getXimpl = (Offset.m1436getXimpl(point) - this.right) + CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
                    fM1437getYimpl = (Offset.m1437getYimpl(point) - this.top) - CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
                    fM1411getXimpl = CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
                    fM1412getYimpl = CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
                } else if (Offset.m1436getXimpl(point) > this.right - CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius) || Offset.m1437getYimpl(point) <= this.bottom - CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius)) {
                    if (Offset.m1436getXimpl(point) < CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) + this.left || Offset.m1437getYimpl(point) <= this.bottom - CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius)) {
                        return true;
                    }
                    fM1436getXimpl = (Offset.m1436getXimpl(point) - this.left) - CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
                    fM1437getYimpl = (Offset.m1437getYimpl(point) - this.bottom) + CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
                    fM1411getXimpl = CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
                    fM1412getYimpl = CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius);
                } else {
                    fM1436getXimpl = (Offset.m1436getXimpl(point) - this.right) + CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
                    fM1437getYimpl = (Offset.m1437getYimpl(point) - this.bottom) + CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
                    fM1411getXimpl = CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
                    fM1412getYimpl = CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.bottomRightCornerRadius);
                }
            }
        } else {
            if (Offset.m1436getXimpl(point) > this.right - CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topRightCornerRadius)) {
                if (Offset.m1436getXimpl(point) > this.right - CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius)) {
                    if (Offset.m1436getXimpl(point) < CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) + this.left) {
                    }
                    return true;
                }
                if (Offset.m1436getXimpl(point) < CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) + this.left) {
                }
                return true;
            }
            if (Offset.m1437getYimpl(point) >= CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topRightCornerRadius) + this.top) {
                if (Offset.m1436getXimpl(point) > this.right - CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomRightCornerRadius)) {
                    if (Offset.m1436getXimpl(point) < CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) + this.left) {
                    }
                    return true;
                }
                if (Offset.m1436getXimpl(point) < CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.bottomLeftCornerRadius) + this.left) {
                }
                return true;
            }
            fM1436getXimpl = (Offset.m1436getXimpl(point) - this.right) + CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1437getYimpl = (Offset.m1437getYimpl(point) - this.top) - CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1411getXimpl = CornerRadius.m1411getXimpl(roundRectScaledRadiiRect.topRightCornerRadius);
            fM1412getYimpl = CornerRadius.m1412getYimpl(roundRectScaledRadiiRect.topRightCornerRadius);
        }
        float f = fM1436getXimpl / fM1411getXimpl;
        float f2 = fM1437getYimpl / fM1412getYimpl;
        return (f2 * f2) + (f * f) <= 1.0f;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m1483copyMDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
        return new RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) other;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m1410equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m1410equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m1410equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m1410equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1484getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1485getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1486getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m1487getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return CornerRadius.m1413hashCodeimpl(this.bottomLeftCornerRadius) + ((CornerRadius.m1413hashCodeimpl(this.bottomRightCornerRadius) + ((CornerRadius.m1413hashCodeimpl(this.topRightCornerRadius) + ((CornerRadius.m1413hashCodeimpl(this.topLeftCornerRadius) + Oooo0.OooO00o(this.bottom, Oooo0.OooO00o(this.right, Oooo0.OooO00o(this.top, Float.floatToIntBits(this.left) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m1410equalsimpl0(j, j2) || !CornerRadius.m1410equalsimpl0(j2, j3) || !CornerRadius.m1410equalsimpl0(j3, j4)) {
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("RoundRect(rect=", str, ", topLeft=");
            sbOooO00o.append((Object) CornerRadius.m1417toStringimpl(j));
            sbOooO00o.append(", topRight=");
            sbOooO00o.append((Object) CornerRadius.m1417toStringimpl(j2));
            sbOooO00o.append(", bottomRight=");
            sbOooO00o.append((Object) CornerRadius.m1417toStringimpl(j3));
            sbOooO00o.append(", bottomLeft=");
            sbOooO00o.append((Object) CornerRadius.m1417toStringimpl(j4));
            sbOooO00o.append(')');
            return sbOooO00o.toString();
        }
        if (CornerRadius.m1411getXimpl(j) == CornerRadius.m1412getYimpl(j)) {
            StringBuilder sbOooO00o2 = o0OoOo0.OooO00o("RoundRect(rect=", str, ", radius=");
            sbOooO00o2.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m1411getXimpl(j), 1));
            sbOooO00o2.append(')');
            return sbOooO00o2.toString();
        }
        StringBuilder sbOooO00o3 = o0OoOo0.OooO00o("RoundRect(rect=", str, ", x=");
        sbOooO00o3.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m1411getXimpl(j), 1));
        sbOooO00o3.append(", y=");
        sbOooO00o3.append(GeometryUtilsKt.toStringAsFixed(CornerRadius.m1412getYimpl(j), 1));
        sbOooO00o3.append(')');
        return sbOooO00o3.toString();
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.INSTANCE.m1421getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.INSTANCE.m1421getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.INSTANCE.m1421getZerokKHJgLs() : j3, (i & 128) != 0 ? CornerRadius.INSTANCE.m1421getZerokKHJgLs() : j4, null);
    }
}
