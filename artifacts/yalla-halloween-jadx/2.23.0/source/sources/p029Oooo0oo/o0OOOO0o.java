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
import androidx.camera.core.impl.o00O0;
import com.google.common.util.concurrent.OooO00o;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p028Oooo0oO.o00O00o0;
import p030OoooO.OooOo00;
import p031OoooO0.o0OO00O;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o00oO0o;
import p099o000oOoO.o00000O0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0OOOO0o implements OooOO0O.OooO00o, o0oo0000.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O0O f1324OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0oO0O0o f1325OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0OO00OO f1326OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f1328OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public final ArrayDeque f1323OooO00o = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f1327OooO0o = false;

    @MainThread
    public o0OOOO0o(@NonNull ImageCapture.OooO00o oooO00o) {
        o0Oo0oo.OooO00o();
        this.f1324OooO0O0 = oooO00o;
        this.f1328OooO0o0 = new ArrayList();
    }

    @Override // androidx.camera.core.OooOO0O.OooO00o
    public final void OooO00o(@NonNull OooOOO0 oooOOO0) {
        o00oO0o.OooO0OO().execute(new Runnable() { // from class: Oooo0oo.o0OOO0OO
            @Override // java.lang.Runnable
            public final void run() {
                this.f1320OooO0Oo.OooO0OO();
            }
        });
    }

    @MainThread
    public final void OooO0O0() {
        o0Oo0oo.OooO00o();
        ImageCaptureException imageCaptureException = new ImageCaptureException(null, "Camera is closed.");
        ArrayDeque<o0oo0000> arrayDeque = this.f1323OooO00o;
        for (o0oo0000 o0oo0000Var : arrayDeque) {
            o0oo0000Var.OooO00o().execute(new o0OOo000(0, o0oo0000Var, imageCaptureException));
        }
        arrayDeque.clear();
        for (o0OO00OO o0oo00oo2 : new ArrayList(this.f1328OooO0o0)) {
            o0oo00oo2.getClass();
            o0Oo0oo.OooO00o();
            if (!o0oo00oo2.f1298OooO0Oo.isDone()) {
                o0Oo0oo.OooO00o();
                o0oo00oo2.f1301OooO0oO = true;
                OooO00o<Void> oooO00o = o0oo00oo2.f1302OooO0oo;
                Objects.requireNonNull(oooO00o);
                oooO00o.cancel(true);
                o0oo00oo2.f1300OooO0o0.OooO0OO(imageCaptureException);
                o0oo00oo2.f1299OooO0o.OooO0O0(null);
                o0Oo0oo.OooO00o();
                o0oo0000 o0oo0000Var2 = o0oo00oo2.f1295OooO00o;
                o0oo0000Var2.OooO00o().execute(new o0OOo000(0, o0oo0000Var2, imageCaptureException));
            }
        }
    }

    @MainThread
    public final void OooO0OO() {
        boolean z;
        o0Oo0oo.OooO00o();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        boolean z2 = true;
        boolean z3 = false;
        if (this.f1326OooO0Oo != null) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f1327OooO0o) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        o0oO0O0o o0oo0o0o2 = this.f1325OooO0OO;
        o0oo0o0o2.getClass();
        o0Oo0oo.OooO00o();
        if (o0oo0o0o2.f1343OooO0OO.OooO00o() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        o0oo0000 o0oo0000Var = (o0oo0000) this.f1323OooO00o.poll();
        if (o0oo0000Var == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        o0OO00OO o0oo00oo2 = new o0OO00OO(o0oo0000Var, this);
        o000OO.OooOOO0.OooO0o(null, !(this.f1326OooO0Oo != null));
        this.f1326OooO0Oo = o0oo00oo2;
        o0Oo0oo.OooO00o();
        o0oo00oo2.f1297OooO0OO.f57402OooO0o0.OooO(new Runnable() { // from class: Oooo0oo.o0OOO00
            @Override // java.lang.Runnable
            public final void run() {
                o0OOOO0o o0oooo0o = this.f1319OooO0Oo;
                o0oooo0o.f1326OooO0Oo = null;
                o0oooo0o.OooO0OO();
            }
        }, o00oO0o.OooO00o());
        this.f1328OooO0o0.add(o0oo00oo2);
        o0Oo0oo.OooO00o();
        o0oo00oo2.f1298OooO0Oo.f57402OooO0o0.OooO(new o0OOO0(0, this, o0oo00oo2), o00oO0o.OooO00o());
        o0oO0O0o o0oo0o0o3 = this.f1325OooO0OO;
        o0Oo0oo.OooO00o();
        o00O000.OooO0o oooO0o = o0oo00oo2.f1297OooO0OO;
        o0oo0o0o3.getClass();
        o0Oo0oo.OooO00o();
        p028Oooo0oO.o00O000 o00o001 = new p028Oooo0oO.o00O000(Arrays.asList(new o00000.OooO00o()));
        o000O00O o000o00o2 = o0oo0o0o3.f1341OooO00o;
        o000o00o2.getClass();
        o000000 o000000Var = (o000000) ((o00O0) o000o00o2.getConfig()).OooOoO(o000O00O.f3696Oooo00o, o00o001);
        Objects.requireNonNull(o000000Var);
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(o000000Var.hashCode());
        List<o00000> listOooO00o = o000000Var.OooO00o();
        Objects.requireNonNull(listOooO00o);
        for (o00000 o00000Var : listOooO00o) {
            o000000O.OooO00o oooO00o = new o000000O.OooO00o();
            o000000O o000000o2 = o0oo0o0o3.f1342OooO0O0;
            oooO00o.f3657OooO0OO = o000000o2.f3649OooO0OO;
            oooO00o.OooO0OO(o000000o2.f3648OooO0O0);
            oooO00o.OooO00o(o0oo0000Var.OooOO0());
            o0O00000 o0o00000 = o0oo0o0o3.f1345OooO0o;
            o000O o000o = o0o00000.f1268OooO0O0;
            Objects.requireNonNull(o000o);
            oooO00o.f3655OooO00o.add(o000o);
            if (o0o00000.f1232OooO0Oo == 256) {
                if (((o00000O0) p099o000oOoO.o00000.OooO00o(o00000O0.class)) != null) {
                    OooO0o oooO0o2 = o000000O.f3645OooO;
                    z = z3;
                } else {
                    z = z2;
                }
                if (z) {
                    oooO00o.f3656OooO0O0.Oooo0oO(o000000O.f3645OooO, Integer.valueOf(o0oo0000Var.OooO0oo()));
                }
                oooO00o.f3656OooO0O0.Oooo0oO(o000000O.f3646OooOO0, Integer.valueOf(((o0oo0000Var.OooO0o() != null ? true : z3) && o0OO00O.OooO0O0(o0oo0000Var.OooO0OO(), o0o00000.f1231OooO0OO)) ? o0oo0000Var.OooO0O0() == 0 ? 100 : 95 : o0oo0000Var.OooO0o0()));
            }
            oooO00o.OooO0OO(o00000Var.OooO00o().f3648OooO0O0);
            o00000Var.getId();
            oooO00o.f3661OooO0oO.f3728OooO00o.put(strValueOf, 0);
            oooO00o.OooO0O0(o0o00000.f1267OooO00o);
            arrayList.add(oooO00o.OooO0Oo());
            z3 = false;
            z2 = true;
        }
        boolean z4 = z3;
        o0OoO00O o0ooo00o2 = new o0OoO00O(arrayList, o0oo00oo2);
        o0OO000 o0oo000 = new o0OO000(o000000Var, o0oo0000Var.OooO0oO(), o0oo0000Var.OooO0OO(), o0oo0000Var.OooO0oo(), o0oo0000Var.OooO0o0(), o0oo0000Var.OooO(), o0oo00oo2, oooO0o);
        o0oO0O0o o0oo0o0o4 = this.f1325OooO0OO;
        o0oo0o0o4.getClass();
        o0Oo0oo.OooO00o();
        o0oo0o0o4.f1345OooO0o.f1236OooO0oo.accept(o0oo000);
        o0Oo0oo.OooO00o();
        ImageCapture imageCapture = ImageCapture.this;
        synchronized (imageCapture.f3414OooOOOO) {
            if (imageCapture.f3414OooOOOO.get() == null) {
                imageCapture.f3414OooOOOO.set(Integer.valueOf(imageCapture.Oooo00O()));
            }
        }
        ImageCapture imageCapture2 = ImageCapture.this;
        imageCapture2.getClass();
        o0Oo0oo.OooO00o();
        p030OoooO.OooOO0O oooOO0OOooO0oo = OooOo00.OooO0oo(imageCapture2.OooO0Oo().OooO00o(arrayList, imageCapture2.f3413OooOOO, imageCapture2.f3415OooOOOo), new o00O00o0(), o00oO0o.OooO00o());
        oooOO0OOooO0oo.OooO(new OooOo00.OooO0O0(oooOO0OOooO0oo, new o0OOOO00(this, o0ooo00o2)), o00oO0o.OooO0OO());
        o0Oo0oo.OooO00o();
        if (o0oo00oo2.f1302OooO0oo == null) {
            z4 = true;
        }
        o000OO.OooOOO0.OooO0o("CaptureRequestFuture can only be set once.", z4);
        o0oo00oo2.f1302OooO0oo = oooOO0OOooO0oo;
    }
}
