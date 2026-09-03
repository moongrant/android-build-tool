package p483o0o000O0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.manager.GeetCodeManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40874OooO0OO;

    public OooOo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40874OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        GeetCodeManager.INSTANCE.init(this.f40874OooO0OO);
    }
}
