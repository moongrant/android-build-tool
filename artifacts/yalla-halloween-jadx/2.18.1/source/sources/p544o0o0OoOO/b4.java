package p544o0o0OoOO;

import androidx.viewpager2.widget.ViewPager2;
import com.app.base.model.CategoryModel;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class b4 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f44206OooO00o;

    public b4(ExploreTagRoomListActivity exploreTagRoomListActivity) {
        this.f44206OooO00o = exploreTagRoomListActivity;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        if (i >= 0 && i < this.f44206OooO00o.f22821Ooooo0o.size()) {
            ExploreTagRoomListActivity exploreTagRoomListActivity = this.f44206OooO00o;
            exploreTagRoomListActivity.OooOoO0((String) exploreTagRoomListActivity.f22821Ooooo0o.get(i));
            ExploreTagRoomListActivity exploreTagRoomListActivity2 = this.f44206OooO00o;
            String str = ((CategoryModel) exploreTagRoomListActivity2.f22820Ooooo00.get(i)).id;
            Intrinsics.checkNotNullExpressionValue(str, "tags[position].id");
            exploreTagRoomListActivity2.f22824OooooOo = OooO.OooO0o0(str);
            ExploreTagRoomListActivity exploreTagRoomListActivity3 = this.f44206OooO00o;
            if (exploreTagRoomListActivity3.f22827OoooooO) {
                o0O00000.OooO0Oo("Room_tag_change", exploreTagRoomListActivity3.f22824OooooOo);
            }
        }
        this.f44206OooO00o.f22827OoooooO = true;
    }
}
