package p046Oooooo0;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.OooOo;
import java.util.Objects;
import o000OO.OooOOO;
import p028Oooo0oO.o00O0O0;
import p045Oooooo.OooOOOO;
import p045Oooooo.o00;
import p045Oooooo.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O000O implements OooOOO<o000OOo0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f2033OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Timebase f2034OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo f2035OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Size f2036OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final DynamicRange f2037OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final EncoderProfilesProxy.VideoProfileProxy f2038OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Range<Integer> f2039OooO0oO;

    public o0O000O(@NonNull String str, @NonNull Timebase timebase, @NonNull OooOo oooOo, @NonNull Size size, @NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, @NonNull DynamicRange dynamicRange, @NonNull Range<Integer> range) {
        this.f2033OooO00o = str;
        this.f2034OooO0O0 = timebase;
        this.f2035OooO0OO = oooOo;
        this.f2036OooO0Oo = size;
        this.f2038OooO0o0 = videoProfileProxy;
        this.f2037OooO0o = dynamicRange;
        this.f2039OooO0oO = range;
    }

    @Override // o000OO.OooOOO
    @NonNull
    public final o000OOo0 get() {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.f2038OooO0o0;
        int iOooO0o = videoProfileProxy.OooO0o();
        Range<Integer> range = SurfaceRequest.f3502OooOOOO;
        Range<Integer> range2 = this.f2039OooO0oO;
        int iIntValue = !Objects.equals(range2, range) ? ((Integer) range2.clamp(Integer.valueOf(iOooO0o))).intValue() : iOooO0o;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(iIntValue);
        objArr[1] = Integer.valueOf(iOooO0o);
        boolean zEquals = Objects.equals(range2, range);
        Object obj = range2;
        if (!zEquals) {
            obj = "<UNSPECIFIED>";
        }
        objArr[2] = obj;
        o00O0O0.OooO00o("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", objArr));
        o00O0O0.OooO00o("VidEncVdPrflRslvr", "Resolved VIDEO frame rate: " + iIntValue + "fps");
        Range<Integer> rangeOooO0OO = this.f2035OooO0OO.OooO0OO();
        o00O0O0.OooO00o("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iOooO0OO = videoProfileProxy.OooO0OO();
        int i = this.f2037OooO0o.f3406OooO0O0;
        int iOooO0O0 = videoProfileProxy.OooO0O0();
        int iOooO0o2 = videoProfileProxy.OooO0o();
        Size size = this.f2036OooO0Oo;
        int iOooO0Oo = o0O0000O.OooO0Oo(iOooO0OO, i, iOooO0O0, iIntValue, iOooO0o2, size.getWidth(), videoProfileProxy.OooOO0O(), size.getHeight(), videoProfileProxy.OooO0oo(), rangeOooO0OO);
        int iOooOO0 = videoProfileProxy.OooOO0();
        String str = this.f2033OooO00o;
        o00 o00VarOooO00o = o0O0000O.OooO00o(iOooOO0, str);
        OooOOOO.OooO00o oooO00oOooO0Oo = o000OOo0.OooO0Oo();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        oooO00oOooO0Oo.f1847OooO00o = str;
        Timebase timebase = this.f2034OooO0O0;
        if (timebase == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        oooO00oOooO0Oo.f1849OooO0OO = timebase;
        oooO00oOooO0Oo.f1850OooO0Oo = size;
        oooO00oOooO0Oo.f1846OooO = Integer.valueOf(iOooO0Oo);
        oooO00oOooO0Oo.f1853OooO0oO = Integer.valueOf(iIntValue);
        oooO00oOooO0Oo.f1848OooO0O0 = Integer.valueOf(iOooOO0);
        if (o00VarOooO00o == null) {
            throw new NullPointerException("Null dataSpace");
        }
        oooO00oOooO0Oo.f1851OooO0o = o00VarOooO00o;
        return oooO00oOooO0Oo.OooO00o();
    }
}
