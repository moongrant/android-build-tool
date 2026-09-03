package p045Oooooo;

import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOOO0 extends o000O0Oo {
    public OooOOO0(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws InvalidConfigException {
        super(mediaCodecInfo, str);
        Objects.requireNonNull(this.f1960OooO00o.getAudioCapabilities());
    }
}
