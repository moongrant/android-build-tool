package p034OoooO0O;

import androidx.compose.foundation.text.selection.HandleReferencePoint;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooOo;
import o0000O0O.Oooo0;
import o0000OO0.o0OO00O;
import org.jetbrains.annotations.NotNull;
import p027Oooo0o.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final HandleReferencePoint f3558OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f3559OooO0O0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            iArr[HandleReferencePoint.TopRight.ordinal()] = 2;
            iArr[HandleReferencePoint.TopMiddle.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o00Oo0(HandleReferencePoint handleReferencePoint, long j) {
        this.f3558OooO00o = handleReferencePoint;
        this.f3559OooO0O0 = j;
    }

    @Override // o0000OO0.o0OO00O
    public final long OooO00o(@NotNull Oooo0 anchorBounds, @NotNull LayoutDirection layoutDirection, long j) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = OooO00o.$EnumSwitchMapping$0[this.f3558OooO00o.ordinal()];
        if (i == 1) {
            int i2 = anchorBounds.f27337OooO00o;
            long j2 = this.f3559OooO0O0;
            OooOo.OooO00o oooO00o = OooOo.f27330OooO0O0;
            return o00oO0o.OooO00o(j2, anchorBounds.f27338OooO0O0, i2 + ((int) (j2 >> 32)));
        }
        if (i == 2) {
            int i3 = anchorBounds.f27337OooO00o;
            long j3 = this.f3559OooO0O0;
            OooOo.OooO00o oooO00o2 = OooOo.f27330OooO0O0;
            return o00oO0o.OooO00o(j3, anchorBounds.f27338OooO0O0, (i3 + ((int) (j3 >> 32))) - ((int) (j >> 32)));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = anchorBounds.f27337OooO00o;
        long j4 = this.f3559OooO0O0;
        OooOo.OooO00o oooO00o3 = OooOo.f27330OooO0O0;
        return o00oO0o.OooO00o(j4, anchorBounds.f27338OooO0O0, (i4 + ((int) (j4 >> 32))) - (((int) (j >> 32)) / 2));
    }
}
