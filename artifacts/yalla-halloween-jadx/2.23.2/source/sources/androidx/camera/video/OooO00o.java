package androidx.camera.video;

import android.util.Range;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends AudioSpec {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Range<Integer> f3885OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3886OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Range<Integer> f3887OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f3888OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f3889OooO0oO;

    /* JADX INFO: renamed from: androidx.camera.video.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0016OooO00o extends AudioSpec.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Range<Integer> f3890OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f3891OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f3892OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Range<Integer> f3893OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f3894OooO0o0;

        public final OooO00o OooO00o() {
            String strOooO00o = this.f3890OooO00o == null ? " bitrate" : "";
            if (this.f3891OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" sourceFormat");
            }
            if (this.f3892OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " source");
            }
            if (this.f3893OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " sampleRate");
            }
            if (this.f3894OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " channelCount");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO00o(this.f3890OooO00o, this.f3891OooO0O0.intValue(), this.f3892OooO0OO.intValue(), this.f3893OooO0Oo, this.f3894OooO0o0.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooO00o(Range range, int i, int i2, Range range2, int i3) {
        this.f3885OooO0OO = range;
        this.f3886OooO0Oo = i;
        this.f3888OooO0o0 = i2;
        this.f3887OooO0o = range2;
        this.f3889OooO0oO = i3;
    }

    @Override // androidx.camera.video.AudioSpec
    @NonNull
    public final Range<Integer> OooO0O0() {
        return this.f3885OooO0OO;
    }

    @Override // androidx.camera.video.AudioSpec
    public final int OooO0OO() {
        return this.f3889OooO0oO;
    }

    @Override // androidx.camera.video.AudioSpec
    @NonNull
    public final Range<Integer> OooO0Oo() {
        return this.f3887OooO0o;
    }

    @Override // androidx.camera.video.AudioSpec
    public final int OooO0o() {
        return this.f3886OooO0Oo;
    }

    @Override // androidx.camera.video.AudioSpec
    public final int OooO0o0() {
        return this.f3888OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSpec)) {
            return false;
        }
        AudioSpec audioSpec = (AudioSpec) obj;
        return this.f3885OooO0OO.equals(audioSpec.OooO0O0()) && this.f3886OooO0Oo == audioSpec.OooO0o() && this.f3888OooO0o0 == audioSpec.OooO0o0() && this.f3887OooO0o.equals(audioSpec.OooO0Oo()) && this.f3889OooO0oO == audioSpec.OooO0OO();
    }

    public final int hashCode() {
        return ((((((((this.f3885OooO0OO.hashCode() ^ 1000003) * 1000003) ^ this.f3886OooO0Oo) * 1000003) ^ this.f3888OooO0o0) * 1000003) ^ this.f3887OooO0o.hashCode()) * 1000003) ^ this.f3889OooO0oO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.f3885OooO0OO);
        sb.append(", sourceFormat=");
        sb.append(this.f3886OooO0Oo);
        sb.append(", source=");
        sb.append(this.f3888OooO0o0);
        sb.append(", sampleRate=");
        sb.append(this.f3887OooO0o);
        sb.append(", channelCount=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f3889OooO0oO, "}");
    }
}
