package p544o0o0OoOO;

import android.view.View;
import android.widget.LinearLayout;
import com.app.base.model.CategoryModel;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f44212Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f44213Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(ExploreTagRoomListActivity exploreTagRoomListActivity, int i) {
        super(0L, 1, null);
        this.f44212Oooo0o = exploreTagRoomListActivity;
        this.f44213Oooo0oO = i;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String str = ((CategoryModel) this.f44212Oooo0o.f22820Ooooo00.get(this.f44213Oooo0oO)).id;
        Intrinsics.checkNotNullExpressionValue(str, "tags[index].id");
        int iOooO0o0 = OooO.OooO0o0(str);
        ExploreTagRoomListActivity exploreTagRoomListActivity = this.f44212Oooo0o;
        if (iOooO0o0 == exploreTagRoomListActivity.f22824OooooOo) {
            return;
        }
        String str2 = ((CategoryModel) exploreTagRoomListActivity.f22820Ooooo00.get(this.f44213Oooo0oO)).id;
        Intrinsics.checkNotNullExpressionValue(str2, "tags[index].id");
        exploreTagRoomListActivity.f22824OooooOo = OooO.OooO0o0(str2);
        this.f44212Oooo0o.OooOoo().f49446OooO0o0.setCurrentItem(this.f44213Oooo0oO);
        LinearLayout linearLayout = this.f44212Oooo0o.OooOoo().f49443OooO0OO.f50801OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
        o00O0O.OooO00o(linearLayout);
    }
}
