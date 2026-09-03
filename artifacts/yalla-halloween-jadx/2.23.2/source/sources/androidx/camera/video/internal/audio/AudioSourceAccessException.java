package androidx.camera.video.internal.audio;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class AudioSourceAccessException extends Exception {
    public AudioSourceAccessException(@Nullable Exception exc) {
        super("Unable to create AudioStream", exc);
    }
}
