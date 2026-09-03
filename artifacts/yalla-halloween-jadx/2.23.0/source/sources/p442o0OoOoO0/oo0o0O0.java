package p442o0OoOoO0;

import com.yalla.yalla.model.event.EventModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends Lambda implements Function1<EventModel, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oo0o0O0 f46301OooO0Oo = new oo0o0O0();

    public oo0o0O0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }
}
