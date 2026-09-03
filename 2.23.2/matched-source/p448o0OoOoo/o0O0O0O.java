package p448o0OoOoo;

import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.screen.EventDetailScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f47480OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f47481OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(EventModel eventModel, int i) {
        super(0);
        this.f47480OooO0Oo = eventModel;
        this.f47481OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel eventModel = this.f47480OooO0Oo;
        OooO00o.OooO0OO("102008", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(eventModel.getId())), new Pair("postion", Integer.valueOf(this.f47481OooO0o0))));
        EventDetailScreen.INSTANCE.navigate(eventModel);
        return Unit.INSTANCE;
    }
}
