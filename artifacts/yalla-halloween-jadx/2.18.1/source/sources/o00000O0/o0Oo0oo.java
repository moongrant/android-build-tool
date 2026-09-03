package o00000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f26957OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function2<T, T, T> f26958OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0Oo0oo(@NotNull String name, @NotNull Function2<? super T, ? super T, ? extends T> mergePolicy) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mergePolicy, "mergePolicy");
        this.f26957OooO00o = name;
        this.f26958OooO0O0 = mergePolicy;
    }

    public final void OooO00o(@NotNull o0OO00O thisRef, @NotNull KProperty<?> property, T t) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        thisRef.OooO00o(this, t);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SemanticsPropertyKey: ");
        sbOooO0o0.append(this.f26957OooO00o);
        return sbOooO0o0.toString();
    }
}
