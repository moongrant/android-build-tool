package Oooo0;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f400OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f401OooO0O0;

    static {
        DynamicRange dynamicRange;
        HashMap map = new HashMap();
        f400OooO00o = map;
        HashMap map2 = new HashMap();
        f401OooO0O0 = map2;
        DynamicRange dynamicRange2 = DynamicRange.f3398OooO0Oo;
        map.put(1L, dynamicRange2);
        map2.put(dynamicRange2, Collections.singletonList(1L));
        map.put(2L, DynamicRange.f3400OooO0o0);
        map2.put((DynamicRange) map.get(2L), Collections.singletonList(2L));
        DynamicRange dynamicRange3 = DynamicRange.f3399OooO0o;
        map.put(4L, dynamicRange3);
        map2.put(dynamicRange3, Collections.singletonList(4L));
        DynamicRange dynamicRange4 = DynamicRange.f3401OooO0oO;
        map.put(8L, dynamicRange4);
        map2.put(dynamicRange4, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            dynamicRange = DynamicRange.f3402OooO0oo;
            if (!zHasNext) {
                break;
            } else {
                f400OooO00o.put((Long) it.next(), dynamicRange);
            }
        }
        f401OooO0O0.put(dynamicRange, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            DynamicRange dynamicRange5 = DynamicRange.f3396OooO;
            if (!zHasNext2) {
                f401OooO0O0.put(dynamicRange5, listAsList2);
                return;
            }
            f400OooO00o.put((Long) it2.next(), dynamicRange5);
        }
    }

    @Nullable
    @DoNotInline
    public static Long OooO00o(@NonNull DynamicRange dynamicRange, @NonNull DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f401OooO0O0.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }

    @Nullable
    @DoNotInline
    public static DynamicRange OooO0O0(long j) {
        return (DynamicRange) f400OooO00o.get(Long.valueOf(j));
    }
}
