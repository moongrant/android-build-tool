package androidx.camera.video;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends MediaSpec {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo f3895OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AudioSpec f3896OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3897OooO0OO;

    public static final class OooO00o extends MediaSpec.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOo f3898OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public AudioSpec f3899OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Integer f3900OooO0OO;

        public OooO00o(MediaSpec mediaSpec) {
            this.f3898OooO00o = mediaSpec.OooO0Oo();
            this.f3899OooO0O0 = mediaSpec.OooO0O0();
            this.f3900OooO0OO = Integer.valueOf(mediaSpec.OooO0OO());
        }

        public final OooO0O0 OooO00o() {
            String strOooO00o = this.f3898OooO00o == null ? " videoSpec" : "";
            if (this.f3899OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" audioSpec");
            }
            if (this.f3900OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " outputFormat");
            }
            if (strOooO00o.isEmpty()) {
                return new OooO0O0(this.f3898OooO00o, this.f3899OooO0O0, this.f3900OooO0OO.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final OooO00o OooO0O0(OooOo oooOo) {
            if (oooOo == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f3898OooO00o = oooOo;
            return this;
        }
    }

    public OooO0O0(OooOo oooOo, AudioSpec audioSpec, int i) {
        this.f3895OooO00o = oooOo;
        this.f3896OooO0O0 = audioSpec;
        this.f3897OooO0OO = i;
    }

    @Override // androidx.camera.video.MediaSpec
    @NonNull
    public final AudioSpec OooO0O0() {
        return this.f3896OooO0O0;
    }

    @Override // androidx.camera.video.MediaSpec
    public final int OooO0OO() {
        return this.f3897OooO0OO;
    }

    @Override // androidx.camera.video.MediaSpec
    @NonNull
    public final OooOo OooO0Oo() {
        return this.f3895OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaSpec)) {
            return false;
        }
        MediaSpec mediaSpec = (MediaSpec) obj;
        return this.f3895OooO00o.equals(mediaSpec.OooO0Oo()) && this.f3896OooO0O0.equals(mediaSpec.OooO0O0()) && this.f3897OooO0OO == mediaSpec.OooO0OO();
    }

    public final int hashCode() {
        return ((((this.f3895OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f3896OooO0O0.hashCode()) * 1000003) ^ this.f3897OooO0OO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSpec{videoSpec=");
        sb.append(this.f3895OooO00o);
        sb.append(", audioSpec=");
        sb.append(this.f3896OooO0O0);
        sb.append(", outputFormat=");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f3897OooO0OO, "}");
    }
}
