package p519o0o0O0oO;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.jvm.internal.Intrinsics;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O extends o000O<BadgeDataModel> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o000 f52455OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(o000 o000Var, Context context, int i) {
        super(context, i);
        this.f52455OooOoo0 = o000Var;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        BadgeDataModel badgeDataModel = (BadgeDataModel) obj;
        if (viewHolder == null || badgeDataModel == null) {
            return;
        }
        int type = badgeDataModel.getType();
        viewHolder.setText(oO00O0oO.tvBadgeName, badgeDataModel.getName());
        viewHolder.setText(oO00O0oO.tvBadgeDes, badgeDataModel.getRemark());
        o000.OooO0o(this.f52455OooOoo0, type, type, badgeDataModel.getSetTime(), viewHolder);
        o000 o000Var = this.f52455OooOoo0;
        o000Var.getClass();
        int i = oO00O0oO.iv_bronze;
        ((AppCompatImageView) viewHolder.getView(i)).setImageResource(type > 0 ? oOo00OO0.icon_badge_bronze : oOo00OO0.user_badge_dialog_copper_not_obtain);
        int i2 = oO00O0oO.iv_silver;
        ((AppCompatImageView) viewHolder.getView(i2)).setImageResource(type > 1 ? oOo00OO0.icon_badge_silver : oOo00OO0.user_badge_dialog_silver_not_obtain);
        int i3 = oO00O0oO.iv_gold;
        ((AppCompatImageView) viewHolder.getView(i3)).setImageResource(type > 2 ? oOo00OO0.icon_badge_gold : oOo00OO0.user_badge_dialog_glod_not_obtain);
        int i4 = oO00O0oO.iv_diamond;
        ((AppCompatImageView) viewHolder.getView(i4)).setImageResource(type > 3 ? oOo00OO0.icon_badge_diamond : oOo00OO0.user_badge_dialog_diamond_not_obtain);
        o000.OooO0oo(o000Var, type, viewHolder);
        o000.OooO0Oo(o000Var, type, viewHolder);
        o000.OooO0oO(o000Var, type, type, badgeDataModel.getMedalId(), viewHolder);
        View view = viewHolder.getView(oO00O0oO.tv_qt);
        Intrinsics.checkNotNullExpressionValue(view, "helper.getView(R.id.tv_qt)");
        o000.OooO0o0(o000Var, type, type, (AppCompatTextView) view, badgeDataModel);
        View view2 = viewHolder.getView(i);
        Intrinsics.checkNotNullExpressionValue(view2, "helper.getView<AppCompatImageView>(R.id.iv_bronze)");
        o000OO00.OooO0oo(view2, new o0000O00(o000Var, type, badgeDataModel, viewHolder));
        View view3 = viewHolder.getView(i2);
        Intrinsics.checkNotNullExpressionValue(view3, "helper.getView<AppCompatImageView>(R.id.iv_silver)");
        o000OO00.OooO0oo(view3, new o0000oo(o000Var, type, badgeDataModel, viewHolder));
        View view4 = viewHolder.getView(i3);
        Intrinsics.checkNotNullExpressionValue(view4, "helper.getView<AppCompatImageView>(R.id.iv_gold)");
        o000OO00.OooO0oo(view4, new o0000O0(o000Var, type, badgeDataModel, viewHolder));
        View view5 = viewHolder.getView(i4);
        Intrinsics.checkNotNullExpressionValue(view5, "helper.getView<AppCompat…ageView>(R.id.iv_diamond)");
        o000OO00.OooO0oo(view5, new o0000O0O(o000Var, type, badgeDataModel, viewHolder));
        if (o000Var.f52452OooOOo) {
            View view6 = viewHolder.getView(oO00O0oO.iv_diamond_line);
            Intrinsics.checkNotNullExpressionValue(view6, "helper.getView<AppCompat…ew>(R.id.iv_diamond_line)");
            o000OO00.OooOOOO(view6);
            View view7 = viewHolder.getView(i4);
            Intrinsics.checkNotNullExpressionValue(view7, "helper.getView<AppCompat…ageView>(R.id.iv_diamond)");
            o000OO00.OooOOOO(view7);
        } else {
            View view8 = viewHolder.getView(oO00O0oO.iv_diamond_line);
            Intrinsics.checkNotNullExpressionValue(view8, "helper.getView<AppCompat…ew>(R.id.iv_diamond_line)");
            o000OO00.OooO0O0(view8);
            View view9 = viewHolder.getView(i4);
            Intrinsics.checkNotNullExpressionValue(view9, "helper.getView<AppCompat…ageView>(R.id.iv_diamond)");
            o000OO00.OooO0O0(view9);
        }
        View view10 = viewHolder.getView(oO00O0oO.clDialogBadge);
        Intrinsics.checkNotNullExpressionValue(view10, "helper.getView<FrameLayout>(R.id.clDialogBadge)");
        o000OO00.OooO0oo(view10, new o000OO(o000Var));
    }
}
