package p587o0oOoo0O;

import android.content.Context;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Lambda implements Function1<EventModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f46973Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f46974Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f46975Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i, Context context, EventViewModel eventViewModel) {
        super(1);
        this.f46973Oooo0o = i;
        this.f46974Oooo0oO = context;
        this.f46975Oooo0oo = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        OooOo.OooO0OO(it.getHasSubscribe() ? "101007" : "101006", MapsKt.mapOf(new Pair("roomeid", Long.valueOf(it.getRoomId())), new Pair("roomeventid", Long.valueOf(it.getId())), new Pair("postion", Integer.valueOf(this.f46973Oooo0o))));
        EventKt.OooOO0O(this.f46974Oooo0oO, it.getHasSubscribe(), new ooo0Oo0(it, this.f46975Oooo0oo));
        return Unit.INSTANCE;
    }
}
