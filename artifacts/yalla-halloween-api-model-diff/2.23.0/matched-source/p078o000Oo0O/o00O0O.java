package p078o000Oo0O;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class o00O0O extends FrameLayout {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f34955OooO0o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ViewGroup f34956OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f34957OooO0o0;

    public o00O0O(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f34956OooO0Oo = viewGroup;
        viewGroup.setTag(o0OOO0o.ghost_view_holder, this);
        viewGroup.getOverlay().add(this);
        this.f34957OooO0o0 = true;
    }

    public static void OooO00o(View view, ArrayList<View> arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            OooO00o((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (!this.f34957OooO0o0) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            int i = o0OOO0o.ghost_view_holder;
            ViewGroup viewGroup = this.f34956OooO0Oo;
            viewGroup.setTag(i, null);
            viewGroup.getOverlay().remove(this);
            this.f34957OooO0o0 = false;
        }
    }
}
