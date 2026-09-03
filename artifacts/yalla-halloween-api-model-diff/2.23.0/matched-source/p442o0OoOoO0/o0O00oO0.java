package p442o0OoOoO0;

import android.content.Context;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f46244OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f46245OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f46246OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f46247OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(EventModel eventModel, int i, Context context, EventViewModel eventViewModel) {
        super(0);
        this.f46244OooO0Oo = eventModel;
        this.f46246OooO0o0 = i;
        this.f46245OooO0o = context;
        this.f46247OooO0oO = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel eventModel = this.f46244OooO0Oo;
        o0OO000.OooO0O0(eventModel.getHasSubscribe() ? "102010" : "102009", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(eventModel.getId())), new Pair("postion", Integer.valueOf(this.f46246OooO0o0))));
        EventKt.OooOO0(this.f46245OooO0o, eventModel.getHasSubscribe(), new o0O00o00(this.f46247OooO0oO, eventModel));
        return Unit.INSTANCE;
    }
}
