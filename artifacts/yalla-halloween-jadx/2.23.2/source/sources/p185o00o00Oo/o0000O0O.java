package p185o00o00Oo;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000oo<o0000oo<Object>> f38481OooO0Oo;

    public o0000O0O(o0000oo<o0000oo<Object>> o0000ooVar) {
        this.f38481OooO0Oo = o0000ooVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(@Nullable View view, @Nullable View view2) {
        if (!Intrinsics.areEqual(view, this.f38481OooO0Oo.f38489OooO0OO) || view2 == null) {
            return;
        }
        view2.setOnClickListener(new o0000O0());
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(@Nullable View view, @Nullable View view2) {
    }
}
