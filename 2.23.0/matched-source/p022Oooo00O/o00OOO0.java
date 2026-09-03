package p022Oooo00O;

import Oooo000.OooO0O0;
import Oooo000.OooO0OO;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import androidx.camera.core.impl.o00O00OO;
import androidx.camera.core.impl.o00OO;
import androidx.camera.core.impl.o00OO0O0;
import androidx.camera.core.impl.o00Oo0;
import com.google.common.util.concurrent.OooO00o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p025Oooo0OO.o0000O;
import p025Oooo0OO.o0000O0O;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOO0;
import p030OoooO.OooOOO;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo00;
import p030OoooO.Oooo0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OOO0 implements o0o0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("mSessionLock")
    public o0oO0O0o f633OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mSessionLock")
    public o0oOo0O0 f634OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    @GuardedBy("mSessionLock")
    public SessionConfig f635OooO0oO;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public OooO0o f639OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public o00O000.OooO00o<Void> f640OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public o00O000.OooO0o f641OooOOO0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Oooo0.OooO f644OooOOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f629OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public final ArrayList f630OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f631OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    @GuardedBy("mSessionLock")
    public o00O0 f636OooO0oo = o00O0.f3709Oooo00O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    @GuardedBy("mSessionLock")
    public Oooo000.OooO0OO f628OooO = new Oooo000.OooO0OO(new Oooo000.OooO0O0[0]);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public final HashMap f637OooOO0 = new HashMap();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public List<DeferrableSurface> f638OooOO0O = Collections.emptyList();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    @GuardedBy("mSessionLock")
    public Map<DeferrableSurface, Long> f642OooOOOO = new HashMap();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0000O0O f643OooOOOo = new o0000O0O();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final o0000O f645OooOOo0 = new o0000O();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public final OooO f632OooO0Oo = new OooO();

    public final class OooO extends o0oO0O0o.OooO00o {
        public OooO() {
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOOO(@NonNull o0O0OOOo o0o0oooo) {
            synchronized (o00OOO0.this.f629OooO00o) {
                try {
                    switch (OooO0OO.f648OooO00o[o00OOO0.this.f639OooOO0o.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 8:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + o00OOO0.this.f639OooOO0o);
                        case 4:
                            o00OOO0 o00ooo1 = o00OOO0.this;
                            o00ooo1.f639OooOO0o = OooO0o.OPENED;
                            o00ooo1.f633OooO0o = o0o0oooo;
                            if (o00ooo1.f635OooO0oO != null) {
                                Oooo000.OooO0OO oooO0OO = o00ooo1.f628OooO;
                                oooO0OO.getClass();
                                List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(oooO0OO.f3721OooO00o));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = listUnmodifiableList.iterator();
                                while (it.hasNext()) {
                                    arrayList.add((Oooo000.OooO0O0) it.next());
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ((Oooo000.OooO0O0) it2.next()).getClass();
                                }
                                if (!arrayList2.isEmpty()) {
                                    o00OOO0 o00ooo2 = o00OOO0.this;
                                    o00ooo2.OooOO0O(o00ooo2.OooOOO(arrayList2));
                                }
                            }
                            o00O0O0.OooO00o("CaptureSession", "Attempting to send capture request onConfigured");
                            o00OOO0 o00ooo3 = o00OOO0.this;
                            o00ooo3.OooOO0o(o00ooo3.f635OooO0oO);
                            o00OOO0 o00ooo4 = o00OOO0.this;
                            ArrayList arrayList3 = o00ooo4.f630OooO0O0;
                            if (!arrayList3.isEmpty()) {
                                try {
                                    o00ooo4.OooOO0O(arrayList3);
                                    arrayList3.clear();
                                } catch (Throwable th) {
                                    arrayList3.clear();
                                    throw th;
                                }
                            }
                            o00O0O0.OooO00o("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + o00OOO0.this.f639OooOO0o);
                            break;
                        case 6:
                            o00OOO0.this.f633OooO0o = o0o0oooo;
                            o00O0O0.OooO00o("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + o00OOO0.this.f639OooOO0o);
                            break;
                        case 7:
                            o0o0oooo.close();
                            o00O0O0.OooO00o("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + o00OOO0.this.f639OooOO0o);
                            break;
                        default:
                            o00O0O0.OooO00o("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + o00OOO0.this.f639OooOO0o);
                            break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:81:0x0085
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOOO0(@androidx.annotation.NonNull p022Oooo00O.o0oO0O0o r5) {
            /*
                r4 = this;
                java.lang.String r5 = "onConfigureFailed() should not be possible in state: "
                java.lang.String r0 = "CameraCaptureSession.onConfigureFailed() "
                Oooo00O.o00OOO0 r1 = p022Oooo00O.o00OOO0.this
                java.lang.Object r1 = r1.f629OooO00o
                monitor-enter(r1)
                int[] r2 = Oooo00O.o00OOO0.OooO0OO.f648OooO00o     // Catch: java.lang.Throwable -> L8f
                Oooo00O.o00OOO0 r3 = p022Oooo00O.o00OOO0.this     // Catch: java.lang.Throwable -> L8d
                Oooo00O.o00OOO0$OooO0o r3 = r3.f639OooOO0o     // Catch: java.lang.Throwable -> L8b
                int r3 = r3.ordinal()     // Catch: java.lang.Throwable -> L89
                r2 = r2[r3]     // Catch: java.lang.Throwable -> L87
                switch(r2) {
                    case 1: goto L36;
                    case 2: goto L36;
                    case 3: goto L36;
                    case 4: goto L2a;
                    case 5: goto L36;
                    case 6: goto L2a;
                    case 7: goto L2a;
                    case 8: goto L19;
                    default: goto L18;
                }
            L18:
                goto L5e
            L19:
                java.lang.String r5 = "CaptureSession"
                java.lang.String r2 = "ConfigureFailed callback after change to RELEASED state"
                p028Oooo0oO.o00O0O0.OooO00o(r5, r2)     // Catch: java.lang.Throwable -> L21
                goto L5e
            L21:
                r5 = move-exception
                goto L90
            L24:
                r5 = move-exception
                goto L90
            L27:
                r5 = move-exception
                goto L90
            L2a:
                Oooo00O.o00OOO0 r5 = p022Oooo00O.o00OOO0.this     // Catch: java.lang.Throwable -> L33
                r5.OooO()     // Catch: java.lang.Throwable -> L30
                goto L5e
            L30:
                r5 = move-exception
                goto L90
            L33:
                r5 = move-exception
                goto L90
            L36:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r2.<init>(r5)     // Catch: java.lang.Throwable -> L58
                Oooo00O.o00OOO0 r5 = p022Oooo00O.o00OOO0.this     // Catch: java.lang.Throwable -> L56
                Oooo00O.o00OOO0$OooO0o r5 = r5.f639OooOO0o     // Catch: java.lang.Throwable -> L54
                r2.append(r5)     // Catch: java.lang.Throwable -> L52
                java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L50
                r0.<init>(r5)     // Catch: java.lang.Throwable -> L4e
                throw r0     // Catch: java.lang.Throwable -> L4c
            L4c:
                r5 = move-exception
                goto L90
            L4e:
                r5 = move-exception
                goto L90
            L50:
                r5 = move-exception
                goto L90
            L52:
                r5 = move-exception
                goto L90
            L54:
                r5 = move-exception
                goto L90
            L56:
                r5 = move-exception
                goto L90
            L58:
                r5 = move-exception
                goto L90
            L5a:
                r5 = move-exception
                goto L90
            L5c:
                r5 = move-exception
                goto L90
            L5e:
                java.lang.String r5 = "CaptureSession"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L81
                Oooo00O.o00OOO0 r0 = p022Oooo00O.o00OOO0.this     // Catch: java.lang.Throwable -> L7f
                Oooo00O.o00OOO0$OooO0o r0 = r0.f639OooOO0o     // Catch: java.lang.Throwable -> L7d
                r2.append(r0)     // Catch: java.lang.Throwable -> L7b
                java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L79
                p028Oooo0oO.o00O0O0.OooO0O0(r5, r0)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L75
                return
            L75:
                r5 = move-exception
                goto L90
            L77:
                r5 = move-exception
                goto L90
            L79:
                r5 = move-exception
                goto L90
            L7b:
                r5 = move-exception
                goto L90
            L7d:
                r5 = move-exception
                goto L90
            L7f:
                r5 = move-exception
                goto L90
            L81:
                r5 = move-exception
                goto L90
            L83:
                r5 = move-exception
                goto L90
            L85:
                r5 = move-exception
                goto L90
            L87:
                r5 = move-exception
                goto L90
            L89:
                r5 = move-exception
                goto L90
            L8b:
                r5 = move-exception
                goto L90
            L8d:
                r5 = move-exception
                goto L90
            L8f:
                r5 = move-exception
            L90:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L92
                throw r5
            L92:
                r5 = move-exception
                goto L90
            */
            throw new UnsupportedOperationException("Method not decompiled: Oooo00O.o00OOO0.OooO.OooOOO0(Oooo00O.o0oO0O0o):void");
        }

        @Override // Oooo00O.o0oO0O0o.OooO00o
        public final void OooOOOO(@NonNull o0O0OOOo o0o0oooo) {
            synchronized (o00OOO0.this.f629OooO00o) {
                try {
                    if (OooO0OO.f648OooO00o[o00OOO0.this.f639OooOO0o.ordinal()] == 1) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + o00OOO0.this.f639OooOO0o);
                    }
                    o00O0O0.OooO00o("CaptureSession", "CameraCaptureSession.onReady() " + o00OOO0.this.f639OooOO0o);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0058 */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // Oooo00O.o0oO0O0o.OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooOOOo(@NonNull o0oO0O0o o0oo0o0o2) throws Throwable {
            synchronized (o00OOO0.this.f629OooO00o) {
                try {
                    try {
                        try {
                            if (o00OOO0.this.f639OooOO0o != OooO0o.UNINITIALIZED) {
                                try {
                                    o00O0O0.OooO00o("CaptureSession", "onSessionFinished()");
                                    try {
                                        try {
                                            o00OOO0.this.OooO();
                                            try {
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } else {
                                try {
                                    try {
                                        try {
                                            StringBuilder sb = new StringBuilder("onSessionFinished() should not be possible in state: ");
                                            try {
                                                try {
                                                    try {
                                                        sb.append(o00OOO0.this.f639OooOO0o);
                                                        try {
                                                            try {
                                                                try {
                                                                    throw new IllegalStateException(sb.toString());
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                        }
                                                    } catch (Throwable th8) {
                                                        th = th8;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                }
                            }
                        } catch (Throwable th14) {
                            th = th14;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                    }
                } catch (Throwable th16) {
                    th = th16;
                }
                while (true) {
                    throw th;
                }
            }
        }
    }

    public class OooO00o extends CameraCaptureSession.CaptureCallback {
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        }
    }

    public class OooO0O0 implements OooOOO0<Void> {
        public OooO0O0() {
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            synchronized (o00OOO0.this.f629OooO00o) {
                try {
                    o00OOO0.this.f634OooO0o0.f886OooO00o.stop();
                    int i = OooO0OO.f648OooO00o[o00OOO0.this.f639OooOO0o.ordinal()];
                    if ((i == 4 || i == 6 || i == 7) && !(th instanceof CancellationException)) {
                        o00O0O0.OooO("CaptureSession", "Opening session with fail " + o00OOO0.this.f639OooOO0o, th);
                        o00OOO0.this.OooO();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p030OoooO.OooOOO0
        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f648OooO00o;

        static {
            int[] iArr = new int[OooO0o.values().length];
            f648OooO00o = iArr;
            try {
                iArr[OooO0o.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f648OooO00o[OooO0o.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f648OooO00o[OooO0o.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f648OooO00o[OooO0o.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f648OooO00o[OooO0o.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f648OooO00o[OooO0o.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f648OooO00o[OooO0o.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f648OooO00o[OooO0o.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum OooO0o {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    public o00OOO0(@NonNull Oooo0.OooO oooO) {
        this.f639OooOO0o = OooO0o.UNINITIALIZED;
        this.f639OooOO0o = OooO0o.INITIALIZED;
        this.f644OooOOo = oooO;
    }

    @GuardedBy("mSessionLock")
    public static o000O000 OooO0oo(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback o000o001;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o000oOoO o000oooo2 = (o000oOoO) it.next();
            if (o000oooo2 == null) {
                o000o001 = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                o00OO0OO.OooO00o(o000oooo2, arrayList2);
                o000o001 = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new o000O000(arrayList2);
            }
            arrayList.add(o000o001);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new o000O000(arrayList);
    }

    @NonNull
    public static o00O00O OooOOO0(ArrayList arrayList) {
        o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Config config = ((o000000O) it.next()).f3648OooO0O0;
            for (Config.OooO00o<?> oooO00o : config.OooO0oo()) {
                Object objOooO0O0 = null;
                Object objOooOoO = config.OooOoO(oooO00o, null);
                if (o00o00oOooo0OO.OooO0o0(oooO00o)) {
                    try {
                        objOooO0O0 = o00o00oOooo0OO.OooO0O0(oooO00o);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (!Objects.equals(objOooO0O0, objOooOoO)) {
                        o00O0O0.OooO00o("CaptureSession", "Detect conflicting option " + oooO00o.OooO0O0() + " : " + objOooOoO + " != " + objOooO0O0);
                    }
                } else {
                    o00o00oOooo0OO.Oooo0oO(oooO00o, objOooOoO);
                }
            }
        }
        return o00o00oOooo0OO;
    }

    @GuardedBy("mSessionLock")
    public final void OooO() {
        OooO0o oooO0o = this.f639OooOO0o;
        OooO0o oooO0o2 = OooO0o.RELEASED;
        if (oooO0o == oooO0o2) {
            o00O0O0.OooO00o("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f639OooOO0o = oooO0o2;
        this.f633OooO0o = null;
        o00O000.OooO00o<Void> oooO00o = this.f640OooOOO;
        if (oooO00o != null) {
            oooO00o.OooO0O0(null);
            this.f640OooOOO = null;
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<Void> OooO00o(@NonNull final SessionConfig sessionConfig, @NonNull final CameraDevice cameraDevice, @NonNull o0oOo0O0 o0ooo0o1) {
        synchronized (this.f629OooO00o) {
            try {
                if (OooO0OO.f648OooO00o[this.f639OooOO0o.ordinal()] != 2) {
                    o00O0O0.OooO0O0("CaptureSession", "Open not allowed in state: " + this.f639OooOO0o);
                    return new Oooo0.OooO00o(new IllegalStateException("open() should not allow the state: " + this.f639OooOO0o));
                }
                this.f639OooOO0o = OooO0o.GET_SURFACE;
                ArrayList arrayList = new ArrayList(sessionConfig.OooO0O0());
                this.f638OooOO0O = arrayList;
                this.f634OooO0o0 = o0ooo0o1;
                OooOOO oooOOOOooO0OO = OooOOO.OooO00o(o0ooo0o1.f886OooO00o.OooO0o(arrayList)).OooO0OO(new OooOO0() { // from class: Oooo00O.o00OO
                    /* JADX WARN: Code duplicated, block: B:66:0x01db A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:4:0x000f, B:11:0x0025, B:12:0x003d, B:16:0x0043, B:17:0x004a, B:19:0x0050, B:20:0x0066, B:21:0x00ba, B:23:0x00c0, B:24:0x00ca, B:25:0x00d3, B:27:0x00d9, B:28:0x00e3, B:29:0x00ee, B:31:0x00f4, B:32:0x0100, B:33:0x0116, B:35:0x011c, B:37:0x0134, B:38:0x0149, B:39:0x014d, B:40:0x015b, B:42:0x0161, B:45:0x0174, B:46:0x0181, B:48:0x019b, B:50:0x019f, B:51:0x01a8, B:56:0x01c0, B:60:0x01c8, B:61:0x01d2, B:54:0x01af, B:63:0x01d4, B:64:0x01d9, B:66:0x01db, B:67:0x01f3), top: B:71:0x000f, inners: #1 }] */
                    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01db, please report this as an issue */
                    @Override // p030OoooO.OooOO0
                    public final OooO00o apply(Object obj) {
                        OooO00o<Void> oooO00o;
                        InputConfiguration inputConfiguration;
                        o00OOO0 o00ooo1 = this.f623OooO00o;
                        SessionConfig sessionConfig2 = sessionConfig;
                        CameraDevice cameraDevice2 = cameraDevice;
                        List list = (List) obj;
                        synchronized (o00ooo1.f629OooO00o) {
                            try {
                                int i = o00OOO0.OooO0OO.f648OooO00o[o00ooo1.f639OooOO0o.ordinal()];
                                if (i == 1 || i == 2) {
                                    oooO00o = new Oooo0.OooO00o<>(new IllegalStateException("openCaptureSession() should not be possible in state: " + o00ooo1.f639OooOO0o));
                                } else if (i == 3) {
                                    o00ooo1.f637OooOO0.clear();
                                    for (int i2 = 0; i2 < list.size(); i2++) {
                                        o00ooo1.f637OooOO0.put(o00ooo1.f638OooOO0O.get(i2), (Surface) list.get(i2));
                                    }
                                    o00ooo1.f639OooOO0o = o00OOO0.OooO0o.OPENING;
                                    o00O0O0.OooO00o("CaptureSession", "Opening capture session.");
                                    o0O0oo00 o0o0oo00 = new o0O0oo00(Arrays.asList(o00ooo1.f632OooO0Oo, new o0O0oo00.OooO00o(sessionConfig2.f3620OooO0OO)));
                                    Config config = sessionConfig2.f3622OooO0o.f3648OooO0O0;
                                    Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(config);
                                    OooO0OO oooO0OO = (OooO0OO) config.OooOoO(Oooo000.OooO00o.f431Oooo0OO, new OooO0OO(new OooO0O0[0]));
                                    o00ooo1.f628OooO = oooO0OO;
                                    oooO0OO.getClass();
                                    List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(oooO0OO.f3721OooO00o));
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = listUnmodifiableList.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add((OooO0O0) it.next());
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        ((OooO0O0) it2.next()).getClass();
                                    }
                                    o000000O.OooO00o oooO00o3 = new o000000O.OooO00o(sessionConfig2.f3622OooO0o);
                                    Iterator it3 = arrayList3.iterator();
                                    while (it3.hasNext()) {
                                        oooO00o3.OooO0OO(((o000000O) it3.next()).f3648OooO0O0);
                                    }
                                    ArrayList<Oooo0.OooOOO> arrayList4 = new ArrayList();
                                    CaptureRequest captureRequestBuild = null;
                                    String str = (String) oooO00o2.f1097OooOooo.OooOoO(Oooo000.OooO00o.f432Oooo0o, null);
                                    for (SessionConfig.OooO oooO : sessionConfig2.f3618OooO00o) {
                                        Oooo0.OooOOO oooOOOOooOO0 = o00ooo1.OooOO0(oooO, o00ooo1.f637OooOO0, str);
                                        if (o00ooo1.f642OooOOOO.containsKey(oooO.OooO0o0())) {
                                            oooOOOOooOO0.f406OooO00o.OooO00o(o00ooo1.f642OooOOOO.get(oooO.OooO0o0()).longValue());
                                        }
                                        arrayList4.add(oooOOOOooOO0);
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Oooo0.OooOOO oooOOO : arrayList4) {
                                        if (!arrayList5.contains(oooOOO.f406OooO00o.getSurface())) {
                                            arrayList5.add(oooOOO.f406OooO00o.getSurface());
                                            arrayList6.add(oooOOO);
                                        }
                                    }
                                    o0O0OOOo o0o0oooo = (o0O0OOOo) o00ooo1.f634OooO0o0.f886OooO00o;
                                    o0o0oooo.f763OooO0o = o0o0oo00;
                                    SessionConfigurationCompat sessionConfigurationCompat = new SessionConfigurationCompat(arrayList6, o0o0oooo.f762OooO0Oo, new oo0OOoo(o0o0oooo));
                                    if (sessionConfig2.f3622OooO0o.f3649OooO0OO == 5 && (inputConfiguration = sessionConfig2.f3624OooO0oO) != null) {
                                        sessionConfigurationCompat.f3386OooO00o.OooO0o(Oooo0.OooOOO0.OooO00o(inputConfiguration));
                                    }
                                    try {
                                        o000000O o000000oOooO0Oo = oooO00o3.OooO0Oo();
                                        if (cameraDevice2 != null) {
                                            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice2.createCaptureRequest(o000000oOooO0Oo.f3649OooO0OO);
                                            oOO00O.OooO00o(builderCreateCaptureRequest, o000000oOooO0Oo.f3648OooO0O0);
                                            captureRequestBuild = builderCreateCaptureRequest.build();
                                        }
                                        if (captureRequestBuild != null) {
                                            sessionConfigurationCompat.f3386OooO00o.OooO0oo(captureRequestBuild);
                                        }
                                        oooO00o = o00ooo1.f634OooO0o0.f886OooO00o.OooO00o(cameraDevice2, sessionConfigurationCompat, o00ooo1.f638OooOO0O);
                                    } catch (CameraAccessException e) {
                                        oooO00o = new Oooo0.OooO00o<>(e);
                                    }
                                } else if (i != 5) {
                                    oooO00o = new Oooo0.OooO00o<>(new CancellationException("openCaptureSession() not execute in state: " + o00ooo1.f639OooOO0o));
                                } else {
                                    oooO00o = new Oooo0.OooO00o<>(new IllegalStateException("openCaptureSession() should not be possible in state: " + o00ooo1.f639OooOO0o));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return oooO00o;
                    }
                }, ((o0O0OOOo) this.f634OooO0o0.f886OooO00o).f762OooO0Oo);
                oooOOOOooO0OO.OooO(new OooOo00.OooO0O0(oooOOOOooO0OO, new OooO0O0()), ((o0O0OOOo) this.f634OooO0o0.f886OooO00o).f762OooO0Oo);
                return OooOo00.OooO0o0(oooOOOOooO0OO);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void OooO0O0(@NonNull List<o000000O> list) {
        synchronized (this.f629OooO00o) {
            try {
                switch (OooO0OO.f648OooO00o[this.f639OooOO0o.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f639OooOO0o);
                    case 2:
                    case 3:
                    case 4:
                        this.f630OooO0O0.addAll(list);
                        break;
                    case 5:
                        this.f630OooO0O0.addAll(list);
                        ArrayList arrayList = this.f630OooO0O0;
                        if (!arrayList.isEmpty()) {
                            try {
                                OooOO0O(arrayList);
                                arrayList.clear();
                            } catch (Throwable th) {
                                arrayList.clear();
                                throw th;
                            }
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    default:
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void OooO0OO() {
        ArrayList arrayList;
        synchronized (this.f629OooO00o) {
            if (this.f630OooO0O0.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.f630OooO0O0);
                this.f630OooO0O0.clear();
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<o000oOoO> it2 = ((o000000O) it.next()).f3652OooO0o0.iterator();
                while (it2.hasNext()) {
                    it2.next().OooO00o();
                }
            }
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void OooO0Oo(@NonNull HashMap map) {
        synchronized (this.f629OooO00o) {
            this.f642OooOOOO = map;
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    @Nullable
    public final SessionConfig OooO0o() {
        SessionConfig sessionConfig;
        synchronized (this.f629OooO00o) {
            sessionConfig = this.f635OooO0oO;
        }
        return sessionConfig;
    }

    @Override // p022Oooo00O.o0o0Oo
    @NonNull
    public final List<o000000O> OooO0o0() {
        List<o000000O> listUnmodifiableList;
        synchronized (this.f629OooO00o) {
            listUnmodifiableList = Collections.unmodifiableList(this.f630OooO0O0);
        }
        return listUnmodifiableList;
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void OooO0oO(@Nullable SessionConfig sessionConfig) {
        synchronized (this.f629OooO00o) {
            try {
                switch (OooO0OO.f648OooO00o[this.f639OooOO0o.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f639OooOO0o);
                    case 2:
                    case 3:
                    case 4:
                        this.f635OooO0oO = sessionConfig;
                        break;
                    case 5:
                        this.f635OooO0oO = sessionConfig;
                        if (sessionConfig == null) {
                            return;
                        }
                        if (!this.f637OooOO0.keySet().containsAll(sessionConfig.OooO0O0())) {
                            o00O0O0.OooO0O0("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            o00O0O0.OooO00o("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            OooOO0o(this.f635OooO0oO);
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    @NonNull
    public final Oooo0.OooOOO OooOO0(@NonNull SessionConfig.OooO oooO, @NonNull HashMap map, @Nullable String str) {
        long jLongValue;
        Surface surface = (Surface) map.get(oooO.OooO0o0());
        o000OO.OooOOO0.OooO0o0(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        Oooo0.OooOOO oooOOO = new Oooo0.OooOOO(oooO.OooO0o(), surface);
        Oooo0.OooOOO.OooO00o oooO00o = oooOOO.f406OooO00o;
        if (str != null) {
            oooO00o.OooO0Oo(str);
        } else {
            oooO00o.OooO0Oo(oooO.OooO0OO());
        }
        if (!oooO.OooO0Oo().isEmpty()) {
            oooO00o.OooO0o();
            Iterator<DeferrableSurface> it = oooO.OooO0Oo().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get(it.next());
                o000OO.OooOOO0.OooO0o0(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                oooO00o.OooO0O0(surface2);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            Oooo0.OooO oooO2 = this.f644OooOOo;
            oooO2.getClass();
            o000OO.OooOOO0.OooO0o("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", i >= 33);
            DynamicRangeProfiles dynamicRangeProfilesOooO0O0 = oooO2.f400OooO00o.OooO0O0();
            if (dynamicRangeProfilesOooO0O0 == null) {
                jLongValue = 1;
            } else {
                DynamicRange dynamicRangeOooO0O0 = oooO.OooO0O0();
                Long lOooO00o = Oooo0.OooO0O0.OooO00o(dynamicRangeOooO0O0, dynamicRangeProfilesOooO0O0);
                if (lOooO00o == null) {
                    o00O0O0.OooO0O0("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRangeOooO0O0);
                    jLongValue = 1;
                } else {
                    jLongValue = lOooO00o.longValue();
                }
            }
        } else {
            jLongValue = 1;
        }
        oooO00o.OooO0OO(jLongValue);
        return oooOOO;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooOO0O(ArrayList arrayList) {
        boolean z;
        o00Oo0 o00oo1;
        synchronized (this.f629OooO00o) {
            if (this.f639OooOO0o != OooO0o.OPENED) {
                o00O0O0.OooO00o("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                return;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            try {
                o00O0O0O o00o0o0o2 = new o00O0O0O();
                ArrayList arrayList2 = new ArrayList();
                o00O0O0.OooO00o("CaptureSession", "Issuing capture request.");
                Iterator it = arrayList.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    o000000O o000000o2 = (o000000O) it.next();
                    if (o000000o2.OooO00o().isEmpty()) {
                        o00O0O0.OooO00o("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<DeferrableSurface> it2 = o000000o2.OooO00o().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = true;
                                break;
                            }
                            DeferrableSurface next = it2.next();
                            if (!this.f637OooOO0.containsKey(next)) {
                                o00O0O0.OooO00o("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            if (o000000o2.f3649OooO0OO == 2) {
                                z2 = true;
                            }
                            o000000O.OooO00o oooO00o = new o000000O.OooO00o(o000000o2);
                            if (o000000o2.f3649OooO0OO == 5 && (o00oo1 = o000000o2.f3654OooO0oo) != null) {
                                oooO00o.f3662OooO0oo = o00oo1;
                            }
                            SessionConfig sessionConfig = this.f635OooO0oO;
                            if (sessionConfig != null) {
                                oooO00o.OooO0OO(sessionConfig.f3622OooO0o.f3648OooO0O0);
                            }
                            oooO00o.OooO0OO(this.f636OooO0oo);
                            oooO00o.OooO0OO(o000000o2.f3648OooO0O0);
                            CaptureRequest captureRequestOooO0O0 = oOO00O.OooO0O0(oooO00o.OooO0Oo(), this.f633OooO0o.getDevice(), this.f637OooOO0);
                            if (captureRequestOooO0O0 == null) {
                                o00O0O0.OooO00o("CaptureSession", "Skipping issuing request without surface.");
                                return;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<o000oOoO> it3 = o000000o2.f3652OooO0o0.iterator();
                            while (it3.hasNext()) {
                                o00OO0OO.OooO00o(it3.next(), arrayList3);
                            }
                            o00o0o0o2.OooO00o(captureRequestOooO0O0, arrayList3);
                            arrayList2.add(captureRequestOooO0O0);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    o00O0O0.OooO00o("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                    return;
                }
                if (this.f643OooOOOo.OooO00o(arrayList2, z2)) {
                    this.f633OooO0o.OooO0OO();
                    o00o0o0o2.f620OooO0O0 = new oo0O(this);
                }
                if (this.f645OooOOo0.OooO0O0(arrayList2, z2)) {
                    o00o0o0o2.OooO00o((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new o00OOO0O(this)));
                }
                this.f633OooO0o.OooO0oo(arrayList2, o00o0o0o2);
            } catch (CameraAccessException e) {
                o00O0O0.OooO0O0("CaptureSession", "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
        }
    }

    public final void OooOO0o(@Nullable SessionConfig sessionConfig) {
        synchronized (this.f629OooO00o) {
            if (sessionConfig == null) {
                o00O0O0.OooO00o("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            if (this.f639OooOO0o != OooO0o.OPENED) {
                o00O0O0.OooO00o("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return;
            }
            o000000O o000000o2 = sessionConfig.f3622OooO0o;
            if (o000000o2.OooO00o().isEmpty()) {
                o00O0O0.OooO00o("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f633OooO0o.OooO0OO();
                } catch (CameraAccessException e) {
                    o00O0O0.OooO0O0("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                o00O0O0.OooO00o("CaptureSession", "Issuing request for session.");
                o000000O.OooO00o oooO00o = new o000000O.OooO00o(o000000o2);
                Oooo000.OooO0OO oooO0OO = this.f628OooO;
                oooO0OO.getClass();
                List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(oooO0OO.f3721OooO00o));
                ArrayList arrayList = new ArrayList();
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add((Oooo000.OooO0O0) it.next());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Oooo000.OooO0O0) it2.next()).getClass();
                }
                o00O00O o00o00oOooOOO0 = OooOOO0(arrayList2);
                this.f636OooO0oo = o00o00oOooOOO0;
                oooO00o.OooO0OO(o00o00oOooOOO0);
                CaptureRequest captureRequestOooO0O0 = oOO00O.OooO0O0(oooO00o.OooO0Oo(), this.f633OooO0o.getDevice(), this.f637OooOO0);
                if (captureRequestOooO0O0 == null) {
                    o00O0O0.OooO00o("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                } else {
                    this.f633OooO0o.OooO0o0(captureRequestOooO0O0, OooO0oo(o000000o2.f3652OooO0o0, this.f631OooO0OO));
                    return;
                }
            } catch (CameraAccessException e2) {
                o00O0O0.OooO0O0("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return;
            }
            throw th;
        }
    }

    @GuardedBy("mSessionLock")
    public final ArrayList OooOOO(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o000000O o000000o2 = (o000000O) it.next();
            HashSet hashSet = new HashSet();
            o00O00O.Oooo0OO();
            Range<Integer> range = o00OO0O0.f3743OooO00o;
            ArrayList arrayList3 = new ArrayList();
            o00O00OO.OooO0OO();
            hashSet.addAll(o000000o2.f3647OooO00o);
            o00O00O o00o00oOooo0o0 = o00O00O.Oooo0o0(o000000o2.f3648OooO0O0);
            Range<Integer> range2 = o000000o2.f3650OooO0Oo;
            arrayList3.addAll(o000000o2.f3652OooO0o0);
            boolean z = o000000o2.f3651OooO0o;
            ArrayMap arrayMap = new ArrayMap();
            o00OO o00oo2 = o000000o2.f3653OooO0oO;
            for (String str : o00oo2.OooO0O0()) {
                arrayMap.put(str, o00oo2.OooO00o(str));
            }
            o00O00OO o00o00oo2 = new o00O00OO(arrayMap);
            Iterator<DeferrableSurface> it2 = this.f635OooO0oO.f3622OooO0o.OooO00o().iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next());
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            o00O0 o00o0Oooo0O0 = o00O0.Oooo0O0(o00o00oOooo0o0);
            ArrayList arrayList5 = new ArrayList(arrayList3);
            o00OO o00oo3 = o00OO.f3727OooO0O0;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String str2 : o00o00oo2.OooO0O0()) {
                arrayMap2.put(str2, o00o00oo2.OooO00o(str2));
            }
            arrayList2.add(new o000000O(arrayList4, o00o0Oooo0O0, 1, range2, arrayList5, z, new o00OO(arrayMap2), null));
        }
        return arrayList2;
    }

    @Override // p022Oooo00O.o0o0Oo
    public final void close() {
        synchronized (this.f629OooO00o) {
            try {
                int i = OooO0OO.f648OooO00o[this.f639OooOO0o.ordinal()];
                if (i == 1) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f639OooOO0o);
                }
                if (i == 2) {
                    this.f639OooOO0o = OooO0o.RELEASED;
                } else if (i == 3) {
                    o000OO.OooOOO0.OooO0o0(this.f634OooO0o0, "The Opener shouldn't null in state:" + this.f639OooOO0o);
                    this.f634OooO0o0.f886OooO00o.stop();
                    this.f639OooOO0o = OooO0o.RELEASED;
                } else if (i == 4) {
                    o000OO.OooOOO0.OooO0o0(this.f634OooO0o0, "The Opener shouldn't null in state:" + this.f639OooOO0o);
                    this.f634OooO0o0.f886OooO00o.stop();
                    this.f639OooOO0o = OooO0o.CLOSED;
                    this.f635OooO0oO = null;
                } else if (i == 5) {
                    if (this.f635OooO0oO != null) {
                        Oooo000.OooO0OO oooO0OO = this.f628OooO;
                        oooO0OO.getClass();
                        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(oooO0OO.f3721OooO00o));
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listUnmodifiableList.iterator();
                        while (it.hasNext()) {
                            arrayList.add((Oooo000.OooO0O0) it.next());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((Oooo000.OooO0O0) it2.next()).getClass();
                        }
                        if (!arrayList2.isEmpty()) {
                            try {
                                OooO0O0(OooOOO(arrayList2));
                            } catch (IllegalStateException e) {
                                o00O0O0.OooO0OO("CaptureSession", "Unable to issue the request before close the capture session", e);
                            }
                        }
                    }
                    o000OO.OooOOO0.OooO0o0(this.f634OooO0o0, "The Opener shouldn't null in state:" + this.f639OooOO0o);
                    this.f634OooO0o0.f886OooO00o.stop();
                    this.f639OooOO0o = OooO0o.CLOSED;
                    this.f635OooO0oO = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p022Oooo00O.o0o0Oo
    @NonNull
    public final com.google.common.util.concurrent.OooO00o release() {
        synchronized (this.f629OooO00o) {
            try {
                switch (OooO0OO.f648OooO00o[this.f639OooOO0o.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("release() should not be possible in state: " + this.f639OooOO0o);
                    case 3:
                        o000OO.OooOOO0.OooO0o0(this.f634OooO0o0, "The Opener shouldn't null in state:" + this.f639OooOO0o);
                        this.f634OooO0o0.f886OooO00o.stop();
                    case 2:
                        this.f639OooOO0o = OooO0o.RELEASED;
                        return OooOo00.OooO0Oo(null);
                    case 5:
                    case 6:
                        o0oO0O0o o0oo0o0o2 = this.f633OooO0o;
                        if (o0oo0o0o2 != null) {
                            o0oo0o0o2.close();
                            break;
                        }
                    case 4:
                        Oooo000.OooO0OO oooO0OO = this.f628OooO;
                        oooO0OO.getClass();
                        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(oooO0OO.f3721OooO00o));
                        ArrayList arrayList = new ArrayList();
                        Iterator it = listUnmodifiableList.iterator();
                        while (it.hasNext()) {
                            arrayList.add((Oooo000.OooO0O0) it.next());
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((Oooo000.OooO0O0) it2.next()).getClass();
                        }
                        this.f639OooOO0o = OooO0o.RELEASING;
                        o000OO.OooOOO0.OooO0o0(this.f634OooO0o0, "The Opener shouldn't null in state:" + this.f639OooOO0o);
                        if (this.f634OooO0o0.f886OooO00o.stop()) {
                            OooO();
                            return OooOo00.OooO0Oo(null);
                        }
                    case 7:
                        if (this.f641OooOOO0 == null) {
                            this.f641OooOOO0 = o00O000.OooO00o(new o00OOO00(this));
                        }
                        return this.f641OooOOO0;
                    default:
                        return OooOo00.OooO0Oo(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
