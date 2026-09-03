package p445o0OoOoo;

import com.yalla.yalla.model.event.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p560o0oOo000.o00000O0;
import p560o0oOo000.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f46364OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(EventModel eventModel) {
        super(0);
        this.f46364OooO0Oo = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00000O0 o00000o1 = o0000OO0.f56183OooO0O0;
        if (o00000o1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("event");
            o00000o1 = null;
        }
        o00000o1.OooO0o(this.f46364OooO0Oo);
        return Unit.INSTANCE;
    }
}
