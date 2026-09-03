package p418o0Oo0oo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
public final class o0000O0O implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public o00000O f39687Oooo0o;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        o00000O o00000o = this.f39687Oooo0o;
        if (o00000o != null) {
            o00000o.f39673Oooo0oo = zBooleanValue;
        }
        return Unit.INSTANCE;
    }
}
