package p510o0o00ooo;

import com.yalla.yalla.common.manager.OooO00o;
import com.yalla.yalla.model.event.EventModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p407o0Oo0Oo.o00O0OO0;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class z4 extends Lambda implements Function1<EventModel, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final z4 f50905OooO0Oo = new z4();

    public z4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(EventModel eventModel) {
        EventModel event = eventModel;
        Intrinsics.checkNotNullParameter(event, "event");
        long id = event.getId();
        o00O0OO0 o00o0oo0OooOo0o = o00Oo0.OooO00o().OooOo0o();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return Boolean.valueOf(o00o0oo0OooOo0o.OooO0O0(3, ((Number) OooO00o.OooO00o()).longValue(), String.valueOf(id)) != null);
    }
}
