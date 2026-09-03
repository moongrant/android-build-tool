package o00OO0O;

import android.os.Bundle;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f31364Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(EventModel eventModel) {
        super(0);
        this.f31364Oooo0o = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Room_explore_Everts_translate");
        EventModel model = this.f31364Oooo0o;
        Intrinsics.checkNotNullParameter(model, "model");
        Bundle bundleOooO00o = o000O00O.OooO0OO.OooO00o();
        bundleOooO00o.putSerializable("key", model);
        o000O.OooO00o(EventDetailScreen.f24568OooO00o, bundleOooO00o);
        return Unit.INSTANCE;
    }
}
