package p519o0o0O0oO;

import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p362o0OOo0O.OooOO0;
import p406o0Oo0Ooo.oOO0OO0O;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0O0o extends o000O<RoomUserInfoModel> {
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        RoomUserInfoModel item = (RoomUserInfoModel) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        if (viewHolder == null) {
            return;
        }
        if (viewHolder.getLayoutPosition() == 0) {
            ((ImageView) viewHolder.getView(oO00O0oO.ivUserHeader)).setImageResource(oOo00OO0.icon_default_head_circle);
        } else {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
            oooO00o.OooO00o(OooO.OooO0OO());
            oooO00o.f43911OooO0OO = item.getUserHeader().getValue();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivUserHeader));
        }
        long jLongValue = item.getUserId().getValue().longValue();
        View tagView = viewHolder.getView(oO00O0oO.tvUserName);
        Intrinsics.checkNotNullExpressionValue(tagView, "helper.getView(R.id.tvUserName)");
        String defaultValue = item.getUserName().getValue();
        oOOO00o0 block = new oOOO00o0(viewHolder);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(oO00O0oO.tag_friend_memo_name_tag, Long.valueOf(jLongValue));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO0OO0O(jLongValue, tagView, defaultValue, null, block), 2, null);
    }
}
