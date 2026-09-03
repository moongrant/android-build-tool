package p509o0o00ooO;

import android.view.View;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class v2 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x2 f50847OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f50848OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(x2 x2Var, ChatModel chatModel) {
        super(1);
        this.f50847OooO0Oo = x2Var;
        this.f50848OooO0o0 = chatModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Function1<? super ChatModel, Unit> function1 = this.f50847OooO0Oo.f50884OooO0oO;
        if (function1 != null) {
            function1.invoke(this.f50848OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
