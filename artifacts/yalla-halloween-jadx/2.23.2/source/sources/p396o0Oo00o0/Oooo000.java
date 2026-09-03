package p396o0Oo00o0;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p118o00O0Oo.o00000O;
import p118o00O0Oo.o0000Ooo;
import p118o00O0Oo.o000OOo;
import p118o00O0Oo.o0O0O00;
import p124o00O0o00.o00000O0;
import p191o00o0O0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nCoilTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoilTask.kt\ncom/yalla/yalla/app/startup/CoilTask\n+ 2 ImageLoader.kt\ncoil/ImageLoader$Builder\n*L\n1#1,32:1\n192#2:33\n*S KotlinDebug\n*F\n+ 1 CoilTask.kt\ncom/yalla/yalla/app/startup/CoilTask\n*L\n18#1:33\n*E\n"})
public final class Oooo000 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43628OooO0Oo;

    public Oooo000(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43628OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00Oo0
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        o00000O.OooO00o oooO00o = new o00000O.OooO00o(this.f43628OooO0Oo);
        o000OOo.OooO00o oooO00o2 = new o000OOo.OooO00o();
        if (Build.VERSION.SDK_INT >= 28) {
            oooO00o2.f36411OooO0o0.add(new o00000O0.OooO00o());
        } else {
            oooO00o2.f36411OooO0o0.add(new o00O0o00.o00Oo0.OooO00o());
        }
        oooO00o.f36371OooO0OO = oooO00o2.OooO0OO();
        o0000Ooo o0000oooOooO00o = oooO00o.OooO00o();
        synchronized (o0O0O00.class) {
            o0O0O00.f36413OooO0O0 = o0000oooOooO00o;
        }
    }
}
