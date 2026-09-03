package p046Oooooo0;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.OooOo;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.io.ConstantsKt;
import o000OO.OooOOO0;
import org.conscrypt.PSKKeyManager;
import p028Oooo0oO.o00O0O0;
import p039OoooOoo.o00OO;
import p041Ooooo0o.o00000OO;
import p041Ooooo0o.o000OOo;
import p045Oooooo.OooOo00;
import p045Oooooo.o00;
import p045Oooooo.o000OOo0;
import p047OoooooO.o0OO000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f2032OooO00o;

    static {
        HashMap map = new HashMap();
        f2032OooO00o = map;
        HashMap map2 = new HashMap();
        OooOo00 oooOo00 = o00.f1862OooO00o;
        map2.put(1, oooOo00);
        OooOo00 oooOo01 = o00.f1864OooO0OO;
        map2.put(2, oooOo01);
        OooOo00 oooOo02 = o00.f1865OooO0Oo;
        map2.put(4096, oooOo02);
        map2.put(8192, oooOo02);
        HashMap map3 = new HashMap();
        map3.put(1, oooOo00);
        map3.put(2, oooOo01);
        map3.put(4096, oooOo02);
        map3.put(8192, oooOo02);
        HashMap map4 = new HashMap();
        map4.put(1, oooOo00);
        map4.put(4, oooOo01);
        map4.put(4096, oooOo02);
        map4.put(16384, oooOo02);
        map4.put(2, oooOo00);
        map4.put(8, oooOo01);
        map4.put(8192, oooOo02);
        map4.put(Integer.valueOf(ShareRequest.THUMB_DATA_SIZE_LIMIT), oooOo02);
        HashMap map5 = new HashMap();
        map5.put(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), oooOo01);
        map5.put(Integer.valueOf(ConstantsKt.MINIMUM_BLOCK_SIZE), o00.f1863OooO0O0);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    @NonNull
    public static o00 OooO00o(int i, @NonNull String str) {
        o00 o00Var;
        Map map = (Map) f2032OooO00o.get(str);
        if (map != null && (o00Var = (o00) map.get(Integer.valueOf(i))) != null) {
            return o00Var;
        }
        o00O0O0.OooO0oo("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i)));
        return o00.f1862OooO00o;
    }

    @NonNull
    public static o000OOo0 OooO0O0(@NonNull o0OoOoOo o0oooooo, @NonNull Timebase timebase, @NonNull OooOo oooOo, @NonNull Size size, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyOooO0OO = o0oooooo.OooO0OO();
        return (o000OOo0) (videoProfileProxyOooO0OO != null ? new o0O000O(o0oooooo.OooO00o(), timebase, oooOo, size, videoProfileProxyOooO0OO, dynamicRange, range) : new o0O000(o0oooooo.OooO00o(), timebase, oooOo, size, dynamicRange, range)).get();
    }

    @NonNull
    public static o0OoOoOo OooO0OO(@NonNull MediaSpec mediaSpec, @NonNull DynamicRange dynamicRange, @Nullable o00000OO o00000oo2) {
        EncoderProfilesProxy.VideoProfileProxy next;
        OooOOO0.OooO0o("Dynamic range must be a fully specified dynamic range [provided dynamic range: " + dynamicRange + "]", dynamicRange.OooO0O0());
        String str = "video/avc";
        String str2 = mediaSpec.OooO0OO() != 1 ? "video/avc" : "video/x-vnd.on2.vp8";
        int i = dynamicRange.f3405OooO00o;
        if (o00000oo2 == null) {
            next = null;
        } else {
            Set setEmptySet = (Set) o0OO000.f2051OooO0O0.get(Integer.valueOf(i));
            if (setEmptySet == null) {
                setEmptySet = Collections.emptySet();
            }
            Set setEmptySet2 = (Set) o0OO000.f2050OooO00o.get(Integer.valueOf(dynamicRange.f3406OooO0O0));
            if (setEmptySet2 == null) {
                setEmptySet2 = Collections.emptySet();
            }
            Iterator<EncoderProfilesProxy.VideoProfileProxy> it = ((o000OOo) o00000oo2).f1772OooO0Oo.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (setEmptySet.contains(Integer.valueOf(next.OooO0oO())) && setEmptySet2.contains(Integer.valueOf(next.OooO0O0()))) {
                        String strOooO = next.OooO();
                        if (str2.equals(strOooO)) {
                            o00O0O0.OooO00o("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str2 + "]");
                        } else if (mediaSpec.OooO0OO() == -1) {
                            o00O0O0.OooO00o("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
                        }
                        str2 = strOooO;
                    }
                } else {
                    next = null;
                }
            }
        }
        if (next == null) {
            if (mediaSpec.OooO0OO() == -1) {
                if (i != 1) {
                    if (i == 3 || i == 4 || i == 5) {
                        str = "video/hevc";
                    } else {
                        if (i != 6) {
                            throw new UnsupportedOperationException("Unsupported dynamic range: " + dynamicRange + "\nNo supported default mime type available.");
                        }
                        str = "video/dolby-vision";
                    }
                }
                str2 = str;
            }
            if (o00000oo2 == null) {
                o00O0O0.OooO00o("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
            } else {
                o00O0O0.OooO00o("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str2 + ", dynamic range: " + dynamicRange + "]");
            }
        }
        o0.OooO00o oooO00o = new o0.OooO00o();
        if (str2 == null) {
            throw new NullPointerException("Null mimeType");
        }
        oooO00o.f2010OooO00o = str2;
        oooO00o.f2011OooO0O0 = -1;
        if (next != null) {
            oooO00o.f2012OooO0OO = next;
        }
        return oooO00o.OooO00o();
    }

    public static int OooO0Oo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NonNull Range<Integer> range) {
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        int iDoubleValue = (int) (new Rational(i8, i9).doubleValue() * new Rational(i6, i7).doubleValue() * rational2.doubleValue() * rational.doubleValue() * ((double) i));
        String string = o00O0O0.OooO0o0("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(iDoubleValue)) : "";
        if (!OooOo.f4023OooO0O0.equals(range)) {
            iDoubleValue = ((Integer) range.clamp(Integer.valueOf(iDoubleValue))).intValue();
            if (o00O0O0.OooO0o0("VideoConfigUtil")) {
                StringBuilder sbOooO00o = o00OO.OooO00o(string);
                sbOooO00o.append(String.format("\nClamped to range %s -> %dbps", range, Integer.valueOf(iDoubleValue)));
                string = sbOooO00o.toString();
            }
        }
        o00O0O0.OooO00o("VideoConfigUtil", string);
        return iDoubleValue;
    }
}
