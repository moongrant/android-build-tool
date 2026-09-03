package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        p113o00O00Oo.OooOo oooOoOooOOO = audioAttributesCompat.f6089OooO00o;
        if (versionedParcel.OooO0oo(1)) {
            oooOoOooOOO = versionedParcel.OooOOO();
        }
        audioAttributesCompat.f6089OooO00o = (AudioAttributesImpl) oooOoOooOOO;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f6089OooO00o;
        versionedParcel.OooOOOO(1);
        versionedParcel.OooOo0o(audioAttributesImpl);
    }
}
