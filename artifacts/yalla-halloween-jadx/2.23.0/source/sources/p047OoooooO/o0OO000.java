package p047OoooooO;

import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.io.ConstantsKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f2050OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f2051OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final HashMap f2052OooO0OO;

    static {
        HashMap map = new HashMap();
        f2050OooO00o = map;
        HashMap map2 = new HashMap();
        f2051OooO0O0 = map2;
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        f2052OooO0OO = map4;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(0, 1);
        map3.put(1, 3);
        map3.put(2, 4);
        map3.put(3, 5);
        map3.put(4, 6);
        HashMap map5 = new HashMap();
        DynamicRange dynamicRange = DynamicRange.f3400OooO0Oo;
        map5.put(dynamicRange, 1);
        DynamicRange dynamicRange2 = DynamicRange.f3402OooO0o0;
        map5.put(dynamicRange2, 2);
        DynamicRange dynamicRange3 = DynamicRange.f3401OooO0o;
        map5.put(dynamicRange3, 4096);
        DynamicRange dynamicRange4 = DynamicRange.f3403OooO0oO;
        map5.put(dynamicRange4, 8192);
        HashMap map6 = new HashMap();
        map6.put(dynamicRange, 1);
        map6.put(dynamicRange2, 2);
        map6.put(dynamicRange3, 4096);
        map6.put(dynamicRange4, 8192);
        HashMap map7 = new HashMap();
        map7.put(dynamicRange, 1);
        map7.put(dynamicRange2, 4);
        map7.put(dynamicRange3, 4096);
        map7.put(dynamicRange4, 16384);
        HashMap map8 = new HashMap();
        map8.put(DynamicRange.f3404OooO0oo, Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES));
        map8.put(DynamicRange.f3398OooO, Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE));
        map4.put("video/hevc", map5);
        map4.put("video/av01", map6);
        map4.put("video/x-vnd.on2.vp9", map7);
        map4.put("video/dolby-vision", map8);
    }
}
