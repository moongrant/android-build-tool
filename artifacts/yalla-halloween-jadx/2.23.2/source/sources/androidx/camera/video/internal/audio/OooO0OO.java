package androidx.camera.video.internal.audio;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends AudioStream.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f4079OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f4080OooO0O0;

    public OooO0OO(int i, long j) {
        this.f4079OooO00o = i;
        this.f4080OooO0O0 = j;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.OooO0O0
    public final int OooO00o() {
        return this.f4079OooO00o;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream.OooO0O0
    public final long OooO0O0() {
        return this.f4080OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioStream.OooO0O0)) {
            return false;
        }
        AudioStream.OooO0O0 oooO0O0 = (AudioStream.OooO0O0) obj;
        return this.f4079OooO00o == oooO0O0.OooO00o() && this.f4080OooO0O0 == oooO0O0.OooO0O0();
    }

    public final int hashCode() {
        int i = (this.f4079OooO00o ^ 1000003) * 1000003;
        long j = this.f4080OooO0O0;
        return i ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.f4079OooO00o);
        sb.append(", timestampNs=");
        return android.support.v4.media.session.OooO0OO.OooO0O0(sb, this.f4080OooO0O0, "}");
    }
}
