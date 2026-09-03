package p029Oooo0oo;

import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.OooOo00;
import androidx.camera.core.impl.o000O;
import androidx.camera.core.impl.o000oOoO;
import com.google.auto.value.AutoValue;
import java.util.HashSet;
import java.util.Objects;
import p028Oooo0oO.o00O0;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO0;
import p031OoooO0.o0Oo0oo;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0O00o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final HashSet f1260OooO00o = new HashSet();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0OO000 f1261OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooOo00 f1262OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0O0000O f1263OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f1264OooO0o0;

    public class OooO00o implements OooOOO0<Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0OO000 f1265OooO00o;

        public OooO00o(o0OO000 o0oo000) {
            this.f1265OooO00o = o0oo000;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            o0Oo0oo.OooO00o();
            o0O00o00 o0o00o01 = o0O00o00.this;
            if (this.f1265OooO00o == o0o00o01.f1261OooO0O0) {
                o0o00o01.f1261OooO0O0 = null;
            }
        }

        @Override // p030OoooO.OooOOO0
        public final /* bridge */ /* synthetic */ void onSuccess(@Nullable Void r1) {
        }
    }

    @AutoValue
    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public o000oOoO f1267OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public o000O f1268OooO0O0;

        public class OooO00o extends o000oOoO {
        }

        @NonNull
        public abstract o000O0o<ImageCaptureException> OooO00o();

        @Nullable
        public abstract o00O0 OooO0O0();

        public abstract int OooO0OO();

        public abstract int OooO0Oo();

        public abstract Size OooO0o();

        @NonNull
        public abstract o000O0o<o0OO000> OooO0o0();

        public abstract boolean OooO0oO();
    }

    @AutoValue
    public static abstract class OooO0OO {
        public abstract o000O0o<androidx.camera.core.OooOOO0> OooO00o();

        public abstract int OooO0O0();

        public abstract int OooO0OO();

        public abstract o000O0o<o0OO000> OooO0Oo();
    }

    @MainThread
    public final int OooO00o() {
        int iOooO0o0;
        o0Oo0oo.OooO00o();
        o000OO.OooOOO0.OooO0o("The ImageReader is not initialized.", this.f1262OooO0OO != null);
        OooOo00 oooOo00 = this.f1262OooO0OO;
        synchronized (oooOo00.f3478OooO00o) {
            iOooO0o0 = oooOo00.f3481OooO0Oo.OooO0o0() - oooOo00.f3479OooO0O0;
        }
        return iOooO0o0;
    }

    @MainThread
    @VisibleForTesting
    public final void OooO0O0(@NonNull androidx.camera.core.OooOOO0 oooOOO0) throws Exception {
        o0Oo0oo.OooO00o();
        if (this.f1261OooO0O0 == null) {
            o00O0O0.OooO00o("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + oooOOO0);
            oooOOO0.close();
            return;
        }
        Object objOooO00o = oooOOO0.o00000OO().OooO0O0().OooO00o(this.f1261OooO0O0.f1291OooO0oO);
        Objects.requireNonNull(objOooO00o);
        int iIntValue = ((Integer) objOooO00o).intValue();
        HashSet hashSet = this.f1260OooO00o;
        o000OO.OooOOO0.OooO0o("Received an unexpected stage id" + iIntValue, hashSet.contains(Integer.valueOf(iIntValue)));
        hashSet.remove(Integer.valueOf(iIntValue));
        o0O0000O o0o0000o2 = this.f1263OooO0Oo;
        Objects.requireNonNull(o0o0000o2);
        o0o0000o2.f1237OooO00o.accept(oooOOO0);
        if (hashSet.isEmpty()) {
            o0OO000 o0oo000 = this.f1261OooO0O0;
            this.f1261OooO0O0 = null;
            o0OO00OO o0oo00oo2 = (o0OO00OO) o0oo000.f1289OooO0o;
            o0oo00oo2.getClass();
            o0Oo0oo.OooO00o();
            if (o0oo00oo2.f1301OooO0oO) {
                return;
            }
            o0oo00oo2.f1300OooO0o0.OooO0O0(null);
        }
    }

    @MainThread
    @VisibleForTesting
    public final void OooO0OO(@NonNull o0OO000 o0oo000) {
        o0Oo0oo.OooO00o();
        boolean z = true;
        o000OO.OooOOO0.OooO0o("Too many acquire images. Close image to be able to process next.", OooO00o() > 0);
        o0OO000 o0oo001 = this.f1261OooO0O0;
        HashSet hashSet = this.f1260OooO00o;
        if (o0oo001 != null && !hashSet.isEmpty()) {
            z = false;
        }
        o000OO.OooOOO0.OooO0o("The previous request is not complete", z);
        this.f1261OooO0O0 = o0oo000;
        hashSet.addAll(o0oo000.f1292OooO0oo);
        o0O0000O o0o0000o2 = this.f1263OooO0Oo;
        Objects.requireNonNull(o0o0000o2);
        o0o0000o2.f1238OooO0O0.accept(o0oo000);
        OooO00o oooO00o = new OooO00o(o0oo000);
        o0ooOOo o0oooooOooO00o = o00oO0o.OooO00o();
        com.google.common.util.concurrent.OooO00o<Void> oooO00o2 = o0oo000.f1284OooO;
        oooO00o2.OooO(new OoooO.OooOo00.OooO0O0(oooO00o2, oooO00o), o0oooooOooO00o);
    }

    @MainThread
    public final void OooO0Oo(@NonNull ImageCaptureException imageCaptureException) {
        boolean z;
        o0Oo0oo.OooO00o();
        o0OO000 o0oo000 = this.f1261OooO0O0;
        if (o0oo000 != null) {
            o0OO00OO o0oo00oo2 = (o0OO00OO) o0oo000.f1289OooO0o;
            o0oo00oo2.getClass();
            o0Oo0oo.OooO00o();
            if (o0oo00oo2.f1301OooO0oO) {
                return;
            }
            o0oo0000 o0oo0000Var = o0oo00oo2.f1295OooO00o;
            o0oo0000Var.getClass();
            o0Oo0oo.OooO00o();
            int i = o0oo0000Var.f1351OooO00o;
            if (i > 0) {
                z = true;
                o0oo0000Var.f1351OooO00o = i - 1;
            } else {
                z = false;
            }
            if (!z) {
                o0Oo0oo.OooO00o();
                o0oo0000Var.OooO00o().execute(new o0OOo000(0, o0oo0000Var, imageCaptureException));
            }
            o0oo00oo2.OooO00o();
            o0oo00oo2.f1300OooO0o0.OooO0OO(imageCaptureException);
            if (z) {
                o0OOOO0o o0oooo0o = (o0OOOO0o) o0oo00oo2.f1296OooO0O0;
                o0oooo0o.getClass();
                o0Oo0oo.OooO00o();
                o00O0O0.OooO00o("TakePictureManager", "Add a new request for retrying.");
                o0oooo0o.f1323OooO00o.addFirst(o0oo0000Var);
                o0oooo0o.OooO0OO();
            }
        }
    }
}
