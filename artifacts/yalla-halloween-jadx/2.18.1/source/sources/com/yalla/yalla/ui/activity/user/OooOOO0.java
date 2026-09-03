package com.yalla.yalla.ui.activity.user;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.model.TagListModel;
import com.google.android.material.internal.FlowLayout;
import com.weieyu.yalla.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p566o0oOo00O.oO0000O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends p188o00o00o0.OooO0OO<TagListModel.TagType> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserInfoTagActivity f23353OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(UserInfoTagActivity userInfoTagActivity) {
        super(userInfoTagActivity, R.layout.item_useirnfo_edit_tags);
        this.f23353OooO00o = userInfoTagActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
        TagListModel.TagType item = (TagListModel.TagType) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int layoutPosition = helper.getLayoutPosition();
        UserInfoTagActivity userInfoTagActivity = this.f23353OooO00o;
        int i = userInfoTagActivity.f23546Oooooo0;
        int i2 = 0;
        if (layoutPosition != i) {
            helper.OooOO0o(R.id.group, true);
            helper.OooO0oO(R.id.fl_tags, false);
            ((ImageView) helper.OooO0Oo(R.id.iv_tag)).setImageDrawable(o000O0O0.OooO0O0(item.icon));
            helper.OooOO0(R.id.tv_tag_name, item.tagName);
            helper.OooO0oo(R.id.iv_tag_bg, UserInfoTagActivity.OooOooO(this.f23353OooO00o, item) ? R.drawable.icon_tag_selected : R.drawable.icon_tag_unselect);
            helper.OooOO0o(R.id.v_cursor, false);
            if (this.f23353OooO00o.f23543OooooOO == helper.getLayoutPosition()) {
                UserInfoTagActivity userInfoTagActivity2 = this.f23353OooO00o;
                userInfoTagActivity2.f23542OooooO0 = userInfoTagActivity2.f23543OooooOO;
                helper.OooOO0o(R.id.v_cursor, true);
                helper.OooO0oo(R.id.iv_tag_bg, R.drawable.icon_tag_current);
                return;
            }
            if (UserInfoTagActivity.OooOooO(this.f23353OooO00o, item)) {
                helper.OooO0oo(R.id.iv_tag_bg, R.drawable.icon_tag_selected);
                return;
            } else {
                helper.OooO0oo(R.id.iv_tag_bg, R.drawable.icon_tag_unselect);
                return;
            }
        }
        userInfoTagActivity.f23544OooooOo = i;
        helper.OooO0oO(R.id.group, false);
        helper.OooO0oO(R.id.v_cursor, false);
        helper.OooOO0o(R.id.fl_tags, true);
        FlowLayout flowLayout = (FlowLayout) helper.OooO0Oo(R.id.fl_tags);
        flowLayout.removeAllViews();
        UserInfoTagActivity userInfoTagActivity3 = this.f23353OooO00o;
        int i3 = userInfoTagActivity3.f23543OooooOO;
        ArrayList arrayList = new ArrayList();
        TagListModel tagListModel = userInfoTagActivity3.f23541Ooooo0o;
        Intrinsics.checkNotNull(tagListModel);
        for (TagListModel.TagInfo tagInfo : tagListModel.data1) {
            TagListModel tagListModel2 = userInfoTagActivity3.f23541Ooooo0o;
            Intrinsics.checkNotNull(tagListModel2);
            if (tagInfo.typeId == tagListModel2.data.get(i3).tagId) {
                arrayList.add(tagInfo);
            }
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            View viewInflate = View.inflate(getContext(), R.layout.item_flow_tag_all, null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_tag_flow);
            Object obj2 = arrayList.get(i4);
            Intrinsics.checkNotNullExpressionValue(obj2, "currentTags[i]");
            TagListModel.TagInfo tagInfo2 = (TagListModel.TagInfo) obj2;
            Integer num = this.f23353OooO00o.f23554ooOO.get(tagInfo2.typeId);
            Intrinsics.checkNotNullExpressionValue(num, "tagColorMap[tagInfo!!.typeId]");
            textView.setBackgroundResource(num.intValue());
            textView.setText(tagInfo2.tagName);
            textView.setSelected(UserInfoTagActivity.OooOoo(this.f23353OooO00o, tagInfo2.tagId));
            if (i4 == arrayList.size() - 1) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = com.yalla.support.common.util.OooOo00.OooO00o(16.0f);
                textView.setLayoutParams(layoutParams2);
            }
            textView.setTag(Integer.valueOf(tagInfo2.tagId));
            textView.setTextColor(o000O0O0.OooO00o(UserInfoTagActivity.OooOoo(this.f23353OooO00o, tagInfo2.tagId) ? R.color.color_white : R.color.color_6D6D6D));
            textView.setOnClickListener(new oO0000O(this.f23353OooO00o, i2));
            flowLayout.addView(viewInflate);
        }
    }
}
