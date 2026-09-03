package o00OO0O0;

import com.app.base.model.ChatModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f31625Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f31626Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(o0OO00O o0oo00o2, int i) {
        super(0);
        this.f31625Oooo0o = o0oo00o2;
        this.f31626Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO00O o0oo00o2 = this.f31625Oooo0o;
        Function1<? super ChatModel, Unit> function1 = o0oo00o2.f31592OoooO00;
        if (function1 == null) {
            return null;
        }
        function1.invoke(o0oo00o2.f31588Oooo0oO.get(this.f31626Oooo0oO));
        return Unit.INSTANCE;
    }
}
