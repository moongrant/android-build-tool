package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6065OooO00o = versionedParcel.OooOO0(audioAttributesImplBase.f6065OooO00o, 1);
        audioAttributesImplBase.f6066OooO0O0 = versionedParcel.OooOO0(audioAttributesImplBase.f6066OooO0O0, 2);
        audioAttributesImplBase.f6067OooO0OO = versionedParcel.OooOO0(audioAttributesImplBase.f6067OooO0OO, 3);
        audioAttributesImplBase.f6068OooO0Oo = versionedParcel.OooOO0(audioAttributesImplBase.f6068OooO0Oo, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        versionedParcel.OooOo00(audioAttributesImplBase.f6065OooO00o, 1);
        versionedParcel.OooOo00(audioAttributesImplBase.f6066OooO0O0, 2);
        versionedParcel.OooOo00(audioAttributesImplBase.f6067OooO0OO, 3);
        versionedParcel.OooOo00(audioAttributesImplBase.f6068OooO0Oo, 4);
    }
}
