package p587o0oOooOO;

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
import p368o0OOo0Oo.Oooo000;
import p412o0Oo0o0O.o000O0o;
import p562o0oOo000.o0OO00O;
import p571o0oOoO0.o0000oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o2 extends o0000oo<UserInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoHeadView f56886OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(TopicInfoHeadView topicInfoHeadView, Context context, int i) {
        super(context, i);
        this.f56886OooOoo0 = topicInfoHeadView;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        NetImageView netImageView = (NetImageView) helper.getView(o0OO00O.nivUserHeader);
        UserTagView tagView = (UserTagView) helper.getView(o0OO00O.userTagView);
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this.f56423OooOo);
        oooO00o.f43126OooO0OO = item.getUserHeader();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0Oo(netImageView);
        tagView.OooO0oo(item.getPremiumLevel(), item.isPremium());
        tagView.OooO0Oo(item.getVipLevel(), true, this.f56886OooOoo0.getActivity());
        long userId = item.getUserId();
        Intrinsics.checkNotNull(tagView);
        String defaultValue = item.getUserName();
        n2 block = new n2(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(o0OO00O.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000O0o(userId, tagView, defaultValue, null, block), 2, null);
        tagView.setSex(item.getSex());
        tagView.setIdentityTopic(2);
    }
}
