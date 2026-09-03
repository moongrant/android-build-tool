package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f6090OooO00o = (AudioAttributes) versionedParcel.OooOO0o(audioAttributesImplApi26.f6090OooO00o, 1);
        audioAttributesImplApi26.f6091OooO0O0 = versionedParcel.OooOO0(audioAttributesImplApi26.f6091OooO0O0, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi26.f6090OooO00o;
        versionedParcel.OooOOOO(1);
        versionedParcel.OooOo0(audioAttributes);
        versionedParcel.OooOo00(audioAttributesImplApi26.f6091OooO0O0, 2);
    }
}
