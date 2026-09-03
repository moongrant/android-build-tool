package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.InitializationException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface UseCaseConfigFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f3636OooO00o = new OooO00o();

    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public class OooO00o implements UseCaseConfigFactory {
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        @Nullable
        public final Config OooO00o(@NonNull CaptureType captureType, int i) {
            return null;
        }
    }

    public interface OooO0O0 {
        @NonNull
        p022Oooo00O.o00O0O0 OooO00o(@NonNull Context context) throws InitializationException;
    }

    @Nullable
    Config OooO00o(@NonNull CaptureType captureType, int i);
}
