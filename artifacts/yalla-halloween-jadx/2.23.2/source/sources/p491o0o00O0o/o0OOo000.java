package p491o0o00O0o;

import android.widget.TextView;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOo000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f49055OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOo000(UntieAccountBindActivity untieAccountBindActivity) {
        super(0);
        this.f49055OooO0Oo = untieAccountBindActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = UntieAccountBindActivity.f24887OooOo;
        UntieAccountBindActivity untieAccountBindActivity = this.f49055OooO0Oo;
        TextView tvUntieBindResult = untieAccountBindActivity.OooOoO0().f45038OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvUntieBindResult, "tvUntieBindResult");
        o000O.OooOOOO(tvUntieBindResult);
        untieAccountBindActivity.OooOo0();
        return Unit.INSTANCE;
    }
}
