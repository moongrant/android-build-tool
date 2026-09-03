package p511o0o0O;

import android.view.View;
import android.widget.LinearLayout;
import com.code.android.util.o000O;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51059OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(o00000OO o00000oo2) {
        super(1);
        this.f51059OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout hintFirstSelectAllUser = this.f51059OooO0Oo.OooOOo0().f44509OooOO0;
        Intrinsics.checkNotNullExpressionValue(hintFirstSelectAllUser, "hintFirstSelectAllUser");
        o000O.OooO0O0(hintFirstSelectAllUser);
        return Unit.INSTANCE;
    }
}
