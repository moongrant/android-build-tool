package p047Oooooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0000O extends oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final Function1<Object, Unit> f4140OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final oo00o f4141OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f4142OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f4143OooO0oo;

    public o0O0000O(@Nullable oo00o oo00oVar, @Nullable Function1 function1, boolean z) {
        Function1<Object, Unit> function1OooO0o;
        super(0, o00O0O0.f4079OoooO00);
        this.f4141OooO0o = oo00oVar;
        this.f4142OooO0oO = false;
        this.f4143OooO0oo = z;
        this.f4140OooO = oo0o0O0.OooOO0(function1, (oo00oVar == null || (function1OooO0o = oo00oVar.OooO0o()) == null) ? oo0o0O0.f4155OooO.get().f4066OooO0o : function1OooO0o, false);
    }

    @Override // p047Oooooo0.oo00o
    public final void OooO0OO() {
        oo00o oo00oVar;
        this.f4152OooO0OO = true;
        if (!this.f4143OooO0oo || (oo00oVar = this.f4141OooO0o) == null) {
            return;
        }
        oo00oVar.OooO0OO();
    }

    @Override // p047Oooooo0.oo00o
    public final int OooO0Oo() {
        return OooOo00().OooO0Oo();
    }

    @Override // p047Oooooo0.oo00o
    @Nullable
    public final Function1<Object, Unit> OooO0o() {
        return this.f4140OooO;
    }

    @Override // p047Oooooo0.oo00o
    @NotNull
    public final o00O0O0 OooO0o0() {
        return OooOo00().OooO0o0();
    }

    @Override // p047Oooooo0.oo00o
    public final boolean OooO0oO() {
        return OooOo00().OooO0oO();
    }

    @Override // p047Oooooo0.oo00o
    @Nullable
    public final Function1<Object, Unit> OooO0oo() {
        return null;
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOO0(oo00o snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        o00OOO00.OooO00o();
        throw null;
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOO0O(oo00o snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        o00OOO00.OooO00o();
        throw null;
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOO0o() {
        OooOo00().OooOO0o();
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOOO0(@NotNull o0oOOo state) {
        Intrinsics.checkNotNullParameter(state, "state");
        OooOo00().OooOOO0(state);
    }

    @Override // p047Oooooo0.oo00o
    @NotNull
    public final oo00o OooOOoo(@Nullable Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1OooOO0 = oo0o0O0.OooOO0(function1, this.f4140OooO, true);
        return !this.f4142OooO0oO ? oo0o0O0.OooO0oO(OooOo00().OooOOoo(null), function1OooOO0, true) : OooOo00().OooOOoo(function1OooOO0);
    }

    public final oo00o OooOo00() {
        oo00o oo00oVar = this.f4141OooO0o;
        if (oo00oVar != null) {
            return oo00oVar;
        }
        o00O000 o00o001 = oo0o0O0.f4155OooO.get();
        Intrinsics.checkNotNullExpressionValue(o00o001, "currentGlobalSnapshot.get()");
        return o00o001;
    }
}
