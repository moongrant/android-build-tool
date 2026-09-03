package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class ImageCaptureException extends Exception {
    public ImageCaptureException(@Nullable Throwable th, @NonNull String str) {
        super(str, th);
    }
}
