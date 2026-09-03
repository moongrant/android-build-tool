package p023Oooo00o;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.google.common.util.concurrent.OooO00o;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import p026Oooo0o.OooOO0;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOo00;
import p030OoooO.Oooo0;
import p033OoooO0O.o0O0O00;
import p039OoooOoo.o0;
import p039OoooOoo.o00O;
import p039OoooOoo.o00O0O00;
import p039OoooOoo.o0O00000;
import p039OoooOoo.o0O000Oo;
import p039OoooOoo.o0OoOoOo;
import p041Ooooo0o.o00000OO;
import p045Oooooo.o0000Ooo;
import p045Oooooo.o000OOo0;
import p045Oooooo.o00O0O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO0OOo0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f989OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f990OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f991OooO0oO;

    public /* synthetic */ oO0OOo0o(int i, Object obj, Object obj2, Object obj3) {
        this.f988OooO0Oo = i;
        this.f990OooO0o0 = obj;
        this.f989OooO0o = obj2;
        this.f991OooO0oO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        OooO00o oooO00oOooO0o0;
        int i = this.f988OooO0Oo;
        Object obj = this.f991OooO0oO;
        Object obj2 = this.f989OooO0o;
        Object obj3 = this.f990OooO0o0;
        switch (i) {
            case 0:
                o0OOOO00.OooO00o(((oO00000.OooO0OO) obj3).f924OooO00o, (CameraCaptureSession) obj2, (Surface) obj);
                return;
            default:
                OooOO0O oooOO0O = (OooOO0O) obj3;
                final SurfaceRequest surfaceRequest = (SurfaceRequest) obj2;
                final Timebase timebase = (Timebase) obj;
                Set<OooOO0O.OooOOO> set = OooOO0O.f3912Ooooo00;
                oooOO0O.getClass();
                if (!surfaceRequest.OooO00o()) {
                    o0O000Oo o0o000oo2 = oooOO0O.f3967OoooOo0;
                    o0o000oo2.getClass();
                    int[] iArr = o0O000Oo.OooO00o.f1741OooO00o;
                    int i2 = iArr[o0o000oo2.f1728OooO.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2 || i2 == 3) {
                            z = o0o000oo2.f1733OooO0o == surfaceRequest;
                        } else if (i2 != 4 && i2 != 5) {
                            throw new IllegalStateException("State " + o0o000oo2.f1728OooO + " is not handled");
                        }
                    }
                    if (!z || oooOO0O.OooOOO0()) {
                        Executor executor = oooOO0O.f3920OooO0O0;
                        o00O0O00 o00o0o01 = oooOO0O.f3922OooO0Oo;
                        o0O0O00 o0o0o00 = oooOO0O.f3921OooO0OO;
                        final o0O000Oo o0o000oo3 = new o0O000Oo(o00o0o01, o0o0o00, executor);
                        final MediaSpec mediaSpec = (MediaSpec) OooOO0O.OooOO0(oooOO0O.f3944OooOoOO);
                        final o00000OO o00000oo2 = oooOO0O.f3934OooOOo;
                        if (iArr[o0o000oo3.f1728OooO.ordinal()] != 1) {
                            oooO00oOooO0o0 = new Oooo0.OooO00o(new IllegalStateException("configure() shouldn't be called in " + o0o000oo3.f1728OooO));
                        } else {
                            o0o000oo3.f1728OooO = o0O000Oo.OooO0O0.INITIALIZING;
                            o0o000oo3.f1733OooO0o = surfaceRequest;
                            o00O0O0.OooO00o("VideoEncoderSession", "Create VideoEncoderSession: " + o0o000oo3);
                            o0o000oo3.f1737OooOO0 = o00O000.OooO00o(new o0(o0o000oo3));
                            o0o000oo3.f1739OooOO0o = o00O000.OooO00o(new o0O00000(o0o000oo3));
                            o00O000.OooO0o oooO0oOooO00o = o00O000.OooO00o(new o00O000.OooO0OO() { // from class: OoooOoo.o0O0000O
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r1v5, types: [OoooOoo.o0O000] */
                                @Override // o0ooOO0.o00O000.OooO0OO
                                public final Object OooO0o0(final o00O000.OooO00o oooO00o) {
                                    Timebase timebase2 = timebase;
                                    final o0O000Oo o0o000oo4 = o0o000oo3;
                                    o0o000oo4.getClass();
                                    final SurfaceRequest surfaceRequest2 = surfaceRequest;
                                    DynamicRange dynamicRange = surfaceRequest2.f3506OooO0OO;
                                    o00000OO o00000oo3 = o00000oo2;
                                    MediaSpec mediaSpec2 = mediaSpec;
                                    o000OOo0 o000ooo0OooO0O0 = p046Oooooo0.o0O0000O.OooO0O0(p046Oooooo0.o0O0000O.OooO0OO(mediaSpec2, dynamicRange, o00000oo3), timebase2, mediaSpec2.OooO0Oo(), surfaceRequest2.f3505OooO0O0, dynamicRange, surfaceRequest2.f3507OooO0Oo);
                                    try {
                                        o00O0O00 o00o0o02 = o0o000oo4.f1731OooO0OO;
                                        Executor executor2 = o0o000oo4.f1729OooO00o;
                                        o00o0o02.getClass();
                                        o0000Ooo o0000ooo = new o0000Ooo(executor2, o000ooo0OooO0O0);
                                        o0o000oo4.f1732OooO0Oo = o0000ooo;
                                        o00O0O.OooO0O0 oooO0O0 = o0000ooo.f1902OooO0o;
                                        if (oooO0O0 instanceof o00O0O.OooO0OO) {
                                            ((o00O0O.OooO0OO) oooO0O0).OooO0o0(o0o000oo4.f1730OooO0O0, new o00O0O.OooO0OO.OooO00o() { // from class: OoooOoo.o0O000
                                                @Override // Oooooo.o00O0O.OooO0OO.OooO00o
                                                public final void OooO00o(Surface surface) {
                                                    Executor executor3;
                                                    final o0O000Oo o0o000oo5 = o0o000oo4;
                                                    o0o000oo5.getClass();
                                                    int i3 = o0O000Oo.OooO00o.f1741OooO00o[o0o000oo5.f1728OooO.ordinal()];
                                                    o00O000.OooO00o oooO00o2 = oooO00o;
                                                    int i4 = 1;
                                                    if (i3 != 1) {
                                                        if (i3 == 2) {
                                                            SurfaceRequest surfaceRequest3 = surfaceRequest2;
                                                            if (surfaceRequest3.OooO00o()) {
                                                                o00O0O0.OooO00o("VideoEncoderSession", "Not provide surface, " + Objects.toString(surfaceRequest3, "EMPTY") + " is already serviced.");
                                                                oooO00o2.OooO0O0(null);
                                                                o0o000oo5.OooO00o();
                                                                return;
                                                            }
                                                            o0o000oo5.f1734OooO0o0 = surface;
                                                            o00O0O0.OooO00o("VideoEncoderSession", "provide surface: " + surface);
                                                            surfaceRequest3.OooO0O0(surface, o0o000oo5.f1730OooO0O0, new o000OO.OooO00o() { // from class: OoooOoo.o0O000O
                                                                @Override // o000OO.OooO00o
                                                                public final void accept(Object obj4) {
                                                                    SurfaceRequest.Result result = (SurfaceRequest.Result) obj4;
                                                                    o0O000Oo o0o000oo6 = o0o000oo5;
                                                                    o0o000oo6.getClass();
                                                                    o00O0O0.OooO00o("VideoEncoderSession", "Surface can be closed: " + result.OooO0O0().hashCode());
                                                                    Surface surfaceOooO0O0 = result.OooO0O0();
                                                                    if (surfaceOooO0O0 != o0o000oo6.f1734OooO0o0) {
                                                                        surfaceOooO0O0.release();
                                                                        return;
                                                                    }
                                                                    o0o000oo6.f1734OooO0o0 = null;
                                                                    o0o000oo6.f1740OooOOO0.OooO0O0(o0o000oo6.f1732OooO0Oo);
                                                                    o0o000oo6.OooO00o();
                                                                }
                                                            });
                                                            o0o000oo5.f1728OooO = o0O000Oo.OooO0O0.READY;
                                                            oooO00o2.OooO0O0(o0o000oo5.f1732OooO0Oo);
                                                            return;
                                                        }
                                                        if (i3 == 3) {
                                                            if (o0o000oo5.f1736OooO0oo != null && (executor3 = o0o000oo5.f1735OooO0oO) != null) {
                                                                executor3.execute(new OooOO0(i4, o0o000oo5, surface));
                                                            }
                                                            o00O0O0.OooO0oo("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                                                            return;
                                                        }
                                                        if (i3 != 4 && i3 != 5) {
                                                            throw new IllegalStateException("State " + o0o000oo5.f1728OooO + " is not handled");
                                                        }
                                                    }
                                                    o00O0O0.OooO00o("VideoEncoderSession", "Not provide surface in " + o0o000oo5.f1728OooO);
                                                    oooO00o2.OooO0O0(null);
                                                }
                                            });
                                        } else {
                                            oooO00o.OooO0OO(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                                        }
                                    } catch (InvalidConfigException e) {
                                        o00O0O0.OooO0OO("VideoEncoderSession", "Unable to initialize video encoder.", e);
                                        oooO00o.OooO0OO(e);
                                    }
                                    return "ConfigureVideoEncoderFuture " + o0o000oo4;
                                }
                            });
                            oooO0oOooO00o.OooO(new OooOo00.OooO0O0(oooO0oOooO00o, new o0OoOoOo(o0o000oo3)), o0o000oo3.f1730OooO0O0);
                            oooO00oOooO0o0 = OooOo00.OooO0o0(oooO0oOooO00o);
                        }
                        oooOO0O.f3967OoooOo0 = o0o000oo3;
                        oooO00oOooO0o0.OooO(new OooOo00.OooO0O0(oooO00oOooO0o0, new o00O(oooOO0O, o0o000oo3)), o0o0o00);
                        return;
                    }
                }
                o00O0O0.OooO0oo("Recorder", "Ignore the SurfaceRequest " + surfaceRequest + " isServiced: " + surfaceRequest.OooO00o() + " VideoEncoderSession: " + oooOO0O.f3967OoooOo0 + " has been configured with a persistent in-progress recording.");
                return;
        }
    }
}
