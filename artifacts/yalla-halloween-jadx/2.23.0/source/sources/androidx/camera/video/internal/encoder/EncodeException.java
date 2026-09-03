package androidx.camera.video.internal.encoder;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class EncodeException extends Exception {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorType {
    }

    public EncodeException(@Nullable Throwable th, @Nullable String str) {
        super(str, th);
    }
}
