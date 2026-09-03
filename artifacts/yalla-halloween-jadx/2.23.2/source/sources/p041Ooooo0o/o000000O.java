package p041Ooooo0o;

import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.OooOO0;
import androidx.camera.core.impl.OooOO0O;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.o0000O;
import androidx.camera.core.impl.o0000OO0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000000O implements o0000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000000 f1749OooO0Oo = new o000000();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Timebase f1750OooO0o0 = Timebase.UPTIME;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O f1751OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Function<EncoderProfilesProxy.VideoProfileProxy, EncoderProfilesProxy.VideoProfileProxy> f1752OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f1753OooO0OO;

    public o000000O(@NonNull o0000O o0000o2) {
        o000000 o000000Var = f1749OooO0Oo;
        this.f1753OooO0OO = new HashMap();
        this.f1751OooO00o = o0000o2;
        this.f1752OooO0O0 = o000000Var;
    }

    @Override // androidx.camera.core.impl.o0000O
    public final boolean OooO00o(int i) {
        return this.f1751OooO00o.OooO00o(i) && OooO0OO(i) != null;
    }

    @Override // androidx.camera.core.impl.o0000O
    @Nullable
    public final EncoderProfilesProxy OooO0O0(int i) {
        return OooO0OO(i);
    }

    @Nullable
    public final EncoderProfilesProxy OooO0OO(int i) {
        EncoderProfilesProxy.VideoProfileProxy next;
        int i2;
        String strOooO00o;
        int i3;
        int i4;
        OooOO0O oooOO0OOooO00o;
        HashMap map = this.f1753OooO0OO;
        if (map.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i));
        }
        o0000O o0000o2 = this.f1751OooO00o;
        OooOO0 oooOO0OooO0o0 = null;
        if (o0000o2.OooO00o(i)) {
            EncoderProfilesProxy encoderProfilesProxyOooO0O0 = o0000o2.OooO0O0(i);
            if (encoderProfilesProxyOooO0O0 != null) {
                ArrayList arrayList = new ArrayList(encoderProfilesProxyOooO0O0.OooO0O0());
                Iterator<EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxyOooO0O0.OooO0O0().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.OooO0oO() != 0);
                if (next == null) {
                    oooOO0OOooO00o = null;
                } else {
                    int iOooO0o0 = next.OooO0o0();
                    String strOooO = next.OooO();
                    int iOooOO0 = next.OooOO0();
                    if (1 != next.OooO0oO()) {
                        i2 = 5;
                        strOooO00o = o0000OO0.OooO00o(5);
                        i3 = 2;
                    } else {
                        i2 = iOooO0o0;
                        strOooO00o = strOooO;
                        i3 = iOooOO0;
                    }
                    int iOooO0OO = next.OooO0OO();
                    int iOooO0O0 = next.OooO0O0();
                    if (10 == iOooO0O0) {
                        i4 = iOooO0OO;
                    } else {
                        int iDoubleValue = (int) (new Rational(10, iOooO0O0).doubleValue() * ((double) iOooO0OO));
                        if (o00O0O0.OooO0o0("BackupHdrProfileEncoderProfilesProvider")) {
                            o00O0O0.OooO00o("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(iOooO0OO), 10, Integer.valueOf(iOooO0O0), Integer.valueOf(iDoubleValue)));
                        }
                        i4 = iDoubleValue;
                    }
                    oooOO0OOooO00o = EncoderProfilesProxy.VideoProfileProxy.OooO00o(i2, strOooO00o, i4, next.OooO0o(), next.OooOO0O(), next.OooO0oo(), i3, 10, next.OooO0Oo(), 1);
                }
                EncoderProfilesProxy.VideoProfileProxy videoProfileProxyApply = this.f1752OooO0O0.apply(oooOO0OOooO00o);
                if (videoProfileProxyApply != null) {
                    arrayList.add(videoProfileProxyApply);
                }
                if (!arrayList.isEmpty()) {
                    oooOO0OooO0o0 = EncoderProfilesProxy.OooO00o.OooO0o0(encoderProfilesProxyOooO0O0.OooO00o(), encoderProfilesProxyOooO0O0.OooO0OO(), encoderProfilesProxyOooO0O0.OooO0Oo(), arrayList);
                }
            }
            map.put(Integer.valueOf(i), oooOO0OooO0o0);
        }
        return oooOO0OooO0o0;
    }
}
