package p039OoooOoo;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.o0000O;
import androidx.camera.core.impl.o00O0OOO;
import androidx.camera.core.impl.o0Oo0oo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.Oooo0;
import p041Ooooo0o.o000000;
import p041Ooooo0o.o000000O;
import p041Ooooo0o.o00000O;
import p041Ooooo0o.o00000OO;
import p041Ooooo0o.o000OOo;
import p044OooooOo.o0O0O0O;
import p048Ooooooo.oo0oO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o00OOO00 implements o00OOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0oO0 f1702OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f1703OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f1704OooO0Oo;

    @VisibleForTesting
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LinkedHashMap f1705OooO00o = new LinkedHashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final TreeMap<Size, o00O000o> f1706OooO0O0 = new TreeMap<>(new Oooo0(false));

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00000OO f1707OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00000OO f1708OooO0Oo;

        public OooO00o(@NonNull o00000O o00000o) {
            o000O o000o = o00O000o.f1672OooO00o;
            Iterator it = new ArrayList(o00O000o.f1671OooO).iterator();
            while (true) {
                o000OOo o000ooo2 = null;
                if (!it.hasNext()) {
                    break;
                }
                o00O000o o00o000o2 = (o00O000o) it.next();
                OooOOO0.OooO0o("Currently only support ConstantQuality", o00o000o2 instanceof o00O000o.OooO00o);
                EncoderProfilesProxy encoderProfilesProxyOooO0OO = o00000o.OooO0OO(((o00O000o.OooO00o) o00o000o2).OooO0O0());
                if (encoderProfilesProxyOooO0OO != null) {
                    o00O0O0.OooO00o("RecorderVideoCapabilities", "profiles = " + encoderProfilesProxyOooO0OO);
                    if (!encoderProfilesProxyOooO0OO.OooO0O0().isEmpty()) {
                        int iOooO00o = encoderProfilesProxyOooO0OO.OooO00o();
                        int iOooO0OO = encoderProfilesProxyOooO0OO.OooO0OO();
                        List<EncoderProfilesProxy.AudioProfileProxy> listOooO0Oo = encoderProfilesProxyOooO0OO.OooO0Oo();
                        List<EncoderProfilesProxy.VideoProfileProxy> listOooO0O0 = encoderProfilesProxyOooO0OO.OooO0O0();
                        OooOOO0.OooO0O0(!listOooO0O0.isEmpty(), "Should contain at least one VideoProfile.");
                        o000ooo2 = new o000OOo(iOooO00o, iOooO0OO, Collections.unmodifiableList(new ArrayList(listOooO0Oo)), Collections.unmodifiableList(new ArrayList(listOooO0O0)), listOooO0Oo.isEmpty() ? null : listOooO0Oo.get(0), listOooO0O0.get(0));
                    }
                    if (o000ooo2 == null) {
                        o00O0O0.OooO0oo("RecorderVideoCapabilities", "EncoderProfiles of quality " + o00o000o2 + " has no video validated profiles.");
                    } else {
                        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = o000ooo2.f1773OooO0o;
                        this.f1706OooO0O0.put(new Size(videoProfileProxy.OooOO0O(), videoProfileProxy.OooO0oo()), o00o000o2);
                        this.f1705OooO00o.put(o00o000o2, o000ooo2);
                    }
                }
            }
            if (this.f1705OooO00o.isEmpty()) {
                o00O0O0.OooO0O0("RecorderVideoCapabilities", "No supported EncoderProfiles");
                this.f1708OooO0Oo = null;
                this.f1707OooO0OO = null;
            } else {
                ArrayDeque arrayDeque = new ArrayDeque(this.f1705OooO00o.values());
                this.f1707OooO0OO = (o00000OO) arrayDeque.peekFirst();
                this.f1708OooO0Oo = (o00000OO) arrayDeque.peekLast();
            }
        }

        @NonNull
        public final o00O000o OooO00o(@NonNull Size size) {
            TreeMap<Size, o00O000o> treeMap = this.f1706OooO0O0;
            Map.Entry<Size, o00O000o> entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                return entryCeilingEntry.getValue();
            }
            Map.Entry<Size, o00O000o> entryFloorEntry = treeMap.floorEntry(size);
            return entryFloorEntry != null ? entryFloorEntry.getValue() : o00O000o.f1678OooO0oO;
        }

        @Nullable
        public final o00000OO OooO0O0(@NonNull o00O000o o00o000o2) {
            OooOOO0.OooO0O0(o00O000o.f1679OooO0oo.contains(o00o000o2), "Unknown quality: " + o00o000o2);
            if (o00o000o2 == o00O000o.f1676OooO0o) {
                return this.f1707OooO0OO;
            }
            return o00o000o2 == o00O000o.f1677OooO0o0 ? this.f1708OooO0Oo : (o00000OO) this.f1705OooO00o.get(o00o000o2);
        }
    }

    @VisibleForTesting
    public o00OOO00(@NonNull o0Oo0oo o0oo0oo2) {
        boolean z;
        o000000 o000000Var = o000000O.f1761OooO0Oo;
        this.f1703OooO0OO = new HashMap();
        this.f1704OooO0Oo = new HashMap();
        o0000O o0000oOooOOOO = o0oo0oo2.OooOOOO();
        Iterator<DynamicRange> it = o0oo0oo2.OooO00o().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            DynamicRange next = it.next();
            if (Integer.valueOf(next.f3405OooO00o).equals(3) && next.f3406OooO0O0 == 10) {
                z = true;
                break;
            }
        }
        this.f1702OooO0O0 = new oo0oO0(new o00O0OOO(z ? new o000000O(o0000oOooOOOO) : o0000oOooOOOO, o0oo0oo2.OooO0oO()), o0oo0oo2, o0O0O0O.f1820OooO00o);
        for (DynamicRange dynamicRange : o0oo0oo2.OooO00o()) {
            OooO00o oooO00o = new OooO00o(new o00000O(this.f1702OooO0O0, dynamicRange));
            if (!new ArrayList(oooO00o.f1705OooO00o.keySet()).isEmpty()) {
                this.f1703OooO0OO.put(dynamicRange, oooO00o);
            }
        }
    }

    public static boolean OooO0o0(@NonNull DynamicRange dynamicRange) {
        int i = dynamicRange.f3405OooO00o;
        return (i == 0 || i == 2 || dynamicRange.f3406OooO0O0 == 0) ? false : true;
    }

    @Override // p039OoooOoo.o00OOO0O
    @Nullable
    public final o00000OO OooO00o(@NonNull Size size, @NonNull DynamicRange dynamicRange) {
        OooO00o oooO00oOooO0Oo = OooO0Oo(dynamicRange);
        if (oooO00oOooO0Oo != null) {
            o00O000o o00o000oOooO00o = oooO00oOooO0Oo.OooO00o(size);
            o00O0O0.OooO00o("RecorderVideoCapabilities", "Using supported quality of " + o00o000oOooO00o + " for size " + size);
            if (o00o000oOooO00o != o00O000o.f1678OooO0oO) {
                o00000OO o00000ooOooO0O0 = oooO00oOooO0Oo.OooO0O0(o00o000oOooO00o);
                if (o00000ooOooO0O0 != null) {
                    return o00000ooOooO0O0;
                }
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
            }
        }
        return null;
    }

    @Override // p039OoooOoo.o00OOO0O
    @Nullable
    public final o00000OO OooO0O0(@NonNull o00O000o o00o000o2, @NonNull DynamicRange dynamicRange) {
        OooO00o oooO00oOooO0Oo = OooO0Oo(dynamicRange);
        if (oooO00oOooO0Oo == null) {
            return null;
        }
        return oooO00oOooO0Oo.OooO0O0(o00o000o2);
    }

    @Override // p039OoooOoo.o00OOO0O
    @NonNull
    public final ArrayList OooO0OO(@NonNull DynamicRange dynamicRange) {
        OooO00o oooO00oOooO0Oo = OooO0Oo(dynamicRange);
        return oooO00oOooO0Oo == null ? new ArrayList() : new ArrayList(oooO00oOooO0Oo.f1705OooO00o.keySet());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    @Nullable
    public final OooO00o OooO0Oo(@NonNull DynamicRange dynamicRange) {
        boolean zContains;
        boolean z;
        boolean zOooO0o0 = OooO0o0(dynamicRange);
        HashMap map = this.f1703OooO0OO;
        if (zOooO0o0) {
            return (OooO00o) map.get(dynamicRange);
        }
        HashMap map2 = this.f1704OooO0Oo;
        if (map2.containsKey(dynamicRange)) {
            return (OooO00o) map2.get(dynamicRange);
        }
        Set setKeySet = map.keySet();
        if (!OooO0o0(dynamicRange)) {
            Iterator it = setKeySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zContains = false;
                    break;
                }
                DynamicRange dynamicRange2 = (DynamicRange) it.next();
                OooOOO0.OooO0o("Fully specified range is not actually fully specified.", OooO0o0(dynamicRange2));
                int i = dynamicRange.f3406OooO0O0;
                if (i == 0 || i == dynamicRange2.f3406OooO0O0) {
                    OooOOO0.OooO0o("Fully specified range is not actually fully specified.", OooO0o0(dynamicRange2));
                    int i2 = dynamicRange.f3405OooO00o;
                    if (i2 != 0) {
                        int i3 = dynamicRange2.f3405OooO00o;
                        z = (i2 == 2 && i3 != 1) || i2 == i3;
                    }
                    if (z) {
                        zContains = true;
                        break;
                    }
                }
            }
        } else {
            zContains = setKeySet.contains(dynamicRange);
        }
        OooO00o oooO00o = !zContains ? null : new OooO00o(new o00000O(this.f1702OooO0O0, dynamicRange));
        map2.put(dynamicRange, oooO00o);
        return oooO00o;
    }
}
