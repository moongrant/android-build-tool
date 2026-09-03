package p650o0ooo;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000O;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O extends o0000oo<BadgeDataModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f58446OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(o0000Ooo o0000ooo, Context context, int i) {
        super(context, i);
        this.f58446OooOoo0 = o0000ooo;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        BadgeDataModel badgeDataModel = (BadgeDataModel) obj;
        if (viewHolder == null || badgeDataModel == null) {
            return;
        }
        int type = badgeDataModel.getType();
        viewHolder.setText(o0OO00O.tvBadgeName, badgeDataModel.getName());
        viewHolder.setText(o0OO00O.tvBadgeDes, badgeDataModel.getRemark());
        o0000Ooo.OooO0o(this.f58446OooOoo0, type, type, badgeDataModel.getSetTime(), viewHolder);
        o0000Ooo o0000ooo = this.f58446OooOoo0;
        o0000ooo.getClass();
        int i = o0OO00O.iv_bronze;
        ((AppCompatImageView) viewHolder.getView(i)).setImageResource(type > 0 ? o0Oo0oo.icon_badge_bronze : o0Oo0oo.user_badge_dialog_copper_not_obtain);
        int i2 = o0OO00O.iv_silver;
        ((AppCompatImageView) viewHolder.getView(i2)).setImageResource(type > 1 ? o0Oo0oo.icon_badge_silver : o0Oo0oo.user_badge_dialog_silver_not_obtain);
        int i3 = o0OO00O.iv_gold;
        ((AppCompatImageView) viewHolder.getView(i3)).setImageResource(type > 2 ? o0Oo0oo.icon_badge_gold : o0Oo0oo.user_badge_dialog_glod_not_obtain);
        int i4 = o0OO00O.iv_diamond;
        ((AppCompatImageView) viewHolder.getView(i4)).setImageResource(type > 3 ? o0Oo0oo.icon_badge_diamond : o0Oo0oo.user_badge_dialog_diamond_not_obtain);
        o0000Ooo.OooO0oo(o0000ooo, type, viewHolder);
        o0000Ooo.OooO0Oo(o0000ooo, type, viewHolder);
        o0000Ooo.OooO0oO(o0000ooo, type, type, badgeDataModel.getMedalId(), viewHolder);
        View view = viewHolder.getView(o0OO00O.tv_qt);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        o0000Ooo.OooO0o0(o0000ooo, type, type, (AppCompatTextView) view, badgeDataModel);
        View view2 = viewHolder.getView(i);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        o000O.OooO0oo(view2, new o000OOo(o0000ooo, type, badgeDataModel, viewHolder));
        View view3 = viewHolder.getView(i2);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        o000O.OooO0oo(view3, new o000000(o0000ooo, type, badgeDataModel, viewHolder));
        View view4 = viewHolder.getView(i3);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        o000O.OooO0oo(view4, new o000000O(o0000ooo, type, badgeDataModel, viewHolder));
        View view5 = viewHolder.getView(i4);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        o000O.OooO0oo(view5, new o00000(o0000ooo, type, badgeDataModel, viewHolder));
        if (o0000ooo.f58474OooOOo) {
            View view6 = viewHolder.getView(o0OO00O.iv_diamond_line);
            Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
            o000O.OooOOOO(view6);
            View view7 = viewHolder.getView(i4);
            Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
            o000O.OooOOOO(view7);
        } else {
            View view8 = viewHolder.getView(o0OO00O.iv_diamond_line);
            Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
            o000O.OooO0O0(view8);
            View view9 = viewHolder.getView(i4);
            Intrinsics.checkNotNullExpressionValue(view9, "getView(...)");
            o000O.OooO0O0(view9);
        }
        View view10 = viewHolder.getView(o0OO00O.clDialogBadge);
        Intrinsics.checkNotNullExpressionValue(view10, "getView(...)");
        o000O.OooO0oo(view10, new o00000O0(o0000ooo));
    }
}
