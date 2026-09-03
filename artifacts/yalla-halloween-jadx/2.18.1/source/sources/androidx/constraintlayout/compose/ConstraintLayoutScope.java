package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import java.util.ArrayList;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o0000OO.OooOO0;
import o0000OO.OooOO0O;
import o0000OO.OooOOO;
import o0000OO.Oooo0;
import o0O0O00.o000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
public final class ConstraintLayoutScope extends OooOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f6768OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f6769OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList<OooOO0O> f6770OooO0Oo = new ArrayList<>();

    @Stable
    public static final class ConstrainAsModifier extends o00O00 implements o000 {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NotNull
        public final OooOO0O f6771Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NotNull
        public final Function1<OooOO0, Unit> f6772Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ConstrainAsModifier(@NotNull OooOO0O ref, @NotNull Function1<? super OooOO0, Unit> constrainBlock) {
            super(o00oOoo.f6560OooO00o);
            Intrinsics.checkNotNullParameter(ref, "ref");
            Intrinsics.checkNotNullParameter(constrainBlock, "constrainBlock");
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            this.f6771Oooo0oO = ref;
            this.f6772Oooo0oo = constrainBlock;
        }

        @Override // p048OoooooO.o00OOOO0
        @NotNull
        public final o00OOOO0 OooOOoo(@NotNull o00OOOO0 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return o0o0Oo.OooO00o(this, other);
        }

        @Override // p048OoooooO.o00OOOO0
        public final <R> R Oooo(R r, @NotNull Function2<? super R, ? super o00OOOO0.OooO0O0, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(r, this);
        }

        @Override // p048OoooooO.o00OOOO0
        public final boolean OooooOo(@NotNull Function1<? super o00OOOO0.OooO0O0, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return o00OOOOo.OooO00o(this, predicate);
        }

        public final boolean equals(@Nullable Object obj) {
            Function1<OooOO0, Unit> function1 = this.f6772Oooo0oo;
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return Intrinsics.areEqual(function1, constrainAsModifier != null ? constrainAsModifier.f6772Oooo0oo : null);
        }

        public final int hashCode() {
            return this.f6772Oooo0oo.hashCode();
        }

        @Override // p048OoooooO.o00OOOO0
        public final <R> R o0Oo0oo(R r, @NotNull Function2<? super o00OOOO0.OooO0O0, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.invoke(this, r);
        }

        @Override // o0O0O00.o000
        public final Object o0ooOoO(OooO oooO, Object obj) {
            Intrinsics.checkNotNullParameter(oooO, "<this>");
            return new Oooo0(this.f6771Oooo0oO, this.f6772Oooo0oo);
        }
    }

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f6775OooO00o;

        public OooO00o(ConstraintLayoutScope this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f6775OooO00o = this$0;
        }

        @NotNull
        public final OooOO0O OooO00o() {
            return this.f6775OooO00o.OooO0O0();
        }

        @NotNull
        public final OooOO0O OooO0O0() {
            return this.f6775OooO00o.OooO0O0();
        }

        @NotNull
        public final OooOO0O OooO0OO() {
            return this.f6775OooO00o.OooO0O0();
        }
    }

    @PublishedApi
    public ConstraintLayoutScope() {
    }

    @Stable
    @NotNull
    public final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull OooOO0O ref, @NotNull Function1<? super OooOO0, Unit> constrainBlock) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(constrainBlock, "constrainBlock");
        return o00oooo1.OooOOoo(new ConstrainAsModifier(ref, constrainBlock));
    }

    @NotNull
    public final OooOO0O OooO0O0() {
        ArrayList<OooOO0O> arrayList = this.f6770OooO0Oo;
        int i = this.f6769OooO0OO;
        this.f6769OooO0OO = i + 1;
        OooOO0O oooOO0O = (OooOO0O) CollectionsKt.getOrNull(arrayList, i);
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OooOO0O oooOO0O2 = new OooOO0O(Integer.valueOf(this.f6769OooO0OO));
        this.f6770OooO0Oo.add(oooOO0O2);
        return oooOO0O2;
    }

    @Stable
    @NotNull
    public final OooO00o OooO0OO() {
        OooO00o oooO00o = this.f6768OooO0O0;
        if (oooO00o != null) {
            return oooO00o;
        }
        OooO00o oooO00o2 = new OooO00o(this);
        this.f6768OooO0O0 = oooO00o2;
        return oooO00o2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function1<o0000OO.o00000, kotlin.Unit>>] */
    public final void OooO0Oo() {
        this.f27369OooO00o.clear();
        this.f6769OooO0OO = 0;
    }
}
