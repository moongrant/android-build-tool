package p388o0OOooo0;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p097o000o0oO.o0000O0;
import p097o000o0oO.o0000oo;
import p097o000o0oO.o000O000;
import p097o000o0oO.o000Oo0;
import p103o000oo00.o00000OO;
import p103o000oo00.o0OOO0o;
import p145o00Oo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCoilTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoilTask.kt\ncom/yalla/yalla/app/startup/CoilTask\n+ 2 ImageLoader.kt\ncoil/ImageLoader$Builder\n*L\n1#1,32:1\n192#2:33\n*S KotlinDebug\n*F\n+ 1 CoilTask.kt\ncom/yalla/yalla/app/startup/CoilTask\n*L\n18#1:33\n*E\n"})
public final class o000OOo extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44391OooO0Oo;

    public o000OOo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44391OooO0Oo = context;
    }

    @Override // p145o00Oo0O.o000oOoO
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        o000O000.OooO00o oooO00o = new o000O000.OooO00o(this.f44391OooO0Oo);
        o0000O0.OooO00o oooO00o2 = new o0000O0.OooO00o();
        if (Build.VERSION.SDK_INT >= 28) {
            oooO00o2.f35404OooO0o0.add(new o00000OO.OooO00o());
        } else {
            oooO00o2.f35404OooO0o0.add(new o0OOO0o.OooO00o());
        }
        oooO00o.f35421OooO0OO = oooO00o2.OooO0OO();
        o000Oo0 o000oo0OooO00o = oooO00o.OooO00o();
        synchronized (o0000oo.class) {
            o0000oo.f35409OooO0O0 = o000oo0OooO00o;
        }
    }
}
