package p442o0OoOoO0;

import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.ui.screen.EventDetailScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventModel f46218OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f46219OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(EventModel eventModel, int i) {
        super(0);
        this.f46218OooO0Oo = eventModel;
        this.f46219OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel eventModel = this.f46218OooO0Oo;
        o0OO000.OooO0O0("101005", MapsKt.mapOf(new Pair("roomeid", Long.valueOf(eventModel.getRoomId())), new Pair("roomeventid", Long.valueOf(eventModel.getId())), new Pair("postion", Integer.valueOf(this.f46219OooO0o0))));
        EventDetailScreen.INSTANCE.navigate(eventModel);
        return Unit.INSTANCE;
    }
}
