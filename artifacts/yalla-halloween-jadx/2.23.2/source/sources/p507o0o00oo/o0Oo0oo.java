package p507o0o00oo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public View f50618Oooo0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f50619Oooo00o;

    public o0Oo0oo(@Nullable Context context) {
        super(context);
        this.f50619Oooo00o = -1;
    }

    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: Oooo0o0 */
    public final void OooO0oO(@NotNull ViewHolder helper, @Nullable RoomIndexModel roomIndexModel) {
        View view;
        Intrinsics.checkNotNullParameter(helper, "helper");
        super.OooO0oO(helper, roomIndexModel);
        FrameLayout frameLayout = (FrameLayout) helper.getView(o0OO00O.bannerContainer);
        if (helper.getLayoutPosition() != this.f50619Oooo00o) {
            if (frameLayout.getChildCount() > 0 || frameLayout.getVisibility() == 0) {
                frameLayout.removeAllViews();
                Intrinsics.checkNotNull(frameLayout);
                o000O.OooO0O0(frameLayout);
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(frameLayout);
        o000O.OooOOOO(frameLayout);
        if (frameLayout.getChildCount() != 0 || (view = this.f50618Oooo0) == null) {
            if (frameLayout.getChildCount() > 0 || frameLayout.getVisibility() == 0) {
                frameLayout.removeAllViews();
                o000O.OooO0O0(frameLayout);
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(view);
        if (view.getParent() != null) {
            View view2 = this.f50618Oooo0;
            Intrinsics.checkNotNull(view2);
            ViewParent parent = view2.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        frameLayout.addView(this.f50618Oooo0);
    }

    public final void OoooO00() {
        int size;
        if (this.f13189OooOOoo.isEmpty()) {
            size = -1;
        } else {
            size = this.f13189OooOOoo.size() >= 3 ? 2 : this.f13189OooOOoo.size() - 1;
        }
        this.f50619Oooo00o = size;
        if (size >= 0) {
            notifyItemChanged(size);
        }
    }
}
