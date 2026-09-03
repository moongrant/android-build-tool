package p022Oooo00O;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.oo0o0O0;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p024Oooo0O0.o0000O0;
import p024Oooo0O0.o0000O00;
import p024Oooo0O0.o000OOo0;
import p024Oooo0O0.o00O000;
import p025Oooo0OO.o000O0o;
import p033OoooO0O.o0O0O00;
import p033OoooO0O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f671OooO00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Executor f672OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ScheduledExecutorService f673OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Handler f674OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o00OOOOo f675OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final oo0o0O0 f676OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final oo0o0O0 f677OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f678OooO0oO;

        /* JADX WARN: Code duplicated, block: B:17:0x0047  */
        public OooO00o(@NonNull Handler handler, @NonNull o00OOOOo o00ooooo2, @NonNull oo0o0O0 oo0o0o0, @NonNull oo0o0O0 oo0o0o1, @NonNull o0O0O00 o0o0o00, @NonNull o0OOO0o o0ooo0o2) {
            boolean z;
            this.f672OooO00o = o0o0o00;
            this.f673OooO0O0 = o0ooo0o2;
            this.f674OooO0OO = handler;
            this.f675OooO0Oo = o00ooooo2;
            this.f677OooO0o0 = oo0o0o0;
            this.f676OooO0o = oo0o0o1;
            if (!(oo0o0o1.OooO00o(o00O000.class) || oo0o0o0.OooO00o(o000OOo0.class) || oo0o0o0.OooO00o(o0000O0.class)) && !new o000O0o(oo0o0o0).f1046OooO00o) {
                z = ((o0000O00) oo0o0o1.OooO0O0(o0000O00.class)) != null;
            }
            this.f678OooO0oO = z;
        }

        @NonNull
        public final o0O OooO00o() {
            o0O0OOOo o0o0oooo;
            if (this.f678OooO0oO) {
                oo0o0O0 oo0o0o0 = this.f677OooO0o0;
                oo0o0O0 oo0o0o1 = this.f676OooO0o;
                o0o0oooo = new o0O0oo00(this.f674OooO0OO, this.f675OooO0Oo, oo0o0o0, oo0o0o1, this.f672OooO00o, this.f673OooO0O0);
            } else {
                o0o0oooo = new o0O0OOOo(this.f675OooO0Oo, this.f672OooO00o, this.f673OooO0O0, this.f674OooO0OO);
            }
            return new o0O(o0o0oooo);
        }
    }

    public interface OooO0O0 {
        @NonNull
        OooOO0O<Void> OooO00o(@NonNull CameraDevice cameraDevice, @NonNull SessionConfigurationCompat sessionConfigurationCompat, @NonNull List<DeferrableSurface> list);

        @NonNull
        OooOO0O OooO0o(@NonNull ArrayList arrayList);

        boolean stop();
    }

    public o0O(@NonNull o0O0OOOo o0o0oooo) {
        this.f671OooO00o = o0o0oooo;
    }
}
