package p128o00O0oOO;

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
import o00OO00O.OooOOOO;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo.o00000O;
import p122o00O0o.OooO0OO;
import p124o00O0o00.OooOOO;
import p126o00O0o0o.o0000Ooo;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000O0o;
import p130o00O0oo.o000Oo0;
import p131o00O0oo0.o000000;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00000O f36724OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000000 f36725OooO0O0;

    public o000O00O(@NotNull o00000O o00000o, @NotNull o000000 o000000Var) {
        this.f36724OooO00o = o00000o;
        this.f36725OooO0O0 = o000000Var;
    }

    @NotNull
    public static o000000O OooO0OO(@NotNull o0000Ooo o0000ooo, @NotNull OooO00o oooO00o, @NotNull MemoryCache.Key key, @NotNull MemoryCache.OooO00o oooO00o2) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(oooO00o.f11639OooO00o.getResources(), oooO00o2.f11634OooO00o);
        DataSource dataSource = DataSource.MEMORY_CACHE;
        Map<String, Object> map = oooO00o2.f11635OooO0O0;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
        return new o000000O(bitmapDrawable, oooO00o, dataSource, key, str, zBooleanValue, (o0000ooo instanceof o0000Ooo) && o0000ooo.f36685OooO0oO);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fe  */
    @Nullable
    public final MemoryCache.OooO00o OooO00o(@NotNull OooO00o oooO00o, @NotNull MemoryCache.Key key, @NotNull o000O0Oo o000o0oo2, @NotNull Scale scale) {
        boolean zAreEqual;
        boolean z;
        if (!oooO00o.f11659OooOo00.getReadEnabled()) {
            return null;
        }
        MemoryCache memoryCacheOooO0Oo = this.f36724OooO00o.OooO0Oo();
        MemoryCache.OooO00o oooO00oOooO0O0 = memoryCacheOooO0Oo != null ? memoryCacheOooO0Oo.OooO0O0(key) : null;
        if (oooO00oOooO0O0 != null) {
            Bitmap bitmap = oooO00oOooO0O0.f11634OooO00o;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            this.f36725OooO0O0.getClass();
            if (o000000.OooO0O0(oooO00o, config)) {
                Object obj = oooO00oOooO0O0.f11635OooO0O0.get("coil#is_sampled");
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                if (!o000O0o.OooO00o(o000o0oo2)) {
                    String str = key.f11633OooO0o0.get("coil#transformation_size");
                    if (str != null) {
                        zAreEqual = Intrinsics.areEqual(str, o000o0oo2.toString());
                    } else {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        o000Oo0 o000oo1 = o000o0oo2.f36771OooO00o;
                        int i = o000oo1 instanceof o000Oo0.OooO00o ? ((o000Oo0.OooO00o) o000oo1).f36777OooO00o : Integer.MAX_VALUE;
                        o000Oo0 o000oo2 = o000o0oo2.f36772OooO0O0;
                        int i2 = o000oo2 instanceof o000Oo0.OooO00o ? ((o000Oo0.OooO00o) o000oo2).f36777OooO00o : Integer.MAX_VALUE;
                        double dOooO00o = OooOOO.OooO00o(width, height, i, i2, scale);
                        boolean zOooO00o = OooOOOO.OooO00o(oooO00o);
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
    public final MemoryCache.Key OooO0O0(@NotNull OooO00o oooO00o, @NotNull Object obj, @NotNull o0O0O00 o0o0o00, @NotNull p118o00O0Oo.o000000 o000000Var) {
        String strOooO00o;
        Map mapEmptyMap;
        MemoryCache.Key key = oooO00o.f11644OooO0o0;
        if (key != null) {
            return key;
        }
        o000000Var.OooOO0o();
        List<Pair<OooO0OO<? extends Object>, Class<? extends Object>>> list = this.f36724OooO00o.getComponents().f36404OooO0OO;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strOooO00o = null;
                break;
            }
            Pair<OooO0OO<? extends Object>, Class<? extends Object>> pair = list.get(i);
            OooO0OO<? extends Object> oooO0OOComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(oooO0OOComponent1, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strOooO00o = oooO0OOComponent1.OooO00o(obj, o0o0o00);
                if (strOooO00o != null) {
                    break;
                }
            }
            i++;
        }
        o000000Var.OooOOO0();
        if (strOooO00o == null) {
            return null;
        }
        Map<String, o000OOo.OooO0O0> map = oooO00o.f11667OooOooO.f36800OooO0Oo;
        if (map.isEmpty()) {
            mapEmptyMap = MapsKt.emptyMap();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, o000OOo.OooO0O0> entry : map.entrySet()) {
                String str = entry.getValue().f36803OooO0O0;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            mapEmptyMap = linkedHashMap;
        }
        List<o00O.OooO0OO> list2 = oooO00o.f11649OooOO0o;
        if (list2.isEmpty() && mapEmptyMap.isEmpty()) {
            return new MemoryCache.Key(strOooO00o, MapsKt.emptyMap());
        }
        Map mutableMap = MapsKt.toMutableMap(mapEmptyMap);
        if (!list2.isEmpty()) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                mutableMap.put(android.support.v4.media.OooO00o.OooO00o("coil#transformation_", i2), list2.get(i2).getCacheKey());
            }
            mutableMap.put("coil#transformation_size", o0o0o00.f36841OooO0Oo.toString());
        }
        return new MemoryCache.Key(strOooO00o, mutableMap);
    }
}
