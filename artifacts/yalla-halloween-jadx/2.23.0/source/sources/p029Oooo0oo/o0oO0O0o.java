package p029Oooo0oo;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.OooOOO;
import androidx.camera.core.OooOo00;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o000O00O;
import androidx.camera.core.impl.o000O0O0;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00OOO0O;
import java.util.Objects;
import java.util.concurrent.Executor;
import o000OO.OooO00o;
import o000OO.OooOOO0;
import org.conscrypt.PSKKeyManager;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p034OoooOO0.o0OOO0o;
import p034OoooOO0.oo000o;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0oO0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o000O00O f1341OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final o000000O f1342OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final o0O00o00 f1343OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final o0OO0oO0 f1344OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o0O00000 f1345OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final o0O f1346OooO0o0;

    @MainThread
    public o0oO0O0o(@NonNull o000O00O o000o00o2, @NonNull Size size, @Nullable CameraEffect cameraEffect, boolean z) {
        OooO00o oooO00o;
        o000O0O0 o000o0o1;
        o0Oo0oo.OooO00o();
        this.f1341OooO00o = o000o00o2;
        o000o00o2.getClass();
        o000000O.OooO0O0 OooO0O1 = o00OOO0O.OooO0O0(o000o00o2);
        if (OooO0O1 == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + o0OOO0o.OooO00o(o000o00o2, o000o00o2.toString()));
        }
        o000000O.OooO00o oooO00o2 = new o000000O.OooO00o();
        OooO0O1.OooO00o(o000o00o2, oooO00o2);
        this.f1342OooO0O0 = oooO00o2.OooO0Oo();
        final o0O00o00 o0o00o01 = new o0O00o00();
        this.f1343OooO0OO = o0o00o01;
        final o0OO0oO0 o0oo0oo1 = new o0OO0oO0();
        this.f1344OooO0Oo = o0oo0oo1;
        Executor executor = (Executor) ((o00O0) o000o00o2.getConfig()).OooOoO(oo000o.f1466OooO00o, o00oO0o.OooO0O0());
        Objects.requireNonNull(executor);
        if (cameraEffect != null) {
            OooOOO0.OooO00o(false);
            throw null;
        }
        final o0O o0o = new o0O(executor);
        this.f1346OooO0o0 = o0o;
        int iOooO0o = o000o00o2.OooO0o();
        Integer num = (Integer) ((o00O0) o000o00o2.getConfig()).OooOoO(o000O00O.f3693Oooo0, null);
        o0O00000 o0o00000 = new o0O00000(size, iOooO0o, num != null ? num.intValue() : PSKKeyManager.MAX_KEY_LENGTH_BYTES, z, (p028Oooo0oO.o00O0) ((o00O0) o000o00o2.getConfig()).OooOoO(o000O00O.f3697Oooo0O0, null), new o000O0o(), new o000O0o());
        this.f1345OooO0o = o0o00000;
        OooOOO0.OooO0o("CaptureNode does not support recreation yet.", o0o00o01.f1264OooO0o0 == null && o0o00o01.f1262OooO0OO == null);
        o0o00o01.f1264OooO0o0 = o0o00000;
        boolean z2 = !o0o00000.f1233OooO0o;
        p028Oooo0oO.o00O0 o00o1 = o0o00000.f1235OooO0oO;
        Size size2 = o0o00000.f1231OooO0OO;
        int i = o0o00000.f1232OooO0Oo;
        if (z2 && o00o1 == null) {
            OooOOO oooOOO = new OooOOO(size2.getWidth(), size2.getHeight(), i, 4);
            o0o00000.f1267OooO00o = oooOOO.f3454OooO0O0;
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
                    OooOOO0.OooO0o("Pending request should be null", o0o0oooo2.f1272OooO0O0 == null);
                    o0o0oooo2.f1272OooO0O0 = o0oo000;
                }
            };
            o000o0o1 = o0o0oooo;
            oooO00o = oooO00o3;
        }
        Surface surface = o000o0o1.getSurface();
        Objects.requireNonNull(surface);
        OooOOO0.OooO0o("The surface is already set.", o0o00000.f1268OooO0O0 == null);
        o0o00000.f1268OooO0O0 = new o000O(surface, size2, i);
        o0o00o01.f1262OooO0OO = new OooOo00(o000o0o1);
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
        o0o00000.f1236OooO0oo.f1561OooO00o = oooO00o;
        o0o00000.f1230OooO.f1561OooO00o = new OooO00o() { // from class: Oooo0oo.o0oO0Ooo
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                o0o00o01.OooO0Oo((ImageCaptureException) obj);
            }
        };
        o0O0000O o0o0000o2 = new o0O0000O(new o000O0o(), new o000O0o(), i, o0o00000.f1234OooO0o0);
        o0o00o01.f1263OooO0Oo = o0o0000o2;
        o0o0000o2.f1237OooO00o.f1561OooO00o = new OooO00o() { // from class: Oooo0oo.o0OOooO0
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                androidx.camera.core.OooOOO0 oooOOO0 = (androidx.camera.core.OooOOO0) obj;
                o0OO0oO0 o0oo0oo2 = o0oo0oo1;
                o0oo0oo2.getClass();
                o0Oo0oo.OooO00o();
                OooOOO0.OooO0o(null, o0oo0oo2.f1314OooO00o != null);
                Object objOooO00o = oooOOO0.o00000OO().OooO0O0().OooO00o(o0oo0oo2.f1314OooO00o.f1291OooO0oO);
                Objects.requireNonNull(objOooO00o);
                OooOOO0.OooO0o(null, ((Integer) objOooO00o).intValue() == ((Integer) o0oo0oo2.f1314OooO00o.f1292OooO0oo.get(0)).intValue());
                o0oo0oo2.f1315OooO0O0.f1335OooO00o.accept(new o0O000Oo(o0oo0oo2.f1314OooO00o, oooOOO0));
                o0oo0oo2.f1314OooO00o = null;
            }
        };
        o0o0000o2.f1238OooO0O0.f1561OooO00o = new OooO00o() { // from class: Oooo0oo.o0OO0o00
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                o0OO000 o0oo000 = (o0OO000) obj;
                o0OO0oO0 o0oo0oo2 = o0oo0oo1;
                o0oo0oo2.getClass();
                o0Oo0oo.OooO00o();
                OooOOO0.OooO0o("Cannot handle multi-image capture.", o0oo000.f1292OooO0oo.size() == 1);
                OooOOO0.OooO0o("Already has an existing request.", o0oo0oo2.f1314OooO00o == null);
                o0oo0oo2.f1314OooO00o = o0oo000;
                o0OO0o o0oo0o2 = new o0OO0o(o0oo0oo2, o0oo000);
                o0ooOOo o0oooooOooO00o = o00oO0o.OooO00o();
                com.google.common.util.concurrent.OooO00o<Void> oooO00o4 = o0oo000.f1284OooO;
                oooO00o4.OooO(new OoooO.OooOo00.OooO0O0(oooO00o4, o0oo0o2), o0oooooOooO00o);
            }
        };
        o0OoOoOo o0oooooo = new o0OoOoOo(new o000O0o(), o0o0000o2.f1239OooO0OO, o0o0000o2.f1240OooO0Oo);
        o0oo0oo1.f1315OooO0O0 = o0oooooo;
        o0o.f1221OooO0O0 = o0oooooo;
        o0oooooo.f1335OooO00o.f1561OooO00o = new OooO00o() { // from class: Oooo0oo.o0O0o000
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                o0O.OooO0O0 oooO0O0 = (o0O.OooO0O0) obj;
                o0O o0o2 = o0o;
                o0o2.getClass();
                if (((o0OO00OO) oooO0O0.OooO0O0().f1289OooO0o).f1301OooO0oO) {
                    return;
                }
                o0o2.f1220OooO00o.execute(new o0O0o00O(0, o0o2, oooO0O0));
            }
        };
        o0o.f1222OooO0OO = new oo0OOoo();
        o0o.f1223OooO0Oo = new o0O00oO0();
        o0o.f1226OooO0oO = new o0O0oo0o();
        o0o.f1225OooO0o0 = new o0O00();
        o0o.f1224OooO0o = new o0O0O0Oo();
        o0o.f1227OooO0oo = new o0O0OO0();
        if (o0oooooo.f1336OooO0O0 != 35) {
            return;
        }
        o0o.f1219OooO = new o0O0O0o0();
    }
}
