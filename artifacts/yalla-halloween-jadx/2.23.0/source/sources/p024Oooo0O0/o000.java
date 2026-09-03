package p024Oooo0O0;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.o00O0O0O;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o000 implements o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f1013OooO00o;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f1014OooO00o;

        static {
            int[] iArr = new int[SurfaceConfig.ConfigType.values().length];
            f1014OooO00o = iArr;
            try {
                iArr[SurfaceConfig.ConfigType.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1014OooO00o[SurfaceConfig.ConfigType.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1014OooO00o[SurfaceConfig.ConfigType.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f1013OooO00o = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    @Nullable
    public static Size OooO0Oo(@NonNull SurfaceConfig.ConfigType configType) {
        if (!OooO0o0()) {
            return null;
        }
        int i = OooO00o.f1014OooO00o[configType.ordinal()];
        if (i == 1) {
            return new Size(1920, 1080);
        }
        if (i == 2) {
            return new Size(1280, 720);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }

    public static boolean OooO0o0() {
        boolean zEqualsIgnoreCase = "samsung".equalsIgnoreCase(Build.BRAND);
        HashMap map = f1013OooO00o;
        if (!(zEqualsIgnoreCase && map.containsKey(Build.MODEL.toUpperCase(Locale.US)))) {
            return false;
        }
        Range range = (Range) map.get(Build.MODEL.toUpperCase(Locale.US));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }
}
