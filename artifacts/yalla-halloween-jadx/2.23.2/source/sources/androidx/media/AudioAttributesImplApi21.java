package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributes f6090OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f6091OooO0O0 = -1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public AudioAttributesImplApi21() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f6090OooO00o.equals(((AudioAttributesImplApi21) obj).f6090OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6090OooO00o.hashCode();
    }

    @NonNull
    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f6090OooO00o;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f6090OooO00o = audioAttributes;
    }
}
