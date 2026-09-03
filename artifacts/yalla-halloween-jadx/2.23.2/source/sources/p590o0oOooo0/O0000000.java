package p590o0oOooo0;

import android.app.NotificationManager;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.twitter.sdk.android.core.o0ooOOo;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.ui.activity.main.StartActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p384o0OOoo0O.Oooo0;
import p426o0OoO0o0.OooOOOO;
import p429o0OoOO.o0Oo0oo;
import p475o0Ooooo0.o0O00oO0;
import p583o0oOoo00.o000000O;
import p602o0oo00oo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLoginUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginUtil.kt\ncom/yalla/yalla/util/LoginUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class O0000000 {
    public static void OooO00o() {
        OooO00o.OooO0O0("105048");
        try {
            try {
                o000000O.f56643OooO0oo = false;
                o0000OO0.f57385OooO00o.clear();
                OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
                OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43437o0O0O00, OooOOOO.OooO00o(), oooO0O0);
                MutableState mutableState = o0Oo0oo.f46817OooO00o;
                o0Oo0oo.OooO00o();
                ((NotificationManager) o000O00O.OooO00o().getSystemService("notification")).cancelAll();
                try {
                    o0ooOOo.OooO0OO().f21753OooO00o.OooO00o();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            o0O00oO0.f47936OooO00o.OooO00o();
        }
    }

    public static void OooO0O0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OooO00o();
        int i = StartActivity.f25081OooO0o0;
        StartActivity.OooO00o.OooO0O0(context);
    }
}
