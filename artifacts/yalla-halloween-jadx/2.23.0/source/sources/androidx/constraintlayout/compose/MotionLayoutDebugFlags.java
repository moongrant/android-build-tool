package androidx.constraintlayout.compose;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "", "NONE", "SHOW_ALL", "UNKNOWN", "compose_release"}, k = 1, mv = {1, 5, 1})
public enum MotionLayoutDebugFlags {
    NONE,
    SHOW_ALL,
    UNKNOWN;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static MotionLayoutDebugFlags[] valuesCustom() {
        MotionLayoutDebugFlags[] motionLayoutDebugFlagsArrValuesCustom = values();
        return (MotionLayoutDebugFlags[]) Arrays.copyOf(motionLayoutDebugFlagsArrValuesCustom, motionLayoutDebugFlagsArrValuesCustom.length);
    }
}
