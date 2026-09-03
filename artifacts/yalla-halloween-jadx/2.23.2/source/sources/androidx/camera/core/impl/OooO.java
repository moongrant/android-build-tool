package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends EncoderProfilesProxy.AudioProfileProxy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3549OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f3550OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3551OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f3553OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f3554OooO0o0;

    public OooO(int i, String str, int i2, int i3, int i4, int i5) {
        this.f3549OooO00o = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f3550OooO0O0 = str;
        this.f3551OooO0OO = i2;
        this.f3552OooO0Oo = i3;
        this.f3554OooO0o0 = i4;
        this.f3553OooO0o = i5;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int OooO00o() {
        return this.f3551OooO0OO;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int OooO0O0() {
        return this.f3554OooO0o0;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int OooO0OO() {
        return this.f3549OooO00o;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    @NonNull
    public final String OooO0Oo() {
        return this.f3550OooO0O0;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int OooO0o() {
        return this.f3552OooO0Oo;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public final int OooO0o0() {
        return this.f3553OooO0o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.AudioProfileProxy)) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (EncoderProfilesProxy.AudioProfileProxy) obj;
        return this.f3549OooO00o == audioProfileProxy.OooO0OO() && this.f3550OooO0O0.equals(audioProfileProxy.OooO0Oo()) && this.f3551OooO0OO == audioProfileProxy.OooO00o() && this.f3552OooO0Oo == audioProfileProxy.OooO0o() && this.f3554OooO0o0 == audioProfileProxy.OooO0O0() && this.f3553OooO0o == audioProfileProxy.OooO0o0();
    }

    public final int hashCode() {
        return ((((((((((this.f3549OooO00o ^ 1000003) * 1000003) ^ this.f3550OooO0O0.hashCode()) * 1000003) ^ this.f3551OooO0OO) * 1000003) ^ this.f3552OooO0Oo) * 1000003) ^ this.f3554OooO0o0) * 1000003) ^ this.f3553OooO0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.f3549OooO00o);
        sb.append(", mediaType=");
        sb.append(this.f3550OooO0O0);
        sb.append(", bitrate=");
        sb.append(this.f3551OooO0OO);
        sb.append(", sampleRate=");
        sb.append(this.f3552OooO0Oo);
        sb.append(", channels=");
        sb.append(this.f3554OooO0o0);
        sb.append(", profile=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f3553OooO0o, "}");
    }
}
