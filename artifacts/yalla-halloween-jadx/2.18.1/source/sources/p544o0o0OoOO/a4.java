package p544o0o0OoOO;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.base.model.CategoryModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.room.ExploreTagRoomListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O0O0O;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o000O0O0;
import p534o0o0OOo0.o00OOO0O;
import p534o0o0OOo0.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class a4 extends OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ExploreTagRoomListActivity f44200Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(ExploreTagRoomListActivity exploreTagRoomListActivity) {
        super(0L, 1, null);
        this.f44200Oooo0o = exploreTagRoomListActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList, java.util.List<android.view.View>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.ArrayList, java.util.List<com.app.base.model.CategoryModel>] */
    @Override // com.yalla.support.common.util.OooOOO0
    public final void onNoDoubleClick(@NotNull View view) {
        StringBuilder sbOooO00o;
        Intrinsics.checkNotNullParameter(view, "view");
        ExploreTagRoomListActivity exploreTagRoomListActivity = this.f44200Oooo0o;
        if (exploreTagRoomListActivity.f22820Ooooo00.size() == 0) {
            return;
        }
        int i = 1;
        if (exploreTagRoomListActivity.f22823OooooOO.isEmpty()) {
            int size = exploreTagRoomListActivity.f22820Ooooo00.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = View.inflate(exploreTagRoomListActivity, R.layout.main_item_more_tag, null);
                ?? r7 = exploreTagRoomListActivity.f22823OooooOO;
                Intrinsics.checkNotNullExpressionValue(view2, "view");
                r7.add(view2);
                TextView textView = (TextView) view2.findViewById(R.id.tvTageName);
                if (oo000o.OooO0o0()) {
                    sbOooO00o = new StringBuilder();
                    sbOooO00o.append(((CategoryModel) exploreTagRoomListActivity.f22820Ooooo00.get(i2)).labelname);
                    sbOooO00o.append('#');
                } else {
                    sbOooO00o = o00O0O0O.OooO00o('#');
                    sbOooO00o.append(((CategoryModel) exploreTagRoomListActivity.f22820Ooooo00.get(i2)).labelname);
                }
                textView.setText(sbOooO00o.toString());
                exploreTagRoomListActivity.OooOoo().f49443OooO0OO.f50799OooO0O0.addView(view2);
                view2.setOnClickListener(new c4(exploreTagRoomListActivity, i2));
            }
            exploreTagRoomListActivity.OooOoo().f49443OooO0OO.f50801OooO0Oo.setOnClickListener(new o00OOO0O(exploreTagRoomListActivity, i));
            exploreTagRoomListActivity.OooOoo().f49443OooO0OO.f50800OooO0OO.setOnClickListener(new o0o0Oo(exploreTagRoomListActivity, i));
        }
        int size2 = exploreTagRoomListActivity.f22823OooooOO.size();
        for (int i3 = 0; i3 < size2; i3++) {
            int i4 = exploreTagRoomListActivity.f22824OooooOo;
            String str = ((CategoryModel) exploreTagRoomListActivity.f22820Ooooo00.get(i3)).id;
            Intrinsics.checkNotNullExpressionValue(str, "tags[index].id");
            boolean z = i4 == OooO.OooO0o0(str);
            ((FrameLayout) ((View) exploreTagRoomListActivity.f22823OooooOO.get(i3)).findViewById(R.id.flMoreTag)).setSelected(z);
            ((TextView) ((View) exploreTagRoomListActivity.f22823OooooOO.get(i3)).findViewById(R.id.tvTageName)).setTextColor(o000O0O0.OooO00o(z ? R.color.color_333333 : R.color.color_5f5f5f));
        }
        LinearLayout linearLayout = exploreTagRoomListActivity.OooOoo().f49443OooO0OO.f50801OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llTags.llTagRoot");
        o00O0O.OooO(linearLayout);
    }
}
