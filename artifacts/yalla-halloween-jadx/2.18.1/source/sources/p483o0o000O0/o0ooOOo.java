package p483o0o000O0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.commonsdk.UMConfigure;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0ooOOo extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40880OooO0OO;

    public o0ooOOo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40880OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        UMConfigure.preInit(this.f40880OooO0OO, null, null);
    }
}
