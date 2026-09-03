package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface AudioStream {

    public static class AudioStreamException extends Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(@NonNull Exception exc) {
            super(exc);
        }
    }

    public interface OooO00o {
    }

    @AutoValue
    public static abstract class OooO0O0 {
        public abstract int OooO00o();

        public abstract long OooO0O0();
    }

    void OooO00o(@Nullable OooO00o oooO00o, @Nullable Executor executor);

    @NonNull
    OooO0OO read(@NonNull ByteBuffer byteBuffer);

    void release();

    void start() throws IllegalStateException, AudioStreamException;

    void stop() throws IllegalStateException;
}
