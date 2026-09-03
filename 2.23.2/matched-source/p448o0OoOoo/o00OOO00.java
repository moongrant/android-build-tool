package p448o0OoOoo;

import android.content.Context;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function1<EventModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f47433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47434OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(Context context, EventViewModel eventViewModel) {
        super(1);
        this.f47433OooO0Oo = context;
        this.f47434OooO0o0 = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        OooO00o.OooO0OO(it.getHasSubscribe() ? "101007" : "101006", MapsKt.mapOf(new Pair("roomeid", Long.valueOf(it.getRoomId())), new Pair("roomeventid", Long.valueOf(it.getId())), new Pair("postion", it)));
        EventKt.OooOO0(this.f47433OooO0Oo, it.getHasSubscribe(), new o00OO(this.f47434OooO0o0, it));
        return Unit.INSTANCE;
    }
}
