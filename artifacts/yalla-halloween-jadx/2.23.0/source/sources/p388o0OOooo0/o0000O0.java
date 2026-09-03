package p388o0OOooo0;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooO0OO;
import o00O0OO.OooOO0;
import o0OO0.OooO;
import o0OO0.OooO00o;
import o0OO0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p383o0OOooO.o00;
import p383o0OOooO.o000OO00;
import p383o0OOooO.o000OOo0;
import p383o0OOooO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000O0 extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44383OooO0Oo;

    public o0000O0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44383OooO0Oo = context;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        Context context = this.f44383OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        int i = OooO00o.select_picture_color_8AFFFFFF;
        Object obj = ContextCompat.f5271OooO00o;
        int iOooO00o = ContextCompat.OooO0o.OooO00o(application, i);
        int i2 = OooO0O0.ucrop_back_x;
        int i3 = OooO.select_picture_string_Done;
        int i4 = OooO00o.select_picture_color_FF00d8c9;
        int iOooO00o2 = ContextCompat.OooO0o.OooO00o(application, i4);
        int i5 = OooO.select_picture_string_Tap_here_to_change;
        Drawable drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(application, OooO0O0.ucrop_triangle_top);
        Drawable drawableOooO0O1 = ContextCompat.OooO0OO.OooO0O0(application, OooO0O0.ucrop_triangle_bottom);
        ContextCompat.OooO0o.OooO00o(application, i4);
        Point ratio = new Point(1, 1);
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        OooOO0 oooOO1 = new OooOO0();
        oooOO1.f36543OooO00o = iOooO00o2;
        oooOO1.f36544OooO0O0 = null;
        oooOO1.f36545OooO0OO = i2;
        oooOO1.f36546OooO0Oo = -1;
        oooOO1.f36548OooO0o0 = -1;
        oooOO1.f36547OooO0o = i3;
        oooOO1.f36549OooO0oO = i5;
        oooOO1.f36550OooO0oo = drawableOooO0O0;
        oooOO1.f36542OooO = drawableOooO0O1;
        oooOO1.f36551OooOO0 = -1;
        oooOO1.f36552OooOO0O = -1;
        oooOO1.f36553OooOO0o = -1;
        oooOO1.f36555OooOOO0 = -1;
        oooOO1.f36554OooOOO = i3;
        oooOO1.f36556OooOOOO = -1;
        oooOO1.f36557OooOOOo = iOooO00o;
        OooO0OO.f36539OooO0o0 = oooOO1;
        OooO0OO.f36536OooO0O0 = new o00();
        OooO0OO.f36537OooO0OO = new o00O0000();
        OooO0OO.f36535OooO00o = new o000OO00();
        OooO0OO.f36538OooO0Oo = new o000OOo0();
    }
}
