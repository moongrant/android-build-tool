package p587o0oOoo0O;

import android.content.Context;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0OoO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47058Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f47059Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f47060Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Context f47061Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0OoO(EventModel eventModel, int i, Context context, EventViewModel eventViewModel) {
        super(0);
        this.f47059Oooo0o = eventModel;
        this.f47060Oooo0oO = i;
        this.f47061Oooo0oo = context;
        this.f47058Oooo = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0OO(this.f47059Oooo0o.getHasSubscribe() ? "102010" : "102009", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(this.f47059Oooo0o.getId())), new Pair("postion", Integer.valueOf(this.f47060Oooo0oO))));
        EventKt.OooOO0O(this.f47061Oooo0oo, this.f47059Oooo0o.getHasSubscribe(), new oO000o00(this.f47059Oooo0o, this.f47058Oooo));
        return Unit.INSTANCE;
    }
}
