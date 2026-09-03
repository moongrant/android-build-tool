package p108o000ooOO;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import coil.request.OooO00o;
import coil.size.Scale;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o00.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o0000O0O;
import p097o000o0oO.o000O000;
import p101o000oo.o0ooOOo;
import p103o000oo00.Oooo0;
import p109o000ooo.o0O0O00;
import p109o000ooo.o0OO00O;
import p109o000ooo.o0Oo0oo;
import p109o000ooo.oo0o0Oo;
import p111o000oooO.o00O00;
import p111o000oooO.o00O0000;
import p111o000oooO.o0O0ooO;
import p321o0O0ooO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O000 f35819OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oo0o0Oo f35820OooO0O0;

    public o000OO0O(@NotNull o000O000 o000o001, @NotNull oo0o0Oo oo0o0oo) {
        this.f35819OooO00o = o000o001;
        this.f35820OooO0O0 = oo0o0oo;
    }

    @NotNull
    public static o0O0O00 OooO0OO(@NotNull o0ooOOo o0ooooo, @NotNull OooO00o oooO00o, @NotNull MemoryCache.Key key, @NotNull MemoryCache.OooO00o oooO00o2) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(oooO00o.f8549OooO00o.getResources(), oooO00o2.f8544OooO00o);
        DataSource dataSource = DataSource.MEMORY_CACHE;
        Map<String, Object> map = oooO00o2.f8545OooO0O0;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
        return new o0O0O00(bitmapDrawable, oooO00o, dataSource, key, str, zBooleanValue, (o0ooooo instanceof o0ooOOo) && o0ooooo.f35585OooO0oO);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fe  */
    @Nullable
    public final MemoryCache.OooO00o OooO00o(@NotNull OooO00o oooO00o, @NotNull MemoryCache.Key key, @NotNull o00O00 o00o01, @NotNull Scale scale) {
        boolean zAreEqual;
        boolean z;
        if (!oooO00o.f8569OooOo00.getReadEnabled()) {
            return null;
        }
        MemoryCache memoryCacheOooO0Oo = this.f35819OooO00o.OooO0Oo();
        MemoryCache.OooO00o oooO00oOooO0O0 = memoryCacheOooO0Oo != null ? memoryCacheOooO0Oo.OooO0O0(key) : null;
        if (oooO00oOooO0O0 != null) {
            Bitmap bitmap = oooO00oOooO0O0.f8544OooO00o;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            this.f35820OooO0O0.getClass();
            if (oo0o0Oo.OooO0O0(oooO00o, config)) {
                Object obj = oooO00oOooO0O0.f8545OooO0O0.get("coil#is_sampled");
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                if (!o00O0000.OooO00o(o00o01)) {
                    String str = key.f8543OooO0o0.get("coil#transformation_size");
                    if (str != null) {
                        zAreEqual = Intrinsics.areEqual(str, o00o01.toString());
                    } else {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        o0O0ooO o0o0ooo = o00o01.f35924OooO00o;
                        int i = o0o0ooo instanceof o0O0ooO.OooO00o ? ((o0O0ooO.OooO00o) o0o0ooo).f35937OooO00o : Integer.MAX_VALUE;
                        o0O0ooO o0o0ooo2 = o00o01.f35925OooO0O0;
                        int i2 = o0o0ooo2 instanceof o0O0ooO.OooO00o ? ((o0O0ooO.OooO00o) o0o0ooo2).f35937OooO00o : Integer.MAX_VALUE;
                        double dOooO00o = Oooo0.OooO00o(width, height, i, i2, scale);
                        boolean zOooO00o = p321o0O0ooO.o000OO0O.OooO00o(oooO00o);
                        if (zOooO00o) {
                            double dCoerceAtMost = RangesKt___RangesKt.coerceAtMost(dOooO00o, 1.0d);
                            if (Math.abs(((double) i) - (((double) width) * dCoerceAtMost)) > 1.0d && Math.abs(((double) i2) - (dCoerceAtMost * ((double) height))) > 1.0d) {
                                if (dOooO00o == 1.0d) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if ((z && !zOooO00o) || (dOooO00o > 1.0d && zBooleanValue)) {
                                    zAreEqual = false;
                                }
                            }
                        } else {
                            if ((i == Integer.MIN_VALUE || i == Integer.MAX_VALUE) || Math.abs(i - width) <= 1) {
                                if (!(i2 == Integer.MIN_VALUE || i2 == Integer.MAX_VALUE) && Math.abs(i2 - height) > 1) {
                                    if (dOooO00o == 1.0d) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                    }
                                }
                            } else {
                                if (dOooO00o == 1.0d) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                }
                            }
                        }
                        zAreEqual = true;
                    }
                } else if (zBooleanValue) {
                    zAreEqual = false;
                } else {
                    zAreEqual = true;
                }
            } else {
                zAreEqual = false;
            }
            if (zAreEqual) {
                return oooO00oOooO0O0;
            }
        }
        return null;
    }

    @Nullable
    public final MemoryCache.Key OooO0O0(@NotNull OooO00o oooO00o, @NotNull Object obj, @NotNull o0Oo0oo o0oo0oo2, @NotNull o0000O0O o0000o0o2) {
        String strOooO00o;
        Map mapEmptyMap;
        MemoryCache.Key key = oooO00o.f8554OooO0o0;
        if (key != null) {
            return key;
        }
        o0000o0o2.OooOO0o();
        List<Pair<p107o000ooO0.oo0o0Oo<? extends Object>, Class<? extends Object>>> list = this.f35819OooO00o.getComponents().f35397OooO0OO;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strOooO00o = null;
                break;
            }
            Pair<p107o000ooO0.oo0o0Oo<? extends Object>, Class<? extends Object>> pair = list.get(i);
            p107o000ooO0.oo0o0Oo<? extends Object> oo0o0ooComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(oo0o0ooComponent1, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strOooO00o = oo0o0ooComponent1.OooO00o(obj, o0oo0oo2);
                if (strOooO00o != null) {
                    break;
                }
            }
            i++;
        }
        o0000o0o2.OooOOO0();
        if (strOooO00o == null) {
            return null;
        }
        Map<String, o0OO00O.OooO0O0> map = oooO00o.f8577OooOooO.f35857OooO0Oo;
        if (map.isEmpty()) {
            mapEmptyMap = MapsKt.emptyMap();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, o0OO00O.OooO0O0> entry : map.entrySet()) {
                String str = entry.getValue().f35860OooO0O0;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            mapEmptyMap = linkedHashMap;
        }
        List<OooO0OO> list2 = oooO00o.f8559OooOO0o;
        if (list2.isEmpty() && mapEmptyMap.isEmpty()) {
            return new MemoryCache.Key(strOooO00o, MapsKt.emptyMap());
        }
        Map mutableMap = MapsKt.toMutableMap(mapEmptyMap);
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                mutableMap.put(android.support.v4.media.OooO00o.OooO00o("coil#transformation_", i2), list2.get(i2).getCacheKey());
            }
            mutableMap.put("coil#transformation_size", o0oo0oo2.f35866OooO0Oo.toString());
        }
        return new MemoryCache.Key(strOooO00o, mutableMap);
    }
}
