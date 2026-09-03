package p589o0oOoo0O;

import android.os.Bundle;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p586o0oOoo.o000O;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class ooo0Oo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EventModel f47107Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ EventModel f47108OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f47109OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(EventModel eventModel, int i, EventModel eventModel2) {
        super(0);
        this.f47107Oooo = eventModel;
        this.f47109OoooO00 = i;
        this.f47108OoooO0 = eventModel2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0OO("101005", MapsKt.mapOf(new Pair("roomeid", Long.valueOf(this.f47107Oooo.getRoomId())), new Pair("roomeventid", Long.valueOf(this.f47107Oooo.getId())), new Pair("postion", Integer.valueOf(this.f47109OoooO00))));
        EventModel model = this.f47108OoooO0;
        Intrinsics.checkNotNullParameter(model, "model");
        Bundle bundleOooO00o = OooO0OO.OooO00o();
        bundleOooO00o.putSerializable("key", model);
        o000O.OooO00o(EventDetailScreen.f24587OooO00o, bundleOooO00o);
        return Unit.INSTANCE;
    }
}
