package p587o0oOoo0O;

import android.os.Bundle;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ EventModel f46987Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(EventModel eventModel) {
        super(0);
        this.f46987Oooo0o = eventModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel model = this.f46987Oooo0o;
        Intrinsics.checkNotNullParameter(model, "model");
        Bundle bundleOooO00o = OooO0OO.OooO00o();
        bundleOooO00o.putSerializable("key", model);
        o000O.OooO00o(EventDetailScreen.f24568OooO00o, bundleOooO00o);
        return Unit.INSTANCE;
    }
}
