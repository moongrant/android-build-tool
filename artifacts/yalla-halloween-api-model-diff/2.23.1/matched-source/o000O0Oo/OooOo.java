package o000O0Oo;

import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;
import p080o000OoO.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f34269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34270OooO0o0;

    public /* synthetic */ OooOo(int i, Object obj, Object obj2) {
        this.f34268OooO0Oo = i;
        this.f34270OooO0o0 = obj;
        this.f34269OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34268OooO0Oo) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) this.f34270OooO0o0;
                o0OO00O o0oo00o2 = (o0OO00O) this.f34269OooO0o;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    o0oo00o2.OooO0Oo();
                    synchronized (DefaultAudioSink.f7416Oooooo0) {
                        int i = DefaultAudioSink.f7417OoooooO - 1;
                        DefaultAudioSink.f7417OoooooO = i;
                        if (i == 0) {
                            DefaultAudioSink.f7415Oooooo.shutdown();
                            DefaultAudioSink.f7415Oooooo = null;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    o0oo00o2.OooO0Oo();
                    synchronized (DefaultAudioSink.f7416Oooooo0) {
                        int i2 = DefaultAudioSink.f7417OoooooO - 1;
                        DefaultAudioSink.f7417OoooooO = i2;
                        if (i2 == 0) {
                            DefaultAudioSink.f7415Oooooo.shutdown();
                            DefaultAudioSink.f7415Oooooo = null;
                        }
                        throw th;
                    }
                }
            default:
                AppStartTrace appStartTrace = (AppStartTrace) this.f34270OooO0o0;
                TraceMetric.OooO0O0 oooO0O0 = (TraceMetric.OooO0O0) this.f34269OooO0o;
                Timer timer = AppStartTrace.f19943OooOoO;
                appStartTrace.getClass();
                appStartTrace.f19950OooO0o0.OooO0OO(oooO0O0.build(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                return;
        }
    }
}
