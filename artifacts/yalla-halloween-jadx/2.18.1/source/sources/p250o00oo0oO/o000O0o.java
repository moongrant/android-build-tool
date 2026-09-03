package p250o00oo0oO;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p162o00OoOOo.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0o implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O000<o000O000<Object>> f34209Oooo0o;

    public o000O0o(o000O000<o000O000<Object>> o000o001) {
        this.f34209Oooo0o = o000o001;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(@Nullable View view, @Nullable View view2) {
        if (!Intrinsics.areEqual(view, this.f34209Oooo0o.f34201OooO0OO) || view2 == null) {
            return;
        }
        view2.setOnClickListener(o0O00o0.f32504Oooo0o);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(@Nullable View view, @Nullable View view2) {
    }
}
