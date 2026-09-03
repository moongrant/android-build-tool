package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p101o000oOoo.oO000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends OooO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Visibility f9531Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9532Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f9533Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ View f9534Oooo0oo;

    public OooOOO(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f9531Oooo = visibility;
        this.f9532Oooo0o = viewGroup;
        this.f9533Oooo0oO = view;
        this.f9534Oooo0oo = view2;
    }

    @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
    public final void OooO00o() {
        this.f9532Oooo0o.getOverlay().remove(this.f9533Oooo0oO);
    }

    @Override // androidx.transition.Transition.OooO0o
    public final void OooO0Oo(@NonNull Transition transition) {
        this.f9534Oooo0oo.setTag(oO000OOo.save_overlay_view, null);
        this.f9532Oooo0o.getOverlay().remove(this.f9533Oooo0oO);
        transition.OooOoO(this);
    }

    @Override // androidx.transition.OooO, androidx.transition.Transition.OooO0o
    public final void OooO0o0() {
        if (this.f9533Oooo0oO.getParent() == null) {
            this.f9532Oooo0o.getOverlay().add(this.f9533Oooo0oO);
        } else {
            this.f9531Oooo.cancel();
        }
    }
}
