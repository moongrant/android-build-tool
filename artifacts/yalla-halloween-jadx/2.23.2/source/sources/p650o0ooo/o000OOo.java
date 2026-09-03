package p650o0ooo;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f58517OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BadgeDataModel f58518OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f58519OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f58520OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(o0000Ooo o0000ooo, int i, BadgeDataModel badgeDataModel, ViewHolder viewHolder) {
        super(1);
        this.f58517OooO0Oo = o0000ooo;
        this.f58519OooO0o0 = i;
        this.f58518OooO0o = badgeDataModel;
        this.f58520OooO0oO = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        o0000Ooo o0000ooo = this.f58517OooO0Oo;
        int i = this.f58519OooO0o0;
        BadgeDataModel badgeDataModel = this.f58518OooO0o;
        o0000Ooo.OooO0o(o0000ooo, 1, i, badgeDataModel.getSetTime(), this.f58520OooO0oO);
        o0000Ooo o0000ooo2 = this.f58517OooO0Oo;
        ViewHolder viewHolder = this.f58520OooO0oO;
        o0000Ooo.OooO0Oo(o0000ooo2, 1, viewHolder);
        int medalId = badgeDataModel.getMedalId();
        int i2 = this.f58519OooO0o0;
        o0000Ooo.OooO0oO(o0000ooo2, 1, i2, medalId, viewHolder);
        o0000Ooo.OooO0oo(o0000ooo2, 1, viewHolder);
        View view2 = viewHolder.getView(o0OO00O.tv_qt);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        o0000Ooo.OooO0o0(o0000ooo2, 1, i2, (AppCompatTextView) view2, badgeDataModel);
        return Unit.INSTANCE;
    }
}
