package p076o000OOo;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class OooOo00<T> extends OooOO0<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(@NotNull Function0<? extends T> defaultFactory) {
        super(defaultFactory, null);
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
    }
}
