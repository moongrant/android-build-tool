package p488o0o00O0o;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendImageAdapter f48426OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(MomentSendImageAdapter momentSendImageAdapter) {
        super(1);
        this.f48426OooO0Oo = momentSendImageAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        Function0<Unit> function0 = this.f48426OooO0Oo.f26423OooOoo;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
