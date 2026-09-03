package o000O0Oo;

import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34271OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f34272OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34273OooO0o0;

    public /* synthetic */ o000oOoO(int i, Object obj, Object obj2) {
        this.f34271OooO0Oo = i;
        this.f34273OooO0o0 = obj;
        this.f34272OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34271OooO0Oo) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.f34273OooO0o0;
                p080o000OoO.oo0o0Oo oo0o0oo = (p080o000OoO.oo0o0Oo) this.f34272OooO0o;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    oo0o0oo.OooO0Oo();
                    synchronized (DefaultAudioSink.f7411Oooooo0) {
                        int i = DefaultAudioSink.f7412OoooooO - 1;
                        DefaultAudioSink.f7412OoooooO = i;
                        if (i == 0) {
                            DefaultAudioSink.f7410Oooooo.shutdown();
                            DefaultAudioSink.f7410Oooooo = null;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    oo0o0oo.OooO0Oo();
                    synchronized (DefaultAudioSink.f7411Oooooo0) {
                        int i2 = DefaultAudioSink.f7412OoooooO - 1;
                        DefaultAudioSink.f7412OoooooO = i2;
                        if (i2 == 0) {
                            DefaultAudioSink.f7410Oooooo.shutdown();
                            DefaultAudioSink.f7410Oooooo = null;
                        }
                        throw th;
                    }
                }
            default:
                AppStartTrace appStartTrace = (AppStartTrace) this.f34273OooO0o0;
                TraceMetric.OooO0O0 oooO0O0 = (TraceMetric.OooO0O0) this.f34272OooO0o;
                Timer timer = AppStartTrace.f19938OooOoO;
                appStartTrace.getClass();
                appStartTrace.f19945OooO0o0.OooO0OO(oooO0O0.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                return;
        }
    }
}
