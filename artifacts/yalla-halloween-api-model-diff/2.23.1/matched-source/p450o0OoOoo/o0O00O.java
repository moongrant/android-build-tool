package p450o0OoOoo;

import android.content.Context;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.view.EventKt;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f47455OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Context f47456OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f47457OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47458OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(EventModel eventModel, int i, Context context, EventViewModel eventViewModel) {
        super(0);
        this.f47455OooO0Oo = eventModel;
        this.f47457OooO0o0 = i;
        this.f47456OooO0o = context;
        this.f47458OooO0oO = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel eventModel = this.f47455OooO0Oo;
        h0.OooO0OO(eventModel.getHasSubscribe() ? "102010" : "102009", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(eventModel.getId())), new Pair("postion", Integer.valueOf(this.f47457OooO0o0))));
        EventKt.OooOO0(this.f47456OooO0o, eventModel.getHasSubscribe(), new o0O00O0o(this.f47458OooO0oO, eventModel));
        return Unit.INSTANCE;
    }
}
