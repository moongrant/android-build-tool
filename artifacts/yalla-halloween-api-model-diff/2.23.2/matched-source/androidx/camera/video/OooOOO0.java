package androidx.camera.video;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.Oooo000;
import p039OoooOoo.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOO0 implements AutoCloseable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f3996OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f3997OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O f3998OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00oOoo f3999OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Oooo000 f4000OooO0oo;

    public OooOOO0(@NonNull OooOO0O oooOO0O, long j, @NonNull o00oOoo o00oooo2, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f3996OooO0Oo = atomicBoolean;
        Oooo000 oooo000 = Build.VERSION.SDK_INT >= 30 ? new Oooo000(new Oooo000.OooO00o()) : new Oooo000(new Oooo000.OooO0OO());
        this.f4000OooO0oo = oooo000;
        this.f3998OooO0o0 = oooOO0O;
        this.f3997OooO0o = j;
        this.f3999OooO0oO = o00oooo2;
        if (z) {
            atomicBoolean.set(true);
        } else {
            oooo000.f1368OooO00o.OooO00o("stop");
        }
    }

    public final void OooO00o(final int i, @Nullable final RuntimeException runtimeException) {
        this.f4000OooO0oo.f1368OooO00o.close();
        if (this.f3996OooO0Oo.getAndSet(true)) {
            return;
        }
        final OooOO0O oooOO0O = this.f3998OooO0o0;
        synchronized (oooOO0O.f3923OooO0o) {
            try {
                if (!OooOO0O.OooOOO(this, oooOO0O.f3929OooOO0o) && !OooOO0O.OooOOO(this, oooOO0O.f3928OooOO0O)) {
                    o00O0O0.OooO00o("Recorder", "stop() called on a recording that is no longer active: " + this.f3999OooO0oO);
                    return;
                }
                OooO0OO oooO0OO = null;
                switch (OooOO0O.OooOO0.f3982OooO00o[oooOO0O.f3926OooO0oo.ordinal()]) {
                    case 1:
                    case 2:
                        oooOO0O.OooOoOO(OooOO0O.OooOOO.STOPPING);
                        final long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
                        final OooOO0O.OooOOO0 oooOOO0 = oooOO0O.f3928OooOO0O;
                        oooOO0O.f3921OooO0OO.execute(new Runnable() { // from class: OoooOoo.o00O0OO
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                oooOO0O.Oooo000(oooOOO0, micros, i, runtimeException);
                            }
                        });
                        break;
                    case 3:
                    case 4:
                        o000OO.OooOOO0.OooO0o(null, OooOO0O.OooOOO(this, oooOO0O.f3929OooOO0o));
                        OooO0OO oooO0OO2 = oooOO0O.f3929OooOO0o;
                        oooOO0O.f3929OooOO0o = null;
                        oooOO0O.OooOo0O();
                        oooO0OO = oooO0OO2;
                        break;
                    case 5:
                    case 6:
                        o000OO.OooOOO0.OooO0o(null, OooOO0O.OooOOO(this, oooOO0O.f3928OooOO0O));
                        break;
                    case 7:
                    case 9:
                        throw new IllegalStateException("Calling stop() while idling or initializing is invalid.");
                }
                if (oooO0OO != null) {
                    if (i == 10) {
                        o00O0O0.OooO0O0("Recorder", "Recording was stopped due to recording being garbage collected before any valid data has been produced.");
                    }
                    new RuntimeException("Recording was stopped before any data could be produced.", runtimeException);
                    oooOO0O.OooO0oo(oooO0OO, 8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        OooO00o(0, null);
    }

    public final void finalize() throws Throwable {
        try {
            this.f4000OooO0oo.f1368OooO00o.OooO0O0();
            OooO00o(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
