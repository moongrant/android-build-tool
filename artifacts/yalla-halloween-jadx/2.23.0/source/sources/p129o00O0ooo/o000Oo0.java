package p129o00O0ooo;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p039OoooOoo.o00OO;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(19)
public final class o000Oo0 implements o000O000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Bitmap.Config[] f36979OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Bitmap.Config[] f36980OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Bitmap.Config[] f36981OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Bitmap.Config[] f36982OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Bitmap.Config[] f36983OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f36984OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OO<OooO0O0, Bitmap> f36985OooO0O0 = new o000OO<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f36986OooO0OO = new HashMap();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f36987OooO00o;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f36987OooO00o = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36987OooO00o[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36987OooO00o[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36987OooO00o[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    public static final class OooO0O0 implements o000O0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f36988OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f36989OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Bitmap.Config f36990OooO0OO;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f36988OooO00o = oooO0OO;
        }

        @Override // p129o00O0ooo.o000O0o
        public final void OooO00o() {
            this.f36988OooO00o.OooO0OO(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f36989OooO0O0 == oooO0O0.f36989OooO0O0 && o0000oo.OooO0O0(this.f36990OooO0OO, oooO0O0.f36990OooO0OO);
        }

        public final int hashCode() {
            int i = this.f36989OooO0O0 * 31;
            Bitmap.Config config = this.f36990OooO0OO;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return o000Oo0.OooO0OO(this.f36989OooO0O0, this.f36990OooO0OO);
        }
    }

    @VisibleForTesting
    public static class OooO0OO extends o0000O00<OooO0O0> {
        @Override // p129o00O0ooo.o0000O00
        public final o000O0o OooO00o() {
            return new OooO0O0(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f36979OooO0Oo = configArr;
        f36981OooO0o0 = configArr;
        f36980OooO0o = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f36982OooO0oO = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f36983OooO0oo = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String OooO0OO(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void OooO00o(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapOooO0Oo = OooO0Oo(bitmap.getConfig());
        Integer num2 = navigableMapOooO0Oo.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapOooO0Oo.remove(num);
                return;
            } else {
                navigableMapOooO0Oo.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + OooO0o0(bitmap) + ", this: " + this);
    }

    @Nullable
    public final Bitmap OooO0O0(int i, int i2, Bitmap.Config config) {
        int i3;
        Bitmap.Config[] configArr;
        char[] cArr = o0000oo.f54571OooO00o;
        int i4 = i * i2;
        int i5 = o0000oo.OooO00o.f54574OooO00o[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
        if (i5 == 1) {
            i3 = 1;
        } else if (i5 == 2 || i5 == 3) {
            i3 = 2;
        } else {
            i3 = i5 != 4 ? 4 : 8;
        }
        int i6 = i3 * i4;
        OooO0OO oooO0OO = this.f36984OooO00o;
        OooO0O0 OooO0O1 = oooO0OO.OooO0O0();
        OooO0O1.f36989OooO0O0 = i6;
        OooO0O1.f36990OooO0OO = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i7 = OooO00o.f36987OooO00o[config.ordinal()];
            if (i7 == 1) {
                configArr = f36979OooO0Oo;
            } else if (i7 == 2) {
                configArr = f36980OooO0o;
            } else if (i7 != 3) {
                configArr = i7 != 4 ? new Bitmap.Config[]{config} : f36983OooO0oo;
            } else {
                configArr = f36982OooO0oO;
            }
        } else {
            configArr = f36981OooO0o0;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = OooO0Oo(config2).ceilingKey(Integer.valueOf(i6));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i6 * 8) {
                if (numCeilingKey.intValue() == i6 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                oooO0OO.OooO0OO(OooO0O1);
                int iIntValue = numCeilingKey.intValue();
                OooO0O1 = oooO0OO.OooO0O0();
                OooO0O1.f36989OooO0O0 = iIntValue;
                OooO0O1.f36990OooO0OO = config2;
                break;
            }
        }
        Bitmap bitmapOooO00o = this.f36985OooO0O0.OooO00o(OooO0O1);
        if (bitmapOooO00o != null) {
            OooO00o(Integer.valueOf(OooO0O1.f36989OooO0O0), bitmapOooO00o);
            bitmapOooO00o.reconfigure(i, i2, config);
        }
        return bitmapOooO00o;
    }

    public final NavigableMap<Integer, Integer> OooO0Oo(Bitmap.Config config) {
        HashMap map = this.f36986OooO0OO;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final void OooO0o(Bitmap bitmap) {
        int iOooO0OO = o0000oo.OooO0OO(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        OooO0O0 OooO0O1 = this.f36984OooO00o.OooO0O0();
        OooO0O1.f36989OooO0O0 = iOooO0OO;
        OooO0O1.f36990OooO0OO = config;
        this.f36985OooO0O0.OooO0O0(OooO0O1, bitmap);
        NavigableMap<Integer, Integer> navigableMapOooO0Oo = OooO0Oo(bitmap.getConfig());
        Integer num = navigableMapOooO0Oo.get(Integer.valueOf(OooO0O1.f36989OooO0O0));
        navigableMapOooO0Oo.put(Integer.valueOf(OooO0O1.f36989OooO0O0), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String OooO0o0(Bitmap bitmap) {
        return OooO0OO(o0000oo.OooO0OO(bitmap), bitmap.getConfig());
    }

    public final String toString() {
        StringBuilder sbOooO00o = o00OO.OooO00o("SizeConfigStrategy{groupedMap=");
        sbOooO00o.append(this.f36985OooO0O0);
        sbOooO00o.append(", sortedSizes=(");
        HashMap map = this.f36986OooO0OO;
        for (Map.Entry entry : map.entrySet()) {
            sbOooO00o.append(entry.getKey());
            sbOooO00o.append('[');
            sbOooO00o.append(entry.getValue());
            sbOooO00o.append("], ");
        }
        if (!map.isEmpty()) {
            sbOooO00o.replace(sbOooO00o.length() - 2, sbOooO00o.length(), "");
        }
        sbOooO00o.append(")}");
        return sbOooO00o.toString();
    }
}
