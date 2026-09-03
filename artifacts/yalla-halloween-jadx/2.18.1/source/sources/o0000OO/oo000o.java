package o0000OO;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends OooO0OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Object f27421OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(@NotNull Object id, int i, @NotNull List<Function1<o00000, Unit>> tasks) {
        super(tasks, i);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f27421OooO0OO = id;
    }
}
