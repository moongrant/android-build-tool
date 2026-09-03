package p650o0ooo;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OoOO0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOOo f58897OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(oO00OOOo oo00oooo) {
        super(1);
        this.f58897OooO0Oo = oo00oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        oO00OOOo oo00oooo = this.f58897OooO0Oo;
        oo00oooo.OooOO0O(false);
        o00Ooo.OooO0oo().OooOo00(Integer.parseInt(((AppCompatTextView) setNoDoubleClickListener).getText().toString()));
        o00Ooo.OooO0oo().OooOo0(0);
        oo00oooo.OooOO0o();
        return Unit.INSTANCE;
    }
}
