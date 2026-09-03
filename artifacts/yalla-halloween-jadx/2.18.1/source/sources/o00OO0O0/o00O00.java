package o00OO0O0;

import android.view.View;
import com.app.base.model.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ChatModel f31491Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(ChatModel chatModel) {
        super(1);
        this.f31491Oooo0o = chatModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        p159o00OoOO.o00O000.OooO().OooO0oo(this.f31491Oooo0o.from.getUserId());
        return Unit.INSTANCE;
    }
}
