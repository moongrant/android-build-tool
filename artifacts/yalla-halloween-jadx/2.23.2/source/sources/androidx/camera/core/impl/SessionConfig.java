package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.OooOOOO;
import androidx.camera.core.impl.SessionConfig;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class SessionConfig {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO> f3616OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<CameraDevice.StateCallback> f3617OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<CameraCaptureSession.StateCallback> f3618OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o000oOoO> f3619OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000000O f3620OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<OooO0OO> f3621OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final InputConfiguration f3622OooO0oO;

    @AutoValue
    public static abstract class OooO {

        @AutoValue.Builder
        public static abstract class OooO00o {
        }

        @NonNull
        public static OooOo00.OooO00o OooO00o(@NonNull DeferrableSurface deferrableSurface) {
            OooOo00.OooO00o oooO00o = new OooOo00.OooO00o();
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            oooO00o.f3598OooO00o = deferrableSurface;
            List<DeferrableSurface> listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            oooO00o.f3599OooO0O0 = listEmptyList;
            oooO00o.f3600OooO0OO = null;
            oooO00o.f3601OooO0Oo = -1;
            oooO00o.OooO0O0(DynamicRange.f3398OooO0Oo);
            return oooO00o;
        }

        @NonNull
        public abstract DynamicRange OooO0O0();

        @Nullable
        public abstract String OooO0OO();

        @NonNull
        public abstract List<DeferrableSurface> OooO0Oo();

        public abstract int OooO0o();

        @NonNull
        public abstract DeferrableSurface OooO0o0();
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public InputConfiguration f3629OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LinkedHashSet f3623OooO00o = new LinkedHashSet();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000000O.OooO00o f3624OooO0O0 = new o000000O.OooO00o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList f3625OooO0OO = new ArrayList();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final ArrayList f3626OooO0Oo = new ArrayList();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ArrayList f3628OooO0o0 = new ArrayList();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ArrayList f3627OooO0o = new ArrayList();
    }

    public static class OooO0O0 extends OooO00o {
        @NonNull
        public static OooO0O0 OooO0o(@NonNull o00Oo00<?> o00oo00, @NonNull Size size) {
            OooO0o oooO0oOooOoOO = o00oo00.OooOoOO();
            if (oooO0oOooOoOO != null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                oooO0oOooOoOO.OooO00o(size, o00oo00, oooO0O0);
                return oooO0O0;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + o00oo00.OooOO0(o00oo00.toString()));
        }

        @NonNull
        public final void OooO00o(@NonNull OooO0OO oooO0OO) {
            this.f3628OooO0o0.add(oooO0OO);
        }

        @NonNull
        public final void OooO0O0(@NonNull DeferrableSurface deferrableSurface, @NonNull DynamicRange dynamicRange) {
            OooOo00.OooO00o OooO00o2 = OooO.OooO00o(deferrableSurface);
            OooO00o2.OooO0O0(dynamicRange);
            this.f3623OooO00o.add(OooO00o2.OooO00o());
        }

        @NonNull
        public final void OooO0OO(@NonNull CameraCaptureSession.StateCallback stateCallback) {
            ArrayList arrayList = this.f3626OooO0Oo;
            if (arrayList.contains(stateCallback)) {
                return;
            }
            arrayList.add(stateCallback);
        }

        @NonNull
        public final void OooO0Oo(@NonNull DeferrableSurface deferrableSurface, @NonNull DynamicRange dynamicRange) {
            OooOo00.OooO00o OooO00o2 = OooO.OooO00o(deferrableSurface);
            OooO00o2.OooO0O0(dynamicRange);
            this.f3623OooO00o.add(OooO00o2.OooO00o());
            this.f3624OooO0O0.f3654OooO00o.add(deferrableSurface);
        }

        @NonNull
        public final SessionConfig OooO0o0() {
            return new SessionConfig(new ArrayList(this.f3623OooO00o), new ArrayList(this.f3625OooO0OO), new ArrayList(this.f3626OooO0Oo), new ArrayList(this.f3627OooO0o), new ArrayList(this.f3628OooO0o0), this.f3624OooO0O0.OooO0Oo(), this.f3629OooO0oO);
        }
    }

    public interface OooO0OO {
        void onError();
    }

    public interface OooO0o {
        void OooO00o(@NonNull Size size, @NonNull o00Oo00<?> o00oo00, @NonNull OooO0O0 oooO0O0);
    }

    public static final class OooOO0 extends OooO00o {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final List<Integer> f3630OooOO0O = Arrays.asList(1, 5, 3);

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final p035OoooOOO.o0000Ooo f3632OooO0oo = new p035OoooOOO.o0000Ooo();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f3631OooO = true;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f3633OooOO0 = false;

        public final void OooO00o(@NonNull SessionConfig sessionConfig) {
            Map<String, Object> map;
            o000000O o000000o2 = sessionConfig.f3620OooO0o;
            int i = o000000o2.f3648OooO0OO;
            o000000O.OooO00o oooO00o = this.f3624OooO0O0;
            if (i != -1) {
                this.f3633OooOO0 = true;
                int i2 = oooO00o.f3656OooO0OO;
                Integer numValueOf = Integer.valueOf(i);
                List<Integer> list = f3630OooOO0O;
                if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i2))) {
                    i = i2;
                }
                oooO00o.f3656OooO0OO = i;
            }
            Range<Integer> range = oo0O.f3780OooO00o;
            Range<Integer> range2 = o000000o2.f3649OooO0Oo;
            if (!range2.equals(range)) {
                if (oooO00o.f3657OooO0Oo.equals(range)) {
                    oooO00o.f3657OooO0Oo = range2;
                } else if (!oooO00o.f3657OooO0Oo.equals(range2)) {
                    this.f3631OooO = false;
                    p028Oooo0oO.o00O0O0.OooO00o("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
            o000000O o000000o3 = sessionConfig.f3620OooO0o;
            o00OOO0 o00ooo1 = o000000o3.f3652OooO0oO;
            Map<String, Object> map2 = oooO00o.f3660OooO0oO.f3744OooO00o;
            if (map2 != null && (map = o00ooo1.f3744OooO00o) != null) {
                map2.putAll(map);
            }
            this.f3625OooO0OO.addAll(sessionConfig.f3617OooO0O0);
            this.f3626OooO0Oo.addAll(sessionConfig.f3618OooO0OO);
            oooO00o.OooO00o(o000000o3.f3651OooO0o0);
            this.f3627OooO0o.addAll(sessionConfig.f3619OooO0Oo);
            this.f3628OooO0o0.addAll(sessionConfig.f3621OooO0o0);
            InputConfiguration inputConfiguration = sessionConfig.f3622OooO0oO;
            if (inputConfiguration != null) {
                this.f3629OooO0oO = inputConfiguration;
            }
            LinkedHashSet<OooO> linkedHashSet = this.f3623OooO00o;
            linkedHashSet.addAll(sessionConfig.f3616OooO00o);
            HashSet hashSet = oooO00o.f3654OooO00o;
            hashSet.addAll(o000000o2.OooO00o());
            ArrayList arrayList = new ArrayList();
            for (OooO oooO : linkedHashSet) {
                arrayList.add(oooO.OooO0o0());
                Iterator<DeferrableSurface> it = oooO.OooO0Oo().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            if (!arrayList.containsAll(hashSet)) {
                p028Oooo0oO.o00O0O0.OooO00o("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f3631OooO = false;
            }
            oooO00o.OooO0OO(o000000o2.f3647OooO0O0);
        }

        @NonNull
        public final SessionConfig OooO0O0() {
            if (!this.f3631OooO) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f3623OooO00o);
            final p035OoooOOO.o0000Ooo o0000ooo = this.f3632OooO0oo;
            if (o0000ooo.f1440OooO00o) {
                Collections.sort(arrayList, new Comparator() { // from class: OoooOOO.o00000OO
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int i;
                        SessionConfig.OooO oooO = (SessionConfig.OooO) obj2;
                        o0000ooo.getClass();
                        Class<?> cls = ((SessionConfig.OooO) obj).OooO0o0().f3537OooO0oo;
                        int i2 = 0;
                        if (cls == MediaCodec.class) {
                            i = 2;
                        } else {
                            i = cls == OooOOOO.class ? 0 : 1;
                        }
                        Class<?> cls2 = oooO.OooO0o0().f3537OooO0oo;
                        if (cls2 == MediaCodec.class) {
                            i2 = 2;
                        } else if (cls2 != OooOOOO.class) {
                            i2 = 1;
                        }
                        return i - i2;
                    }
                });
            }
            return new SessionConfig(arrayList, new ArrayList(this.f3625OooO0OO), new ArrayList(this.f3626OooO0Oo), new ArrayList(this.f3627OooO0o), new ArrayList(this.f3628OooO0o0), this.f3624OooO0O0.OooO0Oo(), this.f3629OooO0oO);
        }
    }

    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public SessionConfig(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, o000000O o000000o2, @Nullable InputConfiguration inputConfiguration) {
        this.f3616OooO00o = arrayList;
        this.f3617OooO0O0 = Collections.unmodifiableList(arrayList2);
        this.f3618OooO0OO = Collections.unmodifiableList(arrayList3);
        this.f3619OooO0Oo = Collections.unmodifiableList(arrayList4);
        this.f3621OooO0o0 = Collections.unmodifiableList(arrayList5);
        this.f3620OooO0o = o000000o2;
        this.f3622OooO0oO = inputConfiguration;
    }

    @NonNull
    public static SessionConfig OooO00o() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        ArrayList arrayList5 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
        Range<Integer> range = oo0O.f3780OooO00o;
        ArrayList arrayList6 = new ArrayList();
        o00O00o0 o00o00o0OooO0OO = o00O00o0.OooO0OO();
        ArrayList arrayList7 = new ArrayList(hashSet);
        o00O0O00 o00o0o00Oooo0O0 = o00O0O00.Oooo0O0(ooo00oOooo0OO);
        ArrayList arrayList8 = new ArrayList(arrayList6);
        o00OOO0 o00ooo1 = o00OOO0.f3743OooO0O0;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : o00o00o0OooO0OO.OooO0O0()) {
            arrayMap.put(str, o00o00o0OooO0OO.OooO00o(str));
        }
        return new SessionConfig(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, new o000000O(arrayList7, o00o0o00Oooo0O0, -1, range, arrayList8, false, new o00OOO0(arrayMap), null), null);
    }

    @NonNull
    public final List<DeferrableSurface> OooO0O0() {
        ArrayList arrayList = new ArrayList();
        for (OooO oooO : this.f3616OooO00o) {
            arrayList.add(oooO.OooO0o0());
            Iterator<DeferrableSurface> it = oooO.OooO0Oo().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
