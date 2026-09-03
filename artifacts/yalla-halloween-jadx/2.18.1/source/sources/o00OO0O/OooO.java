package o00OO0O;

import android.content.Context;
import com.app.base.adapter.roomExplore.RoomExploreEventsManager;
import com.yalla.yalla.ui.activity.event.EventDisplayActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomExploreEventsManager f31350Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(RoomExploreEventsManager roomExploreEventsManager) {
        super(0);
        this.f31350Oooo0o = roomExploreEventsManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventDisplayActivity.OooO00o oooO00o = EventDisplayActivity.f21898OoooO0O;
        Context context = this.f31350Oooo0o.f11391OooO00o.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "root.context");
        EventDisplayActivity.OooO00o.OooO00o(context);
        return Unit.INSTANCE;
    }
}
