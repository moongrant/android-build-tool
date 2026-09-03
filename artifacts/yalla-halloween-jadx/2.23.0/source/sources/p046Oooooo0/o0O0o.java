package p046Oooooo0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o extends o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f2040OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2041OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EncoderProfilesProxy.AudioProfileProxy f2042OooO0OO;

    public static final class OooO00o extends o0oOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f2043OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f2044OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public EncoderProfilesProxy.AudioProfileProxy f2045OooO0OO;

        public final o0O0o OooO00o() {
            String strConcat = this.f2043OooO00o == null ? " mimeType" : "";
            if (this.f2044OooO0O0 == null) {
                strConcat = strConcat.concat(" profile");
            }
            if (strConcat.isEmpty()) {
                return new o0O0o(this.f2043OooO00o, this.f2044OooO0O0.intValue(), this.f2045OooO0OO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
    }

    public o0O0o(String str, int i, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f2040OooO00o = str;
        this.f2041OooO0O0 = i;
        this.f2042OooO0OO = audioProfileProxy;
    }

    @Override // p046Oooooo0.o0O00000
    @NonNull
    public final String OooO00o() {
        return this.f2040OooO00o;
    }

    @Override // p046Oooooo0.o0O00000
    public final int OooO0O0() {
        return this.f2041OooO0O0;
    }

    @Override // p046Oooooo0.o0oOO
    @Nullable
    public final EncoderProfilesProxy.AudioProfileProxy OooO0OO() {
        return this.f2042OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0oOO)) {
            return false;
        }
        o0oOO o0ooo2 = (o0oOO) obj;
        if (this.f2040OooO00o.equals(o0ooo2.OooO00o()) && this.f2041OooO0O0 == o0ooo2.OooO0O0()) {
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f2042OooO0OO;
            if (audioProfileProxy == null) {
                if (o0ooo2.OooO0OO() == null) {
                    return true;
                }
            } else if (audioProfileProxy.equals(o0ooo2.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f2040OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f2041OooO0O0) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f2042OooO0OO;
        return iHashCode ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode());
    }

    public final String toString() {
        return "AudioMimeInfo{mimeType=" + this.f2040OooO00o + ", profile=" + this.f2041OooO0O0 + ", compatibleAudioProfile=" + this.f2042OooO0OO + "}";
    }
}
