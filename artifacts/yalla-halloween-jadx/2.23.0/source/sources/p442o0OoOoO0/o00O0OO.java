package p442o0OoOoO0;

import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.screen.EventDetailScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f46196OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(EventModel eventModel) {
        super(0);
        this.f46196OooO0Oo = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventDetailScreen.INSTANCE.navigate(this.f46196OooO0Oo);
        return Unit.INSTANCE;
    }
}
