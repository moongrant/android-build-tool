package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f8553OooO00o = versionedParcel.OooOO0O(audioAttributesImplBase.f8553OooO00o, 1);
        audioAttributesImplBase.f8554OooO0O0 = versionedParcel.OooOO0O(audioAttributesImplBase.f8554OooO0O0, 2);
        audioAttributesImplBase.f8555OooO0OO = versionedParcel.OooOO0O(audioAttributesImplBase.f8555OooO0OO, 3);
        audioAttributesImplBase.f8556OooO0Oo = versionedParcel.OooOO0O(audioAttributesImplBase.f8556OooO0Oo, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        versionedParcel.OooOo0(audioAttributesImplBase.f8553OooO00o, 1);
        versionedParcel.OooOo0(audioAttributesImplBase.f8554OooO0O0, 2);
        versionedParcel.OooOo0(audioAttributesImplBase.f8555OooO0OO, 3);
        versionedParcel.OooOo0(audioAttributesImplBase.f8556OooO0Oo, 4);
    }
}
