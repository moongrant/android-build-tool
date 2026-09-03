package p519o0o0O0oO;

import android.view.View;
import android.view.ViewGroup;
import com.code.android.easydialog.OooOO0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f52540OooO0Oo;

    public o00O00o0(o00O00OO o00o00oo2) {
        this.f52540OooO0Oo = o00o00oo2;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(@Nullable View view, @Nullable View view2) {
        if (!Intrinsics.areEqual(view, this.f52540OooO0Oo.f52533OooO0o) || view2 == null) {
            return;
        }
        view2.setOnClickListener(new OooOO0());
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(@Nullable View view, @Nullable View view2) {
    }
}
