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
public final class o0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EventModel f46990Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f46991OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO(EventModel eventModel, int i) {
        super(0);
        this.f46990Oooo = eventModel;
        this.f46991OoooO00 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOo.OooO0OO("102008", MapsKt.mapOf(new Pair("roomeventid", Long.valueOf(this.f46990Oooo.getId())), new Pair("postion", Integer.valueOf(this.f46991OoooO00))));
        EventModel model = this.f46990Oooo;
        Intrinsics.checkNotNullParameter(model, "model");
        Bundle bundleOooO00o = OooO0OO.OooO00o();
        bundleOooO00o.putSerializable("key", model);
        o000O.OooO00o(EventDetailScreen.f24587OooO00o, bundleOooO00o);
        return Unit.INSTANCE;
    }
}
