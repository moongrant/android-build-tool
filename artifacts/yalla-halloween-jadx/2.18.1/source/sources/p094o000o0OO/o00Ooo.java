package p094o000o0OO;

import android.view.View;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "ViewTreeSavedStateRegistryOwner")
public final class o00Ooo {

    public static final class OooO00o extends Lambda implements Function1<View, View> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f29287Oooo0o = new OooO00o();

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

    public static final class OooO0O0 extends Lambda implements Function1<View, o00Oo0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f29288Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o00Oo0 invoke(View view) {
            View view2 = view;
            Intrinsics.checkNotNullParameter(view2, "view");
            Object tag = view2.getTag(Oooo0.view_tree_saved_state_registry_owner);
            if (tag instanceof o00Oo0) {
                return (o00Oo0) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    @Nullable
    public static final o00Oo0 OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (o00Oo0) SequencesKt.firstOrNull(SequencesKt.mapNotNull(SequencesKt.generateSequence(view, OooO00o.f29287Oooo0o), OooO0O0.f29288Oooo0o));
    }

    @JvmName(name = "set")
    public static final void OooO0O0(@NotNull View view, @Nullable o00Oo0 o00oo1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(Oooo0.view_tree_saved_state_registry_owner, o00oo1);
    }
}
