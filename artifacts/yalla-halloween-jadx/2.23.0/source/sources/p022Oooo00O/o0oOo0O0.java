package p022Oooo00O;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.o00O0OO0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p024Oooo0O0.o00;
import p024Oooo0O0.o0000O0O;
import p024Oooo0O0.o0000oo;
import p024Oooo0O0.o00O000o;
import p025Oooo0OO.o000O0o;
import p033OoooO0O.o0O0O00;
import p033OoooO0O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f886OooO00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Executor f887OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ScheduledExecutorService f888OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Handler f889OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00OOOOo f890OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o00O0OO0 f891OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00O0OO0 f892OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f893OooO0oO;

        /* JADX WARN: Code duplicated, block: B:17:0x0047  */
        public OooO00o(@NonNull Handler handler, @NonNull o00OOOOo o00ooooo2, @NonNull o00O0OO0 o00o0oo1, @NonNull o00O0OO0 o00o0oo2, @NonNull o0O0O00 o0o0o00, @NonNull o0OOO0o o0ooo0o2) {
            boolean z;
            this.f887OooO00o = o0o0o00;
            this.f888OooO0O0 = o0ooo0o2;
            this.f889OooO0OO = handler;
            this.f890OooO0Oo = o00ooooo2;
            this.f892OooO0o0 = o00o0oo1;
            this.f891OooO0o = o00o0oo2;
            if (!(o00o0oo2.OooO00o(o00O000o.class) || o00o0oo1.OooO00o(o00.class) || o00o0oo1.OooO00o(o0000O0O.class)) && !new o000O0o(o00o0oo1).f1060OooO00o) {
                z = ((o0000oo) o00o0oo2.OooO0O0(o0000oo.class)) != null;
            }
            this.f893OooO0oO = z;
        }

        @NonNull
        public final o0oOo0O0 OooO00o() {
            o0O0OOOo o0o0oooo;
            if (this.f893OooO0oO) {
                o00O0OO0 o00o0oo1 = this.f892OooO0o0;
                o00O0OO0 o00o0oo2 = this.f891OooO0o;
                o0o0oooo = new o0O0o0(this.f889OooO0OO, this.f890OooO0Oo, o00o0oo1, o00o0oo2, this.f887OooO00o, this.f888OooO0O0);
            } else {
                o0o0oooo = new o0O0OOOo(this.f890OooO0Oo, this.f887OooO00o, this.f888OooO0O0, this.f889OooO0OO);
            }
            return new o0oOo0O0(o0o0oooo);
        }
    }

    public interface OooO0O0 {
        @NonNull
        com.google.common.util.concurrent.OooO00o<Void> OooO00o(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat, @NonNull List<DeferrableSurface> list);

        @NonNull
        com.google.common.util.concurrent.OooO00o OooO0o(@NonNull ArrayList arrayList);

        boolean stop();
    }

    public o0oOo0O0(@NonNull o0O0OOOo o0o0oooo) {
        this.f886OooO00o = o0o0oooo;
    }
}
