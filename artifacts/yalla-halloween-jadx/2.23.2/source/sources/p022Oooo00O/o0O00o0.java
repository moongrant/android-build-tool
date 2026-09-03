package p022Oooo00O;

import Oooo0.OooO;
import Oooo0.OooO0O0;
import android.hardware.camera2.CameraCharacteristics;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o000OO.OooOOO0;
import p023Oooo00o.oO000o00;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO000o00 f727OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f728OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f729OooO0OO;

    @RequiresApi(33)
    public static final class OooO00o {
        @Nullable
        @DoNotInline
        public static DynamicRange OooO00o(@NonNull oO000o00 oo000o00) {
            Long l = (Long) oo000o00.OooO00o(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l != null) {
                return OooO0O0.OooO0O0(l.longValue());
            }
            return null;
        }
    }

    public o0O00o0(@NonNull oO000o00 oo000o00) {
        this.f727OooO00o = oo000o00;
        this.f728OooO0O0 = OooO.OooO00o(oo000o00);
        int[] iArr = (int[]) oo000o00.OooO00o(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 18) {
                    z = true;
                    break;
                }
            }
        }
        this.f729OooO0OO = z;
    }

    public static boolean OooO00o(@NonNull DynamicRange dynamicRange, @NonNull DynamicRange dynamicRange2) {
        OooOOO0.OooO0o("Fully specified range is not actually fully specified.", dynamicRange2.OooO0O0());
        int i = dynamicRange.f3403OooO00o;
        int i2 = dynamicRange2.f3403OooO00o;
        if (i == 2 && i2 == 1) {
            return false;
        }
        if (i != 2 && i != 0 && i != i2) {
            return false;
        }
        int i3 = dynamicRange.f3404OooO0O0;
        return i3 == 0 || i3 == dynamicRange2.f3404OooO0O0;
    }

    public static boolean OooO0O0(@NonNull DynamicRange dynamicRange, @NonNull DynamicRange dynamicRange2, @NonNull HashSet hashSet) {
        if (hashSet.contains(dynamicRange2)) {
            return OooO00o(dynamicRange, dynamicRange2);
        }
        o00O0O0.OooO00o("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", dynamicRange, dynamicRange2));
        return false;
    }

    @Nullable
    public static DynamicRange OooO0OO(@NonNull DynamicRange dynamicRange, @NonNull LinkedHashSet linkedHashSet, @NonNull HashSet hashSet) {
        if (dynamicRange.f3403OooO00o == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            DynamicRange dynamicRange2 = (DynamicRange) it.next();
            OooOOO0.OooO0o0(dynamicRange2, "Fully specified DynamicRange cannot be null.");
            OooOOO0.OooO0o("Fully specified DynamicRange must have fully defined encoding.", dynamicRange2.OooO0O0());
            if (dynamicRange2.f3403OooO00o != 1 && OooO0O0(dynamicRange, dynamicRange2, hashSet)) {
                return dynamicRange2;
            }
        }
        return null;
    }

    public static void OooO0Oo(@NonNull HashSet hashSet, @NonNull DynamicRange dynamicRange, @NonNull OooO oooO) {
        OooOOO0.OooO0o("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set<DynamicRange> setOooO0OO = oooO.f399OooO00o.OooO0OO(dynamicRange);
        if (setOooO0OO.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setOooO0OO);
        if (hashSet.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", dynamicRange, TextUtils.join("\n  ", setOooO0OO), TextUtils.join("\n  ", hashSet2)));
        }
    }
}
