package p579o0oOoOOo;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.BadgeDataModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O00o0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f46048Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O0 f46049Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46050Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ BadgeDataModel f46051Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00o0(oO0O0 oo0o0, int i, BadgeDataModel badgeDataModel, OooO0o oooO0o) {
        super(1);
        this.f46049Oooo0o = oo0o0;
        this.f46050Oooo0oO = i;
        this.f46051Oooo0oo = badgeDataModel;
        this.f46048Oooo = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO0O0.OooO0o(this.f46049Oooo0o, 4, this.f46050Oooo0oO, this.f46051Oooo0oo.getSetTime(), this.f46048Oooo);
        oO0O0.OooO0Oo(this.f46049Oooo0o, 4, this.f46048Oooo);
        oO0O0.OooO0oO(this.f46049Oooo0o, 4, this.f46050Oooo0oO, this.f46051Oooo0oo.getMedalId(), this.f46048Oooo);
        oO0O0.OooO0oo(this.f46049Oooo0o, 4, this.f46048Oooo);
        oO0O0 oo0o0 = this.f46049Oooo0o;
        int i = this.f46050Oooo0oO;
        View viewOooO0Oo = this.f46048Oooo.OooO0Oo(R.id.tv_qt);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView(R.id.tv_qt)");
        oO0O0.OooO0o0(oo0o0, 4, i, (AppCompatTextView) viewOooO0Oo, this.f46051Oooo0oo);
        return Unit.INSTANCE;
    }
}
