package p219o00oO0O0;

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
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class o0O000o0 implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Bitmap.Config[] f33663OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Bitmap.Config[] f33664OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Bitmap.Config[] f33665OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Bitmap.Config[] f33666OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Bitmap.Config[] f33667OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO f33668OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00000<OooO0O0, Bitmap> f33669OooO0O0 = new o0O00000<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f33670OooO0OO = new HashMap();

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33671OooO00o;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f33671OooO00o = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33671OooO00o[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33671OooO00o[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33671OooO00o[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    public static final class OooO0O0 implements o0O000Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0OO f33672OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f33673OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Bitmap.Config f33674OooO0OO;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f33672OooO00o = oooO0OO;
        }

        @Override // p219o00oO0O0.o0O000Oo
        public final void OooO00o() {
            this.f33672OooO00o.OooO0OO(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f33673OooO0O0 == oooO0O0.f33673OooO0O0 && o000O000.OooO0O0(this.f33674OooO0OO, oooO0O0.f33674OooO0OO);
        }

        public final int hashCode() {
            int i = this.f33673OooO0O0 * 31;
            Bitmap.Config config = this.f33674OooO0OO;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return o0O000o0.OooO0OO(this.f33673OooO0O0, this.f33674OooO0OO);
        }
    }

    @VisibleForTesting
    public static class OooO0OO extends oo00oO<OooO0O0> {
        @Override // p219o00oO0O0.oo00oO
        public final o0O000Oo OooO00o() {
            return new OooO0O0(this);
        }

        public final OooO0O0 OooO0Oo(int i, Bitmap.Config config) {
            OooO0O0 OooO0O1 = OooO0O0();
            OooO0O1.f33673OooO0O0 = i;
            OooO0O1.f33674OooO0OO = config;
            return OooO0O1;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f33663OooO0Oo = configArr;
        f33665OooO0o0 = configArr;
        f33664OooO0o = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f33666OooO0oO = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f33667OooO0oo = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
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
        Bitmap.Config[] configArr;
        int iOooO0OO = o000O000.OooO0OO(i, i2, config);
        OooO0O0 oooO0O0OooO0Oo = this.f33668OooO00o.OooO0Oo(iOooO0OO, config);
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i3 = OooO00o.f33671OooO00o[config.ordinal()];
            if (i3 == 1) {
                configArr = f33663OooO0Oo;
            } else if (i3 == 2) {
                configArr = f33664OooO0o;
            } else if (i3 != 3) {
                configArr = i3 != 4 ? new Bitmap.Config[]{config} : f33667OooO0oo;
            } else {
                configArr = f33666OooO0oO;
            }
        } else {
            configArr = f33665OooO0o0;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = OooO0Oo(config2).ceilingKey(Integer.valueOf(iOooO0OO));
            if (numCeilingKey != null && numCeilingKey.intValue() <= iOooO0OO * 8) {
                if (numCeilingKey.intValue() == iOooO0OO && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f33668OooO00o.OooO0OO(oooO0O0OooO0Oo);
                oooO0O0OooO0Oo = this.f33668OooO00o.OooO0Oo(numCeilingKey.intValue(), config2);
                break;
            }
        }
        Bitmap bitmapOooO00o = this.f33669OooO0O0.OooO00o(oooO0O0OooO0Oo);
        if (bitmapOooO00o != null) {
            OooO00o(Integer.valueOf(oooO0O0OooO0Oo.f33673OooO0O0), bitmapOooO00o);
            bitmapOooO00o.reconfigure(i, i2, config);
        }
        return bitmapOooO00o;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final NavigableMap<Integer, Integer> OooO0Oo(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f33670OooO0OO.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f33670OooO0OO.put(config, treeMap);
        return treeMap;
    }

    public final void OooO0o(Bitmap bitmap) {
        OooO0O0 oooO0O0OooO0Oo = this.f33668OooO00o.OooO0Oo(o000O000.OooO0Oo(bitmap), bitmap.getConfig());
        this.f33669OooO0O0.OooO0O0(oooO0O0OooO0Oo, bitmap);
        NavigableMap<Integer, Integer> navigableMapOooO0Oo = OooO0Oo(bitmap.getConfig());
        Integer num = navigableMapOooO0Oo.get(Integer.valueOf(oooO0O0OooO0Oo.f33673OooO0O0));
        navigableMapOooO0Oo.put(Integer.valueOf(oooO0O0OooO0Oo.f33673OooO0O0), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String OooO0o0(Bitmap bitmap) {
        return OooO0OO(o000O000.OooO0Oo(bitmap), bitmap.getConfig());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SizeConfigStrategy{groupedMap=");
        sbOooO0o0.append(this.f33669OooO0O0);
        sbOooO0o0.append(", sortedSizes=(");
        for (Map.Entry entry : this.f33670OooO0OO.entrySet()) {
            sbOooO0o0.append(entry.getKey());
            sbOooO0o0.append('[');
            sbOooO0o0.append(entry.getValue());
            sbOooO0o0.append("], ");
        }
        if (!this.f33670OooO0OO.isEmpty()) {
            sbOooO0o0.replace(sbOooO0o0.length() - 2, sbOooO0o0.length(), "");
        }
        sbOooO0o0.append(")}");
        return sbOooO0o0.toString();
    }
}
