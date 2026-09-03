package androidx.constraintlayout.compose;

import androidx.compose.animation.OooOOO0;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p644o0ooOOo.o0OO;
import p644o0ooOOo.o0OO0oO0;
import p644o0ooOOo.o0OOO0;
import p644o0ooOOo.o0o0000;

/* JADX INFO: loaded from: classes.dex */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
public final class ConstraintLayoutScope extends o0OOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO00o f4207OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f4208OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList<o0OO> f4209OooO0Oo = new ArrayList<>();

    @Stable
    public static final class ConstrainAsModifier extends InspectorValueInfo implements ParentDataModifier {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final o0OO f4210OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Function1<o0OO0oO0, Unit> f4211OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ConstrainAsModifier(@NotNull final o0OO ref, @NotNull final Function1<? super o0OO0oO0, Unit> constrainBlock) {
            super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(InspectorInfo inspectorInfo) {
                    InspectorInfo inspectorInfo2 = inspectorInfo;
                    OooOOO0.OooO00o(inspectorInfo2, "$this$null", "constrainAs").set("ref", ref);
                    inspectorInfo2.getProperties().set("constrainBlock", constrainBlock);
                    return Unit.INSTANCE;
                }
            } : InspectableValueKt.getNoInspectorInfo());
            Intrinsics.checkNotNullParameter(ref, "ref");
            Intrinsics.checkNotNullParameter(constrainBlock, "constrainBlock");
            this.f4210OooO00o = ref;
            this.f4211OooO0O0 = constrainBlock;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final boolean all(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ParentDataModifier.DefaultImpls.all(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final boolean any(@NotNull Function1<? super Modifier.Element, Boolean> function1) {
            return ParentDataModifier.DefaultImpls.any(this, function1);
        }

        public final boolean equals(@Nullable Object obj) {
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return Intrinsics.areEqual(this.f4211OooO0O0, constrainAsModifier != null ? constrainAsModifier.f4211OooO0O0 : null);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final <R> R foldIn(R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) ParentDataModifier.DefaultImpls.foldIn(this, r, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final <R> R foldOut(R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) ParentDataModifier.DefaultImpls.foldOut(this, r, function2);
        }

        public final int hashCode() {
            return this.f4211OooO0O0.hashCode();
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public final Object modifyParentData(Density density, Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return new o0o0000(this.f4210OooO00o, this.f4211OooO0O0);
        }

        @Override // androidx.compose.ui.Modifier
        @NotNull
        public final Modifier then(@NotNull Modifier modifier) {
            return ParentDataModifier.DefaultImpls.then(this, modifier);
        }
    }

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f4214OooO00o;

        public OooO00o(ConstraintLayoutScope this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f4214OooO00o = this$0;
        }

        @NotNull
        public final o0OO OooO00o() {
            return this.f4214OooO00o.OooO0O0();
        }

        @NotNull
        public final o0OO OooO0O0() {
            return this.f4214OooO00o.OooO0O0();
        }

        @NotNull
        public final o0OO OooO0OO() {
            return this.f4214OooO00o.OooO0O0();
        }

        @NotNull
        public final o0OO OooO0Oo() {
            return this.f4214OooO00o.OooO0O0();
        }
    }

    @PublishedApi
    public ConstraintLayoutScope() {
    }

    @Stable
    @NotNull
    public static Modifier OooO00o(@NotNull Modifier modifier, @NotNull o0OO ref, @NotNull Function1 constrainBlock) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(constrainBlock, "constrainBlock");
        return modifier.then(new ConstrainAsModifier(ref, constrainBlock));
    }

    @NotNull
    public final o0OO OooO0O0() {
        ArrayList<o0OO> arrayList = this.f4209OooO0Oo;
        int i = this.f4208OooO0OO;
        this.f4208OooO0OO = i + 1;
        o0OO o0oo = (o0OO) CollectionsKt.getOrNull(arrayList, i);
        if (o0oo != null) {
            return o0oo;
        }
        o0OO o0oo2 = new o0OO(Integer.valueOf(this.f4208OooO0OO));
        arrayList.add(o0oo2);
        return o0oo2;
    }

    @Stable
    @NotNull
    public final OooO00o OooO0OO() {
        OooO00o oooO00o = this.f4207OooO0O0;
        if (oooO00o != null) {
            return oooO00o;
        }
        OooO00o oooO00o2 = new OooO00o(this);
        this.f4207OooO0O0 = oooO00o2;
        return oooO00o2;
    }

    public final void OooO0Oo() {
        this.f58052OooO00o.clear();
        this.f4208OooO0OO = 0;
    }
}
