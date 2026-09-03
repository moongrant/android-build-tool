package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class InvalidConfigException extends Exception {
    public InvalidConfigException() {
        super("Unknown encoder config type");
    }

    public InvalidConfigException(@Nullable String str, @Nullable Exception exc) {
        super(str, exc);
    }

    public InvalidConfigException(@Nullable MediaCodec.CodecException codecException) {
        super(codecException);
    }
}
