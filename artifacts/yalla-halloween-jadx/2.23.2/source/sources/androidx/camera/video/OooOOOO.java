package androidx.camera.video;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.util.Range;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Oooo0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00000O0;
import androidx.camera.core.impl.o000O0Oo;
import androidx.camera.core.impl.o000OO0O;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOOOo;
import androidx.camera.core.impl.o00Oo00;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo00o;
import androidx.camera.core.impl.oo0O;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.video.OooOOOO;
import androidx.camera.video.VideoOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.o0OO00O;
import p033OoooO0O.o00oO0o;
import p037OoooOo0.o00;
import p037OoooOo0.o000;
import p037OoooOo0.o00oOoo;
import p039OoooOoo.o000O0O0;
import p039OoooOoo.o000OOo0;
import p039OoooOoo.o00O000o;
import p039OoooOoo.o00O00O;
import p039OoooOoo.o0O000;
import p039OoooOoo.o0O000O;
import p039OoooOoo.o0O00o0;
import p039OoooOoo.o0oOOo;
import p040Ooooo00.OooO0o;
import p041Ooooo0o.o00000OO;
import p044OooooOo.o0O0OOOo;
import p044OooooOo.o0O0o0;
import p044OooooOo.o0O0o00O;
import p044OooooOo.o0OO0;
import p044OooooOo.o0OO000o;
import p044OooooOo.o0oOo0O0;
import p044OooooOo.oo0oO0;
import p045Oooooo.o00O0000;
import p046Oooooo0.o0O0000O;
import p048Ooooooo.o0OO0o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOOO<T extends VideoOutput> extends Oooo0 {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooO0OO f4001OooOoOO = new OooO0OO();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final boolean f4002OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @VisibleForTesting
    public static final boolean f4003OooOoo0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public DeferrableSurface f4004OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public o00 f4005OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooOOO f4006OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public o000Oo0.OooO0o f4007OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public SessionConfig.OooO0O0 f4008OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public SurfaceRequest f4009OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f4010OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public SurfaceProcessorNode f4011OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public VideoOutput.SourceState f4012OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public o00O0000 f4013OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public Rect f4014OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO00o f4015OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f4016OooOoO0;

    public class OooO00o implements oo00o.OooO00o<OooOOO> {
        public OooO00o() {
        }

        @Override // androidx.camera.core.impl.oo00o.OooO00o
        public final void OooO00o(@Nullable OooOOO oooOOO) {
            OooOOO oooOOO2 = oooOOO;
            if (oooOOO2 == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            OooOOOO oooOOOO = OooOOOO.this;
            if (oooOOOO.f4012OooOo00 == VideoOutput.SourceState.INACTIVE) {
                return;
            }
            o00O0O0.OooO00o("VideoCapture", "Stream info update: old: " + oooOOOO.f4006OooOOOo + " new: " + oooOOO2);
            OooOOO oooOOO3 = oooOOOO.f4006OooOOOo;
            oooOOOO.f4006OooOOOo = oooOOO2;
            oo0O oo0o = oooOOOO.f3490OooO0oO;
            oo0o.getClass();
            int iOooO00o = oooOOO3.OooO00o();
            int iOooO00o2 = oooOOO2.OooO00o();
            Set<Integer> set = OooOOO.f3994OooO0O0;
            if (!((set.contains(Integer.valueOf(iOooO00o)) || set.contains(Integer.valueOf(iOooO00o2)) || iOooO00o == iOooO00o2) ? false : true)) {
                if (!(oooOOOO.f4016OooOoO0 && oooOOO3.OooO0O0() != null && oooOOO2.OooO0O0() == null)) {
                    if ((oooOOO3.OooO00o() != -1 && oooOOO2.OooO00o() == -1) || (oooOOO3.OooO00o() == -1 && oooOOO2.OooO00o() != -1)) {
                        oooOOOO.Oooo00O(oooOOOO.f4008OooOOo0, oooOOO2, oo0o);
                        oooOOOO.OooOooO(oooOOOO.f4008OooOOo0.OooO0o0());
                        oooOOOO.OooOOo0();
                        return;
                    } else {
                        if (oooOOO3.OooO0OO() != oooOOO2.OooO0OO()) {
                            oooOOOO.Oooo00O(oooOOOO.f4008OooOOo0, oooOOO2, oo0o);
                            oooOOOO.OooOooO(oooOOOO.f4008OooOOo0.OooO0o0());
                            Iterator it = oooOOOO.f3484OooO00o.iterator();
                            while (it.hasNext()) {
                                ((Oooo0.OooO0o) it.next()).OooO0o0(oooOOOO);
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            String strOooO0o0 = oooOOOO.OooO0o0();
            p040Ooooo00.OooO0o<T> oooO0o = (p040Ooooo00.OooO0o) oooOOOO.f3488OooO0o;
            oo0O oo0o2 = oooOOOO.f3490OooO0oO;
            oo0o2.getClass();
            oooOOOO.Oooo0OO(strOooO0o0, oooO0o, oo0o2);
        }

        @Override // androidx.camera.core.impl.oo00o.OooO00o
        public final void onError(@NonNull Throwable th) {
            o00O0O0.OooO("VideoCapture", "Receive onError from StreamState observer", th);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final p040Ooooo00.OooO0o<?> f4019OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Range<Integer> f4020OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final DynamicRange f4021OooO0OO;

        static {
            o0O000 o0o001 = new o0O000();
            o0O000O o0o000o = new o0O000O();
            f4020OooO0O0 = new Range<>(30, 30);
            DynamicRange dynamicRange = DynamicRange.f3398OooO0Oo;
            f4021OooO0OO = dynamicRange;
            OooO0O0 oooO0O0 = new OooO0O0(o0o001);
            androidx.camera.core.impl.OooO0o oooO0o = o00Oo00.f3756OooOoO0;
            oOO00O ooo00o = oooO0O0.f4018OooO00o;
            ooo00o.Oooo0oO(oooO0o, 5);
            ooo00o.Oooo0oO(p040Ooooo00.OooO0o.f1747Oooo00O, o0o000o);
            ooo00o.Oooo0oO(o000O0Oo.f3702OooOO0, dynamicRange);
            ooo00o.Oooo0oO(o00Oo00.f3760OooOooO, UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE);
            f4019OooO00o = new p040Ooooo00.OooO0o<>(o00O0O00.Oooo0O0(ooo00o));
        }
    }

    static {
        boolean z;
        boolean z2 = true;
        boolean z3 = o0O0OOOo.OooO00o(oo0oO0.class) != null;
        boolean z4 = o0O0OOOo.OooO00o(o0OO000o.class) != null;
        boolean z5 = o0O0OOOo.OooO00o(o0O0o0.class) != null;
        Iterator it = o0O0OOOo.f1807OooO00o.OooO0OO(o0OO0.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((o0OO0) it.next()).OooO0OO()) {
                z = true;
                break;
            }
        }
        boolean z6 = o0O0OOOo.OooO00o(o0O0o00O.class) != null;
        f4002OooOoo = z3 || z4 || z5;
        if (!z4 && !z5 && !z && !z6) {
            z2 = false;
        }
        f4003OooOoo0 = z2;
    }

    public OooOOOO(@NonNull p040Ooooo00.OooO0o<T> oooO0o) {
        super(oooO0o);
        this.f4006OooOOOo = OooOOO.f3993OooO00o;
        this.f4008OooOOo0 = new SessionConfig.OooO0O0();
        this.f4007OooOOo = null;
        this.f4012OooOo00 = VideoOutput.SourceState.INACTIVE;
        this.f4016OooOoO0 = false;
        this.f4015OooOoO = new OooO00o();
    }

    public static void OooOooo(@NonNull HashSet hashSet, int i, int i2, @NonNull Size size, @NonNull o00O0000 o00o0001) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i, ((Integer) o00o0001.OooO0o(i).clamp(Integer.valueOf(i2))).intValue()));
        } catch (IllegalArgumentException e) {
            o00O0O0.OooO("VideoCapture", "No supportedHeights for width: " + i, e);
        }
        try {
            hashSet.add(new Size(((Integer) o00o0001.OooO00o(i2).clamp(Integer.valueOf(i))).intValue(), i2));
        } catch (IllegalArgumentException e2) {
            o00O0O0.OooO("VideoCapture", "No supportedWidths for height: " + i2, e2);
        }
    }

    public static int Oooo000(boolean z, int i, int i2, @NonNull Range<Integer> range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    @Override // androidx.camera.core.Oooo0
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooO0o(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        f4001OooOoOO.getClass();
        p040Ooooo00.OooO0o<?> oooO0o = OooO0OO.f4019OooO00o;
        oooO0o.getClass();
        Config configOooO00o = useCaseConfigFactory.OooO00o(o00OOOOo.OooO0OO(oooO0o), 1);
        if (z) {
            configOooO00o = o00000O0.OooO00o(configOooO00o, oooO0o);
        }
        if (configOooO00o == null) {
            return null;
        }
        return new p040Ooooo00.OooO0o(o00O0O00.Oooo0O0(((OooO0O0) OooOO0O(configOooO00o)).f4018OooO00o));
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<Integer> OooOO0() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00.OooO00o<?, ?, ?> OooOO0O(@NonNull Config config) {
        return new OooO0O0(oOO00O.Oooo0o0(config));
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final androidx.camera.core.impl.OooOo OooOo(@NonNull Config config) {
        this.f4008OooOOo0.f3624OooO0O0.OooO0OO(config);
        OooOooO(this.f4008OooOOo0.OooO0o0());
        androidx.camera.core.impl.OooOo.OooO00o oooO00oOooO0o0 = this.f3490OooO0oO.OooO0o0();
        oooO00oOooO0o0.f3592OooO0Oo = config;
        return oooO00oOooO0o0.OooO00o();
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o00Oo00<?> OooOo0(@NonNull o0Oo0oo o0oo0oo2, @NonNull o00Oo00.OooO00o<?, ?, ?> oooO00o) {
        MediaSpec mediaSpec;
        ArrayList arrayList;
        com.google.common.util.concurrent.OooOO0O<MediaSpec> oooOO0OOooO0O0 = Oooo0O0().OooO0O0().OooO0O0();
        if (oooOO0OOooO0O0.isDone()) {
            try {
                mediaSpec = oooOO0OOooO0O0.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } else {
            mediaSpec = null;
        }
        MediaSpec mediaSpec2 = mediaSpec;
        o000OO.OooOOO0.OooO0O0(mediaSpec2 != null, "Unable to update target resolution by null MediaSpec.");
        DynamicRange dynamicRangeOooOo0 = this.f3488OooO0o.OooOo0o() ? this.f3488OooO0o.OooOo0() : OooO0OO.f4021OooO0OO;
        p039OoooOoo.o00Oo00 o00oo00OooO0o0 = Oooo0O0().OooO0o0(o0oo0oo2);
        ArrayList arrayListOooO0OO = o00oo00OooO0o0.OooO0OO(dynamicRangeOooOo0);
        if (arrayListOooO0OO.isEmpty()) {
            o00O0O0.OooO0oo("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            OooOo oooOoOooO0Oo = mediaSpec2.OooO0Oo();
            p039OoooOoo.oOO00O ooo00oOooO0o0 = oooOoOooO0Oo.OooO0o0();
            ooo00oOooO0o0.getClass();
            if (arrayListOooO0OO.isEmpty()) {
                o00O0O0.OooO0oo("QualitySelector", "No supported quality on the device.");
                arrayList = new ArrayList();
            } else {
                o00O0O0.OooO00o("QualitySelector", "supportedQualities = " + arrayListOooO0OO);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (o00O000o o00o000o2 : ooo00oOooO0o0.f1733OooO00o) {
                    if (o00o000o2 == o00O000o.f1643OooO0o) {
                        linkedHashSet.addAll(arrayListOooO0OO);
                        break;
                    }
                    if (o00o000o2 == o00O000o.f1644OooO0o0) {
                        ArrayList arrayList2 = new ArrayList(arrayListOooO0OO);
                        Collections.reverse(arrayList2);
                        linkedHashSet.addAll(arrayList2);
                        break;
                    }
                    if (arrayListOooO0OO.contains(o00o000o2)) {
                        linkedHashSet.add(o00o000o2);
                    } else {
                        o00O0O0.OooO0oo("QualitySelector", "quality is not supported and will be ignored: " + o00o000o2);
                    }
                }
                if (!arrayListOooO0OO.isEmpty() && !linkedHashSet.containsAll(arrayListOooO0OO)) {
                    StringBuilder sb = new StringBuilder("Select quality by fallbackStrategy = ");
                    o000OOo0 o000ooo1 = ooo00oOooO0o0.f1734OooO0O0;
                    sb.append(o000ooo1);
                    o00O0O0.OooO00o("QualitySelector", sb.toString());
                    if (o000ooo1 != o000OOo0.f1632OooO00o) {
                        o000OO.OooOOO0.OooO0o("Currently only support type RuleStrategy", o000ooo1 instanceof o000OOo0.OooO00o);
                        o000OOo0.OooO00o oooO00o2 = (o000OOo0.OooO00o) o000ooo1;
                        ArrayList arrayList3 = new ArrayList(o00O000o.f1638OooO);
                        o00O000o o00o000oOooO00o = oooO00o2.OooO00o() == o00O000o.f1643OooO0o ? (o00O000o) arrayList3.get(0) : oooO00o2.OooO00o() == o00O000o.f1644OooO0o0 ? (o00O000o) p018OooOoo0.OooOOO.OooO00o(arrayList3, 1) : oooO00o2.OooO00o();
                        int iIndexOf = arrayList3.indexOf(o00o000oOooO00o);
                        o000OO.OooOOO0.OooO0o(null, iIndexOf != -1);
                        ArrayList arrayList4 = new ArrayList();
                        for (int i = iIndexOf - 1; i >= 0; i--) {
                            o00O000o o00o000o3 = (o00O000o) arrayList3.get(i);
                            if (arrayListOooO0OO.contains(o00o000o3)) {
                                arrayList4.add(o00o000o3);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        while (true) {
                            iIndexOf++;
                            if (iIndexOf >= arrayList3.size()) {
                                break;
                            }
                            o00O000o o00o000o4 = (o00O000o) arrayList3.get(iIndexOf);
                            if (arrayListOooO0OO.contains(o00o000o4)) {
                                arrayList5.add(o00o000o4);
                            }
                        }
                        o00O0O0.OooO00o("QualitySelector", "sizeSortedQualities = " + arrayList3 + ", fallback quality = " + o00o000oOooO00o + ", largerQualities = " + arrayList4 + ", smallerQualities = " + arrayList5);
                        int iOooO0O0 = oooO00o2.OooO0O0();
                        if (iOooO0O0 != 0) {
                            if (iOooO0O0 == 1) {
                                linkedHashSet.addAll(arrayList4);
                                linkedHashSet.addAll(arrayList5);
                            } else if (iOooO0O0 == 2) {
                                linkedHashSet.addAll(arrayList4);
                            } else if (iOooO0O0 == 3) {
                                linkedHashSet.addAll(arrayList5);
                                linkedHashSet.addAll(arrayList4);
                            } else {
                                if (iOooO0O0 != 4) {
                                    throw new AssertionError("Unhandled fallback strategy: " + o000ooo1);
                                }
                                linkedHashSet.addAll(arrayList5);
                            }
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            o00O0O0.OooO00o("VideoCapture", "Found selectedQualities " + arrayList + " by " + ooo00oOooO0o0);
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
            }
            int iOooO0O1 = oooOoOooO0Oo.OooO0O0();
            HashMap map = new HashMap();
            for (o00O000o o00o000o5 : o00oo00OooO0o0.OooO0OO(dynamicRangeOooOo0)) {
                o00000OO o00000ooOooO0O0 = o00oo00OooO0o0.OooO0O0(o00o000o5, dynamicRangeOooOo0);
                Objects.requireNonNull(o00000ooOooO0O0);
                EncoderProfilesProxy.VideoProfileProxy videoProfileProxyOooO0o = o00000ooOooO0O0.OooO0o();
                map.put(o00o000o5, new Size(videoProfileProxyOooO0o.OooOO0O(), videoProfileProxyOooO0o.OooO0oo()));
            }
            o00O00O o00o00o2 = new o00O00O(o0oo0oo2.OooO0oo(OooO0oO()), map);
            ArrayList arrayList6 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List list = (List) o00o00o2.f1649OooO00o.get(new o000O0O0((o00O000o) it.next(), iOooO0O1));
                arrayList6.addAll(list != null ? new ArrayList(list) : new ArrayList(0));
            }
            o00O0O0.OooO00o("VideoCapture", "Set custom ordered resolutions = " + arrayList6);
            ((oOO00O) oooO00o.OooO00o()).Oooo0oO(ImageOutputConfig.f3548OooOo00, arrayList6);
        }
        return oooO00o.OooO0O0();
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOo0O() {
        o000OO.OooOOO0.OooO0o0(this.f3490OooO0oO, "The suggested stream specification should be already updated and shouldn't be null.");
        o000OO.OooOOO0.OooO0o("The surface request should be null when VideoCapture is attached.", this.f4009OooOOoo == null);
        oo0O oo0o = this.f3490OooO0oO;
        oo0o.getClass();
        oo00o<OooOOO> oo00oVarOooO0OO = Oooo0O0().OooO0OO();
        OooOOO oooOOO = OooOOO.f3993OooO00o;
        com.google.common.util.concurrent.OooOO0O<OooOOO> oooOO0OOooO0O0 = oo00oVarOooO0OO.OooO0O0();
        if (oooOO0OOooO0O0.isDone()) {
            try {
                oooOOO = oooOO0OOooO0O0.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        this.f4006OooOOOo = oooOOO;
        SessionConfig.OooO0O0 oooO0O0Oooo0 = Oooo0(OooO0o0(), (p040Ooooo00.OooO0o) this.f3488OooO0o, oo0o);
        this.f4008OooOOo0 = oooO0O0Oooo0;
        Oooo00O(oooO0O0Oooo0, this.f4006OooOOOo, oo0o);
        OooOooO(this.f4008OooOOo0.OooO0o0());
        OooOOOo();
        Oooo0O0().OooO0OO().OooO00o(this.f4015OooOoO, o00oO0o.OooO0OO());
        VideoOutput.SourceState sourceState = VideoOutput.SourceState.ACTIVE_NON_STREAMING;
        if (sourceState != this.f4012OooOo00) {
            this.f4012OooOo00 = sourceState;
            Oooo0O0().OooO0Oo(sourceState);
        }
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOo0o() {
        o000OO.OooOOO0.OooO0o("VideoCapture can only be detached on the main thread.", p031OoooO0.o0Oo0oo.OooO0O0());
        VideoOutput.SourceState sourceState = VideoOutput.SourceState.INACTIVE;
        if (sourceState != this.f4012OooOo00) {
            this.f4012OooOo00 = sourceState;
            Oooo0O0().OooO0Oo(sourceState);
        }
        Oooo0O0().OooO0OO().OooO0OO(this.f4015OooOoO);
        o000Oo0.OooO0o oooO0o = this.f4007OooOOo;
        if (oooO0o != null && oooO0o.cancel(false)) {
            o00O0O0.OooO00o("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        Oooo00o();
    }

    @Override // androidx.camera.core.Oooo0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final oo0O OooOoO0(@NonNull oo0O oo0o) {
        o00O0O0.OooO00o("VideoCapture", "onSuggestedStreamSpecUpdated: " + oo0o);
        p040Ooooo00.OooO0o oooO0o = (p040Ooooo00.OooO0o) this.f3488OooO0o;
        oooO0o.getClass();
        ArrayList arrayListOooO0O0 = o000OO0O.OooO0O0(oooO0o);
        if (arrayListOooO0O0 != null && !arrayListOooO0O0.contains(oo0o.OooO0Oo())) {
            o00O0O0.OooO0oo("VideoCapture", "suggested resolution " + oo0o.OooO0Oo() + " is not in custom ordered resolutions " + arrayListOooO0O0);
        }
        return oo0o;
    }

    @Override // androidx.camera.core.Oooo0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooOoo0(@NonNull Rect rect) {
        this.f3483OooO = rect;
        Oooo0o0();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0375  */
    /* JADX WARN: Code duplicated, block: B:117:0x0387  */
    /* JADX WARN: Code duplicated, block: B:150:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c2  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean] */
    @NonNull
    @SuppressLint({"WrongConstant"})
    @MainThread
    public final SessionConfig.OooO0O0 Oooo0(@NonNull final String str, @NonNull final p040Ooooo00.OooO0o<T> oooO0o, @NonNull final oo0O oo0o) {
        MediaSpec mediaSpec;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        ?? r15;
        char c2;
        char c3;
        Rect rect;
        Size size;
        SurfaceProcessorNode surfaceProcessorNode;
        CameraInternal cameraInternalOooO0OO;
        String str2;
        boolean z4;
        String str3;
        boolean z5;
        p031OoooO0.o0Oo0oo.OooO00o();
        final CameraInternal cameraInternalOooO0OO2 = OooO0OO();
        cameraInternalOooO0OO2.getClass();
        Size sizeOooO0Oo = oo0o.OooO0Oo();
        o0O00o0 o0o00o1 = new o0O00o0(this, 0);
        Range<Integer> rangeOooO0O0 = oo0o.OooO0O0();
        if (Objects.equals(rangeOooO0O0, oo0O.f3780OooO00o)) {
            rangeOooO0O0 = OooO0OO.f4020OooO0O0;
        }
        Range<Integer> range = rangeOooO0O0;
        com.google.common.util.concurrent.OooOO0O<MediaSpec> oooOO0OOooO0O0 = Oooo0O0().OooO0O0().OooO0O0();
        if (oooOO0OOooO0O0.isDone()) {
            try {
                mediaSpec = oooOO0OOooO0O0.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } else {
            mediaSpec = null;
        }
        MediaSpec mediaSpec2 = mediaSpec;
        Objects.requireNonNull(mediaSpec2);
        p039OoooOoo.o00Oo00 o00oo00OooO0o0 = Oooo0O0().OooO0o0(cameraInternalOooO0OO2.OooO00o());
        DynamicRange dynamicRangeOooO00o = oo0o.OooO00o();
        oooO0o.getClass();
        Function function = (Function) ((o00O0O00) oooO0o.getConfig()).OooO0O0(p040Ooooo00.OooO0o.f1747Oooo00O);
        Objects.requireNonNull(function);
        o00O0000 o0oo0o2 = this.f4013OooOo0O;
        if (o0oo0o2 != null) {
            c2 = 3;
            r15 = 1;
            c = 2;
        } else {
            o00000OO o00000ooOooO00o = o00oo00OooO0o0.OooO00o(sizeOooO0Oo, dynamicRangeOooO00o);
            char c4 = 3;
            o00O0000 o00o0001 = (o00O0000) function.apply(o0O0000O.OooO0O0(o0O0000O.OooO0OO(mediaSpec2, dynamicRangeOooO00o, o00000ooOooO00o), Timebase.UPTIME, mediaSpec2.OooO0Oo(), sizeOooO0Oo, dynamicRangeOooO00o, range));
            if (o00o0001 == null) {
                o00O0O0.OooO0oo("VideoCapture", "Can't find videoEncoderInfo");
                o0oo0o2 = null;
                c = 2;
                r15 = 1;
                c2 = c4;
            } else {
                Size size2 = o00000ooOooO00o != null ? new Size(o00000ooOooO00o.OooO0o().OooOO0O(), o00000ooOooO00o.OooO0o().OooO0oo()) : null;
                if (o00o0001 instanceof o0OO0o) {
                    c = 2;
                    z3 = true;
                    z2 = false;
                } else {
                    if (o0O0OOOo.OooO00o(o0oOo0O0.class) != null) {
                        c = 2;
                        z = true;
                    } else if (size2 == null || o00o0001.OooO0OO(size2.getWidth(), size2.getHeight())) {
                        c = 2;
                        z3 = true;
                        z2 = false;
                    } else {
                        z = true;
                        c = 2;
                        o00O0O0.OooO0oo("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", size2, o00o0001.OooO0oO(), o00o0001.OooO0oo()));
                    }
                    z2 = z ? 1 : 0;
                    z3 = z;
                }
                o0oo0o2 = z2 ? new o0OO0o(size2, o00o0001) : o00o0001;
                this.f4013OooOo0O = o0oo0o2;
                c2 = c4;
                r15 = z3;
            }
        }
        int iOooO = OooO(cameraInternalOooO0OO2, OooOOO(cameraInternalOooO0OO2));
        if (Oooo0o()) {
            int iOooO0O0 = iOooO - this.f4006OooOOOo.OooO0O0().OooO0O0();
            RectF rectF = o0OO00O.f1384OooO00o;
            iOooO = ((iOooO0O0 % 360) + 360) % 360;
        }
        this.f4010OooOo = iOooO;
        final Rect rect2 = this.f3483OooO;
        if (rect2 != null) {
            c3 = 0;
        } else {
            c3 = 0;
            rect2 = new Rect(0, 0, sizeOooO0Oo.getWidth(), sizeOooO0Oo.getHeight());
        }
        if (o0oo0o2 != null && !o0oo0o2.OooO0OO(rect2.width(), rect2.height())) {
            Object[] objArr = new Object[5];
            objArr[c3] = o0OO00O.OooO0o0(rect2);
            objArr[r15] = Integer.valueOf(o0oo0o2.OooO0Oo());
            objArr[c] = Integer.valueOf(o0oo0o2.OooO0O0());
            objArr[c2] = o0oo0o2.OooO0oO();
            objArr[4] = o0oo0o2.OooO0oo();
            o00O0O0.OooO00o("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", objArr));
            int iOooO0Oo = o0oo0o2.OooO0Oo();
            int iOooO0O1 = o0oo0o2.OooO0O0();
            Range<Integer> rangeOooO0oO = o0oo0o2.OooO0oO();
            Range<Integer> rangeOooO0oo = o0oo0o2.OooO0oo();
            int iOooo000 = Oooo000(r15, rect2.width(), iOooO0Oo, rangeOooO0oO);
            int iOooo001 = Oooo000(false, rect2.width(), iOooO0Oo, rangeOooO0oO);
            int iOooo002 = Oooo000(true, rect2.height(), iOooO0O1, rangeOooO0oo);
            int iOooo003 = Oooo000(false, rect2.height(), iOooO0O1, rangeOooO0oo);
            HashSet hashSet = new HashSet();
            OooOooo(hashSet, iOooo000, iOooo002, sizeOooO0Oo, o0oo0o2);
            OooOooo(hashSet, iOooo000, iOooo003, sizeOooO0Oo, o0oo0o2);
            OooOooo(hashSet, iOooo001, iOooo002, sizeOooO0Oo, o0oo0o2);
            OooOooo(hashSet, iOooo001, iOooo003, sizeOooO0Oo, o0oo0o2);
            if (hashSet.isEmpty()) {
                o00O0O0.OooO0oo("VideoCapture", "Can't find valid cropped size");
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                o00O0O0.OooO00o("VideoCapture", "candidatesList = " + arrayList);
                Collections.sort(arrayList, new Comparator() { // from class: OoooOoo.o0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Size size3 = (Size) obj;
                        Size size4 = (Size) obj2;
                        int width = size3.getWidth();
                        Rect rect3 = rect2;
                        return (Math.abs(size3.getHeight() - rect3.height()) + Math.abs(width - rect3.width())) - (Math.abs(size4.getHeight() - rect3.height()) + Math.abs(size4.getWidth() - rect3.width()));
                    }
                });
                o00O0O0.OooO00o("VideoCapture", "sorted candidatesList = " + arrayList);
                Size size3 = (Size) arrayList.get(0);
                int width = size3.getWidth();
                int height = size3.getHeight();
                if (width == rect2.width() && height == rect2.height()) {
                    o00O0O0.OooO00o("VideoCapture", "No need to adjust cropRect because crop size is valid.");
                } else {
                    if (width % 2 != 0 || height % 2 != 0 || width > sizeOooO0Oo.getWidth() || height > sizeOooO0Oo.getHeight()) {
                        str3 = null;
                        z5 = false;
                    } else {
                        str3 = null;
                        z5 = true;
                    }
                    o000OO.OooOOO0.OooO0o(str3, z5);
                    Rect rect3 = new Rect(rect2);
                    if (width != rect2.width()) {
                        int iMax = Math.max(0, rect2.centerX() - (width / 2));
                        rect3.left = iMax;
                        int i = iMax + width;
                        rect3.right = i;
                        if (i > sizeOooO0Oo.getWidth()) {
                            int width2 = sizeOooO0Oo.getWidth();
                            rect3.right = width2;
                            rect3.left = width2 - width;
                        }
                    }
                    if (height != rect2.height()) {
                        int iMax2 = Math.max(0, rect2.centerY() - (height / 2));
                        rect3.top = iMax2;
                        int i2 = iMax2 + height;
                        rect3.bottom = i2;
                        if (i2 > sizeOooO0Oo.getHeight()) {
                            int height2 = sizeOooO0Oo.getHeight();
                            rect3.bottom = height2;
                            rect3.top = height2 - height;
                        }
                    }
                    o00O0O0.OooO00o("VideoCapture", String.format("Adjust cropRect from %s to %s", o0OO00O.OooO0o0(rect2), o0OO00O.OooO0o0(rect3)));
                    rect2 = rect3;
                }
            }
        }
        int i3 = this.f4010OooOo;
        if (Oooo0o()) {
            SurfaceRequest.OooO0OO oooO0OOOooO0O0 = this.f4006OooOOOo.OooO0O0();
            oooO0OOOooO0O0.getClass();
            Rect rectOooO00o = oooO0OOOooO0O0.OooO00o();
            RectF rectF2 = o0OO00O.f1384OooO00o;
            Size sizeOooO0o = o0OO00O.OooO0o(i3, new Size(rectOooO00o.width(), rectOooO00o.height()));
            rect = new Rect(0, 0, sizeOooO0o.getWidth() + 0, sizeOooO0o.getHeight() + 0);
        } else {
            rect = rect2;
        }
        this.f4014OooOo0o = rect;
        if (!Oooo0o() || rect.equals(rect2)) {
            size = sizeOooO0Oo;
        } else {
            float fHeight = rect.height() / rect2.height();
            size = new Size((int) Math.ceil(sizeOooO0Oo.getWidth() * fHeight), (int) Math.ceil(sizeOooO0Oo.getHeight() * fHeight));
        }
        if (Oooo0o()) {
            this.f4016OooOoO0 = true;
        }
        Rect rect4 = this.f4014OooOo0o;
        if (this.f3494OooOO0o != null) {
            o00O0O0.OooO00o("VideoCapture", "Surface processing is enabled.");
            cameraInternalOooO0OO = OooO0OO();
            Objects.requireNonNull(cameraInternalOooO0OO);
            if (this.f3494OooOO0o == null) {
                throw null;
            }
            surfaceProcessorNode = new SurfaceProcessorNode(cameraInternalOooO0OO, new o000(dynamicRangeOooO00o));
        } else {
            if (cameraInternalOooO0OO2.OooOOOO() && f4003OooOoo0) {
                o00O0O0.OooO00o("VideoCapture", "Surface processing is enabled.");
                cameraInternalOooO0OO = OooO0OO();
                Objects.requireNonNull(cameraInternalOooO0OO);
                if (this.f3494OooOO0o == null) {
                    throw null;
                }
                surfaceProcessorNode = new SurfaceProcessorNode(cameraInternalOooO0OO, new o000(dynamicRangeOooO00o));
            } else {
                if ((sizeOooO0Oo.getWidth() == rect4.width() && sizeOooO0Oo.getHeight() == rect4.height()) ? false : true) {
                    o00O0O0.OooO00o("VideoCapture", "Surface processing is enabled.");
                    cameraInternalOooO0OO = OooO0OO();
                    Objects.requireNonNull(cameraInternalOooO0OO);
                    if (this.f3494OooOO0o == null) {
                        throw null;
                    }
                    surfaceProcessorNode = new SurfaceProcessorNode(cameraInternalOooO0OO, new o000(dynamicRangeOooO00o));
                } else {
                    if ((cameraInternalOooO0OO2.OooOOOO() && OooOOO(cameraInternalOooO0OO2)) || Oooo0o()) {
                        o00O0O0.OooO00o("VideoCapture", "Surface processing is enabled.");
                        cameraInternalOooO0OO = OooO0OO();
                        Objects.requireNonNull(cameraInternalOooO0OO);
                        if (this.f3494OooOO0o == null) {
                            throw null;
                        }
                        surfaceProcessorNode = new SurfaceProcessorNode(cameraInternalOooO0OO, new o000(dynamicRangeOooO00o));
                    } else {
                        surfaceProcessorNode = null;
                    }
                }
            }
        }
        this.f4011OooOo0 = surfaceProcessorNode;
        Timebase timebaseOooOO0o = (surfaceProcessorNode == null && cameraInternalOooO0OO2.OooOOOO()) ? Timebase.UPTIME : cameraInternalOooO0OO2.OooO().OooOO0o();
        androidx.camera.core.impl.OooOo.OooO00o oooO00oOooO0o0 = oo0o.OooO0o0();
        if (size == null) {
            oooO00oOooO0o0.getClass();
            throw new NullPointerException("Null resolution");
        }
        oooO00oOooO0o0.f3589OooO00o = size;
        oooO00oOooO0o0.OooO0O0(range);
        androidx.camera.core.impl.OooOo oooOoOooO00o = oooO00oOooO0o0.OooO00o();
        if (this.f4005OooOOOO == null) {
            str2 = null;
            z4 = true;
        } else {
            str2 = null;
            z4 = false;
        }
        o000OO.OooOOO0.OooO0o(str2, z4);
        o00 o00Var = new o00(2, 34, oooOoOooO00o, this.f3492OooOO0, cameraInternalOooO0OO2.OooOOOO(), this.f4014OooOo0o, this.f4010OooOo, ((ImageOutputConfig) this.f3488OooO0o).Oooo0(), cameraInternalOooO0OO2.OooOOOO() && OooOOO(cameraInternalOooO0OO2));
        this.f4005OooOOOO = o00Var;
        o00Var.OooO00o(o0o00o1);
        if (this.f4011OooOo0 != null) {
            o00 o00Var2 = this.f4005OooOOOO;
            int i4 = o00Var2.f1457OooO0o;
            int i5 = o00Var2.f1453OooO00o;
            int i6 = o00Var2.f1452OooO;
            RectF rectF3 = o0OO00O.f1384OooO00o;
            Rect rect5 = o00Var2.f1456OooO0Oo;
            androidx.camera.core.processing.OooO0O0 oooO0O0 = new androidx.camera.core.processing.OooO0O0(UUID.randomUUID(), i4, i5, rect5, o0OO00O.OooO0o(i6, new Size(rect5.width(), rect5.height())), o00Var2.f1452OooO, o00Var2.f1458OooO0o0);
            final o00 o00Var3 = this.f4011OooOo0.OooO0OO(new androidx.camera.core.processing.OooO00o(this.f4005OooOOOO, Collections.singletonList(oooO0O0))).get(oooO0O0);
            Objects.requireNonNull(o00Var3);
            final Timebase timebase = timebaseOooOO0o;
            o00Var3.OooO00o(new Runnable() { // from class: OoooOoo.oo00oO
                @Override // java.lang.Runnable
                public final void run() {
                    OooOOOO oooOOOO = this.f1737OooO0Oo;
                    CameraInternal cameraInternalOooO0OO3 = oooOOOO.OooO0OO();
                    CameraInternal cameraInternal = cameraInternalOooO0OO2;
                    if (cameraInternal == cameraInternalOooO0OO3) {
                        oooOOOO.f4009OooOOoo = o00Var3.OooO0OO(cameraInternal);
                        ((VideoOutput) ((o00O0O00) oooO0o.getConfig()).OooO0O0(OooO0o.f1746Oooo000)).OooO00o(oooOOOO.f4009OooOOoo, timebase);
                        oooOOOO.Oooo0o0();
                    }
                }
            });
            this.f4009OooOOoo = o00Var3.OooO0OO(cameraInternalOooO0OO2);
            o00 o00Var4 = this.f4005OooOOOO;
            o00Var4.getClass();
            p031OoooO0.o0Oo0oo.OooO00o();
            o00Var4.OooO0O0();
            o000OO.OooOOO0.OooO0o("Consumer can only be linked once.", !o00Var4.f1462OooOO0O);
            o00Var4.f1462OooOO0O = true;
            o00.OooO00o oooO00o = o00Var4.f1465OooOOO0;
            this.f4004OooOOO = oooO00o;
            oooO00o.OooO0Oo().OooO0oo(new o0oOOo(0, this, oooO00o), o00oO0o.OooO0OO());
        } else {
            SurfaceRequest surfaceRequestOooO0OO = this.f4005OooOOOO.OooO0OO(cameraInternalOooO0OO2);
            this.f4009OooOOoo = surfaceRequestOooO0OO;
            this.f4004OooOOO = surfaceRequestOooO0OO.f3511OooOO0O;
        }
        ((VideoOutput) ((o00O0O00) oooO0o.getConfig()).OooO0O0(p040Ooooo00.OooO0o.f1746Oooo000)).OooO00o(this.f4009OooOOoo, timebaseOooOO0o);
        Oooo0o0();
        this.f4004OooOOO.f3537OooO0oo = MediaCodec.class;
        SessionConfig.OooO0O0 oooO0O0OooO0o = SessionConfig.OooO0O0.OooO0o(oooO0o, oo0o.OooO0Oo());
        Range<Integer> rangeOooO0O1 = oo0o.OooO0O0();
        o000000O.OooO00o oooO00o2 = oooO0O0OooO0o.f3624OooO0O0;
        oooO00o2.f3657OooO0Oo = rangeOooO0O1;
        oooO0O0OooO0o.OooO00o(new SessionConfig.OooO0OO() { // from class: OoooOoo.o0O0o
            @Override // androidx.camera.core.impl.SessionConfig.OooO0OO
            public final void onError() {
                this.f1720OooO00o.Oooo0OO(str, oooO0o, oo0o);
            }
        });
        if (f4002OooOoo) {
            oooO00o2.f3656OooO0OO = 1;
        }
        if (oo0o.OooO0OO() != null) {
            oooO00o2.OooO0OO(oo0o.OooO0OO());
        }
        return oooO0O0OooO0o;
    }

    @MainThread
    public final void Oooo00O(@NonNull final SessionConfig.OooO0O0 oooO0O0, @NonNull OooOOO oooOOO, @NonNull oo0O oo0o) {
        boolean z = oooOOO.OooO00o() == -1;
        boolean z2 = oooOOO.OooO0OO() == OooOOO.OooO00o.ACTIVE;
        if (z && z2) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        oooO0O0.f3623OooO00o.clear();
        oooO0O0.f3624OooO0O0.f3654OooO00o.clear();
        DynamicRange dynamicRangeOooO00o = oo0o.OooO00o();
        if (!z) {
            if (z2) {
                oooO0O0.OooO0Oo(this.f4004OooOOO, dynamicRangeOooO00o);
            } else {
                oooO0O0.OooO0O0(this.f4004OooOOO, dynamicRangeOooO00o);
            }
        }
        o000Oo0.OooO0o oooO0o = this.f4007OooOOo;
        if (oooO0o != null && oooO0o.cancel(false)) {
            o00O0O0.OooO00o("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        o000Oo0.OooO0o oooO0oOooO00o = o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: OoooOoo.o0oOO
            @Override // o0ooOO0.o000Oo0.OooO0OO
            public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
                this.f1728OooO0Oo.getClass();
                Integer numValueOf = Integer.valueOf(oooO00o.hashCode());
                final SessionConfig.OooO0O0 oooO0O1 = oooO0O0;
                oooO0O1.f3624OooO0O0.f3660OooO0oO.f3744OooO00o.put("androidx.camera.video.VideoCapture.streamUpdate", numValueOf);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final o0O0000O o0o0000o2 = new o0O0000O(atomicBoolean, oooO00o, oooO0O1);
                oooO00o.OooO00o(new Runnable() { // from class: OoooOoo.o0O00000
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOO0.OooO0o("Surface update cancellation should only occur on main thread.", p031OoooO0.o0Oo0oo.OooO0O0());
                        atomicBoolean.set(true);
                        SessionConfig.OooO0O0 oooO0O2 = oooO0O1;
                        ArrayList arrayList = oooO0O2.f3624OooO0O0.f3659OooO0o0;
                        o000oOoO o000oooo2 = o0o0000o2;
                        arrayList.remove(o000oooo2);
                        oooO0O2.f3627OooO0o.remove(o000oooo2);
                    }
                }, o00oO0o.OooO00o());
                oooO0O1.f3624OooO0O0.OooO0O0(o0o0000o2);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(oooO00o.hashCode()));
            }
        });
        this.f4007OooOOo = oooO0oOooO00o;
        oooO0oOooO00o.OooO0oo(new OoooO.OooOo.OooO0O0(oooO0oOooO00o, new OooOo00(this, oooO0oOooO00o, z2)), o00oO0o.OooO0OO());
    }

    @MainThread
    public final void Oooo00o() {
        p031OoooO0.o0Oo0oo.OooO00o();
        DeferrableSurface deferrableSurface = this.f4004OooOOO;
        if (deferrableSurface != null) {
            deferrableSurface.OooO00o();
            this.f4004OooOOO = null;
        }
        SurfaceProcessorNode surfaceProcessorNode = this.f4011OooOo0;
        if (surfaceProcessorNode != null) {
            surfaceProcessorNode.OooO0O0();
            this.f4011OooOo0 = null;
        }
        o00 o00Var = this.f4005OooOOOO;
        if (o00Var != null) {
            p031OoooO0.o0Oo0oo.OooO00o();
            o00Var.f1465OooOOO0.OooO00o();
            o00oOoo o00oooo2 = o00Var.f1461OooOO0;
            if (o00oooo2 != null) {
                o00oooo2.OooO00o();
                o00Var.f1461OooOO0 = null;
            }
            o00Var.f1466OooOOOO = true;
            this.f4005OooOOOO = null;
        }
        this.f4013OooOo0O = null;
        this.f4014OooOo0o = null;
        this.f4009OooOOoo = null;
        this.f4006OooOOOo = OooOOO.f3993OooO00o;
        this.f4010OooOo = 0;
        this.f4016OooOoO0 = false;
    }

    @NonNull
    public final T Oooo0O0() {
        return (T) ((o00O0O00) ((p040Ooooo00.OooO0o) this.f3488OooO0o).getConfig()).OooO0O0(p040Ooooo00.OooO0o.f1746Oooo000);
    }

    @MainThread
    public final void Oooo0OO(@NonNull String str, @NonNull p040Ooooo00.OooO0o<T> oooO0o, @NonNull oo0O oo0o) {
        Oooo00o();
        if (OooOO0o(str)) {
            SessionConfig.OooO0O0 oooO0O0Oooo0 = Oooo0(str, oooO0o, oo0o);
            this.f4008OooOOo0 = oooO0O0Oooo0;
            Oooo00O(oooO0O0Oooo0, this.f4006OooOOOo, oo0o);
            OooOooO(this.f4008OooOOo0.OooO0o0());
            OooOOo0();
        }
    }

    public final boolean Oooo0o() {
        return this.f4006OooOOOo.OooO0O0() != null;
    }

    public final void Oooo0o0() {
        CameraInternal cameraInternalOooO0OO = OooO0OO();
        o00 o00Var = this.f4005OooOOOO;
        if (cameraInternalOooO0OO == null || o00Var == null) {
            return;
        }
        int iOooO = OooO(cameraInternalOooO0OO, OooOOO(cameraInternalOooO0OO));
        if (Oooo0o()) {
            int iOooO0O0 = iOooO - this.f4006OooOOOo.OooO0O0().OooO0O0();
            RectF rectF = o0OO00O.f1384OooO00o;
            iOooO = ((iOooO0O0 % 360) + 360) % 360;
        }
        this.f4010OooOo = iOooO;
        o00Var.OooO0o(iOooO, ((ImageOutputConfig) this.f3488OooO0o).Oooo0());
    }

    @NonNull
    public final String toString() {
        return "VideoCapture:".concat(OooO0oo());
    }

    @RequiresApi(21)
    public static final class OooO0O0<T extends VideoOutput> implements o00Oo00.OooO00o<OooOOOO<T>, p040Ooooo00.OooO0o<T>, OooO0O0<T>> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oOO00O f4018OooO00o;

        public OooO0O0(@NonNull oOO00O ooo00o) {
            Object objOooO0O0;
            this.f4018OooO00o = ooo00o;
            if (!ooo00o.OooO0o0(p040Ooooo00.OooO0o.f1746Oooo000)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Object objOooO0O1 = null;
            try {
                objOooO0O0 = ooo00o.OooO0O0(p034OoooOO0.o0Oo0oo.f1432OooO0OO);
            } catch (IllegalArgumentException unused) {
                objOooO0O0 = null;
            }
            Class cls = (Class) objOooO0O0;
            if (cls != null && !cls.equals(OooOOOO.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.OooO0o oooO0o = p034OoooOO0.o0Oo0oo.f1432OooO0OO;
            oOO00O ooo00o2 = this.f4018OooO00o;
            ooo00o2.Oooo0oO(oooO0o, OooOOOO.class);
            try {
                objOooO0O1 = ooo00o2.OooO0O0(p034OoooOO0.o0Oo0oo.f1431OooO0O0);
            } catch (IllegalArgumentException unused2) {
            }
            if (objOooO0O1 == null) {
                ooo00o2.Oooo0oO(p034OoooOO0.o0Oo0oo.f1431OooO0O0, OooOOOO.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        @Override // p028Oooo0oO.o00O000o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final androidx.camera.core.impl.o00O00O OooO00o() {
            return this.f4018OooO00o;
        }

        @Override // androidx.camera.core.impl.o00Oo00.OooO00o
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final o00Oo00 OooO0O0() {
            return new p040Ooooo00.OooO0o(o00O0O00.Oooo0O0(this.f4018OooO00o));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OooO0O0(@NonNull T t) {
            oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
            ooo00oOooo0OO.Oooo0oO(p040Ooooo00.OooO0o.f1746Oooo000, t);
            this(ooo00oOooo0OO);
        }
    }
}
