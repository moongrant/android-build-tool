package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.OooOOOO;
import androidx.camera.core.Oooo0;
import androidx.camera.core.ViewPort;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.Oooo000;
import androidx.camera.core.impl.RestrictedCameraControl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.o000OO0O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O0O0;
import androidx.camera.core.impl.o00OO0O0;
import androidx.camera.core.impl.o00oO0o;
import androidx.camera.core.impl.o0o0Oo;
import androidx.camera.core.impl.o0ooOOo;
import androidx.camera.core.impl.oo0oOO0;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o000OO.OooOOO0;
import p022Oooo00O.o00O00o0;
import p022Oooo00O.o0O0O0O;
import p028Oooo0oO.o000O0Oo;
import p031OoooO0.o0OO00O;
import p034OoooOO0.o000OOo;
import p034OoooOO0.o00O0O;
import p034OoooOO0.o0Oo0oo;
import p036OoooOOo.o0000oo;
import p038OoooOoO.o0000O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class CameraUseCaseAdapter implements o000O0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final CameraInternal f3810OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final UseCaseConfigFactory f3811OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0ooOOo f3812OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f3813OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("mLock")
    public final CameraCoordinator f3815OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public ViewPort f3816OooOO0O;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public o0000O f3822OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public Oooo0 f3823OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final RestrictedCameraControl f3824OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final oo0oOO0 f3825OooOo00;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ArrayList f3814OooO0oo = new ArrayList();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ArrayList f3809OooO = new ArrayList();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    @GuardedBy("mLock")
    public List<CameraEffect> f3817OooOO0o = Collections.emptyList();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    @GuardedBy("mLock")
    public CameraConfig f3819OooOOO0 = o00oO0o.f3751OooO00o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Object f3818OooOOO = new Object();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f3820OooOOOO = true;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @GuardedBy("mLock")
    public Config f3821OooOOOo = null;

    public static final class CameraException extends Exception {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f3826OooO00o = new ArrayList();

        public OooO00o(LinkedHashSet<CameraInternal> linkedHashSet) {
            Iterator<CameraInternal> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f3826OooO00o.add(it.next().OooO().OooO0Oo());
            }
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return this.f3826OooO00o.equals(((OooO00o) obj).f3826OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f3826OooO00o.hashCode() * 53;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0o0Oo<?> f3827OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0o0Oo<?> f3828OooO0O0;

        public OooO0O0(o0o0Oo<?> o0o0oo, o0o0Oo<?> o0o0oo2) {
            this.f3827OooO00o = o0o0oo;
            this.f3828OooO0O0 = o0o0oo2;
        }
    }

    public CameraUseCaseAdapter(@NonNull LinkedHashSet<CameraInternal> linkedHashSet, @NonNull CameraCoordinator cameraCoordinator, @NonNull o0ooOOo o0ooooo, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        CameraInternal next = linkedHashSet.iterator().next();
        this.f3810OooO0Oo = next;
        this.f3813OooO0oO = new OooO00o(new LinkedHashSet(linkedHashSet));
        this.f3815OooOO0 = cameraCoordinator;
        this.f3812OooO0o0 = o0ooooo;
        this.f3811OooO0o = useCaseConfigFactory;
        RestrictedCameraControl restrictedCameraControl = new RestrictedCameraControl(next.OooO0o());
        this.f3824OooOOoo = restrictedCameraControl;
        this.f3825OooOo00 = new oo0oOO0(next.OooO(), restrictedCameraControl);
    }

    @NonNull
    public static Matrix OooOOo0(@NonNull Rect rect, @NonNull Size size) {
        OooOOO0.OooO0O0(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static boolean OooOo(o00OO0O0 o00oo0o1, SessionConfig sessionConfig) {
        Config configOooO0OO = o00oo0o1.OooO0OO();
        Config config = sessionConfig.f3622OooO0o.f3648OooO0O0;
        if (configOooO0OO.OooO0oo().size() != sessionConfig.f3622OooO0o.f3648OooO0O0.OooO0oo().size()) {
            return true;
        }
        for (Config.OooO00o<?> oooO00o : configOooO0OO.OooO0oo()) {
            if (!config.OooO0o0(oooO00o) || !Objects.equals(config.OooO0O0(oooO00o), configOooO0OO.OooO0O0(oooO00o))) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static ArrayList OooOooO(@NonNull List list, @NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Oooo0 oooo0 = (Oooo0) it.next();
            oooo0.getClass();
            oooo0.f3496OooOO0o = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                CameraEffect cameraEffect = (CameraEffect) it2.next();
                cameraEffect.getClass();
                if (oooo0.OooOOO0(0)) {
                    OooOOO0.OooO0o(oooo0 + " already has effect" + oooo0.f3496OooOO0o, oooo0.f3496OooOO0o == null);
                    OooOOO0.OooO00o(oooo0.OooOOO0(0));
                    oooo0.f3496OooOO0o = cameraEffect;
                    arrayList2.remove(cameraEffect);
                }
            }
        }
        return arrayList2;
    }

    @Override // p028Oooo0oO.o000O0Oo
    @NonNull
    public final CameraInfo OooO00o() {
        return this.f3825OooOo00;
    }

    @Override // p028Oooo0oO.o000O0Oo
    @NonNull
    public final CameraControl OooO0OO() {
        return this.f3824OooOOoo;
    }

    public final void OooO0Oo(@NonNull List list) throws CameraException {
        synchronized (this.f3818OooOOO) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3814OooO0oo);
            linkedHashSet.addAll(list);
            try {
                Oooo000(linkedHashSet, false);
            } catch (IllegalArgumentException e) {
                throw new CameraException(e.getMessage());
            }
        }
    }

    public final void OooO0o0() {
        synchronized (this.f3818OooOOO) {
            if (!this.f3820OooOOOO) {
                this.f3810OooO0Oo.OooOOO(this.f3809OooO);
                OooOoo0();
                Iterator it = this.f3809OooO.iterator();
                while (it.hasNext()) {
                    ((Oooo0) it.next()).OooOOo();
                }
                this.f3820OooOOOO = true;
            }
        }
    }

    public final void OooOO0O() {
        synchronized (this.f3818OooOOO) {
            CameraControlInternal cameraControlInternalOooO0o = this.f3810OooO0Oo.OooO0o();
            this.f3821OooOOOo = cameraControlInternalOooO0o.OooO0o();
            cameraControlInternalOooO0o.OooO();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    @Nullable
    public final Oooo0 OooOOOo(@NonNull LinkedHashSet linkedHashSet) {
        Oooo0 oooo0OooO0OO;
        synchronized (this.f3818OooOOO) {
            if (OooOoO()) {
                Iterator it = linkedHashSet.iterator();
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (it.hasNext()) {
                    Oooo0 oooo0 = (Oooo0) it.next();
                    if (oooo0 instanceof OooOOOO) {
                        z3 = true;
                    } else if (oooo0 instanceof ImageCapture) {
                        z2 = true;
                    }
                }
                if (z2 && !z3) {
                    Oooo0 oooo1 = this.f3823OooOOo0;
                    if (oooo1 instanceof OooOOOO) {
                        oooo0OooO0OO = oooo1;
                    } else {
                        OooOOOO.OooO00o oooO00o = new OooOOOO.OooO00o();
                        oooO00o.f3474OooO00o.Oooo0oO(o0Oo0oo.f1459OooO0O0, "Preview-Extra");
                        o00O0O0 o00o0o0 = new o00O0O0(o00O0.Oooo0O0(oooO00o.f3474OooO00o));
                        o000OO0O.OooO0o(o00o0o0);
                        OooOOOO oooOOOO = new OooOOOO(o00o0o0);
                        oooOOOO.Oooo00O(new o00O0O());
                        oooo0OooO0OO = oooOOOO;
                    }
                } else {
                    Iterator it2 = linkedHashSet.iterator();
                    boolean z4 = false;
                    boolean z5 = false;
                    while (it2.hasNext()) {
                        Oooo0 oooo2 = (Oooo0) it2.next();
                        if (oooo2 instanceof OooOOOO) {
                            z4 = true;
                        } else if (oooo2 instanceof ImageCapture) {
                            z5 = true;
                        }
                    }
                    if (z4 && !z5) {
                        z = true;
                    }
                    if (z) {
                        Oooo0 oooo3 = this.f3823OooOOo0;
                        if (oooo3 instanceof ImageCapture) {
                            oooo0OooO0OO = oooo3;
                        } else {
                            ImageCapture.OooO0O0 oooO0O0 = new ImageCapture.OooO0O0();
                            oooO0O0.f3423OooO00o.Oooo0oO(o0Oo0oo.f1459OooO0O0, "ImageCapture-Extra");
                            oooo0OooO0OO = oooO0O0.OooO0OO();
                        }
                    } else {
                        oooo0OooO0OO = null;
                    }
                }
            } else {
                oooo0OooO0OO = null;
            }
        }
        return oooo0OooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x01d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[LOOP:7: B:73:0x0201->B:204:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x010d A[PHI: r15
      0x010d: PHI (r15v13 java.util.ArrayList) = (r15v3 java.util.ArrayList), (r15v7 java.util.ArrayList) binds: [B:31:0x010b, B:36:0x012a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0180  */
    /* JADX WARN: Code duplicated, block: B:49:0x0183  */
    /* JADX WARN: Code duplicated, block: B:57:0x019f  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207  */
    /* JADX WARN: Code duplicated, block: B:79:0x0226  */
    /* JADX WARN: Code duplicated, block: B:81:0x0229  */
    /* JADX WARN: Code duplicated, block: B:84:0x0239  */
    /* JADX WARN: Code duplicated, block: B:86:0x023e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0244  */
    /* JADX WARN: Code duplicated, block: B:89:0x024a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0258 A[LOOP:4: B:90:0x0252->B:92:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0286  */
    /* JADX WARN: Code duplicated, block: B:99:0x029c  */
    public final HashMap OooOOo(int i, @NonNull androidx.camera.core.impl.o0Oo0oo o0oo0oo2, @NonNull ArrayList arrayList, @NonNull ArrayList arrayList2, @NonNull HashMap map) {
        o0ooOOo o0ooooo;
        Rect rectOooO0OO;
        Size size;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        Iterator it;
        Size size2;
        Size sizeOooO00o;
        Size size3;
        int iOooO00o;
        Size size4;
        Iterator it2;
        Size sizeOooO00o2;
        Rational rational;
        Iterator it3;
        Rational rational2;
        HashMap mapOooO0Oo;
        Iterator it4;
        Iterator it5;
        Size size5;
        androidx.camera.core.impl.o0Oo0oo o0oo0oo3 = o0oo0oo2;
        ArrayList arrayList3 = new ArrayList();
        String strOooO0Oo = o0oo0oo2.OooO0Oo();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        Iterator it6 = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it6.hasNext();
            o0ooooo = this.f3812OooO0o0;
            if (!zHasNext) {
                break;
            }
            Oooo0 oooo0 = (Oooo0) it6.next();
            int iOooO0oO = oooo0.OooO0oO();
            Size sizeOooO0O0 = oooo0.OooO0O0();
            o0O0O0O o0o0o0o = (o0O0O0O) ((o00O00o0) o0ooooo).f613OooO00o.get(strOooO0Oo);
            Oooo000 oooo000OooO0o0 = o0o0o0o != null ? SurfaceConfig.OooO0o0(i, iOooO0oO, sizeOooO0O0, o0o0o0o.OooO(iOooO0oO)) : null;
            int iOooO0oO2 = oooo0.OooO0oO();
            Size sizeOooO0O1 = oooo0.OooO0O0();
            o00OO0O0 o00oo0o1 = oooo0.f3492OooO0oO;
            o00oo0o1.getClass();
            DynamicRange dynamicRangeOooO00o = o00oo0o1.OooO00o();
            ArrayList arrayList4 = new ArrayList();
            if (oooo0 instanceof o0000O) {
                Iterator<Oooo0> it7 = ((o0000O) oooo0).f1621OooOOOO.f1634OooO0Oo.iterator();
                while (it7.hasNext()) {
                    arrayList4.add(it7.next().f3490OooO0o.getCaptureType());
                }
            } else {
                arrayList4.add(oooo0.f3490OooO0o.getCaptureType());
            }
            androidx.camera.core.impl.OooO0O0 oooO0O0 = new androidx.camera.core.impl.OooO0O0(oooo000OooO0o0, iOooO0oO2, sizeOooO0O1, dynamicRangeOooO00o, arrayList4, oooo0.f3492OooO0oO.OooO0OO(), oooo0.f3490OooO0o.OooO0Oo());
            arrayList3.add(oooO0O0);
            map6.put(oooO0O0, oooo0);
            map5.put(oooo0, oooo0.f3492OooO0oO);
        }
        if (arrayList.isEmpty()) {
            return map5;
        }
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        try {
            rectOooO0OO = this.f3810OooO0Oo.OooO0o().OooO0OO();
        } catch (NullPointerException unused) {
            rectOooO0OO = null;
        }
        if (rectOooO0OO != null) {
            RectF rectF = o0OO00O.f1413OooO00o;
            size = new Size(rectOooO0OO.width(), rectOooO0OO.height());
        } else {
            size = null;
        }
        p034OoooOO0.o00oO0o o00oo0o2 = new p034OoooOO0.o00oO0o(o0oo0oo3, size);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Oooo0 oooo1 = (Oooo0) it8.next();
            OooO0O0 oooO0O1 = (OooO0O0) map.get(oooo1);
            o0o0Oo<?> o0o0ooOooOOOO = oooo1.OooOOOO(o0oo0oo3, oooO0O1.f3827OooO00o, oooO0O1.f3828OooO0O0);
            map7.put(o0o0ooOooOOOO, oooo1);
            ImageOutputConfig imageOutputConfig = (ImageOutputConfig) o0o0ooOooOOOO;
            ArrayList arrayListOooOoo0 = imageOutputConfig.OooOoo0();
            if (arrayListOooOoo0 != null) {
                map2 = map5;
                map3 = map6;
                map4 = map7;
                it = it8;
            } else if (imageOutputConfig.OooO() == null) {
                arrayListOooOoo0 = o00oo0o2.OooO00o(o0o0ooOooOOOO);
                p034OoooOO0.o0ooOOo o0ooooo2 = o00oo0o2.f1456OooO0Oo;
                o0ooooo2.getClass();
                if (arrayListOooOoo0.isEmpty()) {
                    map2 = map5;
                    map3 = map6;
                    map4 = map7;
                    it = it8;
                } else {
                    ArrayList arrayList5 = new ArrayList(arrayListOooOoo0);
                    Collections.sort(arrayList5, new p031OoooO0.Oooo0(true));
                    ArrayList arrayList6 = new ArrayList();
                    ImageOutputConfig imageOutputConfig2 = (ImageOutputConfig) o0o0ooOooOOOO;
                    Size sizeOooOOo = imageOutputConfig2.OooOOo();
                    it = it8;
                    Size size6 = (Size) arrayList5.get(0);
                    if (sizeOooOOo != null) {
                        if (o0000oo.OooO00o(size6) >= sizeOooOOo.getHeight() * sizeOooOOo.getWidth()) {
                            size2 = sizeOooOOo;
                        }
                        sizeOooO00o = o0ooooo2.OooO00o(imageOutputConfig2);
                        size3 = o0000oo.f1475OooO0OO;
                        map3 = map6;
                        iOooO00o = o0000oo.OooO00o(size3);
                        map2 = map5;
                        if (o0000oo.OooO00o(size2) < iOooO00o) {
                            size3 = o0000oo.f1473OooO00o;
                        } else {
                            if (sizeOooO00o == null && sizeOooO00o.getWidth() * sizeOooO00o.getHeight() < iOooO00o) {
                                size4 = sizeOooO00o;
                            }
                            it2 = arrayList5.iterator();
                            while (it2.hasNext()) {
                                Iterator it9 = it2;
                                size5 = (Size) it2.next();
                                HashMap map9 = map7;
                                if (o0000oo.OooO00o(size5) <= size2.getHeight() * size2.getWidth()) {
                                    if (size5.getHeight() * size5.getWidth() < o0000oo.OooO00o(size4) && !arrayList6.contains(size5)) {
                                        arrayList6.add(size5);
                                    }
                                }
                                it2 = it9;
                                map7 = map9;
                            }
                            map4 = map7;
                            if (!arrayList6.isEmpty()) {
                                throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size4 + "\nmaxSize = " + size2 + "\ninitial size list: " + arrayList5);
                            }
                            if (imageOutputConfig2.OooOOOo()) {
                                rational = p034OoooOO0.o00oO0o.OooO0OO(imageOutputConfig2.OooOOo0(), o0ooooo2.f1465OooO0Oo);
                            } else {
                                sizeOooO00o2 = o0ooooo2.OooO00o(imageOutputConfig2);
                                if (sizeOooO00o2 != null) {
                                    it3 = p034OoooOO0.o00oO0o.OooO0O0(arrayList6).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            rational = new Rational(sizeOooO00o2.getWidth(), sizeOooO00o2.getHeight());
                                            break;
                                        }
                                        rational2 = (Rational) it3.next();
                                        if (p031OoooO0.OooOOOO.OooO00o(sizeOooO00o2, rational2, o0000oo.f1475OooO0OO)) {
                                            rational = rational2;
                                            break;
                                        }
                                    }
                                } else {
                                    rational = null;
                                }
                            }
                            if (sizeOooO00o == null) {
                                sizeOooO00o = imageOutputConfig2.OooOO0O();
                            }
                            arrayListOooOoo0 = new ArrayList();
                            new HashMap();
                            if (rational == null) {
                                arrayListOooOoo0.addAll(arrayList6);
                                if (sizeOooO00o != null) {
                                    p034OoooOO0.o00oO0o.OooO0o0(arrayListOooOoo0, sizeOooO00o, true);
                                }
                            } else {
                                mapOooO0Oo = p034OoooOO0.o00oO0o.OooO0Oo(arrayList6);
                                if (sizeOooO00o != null) {
                                    it5 = mapOooO0Oo.keySet().iterator();
                                    while (it5.hasNext()) {
                                        p034OoooOO0.o00oO0o.OooO0o0((List) mapOooO0Oo.get((Rational) it5.next()), sizeOooO00o, true);
                                    }
                                }
                                ArrayList arrayList7 = new ArrayList(mapOooO0Oo.keySet());
                                Collections.sort(arrayList7, new OoooO0.OooOOOO.OooO00o(rational, o0ooooo2.f1464OooO0OO));
                                it4 = arrayList7.iterator();
                                while (it4.hasNext()) {
                                    for (Size size7 : (List) mapOooO0Oo.get((Rational) it4.next())) {
                                        if (!arrayListOooOoo0.contains(size7)) {
                                            arrayListOooOoo0.add(size7);
                                        }
                                    }
                                }
                            }
                        }
                        size4 = size3;
                        it2 = arrayList5.iterator();
                        while (it2.hasNext()) {
                            Iterator it10 = it2;
                            size5 = (Size) it2.next();
                            HashMap map10 = map7;
                            if (o0000oo.OooO00o(size5) <= size2.getHeight() * size2.getWidth()) {
                                if (size5.getHeight() * size5.getWidth() < o0000oo.OooO00o(size4)) {
                                }
                            }
                            it2 = it10;
                            map7 = map10;
                        }
                        map4 = map7;
                        if (!arrayList6.isEmpty()) {
                            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size4 + "\nmaxSize = " + size2 + "\ninitial size list: " + arrayList5);
                        }
                        if (imageOutputConfig2.OooOOOo()) {
                            rational = p034OoooOO0.o00oO0o.OooO0OO(imageOutputConfig2.OooOOo0(), o0ooooo2.f1465OooO0Oo);
                        } else {
                            sizeOooO00o2 = o0ooooo2.OooO00o(imageOutputConfig2);
                            if (sizeOooO00o2 != null) {
                                it3 = p034OoooOO0.o00oO0o.OooO0O0(arrayList6).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        rational = new Rational(sizeOooO00o2.getWidth(), sizeOooO00o2.getHeight());
                                        break;
                                    }
                                    rational2 = (Rational) it3.next();
                                    if (p031OoooO0.OooOOOO.OooO00o(sizeOooO00o2, rational2, o0000oo.f1475OooO0OO)) {
                                        rational = rational2;
                                        break;
                                    }
                                }
                            } else {
                                rational = null;
                            }
                        }
                        if (sizeOooO00o == null) {
                            sizeOooO00o = imageOutputConfig2.OooOO0O();
                        }
                        arrayListOooOoo0 = new ArrayList();
                        new HashMap();
                        if (rational == null) {
                            arrayListOooOoo0.addAll(arrayList6);
                            if (sizeOooO00o != null) {
                                p034OoooOO0.o00oO0o.OooO0o0(arrayListOooOoo0, sizeOooO00o, true);
                            }
                        } else {
                            mapOooO0Oo = p034OoooOO0.o00oO0o.OooO0Oo(arrayList6);
                            if (sizeOooO00o != null) {
                                it5 = mapOooO0Oo.keySet().iterator();
                                while (it5.hasNext()) {
                                    p034OoooOO0.o00oO0o.OooO0o0((List) mapOooO0Oo.get((Rational) it5.next()), sizeOooO00o, true);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList(mapOooO0Oo.keySet());
                            Collections.sort(arrayList8, new OoooO0.OooOOOO.OooO00o(rational, o0ooooo2.f1464OooO0OO));
                            it4 = arrayList8.iterator();
                            while (it4.hasNext()) {
                                while (r2.hasNext()) {
                                    if (!arrayListOooOoo0.contains(size7)) {
                                        arrayListOooOoo0.add(size7);
                                    }
                                }
                            }
                        }
                    }
                    size2 = size6;
                    sizeOooO00o = o0ooooo2.OooO00o(imageOutputConfig2);
                    size3 = o0000oo.f1475OooO0OO;
                    map3 = map6;
                    iOooO00o = o0000oo.OooO00o(size3);
                    map2 = map5;
                    if (o0000oo.OooO00o(size2) < iOooO00o) {
                        size3 = o0000oo.f1473OooO00o;
                    } else {
                        if (sizeOooO00o == null) {
                        }
                        it2 = arrayList5.iterator();
                        while (it2.hasNext()) {
                            Iterator it11 = it2;
                            size5 = (Size) it2.next();
                            HashMap map11 = map7;
                            if (o0000oo.OooO00o(size5) <= size2.getHeight() * size2.getWidth()) {
                                if (size5.getHeight() * size5.getWidth() < o0000oo.OooO00o(size4)) {
                                }
                            }
                            it2 = it11;
                            map7 = map11;
                        }
                        map4 = map7;
                        if (!arrayList6.isEmpty()) {
                            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size4 + "\nmaxSize = " + size2 + "\ninitial size list: " + arrayList5);
                        }
                        if (imageOutputConfig2.OooOOOo()) {
                            rational = p034OoooOO0.o00oO0o.OooO0OO(imageOutputConfig2.OooOOo0(), o0ooooo2.f1465OooO0Oo);
                        } else {
                            sizeOooO00o2 = o0ooooo2.OooO00o(imageOutputConfig2);
                            if (sizeOooO00o2 != null) {
                                it3 = p034OoooOO0.o00oO0o.OooO0O0(arrayList6).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        rational = new Rational(sizeOooO00o2.getWidth(), sizeOooO00o2.getHeight());
                                        break;
                                    }
                                    rational2 = (Rational) it3.next();
                                    if (p031OoooO0.OooOOOO.OooO00o(sizeOooO00o2, rational2, o0000oo.f1475OooO0OO)) {
                                        rational = rational2;
                                        break;
                                    }
                                }
                            } else {
                                rational = null;
                            }
                        }
                        if (sizeOooO00o == null) {
                            sizeOooO00o = imageOutputConfig2.OooOO0O();
                        }
                        arrayListOooOoo0 = new ArrayList();
                        new HashMap();
                        if (rational == null) {
                            arrayListOooOoo0.addAll(arrayList6);
                            if (sizeOooO00o != null) {
                                p034OoooOO0.o00oO0o.OooO0o0(arrayListOooOoo0, sizeOooO00o, true);
                            }
                        } else {
                            mapOooO0Oo = p034OoooOO0.o00oO0o.OooO0Oo(arrayList6);
                            if (sizeOooO00o != null) {
                                it5 = mapOooO0Oo.keySet().iterator();
                                while (it5.hasNext()) {
                                    p034OoooOO0.o00oO0o.OooO0o0((List) mapOooO0Oo.get((Rational) it5.next()), sizeOooO00o, true);
                                }
                            }
                            ArrayList arrayList9 = new ArrayList(mapOooO0Oo.keySet());
                            Collections.sort(arrayList9, new OoooO0.OooOOOO.OooO00o(rational, o0ooooo2.f1464OooO0OO));
                            it4 = arrayList9.iterator();
                            while (it4.hasNext()) {
                                while (r2.hasNext()) {
                                    if (!arrayListOooOoo0.contains(size7)) {
                                        arrayListOooOoo0.add(size7);
                                    }
                                }
                            }
                        }
                    }
                    size4 = size3;
                    it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        Iterator it12 = it2;
                        size5 = (Size) it2.next();
                        HashMap map12 = map7;
                        if (o0000oo.OooO00o(size5) <= size2.getHeight() * size2.getWidth()) {
                            if (size5.getHeight() * size5.getWidth() < o0000oo.OooO00o(size4)) {
                            }
                        }
                        it2 = it12;
                        map7 = map12;
                    }
                    map4 = map7;
                    if (!arrayList6.isEmpty()) {
                        throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size4 + "\nmaxSize = " + size2 + "\ninitial size list: " + arrayList5);
                    }
                    if (imageOutputConfig2.OooOOOo()) {
                        rational = p034OoooOO0.o00oO0o.OooO0OO(imageOutputConfig2.OooOOo0(), o0ooooo2.f1465OooO0Oo);
                    } else {
                        sizeOooO00o2 = o0ooooo2.OooO00o(imageOutputConfig2);
                        if (sizeOooO00o2 != null) {
                            it3 = p034OoooOO0.o00oO0o.OooO0O0(arrayList6).iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    rational = new Rational(sizeOooO00o2.getWidth(), sizeOooO00o2.getHeight());
                                    break;
                                }
                                rational2 = (Rational) it3.next();
                                if (p031OoooO0.OooOOOO.OooO00o(sizeOooO00o2, rational2, o0000oo.f1475OooO0OO)) {
                                    rational = rational2;
                                    break;
                                }
                            }
                        } else {
                            rational = null;
                        }
                    }
                    if (sizeOooO00o == null) {
                        sizeOooO00o = imageOutputConfig2.OooOO0O();
                    }
                    arrayListOooOoo0 = new ArrayList();
                    new HashMap();
                    if (rational == null) {
                        arrayListOooOoo0.addAll(arrayList6);
                        if (sizeOooO00o != null) {
                            p034OoooOO0.o00oO0o.OooO0o0(arrayListOooOoo0, sizeOooO00o, true);
                        }
                    } else {
                        mapOooO0Oo = p034OoooOO0.o00oO0o.OooO0Oo(arrayList6);
                        if (sizeOooO00o != null) {
                            it5 = mapOooO0Oo.keySet().iterator();
                            while (it5.hasNext()) {
                                p034OoooOO0.o00oO0o.OooO0o0((List) mapOooO0Oo.get((Rational) it5.next()), sizeOooO00o, true);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList(mapOooO0Oo.keySet());
                        Collections.sort(arrayList10, new OoooO0.OooOOOO.OooO00o(rational, o0ooooo2.f1464OooO0OO));
                        it4 = arrayList10.iterator();
                        while (it4.hasNext()) {
                            while (r2.hasNext()) {
                                if (!arrayListOooOoo0.contains(size7)) {
                                    arrayListOooOoo0.add(size7);
                                }
                            }
                        }
                    }
                }
            } else {
                map2 = map5;
                map3 = map6;
                map4 = map7;
                it = it8;
                ResolutionSelector resolutionSelectorOooO0OO = imageOutputConfig.OooO0OO();
                ArrayList arrayListOooO00o = o00oo0o2.OooO00o(o0o0ooOooOOOO);
                if (!o0o0ooOooOOOO.OooOooo()) {
                    int iOooO0o = o0o0ooOooOOOO.OooO0o();
                    if (resolutionSelectorOooO0OO.f3845OooO0OO == 1) {
                        ArrayList arrayList11 = new ArrayList();
                        arrayList11.addAll(arrayListOooO00o);
                        arrayList11.addAll(o00oo0o2.f1453OooO00o.OooO0o(iOooO0o));
                        Collections.sort(arrayList11, new p031OoooO0.Oooo0(true));
                        arrayListOooO00o = arrayList11;
                    }
                }
                AspectRatioStrategy aspectRatioStrategy = resolutionSelectorOooO0OO.f3843OooO00o;
                HashMap mapOooO0Oo2 = p034OoooOO0.o00oO0o.OooO0Oo(arrayListOooO00o);
                aspectRatioStrategy.getClass();
                Rational rationalOooO0OO = p034OoooOO0.o00oO0o.OooO0OO(0, o00oo0o2.f1455OooO0OO);
                ArrayList<Rational> arrayList12 = new ArrayList(mapOooO0Oo2.keySet());
                Collections.sort(arrayList12, new OoooO0.OooOOOO.OooO00o(rationalOooO0OO, o00oo0o2.f1454OooO0O0));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Rational rational3 : arrayList12) {
                    linkedHashMap.put(rational3, (List) mapOooO0Oo2.get(rational3));
                }
                ImageOutputConfig imageOutputConfig3 = (ImageOutputConfig) o0o0ooOooOOOO;
                Size sizeOooOOo2 = imageOutputConfig3.OooOOo();
                if (sizeOooOOo2 != null) {
                    Size size8 = o0000oo.f1473OooO00o;
                    int height = sizeOooOOo2.getHeight() * sizeOooOOo2.getWidth();
                    Iterator it13 = linkedHashMap.keySet().iterator();
                    while (it13.hasNext()) {
                        List<Size> list = (List) linkedHashMap.get((Rational) it13.next());
                        ArrayList arrayList13 = new ArrayList();
                        for (Size size9 : list) {
                            if (o0000oo.OooO00o(size9) <= height) {
                                arrayList13.add(size9);
                            }
                        }
                        list.clear();
                        list.addAll(arrayList13);
                    }
                }
                ResolutionStrategy resolutionStrategy = resolutionSelectorOooO0OO.f3844OooO0O0;
                if (resolutionStrategy != null) {
                    Iterator it14 = linkedHashMap.keySet().iterator();
                    while (it14.hasNext()) {
                        List list2 = (List) linkedHashMap.get((Rational) it14.next());
                        if (!list2.isEmpty()) {
                            Integer numValueOf = Integer.valueOf(resolutionStrategy.f3848OooO0O0);
                            if (!resolutionStrategy.equals(ResolutionStrategy.f3846OooO0OO)) {
                                int iIntValue = numValueOf.intValue();
                                Size size10 = resolutionStrategy.f3847OooO00o;
                                if (iIntValue == 0) {
                                    boolean zContains = list2.contains(size10);
                                    list2.clear();
                                    if (zContains) {
                                        list2.add(size10);
                                    }
                                } else if (iIntValue == 1) {
                                    p034OoooOO0.o00oO0o.OooO0o0(list2, size10, true);
                                } else if (iIntValue == 2) {
                                    p034OoooOO0.o00oO0o.OooO0o0(list2, size10, false);
                                } else if (iIntValue == 3) {
                                    p034OoooOO0.o00oO0o.OooO0o(list2, size10, true);
                                } else if (iIntValue == 4) {
                                    p034OoooOO0.o00oO0o.OooO0o(list2, size10, false);
                                }
                            }
                        }
                    }
                }
                arrayListOooOoo0 = new ArrayList();
                Iterator it15 = linkedHashMap.values().iterator();
                while (it15.hasNext()) {
                    for (Size size11 : (List) it15.next()) {
                        if (!arrayListOooOoo0.contains(size11)) {
                            arrayListOooOoo0.add(size11);
                        }
                    }
                }
                imageOutputConfig3.OooOOO();
            }
            map8.put(o0o0ooOooOOOO, arrayListOooOoo0);
            o0oo0oo3 = o0oo0oo2;
            map7 = map4;
            it8 = it;
            map6 = map3;
            map5 = map2;
        }
        HashMap map13 = map5;
        HashMap map14 = map6;
        Pair pairOooO00o = ((o00O00o0) o0ooooo).OooO00o(i, strOooO0Oo, arrayList3, map8);
        for (Map.Entry entry : map7.entrySet()) {
            map13.put((Oooo0) entry.getValue(), (o00OO0O0) ((Map) pairOooO00o.first).get(entry.getKey()));
        }
        for (Map.Entry entry2 : ((Map) pairOooO00o.second).entrySet()) {
            HashMap map15 = map14;
            if (map15.containsKey(entry2.getKey())) {
                map13.put((Oooo0) map15.get(entry2.getKey()), (o00OO0O0) entry2.getValue());
            }
            map14 = map15;
        }
        return map13;
    }

    @Nullable
    public final o0000O OooOOoo(@NonNull LinkedHashSet linkedHashSet, boolean z) {
        synchronized (this.f3818OooOOO) {
            HashSet<Oooo0> hashSetOooOo0O = OooOo0O(linkedHashSet, z);
            if (hashSetOooOo0O.size() < 2) {
                return null;
            }
            o0000O o0000o2 = this.f3822OooOOo;
            if (o0000o2 != null && o0000o2.f1621OooOOOO.f1634OooO0Oo.equals(hashSetOooOo0O)) {
                o0000O o0000o3 = this.f3822OooOOo;
                Objects.requireNonNull(o0000o3);
                return o0000o3;
            }
            boolean z2 = true;
            int[] iArr = {1, 2, 4};
            HashSet hashSet = new HashSet();
            loop0: for (Oooo0 oooo0 : hashSetOooOo0O) {
                for (int i = 0; i < 3; i++) {
                    int i2 = iArr[i];
                    if (oooo0.OooOOO0(i2)) {
                        if (hashSet.contains(Integer.valueOf(i2))) {
                            z2 = false;
                            break loop0;
                        }
                        hashSet.add(Integer.valueOf(i2));
                    }
                }
            }
            if (!z2) {
                return null;
            }
            return new o0000O(this.f3810OooO0Oo, hashSetOooOo0O, this.f3811OooO0o);
        }
    }

    public final int OooOo0() {
        synchronized (this.f3818OooOOO) {
            return ((p027Oooo0o0.o00O00o0) this.f3815OooOO0).f1103OooO0o0 == 2 ? 1 : 0;
        }
    }

    public final void OooOo00() {
        synchronized (this.f3818OooOOO) {
            if (this.f3820OooOOOO) {
                this.f3810OooO0Oo.OooOOO0(new ArrayList(this.f3809OooO));
                OooOO0O();
                this.f3820OooOOOO = false;
            }
        }
    }

    @NonNull
    public final HashSet OooOo0O(@NonNull LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f3818OooOOO) {
            Iterator<CameraEffect> it = this.f3817OooOO0o.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            i = z ? 3 : 0;
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            Oooo0 oooo0 = (Oooo0) it2.next();
            OooOOO0.OooO0O0(!(oooo0 instanceof o0000O), "Only support one level of sharing for now.");
            if (oooo0.OooOOO0(i)) {
                hashSet.add(oooo0);
            }
        }
        return hashSet;
    }

    @NonNull
    public final List<Oooo0> OooOo0o() {
        ArrayList arrayList;
        synchronized (this.f3818OooOOO) {
            arrayList = new ArrayList(this.f3814OooO0oo);
        }
        return arrayList;
    }

    public final boolean OooOoO() {
        boolean z;
        synchronized (this.f3818OooOOO) {
            o00oO0o.OooO00o oooO00o = (o00oO0o.OooO00o) this.f3819OooOOO0;
            oooO00o.getClass();
            z = ((Integer) ((o00O0) oooO00o.getConfig()).OooOoO(CameraConfig.f3525OooO0oO, 0)).intValue() == 1;
        }
        return z;
    }

    public final boolean OooOoO0() {
        boolean z;
        synchronized (this.f3818OooOOO) {
            z = this.f3819OooOOO0 == o00oO0o.f3751OooO00o;
        }
        return z;
    }

    public final void OooOoOO(@NonNull ArrayList arrayList) {
        synchronized (this.f3818OooOOO) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f3814OooO0oo);
            linkedHashSet.removeAll(arrayList);
            Oooo000(linkedHashSet, false);
        }
    }

    public final void OooOoo(@Nullable List<CameraEffect> list) {
        synchronized (this.f3818OooOOO) {
            this.f3817OooOO0o = list;
        }
    }

    public final void OooOoo0() {
        synchronized (this.f3818OooOOO) {
            if (this.f3821OooOOOo != null) {
                this.f3810OooO0Oo.OooO0o().OooO0oO(this.f3821OooOOOo);
            }
        }
    }

    public final void OooOooo(@Nullable ViewPort viewPort) {
        synchronized (this.f3818OooOOO) {
            this.f3816OooOO0O = viewPort;
        }
    }

    public final void Oooo000(@NonNull LinkedHashSet linkedHashSet, boolean z) {
        o00OO0O0 o00oo0o1;
        Config configOooO0OO;
        synchronized (this.f3818OooOOO) {
            Oooo0 oooo0OooOOOo = OooOOOo(linkedHashSet);
            o0000O o0000oOooOOoo = OooOOoo(linkedHashSet, z);
            ArrayList arrayList = new ArrayList(linkedHashSet);
            if (oooo0OooOOOo != null) {
                arrayList.add(oooo0OooOOOo);
            }
            if (o0000oOooOOoo != null) {
                arrayList.add(o0000oOooOOoo);
                arrayList.removeAll(o0000oOooOOoo.f1621OooOOOO.f1634OooO0Oo);
            }
            ArrayList<Oooo0> arrayList2 = new ArrayList(arrayList);
            arrayList2.removeAll(this.f3809OooO);
            ArrayList<Oooo0> arrayList3 = new ArrayList(arrayList);
            arrayList3.retainAll(this.f3809OooO);
            ArrayList arrayList4 = new ArrayList(this.f3809OooO);
            arrayList4.removeAll(arrayList);
            o00oO0o.OooO00o oooO00o = (o00oO0o.OooO00o) this.f3819OooOOO0;
            oooO00o.getClass();
            UseCaseConfigFactory useCaseConfigFactory = (UseCaseConfigFactory) ((o00O0) oooO00o.getConfig()).OooOoO(CameraConfig.f3524OooO0o, UseCaseConfigFactory.f3636OooO00o);
            UseCaseConfigFactory useCaseConfigFactory2 = this.f3811OooO0o;
            HashMap map = new HashMap();
            for (Oooo0 oooo0 : arrayList2) {
                o0000O o0000o2 = o0000oOooOOoo;
                map.put(oooo0, new OooO0O0(oooo0.OooO0o(false, useCaseConfigFactory), oooo0.OooO0o(true, useCaseConfigFactory2)));
                o0000oOooOOoo = o0000o2;
            }
            o0000O o0000o3 = o0000oOooOOoo;
            try {
                HashMap mapOooOOo = OooOOo(OooOo0(), this.f3810OooO0Oo.OooO(), arrayList2, arrayList3, map);
                Oooo00O(arrayList, mapOooOOo);
                ArrayList arrayListOooOooO = OooOooO(this.f3817OooOO0o, arrayList);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                arrayList5.removeAll(arrayList);
                ArrayList arrayListOooOooO2 = OooOooO(arrayListOooOooO, arrayList5);
                if (arrayListOooOooO2.size() > 0) {
                    p028Oooo0oO.o00O0O0.OooO0oo("CameraUseCaseAdapter", "Unused effects: " + arrayListOooOooO2);
                }
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    ((Oooo0) it.next()).OooOoo(this.f3810OooO0Oo);
                }
                this.f3810OooO0Oo.OooOOO0(arrayList4);
                if (!arrayList4.isEmpty()) {
                    for (Oooo0 oooo1 : arrayList3) {
                        if (mapOooOOo.containsKey(oooo1) && (configOooO0OO = (o00oo0o1 = (o00OO0O0) mapOooOOo.get(oooo1)).OooO0OO()) != null && OooOo(o00oo0o1, oooo1.f3497OooOOO0)) {
                            oooo1.f3492OooO0oO = oooo1.OooOo(configOooO0OO);
                        }
                    }
                }
                for (Oooo0 oooo2 : arrayList2) {
                    OooO0O0 oooO0O0 = (OooO0O0) map.get(oooo2);
                    Objects.requireNonNull(oooO0O0);
                    oooo2.OooO00o(this.f3810OooO0Oo, oooO0O0.f3827OooO00o, oooO0O0.f3828OooO0O0);
                    o00OO0O0 o00oo0o2 = (o00OO0O0) mapOooOOo.get(oooo2);
                    o00oo0o2.getClass();
                    oooo2.f3492OooO0oO = oooo2.OooOoO0(o00oo0o2);
                }
                if (this.f3820OooOOOO) {
                    this.f3810OooO0Oo.OooOOO(arrayList2);
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Oooo0) it2.next()).OooOOo();
                }
                this.f3814OooO0oo.clear();
                this.f3814OooO0oo.addAll(linkedHashSet);
                this.f3809OooO.clear();
                this.f3809OooO.addAll(arrayList);
                this.f3823OooOOo0 = oooo0OooOOOo;
                this.f3822OooOOo = o0000o3;
            } catch (IllegalArgumentException e) {
                if (z || !OooOoO0() || ((p027Oooo0o0.o00O00o0) this.f3815OooOO0).f1103OooO0o0 == 2) {
                    throw e;
                }
                Oooo000(linkedHashSet, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a A[Catch: all -> 0x008d, LOOP:0: B:14:0x0054->B:16:0x005a, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0017, B:13:0x0028, B:14:0x0054, B:16:0x005a, B:9:0x001f, B:17:0x008b), top: B:22:0x0003 }] */
    public final void Oooo00O(@NonNull ArrayList arrayList, @NonNull HashMap map) {
        boolean z;
        HashMap mapOooO00o;
        Iterator it;
        synchronized (this.f3818OooOOO) {
            if (this.f3816OooOO0O != null) {
                Integer numValueOf = Integer.valueOf(this.f3810OooO0Oo.OooO().OooO0o0());
                if (numValueOf == null) {
                    p028Oooo0oO.o00O0O0.OooO0oo("CameraUseCaseAdapter", "The lens facing is null, probably an external.");
                } else {
                    if (numValueOf.intValue() != 0) {
                        z = false;
                    }
                    boolean z2 = z;
                    Rect rectOooO0OO = this.f3810OooO0Oo.OooO0o().OooO0OO();
                    Rational rational = this.f3816OooOO0O.f3520OooO0O0;
                    int iOooOOO = this.f3810OooO0Oo.OooO().OooOOO(this.f3816OooOO0O.f3521OooO0OO);
                    ViewPort viewPort = this.f3816OooOO0O;
                    mapOooO00o = o000OOo.OooO00o(rectOooO0OO, z2, rational, iOooOOO, viewPort.f3519OooO00o, viewPort.f3522OooO0Oo, map);
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        Oooo0 oooo0 = (Oooo0) it.next();
                        Rect rect = (Rect) mapOooO00o.get(oooo0);
                        rect.getClass();
                        oooo0.OooOoo0(rect);
                        Rect rectOooO0OO2 = this.f3810OooO0Oo.OooO0o().OooO0OO();
                        o00OO0O0 o00oo0o1 = (o00OO0O0) map.get(oooo0);
                        o00oo0o1.getClass();
                        oooo0.OooOoOO(OooOOo0(rectOooO0OO2, o00oo0o1.OooO0Oo()));
                    }
                }
                z = true;
                boolean z3 = z;
                Rect rectOooO0OO3 = this.f3810OooO0Oo.OooO0o().OooO0OO();
                Rational rational2 = this.f3816OooOO0O.f3520OooO0O0;
                int iOooOOO2 = this.f3810OooO0Oo.OooO().OooOOO(this.f3816OooOO0O.f3521OooO0OO);
                ViewPort viewPort2 = this.f3816OooOO0O;
                mapOooO00o = o000OOo.OooO00o(rectOooO0OO3, z3, rational2, iOooOOO2, viewPort2.f3519OooO00o, viewPort2.f3522OooO0Oo, map);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    Oooo0 oooo1 = (Oooo0) it.next();
                    Rect rect2 = (Rect) mapOooO00o.get(oooo1);
                    rect2.getClass();
                    oooo1.OooOoo0(rect2);
                    Rect rectOooO0OO4 = this.f3810OooO0Oo.OooO0o().OooO0OO();
                    o00OO0O0 o00oo0o2 = (o00OO0O0) map.get(oooo1);
                    o00oo0o2.getClass();
                    oooo1.OooOoOO(OooOOo0(rectOooO0OO4, o00oo0o2.OooO0Oo()));
                }
            }
        }
    }
}
