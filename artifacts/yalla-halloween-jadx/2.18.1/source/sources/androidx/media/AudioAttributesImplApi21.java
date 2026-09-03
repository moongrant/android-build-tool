package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public AudioAttributes f8551OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f8552OooO0O0 = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f8551OooO00o.equals(((AudioAttributesImplApi21) obj).f8551OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8551OooO00o.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("AudioAttributesCompat: audioattributes=");
        sbOooO0o0.append(this.f8551OooO00o);
        return sbOooO0o0.toString();
    }
}
