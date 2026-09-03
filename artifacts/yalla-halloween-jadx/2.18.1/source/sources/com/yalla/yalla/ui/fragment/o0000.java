package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.widget.ImageView;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.model.PostUserModel;
import kotlin.jvm.internal.Intrinsics;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 extends p188o00o00o0.OooO0OO<PostUserModel> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PostDetailPraiseFragment f24461OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(PostDetailPraiseFragment postDetailPraiseFragment, Context context) {
        super(context, R.layout.item_post_detail_praise_list);
        this.f24461OooO00o = postDetailPraiseFragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        PostUserModel item = (PostUserModel) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.itemView.setOnClickListener(new o0000Ooo(this.f24461OooO00o, item));
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f24461OooO00o.getActivity());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(item.getHeadurl(), 80, 80);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.head));
        p520o0o0O0O0.o00O0O o00o0o2 = p520o0o0O0O0.o00O0O.f42677OooO00o;
        long userid = item.getUserid();
        String nickname = item.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "item.nickname");
        String strOooO0O0 = o00o0o2.OooO0O0(userid, nickname);
        UserTagView userTagView = (UserTagView) helper.OooO0Oo(R.id.praise_userTagView);
        userTagView.setName(strOooO0O0);
        userTagView.OooO0o(item.getVip(), item.getVipLevel());
        userTagView.setSex(item.getSex());
        userTagView.setKaVip(item.kaVIPLv);
        helper.OooO0oO(R.id.officials, item.getRole() == 2);
    }
}
