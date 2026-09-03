package p519o0o0O0oO;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0o0000 f52860OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00(oO0o0000 oo0o0000) {
        super(1);
        this.f52860OooO0Oo = oo0o0000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO0o0000 oo0o0000 = this.f52860OooO0Oo;
        oo0o0000.OooOO0O(false);
        o00Oo0.OooO0oo().OooOo00(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
        o00Oo0.OooO0oo().OooOo0(1);
        oo0o0000.OooOO0o();
        return Unit.INSTANCE;
    }
}
