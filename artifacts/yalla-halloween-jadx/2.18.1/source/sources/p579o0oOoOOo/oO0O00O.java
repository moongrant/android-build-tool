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
public final class oO0O00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooO0o f46044Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O0 f46045Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46046Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ BadgeDataModel f46047Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00O(oO0O0 oo0o0, int i, BadgeDataModel badgeDataModel, OooO0o oooO0o) {
        super(1);
        this.f46045Oooo0o = oo0o0;
        this.f46046Oooo0oO = i;
        this.f46047Oooo0oo = badgeDataModel;
        this.f46044Oooo = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO0O0.OooO0o(this.f46045Oooo0o, 3, this.f46046Oooo0oO, this.f46047Oooo0oo.getSetTime(), this.f46044Oooo);
        oO0O0.OooO0Oo(this.f46045Oooo0o, 3, this.f46044Oooo);
        oO0O0.OooO0oO(this.f46045Oooo0o, 3, this.f46046Oooo0oO, this.f46047Oooo0oo.getMedalId(), this.f46044Oooo);
        oO0O0.OooO0oo(this.f46045Oooo0o, 3, this.f46044Oooo);
        oO0O0 oo0o0 = this.f46045Oooo0o;
        int i = this.f46046Oooo0oO;
        View viewOooO0Oo = this.f46044Oooo.OooO0Oo(R.id.tv_qt);
        Intrinsics.checkNotNullExpressionValue(viewOooO0Oo, "helper.getView(R.id.tv_qt)");
        oO0O0.OooO0o0(oo0o0, 3, i, (AppCompatTextView) viewOooO0Oo, this.f46047Oooo0oo);
        return Unit.INSTANCE;
    }
}
