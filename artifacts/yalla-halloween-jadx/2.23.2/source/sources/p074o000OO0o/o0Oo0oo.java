package p074o000OO0o;

import android.content.Context;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.OooO0OO;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0O00;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import com.zego.zegoliveroom.constants.ZegoConstants;
import io.agora.rtc.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import o000O0O.OooOo;
import p080o000OoO.o00;
import p080o000OoO.o0000O0;
import p080o000OoO.o0000Ooo;
import p080o000OoO.o000O00;
import p080o000OoO.o00Oo0;
import p080o000OoO.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0Oo0oo implements oo000o, OooOo {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final o0O00 f34441OooOOO = ImmutableList.OooOOOO(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final o0O00 f34442OooOOOO = ImmutableList.OooOOOO(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final o0O00 f34443OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final o0O00 f34444OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final o0O00 f34445OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final o0O00 f34446OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public static o0Oo0oo f34447OooOo00;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f34448OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ImmutableMap<Integer, Long> f34449OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo000o.OooO00o.C0398OooO00o f34450OooO0O0 = new oo000o.OooO00o.C0398OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0O00 f34451OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0ooOOo f34452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f34453OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f34454OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f34455OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f34456OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f34457OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f34458OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f34459OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f34460OooOOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Context f34461OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashMap f34462OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f34463OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o000O00 f34464OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f34465OooO0o0;

        /* JADX WARN: Code duplicated, block: B:13:0x002a  */
        public OooO00o(Context context) {
            String strOooO0O0;
            TelephonyManager telephonyManager;
            this.f34461OooO00o = context == null ? null : context.getApplicationContext();
            int i = o00.f34910OooO00o;
            if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                strOooO0O0 = OooO0OO.OooO0O0(Locale.getDefault().getCountry());
            } else {
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(networkCountryIso)) {
                    strOooO0O0 = OooO0OO.OooO0O0(Locale.getDefault().getCountry());
                } else {
                    strOooO0O0 = OooO0OO.OooO0O0(networkCountryIso);
                }
            }
            int[] iArrOooO0oo = o0Oo0oo.OooO0oo(strOooO0O0);
            HashMap map = new HashMap(8);
            map.put(0, Long.valueOf(AnimationKt.MillisToNanos));
            o0O00 o0o01 = o0Oo0oo.f34441OooOOO;
            map.put(2, (Long) o0o01.get(iArrOooO0oo[0]));
            map.put(3, (Long) o0Oo0oo.f34442OooOOOO.get(iArrOooO0oo[1]));
            map.put(4, (Long) o0Oo0oo.f34443OooOOOo.get(iArrOooO0oo[2]));
            map.put(5, (Long) o0Oo0oo.f34445OooOOo0.get(iArrOooO0oo[3]));
            map.put(10, (Long) o0Oo0oo.f34444OooOOo.get(iArrOooO0oo[4]));
            map.put(9, (Long) o0Oo0oo.f34446OooOOoo.get(iArrOooO0oo[5]));
            map.put(7, (Long) o0o01.get(iArrOooO0oo[0]));
            this.f34462OooO0O0 = map;
            this.f34463OooO0OO = 2000;
            this.f34464OooO0Oo = o0ooOOo.f34997OooO00o;
            this.f34465OooO0o0 = true;
        }
    }

    static {
        Long lValueOf = Long.valueOf(AnimationKt.MillisToNanos);
        f34443OooOOOo = ImmutableList.OooOOOO(2100000L, 1400000L, lValueOf, 890000L, 640000L);
        f34445OooOOo0 = ImmutableList.OooOOOO(2600000L, 1700000L, 1300000L, lValueOf, 700000L);
        f34444OooOOo = ImmutableList.OooOOOO(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
        f34446OooOOoo = ImmutableList.OooOOOO(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    }

    public o0Oo0oo(Context context, HashMap map, int i, o000O00 o000o01, boolean z) {
        this.f34449OooO00o = ImmutableMap.OooO0O0(map);
        this.f34451OooO0OO = new o0O0O00(i);
        this.f34452OooO0Oo = o000o01;
        this.f34454OooO0o0 = z;
        if (context == null) {
            this.f34448OooO = 0;
            this.f34459OooOO0o = OooO(0);
            return;
        }
        o0000O0 o0000o0OooO0O0 = o0000O0.OooO0O0(context);
        int iOooO0OO = o0000o0OooO0O0.OooO0OO();
        this.f34448OooO = iOooO0OO;
        this.f34459OooOO0o = OooO(iOooO0OO);
        o0000O0.OooO00o oooO00o = new o0000O0.OooO00o() { // from class: o000OO0o.o0OOO0o
            @Override // o000OoO.o0000O0.OooO00o
            public final void OooO00o(int i2) {
                o0Oo0oo o0oo0oo2 = this.f34440OooO00o;
                synchronized (o0oo0oo2) {
                    int i3 = o0oo0oo2.f34448OooO;
                    if (i3 == 0 || o0oo0oo2.f34454OooO0o0) {
                        if (i3 == i2) {
                            return;
                        }
                        o0oo0oo2.f34448OooO = i2;
                        if (i2 != 1 && i2 != 0 && i2 != 8) {
                            o0oo0oo2.f34459OooOO0o = o0oo0oo2.OooO(i2);
                            long jElapsedRealtime = o0oo0oo2.f34452OooO0Oo.elapsedRealtime();
                            o0oo0oo2.OooOO0(o0oo0oo2.f34453OooO0o > 0 ? (int) (jElapsedRealtime - o0oo0oo2.f34455OooO0oO) : 0, o0oo0oo2.f34456OooO0oo, o0oo0oo2.f34459OooOO0o);
                            o0oo0oo2.f34455OooO0oO = jElapsedRealtime;
                            o0oo0oo2.f34456OooO0oo = 0L;
                            o0oo0oo2.f34458OooOO0O = 0L;
                            o0oo0oo2.f34457OooOO0 = 0L;
                            o0O0O00 o0o0o00 = o0oo0oo2.f34451OooO0OO;
                            o0o0o00.f34431OooO0O0.clear();
                            o0o0o00.f34433OooO0Oo = -1;
                            o0o0o00.f34435OooO0o0 = 0;
                            o0o0o00.f34434OooO0o = 0;
                        }
                    }
                }
            }
        };
        CopyOnWriteArrayList<WeakReference<o0000O0.OooO00o>> copyOnWriteArrayList = o0000o0OooO0O0.f34947OooO0O0;
        for (WeakReference<o0000O0.OooO00o> weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference<>(oooO00o));
        o0000o0OooO0O0.f34946OooO00o.post(new o0000Ooo(0, o0000o0OooO0O0, oooO00o));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] OooO0oo(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b = 8;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b = 9;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b = 10;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b = 11;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b = 12;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b = 13;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b = 14;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b = 15;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b = 16;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b = 17;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b = 18;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b = 19;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b = 20;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b = 21;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b = 22;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b = 23;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b = 24;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b = 25;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b = 26;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b = 27;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b = 28;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b = 29;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b = 30;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b = 31;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b = 32;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b = 33;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b = 34;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b = 35;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b = 36;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b = 37;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b = 38;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b = 39;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b = 40;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b = 41;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b = 42;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b = 43;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b = 44;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b = 45;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b = 46;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b = 47;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b = 48;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b = 49;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b = 50;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b = 51;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b = 52;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b = 53;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b = 54;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b = 55;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b = 56;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b = 57;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b = 58;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b = 59;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b = 60;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b = Base64.padSymbol;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b = 62;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    b = 63;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b = 64;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b = 65;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b = 66;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b = 67;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b = 68;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b = 69;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b = 70;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b = 71;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b = 72;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b = 73;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b = 74;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b = 75;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b = 76;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b = 77;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b = 78;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b = 79;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b = 80;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b = 81;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b = 82;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b = 83;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b = 84;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b = 85;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b = 86;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b = 87;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b = 88;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    b = 89;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b = 90;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b = 91;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b = 92;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    b = 93;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b = 94;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b = 95;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b = 96;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    b = 97;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b = 98;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b = 99;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b = 100;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b = 101;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b = 102;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b = 103;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b = 104;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b = 105;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b = 106;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b = 107;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b = 108;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b = 109;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b = 110;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b = 111;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    b = 112;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b = 113;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b = 114;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b = 115;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b = 116;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b = 117;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b = 118;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b = 119;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b = 120;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b = 121;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b = 122;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b = 123;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b = 124;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b = 125;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b = 126;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b = ByteCompanionObject.MAX_VALUE;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b = ByteCompanionObject.MIN_VALUE;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b = 129;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b = 130;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b = 131;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b = 132;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b = 133;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b = 134;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b = 135;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b = 136;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b = 137;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b = 138;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b = 139;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b = 140;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b = 141;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b = 142;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b = 143;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b = 144;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b = 145;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b = 146;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b = 147;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b = 148;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b = 149;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b = 150;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b = 151;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b = 152;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b = 153;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b = 154;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b = 155;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b = 156;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b = 157;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b = 158;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b = 159;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b = 160;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b = 161;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b = 162;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b = 163;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b = 164;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b = 165;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b = 166;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b = 167;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b = 168;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b = 169;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b = 170;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b = 171;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b = 172;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b = 173;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b = 174;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b = 175;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b = 176;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b = 177;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b = 178;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b = 179;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    b = 180;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b = 181;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b = 182;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b = 183;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b = 184;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b = 185;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b = 186;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b = 187;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b = 188;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b = 189;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b = 190;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b = 191;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b = 192;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b = 193;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b = 194;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b = 195;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b = 196;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b = 197;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b = 198;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b = 199;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b = 200;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b = 201;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b = 202;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b = 203;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b = 204;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b = 205;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b = 206;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b = 207;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    b = 208;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b = 209;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b = 210;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b = 211;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b = 212;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b = 213;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b = 214;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b = 215;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b = 216;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b = 217;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b = 218;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b = 219;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b = 220;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b = 221;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b = 222;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    b = 223;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b = 224;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b = 225;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b = 226;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b = 227;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b = 228;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b = 229;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b = 230;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b = 231;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    b = 232;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b = 233;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b = 234;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b = 235;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b = 236;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b = 237;
                }
                break;
        }
        switch (b) {
            case 0:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 3, 4, 4, 2};
            case 2:
            case 166:
                return new int[]{4, 3, 3, 3, 2, 2};
            case 3:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 4:
            case 16:
            case 25:
            case 28:
            case 56:
            case 68:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 5:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 10:
                return new int[]{1, 2, 1, 4, 1, 4};
            case 11:
                return new int[]{0, 2, 1, 1, 3, 0};
            case 12:
            case 85:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 13:
            case 50:
            case 120:
            case 140:
            case 143:
            case 170:
            case 193:
            case 223:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 14:
            case 19:
            case 58:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 15:
            case 94:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 17:
            case 116:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 18:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
            case 63:
            case 83:
            case 189:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 21:
                return new int[]{1, 3, 1, 4, 4, 2};
            case 22:
            case 91:
            case 133:
            case Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED /* 153 */:
            case 204:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 23:
                return new int[]{4, 4, 2, 3, 2, 2};
            case 24:
            case 132:
            case 175:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 26:
                return new int[]{3, 2, 0, 1, 2, 2};
            case 27:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 1, 2, 1, 1, 0};
            case 30:
            case 118:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 31:
            case TextFieldImplKt.AnimationDuration /* 150 */:
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{1, 1, 2, 3, 2, 2};
            case 34:
            case 41:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 35:
                return new int[]{0, 2, 3, 3, 3, 3};
            case 36:
            case 111:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 37:
            case 183:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 38:
            case 76:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 0, 0, 3};
            case 40:
            case 61:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 42:
                return new int[]{1, 1, 2, 1, 3, 2};
            case 43:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 44:
                return new int[]{2, 0, 4, 3, 3, 1};
            case 45:
                return new int[]{2, 3, 4, 2, 2, 2};
            case 46:
                return new int[]{2, 4, 4, 4, 2, 2};
            case 47:
            case 110:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 48:
                return new int[]{2, 3, 0, 1, 2, 2};
            case 51:
            case 90:
            case 126:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 52:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 3, 2, 2, 2};
            case 54:
            case 201:
            case ComposerKt.reuseKey /* 207 */:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 55:
            case 60:
            case 92:
            case 124:
            case 144:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 57:
                return new int[]{3, 4, 4, 4, 4, 2};
            case 59:
                return new int[]{1, 3, 2, 1, 2, 2};
            case 64:
            case 194:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 2, 0, 2};
            case 66:
                return new int[]{3, 1, 2, 3, 2, 2};
            case 67:
                return new int[]{4, 2, 3, 0, 2, 2};
            case 69:
                return new int[]{1, 1, 2, 1, 1, 2};
            case 70:
            case IZegoLiveEventCallback.StreamEvent.RetryPlayFail /* 205 */:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 71:
                return new int[]{0, 1, 1, 2, 1, 2};
            case 72:
            case 112:
            case 115:
            case 119:
            case 200:
            case 224:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 73:
                return new int[]{1, 0, 0, 2, 2, 2};
            case 74:
            case 168:
            case 192:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 75:
                return new int[]{0, 2, 1, 0, 2, 2};
            case 77:
            case 103:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 78:
            case 208:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 79:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 80:
                return new int[]{4, 4, 4, 2, 2, 2};
            case 81:
                return new int[]{3, 1, 1, 3, 2, 2};
            case 82:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 84:
                return new int[]{2, 2, 2, 1, 1, 2};
            case 86:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 87:
                return new int[]{3, 0, 1, 1, 2, 2};
            case 88:
                return new int[]{0, 1, 1, 3, 2, 0};
            case 89:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 93:
                return new int[]{3, 1, 1, 2, 3, 2};
            case 95:
                return new int[]{1, 2, 2, 3, 4, 2};
            case 96:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 97:
                return new int[]{1, 1, 2, 1, 2, 1};
            case 98:
            case 215:
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
            case FacebookRequestErrorClassification.EC_INVALID_TOKEN /* 190 */:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 100:
                return new int[]{4, 2, 3, 3, 4, 2};
            case 101:
                return new int[]{0, 0, 1, 0, 0, 2};
            case 102:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 104:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 105:
                return new int[]{2, 0, 1, 1, 2, 2};
            case 106:
                return new int[]{0, 3, 3, 3, 4, 4};
            case 107:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 108:
            case ZegoConstants.RoomError.SessionError /* 141 */:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 109:
                return new int[]{1, 0, 4, 2, 2, 2};
            case 113:
                return new int[]{0, 2, 2, 4, 4, 4};
            case 114:
                return new int[]{1, 0, 1, 0, 0, 2};
            case 117:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 121:
                return new int[]{3, 2, 3, 4, 4, 2};
            case 122:
                return new int[]{3, 4, 3, 4, 2, 2};
            case 123:
            case 219:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 125:
                return new int[]{1, 1, 4, 2, 0, 2};
            case 127:
            case 212:
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            case 128:
                return new int[]{3, 3, 2, 1, 2, 2};
            case Constants.ERR_WATERMARK_READ /* 129 */:
                return new int[]{0, 2, 2, 0, 2, 2};
            case Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED /* 130 */:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 131:
                return new int[]{2, 0, 0, 1, 1, 2};
            case 134:
                return new int[]{4, 2, 1, 3, 2, 2};
            case 135:
                return new int[]{2, 0, 0, 1, 3, 2};
            case 136:
            case 217:
                return new int[]{3, 4, 2, 2, 2, 2};
            case 137:
                return new int[]{2, 2, 2, 3, 4, 2};
            case 138:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 139:
                return new int[]{0, 2, 4, 4, 4, 2};
            case 142:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 145:
            case 182:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 146:
                return new int[]{3, 4, 1, 3, 3, 2};
            case 147:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 148:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 149:
                return new int[]{1, 0, 4, 1, 2, 2};
            case Constants.ERR_PUBLISH_STREAM_CDN_ERROR /* 151 */:
                return new int[]{3, 4, 3, 2, 2, 2};
            case Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT /* 152 */:
                return new int[]{3, 2, 3, 4, 2, 2};
            case Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR /* 154 */:
                return new int[]{3, 4, 2, 1, 2, 2};
            case Constants.ERR_PUBLISH_STREAM_NOT_FOUND /* 155 */:
                return new int[]{2, 3, 4, 3, 2, 2};
            case Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED /* 156 */:
                return new int[]{0, 2, 3, 3, 0, 4};
            case Constants.ERR_MODULE_NOT_FOUND /* 157 */:
                return new int[]{0, 1, 2, 1, 1, 2};
            case 158:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 159:
                return new int[]{4, 0, 3, 2, 2, 2};
            case Constants.ERR_ALREADY_IN_RECORDING /* 160 */:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 161:
                return new int[]{1, 0, 2, 2, 4, 2};
            case 162:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 163:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 164:
                return new int[]{1, 2, 4, 4, 3, 2};
            case 165:
            case 199:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 167:
                return new int[]{2, 1, 3, 2, 2, 0};
            case 169:
                return new int[]{2, 1, 2, 2, 4, 2};
            case 171:
                return new int[]{2, 0, 2, 0, 2, 1};
            case 172:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 173:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 174:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 176:
                return new int[]{1, 4, 4, 4, 4, 2};
            case 177:
                return new int[]{1, 2, 2, 3, 1, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 179:
                return new int[]{2, 0, 0, 0, 2, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 3, 3};
            case 181:
                return new int[]{3, 3, 1, 0, 2, 2};
            case 184:
                return new int[]{4, 3, 1, 1, 2, 2};
            case 185:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 186:
                return new int[]{0, 1, 1, 1, 0, 2};
            case 187:
                return new int[]{2, 3, 3, 3, 3, 3};
            case 191:
                return new int[]{1, 1, 1, 1, 3, 2};
            case 195:
                return new int[]{3, 2, 2, 4, 4, 2};
            case 196:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 197:
            case 210:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 198:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 202:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 203:
                return new int[]{2, 2, 1, 3, 2, 2};
            case 206:
                return new int[]{0, 1, 2, 1, 2, 2};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
            case 221:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 213:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 214:
                return new int[]{1, 4, 0, 0, 2, 2};
            case 216:
                return new int[]{0, 2, 0, 0, 0, 0};
            case 218:
                return new int[]{0, 1, 1, 2, 4, 2};
            case 220:
                return new int[]{1, 1, 4, 1, 3, 1};
            case 222:
                return new int[]{2, 2, 3, 4, 3, 2};
            case 226:
                return new int[]{2, 2, 0, 1, 2, 2};
            case 227:
                return new int[]{0, 2, 1, 2, 2, 2};
            case 228:
                return new int[]{0, 0, 1, 2, 2, 1};
            case 229:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 232:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 234:
                return new int[]{2, 3, 3, 4, 2, 2};
            case 235:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 236:
                return new int[]{4, 4, 4, 3, 3, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public final long OooO(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ImmutableMap<Integer, Long> immutableMap = this.f34449OooO00o;
        Long lValueOf = immutableMap.get(numValueOf);
        if (lValueOf == null) {
            lValueOf = immutableMap.get(0);
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(AnimationKt.MillisToNanos);
        }
        return lValueOf.longValue();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0014 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0016 A[Catch: all -> 0x001e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:15:0x0016), top: B:21:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0014, please report this as an issue */
    @Override // o000O0O.OooOo
    public final synchronized void OooO00o(DataSpec dataSpec, boolean z, int i) {
        boolean z2 = false;
        if (!z) {
            if (z2) {
                this.f34456OooO0oo += (long) i;
                return;
            }
            return;
        } else {
            if (!((dataSpec.f6969OooO & 8) == 8)) {
                z2 = true;
            }
            if (z2) {
                return;
            }
            this.f34456OooO0oo += (long) i;
            return;
        }
        throw th;
    }

    @Override // o000O0O.OooOo
    public final void OooO0O0() {
    }

    @Override // p074o000OO0o.oo000o
    public final o0Oo0oo OooO0OO() {
        return this;
    }

    @Override // p074o000OO0o.oo000o
    public final void OooO0Oo(o000O0.OooO00o oooO00o) {
        this.f34450OooO0O0.OooO00o(oooO00o);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0013  */
    /* JADX WARN: Code duplicated, block: B:14:0x0016 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x0018 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0005, B:16:0x0018, B:19:0x001d, B:21:0x003a, B:23:0x0053, B:26:0x0065, B:25:0x005c, B:27:0x0073), top: B:33:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x001c  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:5:0x0005, B:16:0x0018, B:19:0x001d, B:21:0x003a, B:23:0x0053, B:26:0x0065, B:25:0x005c, B:27:0x0073), top: B:33:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x005c A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:5:0x0005, B:16:0x0018, B:19:0x001d, B:21:0x003a, B:23:0x0053, B:26:0x0065, B:25:0x005c, B:27:0x0073), top: B:33:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0016, please report this as an issue */
    @Override // o000O0O.OooOo
    public final synchronized void OooO0o(DataSpec dataSpec, boolean z) {
        boolean z2;
        long jElapsedRealtime;
        int i;
        long j;
        if (!z) {
            z2 = false;
            if (z2) {
                o00Oo0.OooO0Oo(this.f34453OooO0o > 0);
                jElapsedRealtime = this.f34452OooO0Oo.elapsedRealtime();
                i = (int) (jElapsedRealtime - this.f34455OooO0oO);
                this.f34457OooOO0 += (long) i;
                long j2 = this.f34458OooOO0O;
                j = this.f34456OooO0oo;
                this.f34458OooOO0O = j2 + j;
                if (i > 0) {
                    this.f34451OooO0OO.OooO00o((j * 8000.0f) / i, (int) Math.sqrt(j));
                    if (this.f34457OooOO0 < 2000) {
                        this.f34459OooOO0o = (long) this.f34451OooO0OO.OooO0O0();
                    } else {
                        this.f34459OooOO0o = (long) this.f34451OooO0OO.OooO0O0();
                    }
                    OooOO0(i, this.f34456OooO0oo, this.f34459OooOO0o);
                    this.f34455OooO0oO = jElapsedRealtime;
                    this.f34456OooO0oo = 0L;
                }
                this.f34453OooO0o--;
                return;
            }
            return;
        }
        if ((dataSpec.f6969OooO & 8) == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return;
        }
        o00Oo0.OooO0Oo(this.f34453OooO0o > 0);
        jElapsedRealtime = this.f34452OooO0Oo.elapsedRealtime();
        i = (int) (jElapsedRealtime - this.f34455OooO0oO);
        this.f34457OooOO0 += (long) i;
        long j3 = this.f34458OooOO0O;
        j = this.f34456OooO0oo;
        this.f34458OooOO0O = j3 + j;
        if (i > 0) {
            this.f34451OooO0OO.OooO00o((j * 8000.0f) / i, (int) Math.sqrt(j));
            if (this.f34457OooOO0 < 2000 || this.f34458OooOO0O >= 524288) {
                this.f34459OooOO0o = (long) this.f34451OooO0OO.OooO0O0();
            }
            OooOO0(i, this.f34456OooO0oo, this.f34459OooOO0o);
            this.f34455OooO0oO = jElapsedRealtime;
            this.f34456OooO0oo = 0L;
        }
        this.f34453OooO0o--;
        return;
        throw th;
    }

    @Override // p074o000OO0o.oo000o
    public final void OooO0o0(Handler handler, o000O0.OooO00o oooO00o) {
        oooO00o.getClass();
        oo000o.OooO00o.C0398OooO00o c0398OooO00o = this.f34450OooO0O0;
        c0398OooO00o.getClass();
        c0398OooO00o.OooO00o(oooO00o);
        c0398OooO00o.f34472OooO00o.add(new oo000o.OooO00o.C0398OooO00o.C0399OooO00o(handler, oooO00o));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0014 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0016 A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0005, B:15:0x0016, B:17:0x001a, B:18:0x0022), top: B:24:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x001a A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:5:0x0005, B:15:0x0016, B:17:0x001a, B:18:0x0022), top: B:24:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0014, please report this as an issue */
    @Override // o000O0O.OooOo
    public final synchronized void OooO0oO(DataSpec dataSpec, boolean z) {
        boolean z2 = false;
        if (!z) {
            if (z2) {
                if (this.f34453OooO0o == 0) {
                    this.f34455OooO0oO = this.f34452OooO0Oo.elapsedRealtime();
                }
                this.f34453OooO0o++;
                return;
            }
            return;
        }
        if (!((dataSpec.f6969OooO & 8) == 8)) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        if (this.f34453OooO0o == 0) {
            this.f34455OooO0oO = this.f34452OooO0Oo.elapsedRealtime();
        }
        this.f34453OooO0o++;
        return;
        throw th;
    }

    public final void OooOO0(final int i, final long j, final long j2) {
        if (i == 0 && j == 0 && j2 == this.f34460OooOOO0) {
            return;
        }
        this.f34460OooOOO0 = j2;
        for (final oo000o.OooO00o.C0398OooO00o.C0399OooO00o c0399OooO00o : this.f34450OooO0O0.f34472OooO00o) {
            if (!c0399OooO00o.f34475OooO0OO) {
                c0399OooO00o.f34473OooO00o.post(new Runnable() { // from class: o000OO0o.o00Ooo
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0399OooO00o.f34474OooO0O0.OooOOoo(i, j, j2);
                    }
                });
            }
        }
    }
}
