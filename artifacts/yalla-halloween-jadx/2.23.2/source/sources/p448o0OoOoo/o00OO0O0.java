package p448o0OoOoo;

import com.yalla.yalla.model.event.EventModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function1<EventModel, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f47427OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(long j) {
        super(1);
        this.f47427OooO0Oo = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getId() == this.f47427OooO0Oo);
    }
}
