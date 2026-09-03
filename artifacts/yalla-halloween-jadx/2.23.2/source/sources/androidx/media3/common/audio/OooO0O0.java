package androidx.media3.common.audio;

import androidx.annotation.CallSuper;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class OooO0O0 implements AudioProcessor {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AudioProcessor.OooO00o f6740OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AudioProcessor.OooO00o f6741OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public AudioProcessor.OooO00o f6742OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ByteBuffer f6743OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AudioProcessor.OooO00o f6744OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ByteBuffer f6745OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f6746OooO0oo;

    public OooO0O0() {
        ByteBuffer byteBuffer = AudioProcessor.f6730OooO00o;
        this.f6743OooO0o = byteBuffer;
        this.f6745OooO0oO = byteBuffer;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f6731OooO0o0;
        this.f6742OooO0Oo = oooO00o;
        this.f6744OooO0o0 = oooO00o;
        this.f6740OooO0O0 = oooO00o;
        this.f6741OooO0OO = oooO00o;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @CanIgnoreReturnValue
    public final AudioProcessor.OooO00o OooO(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException {
        this.f6742OooO0Oo = oooO00o;
        this.f6744OooO0o0 = OooO00o(oooO00o);
        return isActive() ? this.f6744OooO0o0 : AudioProcessor.OooO00o.f6731OooO0o0;
    }

    @CanIgnoreReturnValue
    public abstract AudioProcessor.OooO00o OooO00o(AudioProcessor.OooO00o oooO00o) throws AudioProcessor.UnhandledAudioFormatException;

    public void OooO0O0() {
    }

    public void OooO0OO() {
    }

    public void OooO0Oo() {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @CallSuper
    public ByteBuffer OooO0o() {
        ByteBuffer byteBuffer = this.f6745OooO0oO;
        this.f6745OooO0oO = AudioProcessor.f6730OooO00o;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    @CallSuper
    public boolean OooO0o0() {
        return this.f6746OooO0oo && this.f6745OooO0oO == AudioProcessor.f6730OooO00o;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void OooO0oo() {
        this.f6746OooO0oo = true;
        OooO0OO();
    }

    public final ByteBuffer OooOO0(int i) {
        if (this.f6743OooO0o.capacity() < i) {
            this.f6743OooO0o = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f6743OooO0o.clear();
        }
        ByteBuffer byteBuffer = this.f6743OooO0o;
        this.f6745OooO0oO = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f6745OooO0oO = AudioProcessor.f6730OooO00o;
        this.f6746OooO0oo = false;
        this.f6740OooO0O0 = this.f6742OooO0Oo;
        this.f6741OooO0OO = this.f6744OooO0o0;
        OooO0O0();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f6744OooO0o0 != AudioProcessor.OooO00o.f6731OooO0o0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f6743OooO0o = AudioProcessor.f6730OooO00o;
        AudioProcessor.OooO00o oooO00o = AudioProcessor.OooO00o.f6731OooO0o0;
        this.f6742OooO0Oo = oooO00o;
        this.f6744OooO0o0 = oooO00o;
        this.f6740OooO0O0 = oooO00o;
        this.f6741OooO0OO = oooO00o;
        OooO0Oo();
    }
}
