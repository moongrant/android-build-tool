package p047Oooooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO extends oo00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Function1<Object, Unit> f4076OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f4077OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(int i, @NotNull o00O0O0 invalid, @Nullable Function1<Object, Unit> function1) {
        super(i, invalid);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        this.f4076OooO0o = function1;
        this.f4077OooO0oO = 1;
    }

    @Override // p047Oooooo0.oo00o
    public final void OooO0OO() {
        if (this.f4152OooO0OO) {
            return;
        }
        Intrinsics.checkNotNullParameter(this, "snapshot");
        int i = this.f4077OooO0oO - 1;
        this.f4077OooO0oO = i;
        if (i == 0) {
            OooO00o();
        }
        super.OooO0OO();
    }

    @Override // p047Oooooo0.oo00o
    @Nullable
    public final Function1<Object, Unit> OooO0o() {
        return this.f4076OooO0o;
    }

    @Override // p047Oooooo0.oo00o
    public final boolean OooO0oO() {
        return true;
    }

    @Override // p047Oooooo0.oo00o
    @Nullable
    public final Function1<Object, Unit> OooO0oo() {
        return null;
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOO0(@NotNull oo00o snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.f4077OooO0oO++;
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOO0O(@NotNull oo00o snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i = this.f4077OooO0oO - 1;
        this.f4077OooO0oO = i;
        if (i == 0) {
            OooO00o();
        }
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOO0o() {
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOOO0(@NotNull o0oOOo state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // p047Oooooo0.oo00o
    @NotNull
    public final oo00o OooOOoo(@Nullable Function1<Object, Unit> function1) {
        oo0o0O0.OooO0Oo(this);
        return new o00O00O(this.f4151OooO0O0, this.f4150OooO00o, function1, this);
    }
}
