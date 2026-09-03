package p606o0oo0O;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.common.util.OooO0O0;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p516o0o0O000.o0OOO0o;
import p611o0oo0OO0.o0000;
import p617o0oo0o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class OooOo {
    @JvmStatic
    @NotNull
    public static final String OooO00o() {
        Activity activityOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
        return activityOooO0O0 != null ? Oooo0.OooO00o(activityOooO0O0) : "";
    }

    @JvmStatic
    public static final void OooO0O0(@NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        o0000.f48362OooO00o.OooO00o(eventId, OooO00o(), "");
    }

    @JvmStatic
    public static final void OooO0OO(@NotNull String eventId, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        o0000 o0000Var = o0000.f48362OooO00o;
        String strOooO00o = OooO00o();
        o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
        String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(map);
        if (strOooO0oo == null) {
            strOooO0oo = "";
        } else {
            Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
        }
        o0000Var.OooO00o(eventId, strOooO00o, strOooO0oo);
    }
}
