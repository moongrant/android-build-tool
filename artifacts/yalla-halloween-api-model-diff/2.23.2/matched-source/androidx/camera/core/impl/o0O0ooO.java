package androidx.camera.core.impl;

import android.media.MediaFormat;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0ooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3773OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f3774OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3775OooO0o0;

    public /* synthetic */ o0O0ooO(int i, Object obj, Object obj2) {
        this.f3773OooO0Oo = i;
        this.f3775OooO0o0 = obj;
        this.f3774OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p045Oooooo.o00Oo0 o00oo1;
        Executor executor;
        switch (this.f3773OooO0Oo) {
            case 0:
                o00O000o o00o000o2 = (o00O000o) this.f3775OooO0o0;
                o0ooOO0.o000Oo0.OooO00o oooO00o = (o0ooOO0.o000Oo0.OooO00o) this.f3774OooO0o;
                o00O000o.OooO0O0 oooO0O0 = (o00O000o.OooO0O0) o00o000o2.f3714OooO00o.getValue();
                if (oooO0O0 == null) {
                    oooO00o.OooO0OO(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                }
                Throwable th = oooO0O0.f3720OooO0O0;
                if (!(th == null)) {
                    th.getClass();
                    oooO00o.OooO0OO(th);
                    return;
                } else {
                    if (!(th == null)) {
                        throw new IllegalStateException("Result contains an error. Does not contain a value.");
                    }
                    oooO00o.OooO0O0(oooO0O0.f3719OooO00o);
                    return;
                }
            case 1:
                Oooooo.o0000Ooo.OooO oooO = (Oooooo.o0000Ooo.OooO) this.f3775OooO0o0;
                MediaFormat mediaFormat = (MediaFormat) this.f3774OooO0o;
                if (oooO.f1916OooO) {
                    p028Oooo0oO.o00O0O0.OooO0oo(p045Oooooo.o0000Ooo.this.f1887OooO00o, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (Oooooo.o0000Ooo.OooO00o.f1928OooO00o[p045Oooooo.o0000Ooo.this.f1907OooOo00.ordinal()]) {
                    case 1:
                    case 8:
                    case 9:
                        return;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        synchronized (p045Oooooo.o0000Ooo.this.f1888OooO0O0) {
                            p045Oooooo.o0000Ooo o0000ooo = p045Oooooo.o0000Ooo.this;
                            o00oo1 = o0000ooo.f1902OooOOo;
                            executor = o0000ooo.f1904OooOOoo;
                            break;
                        }
                        try {
                            executor.execute(new o00O000(1, o00oo1, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e) {
                            p028Oooo0oO.o00O0O0.OooO0OO(p045Oooooo.o0000Ooo.this.f1887OooO00o, "Unable to post to the supplied executor.", e);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: " + p045Oooooo.o0000Ooo.this.f1907OooOo00);
                }
            default:
                o00oOoo.OooO00o(this.f3775OooO0o0);
                int i = AdsMediaSource.f8024OooOO0O;
                throw null;
        }
    }
}
