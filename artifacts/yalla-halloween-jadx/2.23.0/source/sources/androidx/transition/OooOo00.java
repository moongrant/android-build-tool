package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p078o000Oo0O.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f8188OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f8189OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f8190OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Visibility f8191OooO0oO;

    public OooOo00(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f8191OooO0oO = visibility;
        this.f8188OooO0Oo = viewGroup;
        this.f8190OooO0o0 = view;
        this.f8189OooO0o = view2;
    }

    @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
    public final void OooO00o() {
        this.f8188OooO0Oo.getOverlay().remove(this.f8190OooO0o0);
    }

    @Override // androidx.transition.OooOO0O, androidx.transition.Transition.OooO0o
    public final void OooO0OO() {
        View view = this.f8190OooO0o0;
        if (view.getParent() == null) {
            this.f8188OooO0Oo.getOverlay().add(view);
        } else {
            this.f8191OooO0oO.cancel();
        }
    }

    @Override // androidx.transition.Transition.OooO0o
    public final void OooO0o0(@NonNull Transition transition) {
        this.f8189OooO0o.setTag(o0OOO0o.save_overlay_view, null);
        this.f8188OooO0Oo.getOverlay().remove(this.f8190OooO0o0);
        transition.OooOoO0(this);
    }
}
