package o0o0000;

import android.app.Activity;
import com.app.base.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.event.EventDisplayActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final OooO f40767Oooo0o = new OooO();

    public OooO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        if (activityOooO0O0 instanceof MixedRoomActivity) {
            p606o0oo0O.OooOo.OooO0O0("102005");
        } else if (activityOooO0O0 instanceof EventDisplayActivity) {
            p606o0oo0O.OooOo.OooO0O0("101002");
        }
        return Unit.INSTANCE;
    }
}
