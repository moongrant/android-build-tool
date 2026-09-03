package p589o0oOoo0O;

import android.content.Context;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EventModel f47057Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Context f47058OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f47059OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47060OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o(EventModel eventModel, int i, Context context, EventViewModel eventViewModel) {
        super(0);
        this.f47057Oooo = eventModel;
        this.f47059OoooO00 = i;
        this.f47058OoooO0 = context;
        this.f47060OoooO0O = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0OO(this.f47057Oooo.getHasSubscribe() ? "102010" : "102009", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(this.f47057Oooo.getId())), new Pair("postion", Integer.valueOf(this.f47059OoooO00))));
        EventKt.OooOO0O(this.f47058OoooO0, this.f47057Oooo.getHasSubscribe(), new oO00O0o0(this.f47057Oooo, this.f47060OoooO0O));
        return Unit.INSTANCE;
    }
}
