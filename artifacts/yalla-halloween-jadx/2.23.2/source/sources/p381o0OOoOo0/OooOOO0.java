package p381o0OOoOo0;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p423o0OoO0OO.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOOO0 f43262OooO0Oo = new OooOOO0();

    public OooOOO0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O00O.f13421OooO00o;
        if (OooO0O0.OooO0O0() instanceof MixedRoomActivity) {
            OooO00o.OooO0O0("102005");
        } else {
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (Intrinsics.areEqual(activityOooO0O0 != null ? o0000oo.OooO00o(activityOooO0O0.getClass()) : null, "EventDisplayActivity")) {
                OooO00o.OooO0O0("101002");
            }
        }
        return Unit.INSTANCE;
    }
}
