package p454o0Ooo000;

import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p569o0oOo0o0.o00000OO;
import p569o0oOo0o0.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f47640OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(EventModel eventModel) {
        super(0);
        this.f47640OooO0Oo = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OOO0o o0ooo0o2 = o00000OO.f56399OooO0O0;
        if (o0ooo0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("event");
            o0ooo0o2 = null;
        }
        o0ooo0o2.OooO0o(this.f47640OooO0Oo);
        return Unit.INSTANCE;
    }
}
