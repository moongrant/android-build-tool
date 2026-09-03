package p593o0oOoooO;

import android.app.Activity;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.util.buriedpoint.core.BuriedPointSDK$buriedPointClog$1;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p105o000oo0o.o00O00OO;
import p190o00o0O.OooO;
import p425o0OoO0OO.o0000oo;
import p532o0o0OOOO.o0O0o000;
import p594o0oOoooo.i0;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class h0 {
    @JvmStatic
    @NotNull
    public static final String OooO00o() {
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 instanceof ScreenNavigationActivity) {
            OooO<Activity, o00O00OO> oooO = o0O0o000.f53386OooO00o;
            String strOooO0OO = o0O0o000.OooO0OO((ScreenNavigationActivity) activityOooO0O0);
            if (strOooO0OO != null) {
                return strOooO0OO;
            }
        } else {
            Activity activityOooO0O1 = OooO0O0.OooO0O0();
            if (activityOooO0O1 != null) {
                return o0000oo.OooO00o(activityOooO0O1);
            }
        }
        return "";
    }

    @JvmStatic
    public static final void OooO0O0(@NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        String url = OooO00o();
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(url, "url");
        StringBuilder sbOooO00o = OooO0OO.OooO00o("eventId:", eventId, "   |  url:", url, "   |  extInfo:");
        sbOooO00o.append((Object) null);
        OooOOOO.OooO0OO("BuriedPointSDK", sbOooO00o.toString());
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new i0(eventId, url, null, null), 2, null);
    }

    @JvmStatic
    public static final void OooO0OO(@NotNull String eventId, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        String url = OooO00o();
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(url, "url");
        StringBuilder sbOooO00o = OooO0OO.OooO00o("eventId:", eventId, "   |  url:", url, "   |  extInfo:");
        sbOooO00o.append(map);
        OooOOOO.OooO0OO("BuriedPointSDK", sbOooO00o.toString());
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new i0(eventId, url, map, null), 2, null);
    }

    @JvmStatic
    public static final void OooO0Oo(@NotNull String eventId, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        String url = OooO00o();
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(url, "url");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new BuriedPointSDK$buriedPointClog$1(eventId, url, map, null), 2, null);
    }
}
