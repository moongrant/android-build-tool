package p041Ooooo0o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1769OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1770OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<EncoderProfilesProxy.AudioProfileProxy> f1771OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<EncoderProfilesProxy.VideoProfileProxy> f1772OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final EncoderProfilesProxy.VideoProfileProxy f1773OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final EncoderProfilesProxy.AudioProfileProxy f1774OooO0o0;

    public o000OOo(int i, int i2, List<EncoderProfilesProxy.AudioProfileProxy> list, List<EncoderProfilesProxy.VideoProfileProxy> list2, @Nullable EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.f1769OooO00o = i;
        this.f1770OooO0O0 = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f1771OooO0OO = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f1772OooO0Oo = list2;
        this.f1774OooO0o0 = audioProfileProxy;
        if (videoProfileProxy == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f1773OooO0o = videoProfileProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int OooO00o() {
        return this.f1769OooO00o;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @NonNull
    public final List<EncoderProfilesProxy.VideoProfileProxy> OooO0O0() {
        return this.f1772OooO0Oo;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int OooO0OO() {
        return this.f1770OooO0O0;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @NonNull
    public final List<EncoderProfilesProxy.AudioProfileProxy> OooO0Oo() {
        return this.f1771OooO0OO;
    }

    @Override // p041Ooooo0o.o00000OO
    @NonNull
    public final EncoderProfilesProxy.VideoProfileProxy OooO0o() {
        return this.f1773OooO0o;
    }

    @Override // p041Ooooo0o.o00000OO
    @Nullable
    public final EncoderProfilesProxy.AudioProfileProxy OooO0o0() {
        return this.f1774OooO0o0;
    }

    public final boolean equals(Object obj) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00000OO)) {
            return false;
        }
        o00000OO o00000oo2 = (o00000OO) obj;
        if (this.f1769OooO00o == ((o000OOo) o00000oo2).f1769OooO00o) {
            o000OOo o000ooo2 = (o000OOo) o00000oo2;
            if (this.f1770OooO0O0 == o000ooo2.f1770OooO0O0 && this.f1771OooO0OO.equals(o000ooo2.f1771OooO0OO) && this.f1772OooO0Oo.equals(o000ooo2.f1772OooO0Oo) && ((audioProfileProxy = this.f1774OooO0o0) != null ? audioProfileProxy.equals(o00000oo2.OooO0o0()) : o00000oo2.OooO0o0() == null) && this.f1773OooO0o.equals(o00000oo2.OooO0o())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f1769OooO00o ^ 1000003) * 1000003) ^ this.f1770OooO0O0) * 1000003) ^ this.f1771OooO0OO.hashCode()) * 1000003) ^ this.f1772OooO0Oo.hashCode()) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f1774OooO0o0;
        return ((iHashCode ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode())) * 1000003) ^ this.f1773OooO0o.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f1769OooO00o + ", recommendedFileFormat=" + this.f1770OooO0O0 + ", audioProfiles=" + this.f1771OooO0OO + ", videoProfiles=" + this.f1772OooO0Oo + ", defaultAudioProfile=" + this.f1774OooO0o0 + ", defaultVideoProfile=" + this.f1773OooO0o + "}";
    }
}
