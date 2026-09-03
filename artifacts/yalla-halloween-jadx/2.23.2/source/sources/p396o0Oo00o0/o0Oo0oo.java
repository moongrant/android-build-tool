package p396o0Oo00o0;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooO;
import o0OO0O0.OooO00o;
import o0OO0O0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.OooOO0;
import p139o00OOOo0.OooOOO;
import p191o00o0O0.o00Oo0;
import p389o0OOooOo.o00O0;
import p389o0OOooOo.o00O0O0;
import p389o0OOooOo.o00O0O00;
import p389o0OOooOo.oo00o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43641OooO0Oo;

    public o0Oo0oo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43641OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = this.f43641OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        int i = OooO00o.select_picture_color_8AFFFFFF;
        Object obj = ContextCompat.f5281OooO00o;
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
        OooOOO oooOOO = new OooOOO();
        oooOOO.f37480OooO00o = iOooO00o2;
        oooOOO.f37481OooO0O0 = null;
        oooOOO.f37482OooO0OO = i2;
        oooOOO.f37483OooO0Oo = -1;
        oooOOO.f37485OooO0o0 = -1;
        oooOOO.f37484OooO0o = i3;
        oooOOO.f37486OooO0oO = i5;
        oooOOO.f37487OooO0oo = drawableOooO0O0;
        oooOOO.f37479OooO = drawableOooO0O1;
        oooOOO.f37488OooOO0 = -1;
        oooOOO.f37489OooOO0O = -1;
        oooOOO.f37490OooOO0o = -1;
        oooOOO.f37492OooOOO0 = -1;
        oooOOO.f37491OooOOO = i3;
        oooOOO.f37493OooOOOO = -1;
        oooOOO.f37494OooOOOo = iOooO00o;
        OooOO0.f37476OooO0o0 = oooOOO;
        OooOO0.f37473OooO0O0 = new o00O0O00();
        OooOO0.f37474OooO0OO = new o00O0O0();
        OooOO0.f37472OooO00o = new oo00o();
        OooOO0.f37475OooO0Oo = new o00O0();
    }
}
