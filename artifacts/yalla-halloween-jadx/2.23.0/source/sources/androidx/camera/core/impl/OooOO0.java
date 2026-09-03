package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends EncoderProfilesProxy.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3569OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f3570OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<EncoderProfilesProxy.AudioProfileProxy> f3571OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<EncoderProfilesProxy.VideoProfileProxy> f3572OooO0Oo;

    public OooOO0(int i, int i2, List<EncoderProfilesProxy.AudioProfileProxy> list, List<EncoderProfilesProxy.VideoProfileProxy> list2) {
        this.f3569OooO00o = i;
        this.f3570OooO0O0 = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f3571OooO0OO = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f3572OooO0Oo = list2;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int OooO00o() {
        return this.f3569OooO00o;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @NonNull
    public final List<EncoderProfilesProxy.VideoProfileProxy> OooO0O0() {
        return this.f3572OooO0Oo;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int OooO0OO() {
        return this.f3570OooO0O0;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @NonNull
    public final List<EncoderProfilesProxy.AudioProfileProxy> OooO0Oo() {
        return this.f3571OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.OooO00o)) {
            return false;
        }
        EncoderProfilesProxy.OooO00o oooO00o = (EncoderProfilesProxy.OooO00o) obj;
        if (this.f3569OooO00o == ((OooOO0) oooO00o).f3569OooO00o) {
            OooOO0 oooOO1 = (OooOO0) oooO00o;
            if (this.f3570OooO0O0 == oooOO1.f3570OooO0O0 && this.f3571OooO0OO.equals(oooOO1.f3571OooO0OO) && this.f3572OooO0Oo.equals(oooOO1.f3572OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3569OooO00o ^ 1000003) * 1000003) ^ this.f3570OooO0O0) * 1000003) ^ this.f3571OooO0OO.hashCode()) * 1000003) ^ this.f3572OooO0Oo.hashCode();
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f3569OooO00o + ", recommendedFileFormat=" + this.f3570OooO0O0 + ", audioProfiles=" + this.f3571OooO0OO + ", videoProfiles=" + this.f3572OooO0Oo + "}";
    }
}
