package com.yalla.yalla.ui.view;

import android.content.Context;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends p188o00o00o0.OooO0OO<UserInfo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f25032OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(Context context) {
        super(context, R.layout.item_member_list_topic);
        this.f25032OooO00o = context;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        NetImageView netImageView = (NetImageView) helper.OooO0Oo(R.id.nivUserHeader);
        UserTagView tagView = (UserTagView) helper.OooO0Oo(R.id.userTagView);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f25032OooO00o);
        oooO00o2.f48429OooO0OO = item.getUserHeader();
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.OooO0o(netImageView);
        tagView.OooO0oO(item.isPremium(), item.getPremiumLevel());
        tagView.setKaVip(item.getVipLevel());
        long userId = item.getUserId();
        Intrinsics.checkNotNullExpressionValue(tagView, "userTagView");
        String defaultValue = item.getUserName();
        OooO0o block = new OooO0o(tagView);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(R.id.tag_friend_memo_name_tag, Long.valueOf(userId));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o00O0O.OooO0O0(userId, defaultValue, tagView, block, null), 2, null);
        tagView.setSex(item.getSex());
        tagView.setIdentityTopic(2);
    }
}
