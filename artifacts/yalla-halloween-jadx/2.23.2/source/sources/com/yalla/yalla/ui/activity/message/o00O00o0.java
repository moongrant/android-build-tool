package com.yalla.yalla.ui.activity.message;

import android.text.SpannableString;
import android.widget.EditText;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSearchFriendActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchFriendActivity.kt\ncom/yalla/yalla/ui/activity/message/SearchFriendActivity$initView$4\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,174:1\n107#2:175\n79#2,22:176\n*S KotlinDebug\n*F\n+ 1 SearchFriendActivity.kt\ncom/yalla/yalla/ui/activity/message/SearchFriendActivity$initView$4\n*L\n94#1:175\n94#1:176,22\n*E\n"})
public final class o00O00o0 extends p571o0oOoO0.o0000oo<UserInfo> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ SearchFriendActivity f25428OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(SearchFriendActivity searchFriendActivity, int i) {
        super(searchFriendActivity, i);
        this.f25428OooOoo0 = searchFriendActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        UserInfo item = (UserInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        SearchFriendActivity searchFriendActivity = this.f25428OooOoo0;
        EditText editText = searchFriendActivity.f25266OooOOo0;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchEdit");
            editText = null;
        }
        String string = editText.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string2 = string.subSequence(i, length + 1).toString();
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(item.getUserHeader());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.fr_icon));
        UserTagView userTagView = (UserTagView) helper.getView(p562o0oOo000.o0OO00O.searchUserTagView);
        userTagView.OooO0oo(item.getPremiumLevel(), item.isPremium());
        userTagView.OooO0Oo(item.getVipLevel(), true, searchFriendActivity);
        userTagView.setSex(item.getSex());
        SpannableString spannableStringOooO0O0 = p605o0oo0O0O.o0O0O0Oo.OooO0O0(com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9), item.getUserName(), string2);
        Intrinsics.checkNotNullExpressionValue(spannableStringOooO0O0, "colourStringIgnoreCase(...)");
        userTagView.setName(spannableStringOooO0O0);
        userTagView.OooOO0O(searchFriendActivity, Integer.valueOf(item.getWealthLevel()), item.getWealthBadgeWithBg(), 10.0f);
    }
}
