package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object objOooOOOO = audioAttributesCompat.f8550OooO00o;
        if (versionedParcel.OooO(1)) {
            objOooOOOO = versionedParcel.OooOOOO();
        }
        audioAttributesCompat.f8550OooO00o = (AudioAttributesImpl) objOooOOOO;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f8550OooO00o;
        versionedParcel.OooOOOo(1);
        versionedParcel.OooOoO0(audioAttributesImpl);
    }
}
