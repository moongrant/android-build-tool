package p519o0o0O0oO;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000 f52460OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BadgeDataModel f52461OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f52462OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f52463OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(o000 o000Var, int i, BadgeDataModel badgeDataModel, ViewHolder viewHolder) {
        super(1);
        this.f52460OooO0Oo = o000Var;
        this.f52462OooO0o0 = i;
        this.f52461OooO0o = badgeDataModel;
        this.f52463OooO0oO = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        o000 o000Var = this.f52460OooO0Oo;
        int i = this.f52462OooO0o0;
        BadgeDataModel badgeDataModel = this.f52461OooO0o;
        o000.OooO0o(o000Var, 1, i, badgeDataModel.getSetTime(), this.f52463OooO0oO);
        o000 o000Var2 = this.f52460OooO0Oo;
        ViewHolder viewHolder = this.f52463OooO0oO;
        o000.OooO0Oo(o000Var2, 1, viewHolder);
        int medalId = badgeDataModel.getMedalId();
        int i2 = this.f52462OooO0o0;
        o000.OooO0oO(o000Var2, 1, i2, medalId, viewHolder);
        o000.OooO0oo(o000Var2, 1, viewHolder);
        View view2 = viewHolder.getView(oO00O0oO.tv_qt);
        Intrinsics.checkNotNullExpressionValue(view2, "helper.getView(R.id.tv_qt)");
        o000.OooO0o0(o000Var2, 1, i2, (AppCompatTextView) view2, badgeDataModel);
        return Unit.INSTANCE;
    }
}
