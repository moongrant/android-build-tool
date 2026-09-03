package p539o0o0OoOO;

import android.content.Context;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import com.yalla.yalla.ui.view.UserTagView;
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

/* JADX INFO: loaded from: classes5.dex */
public final class j3 extends o000O<UserInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoHeadView f55578OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(TopicInfoHeadView topicInfoHeadView, Context context, int i) {
        super(context, i);
        this.f55578OooOoo0 = topicInfoHeadView;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        NetImageView netImageView = (NetImageView) helper.getView(oO00O0oO.nivUserHeader);
        UserTagView tagView = (UserTagView) helper.getView(oO00O0oO.userTagView);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(this.f56196OooOo);
        oooO00o.f43911OooO0OO = item.getUserHeader();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.OooO0Oo(netImageView);
        tagView.OooO0oo(item.getPremiumLevel(), item.isPremium());
        tagView.OooO0Oo(item.getVipLevel(), true, this.f55578OooOoo0.getActivity());
        long userId = item.getUserId();
        Intrinsics.checkNotNullExpressionValue(tagView, "userTagView");
        String defaultValue = item.getUserName();
        i3 block = new i3(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(oO00O0oO.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO0OO0O(userId, tagView, defaultValue, null, block), 2, null);
        tagView.setSex(item.getSex());
        tagView.setIdentityTopic(2);
    }
}
