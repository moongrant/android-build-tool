package p448o0OoOoo;

import com.yalla.yalla.model.event.EventModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function1<EventModel, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O000 f47403OooO0Oo = new o00O000();

    public o00O000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }
}
