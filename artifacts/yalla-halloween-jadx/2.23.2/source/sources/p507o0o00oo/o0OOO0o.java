package p507o0o00oo;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0OOO0o extends o00Oo0 {
    @Override // com.yalla.yalla.ui.adapter.room.RoomBaseAdapter, com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: Oooo0o0 */
    public final void OooO0oO(@NotNull ViewHolder helper, @Nullable RoomIndexModel roomIndexModel) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        super.OooO0oO(helper, roomIndexModel);
        ViewGroup.LayoutParams layoutParams = helper.getView(o0OO00O.item_bg).getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (helper.getLayoutPosition() == 0) {
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.topMargin = o0000O0.OooO00o(8.0f);
        } else {
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.topMargin = o0000O0.OooO00o(0.0f);
        }
    }
}
