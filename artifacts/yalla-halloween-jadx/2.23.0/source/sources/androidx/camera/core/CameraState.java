package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class CameraState {

    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    @AutoValue
    public static abstract class OooO00o {
        @Nullable
        public abstract Throwable OooO00o();

        public abstract int OooO0O0();
    }

    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    @Nullable
    public abstract OooO00o OooO00o();

    @NonNull
    public abstract Type OooO0O0();
}
