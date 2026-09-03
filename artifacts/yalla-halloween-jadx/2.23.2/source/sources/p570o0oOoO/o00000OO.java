package p570o0oOoO;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f56416OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f56417OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final String f56418OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f56419OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f56420OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f56421OooO0o0;

    public o00000OO(long j, @NotNull String roomImage, @NotNull String roomName, long j2) {
        Intrinsics.checkNotNullParameter(roomImage, "roomImage");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        this.f56416OooO00o = j;
        this.f56417OooO0O0 = roomImage;
        this.f56418OooO0OO = roomName;
        this.f56419OooO0Oo = j2;
        this.f56420OooO0o = System.currentTimeMillis();
    }
}
