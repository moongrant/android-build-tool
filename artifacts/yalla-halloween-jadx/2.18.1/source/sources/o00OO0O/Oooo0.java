package o00OO0O;

import android.app.Activity;
import com.yalla.yalla.ui.activity.event.EventDisplayActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final Oooo0 f31366Oooo0o = new Oooo0();

    public Oooo0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 == null) {
            return null;
        }
        EventDisplayActivity.OooO00o oooO00o = EventDisplayActivity.f21898OoooO0O;
        EventDisplayActivity.OooO00o.OooO00o(activityOooO0O0);
        return Unit.INSTANCE;
    }
}
