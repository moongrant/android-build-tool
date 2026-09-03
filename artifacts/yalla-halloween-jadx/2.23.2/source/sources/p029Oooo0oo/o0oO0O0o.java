package p029Oooo0oo;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.OooOOO;
import androidx.camera.core.OooOo00;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o000O00O;
import androidx.camera.core.impl.o000O0O0;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOOOo;
import com.google.common.util.concurrent.OooOO0O;
import java.util.Objects;
import java.util.concurrent.Executor;
import o000OO.OooO00o;
import o000OO.OooOOO0;
import org.conscrypt.PSKKeyManager;
import p022Oooo00O.o00000;
import p022Oooo00O.o00000O0;
import p028Oooo0oO.o00O0;
import p030OoooO.OooOo;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p034OoooOO0.o0OOO0o;
import p034OoooOO0.oo000o;
import p037OoooOo0.o000O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0oO0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o000O00O f1309OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o000000O f1310OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final o0O00o00 f1311OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final o0OO0o f1312OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o0O00000 f1313OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o0O f1314OooO0o0;

    @MainThread
    public o0oO0O0o(@NonNull o000O00O o000o00o2, @NonNull Size size, @Nullable CameraEffect cameraEffect, boolean z) {
        OooO00o oooO00o;
        o000O0O0 o000o0o1;
        o0Oo0oo.OooO00o();
        this.f1309OooO00o = o000o00o2;
        o000o00o2.getClass();
        o000000O.OooO0O0 OooO0O1 = o00OOOOo.OooO0O0(o000o00o2);
        if (OooO0O1 == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + o0OOO0o.OooO00o(o000o00o2, o000o00o2.toString()));
        }
        o000000O.OooO00o oooO00o2 = new o000000O.OooO00o();
        OooO0O1.OooO00o(o000o00o2, oooO00o2);
        this.f1310OooO0O0 = oooO00o2.OooO0Oo();
        final o0O00o00 o0o00o01 = new o0O00o00();
        this.f1311OooO0OO = o0o00o01;
        final o0OO0o o0oo0o2 = new o0OO0o();
        this.f1312OooO0Oo = o0oo0o2;
        Executor executor = (Executor) ((o00O0O00) o000o00o2.getConfig()).OooOoO(oo000o.f1438OooO00o, o00oO0o.OooO0O0());
        Objects.requireNonNull(executor);
        if (cameraEffect != null) {
            OooOOO0.OooO00o(false);
            throw null;
        }
        final o0O o0o = new o0O(executor);
        this.f1314OooO0o0 = o0o;
        int iOooO0o = o000o00o2.OooO0o();
        Integer num = (Integer) ((o00O0O00) o000o00o2.getConfig()).OooOoO(o000O00O.f3692Oooo0, null);
        o0O00000 o0o00000 = new o0O00000(size, iOooO0o, num != null ? num.intValue() : PSKKeyManager.MAX_KEY_LENGTH_BYTES, z, (o00O0) ((o00O0O00) o000o00o2.getConfig()).OooOoO(o000O00O.f3696Oooo0O0, null), new o000O000(), new o000O000());
        this.f1313OooO0o = o0o00000;
        OooOOO0.OooO0o("CaptureNode does not support recreation yet.", o0o00o01.f1249OooO0o0 == null && o0o00o01.f1247OooO0OO == null);
        o0o00o01.f1249OooO0o0 = o0o00000;
        boolean z2 = !o0o00000.f1218OooO0o;
        o00O0 o00o1 = o0o00000.f1220OooO0oO;
        Size size2 = o0o00000.f1216OooO0OO;
        int i = o0o00000.f1217OooO0Oo;
        if (z2 && o00o1 == null) {
            OooOOO oooOOO = new OooOOO(size2.getWidth(), size2.getHeight(), i, 4);
            o0o00000.f1252OooO00o = oooOOO.f3452OooO0O0;
            o000o0o1 = oooOOO;
            oooO00o = new OooO00o() { // from class: Oooo0oo.o0O00O
                @Override // o000OO.OooO00o
                public final void accept(Object obj) {
                    o0o00o01.OooO0OO((o0OO000) obj);
                }
            };
        } else {
            final o0O0OOOo o0o0oooo = new o0O0OOOo(o00o1 != null ? o00o1.newInstance() : new p028Oooo0oO.o000O00O(ImageReader.newInstance(size2.getWidth(), size2.getHeight(), i, 4)));
            OooO00o oooO00o3 = new OooO00o() { // from class: Oooo0oo.o0O00OO
                @Override // o000OO.OooO00o
                public final void accept(Object obj) {
                    o0OO000 o0oo000 = (o0OO000) obj;
                    o0o00o01.OooO0OO(o0oo000);
                    o0O0OOOo o0o0oooo2 = o0o0oooo;
                    OooOOO0.OooO0o("Pending request should be null", o0o0oooo2.f1257OooO0O0 == null);
                    o0o0oooo2.f1257OooO0O0 = o0oo000;
                }
            };
            o000o0o1 = o0o0oooo;
            oooO00o = oooO00o3;
        }
        Surface surface = o000o0o1.getSurface();
        Objects.requireNonNull(surface);
        OooOOO0.OooO0o("The surface is already set.", o0o00000.f1253OooO0O0 == null);
        o0o00000.f1253OooO0O0 = new o000O(surface, size2, i);
        o0o00o01.f1247OooO0OO = new OooOo00(o000o0o1);
        o000o0o1.OooO0o(new o000O0O0.OooO00o() { // from class: Oooo0oo.o0O00OOO
            @Override // androidx.camera.core.impl.o000O0O0.OooO00o
            public final void OooO00o(o000O0O0 o000o0o2) throws Exception {
                o0O00o00 o0o00o02 = o0o00o01;
                o0o00o02.getClass();
                try {
                    androidx.camera.core.OooOOO0 oooOOO0OooO0O0 = o000o0o2.OooO0O0();
                    if (oooOOO0OooO0O0 != null) {
                        o0o00o02.OooO0O0(oooOOO0OooO0O0);
                    } else {
                        o0o00o02.OooO0Oo(new ImageCaptureException(null, "Failed to acquire latest image"));
                    }
                } catch (IllegalStateException e) {
                    o0o00o02.OooO0Oo(new ImageCaptureException(e, "Failed to acquire latest image"));
                }
            }
        }, o00oO0o.OooO0OO());
        o0o00000.f1221OooO0oo.f1527OooO00o = oooO00o;
        o0o00000.f1215OooO.f1527OooO00o = new OooO00o() { // from class: Oooo0oo.o0oO0Ooo
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                o0o00o01.OooO0Oo((ImageCaptureException) obj);
            }
        };
        o0O0000O o0o0000o2 = new o0O0000O(new o000O000(), new o000O000(), i, o0o00000.f1219OooO0o0);
        o0o00o01.f1248OooO0Oo = o0o0000o2;
        o0o0000o2.f1222OooO00o.f1527OooO00o = new OooO00o() { // from class: Oooo0oo.o0OO0O0
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                androidx.camera.core.OooOOO0 oooOOO0 = (androidx.camera.core.OooOOO0) obj;
                o0OO0o o0oo0o3 = o0oo0o2;
                o0oo0o3.getClass();
                o0Oo0oo.OooO00o();
                OooOOO0.OooO0o(null, o0oo0o3.f1287OooO00o != null);
                Object objOooO00o = oooOOO0.o00000Oo().OooO0O0().OooO00o(o0oo0o3.f1287OooO00o.f1279OooO0oO);
                Objects.requireNonNull(objOooO00o);
                OooOOO0.OooO0o(null, ((Integer) objOooO00o).intValue() == ((Integer) o0oo0o3.f1287OooO00o.f1280OooO0oo.get(0)).intValue());
                o0oo0o3.f1288OooO0O0.f1306OooO00o.accept(new o0O000Oo(o0oo0o3.f1287OooO00o, oooOOO0));
                o0oo0o3.f1287OooO00o = null;
            }
        };
        o0o0000o2.f1223OooO0O0.f1527OooO00o = new OooO00o() { // from class: Oooo0oo.o0OOooO0
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                o0OO000 o0oo000 = (o0OO000) obj;
                o0OO0o o0oo0o3 = o0oo0o2;
                o0oo0o3.getClass();
                o0Oo0oo.OooO00o();
                OooOOO0.OooO0o("Cannot handle multi-image capture.", o0oo000.f1280OooO0oo.size() == 1);
                OooOOO0.OooO0o("Already has an existing request.", o0oo0o3.f1287OooO00o == null);
                o0oo0o3.f1287OooO00o = o0oo000;
                o0OO0o00 o0oo0o01 = new o0OO0o00(o0oo0o3, o0oo000);
                o0ooOOo o0oooooOooO00o = o00oO0o.OooO00o();
                OooOO0O<Void> oooOO0O = o0oo000.f1272OooO;
                oooOO0O.OooO0oo(new OooOo.OooO0O0(oooOO0O, o0oo0o01), o0oooooOooO00o);
            }
        };
        o0OoOoOo o0oooooo = new o0OoOoOo(new o000O000(), o0o0000o2.f1224OooO0OO, o0o0000o2.f1225OooO0Oo);
        o0oo0o2.f1288OooO0O0 = o0oooooo;
        o0o.f1206OooO0O0 = o0oooooo;
        o0oooooo.f1306OooO00o.f1527OooO00o = new OooO00o() { // from class: Oooo0oo.o0O0o000
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                final o0O.OooO0O0 oooO0O0 = (o0O.OooO0O0) obj;
                final o0O o0o2 = o0o;
                o0o2.getClass();
                if (((oo0ooO) oooO0O0.OooO0O0().f1277OooO0o).f1325OooO0oO) {
                    return;
                }
                o0o2.f1205OooO00o.execute(new Runnable() { // from class: Oooo0oo.o0O0o00O
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        o0O o0o3 = o0o2;
                        o0o3.getClass();
                        o0O.OooO0O0 oooO0O1 = oooO0O0;
                        final o0OO000 o0oo000OooO0O0 = oooO0O1.OooO0O0();
                        try {
                            if (oooO0O1.OooO0O0().f1273OooO00o == null) {
                                final androidx.camera.core.OooOOO0 oooOOO0OooO0O0 = o0o3.OooO0O0(oooO0O1);
                                o00oO0o.OooO0OO().execute(new Runnable() { // from class: Oooo0oo.o0O0o0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        oo0ooO oo0ooo = (oo0ooO) o0oo000OooO0O0.f1277OooO0o;
                                        oo0ooo.getClass();
                                        o0Oo0oo.OooO00o();
                                        if (oo0ooo.f1325OooO0oO) {
                                            return;
                                        }
                                        OooOOO0.OooO0o("onImageCaptured() must be called before onFinalResult()", oo0ooo.f1321OooO0OO.isDone());
                                        oo0ooo.OooO00o();
                                        o0OOOO00 o0oooo01 = oo0ooo.f1319OooO00o;
                                        o0oooo01.OooO00o().execute(new o00000O0(1, o0oooo01, oooOOO0OooO0O0));
                                    }
                                });
                            } else {
                                final ImageCapture.OooOOO0 oooOOO0OooO0OO = o0o3.OooO0OO(oooO0O1);
                                o00oO0o.OooO0OO().execute(new Runnable() { // from class: Oooo0oo.o0oOo0O0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        oo0ooO oo0ooo = (oo0ooO) o0oo000OooO0O0.f1277OooO0o;
                                        oo0ooo.getClass();
                                        o0Oo0oo.OooO00o();
                                        if (oo0ooo.f1325OooO0oO) {
                                            return;
                                        }
                                        OooOOO0.OooO0o("onImageCaptured() must be called before onFinalResult()", oo0ooo.f1321OooO0OO.isDone());
                                        oo0ooo.OooO00o();
                                        o0OOOO00 o0oooo01 = oo0ooo.f1319OooO00o;
                                        o0oooo01.OooO00o().execute(new o00000(1, o0oooo01, oooOOO0OooO0OO));
                                    }
                                });
                            }
                        } catch (ImageCaptureException e) {
                            o00oO0o.OooO0OO().execute(new Runnable() { // from class: Oooo0oo.o0O0oo00
                                @Override // java.lang.Runnable
                                public final void run() {
                                    oo0ooO oo0ooo = (oo0ooO) o0oo000OooO0O0.f1277OooO0o;
                                    oo0ooo.getClass();
                                    o0Oo0oo.OooO00o();
                                    if (oo0ooo.f1325OooO0oO) {
                                        return;
                                    }
                                    OooOOO0.OooO0o("onImageCaptured() must be called before onFinalResult()", oo0ooo.f1321OooO0OO.isDone());
                                    oo0ooo.OooO00o();
                                    o0Oo0oo.OooO00o();
                                    o0OOOO00 o0oooo01 = oo0ooo.f1319OooO00o;
                                    o0oooo01.OooO00o().execute(new o0OOO0OO(0, o0oooo01, e));
                                }
                            });
                        } catch (OutOfMemoryError e2) {
                            final ImageCaptureException imageCaptureException = new ImageCaptureException(e2, "Processing failed due to low memory.");
                            o00oO0o.OooO0OO().execute(new Runnable() { // from class: Oooo0oo.o0O0oo00
                                @Override // java.lang.Runnable
                                public final void run() {
                                    oo0ooO oo0ooo = (oo0ooO) o0oo000OooO0O0.f1277OooO0o;
                                    oo0ooo.getClass();
                                    o0Oo0oo.OooO00o();
                                    if (oo0ooo.f1325OooO0oO) {
                                        return;
                                    }
                                    OooOOO0.OooO0o("onImageCaptured() must be called before onFinalResult()", oo0ooo.f1321OooO0OO.isDone());
                                    oo0ooo.OooO00o();
                                    o0Oo0oo.OooO00o();
                                    o0OOOO00 o0oooo01 = oo0ooo.f1319OooO00o;
                                    o0oooo01.OooO00o().execute(new o0OOO0OO(0, o0oooo01, imageCaptureException));
                                }
                            });
                        } catch (RuntimeException e3) {
                            final ImageCaptureException imageCaptureException2 = new ImageCaptureException(e3, "Processing failed.");
                            o00oO0o.OooO0OO().execute(new Runnable() { // from class: Oooo0oo.o0O0oo00
                                @Override // java.lang.Runnable
                                public final void run() {
                                    oo0ooO oo0ooo = (oo0ooO) o0oo000OooO0O0.f1277OooO0o;
                                    oo0ooo.getClass();
                                    o0Oo0oo.OooO00o();
                                    if (oo0ooo.f1325OooO0oO) {
                                        return;
                                    }
                                    OooOOO0.OooO0o("onImageCaptured() must be called before onFinalResult()", oo0ooo.f1321OooO0OO.isDone());
                                    oo0ooo.OooO00o();
                                    o0Oo0oo.OooO00o();
                                    o0OOOO00 o0oooo01 = oo0ooo.f1319OooO00o;
                                    o0oooo01.OooO00o().execute(new o0OOO0OO(0, o0oooo01, imageCaptureException2));
                                }
                            });
                        }
                    }
                });
            }
        };
        o0o.f1207OooO0OO = new oo0OOoo();
        o0o.f1208OooO0Oo = new o0O00oO0();
        o0o.f1211OooO0oO = new o0O0oo0o();
        o0o.f1210OooO0o0 = new o0O00();
        o0o.f1209OooO0o = new o0O0O0Oo();
        o0o.f1212OooO0oo = new o0O0OO0();
        if (o0oooooo.f1307OooO0O0 != 35) {
            return;
        }
        o0o.f1204OooO = new o0O0O0o0();
    }
}
