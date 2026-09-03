package p045Oooooo;

import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f1971OooO00o;

    public o000O0Oo(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws InvalidConfigException {
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f1971OooO00o = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(o00O00OO.OooO00o("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }
}
