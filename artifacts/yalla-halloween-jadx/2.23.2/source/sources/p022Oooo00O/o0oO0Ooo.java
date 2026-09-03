package p022Oooo00O;

import Oooo000.OooO00o;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000O00O;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.oOO00O;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f874OooO00o = Config.OooO00o.OooO00o(Long.TYPE, "camera2.streamSpec.streamUseCase");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f875OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final HashMap f876OooO0OO;

    static {
        HashMap map = new HashMap();
        f875OooO0O0 = map;
        HashMap map2 = new HashMap();
        f876OooO0OO = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.PREVIEW;
            hashSet.add(captureType);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(captureType);
            hashSet2.add(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
            hashSet3.add(captureType2);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            UseCaseConfigFactory.CaptureType captureType3 = UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            hashSet4.add(captureType3);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(captureType);
            hashSet5.add(captureType2);
            hashSet5.add(captureType3);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(captureType);
            hashSet6.add(captureType3);
            map2.put(3L, hashSet6);
        }
    }

    @Nullable
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public static OooO00o OooO00o(Config config, long j) {
        OooO0o oooO0o = f874OooO00o;
        if (config.OooO0o0(oooO0o) && ((Long) config.OooO0O0(oooO0o)).longValue() == j) {
            return null;
        }
        oOO00O ooo00oOooo0o0 = oOO00O.Oooo0o0(config);
        ooo00oOooo0o0.Oooo0oO(oooO0o, Long.valueOf(j));
        return new OooO00o(ooo00oOooo0o0);
    }

    public static boolean OooO0O0(UseCaseConfigFactory.CaptureType captureType, long j, List<UseCaseConfigFactory.CaptureType> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            HashMap map = f875OooO0O0;
            return map.containsKey(Long.valueOf(j)) && ((Set) map.get(Long.valueOf(j))).contains(captureType);
        }
        HashMap map2 = f876OooO0OO;
        if (!map2.containsKey(Long.valueOf(j))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<UseCaseConfigFactory.CaptureType> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public static boolean OooO0OO(Config config, UseCaseConfigFactory.CaptureType captureType) {
        char c;
        if (((Boolean) config.OooOoO(o00Oo00.f3759OooOoo0, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        OooO0o oooO0o = o000O00O.f3693Oooo000;
        if (!config.OooO0o0(oooO0o)) {
            return false;
        }
        int iIntValue = ((Integer) config.OooO0O0(oooO0o)).intValue();
        int i = o0OO000o.f806OooO00o[captureType.ordinal()];
        if (i != 1) {
            c = 3;
            if (i != 2 && i != 3) {
                c = 1;
            }
        } else if (iIntValue == 2) {
            c = 5;
        } else {
            c = 1;
        }
        return c == 5;
    }
}
