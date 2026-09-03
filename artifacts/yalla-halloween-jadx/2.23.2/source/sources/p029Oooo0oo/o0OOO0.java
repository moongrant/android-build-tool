package p029Oooo0oo;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.OooOO0O;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.o00000;
import androidx.camera.core.impl.o000000;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o000O00O;
import androidx.camera.core.impl.o00O0O00;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p022Oooo00O.o0OOO0o;
import p022Oooo00O.o0ooOOo;
import p028Oooo0oO.o00O000;
import p028Oooo0oO.o00O00o0;
import p030OoooO.OooOo;
import p031OoooO0.o0OO00O;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o00oO0o;
import p099o000oOoO.o0000O;
import p099o000oOoO.o000OO;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0OOO0 implements OooOO0O.OooO00o, o0OOOO00.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O0O f1292OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0oO0O0o f1293OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public oo0ooO f1294OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f1296OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final ArrayDeque f1291OooO00o = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f1295OooO0o = false;

    @MainThread
    public o0OOO0(@NonNull ImageCapture.OooO00o oooO00o) {
        o0Oo0oo.OooO00o();
        this.f1292OooO0O0 = oooO00o;
        this.f1296OooO0o0 = new ArrayList();
    }

    @Override // androidx.camera.core.OooOO0O.OooO00o
    public final void OooO00o(@NonNull OooOOO0 oooOOO0) {
        o00oO0o.OooO0OO().execute(new o0OO(this, 0));
    }

    @MainThread
    public final void OooO0O0() {
        int i;
        o0Oo0oo.OooO00o();
        ImageCaptureException imageCaptureException = new ImageCaptureException(null, "Camera is closed.");
        ArrayDeque arrayDeque = this.f1291OooO00o;
        Iterator it = arrayDeque.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            o0OOOO00 o0oooo01 = (o0OOOO00) it.next();
            o0oooo01.OooO00o().execute(new o0OOO0OO(i, o0oooo01, imageCaptureException));
        }
        arrayDeque.clear();
        for (oo0ooO oo0ooo : new ArrayList(this.f1296OooO0o0)) {
            oo0ooo.getClass();
            o0Oo0oo.OooO00o();
            if (!oo0ooo.f1322OooO0Oo.isDone()) {
                o0Oo0oo.OooO00o();
                oo0ooo.f1325OooO0oO = true;
                com.google.common.util.concurrent.OooOO0O<Void> oooOO0O = oo0ooo.f1326OooO0oo;
                Objects.requireNonNull(oooOO0O);
                oooOO0O.cancel(true);
                oo0ooo.f1324OooO0o0.OooO0OO(imageCaptureException);
                oo0ooo.f1323OooO0o.OooO0O0(null);
                o0Oo0oo.OooO00o();
                o0OOOO00 o0oooo02 = oo0ooo.f1319OooO00o;
                o0oooo02.OooO00o().execute(new o0OOO0OO(i, o0oooo02, imageCaptureException));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @MainThread
    public final void OooO0OO() {
        int i;
        o0Oo0oo.OooO00o();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        int i2 = 1;
        int i3 = 0;
        if (this.f1294OooO0Oo != null) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f1295OooO0o) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        o0oO0O0o o0oo0o0o2 = this.f1293OooO0OO;
        o0oo0o0o2.getClass();
        o0Oo0oo.OooO00o();
        if (o0oo0o0o2.f1311OooO0OO.OooO00o() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        o0OOOO00 o0oooo01 = (o0OOOO00) this.f1291OooO00o.poll();
        if (o0oooo01 == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        oo0ooO oo0ooo = new oo0ooO(o0oooo01, this);
        o000OO.OooOOO0.OooO0o(null, !(this.f1294OooO0Oo != null));
        this.f1294OooO0Oo = oo0ooo;
        o0Oo0oo.OooO00o();
        oo0ooo.f1321OooO0OO.f57741OooO0o0.OooO0oo(new o0ooOOo(this, i2), o00oO0o.OooO00o());
        this.f1296OooO0o0.add(oo0ooo);
        o0Oo0oo.OooO00o();
        oo0ooo.f1322OooO0Oo.f57741OooO0o0.OooO0oo(new o0OOO0o(1, this, oo0ooo), o00oO0o.OooO00o());
        o0oO0O0o o0oo0o0o3 = this.f1293OooO0OO;
        o0Oo0oo.OooO00o();
        o000Oo0.OooO0o oooO0o = oo0ooo.f1321OooO0OO;
        o0oo0o0o3.getClass();
        o0Oo0oo.OooO00o();
        o00O000 o00o001 = new o00O000(Arrays.asList(new o00000.OooO00o()));
        o000O00O o000o00o2 = o0oo0o0o3.f1309OooO00o;
        o000o00o2.getClass();
        o000000 o000000Var = (o000000) ((o00O0O00) o000o00o2.getConfig()).OooOoO(o000O00O.f3695Oooo00o, o00o001);
        Objects.requireNonNull(o000000Var);
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(o000000Var.hashCode());
        List<o00000> listOooO00o = o000000Var.OooO00o();
        Objects.requireNonNull(listOooO00o);
        for (o00000 o00000Var : listOooO00o) {
            o000000O.OooO00o oooO00o = new o000000O.OooO00o();
            o000000O o000000o2 = o0oo0o0o3.f1310OooO0O0;
            oooO00o.f3656OooO0OO = o000000o2.f3648OooO0OO;
            oooO00o.OooO0OO(o000000o2.f3647OooO0O0);
            oooO00o.OooO00o(o0oooo01.OooOO0());
            o0O00000 o0o00000 = o0oo0o0o3.f1313OooO0o;
            o000O o000o = o0o00000.f1253OooO0O0;
            Objects.requireNonNull(o000o);
            oooO00o.f3654OooO00o.add(o000o);
            if (o0o00000.f1217OooO0Oo == 256) {
                if (((o0000O) o000OO.OooO00o(o0000O.class)) != null) {
                    OooO0o oooO0o2 = o000000O.f3644OooO;
                    i = i3;
                } else {
                    i = i2;
                }
                if (i != 0) {
                    oooO00o.f3655OooO0O0.Oooo0oO(o000000O.f3644OooO, Integer.valueOf(o0oooo01.OooO0oo()));
                }
                oooO00o.f3655OooO0O0.Oooo0oO(o000000O.f3645OooOO0, Integer.valueOf(((o0oooo01.OooO0o() != null ? 1 : i3) == 0 || !o0OO00O.OooO0O0(o0oooo01.OooO0OO(), o0o00000.f1216OooO0OO)) ? o0oooo01.OooO0o0() : o0oooo01.OooO0O0() == 0 ? 100 : 95));
            }
            oooO00o.OooO0OO(o00000Var.OooO00o().f3647OooO0O0);
            o00000Var.getId();
            oooO00o.f3660OooO0oO.f3744OooO00o.put(strValueOf, 0);
            oooO00o.OooO0O0(o0o00000.f1252OooO00o);
            arrayList.add(oooO00o.OooO0Oo());
            i3 = 0;
            i2 = 1;
        }
        boolean z = i3;
        o0OoO00O o0ooo00o2 = new o0OoO00O(arrayList, oo0ooo);
        o0OO000 o0oo000 = new o0OO000(o000000Var, o0oooo01.OooO0oO(), o0oooo01.OooO0OO(), o0oooo01.OooO0oo(), o0oooo01.OooO0o0(), o0oooo01.OooO(), oo0ooo, oooO0o);
        o0oO0O0o o0oo0o0o4 = this.f1293OooO0OO;
        o0oo0o0o4.getClass();
        o0Oo0oo.OooO00o();
        o0oo0o0o4.f1313OooO0o.f1221OooO0oo.accept(o0oo000);
        o0Oo0oo.OooO00o();
        ImageCapture imageCapture = ImageCapture.this;
        synchronized (imageCapture.f3412OooOOOO) {
            if (imageCapture.f3412OooOOOO.get() == null) {
                imageCapture.f3412OooOOOO.set(Integer.valueOf(imageCapture.Oooo00O()));
            }
        }
        ImageCapture imageCapture2 = ImageCapture.this;
        imageCapture2.getClass();
        o0Oo0oo.OooO00o();
        p030OoooO.OooOO0O oooOO0OOooO0oo = OooOo.OooO0oo(imageCapture2.OooO0Oo().OooO00o(arrayList, imageCapture2.f3411OooOOO, imageCapture2.f3413OooOOOo), new o00O00o0(), o00oO0o.OooO00o());
        oooOO0OOooO0oo.OooO0oo(new OooOo.OooO0O0(oooOO0OOooO0oo, new o0OOO00(this, o0ooo00o2)), o00oO0o.OooO0OO());
        o0Oo0oo.OooO00o();
        if (oo0ooo.f1326OooO0oo == null) {
            z = 1;
        }
        o000OO.OooOOO0.OooO0o("CaptureRequestFuture can only be set once.", z);
        oo0ooo.f1326OooO0oo = oooOO0OOooO0oo;
    }
}
