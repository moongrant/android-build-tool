package Oooo0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOO0O implements OooO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f404OooO00o = new OooO(new OooOO0O());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<DynamicRange> f405OooO0O0 = Collections.singleton(DynamicRange.f3400OooO0Oo);

    @Override // Oooo0.OooO.OooO00o
    @NonNull
    public final Set<DynamicRange> OooO00o() {
        return f405OooO0O0;
    }

    @Override // Oooo0.OooO.OooO00o
    @Nullable
    public final DynamicRangeProfiles OooO0O0() {
        return null;
    }

    @Override // Oooo0.OooO.OooO00o
    @NonNull
    public final Set<DynamicRange> OooO0OO(@NonNull DynamicRange dynamicRange) {
        o000OO.OooOOO0.OooO0O0(DynamicRange.f3400OooO0Oo.equals(dynamicRange), "DynamicRange is not supported: " + dynamicRange);
        return f405OooO0O0;
    }
}
