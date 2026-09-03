package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends EncoderProfilesProxy.VideoProfileProxy {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f3573OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3574OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f3575OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3576OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3577OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f3578OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f3579OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f3580OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f3581OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f3582OooOO0;

    public OooOO0O(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f3574OooO00o = i;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f3575OooO0O0 = str;
        this.f3576OooO0OO = i2;
        this.f3577OooO0Oo = i3;
        this.f3579OooO0o0 = i4;
        this.f3578OooO0o = i5;
        this.f3580OooO0oO = i6;
        this.f3581OooO0oo = i7;
        this.f3573OooO = i8;
        this.f3582OooOO0 = i9;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    @NonNull
    public final String OooO() {
        return this.f3575OooO0O0;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooO0O0() {
        return this.f3581OooO0oo;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooO0OO() {
        return this.f3576OooO0OO;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooO0Oo() {
        return this.f3573OooO;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooO0o() {
        return this.f3577OooO0Oo;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooO0o0() {
        return this.f3574OooO00o;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooO0oO() {
        return this.f3582OooOO0;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooO0oo() {
        return this.f3578OooO0o;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooOO0() {
        return this.f3580OooO0oO;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy
    public final int OooOO0O() {
        return this.f3579OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EncoderProfilesProxy.VideoProfileProxy)) {
            return false;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
        return this.f3574OooO00o == videoProfileProxy.OooO0o0() && this.f3575OooO0O0.equals(videoProfileProxy.OooO()) && this.f3576OooO0OO == videoProfileProxy.OooO0OO() && this.f3577OooO0Oo == videoProfileProxy.OooO0o() && this.f3579OooO0o0 == videoProfileProxy.OooOO0O() && this.f3578OooO0o == videoProfileProxy.OooO0oo() && this.f3580OooO0oO == videoProfileProxy.OooOO0() && this.f3581OooO0oo == videoProfileProxy.OooO0O0() && this.f3573OooO == videoProfileProxy.OooO0Oo() && this.f3582OooOO0 == videoProfileProxy.OooO0oO();
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f3574OooO00o ^ 1000003) * 1000003) ^ this.f3575OooO0O0.hashCode()) * 1000003) ^ this.f3576OooO0OO) * 1000003) ^ this.f3577OooO0Oo) * 1000003) ^ this.f3579OooO0o0) * 1000003) ^ this.f3578OooO0o) * 1000003) ^ this.f3580OooO0oO) * 1000003) ^ this.f3581OooO0oo) * 1000003) ^ this.f3573OooO) * 1000003) ^ this.f3582OooOO0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
        sb.append(this.f3574OooO00o);
        sb.append(", mediaType=");
        sb.append(this.f3575OooO0O0);
        sb.append(", bitrate=");
        sb.append(this.f3576OooO0OO);
        sb.append(", frameRate=");
        sb.append(this.f3577OooO0Oo);
        sb.append(", width=");
        sb.append(this.f3579OooO0o0);
        sb.append(", height=");
        sb.append(this.f3578OooO0o);
        sb.append(", profile=");
        sb.append(this.f3580OooO0oO);
        sb.append(", bitDepth=");
        sb.append(this.f3581OooO0oo);
        sb.append(", chromaSubsampling=");
        sb.append(this.f3573OooO);
        sb.append(", hdrFormat=");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f3582OooOO0, "}");
    }
}
