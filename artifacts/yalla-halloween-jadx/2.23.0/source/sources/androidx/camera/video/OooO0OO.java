package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import p039OoooOoo.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends OooOO0O.OooOOO0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00oOoo f3901OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Executor f3902OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o000OO.OooO00o<VideoRecordEvent> f3903OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f3904OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f3905OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final long f3906OooOOOO;

    public OooO0OO(o00oOoo o00oooo2, @Nullable Executor executor, @Nullable o000OO.OooO00o oooO00o, boolean z, long j) {
        if (o00oooo2 == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f3901OooOO0 = o00oooo2;
        this.f3902OooOO0O = executor;
        this.f3903OooOO0o = oooO00o;
        this.f3905OooOOO0 = z;
        this.f3904OooOOO = false;
        this.f3906OooOOOO = j;
    }

    @Override // androidx.camera.video.OooOO0O.OooOOO0
    @Nullable
    public final Executor OooO0oO() {
        return this.f3902OooOO0O;
    }

    @Override // androidx.camera.video.OooOO0O.OooOOO0
    @NonNull
    public final o00oOoo OooOOo() {
        return this.f3901OooOO0;
    }

    @Override // androidx.camera.video.OooOO0O.OooOOO0
    @Nullable
    public final o000OO.OooO00o<VideoRecordEvent> OooOOo0() {
        return this.f3903OooOO0o;
    }

    @Override // androidx.camera.video.OooOO0O.OooOOO0
    public final boolean OooOo0() {
        return this.f3905OooOOO0;
    }

    @Override // androidx.camera.video.OooOO0O.OooOOO0
    public final long OooOo00() {
        return this.f3906OooOOOO;
    }

    @Override // androidx.camera.video.OooOO0O.OooOOO0
    public final boolean OooOooO() {
        return this.f3904OooOOO;
    }

    public final boolean equals(Object obj) {
        Executor executor;
        o000OO.OooO00o<VideoRecordEvent> oooO00o;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O.OooOOO0)) {
            return false;
        }
        OooOO0O.OooOOO0 oooOOO0 = (OooOO0O.OooOOO0) obj;
        return this.f3901OooOO0.equals(oooOOO0.OooOOo()) && ((executor = this.f3902OooOO0O) != null ? executor.equals(oooOOO0.OooO0oO()) : oooOOO0.OooO0oO() == null) && ((oooO00o = this.f3903OooOO0o) != null ? oooO00o.equals(oooOOO0.OooOOo0()) : oooOOO0.OooOOo0() == null) && this.f3905OooOOO0 == oooOOO0.OooOo0() && this.f3904OooOOO == oooOOO0.OooOooO() && this.f3906OooOOOO == oooOOO0.OooOo00();
    }

    public final int hashCode() {
        int iHashCode = (this.f3901OooOO0.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f3902OooOO0O;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        o000OO.OooO00o<VideoRecordEvent> oooO00o = this.f3903OooOO0o;
        int iHashCode3 = (((iHashCode2 ^ (oooO00o != null ? oooO00o.hashCode() : 0)) * 1000003) ^ (this.f3905OooOOO0 ? 1231 : 1237)) * 1000003;
        int i = this.f3904OooOOO ? 1231 : 1237;
        long j = this.f3906OooOOOO;
        return ((iHashCode3 ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.f3901OooOO0);
        sb.append(", getCallbackExecutor=");
        sb.append(this.f3902OooOO0O);
        sb.append(", getEventListener=");
        sb.append(this.f3903OooOO0o);
        sb.append(", hasAudioEnabled=");
        sb.append(this.f3905OooOOO0);
        sb.append(", isPersistent=");
        sb.append(this.f3904OooOOO);
        sb.append(", getRecordingId=");
        return android.support.v4.media.session.OooO0o.OooO0O0(sb, this.f3906OooOOOO, "}");
    }
}
