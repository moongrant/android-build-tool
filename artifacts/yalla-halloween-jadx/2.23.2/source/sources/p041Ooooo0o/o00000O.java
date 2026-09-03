package p041Ooooo0o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.OooOO0;
import androidx.camera.core.impl.o0000O;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import p047OoooooO.o0OO0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00000O implements o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000O f1754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DynamicRange f1755OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f1756OooO0OO = new HashMap();

    public o00000O(@NonNull o0000O o0000o2, @NonNull DynamicRange dynamicRange) {
        this.f1754OooO00o = o0000o2;
        this.f1755OooO0O0 = dynamicRange;
    }

    @Override // androidx.camera.core.impl.o0000O
    public final boolean OooO00o(int i) {
        return this.f1754OooO00o.OooO00o(i) && OooO0OO(i) != null;
    }

    @Override // androidx.camera.core.impl.o0000O
    @Nullable
    public final EncoderProfilesProxy OooO0O0(int i) {
        return OooO0OO(i);
    }

    @Nullable
    public final EncoderProfilesProxy OooO0OO(int i) {
        HashMap map = this.f1756OooO0OO;
        if (map.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i));
        }
        o0000O o0000o2 = this.f1754OooO00o;
        OooOO0 oooOO0OooO0o0 = null;
        if (o0000o2.OooO00o(i)) {
            EncoderProfilesProxy encoderProfilesProxyOooO0O0 = o0000o2.OooO0O0(i);
            if (encoderProfilesProxyOooO0O0 != null) {
                ArrayList arrayList = new ArrayList();
                for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxyOooO0O0.OooO0O0()) {
                    HashMap map2 = o0OO0O0.f2040OooO00o;
                    DynamicRange dynamicRange = this.f1755OooO0O0;
                    Set set = (Set) map2.get(Integer.valueOf(dynamicRange.f3404OooO0O0));
                    if (set != null && set.contains(Integer.valueOf(videoProfileProxy.OooO0O0()))) {
                        Set set2 = (Set) o0OO0O0.f2041OooO0O0.get(Integer.valueOf(dynamicRange.f3403OooO00o));
                        if (set2 != null && set2.contains(Integer.valueOf(videoProfileProxy.OooO0oO()))) {
                            arrayList.add(videoProfileProxy);
                        }
                    }
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
