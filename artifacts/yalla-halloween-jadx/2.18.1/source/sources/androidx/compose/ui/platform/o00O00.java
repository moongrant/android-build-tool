package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class o00O00 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Function1<o00O000o, Unit> f6456Oooo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public o00O00(@NotNull Function1<? super o00O000o, Unit> info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f6456Oooo0o = info;
    }
}
