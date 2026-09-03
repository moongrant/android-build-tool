package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0Oo implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f6624Oooo0o;

    public o0o0Oo(AbstractComposeView abstractComposeView) {
        this.f6624Oooo0o = abstractComposeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v) {
        boolean z;
        Intrinsics.checkNotNullParameter(v, "v");
        AbstractComposeView abstractComposeView = this.f6624Oooo0o;
        int i = o000OO00.OooO00o.f28231OooO00o;
        Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
        Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
        Iterator it = SequencesKt.generateSequence(abstractComposeView.getParent(), o000O0O0.o000000O.f28116Oooo0o).iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object obj = (ViewParent) it.next();
            if (obj instanceof View) {
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "<this>");
                Object tag = view.getTag(o000OO00.OooO00o.f28232OooO0O0);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return;
        }
        this.f6624Oooo0o.OooO0Oo();
    }
}
