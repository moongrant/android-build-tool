package p046Oooooo0;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.OooOo;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import o000OO.OooOOO;
import p028Oooo0oO.o00O0O0;
import p045Oooooo.OooOOOO;
import p045Oooooo.o00;
import p045Oooooo.o000OOo0;
import p047OoooooO.o0OO0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O000 implements OooOOO<o000OOo0> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Size f2014OooO0oO = new Size(1280, 720);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final Range<Integer> f2015OooO0oo = new Range<>(1, 60);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f2016OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Timebase f2017OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo f2018OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Size f2019OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Range<Integer> f2020OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final DynamicRange f2021OooO0o0;

    public o0O000(@NonNull String str, @NonNull Timebase timebase, @NonNull OooOo oooOo, @NonNull Size size, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        this.f2016OooO00o = str;
        this.f2017OooO0O0 = timebase;
        this.f2018OooO0OO = oooOo;
        this.f2019OooO0Oo = size;
        this.f2021OooO0o0 = dynamicRange;
        this.f2020OooO0o = range;
    }

    @Override // o000OO.OooOOO
    @NonNull
    public final o000OOo0 get() {
        Integer num;
        Range<Integer> range = SurfaceRequest.f3500OooOOOO;
        Range<Integer> range2 = this.f2020OooO0o;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) f2015OooO0oo.clamp((Integer) range2.getUpper())).intValue() : 30;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(iIntValue);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        objArr[1] = obj;
        o00O0O0.OooO00o("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", objArr));
        o00O0O0.OooO00o("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rate: " + iIntValue + "fps");
        Range<Integer> rangeOooO0OO = this.f2018OooO0OO.OooO0OO();
        o00O0O0.OooO00o("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        DynamicRange dynamicRange = this.f2021OooO0o0;
        int i = dynamicRange.f3404OooO0O0;
        Size size = this.f2019OooO0Oo;
        int width = size.getWidth();
        Size size2 = f2014OooO0oO;
        int iOooO0Oo = o0O0000O.OooO0Oo(14000000, i, 8, iIntValue, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight(), rangeOooO0OO);
        HashMap map = o0OO0O0.f2042OooO0OO;
        String str = this.f2016OooO00o;
        Map map2 = (Map) map.get(str);
        int iIntValue2 = (map2 == null || (num = (Integer) map2.get(dynamicRange)) == null) ? -1 : num.intValue();
        o00 o00VarOooO00o = o0O0000O.OooO00o(iIntValue2, str);
        OooOOOO.OooO00o oooO00oOooO0Oo = o000OOo0.OooO0Oo();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        oooO00oOooO0Oo.f1834OooO00o = str;
        Timebase timebase = this.f2017OooO0O0;
        if (timebase == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        oooO00oOooO0Oo.f1836OooO0OO = timebase;
        oooO00oOooO0Oo.f1837OooO0Oo = size;
        oooO00oOooO0Oo.f1833OooO = Integer.valueOf(iOooO0Oo);
        oooO00oOooO0Oo.f1840OooO0oO = Integer.valueOf(iIntValue);
        oooO00oOooO0Oo.f1835OooO0O0 = Integer.valueOf(iIntValue2);
        if (o00VarOooO00o == null) {
            throw new NullPointerException("Null dataSpace");
        }
        oooO00oOooO0Oo.f1838OooO0o = o00VarOooO00o;
        return oooO00oOooO0Oo.OooO00o();
    }
}
