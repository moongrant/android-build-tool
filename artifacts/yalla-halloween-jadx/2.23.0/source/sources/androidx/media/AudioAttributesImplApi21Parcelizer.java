package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f6063OooO00o = (AudioAttributes) versionedParcel.OooOO0o(audioAttributesImplApi21.f6063OooO00o, 1);
        audioAttributesImplApi21.f6064OooO0O0 = versionedParcel.OooOO0(audioAttributesImplApi21.f6064OooO0O0, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f6063OooO00o;
        versionedParcel.OooOOOO(1);
        versionedParcel.OooOo0(audioAttributes);
        versionedParcel.OooOo00(audioAttributesImplApi21.f6064OooO0O0, 2);
    }
}
