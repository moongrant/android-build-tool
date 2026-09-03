package p073o000O0oo;

import androidx.annotation.RestrictTo;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.OooOo;
import org.jetbrains.annotations.NotNull;
import p072o000O0oO.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0OoOo0 extends OooOo.OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f34863OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f34864OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(@NotNull String[] tables, @NotNull Oooo0.OooO00o onInvalidated) {
        super(tables);
        Intrinsics.checkNotNullParameter(tables, "tables");
        Intrinsics.checkNotNullParameter(onInvalidated, "onInvalidated");
        this.f34863OooO0O0 = onInvalidated;
        this.f34864OooO0OO = new AtomicBoolean(false);
    }

    @Override // o000O0O0.OooOo.OooO0OO
    public final void OooO00o(@NotNull Set<String> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.f34863OooO0O0.invoke();
    }
}
