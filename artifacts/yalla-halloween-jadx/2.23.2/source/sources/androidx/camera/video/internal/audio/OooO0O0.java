package androidx.camera.video.internal.audio;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.video.internal.audio.OooO00o;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o000OO.OooOOO0;
import p028Oooo0oO.o00O0O0;
import p042OooooO0.o00O;
import p042OooooO0.o00OO000;
import p042OooooO0.oOO00O;
import p043OooooOO.o0O00o00;
import p043OooooOO.o0O0O0O;
import p043OooooOO.o0oO0O0o;
import p043OooooOO.o0oO0Ooo;
import p044OooooOo.o0O0O0Oo;
import p044OooooOo.o0O0OOOo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO0O0 implements AudioStream {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Executor f4067OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AudioRecord f4068OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oOO00O f4069OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f4072OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f4074OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public AudioStream.OooO00o f4075OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f4076OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooO00o f4077OooOO0O;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AtomicBoolean f4070OooO0OO = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f4071OooO0Oo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicReference<Boolean> f4073OooO0o0 = new AtomicReference<>(null);

    @RequiresApi(29)
    public class OooO00o extends AudioManager$AudioRecordingCallback {
        public OooO00o() {
        }

        public final void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            Iterator<AudioRecordingConfiguration> it = list.iterator();
            while (it.hasNext()) {
                AudioRecordingConfiguration audioRecordingConfigurationOooO00o = o00O.OooO00o(it.next());
                if (o0O00o00.OooO00o(audioRecordingConfigurationOooO00o) == OooO0O0.this.f4068OooO00o.getAudioSessionId()) {
                    OooO0O0.this.OooO0OO(o0O0O0O.OooO0O0(audioRecordingConfigurationOooO00o));
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public OooO0O0(@NonNull oOO00O ooo00o, @Nullable Context context) throws AudioStream.AudioStreamException, IllegalArgumentException {
        boolean z;
        int iOooO0o0 = ooo00o.OooO0o0();
        int iOooO0Oo = ooo00o.OooO0Oo();
        int iOooO00o = ooo00o.OooO00o();
        if (iOooO0o0 <= 0 || iOooO0Oo <= 0) {
            z = false;
        } else {
            if (AudioRecord.getMinBufferSize(iOooO0o0, iOooO0Oo == 1 ? 16 : 12, iOooO00o) > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(ooo00o.OooO0o0()), Integer.valueOf(ooo00o.OooO0Oo()), Integer.valueOf(ooo00o.OooO00o())));
        }
        this.f4069OooO0O0 = ooo00o;
        this.f4074OooO0oO = ooo00o.OooO0OO();
        int minBufferSize = AudioRecord.getMinBufferSize(ooo00o.OooO0o0(), ooo00o.OooO0Oo() == 1 ? 16 : 12, ooo00o.OooO00o());
        OooOOO0.OooO0o(null, minBufferSize > 0);
        int i = minBufferSize * 2;
        this.f4072OooO0o = i;
        int i2 = Build.VERSION.SDK_INT;
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(ooo00o.OooO0o0()).setChannelMask(ooo00o.OooO0Oo() != 1 ? 12 : 16).setEncoding(ooo00o.OooO00o()).build();
        AudioRecord.Builder builderOooO0O0 = o0oO0Ooo.OooO0O0();
        if (i2 >= 31 && context != null) {
            o0oO0O0o.OooO0OO(builderOooO0O0, context);
        }
        o0oO0Ooo.OooO0Oo(builderOooO0O0, ooo00o.OooO0O0());
        o0oO0Ooo.OooO0OO(builderOooO0O0, audioFormatBuild);
        o0oO0Ooo.OooO0o0(builderOooO0O0, i);
        AudioRecord audioRecordOooO00o = o0oO0Ooo.OooO00o(builderOooO0O0);
        this.f4068OooO00o = audioRecordOooO00o;
        if (audioRecordOooO00o.getState() == 1) {
            return;
        }
        audioRecordOooO00o.release();
        throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void OooO00o(@Nullable AudioStream.OooO00o oooO00o, @Nullable Executor executor) {
        boolean z = true;
        OooOOO0.OooO0o("AudioStream can not be started when setCallback.", !this.f4071OooO0Oo.get());
        OooO0O0();
        if (oooO00o != null && executor == null) {
            z = false;
        }
        OooOOO0.OooO0O0(z, "executor can't be null with non-null callback.");
        this.f4075OooO0oo = oooO00o;
        this.f4067OooO = executor;
        if (Build.VERSION.SDK_INT >= 29) {
            OooO00o oooO00o2 = this.f4077OooOO0O;
            AudioRecord audioRecord = this.f4068OooO00o;
            if (oooO00o2 != null) {
                o0O0O0O.OooO0Oo(audioRecord, oooO00o2);
            }
            if (oooO00o == null) {
                return;
            }
            if (this.f4077OooOO0O == null) {
                this.f4077OooOO0O = new OooO00o();
            }
            o0O0O0O.OooO0OO(audioRecord, executor, this.f4077OooOO0O);
        }
    }

    public final void OooO0O0() {
        OooOOO0.OooO0o("AudioStream has been released.", !this.f4070OooO0OO.get());
    }

    public final void OooO0OO(final boolean z) {
        Executor executor = this.f4067OooO;
        final AudioStream.OooO00o oooO00o = this.f4075OooO0oo;
        if (executor == null || oooO00o == null || Objects.equals(this.f4073OooO0o0.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new Runnable() { // from class: OooooO0.oo0oOO0
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00o2 = OooO00o.this;
                oooO00o2.f4056OooOOo0 = z;
                if (oooO00o2.f4046OooO0oO == OooO00o.OooOO0.STARTED) {
                    oooO00o2.OooO00o();
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public final OooO0OO read(@NonNull ByteBuffer byteBuffer) {
        OooO0O0();
        OooOOO0.OooO0o("AudioStream has not been started.", this.f4071OooO0Oo.get());
        AudioRecord audioRecord = this.f4068OooO00o;
        int i = audioRecord.read(byteBuffer, this.f4072OooO0o);
        long jNanoTime = 0;
        if (i > 0) {
            byteBuffer.limit(i);
            if (Build.VERSION.SDK_INT < 24) {
                jNanoTime = -1;
            } else {
                if (o0O0OOOo.OooO00o(o0O0O0Oo.class) != null) {
                    jNanoTime = -1;
                } else {
                    AudioTimestamp audioTimestamp = new AudioTimestamp();
                    if (o0O00o00.OooO0O0(audioRecord, audioTimestamp, 0) == 0) {
                        long jOooO00o = audioTimestamp.nanoTime + o00OO000.OooO00o(this.f4069OooO0O0.OooO0o0(), this.f4076OooOO0 - audioTimestamp.framePosition);
                        if (jOooO00o >= 0) {
                            jNanoTime = jOooO00o;
                        }
                    } else {
                        o00O0O0.OooO0oo("AudioStreamImpl", "Unable to get audio timestamp");
                        jNanoTime = -1;
                    }
                }
            }
            if (jNanoTime == -1) {
                jNanoTime = System.nanoTime();
            }
            this.f4076OooOO0 = o00OO000.OooO0O0(this.f4074OooO0oO, i) + this.f4076OooOO0;
        }
        return new OooO0OO(i, jNanoTime);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void release() {
        OooO00o oooO00o;
        if (this.f4070OooO0OO.getAndSet(true)) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        AudioRecord audioRecord = this.f4068OooO00o;
        if (i >= 29 && (oooO00o = this.f4077OooOO0O) != null) {
            o0O0O0O.OooO0Oo(audioRecord, oooO00o);
        }
        audioRecord.release();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void start() throws AudioStream.AudioStreamException {
        OooO0O0();
        AtomicBoolean atomicBoolean = this.f4071OooO0Oo;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        AudioRecord audioRecord = this.f4068OooO00o;
        audioRecord.startRecording();
        boolean z = false;
        if (audioRecord.getRecordingState() != 3) {
            atomicBoolean.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + audioRecord.getRecordingState());
        }
        this.f4076OooOO0 = 0L;
        this.f4073OooO0o0.set(null);
        if (Build.VERSION.SDK_INT >= 29) {
            AudioRecordingConfiguration audioRecordingConfigurationOooO00o = o0O0O0O.OooO00o(audioRecord);
            z = audioRecordingConfigurationOooO00o != null && o0O0O0O.OooO0O0(audioRecordingConfigurationOooO00o);
        }
        OooO0OO(z);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public final void stop() {
        OooO0O0();
        if (this.f4071OooO0Oo.getAndSet(false)) {
            AudioRecord audioRecord = this.f4068OooO00o;
            audioRecord.stop();
            if (audioRecord.getRecordingState() != 1) {
                o00O0O0.OooO0oo("AudioStreamImpl", "Failed to stop AudioRecord with state: " + audioRecord.getRecordingState());
            }
        }
    }
}
