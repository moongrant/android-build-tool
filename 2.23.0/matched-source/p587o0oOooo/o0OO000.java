package p587o0oOooo;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooO0O0;
import com.yalla.yalla.util.buriedpoint.core.BuriedPointSDK$buriedPointClog$1;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p417o0OoO0.o0OoOo0;
import p589o0oOoooO.r;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0OO000 {
    @JvmStatic
    public static final void OooO00o(@NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        String url = activityOooO0O0 != null ? o0OoOo0.OooO00o(activityOooO0O0) : "";
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(url, "url");
        OooOOO0.OooO0OO("BuriedPointSDK", "eventId:" + eventId + "   |  url:" + url + "   |  extInfo:null");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new r(eventId, url, null, null), 2, null);
    }

    @JvmStatic
    public static final void OooO0O0(@NotNull String eventId, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        String url = activityOooO0O0 != null ? o0OoOo0.OooO00o(activityOooO0O0) : "";
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(url, "url");
        OooOOO0.OooO0OO("BuriedPointSDK", "eventId:" + eventId + "   |  url:" + url + "   |  extInfo:" + map);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new r(eventId, url, map, null), 2, null);
    }

    @JvmStatic
    public static final void OooO0OO(@NotNull String eventId, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        String url = activityOooO0O0 != null ? o0OoOo0.OooO00o(activityOooO0O0) : "";
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(url, "url");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new BuriedPointSDK$buriedPointClog$1(eventId, url, map, null), 2, null);
    }
}
