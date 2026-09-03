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
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends o0000oo<TagListModel.TagType> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ UserInfoTagActivity f26930OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(UserInfoTagActivity userInfoTagActivity, int i) {
        super(userInfoTagActivity, i);
        this.f26930OooOoo0 = userInfoTagActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        TagListModel.TagType item = (TagListModel.TagType) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int layoutPosition = helper.getLayoutPosition();
        final UserInfoTagActivity userInfoTagActivity = this.f26930OooOoo0;
        int i = userInfoTagActivity.f26875OooOoO;
        if (layoutPosition != i) {
            helper.setVisible(o0OO00O.group, true);
            helper.setGone(o0OO00O.fl_tags, false);
            helper.setImageDrawable(o0OO00O.iv_tag, o0000.OooO0O0(item.icon));
            helper.setText(o0OO00O.tv_tag_name, item.tagName);
            int i2 = o0OO00O.iv_tag_bg;
            helper.setImageResource(i2, UserInfoTagActivity.OooOoO0(userInfoTagActivity, item) ? o0Oo0oo.icon_tag_selected : o0Oo0oo.icon_tag_unselect);
            int i3 = o0OO00O.v_cursor;
            helper.setVisible(i3, false);
            if (userInfoTagActivity.f26870OooOo == helper.getLayoutPosition()) {
                userInfoTagActivity.f26874OooOo0o = userInfoTagActivity.f26870OooOo;
                helper.setVisible(i3, true);
                helper.setImageResource(i2, o0Oo0oo.icon_tag_current);
                return;
            } else if (UserInfoTagActivity.OooOoO0(userInfoTagActivity, item)) {
                helper.setImageResource(i2, o0Oo0oo.icon_tag_selected);
                return;
            } else {
                helper.setImageResource(i2, o0Oo0oo.icon_tag_unselect);
                return;
            }
        }
        userInfoTagActivity.f26876OooOoO0 = i;
        helper.setGone(o0OO00O.group, false);
        helper.setGone(o0OO00O.v_cursor, false);
        int i4 = o0OO00O.fl_tags;
        helper.setVisible(i4, true);
        FlowLayout flowLayout = (FlowLayout) helper.getView(i4);
        flowLayout.removeAllViews();
        int i5 = userInfoTagActivity.f26870OooOo;
        ArrayList arrayList = new ArrayList();
        TagListModel tagListModel = userInfoTagActivity.f26873OooOo0O;
        Intrinsics.checkNotNull(tagListModel);
        for (TagListModel.TagInfo tagInfo : tagListModel.data1) {
            TagListModel tagListModel2 = userInfoTagActivity.f26873OooOo0O;
            Intrinsics.checkNotNull(tagListModel2);
            if (tagInfo.typeId == tagListModel2.data.get(i5).tagId) {
                arrayList.add(tagInfo);
            }
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            View viewInflate = View.inflate(this.f56423OooOo, oo0o0Oo.item_flow_tag_all, null);
            TextView textView = (TextView) viewInflate.findViewById(o0OO00O.tv_tag_flow);
            Object obj2 = arrayList.get(i6);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            TagListModel.TagInfo tagInfo2 = (TagListModel.TagInfo) obj2;
            Integer num = userInfoTagActivity.f26881OooOooo.get(tagInfo2.typeId);
            Intrinsics.checkNotNullExpressionValue(num, "get(...)");
            textView.setBackgroundResource(num.intValue());
            textView.setText(tagInfo2.tagName);
            textView.setSelected(UserInfoTagActivity.OooOo(userInfoTagActivity, tagInfo2.tagId));
            if (i6 == arrayList.size() - 1) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = o0000O0.OooO00o(16);
                textView.setLayoutParams(layoutParams2);
            }
            textView.setTag(Integer.valueOf(tagInfo2.tagId));
            textView.setTextColor(o0000.OooO00o(UserInfoTagActivity.OooOo(userInfoTagActivity, tagInfo2.tagId) ? o0OOO0o.color_white : o0OOO0o.color_6D6D6D));
            textView.setOnClickListener(new View.OnClickListener() { // from class: o0o00oOo.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserInfoTagActivity this$0 = userInfoTagActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) view;
                    Object tag = view.getTag();
                    Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                    int iIntValue = ((Integer) tag).intValue();
                    if (UserInfoTagActivity.OooOo(this$0, iIntValue)) {
                        ArrayList<TagListModel.TagInfo> arrayList2 = this$0.f26879OooOoo0;
                        Intrinsics.checkNotNull(arrayList2);
                        TypeIntrinsics.asMutableCollection(arrayList2).remove(this$0.OooOoo(iIntValue));
                        view.setSelected(false);
                        textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_6D6D6D));
                        this$0.Oooo000();
                        return;
                    }
                    ArrayList<TagListModel.TagInfo> arrayList3 = this$0.f26879OooOoo0;
                    Intrinsics.checkNotNull(arrayList3);
                    if (arrayList3.size() < this$0.f26883Oooo000) {
                        ArrayList<TagListModel.TagInfo> arrayList4 = this$0.f26879OooOoo0;
                        Intrinsics.checkNotNull(arrayList4);
                        arrayList4.add(this$0.f26880OooOooO.get(iIntValue));
                        view.setSelected(true);
                        textView2.setTextColor(o0000.OooO00o(o0OOO0o.color_white));
                        this$0.Oooo000();
                    }
                }
            });
            flowLayout.addView(viewInflate);
        }
    }
}
