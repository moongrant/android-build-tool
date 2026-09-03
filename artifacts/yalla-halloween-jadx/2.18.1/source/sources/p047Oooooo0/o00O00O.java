package p047Oooooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00O extends oo00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final oo00o f4072OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Function1<Object, Unit> f4073OooO0oO;

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f4074Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f4075Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
            super(1);
            this.f4074Oooo0o = function1;
            this.f4075Oooo0oO = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f4074Oooo0o.invoke(state);
            this.f4075Oooo0oO.invoke(state);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(int i, @NotNull o00O0O0 invalid, @Nullable Function1<Object, Unit> function1, @NotNull oo00o parent) {
        super(i, invalid);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f4072OooO0o = parent;
        parent.OooOO0(this);
        if (function1 != null) {
            Function1<Object, Unit> function1OooO0o = parent.OooO0o();
            if (function1OooO0o != null) {
                function1 = new OooO00o(function1, function1OooO0o);
            }
        } else {
            function1 = parent.OooO0o();
        }
        this.f4073OooO0oO = function1;
    }

    @Override // p047Oooooo0.oo00o
    public final void OooO0OO() {
        if (this.f4152OooO0OO) {
            return;
        }
        if (this.f4151OooO0O0 != this.f4072OooO0o.OooO0Oo()) {
            OooO00o();
        }
        this.f4072OooO0o.OooOO0O(this);
        super.OooO0OO();
    }

    @Override // p047Oooooo0.oo00o
    @Nullable
    public final Function1<Object, Unit> OooO0o() {
        return this.f4073OooO0oO;
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
    }

    @Override // p047Oooooo0.oo00o
    public final void OooOOO0(o0oOOo state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<o00O0O0, Unit> function1 = oo0o0O0.f4156OooO00o;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // p047Oooooo0.oo00o
    public final oo00o OooOOoo(Function1 function1) {
        return new o00O00O(this.f4151OooO0O0, this.f4150OooO00o, function1, this.f4072OooO0o);
    }
}
