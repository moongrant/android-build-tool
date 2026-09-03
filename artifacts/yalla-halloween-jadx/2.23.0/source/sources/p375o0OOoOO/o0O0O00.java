package p375o0OOoOO;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p417o0OoO0.o0OoOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0O00 f44056OooO0Oo = new o0O0O00();

    public o0O0O00() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O0.f10354OooO00o;
        if (OooO0O0.OooO0O0() instanceof MixedRoomActivity) {
            o0OO000.OooO00o("102005");
        } else {
            Activity activityOooO0O0 = OooO0O0.OooO0O0();
            if (Intrinsics.areEqual(activityOooO0O0 != null ? o0OoOo0.OooO00o(activityOooO0O0.getClass()) : null, "EventDisplayActivity")) {
                o0OO000.OooO00o("101002");
            }
        }
        return Unit.INSTANCE;
    }
}
