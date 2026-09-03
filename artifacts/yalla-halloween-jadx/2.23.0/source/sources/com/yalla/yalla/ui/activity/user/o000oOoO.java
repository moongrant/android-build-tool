package com.yalla.yalla.ui.activity.user;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.google.android.material.internal.FlowLayout;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p496o0o00o.oO0O00oO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends o000O<TagListModel.TagType> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ UserInfoTagActivity f27395OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(UserInfoTagActivity userInfoTagActivity, int i) {
        super(userInfoTagActivity, i);
        this.f27395OooOoo0 = userInfoTagActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        TagListModel.TagType item = (TagListModel.TagType) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int layoutPosition = helper.getLayoutPosition();
        UserInfoTagActivity userInfoTagActivity = this.f27395OooOoo0;
        int i = userInfoTagActivity.f27340OooOoO;
        int i2 = 0;
        if (layoutPosition != i) {
            helper.setVisible(oO00O0oO.group, true);
            helper.setGone(oO00O0oO.fl_tags, false);
            helper.setImageDrawable(oO00O0oO.iv_tag, o0000.OooO0O0(item.icon));
            helper.setText(oO00O0oO.tv_tag_name, item.tagName);
            int i3 = oO00O0oO.iv_tag_bg;
            helper.setImageResource(i3, UserInfoTagActivity.OooOoO0(userInfoTagActivity, item) ? oOo00OO0.icon_tag_selected : oOo00OO0.icon_tag_unselect);
            int i4 = oO00O0oO.v_cursor;
            helper.setVisible(i4, false);
            if (userInfoTagActivity.f27335OooOo == helper.getLayoutPosition()) {
                userInfoTagActivity.f27339OooOo0o = userInfoTagActivity.f27335OooOo;
                helper.setVisible(i4, true);
                helper.setImageResource(i3, oOo00OO0.icon_tag_current);
                return;
            } else if (UserInfoTagActivity.OooOoO0(userInfoTagActivity, item)) {
                helper.setImageResource(i3, oOo00OO0.icon_tag_selected);
                return;
            } else {
                helper.setImageResource(i3, oOo00OO0.icon_tag_unselect);
                return;
            }
        }
        userInfoTagActivity.f27341OooOoO0 = i;
        helper.setGone(oO00O0oO.group, false);
        helper.setGone(oO00O0oO.v_cursor, false);
        int i5 = oO00O0oO.fl_tags;
        helper.setVisible(i5, true);
        FlowLayout flowLayout = (FlowLayout) helper.getView(i5);
        flowLayout.removeAllViews();
        int i6 = userInfoTagActivity.f27335OooOo;
        ArrayList arrayList = new ArrayList();
        TagListModel tagListModel = userInfoTagActivity.f27338OooOo0O;
        Intrinsics.checkNotNull(tagListModel);
        for (TagListModel.TagInfo tagInfo : tagListModel.data1) {
            TagListModel tagListModel2 = userInfoTagActivity.f27338OooOo0O;
            Intrinsics.checkNotNull(tagListModel2);
            if (tagInfo.typeId == tagListModel2.data.get(i6).tagId) {
                arrayList.add(tagInfo);
            }
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View viewInflate = View.inflate(this.f56196OooOo, oO00OO0O.item_flow_tag_all, null);
            TextView textView = (TextView) viewInflate.findViewById(oO00O0oO.tv_tag_flow);
            Object obj2 = arrayList.get(i7);
            Intrinsics.checkNotNullExpressionValue(obj2, "currentTags[i]");
            TagListModel.TagInfo tagInfo2 = (TagListModel.TagInfo) obj2;
            Integer num = userInfoTagActivity.f27346OooOooo.get(tagInfo2.typeId);
            Intrinsics.checkNotNullExpressionValue(num, "tagColorMap[tagInfo!!.typeId]");
            textView.setBackgroundResource(num.intValue());
            textView.setText(tagInfo2.tagName);
            textView.setSelected(UserInfoTagActivity.OooOo(userInfoTagActivity, tagInfo2.tagId));
            if (i7 == arrayList.size() - 1) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = o0000O0.OooO00o(16);
                textView.setLayoutParams(layoutParams2);
            }
            textView.setTag(Integer.valueOf(tagInfo2.tagId));
            textView.setTextColor(o0000.OooO00o(UserInfoTagActivity.OooOo(userInfoTagActivity, tagInfo2.tagId) ? oO00O0o.color_white : oO00O0o.color_6D6D6D));
            textView.setOnClickListener(new oO0O00oO(userInfoTagActivity, i2));
            flowLayout.addView(viewInflate);
        }
    }
}
