package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import o000O00O.o00OO00O;
import p071o000O0o0.oo000o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultRenderersFactory implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f7105OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final androidx.media3.exoplayer.mediacodec.OooO0O0 f7106OooO0O0 = new androidx.media3.exoplayer.mediacodec.OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f7107OooO0OO;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.f7105OooO00o = context;
    }

    @Override // o000O00O.o00OO00O
    public final Renderer[] OooO00o(Handler handler, OooO.OooO0O0 oooO0O0, OooO.OooO0O0 oooO0O1, OooO.OooO0O0 oooO0O2, OooO.OooO0O0 oooO0O3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o000OOO.OooO(this.f7105OooO00o, this.f7106OooO0O0, this.f7107OooO0OO, handler, oooO0O0));
        DefaultAudioSink.OooO oooO = new DefaultAudioSink.OooO(this.f7105OooO00o);
        oooO.f7474OooO0Oo = false;
        oooO.f7476OooO0o0 = false;
        oooO.f7475OooO0o = 0;
        if (oooO.f7473OooO0OO == null) {
            oooO.f7473OooO0OO = new DefaultAudioSink.OooOO0O(new AudioProcessor[0]);
        }
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(oooO);
        arrayList.add(new androidx.media3.exoplayer.audio.OooO(this.f7105OooO00o, this.f7106OooO0O0, this.f7107OooO0OO, handler, oooO0O1, defaultAudioSink));
        arrayList.add(new o000OO00.OooO0o(oooO0O2, handler.getLooper()));
        arrayList.add(new oo000o(oooO0O3, handler.getLooper()));
        arrayList.add(new o000OOo0.OooO0O0());
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }
}
