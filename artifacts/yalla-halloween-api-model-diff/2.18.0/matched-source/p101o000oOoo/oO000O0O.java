package p101o000oOoo;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class oO000O0O extends FrameLayout {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ int f29745OoooO0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NonNull
    public ViewGroup f29746Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f29747OoooO00;

    public oO000O0O(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f29746Oooo = viewGroup;
        viewGroup.setTag(oO000OOo.ghost_view_holder, this);
        this.f29746Oooo.getOverlay().add(this);
        this.f29747OoooO00 = true;
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
        if (!this.f29747OoooO00) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f29746Oooo.setTag(oO000OOo.ghost_view_holder, null);
            this.f29746Oooo.getOverlay().remove(this);
            this.f29747OoooO00 = false;
        }
    }
}
