package p502o0o00o0;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O f41577Oooo0o;

    public o0000Ooo(o00000O o00000o) {
        this.f41577Oooo0o = o00000o;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(@Nullable View view, @Nullable View view2) {
        if (!Intrinsics.areEqual(view, this.f41577Oooo0o.f41545Oooo0oo) || view2 == null) {
            return;
        }
        view2.setOnClickListener(o00000OO.f41553Oooo0oO);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(@Nullable View view, @Nullable View view2) {
    }
}
