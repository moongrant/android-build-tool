package p579o0oOoo;

import android.app.NotificationManager;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.ui.activity.main.StartActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p377o0OOoOo.o0000O;
import p402o0Oo0OOO.o00O0000;
import p427o0OoOO00.o0OOO0o;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;
import p596o0oo00o.OooOOOO;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLoginUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginUtil.kt\ncom/yalla/yalla/util/LoginUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class oO00o0 {
    public static void OooO00o() {
        o0OO000.OooO00o("105048");
        try {
            try {
                o00O0000.f44482OooO0oO = false;
                OooOOOO.f56843OooO00o.clear();
                OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0();
                OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44178o0O0O00, oO00o000.OooO00o(), oooO0O0);
                MutableState mutableState = o0OOO0o.f45698OooO00o;
                o0OOO0o.OooO00o();
                ((NotificationManager) o000O0.OooO00o().getSystemService("notification")).cancelAll();
                try {
                    com.twitter.sdk.android.core.o0OOO0o.OooO0OO().f22220OooO00o.OooO00o();
                } catch (Exception unused) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            o000000O.f46674OooO00o.OooO00o();
        }
    }

    public static void OooO0O0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OooO00o();
        int i = StartActivity.f25535OooO0o0;
        StartActivity.OooO00o.OooO0O0(context);
    }
}
