package p159o00OoOO;

import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f32410Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f32411Oooo0oO;

    public o0000O(MixedRoomActivity mixedRoomActivity, EventModel eventModel) {
        this.f32411Oooo0oO = mixedRoomActivity;
        this.f32410Oooo0o = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EventViewModel eventViewModel = this.f32411Oooo0oO.f11779o00000O;
        final EventModel eventModel = this.f32410Oooo0o;
        eventViewModel.subscribeEvent(eventModel, new Function1() { // from class: o00OoOO.o000OO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o0000O o0000o2 = this.f32456Oooo0o;
                EventModel eventModel2 = eventModel;
                Objects.requireNonNull(o0000o2);
                eventModel2.setHasSubscribe(((Boolean) obj).booleanValue());
                o0000o2.f32411Oooo0oO.f11801oo000o.notifyDataSetChanged();
                return null;
            }
        });
        return null;
    }
}
