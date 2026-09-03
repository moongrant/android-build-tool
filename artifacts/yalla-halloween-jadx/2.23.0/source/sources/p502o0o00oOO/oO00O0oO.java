package p502o0o00oOO;

import android.view.View;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00O0oO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO00OOO f49539OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f49540OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(oO00OOO oo00ooo, ChatModel chatModel) {
        super(1);
        this.f49539OooO0Oo = oo00ooo;
        this.f49540OooO0o0 = chatModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Function1<? super ChatModel, Unit> function1 = this.f49539OooO0Oo.f49546OooO0oO;
        if (function1 != null) {
            function1.invoke(this.f49540OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
