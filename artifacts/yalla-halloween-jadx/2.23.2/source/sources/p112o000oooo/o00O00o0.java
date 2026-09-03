package p112o000oooo;

import androidx.annotation.RestrictTo;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p110o000ooo0.o000000O;
import p111o000oooO.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O00o0 extends o000000O.OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f35980OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f35981OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(@NotNull String[] tables, @NotNull oOO00O.OooO00o onInvalidated) {
        super(tables);
        Intrinsics.checkNotNullParameter(tables, "tables");
        Intrinsics.checkNotNullParameter(onInvalidated, "onInvalidated");
        this.f35980OooO0O0 = onInvalidated;
        this.f35981OooO0OO = new AtomicBoolean(false);
    }

    @Override // o000ooo0.o000000O.OooO0OO
    public final void OooO00o(@NotNull Set<String> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.f35980OooO0O0.invoke();
    }
}
