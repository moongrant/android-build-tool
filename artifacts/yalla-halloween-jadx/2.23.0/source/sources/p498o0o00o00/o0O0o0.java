package p498o0o00o00;

import android.graphics.drawable.NinePatchDrawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f49321OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f49322OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState<File> f49323OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public File f49324OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public File f49325OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public NinePatchDrawable f49326OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public File f49327OooO0oO;

    public o0O0o0(int i, int i2) {
        this.f49321OooO00o = i;
        this.f49322OooO0O0 = i2;
    }

    @NotNull
    public final String toString() {
        return "RoomEnterTipsShowEntity(effectsIndex1=" + this.f49321OooO00o + ", effectsIndex2=" + this.f49322OooO0O0 + ", carDisplay=" + this.f49323OooO0OO + ", badge=" + this.f49324OooO0Oo + ", background=" + this.f49326OooO0o0 + ", effects1=" + this.f49325OooO0o + ", effects2=" + this.f49327OooO0oO + ")";
    }
}
