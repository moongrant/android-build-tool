package o000OO00;

import android.view.View;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "ViewTreeSavedStateRegistryOwner")
public final class OooO {

    public static final class OooO00o extends Lambda implements Function1<View, View> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f34870OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final View invoke(View view) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view2, "view");
            Object parent = view2.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, OooO0o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f34871OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OooO0o invoke(View view) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view2, "view");
            Object tag = view2.getTag(o000OO00.OooO00o.view_tree_saved_state_registry_owner);
            if (tag instanceof OooO0o) {
                return (OooO0o) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    @Nullable
    public static final OooO0o OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (OooO0o) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, OooO00o.f34870OooO0Oo), OooO0O0.f34871OooO0Oo));
    }

    @JvmName(name = "set")
    public static final void OooO0O0(@NotNull View view, @Nullable OooO0o oooO0o) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(o000OO00.OooO00o.view_tree_saved_state_registry_owner, oooO0o);
    }
}
