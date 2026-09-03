package p650o0ooo;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p368o0OOo0Oo.Oooo000;
import p412o0Oo0o0O.o000O0o;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOo0000 extends o0000oo<RoomUserInfoModel> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        RoomUserInfoModel item = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        if (viewHolder == null) {
            return;
        }
        if (viewHolder.getLayoutPosition() == 0) {
            ((ImageView) viewHolder.getView(o0OO00O.ivUserHeader)).setImageResource(o0Oo0oo.icon_default_head_circle);
        } else {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = item.getUserHeader().getValue();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0OO00O.ivUserHeader));
        }
        long jLongValue = item.getUserId().getValue().longValue();
        View tagView = viewHolder.getView(o0OO00O.tvUserName);
        Intrinsics.checkNotNullExpressionValue(tagView, "getView(...)");
        String defaultValue = item.getUserName().getValue();
        oOOOOo0O block = new oOOOOo0O(viewHolder);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(o0OO00O.tag_friend_memo_name_tag, Long.valueOf(jLongValue));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000O0o(jLongValue, tagView, defaultValue, null, block), 2, null);
    }
}
