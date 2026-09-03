package p114o00O00o;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.platform.o0O0O00;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import oOO00O.OooO00o;
import oOO00O.OooOO0;
import oOO00O.OooOO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class OooOOOO {
    @Composable
    @JvmName(name = "getCurrent")
    @NotNull
    public static final OooOO0 OooO00o(o0O0O0o0 arg0, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(arg0, "arg0");
        ooo00o.OooO0o0(380256078);
        OooOO0 oooOO0OooO00o = (OooOO0) ooo00o.OooOO0o(arg0);
        if (oooOO0OooO00o == null) {
            ooo00o.OooO0o0(380256127);
            Context context = (Context) ooo00o.OooOO0o(o0O0O00.f6591OooO0O0);
            OooO00o oooO00o = OooO00o.f52967OooO00o;
            Intrinsics.checkNotNullParameter(context, "context");
            OooOO0 oooOO1 = OooO00o.f52968OooO0O0;
            if (oooOO1 == null) {
                synchronized (oooO00o) {
                    oooOO1 = OooO00o.f52968OooO0O0;
                    if (oooOO1 == null) {
                        OooOO0 oooOO0OooO00o2 = null;
                        Object applicationContext = context.getApplicationContext();
                        OooOO0O oooOO0O = applicationContext instanceof OooOO0O ? (OooOO0O) applicationContext : null;
                        if (oooOO0O != null) {
                            oooOO0OooO00o2 = oooOO0O.OooO00o();
                        }
                        if (oooOO0OooO00o2 == null) {
                            Intrinsics.checkNotNullParameter(context, "context");
                            oooOO0OooO00o = new OooOO0.OooO00o(context).OooO00o();
                        } else {
                            oooOO0OooO00o = oooOO0OooO00o2;
                        }
                        OooO00o.f52968OooO0O0 = oooOO0OooO00o;
                    } else {
                        oooOO0OooO00o = oooOO1;
                    }
                }
            } else {
                oooOO0OooO00o = oooOO1;
            }
        } else {
            ooo00o.OooO0o0(380256086);
        }
        ooo00o.Oooo0o0();
        ooo00o.Oooo0o0();
        return oooOO0OooO00o;
    }
}
