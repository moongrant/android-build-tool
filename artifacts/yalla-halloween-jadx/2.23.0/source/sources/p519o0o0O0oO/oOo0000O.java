package p519o0o0O0oO;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0000O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f53003OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(oO0o0000 oo0o0000) {
        super(1);
        this.f53003OooO0Oo = oo0o0000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        this.f53003OooO0Oo.OooOO0O(true);
        return Unit.INSTANCE;
    }
}
