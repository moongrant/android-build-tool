package p587o0oOoo0O;

import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f47040Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47041Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000o00(EventModel eventModel, EventViewModel eventViewModel) {
        super(0);
        this.f47040Oooo0o = eventModel;
        this.f47041Oooo0oO = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO(this.f47040Oooo0o.getHasSubscribe() ? "Room_explore_Everts_More_Unsubscribe_OK" : "Room_explore_Everts_More_subscribe");
        EventViewModel.subscribeEvent$default(this.f47041Oooo0oO, this.f47040Oooo0o, null, 2, null);
        return Unit.INSTANCE;
    }
}
