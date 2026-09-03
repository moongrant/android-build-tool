package p587o0oOoo0O;

import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.composable.event.EventKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oo0000 extends Lambda implements Function1<EventModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0oo0000 f47018Oooo0o = new o0oo0000();

    public o0oo0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EventModel eventModel) {
        EventModel it = eventModel;
        Intrinsics.checkNotNullParameter(it, "it");
        o0O00000.OooO0OO("Room_explore_Everts_More_share");
        EventKt.OooOO0o(it);
        return Unit.INSTANCE;
    }
}
