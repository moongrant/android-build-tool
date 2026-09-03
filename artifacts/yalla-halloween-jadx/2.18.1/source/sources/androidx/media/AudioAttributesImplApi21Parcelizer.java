package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f8551OooO00o = (AudioAttributes) versionedParcel.OooOOO0(audioAttributesImplApi21.f8551OooO00o, 1);
        audioAttributesImplApi21.f8552OooO0O0 = versionedParcel.OooOO0O(audioAttributesImplApi21.f8552OooO0O0, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        versionedParcel.OooOo0o(audioAttributesImplApi21.f8551OooO00o, 1);
        versionedParcel.OooOo0(audioAttributesImplApi21.f8552OooO0O0, 2);
    }
}
