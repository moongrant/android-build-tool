package p504o0o00oO0;

import android.graphics.drawable.NinePatchDrawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class y {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f50301OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f50302OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState<File> f50303OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public File f50304OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public File f50305OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public NinePatchDrawable f50306OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public File f50307OooO0oO;

    public y(int i, int i2) {
        this.f50301OooO00o = i;
        this.f50302OooO0O0 = i2;
    }

    @NotNull
    public final String toString() {
        return "RoomEnterTipsShowEntity(effectsIndex1=" + this.f50301OooO00o + ", effectsIndex2=" + this.f50302OooO0O0 + ", carDisplay=" + this.f50303OooO0OO + ", badge=" + this.f50304OooO0Oo + ", background=" + this.f50306OooO0o0 + ", effects1=" + this.f50305OooO0o + ", effects2=" + this.f50307OooO0oO + ")";
    }
}
