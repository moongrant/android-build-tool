package p589o0oOoo0O;

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
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00000o extends Lambda implements Function1<EventModel, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f47034Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47035OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Context f47036OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000o(int i, Context context, EventViewModel eventViewModel) {
        super(1);
        this.f47034Oooo = i;
        this.f47036OoooO00 = context;
        this.f47035OoooO0 = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        OooOo.OooO0OO(it.getHasSubscribe() ? "101007" : "101006", MapsKt.mapOf(new Pair("roomeid", Long.valueOf(it.getRoomId())), new Pair("roomeventid", Long.valueOf(it.getId())), new Pair("postion", Integer.valueOf(this.f47034Oooo))));
        EventKt.OooOO0O(this.f47036OoooO00, it.getHasSubscribe(), new oO00000(it, this.f47035OoooO0));
        return Unit.INSTANCE;
    }
}
