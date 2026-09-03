package p022Oooo00O;

import Oooo000.OooO00o;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o000O0O0;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00O00o0;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOO0;
import androidx.camera.core.impl.o00OOOO0;
import androidx.camera.core.impl.o00Oo0;
import androidx.camera.core.impl.oOO00O;
import androidx.camera.core.impl.oo0O;
import androidx.camera.core.impl.oo0o0O0;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import p022Oooo00O.o0Oo0oo;
import p023Oooo00o.oO000o00;
import p025Oooo0OO.o0000O00;
import p025Oooo0OO.o0OO00O;
import p026Oooo0o.OooO;
import p026Oooo0o.OooOOO0;
import p026Oooo0o.OooOo00;
import p028Oooo0oO.o00O0O0;
import p028Oooo0oO.o0O0o;
import p028Oooo0oO.oo00o;
import p030OoooO.OooOO0;
import p030OoooO.OooOOO;
import p030OoooO.OooOo;
import p031OoooO0.Oooo0;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0O0O00;
import p034OoooOO0.o00Ooo;
import p034OoooOO0.o0OoOo0;
import p036OoooOOo.o0000O0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
public final class o0Oo0oo implements CameraControlInternal {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0OO0o00 f845OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @VisibleForTesting
    public final OooO0O0 f846OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Executor f847OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f848OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CameraControlInternal.OooO0O0 f849OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oO000o00 f850OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final SessionConfig.OooO0O0 f851OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O0000O f852OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0OO0 f853OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final oo00oO f854OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @VisibleForTesting
    public final o0OOOO00 f855OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000O0Oo f856OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooOOO0 f857OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f858OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public volatile boolean f859OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final p025Oooo0OO.o0Oo0oo f860OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public volatile int f861OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o0OO00O f862OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO00o f863OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public volatile OooOO0O<Void> f864OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final AtomicLong f865OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f866OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f867OooOo0o;

    @RequiresApi(21)
    public static final class OooO00o extends o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f868OooO00o = new HashSet();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayMap f869OooO0O0 = new ArrayMap();

        @Override // androidx.camera.core.impl.o000oOoO
        public final void OooO00o() {
            for (o000oOoO o000oooo2 : this.f868OooO00o) {
                try {
                    ((Executor) this.f869OooO0O0.get(o000oooo2)).execute(new o0ooOOo(o000oooo2, 0));
                } catch (RejectedExecutionException e) {
                    o00O0O0.OooO0OO("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // androidx.camera.core.impl.o000oOoO
        public final void OooO0O0(@NonNull o00Oo0 o00oo1) {
            for (o000oOoO o000oooo2 : this.f868OooO00o) {
                try {
                    ((Executor) this.f869OooO0O0.get(o000oooo2)).execute(new o0OOO0o(0, o000oooo2, o00oo1));
                } catch (RejectedExecutionException e) {
                    o00O0O0.OooO0OO("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // androidx.camera.core.impl.o000oOoO
        public final void OooO0OO(@NonNull final CameraCaptureFailure cameraCaptureFailure) {
            for (final o000oOoO o000oooo2 : this.f868OooO00o) {
                try {
                    ((Executor) this.f869OooO0O0.get(o000oooo2)).execute(new Runnable() { // from class: Oooo00O.o00oO0o
                        @Override // java.lang.Runnable
                        public final void run() {
                            o000oooo2.OooO0OO(cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    o00O0O0.OooO0OO("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }
    }

    public static final class OooO0O0 extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashSet f870OooO00o = new HashSet();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f871OooO0O0;

        public OooO0O0(@NonNull o0O0O00 o0o0o00) {
            this.f871OooO0O0 = o0o0o00;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            this.f871OooO0O0.execute(new o0OO00O(0, this, totalCaptureResult));
        }
    }

    public interface OooO0OO {
        boolean OooO00o(@NonNull TotalCaptureResult totalCaptureResult);
    }

    public o0Oo0oo(@NonNull oO000o00 oo000o00, @NonNull o0O0O00 o0o0o00, @NonNull o000OO.OooO oooO, @NonNull oo0o0O0 oo0o0o0) {
        SessionConfig.OooO0O0 oooO0O0 = new SessionConfig.OooO0O0();
        this.f851OooO0oO = oooO0O0;
        this.f858OooOOOO = 0;
        this.f859OooOOOo = false;
        this.f861OooOOo0 = 2;
        this.f865OooOo00 = new AtomicLong(0L);
        this.f864OooOo0 = OooOo.OooO0Oo(null);
        this.f866OooOo0O = 1;
        this.f867OooOo0o = 0L;
        OooO00o oooO00o = new OooO00o();
        this.f863OooOo = oooO00o;
        this.f850OooO0o0 = oo000o00;
        this.f849OooO0o = oooO;
        this.f847OooO0OO = o0o0o00;
        OooO0O0 oooO0O1 = new OooO0O0(o0o0o00);
        this.f846OooO0O0 = oooO0O1;
        oooO0O0.f3624OooO0O0.f3656OooO0OO = this.f866OooOo0O;
        oooO0O0.f3624OooO0O0.OooO0O0(new o00OO0O0(oooO0O1));
        oooO0O0.f3624OooO0O0.OooO0O0(oooO00o);
        this.f854OooOO0O = new oo00oO(this, o0o0o00);
        this.f852OooO0oo = new o0O0000O(this, o0o0o00);
        this.f845OooO = new o0OO0o00(this, oo000o00, o0o0o00);
        this.f853OooOO0 = new o0OO0(this, oo000o00, o0o0o00);
        this.f855OooOO0o = new o0OOOO00(oo000o00);
        this.f860OooOOo = new p025Oooo0OO.o0Oo0oo(oo0o0o0);
        this.f862OooOOoo = new o0OO00O(oo0o0o0);
        this.f857OooOOO0 = new OooOOO0(this, o0o0o00);
        this.f856OooOOO = new o000O0Oo(this, oo000o00, oo0o0o0, o0o0o00);
        o0o0o00.execute(new Runnable() { // from class: Oooo00O.o00Ooo
            @Override // java.lang.Runnable
            public final void run() {
                o0Oo0oo o0oo0oo2 = this.f667OooO0Oo;
                o0oo0oo2.OooOO0(o0oo0oo2.f857OooOOO0.f1080OooO0oo);
            }
        });
    }

    public static boolean OooOOo(@NonNull TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof o00OOO0) && (l = (Long) ((o00OOO0) tag).OooO00o("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    public static boolean OooOOo0(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void OooO() {
        OooOOO0 oooOOO0 = this.f857OooOOO0;
        synchronized (oooOOO0.f1078OooO0o0) {
            oooOOO0.f1077OooO0o = new Oooo000.OooO00o.C0004OooO00o();
        }
        OooOo.OooO0o0(o000Oo0.OooO00o(new OooO(oooOOO0))).OooO0oo(new o0OoOo0(), o00oO0o.OooO00o());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public final OooOO0O<List<Void>> OooO00o(@NonNull final List<o000000O> list, final int i, final int i2) {
        if (OooOOOo()) {
            final int i3 = this.f861OooOOo0;
            return OooOOO.OooO00o(OooOo.OooO0o0(this.f864OooOo0)).OooO0OO(new OooOO0() { // from class: Oooo00O.o00Oo0
                @Override // p030OoooO.OooOO0
                public final OooOO0O apply(Object obj) {
                    OooOO0O oooOO0OOooO0Oo;
                    o000O0Oo o000o0oo2 = this.f658OooO00o.f856OooOOO;
                    o0000O00 o0000o00 = new o0000O00(o000o0oo2.f517OooO0Oo);
                    final o000O0Oo.OooO0OO oooO0OO = new o000O0Oo.OooO0OO(o000o0oo2.f520OooO0oO, o000o0oo2.f519OooO0o0, o000o0oo2.f514OooO00o, o000o0oo2.f518OooO0o, o0000o00);
                    ArrayList arrayList = oooO0OO.f540OooO0oO;
                    int i4 = i;
                    o0Oo0oo o0oo0oo2 = o000o0oo2.f514OooO00o;
                    if (i4 == 0) {
                        arrayList.add(new o000O0Oo.OooO0O0(o0oo0oo2));
                    }
                    boolean z = o000o0oo2.f516OooO0OO;
                    final int i5 = i3;
                    if (z) {
                        boolean z2 = true;
                        if (!o000o0oo2.f515OooO0O0.f1042OooO00o && o000o0oo2.f520OooO0oO != 3 && i2 != 1) {
                            z2 = false;
                        }
                        if (z2) {
                            arrayList.add(new o000O0Oo.OooOO0(o0oo0oo2, i5, o000o0oo2.f519OooO0o0));
                        } else {
                            arrayList.add(new o000O0Oo.OooO00o(o0oo0oo2, i5, o0000o00));
                        }
                    }
                    OooOO0O oooOO0OOooO0Oo2 = OooOo.OooO0Oo(null);
                    boolean zIsEmpty = arrayList.isEmpty();
                    final o000O0Oo.OooO0OO.OooO00o oooO00o = oooO0OO.f541OooO0oo;
                    Executor executor = oooO0OO.f535OooO0O0;
                    if (!zIsEmpty) {
                        if (oooO00o.OooO0O0()) {
                            o000O0Oo.OooO oooO = new o000O0Oo.OooO(0L, null);
                            oooO0OO.f536OooO0OO.OooOO0(oooO);
                            oooOO0OOooO0Oo = oooO.f522OooO0O0;
                        } else {
                            oooOO0OOooO0Oo = OooOo.OooO0Oo(null);
                        }
                        oooOO0OOooO0Oo2 = OooOOO.OooO00o(oooOO0OOooO0Oo).OooO0OO(new OooOO0() { // from class: Oooo00O.o000O
                            @Override // p030OoooO.OooOO0
                            public final OooOO0O apply(Object obj2) {
                                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj2;
                                o000O0Oo.OooO0OO oooO0OO2 = oooO0OO;
                                oooO0OO2.getClass();
                                if (o000O0Oo.OooO0O0(i5, totalCaptureResult)) {
                                    oooO0OO2.f538OooO0o = o000O0Oo.OooO0OO.f533OooOO0;
                                }
                                return oooO0OO2.f541OooO0oo.OooO00o(totalCaptureResult);
                            }
                        }, executor).OooO0OO(new OooOO0() { // from class: Oooo00O.o000OO00
                            @Override // p030OoooO.OooOO0
                            public final OooOO0O apply(Object obj2) {
                                o000O0Oo.OooO0OO oooO0OO2 = oooO0OO;
                                oooO0OO2.getClass();
                                if (!Boolean.TRUE.equals((Boolean) obj2)) {
                                    return OooOo.OooO0Oo(null);
                                }
                                long j = oooO0OO2.f538OooO0o;
                                o000O0O0 o000o0o1 = new o000O0O0();
                                Set<CameraCaptureMetaData$AfState> set = o000O0Oo.f511OooO0oo;
                                o000O0Oo.OooO oooO2 = new o000O0Oo.OooO(j, o000o0o1);
                                oooO0OO2.f536OooO0OO.OooOO0(oooO2);
                                return oooO2.f522OooO0O0;
                            }
                        }, executor);
                    }
                    OooOOO oooOOOOooO00o = OooOOO.OooO00o(oooOO0OOooO0Oo2);
                    final List list2 = list;
                    OooOOO oooOOOOooO0OO = oooOOOOooO00o.OooO0OO(new OooOO0() { // from class: Oooo00O.o000OOo0
                        /* JADX WARN: Code duplicated, block: B:25:0x007e  */
                        @Override // p030OoooO.OooOO0
                        public final OooOO0O apply(Object obj2) {
                            int i6;
                            androidx.camera.core.OooOOO0 oooOOO0OooO00o;
                            boolean z3;
                            boolean z4;
                            final o000O0Oo.OooO0OO oooO0OO2 = oooO0OO;
                            oooO0OO2.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = list2.iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                o0Oo0oo o0oo0oo3 = oooO0OO2.f536OooO0OO;
                                if (!zHasNext) {
                                    o0oo0oo3.OooOo00(arrayList3);
                                    return OooOo.OooO00o(arrayList2);
                                }
                                o000000O o000000o2 = (o000000O) it.next();
                                final o000000O.OooO00o oooO00o2 = new o000000O.OooO00o(o000000o2);
                                o00Oo0 o00oo1 = null;
                                int i7 = o000000o2.f3648OooO0OO;
                                if (i7 == 5) {
                                    o0OOOO00 o0oooo01 = o0oo0oo3.f855OooOO0o;
                                    if (!o0oooo01.f837OooO0Oo && !o0oooo01.f836OooO0OO) {
                                        try {
                                            oooOOO0OooO00o = o0oooo01.f835OooO0O0.OooO00o();
                                        } catch (NoSuchElementException unused) {
                                            o00O0O0.OooO0O0("ZslControlImpl", "dequeueImageFromBuffer no such element");
                                            oooOOO0OooO00o = null;
                                        }
                                        if (oooOOO0OooO00o != null) {
                                            o0OOOO00 o0oooo02 = o0oo0oo3.f855OooOO0o;
                                            o0oooo02.getClass();
                                            Image image = oooOOO0OooO00o.getImage();
                                            ImageWriter imageWriter = o0oooo02.f842OooOO0;
                                            if (imageWriter == null || image == null) {
                                                z4 = false;
                                            } else {
                                                try {
                                                    imageWriter.queueInputImage(image);
                                                    z4 = true;
                                                } catch (IllegalStateException e) {
                                                    o00O0O0.OooO0O0("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
                                                    z4 = false;
                                                }
                                            }
                                            if (z4) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            oo00o oo00oVarO00000Oo = oooOOO0OooO00o.o00000Oo();
                                            if (oo00oVarO00000Oo instanceof o0OoOo0) {
                                                o00oo1 = ((o0OoOo0) oo00oVarO00000Oo).f1433OooO00o;
                                            }
                                        }
                                    }
                                }
                                if (o00oo1 != null) {
                                    oooO00o2.f3661OooO0oo = o00oo1;
                                } else {
                                    if (oooO0OO2.f534OooO00o != 3 || oooO0OO2.f539OooO0o0) {
                                        i6 = (i7 == -1 || i7 == 5) ? 2 : -1;
                                    } else {
                                        i6 = 4;
                                    }
                                    if (i6 != -1) {
                                        oooO00o2.f3656OooO0OO = i6;
                                    }
                                }
                                o0000O00 o0000o01 = oooO0OO2.f537OooO0Oo;
                                if (o0000o01.f1040OooO0O0 && i5 == 0 && o0000o01.f1039OooO00o) {
                                    oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
                                    ooo00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(CaptureRequest.CONTROL_AE_MODE), 3);
                                    oooO00o2.OooO0OO(new OooO00o(o00O0O00.Oooo0O0(ooo00oOooo0OO)));
                                }
                                arrayList2.add(o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: Oooo00O.o000OO0O
                                    @Override // o0ooOO0.o000Oo0.OooO0OO
                                    public final Object OooO0o0(o000Oo0.OooO00o oooO00o3) {
                                        oooO0OO2.getClass();
                                        oooO00o2.OooO0O0(new o0O0ooO(oooO00o3));
                                        return "submitStillCapture";
                                    }
                                }));
                                arrayList3.add(oooO00o2.OooO0Oo());
                            }
                        }
                    }, executor);
                    Objects.requireNonNull(oooO00o);
                    oooOOOOooO0OO.OooO0oo(new Runnable() { // from class: Oooo00O.o00
                        @Override // java.lang.Runnable
                        public final void run() {
                            oooO00o.OooO0OO();
                        }
                    }, executor);
                    return OooOo.OooO0o0(oooOOOOooO0OO);
                }
            }, this.f847OooO0OO);
        }
        o00O0O0.OooO0oo("Camera2CameraControlImp", "Camera is not active.");
        return new OoooO.o000oOoO.OooO00o(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public final OooOO0O<Void> OooO0O0(float f) {
        OooOO0O oooO00o;
        final p034OoooOO0.o000oOoO o000ooooOooO0O0;
        if (!OooOOOo()) {
            return new OoooO.o000oOoO.OooO00o(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final o0OO0o00 o0oo0o01 = this.f845OooO;
        synchronized (o0oo0o01.f821OooO0OO) {
            try {
                o0oo0o01.f821OooO0OO.OooO0O0(f);
                o000ooooOooO0O0 = o00Ooo.OooO0O0(o0oo0o01.f821OooO0OO);
            } catch (IllegalArgumentException e) {
                oooO00o = new OoooO.o000oOoO.OooO00o(e);
            }
        }
        o0oo0o01.OooO0O0(o000ooooOooO0O0);
        oooO00o = o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: Oooo00O.o0OOooO0
            @Override // o0ooOO0.o000Oo0.OooO0OO
            public final Object OooO0o0(final o000Oo0.OooO00o oooO00o2) {
                final o0OO0o00 o0oo0o02 = o0oo0o01;
                o0oo0o02.getClass();
                final o0O0o o0o0o = o000ooooOooO0O0;
                o0oo0o02.f820OooO0O0.execute(new Runnable() { // from class: Oooo00O.o0OO0O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        p034OoooOO0.o000oOoO o000ooooOooO0O1;
                        o0OO0o00 o0oo0o03 = o0oo0o02;
                        o000Oo0.OooO00o<Void> oooO00o3 = oooO00o2;
                        o0O0o o0o0o2 = o0o0o;
                        if (o0oo0o03.f823OooO0o) {
                            o0oo0o03.OooO0O0(o0o0o2);
                            o0oo0o03.f824OooO0o0.OooO0O0(o0o0o2.OooO00o(), oooO00o3);
                            o0oo0o03.f819OooO00o.OooOo0();
                        } else {
                            synchronized (o0oo0o03.f821OooO0OO) {
                                o0oo0o03.f821OooO0OO.OooO0O0(1.0f);
                                o000ooooOooO0O1 = o00Ooo.OooO0O0(o0oo0o03.f821OooO0OO);
                            }
                            o0oo0o03.OooO0O0(o000ooooOooO0O1);
                            oooO00o3.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
                        }
                    }
                });
                return "setZoomRatio";
            }
        });
        return OooOo.OooO0o0(oooO00o);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public final Rect OooO0OO() {
        Rect rect = (Rect) this.f850OooO0o0.OooO00o(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void OooO0Oo(int i) {
        if (!OooOOOo()) {
            o00O0O0.OooO0oo("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f861OooOOo0 = i;
        o0OOOO00 o0oooo01 = this.f855OooOO0o;
        boolean z = true;
        if (this.f861OooOOo0 != 1 && this.f861OooOOo0 != 0) {
            z = false;
        }
        o0oooo01.f837OooO0Oo = z;
        this.f864OooOo0 = OooOo.OooO0o0(o000Oo0.OooO00o(new o000oOoO(this)));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public final Config OooO0o() {
        return this.f857OooOOO0.OooO00o();
    }

    @Override // androidx.camera.core.CameraControl
    @NonNull
    public final OooOO0O<Void> OooO0o0(final boolean z) {
        OooOO0O oooOO0OOooO00o;
        if (!OooOOOo()) {
            return new OoooO.o000oOoO.OooO00o(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final o0OO0 o0oo1 = this.f853OooOO0;
        if (o0oo1.f799OooO0OO) {
            o0OO0.OooO0O0(o0oo1.f798OooO0O0, Integer.valueOf(z ? 1 : 0));
            oooOO0OOooO00o = o000Oo0.OooO00o(new o000Oo0.OooO0OO() { // from class: Oooo00O.oo0ooO
                @Override // o0ooOO0.o000Oo0.OooO0OO
                public final Object OooO0o0(final o000Oo0.OooO00o oooO00o) {
                    final o0OO0 o0oo2 = o0oo1;
                    o0oo2.getClass();
                    final boolean z2 = z;
                    o0oo2.f800OooO0Oo.execute(new Runnable() { // from class: Oooo00O.oo0oO0
                        @Override // java.lang.Runnable
                        public final void run() {
                            o0oo2.OooO00o(oooO00o, z2);
                        }
                    });
                    return "enableTorch: " + z2;
                }
            });
        } else {
            o00O0O0.OooO00o("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            oooOO0OOooO00o = new OoooO.o000oOoO.OooO00o(new IllegalStateException("No flash unit"));
        }
        return OooOo.OooO0o0(oooOO0OOooO00o);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void OooO0oO(@NonNull Config config) {
        OooOOO0 oooOOO0 = this.f857OooOOO0;
        OooOo00 oooOo00OooO0OO = OooOo00.OooO00o.OooO0Oo(config).OooO0OO();
        synchronized (oooOOO0.f1078OooO0o0) {
            try {
                for (Config.OooO00o<?> oooO00o : oooOo00OooO0OO.getConfig().OooO0oo()) {
                    oooOOO0.f1077OooO0o.f433OooO00o.Oooo0oO(oooO00o, oooOo00OooO0OO.getConfig().OooO0O0(oooO00o));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        OooOo.OooO0o0(o000Oo0.OooO00o(new p026Oooo0o.OooOO0(oooOOO0))).OooO0oo(new o0OoOo0(), o00oO0o.OooO00o());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void OooO0oo(@NonNull SessionConfig.OooO0O0 oooO0O0) throws Exception {
        HashMap map;
        int[] validOutputFormatsForInput;
        final o0OOOO00 o0oooo01 = this.f855OooOO0o;
        oO000o00 oo000o00 = o0oooo01.f834OooO00o;
        while (true) {
            o0000O0 o0000o1 = o0oooo01.f835OooO0O0;
            if (o0000o1.OooO0OO()) {
                break;
            } else {
                o0000o1.OooO00o().close();
            }
        }
        o000O o000o = o0oooo01.f833OooO;
        StreamConfigurationMap streamConfigurationMap = null;
        if (o000o != null) {
            final androidx.camera.core.OooOo00 oooOo00 = o0oooo01.f840OooO0oO;
            if (oooOo00 != null) {
                o000o.OooO0Oo().OooO0oo(new Runnable() { // from class: Oooo00O.o0OO0oO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((androidx.camera.core.OooOo00) oooOo00).OooO00o();
                    }
                }, o00oO0o.OooO0OO());
                o0oooo01.f840OooO0oO = null;
            }
            o000o.OooO00o();
            o0oooo01.f833OooO = null;
        }
        ImageWriter imageWriter = o0oooo01.f842OooOO0;
        if (imageWriter != null) {
            imageWriter.close();
            o0oooo01.f842OooOO0 = null;
        }
        if (o0oooo01.f836OooO0OO || o0oooo01.f838OooO0o) {
            return;
        }
        try {
            streamConfigurationMap = (StreamConfigurationMap) oo000o00.OooO00o(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            o00O0O0.OooO0O0("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
        }
        boolean z = true;
        int i = 0;
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i2 : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i2);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new Oooo0(true));
                    map.put(Integer.valueOf(i2), inputSizes[0]);
                }
            }
        }
        if (o0oooo01.f839OooO0o0 && !map.isEmpty() && map.containsKey(34)) {
            StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) oo000o00.OooO00o(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap2 == null || (validOutputFormatsForInput = streamConfigurationMap2.getValidOutputFormatsForInput(34)) == null) {
                z = false;
                break;
            }
            int length = validOutputFormatsForInput.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = false;
                    break;
                } else if (validOutputFormatsForInput[i3] == 256) {
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                Size size = (Size) map.get(34);
                androidx.camera.core.OooOOO oooOOO = new androidx.camera.core.OooOOO(size.getWidth(), size.getHeight(), 34, 9);
                o0oooo01.f841OooO0oo = oooOOO.f3452OooO0O0;
                o0oooo01.f840OooO0oO = new androidx.camera.core.OooOo00(oooOOO);
                oooOOO.OooO0o(new o000O0O0.OooO00o() { // from class: Oooo00O.o0OO
                    @Override // androidx.camera.core.impl.o000O0O0.OooO00o
                    public final void OooO00o(o000O0O0 o000o0o1) throws Exception {
                        o0OOOO00 o0oooo02 = o0oooo01;
                        o0oooo02.getClass();
                        try {
                            androidx.camera.core.OooOOO0 oooOOO0OooO0O0 = o000o0o1.OooO0O0();
                            if (oooOOO0OooO0O0 != null) {
                                o0oooo02.f835OooO0O0.OooO0O0(oooOOO0OooO0O0);
                            }
                        } catch (IllegalStateException e2) {
                            o00O0O0.OooO0O0("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e2.getMessage());
                        }
                    }
                }, o00oO0o.OooO0O0());
                o000O o000o2 = new o000O(o0oooo01.f840OooO0oO.getSurface(), new Size(o0oooo01.f840OooO0oO.getWidth(), o0oooo01.f840OooO0oO.getHeight()), 34);
                o0oooo01.f833OooO = o000o2;
                androidx.camera.core.OooOo00 oooOo01 = o0oooo01.f840OooO0oO;
                OooOO0O<Void> oooOO0OOooO0Oo = o000o2.OooO0Oo();
                Objects.requireNonNull(oooOo01);
                oooOO0OOooO0Oo.OooO0oo(new o0OOO00(oooOo01, i), o00oO0o.OooO0OO());
                oooO0O0.OooO0Oo(o0oooo01.f833OooO, DynamicRange.f3398OooO0Oo);
                androidx.camera.core.OooOOO.OooO00o oooO00o = o0oooo01.f841OooO0oo;
                oooO0O0.f3624OooO0O0.OooO0O0(oooO00o);
                ArrayList arrayList = oooO0O0.f3627OooO0o;
                if (!arrayList.contains(oooO00o)) {
                    arrayList.add(oooO00o);
                }
                oooO0O0.OooO0OO(new o0OOO0OO(o0oooo01));
                oooO0O0.f3629OooO0oO = new InputConfiguration(o0oooo01.f840OooO0oO.getWidth(), o0oooo01.f840OooO0oO.getHeight(), o0oooo01.f840OooO0oO.OooO0OO());
            }
        }
    }

    public final void OooOO0(@NonNull OooO0OO oooO0OO) {
        this.f846OooO0O0.f870OooO00o.add(oooO0OO);
    }

    public final void OooOO0O() {
        synchronized (this.f848OooO0Oo) {
            int i = this.f858OooOOOO;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.f858OooOOOO = i - 1;
        }
    }

    public final void OooOO0o(boolean z) {
        this.f859OooOOOo = z;
        if (!z) {
            o000000O.OooO00o oooO00o = new o000000O.OooO00o();
            oooO00o.f3656OooO0OO = this.f866OooOo0O;
            oooO00o.f3658OooO0o = true;
            oOO00O ooo00oOooo0OO = oOO00O.Oooo0OO();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            ooo00oOooo0OO.Oooo0oO(Oooo000.OooO00o.Oooo0O0(key), Integer.valueOf(OooOOO(1)));
            ooo00oOooo0OO.Oooo0oO(Oooo000.OooO00o.Oooo0O0(CaptureRequest.FLASH_MODE), 0);
            oooO00o.OooO0OO(new Oooo000.OooO00o(o00O0O00.Oooo0O0(ooo00oOooo0OO)));
            OooOo00(Collections.singletonList(oooO00o.OooO0Oo()));
        }
        OooOo0();
    }

    public final int OooOOO(int i) {
        int[] iArr = (int[]) this.f850OooO0o0.OooO00o(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (OooOOo0(i, iArr)) {
            return i;
        }
        return OooOOo0(1, iArr) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6 A[LOOP:0: B:46:0x00e0->B:48:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    public final SessionConfig OooOOO0() {
        int[] iArr;
        o0oOOo o0oooo;
        Oooo000.OooO00o OooO00o2;
        Object objOooOoO;
        SessionConfig.OooO0O0 oooO0O0 = this.f851OooO0oO;
        oooO0O0.f3624OooO0O0.f3656OooO0OO = this.f866OooOo0O;
        Oooo000.OooO00o.C0004OooO00o c0004OooO00o = new Oooo000.OooO00o.C0004OooO00o();
        int i = 1;
        c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_MODE, 1);
        o0O0000O o0o0000o2 = this.f852OooO0oo;
        o0o0000o2.getClass();
        int i2 = 3;
        c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(o0o0000o2.f687OooO00o.OooOOOO(o0o0000o2.f689OooO0OO != 3 ? 4 : 3)));
        MeteringRectangle[] meteringRectangleArr = o0o0000o2.f692OooO0o0;
        if (meteringRectangleArr.length != 0) {
            c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = o0o0000o2.f691OooO0o;
        if (meteringRectangleArr2.length != 0) {
            c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = o0o0000o2.f693OooO0oO;
        if (meteringRectangleArr3.length != 0) {
            c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
        Range<Integer> range = this.f860OooOOo.f1060OooO00o;
        if (range != null) {
            c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
        this.f845OooO.f824OooO0o0.OooO0o(c0004OooO00o);
        if (!this.f859OooOOOo) {
            int i3 = this.f861OooOOo0;
            if (i3 == 0) {
                o0OO00O o0oo00o2 = this.f862OooOOoo;
                if (!o0oo00o2.f1058OooO00o && !o0oo00o2.f1059OooO0O0) {
                    i2 = 2;
                }
            } else if (i3 != 1) {
            }
            c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(OooOOO(i2)));
            CaptureRequest.Key key = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.f850OooO0o0.OooO00o(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!OooOOo0(1, iArr) && !OooOOo0(1, iArr))) {
                i = 0;
            }
            c0004OooO00o.OooO0OO(key, Integer.valueOf(i));
            oo00oO oo00oo = this.f854OooOO0O;
            oo00oo.getClass();
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            o0oooo = oo00oo.f897OooO00o;
            synchronized (o0oooo.f886OooO00o) {
                int i4 = o0oooo.f887OooO0O0;
            }
            c0004OooO00o.OooO0OO(key2, Integer.valueOf(i4));
            OooO00o2 = this.f857OooOOO0.OooO00o();
            for (Config.OooO00o<?> oooO00o : OooO00o2.getConfig().OooO0oo()) {
                c0004OooO00o.f433OooO00o.Oooo0o(oooO00o, Config.OptionPriority.ALWAYS_OVERRIDE, OooO00o2.getConfig().OooO0O0(oooO00o));
            }
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(o00O0O00.Oooo0O0(c0004OooO00o.f433OooO00o));
            o000000O.OooO00o oooO00o3 = oooO0O0.f3624OooO0O0;
            oooO00o3.getClass();
            oooO00o3.f3655OooO0O0 = oOO00O.Oooo0o0(oooO00o2);
            objOooOoO = this.f857OooOOO0.OooO00o().f1083OooOooo.OooOoO(Oooo000.OooO00o.f432Oooo0o0, null);
            if (objOooOoO != null && (objOooOoO instanceof Integer)) {
                this.f851OooO0oO.f3624OooO0O0.f3660OooO0oO.f3744OooO00o.put("Camera2CameraControl", objOooOoO);
            }
            this.f851OooO0oO.f3624OooO0O0.f3660OooO0oO.f3744OooO00o.put("CameraControlSessionUpdateId", Long.valueOf(this.f867OooOo0o));
            return this.f851OooO0oO.OooO0o0();
        }
        c0004OooO00o.OooO0OO(CaptureRequest.FLASH_MODE, 2);
        i2 = 1;
        c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(OooOOO(i2)));
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.f850OooO0o0.OooO00o(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i = 0;
        } else {
            i = 0;
        }
        c0004OooO00o.OooO0OO(key3, Integer.valueOf(i));
        oo00oO oo00oo2 = this.f854OooOO0O;
        oo00oo2.getClass();
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        o0oooo = oo00oo2.f897OooO00o;
        synchronized (o0oooo.f886OooO00o) {
            int i5 = o0oooo.f887OooO0O0;
            c0004OooO00o.OooO0OO(key4, Integer.valueOf(i5));
            OooO00o2 = this.f857OooOOO0.OooO00o();
            while (r3.hasNext()) {
                c0004OooO00o.f433OooO00o.Oooo0o(oooO00o, Config.OptionPriority.ALWAYS_OVERRIDE, OooO00o2.getConfig().OooO0O0(oooO00o));
            }
            Oooo000.OooO00o oooO00o4 = new Oooo000.OooO00o(o00O0O00.Oooo0O0(c0004OooO00o.f433OooO00o));
            o000000O.OooO00o oooO00o5 = oooO0O0.f3624OooO0O0;
            oooO00o5.getClass();
            oooO00o5.f3655OooO0O0 = oOO00O.Oooo0o0(oooO00o4);
            objOooOoO = this.f857OooOOO0.OooO00o().f1083OooOooo.OooOoO(Oooo000.OooO00o.f432Oooo0o0, null);
            if (objOooOoO != null) {
                this.f851OooO0oO.f3624OooO0O0.f3660OooO0oO.f3744OooO00o.put("Camera2CameraControl", objOooOoO);
            }
            this.f851OooO0oO.f3624OooO0O0.f3660OooO0oO.f3744OooO00o.put("CameraControlSessionUpdateId", Long.valueOf(this.f867OooOo0o));
            return this.f851OooO0oO.OooO0o0();
        }
    }

    public final int OooOOOO(int i) {
        int[] iArr = (int[]) this.f850OooO0o0.OooO00o(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (OooOOo0(i, iArr)) {
            return i;
        }
        if (OooOOo0(4, iArr)) {
            return 4;
        }
        return OooOOo0(1, iArr) ? 1 : 0;
    }

    public final boolean OooOOOo() {
        int i;
        synchronized (this.f848OooO0Oo) {
            i = this.f858OooOOOO;
        }
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [Oooo00O.o0O0o, Oooo00O.o0Oo0oo$OooO0OO] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooOOoo(final boolean z) {
        p034OoooOO0.o000oOoO o000ooooOooO0O0;
        final o0O0000O o0o0000o2 = this.f852OooO0oo;
        if (z != o0o0000o2.f688OooO0O0) {
            o0o0000o2.f688OooO0O0 = z;
            if (!o0o0000o2.f688OooO0O0) {
                o0O0o o0o0o = o0o0000o2.f690OooO0Oo;
                o0Oo0oo o0oo0oo2 = o0o0000o2.f687OooO00o;
                o0oo0oo2.f846OooO0O0.f870OooO00o.remove(o0o0o);
                o000Oo0.OooO00o<Void> oooO00o = o0o0000o2.f694OooO0oo;
                if (oooO00o != null) {
                    oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Cancelled by another cancelFocusAndMetering()"));
                    o0o0000o2.f694OooO0oo = null;
                }
                o0oo0oo2.f846OooO0O0.f870OooO00o.remove(null);
                o0o0000o2.f694OooO0oo = null;
                if (o0o0000o2.f692OooO0o0.length > 0) {
                    o0o0000o2.OooO00o(true, false);
                }
                MeteringRectangle[] meteringRectangleArr = o0O0000O.f686OooO;
                o0o0000o2.f692OooO0o0 = meteringRectangleArr;
                o0o0000o2.f691OooO0o = meteringRectangleArr;
                o0o0000o2.f693OooO0oO = meteringRectangleArr;
                final long jOooOo0 = o0oo0oo2.OooOo0();
                if (o0o0000o2.f694OooO0oo != null) {
                    final int iOooOOOO = o0oo0oo2.OooOOOO(o0o0000o2.f689OooO0OO != 3 ? 4 : 3);
                    ?? r7 = new OooO0OO() { // from class: Oooo00O.o0O0o
                        @Override // Oooo00O.o0Oo0oo.OooO0OO
                        public final boolean OooO00o(TotalCaptureResult totalCaptureResult) {
                            o0O0000O o0o0000o3 = o0o0000o2;
                            o0o0000o3.getClass();
                            if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != iOooOOOO || !o0Oo0oo.OooOOo(totalCaptureResult, jOooOo0)) {
                                return false;
                            }
                            o000Oo0.OooO00o<Void> oooO00o2 = o0o0000o3.f694OooO0oo;
                            if (oooO00o2 != null) {
                                oooO00o2.OooO0O0(null);
                                o0o0000o3.f694OooO0oo = null;
                            }
                            return true;
                        }
                    };
                    o0o0000o2.f690OooO0Oo = r7;
                    o0oo0oo2.OooOO0(r7);
                }
            }
        }
        o0OO0o00 o0oo0o01 = this.f845OooO;
        if (o0oo0o01.f823OooO0o != z) {
            o0oo0o01.f823OooO0o = z;
            if (!z) {
                synchronized (o0oo0o01.f821OooO0OO) {
                    o0oo0o01.f821OooO0OO.OooO0O0(1.0f);
                    o000ooooOooO0O0 = o00Ooo.OooO0O0(o0oo0o01.f821OooO0OO);
                }
                o0oo0o01.OooO0O0(o000ooooOooO0O0);
                o0oo0o01.f824OooO0o0.OooO0Oo();
                o0oo0o01.f819OooO00o.OooOo0();
            }
        }
        o0OO0 o0oo1 = this.f853OooOO0;
        if (o0oo1.f802OooO0o0 != z) {
            o0oo1.f802OooO0o0 = z;
            if (!z) {
                if (o0oo1.f803OooO0oO) {
                    o0oo1.f803OooO0oO = false;
                    o0oo1.f797OooO00o.OooOO0o(false);
                    o0OO0.OooO0O0(o0oo1.f798OooO0O0, 0);
                }
                o000Oo0.OooO00o<Void> oooO00o2 = o0oo1.f801OooO0o;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
                    o0oo1.f801OooO0o = null;
                }
            }
        }
        this.f854OooOO0O.OooO00o(z);
        final OooOOO0 oooOOO0 = this.f857OooOOO0;
        oooOOO0.getClass();
        oooOOO0.f1076OooO0Oo.execute(new Runnable() { // from class: Oooo0o.OooO0o
            @Override // java.lang.Runnable
            public final void run() {
                OooOOO0 oooOOO1 = oooOOO0;
                boolean z2 = oooOOO1.f1073OooO00o;
                boolean z3 = z;
                if (z2 == z3) {
                    return;
                }
                oooOOO1.f1073OooO00o = z3;
                if (!z3) {
                    o000Oo0.OooO00o<Void> oooO00o3 = oooOOO1.f1079OooO0oO;
                    if (oooO00o3 != null) {
                        oooO00o3.OooO0OO(new CameraControl.OperationCanceledException("The camera control has became inactive."));
                        oooOOO1.f1079OooO0oO = null;
                        return;
                    }
                    return;
                }
                if (oooOOO1.f1074OooO0O0) {
                    o0Oo0oo o0oo0oo3 = oooOOO1.f1075OooO0OO;
                    o0oo0oo3.getClass();
                    o0oo0oo3.f847OooO0OO.execute(new p022Oooo00O.OooOo00(o0oo0oo3));
                    oooOOO1.f1074OooO0O0 = false;
                }
            }
        });
    }

    public final long OooOo0() {
        this.f867OooOo0o = this.f865OooOo00.getAndIncrement();
        o000OO.this.Oooo0o0();
        return this.f867OooOo0o;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0151 A[LOOP:5: B:51:0x014b->B:53:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x016d A[SYNTHETIC] */
    public final void OooOo00(List<o000000O> list) {
        ArrayMap arrayMap;
        boolean z;
        o00Oo0 o00oo1;
        o000OO.OooO oooO = (o000OO.OooO) this.f849OooO0o;
        oooO.getClass();
        list.getClass();
        o000OO o000oo2 = o000OO.this;
        o000oo2.getClass();
        ArrayList arrayList = new ArrayList();
        for (o000000O o000000o2 : list) {
            HashSet hashSet = new HashSet();
            oOO00O.Oooo0OO();
            Range<Integer> range = oo0O.f3780OooO00o;
            ArrayList arrayList2 = new ArrayList();
            o00O00o0.OooO0OO();
            hashSet.addAll(o000000o2.f3646OooO00o);
            oOO00O ooo00oOooo0o0 = oOO00O.Oooo0o0(o000000o2.f3647OooO0O0);
            int i = o000000o2.f3648OooO0OO;
            Range<Integer> range2 = o000000o2.f3649OooO0Oo;
            arrayList2.addAll(o000000o2.f3651OooO0o0);
            boolean z2 = o000000o2.f3650OooO0o;
            ArrayMap arrayMap2 = new ArrayMap();
            o00OOO0 o00ooo1 = o000000o2.f3652OooO0oO;
            for (String str : o00ooo1.OooO0O0()) {
                arrayMap2.put(str, o00ooo1.OooO00o(str));
            }
            o00O00o0 o00o00o1 = new o00O00o0(arrayMap2);
            o00Oo0 o00oo2 = (o000000o2.f3648OooO0OO != 5 || (o00oo1 = o000000o2.f3653OooO0oo) == null) ? null : o00oo1;
            if (o000000o2.OooO00o().isEmpty() && o000000o2.f3650OooO0o) {
                if (hashSet.isEmpty()) {
                    o00OOOO0 o00oooo1 = o000oo2.f549OooO0Oo;
                    o00oooo1.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = o00oooo1.f3746OooO0O0.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        o00OOOO0.OooO00o oooO00o = (o00OOOO0.OooO00o) entry.getValue();
                        if (oooO00o.f3750OooO0Oo && oooO00o.f3749OooO0OO) {
                            arrayList3.add(((o00OOOO0.OooO00o) entry.getValue()).f3747OooO00o);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it2.hasNext()) {
                        List<DeferrableSurface> listOooO00o = ((SessionConfig) it2.next()).f3620OooO0o.OooO00o();
                        if (!listOooO00o.isEmpty()) {
                            Iterator<DeferrableSurface> it3 = listOooO00o.iterator();
                            while (it3.hasNext()) {
                                hashSet.add(it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        o00O0O0.OooO0oo("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    } else {
                        z = true;
                    }
                    if (!z) {
                        ArrayList arrayList4 = new ArrayList(hashSet);
                        o00O0O00 o00o0o00Oooo0O0 = o00O0O00.Oooo0O0(ooo00oOooo0o0);
                        ArrayList arrayList5 = new ArrayList(arrayList2);
                        o00OOO0 o00ooo2 = o00OOO0.f3743OooO0O0;
                        arrayMap = new ArrayMap();
                        for (String str2 : o00o00o1.OooO0O0()) {
                            arrayMap.put(str2, o00o00o1.OooO00o(str2));
                        }
                        arrayList.add(new o000000O(arrayList4, o00o0o00Oooo0O0, i, range2, arrayList5, z2, new o00OOO0(arrayMap), o00oo2));
                    }
                } else {
                    o00O0O0.OooO0oo("Camera2CameraImpl", "The capture config builder already has surface inside.");
                }
                z = false;
                if (!z) {
                    ArrayList arrayList6 = new ArrayList(hashSet);
                    o00O0O00 o00o0o00Oooo0O1 = o00O0O00.Oooo0O0(ooo00oOooo0o0);
                    ArrayList arrayList7 = new ArrayList(arrayList2);
                    o00OOO0 o00ooo3 = o00OOO0.f3743OooO0O0;
                    arrayMap = new ArrayMap();
                    while (r6.hasNext()) {
                        arrayMap.put(str2, o00o00o1.OooO00o(str2));
                    }
                    arrayList.add(new o000000O(arrayList6, o00o0o00Oooo0O1, i, range2, arrayList7, z2, new o00OOO0(arrayMap), o00oo2));
                }
            } else {
                ArrayList arrayList8 = new ArrayList(hashSet);
                o00O0O00 o00o0o00Oooo0O2 = o00O0O00.Oooo0O0(ooo00oOooo0o0);
                ArrayList arrayList9 = new ArrayList(arrayList2);
                o00OOO0 o00ooo4 = o00OOO0.f3743OooO0O0;
                arrayMap = new ArrayMap();
                while (r6.hasNext()) {
                    arrayMap.put(str2, o00o00o1.OooO00o(str2));
                }
                arrayList.add(new o000000O(arrayList8, o00o0o00Oooo0O2, i, range2, arrayList9, z2, new o00OOO0(arrayMap), o00oo2));
            }
        }
        o000oo2.OooOo00("Issue capture request", null);
        o000oo2.f560OooOOOo.OooO0O0(arrayList);
    }
}
