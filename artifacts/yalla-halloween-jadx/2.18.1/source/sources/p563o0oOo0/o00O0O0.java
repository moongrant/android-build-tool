package p563o0oOo0;

import android.view.View;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f45082Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oOO00O f45083Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessage.SatisfactionSurvey f45084Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(Ref.IntRef intRef, oOO00O ooo00o, YallaTeamMessage.SatisfactionSurvey satisfactionSurvey) {
        super(1);
        this.f45082Oooo0o = intRef;
        this.f45083Oooo0oO = ooo00o;
        this.f45084Oooo0oo = satisfactionSurvey;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        int i = this.f45082Oooo0o.element;
        boolean z = false;
        if (i >= 0 && i < 11) {
            z = true;
        }
        if (z) {
            Function2<? super Long, ? super Integer, Unit> function2 = this.f45083Oooo0oO.f45111OooOo00;
            if (function2 != null) {
                function2.invoke(Long.valueOf(this.f45084Oooo0oo.getMessageId()), Integer.valueOf(this.f45082Oooo0o.element));
            }
        } else {
            ToastUtil.f12567OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.yalla_team_select_score));
        }
        return Unit.INSTANCE;
    }
}
