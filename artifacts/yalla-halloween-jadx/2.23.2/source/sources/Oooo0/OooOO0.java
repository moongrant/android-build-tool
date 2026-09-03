package Oooo0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class OooOO0 implements OooO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final DynamicRangeProfiles f402OooO00o;

    public OooOO0(@NonNull Object obj) {
        this.f402OooO00o = (DynamicRangeProfiles) obj;
    }

    @NonNull
    public static Set<DynamicRange> OooO0Oo(@NonNull Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            DynamicRange dynamicRangeOooO0O0 = OooO0O0.OooO0O0(jLongValue);
            o000OO.OooOOO0.OooO0o0(dynamicRangeOooO0O0, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(dynamicRangeOooO0O0);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // Oooo0.OooO.OooO00o
    @NonNull
    public final Set<DynamicRange> OooO00o() {
        return OooO0Oo(this.f402OooO00o.getSupportedProfiles());
    }

    @Override // Oooo0.OooO.OooO00o
    @Nullable
    public final DynamicRangeProfiles OooO0O0() {
        return this.f402OooO00o;
    }

    @Override // Oooo0.OooO.OooO00o
    @NonNull
    public final Set<DynamicRange> OooO0OO(@NonNull DynamicRange dynamicRange) {
        DynamicRangeProfiles dynamicRangeProfiles = this.f402OooO00o;
        Long lOooO00o = OooO0O0.OooO00o(dynamicRange, dynamicRangeProfiles);
        o000OO.OooOOO0.OooO0O0(lOooO00o != null, "DynamicRange is not supported: " + dynamicRange);
        return OooO0Oo(dynamicRangeProfiles.getProfileCaptureRequestConstraints(lOooO00o.longValue()));
    }
}
