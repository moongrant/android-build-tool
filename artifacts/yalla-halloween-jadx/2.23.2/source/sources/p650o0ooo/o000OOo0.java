package p650o0ooo;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p185o00o00Oo.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f58521OooO0Oo;

    public o000OOo0(o000OO00 o000oo01) {
        this.f58521OooO0Oo = o000oo01;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(@Nullable View view, @Nullable View view2) {
        if (!Intrinsics.areEqual(view, this.f58521OooO0Oo.f58508OooO0o) || view2 == null) {
            return;
        }
        view2.setOnClickListener(new o0000O0());
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(@Nullable View view, @Nullable View view2) {
    }
}
