package p483o0o000O0;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO00o;
import org.jetbrains.annotations.NotNull;
import p138o00OOOo.OooO0O0;
import p138o00OOOo.OooO0OO;
import p138o00OOOo.OooO0o;
import p193o00o0O00.OooOo;
import p193o00o0O00.o0OoOo0;
import p252o00ooO0.o000000O;
import p400o0Oo0O.OooO;
import p400o0Oo0O.OooOO0O;
import p400o0Oo0O.OooOOOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Ooo extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40878OooO0OO;

    public o00Ooo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40878OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        Context context = this.f40878OooO0OO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        int iOooO0O0 = OooO00o.OooO0O0(application, OooO.select_picture_color_8AFFFFFF);
        int i = OooOO0O.icon_back_x;
        int i2 = OooOOOO.select_picture_string_Done;
        int i3 = OooO.select_picture_color_FF00d8c9;
        int iOooO0O1 = OooO00o.OooO0O0(application, i3);
        int i4 = OooOOOO.select_picture_string_Tap_here_to_change;
        int i5 = OooOO0O.icon_return;
        Drawable drawableOooO0O0 = OooO00o.OooO0OO.OooO0O0(application, OooOO0O.icon_triangle_top);
        Drawable drawableOooO0O1 = OooO00o.OooO0OO.OooO0O0(application, OooOO0O.icon_triangle_bottom);
        int iOooO0O2 = OooO00o.OooO0O0(application, i3);
        Point ratio = new Point(1, 1);
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        o0OoOo0 o0oooo1 = new o0OoOo0();
        o0oooo1.f33144OooO00o = iOooO0O1;
        o0oooo1.f33145OooO0O0 = null;
        o0oooo1.f33146OooO0OO = i;
        o0oooo1.f33147OooO0Oo = -1;
        o0oooo1.f33149OooO0o0 = -1;
        o0oooo1.f33148OooO0o = i2;
        o0oooo1.f33150OooO0oO = i4;
        o0oooo1.f33151OooO0oo = drawableOooO0O0;
        o0oooo1.f33143OooO = drawableOooO0O1;
        o0oooo1.f33152OooOO0 = -1;
        o0oooo1.f33153OooOO0O = -1.0f;
        o0oooo1.f33154OooOO0o = -1;
        o0oooo1.f33156OooOOO0 = -1;
        o0oooo1.f33155OooOOO = -1;
        o0oooo1.f33157OooOOOO = i2;
        o0oooo1.f33158OooOOOo = iOooO0O2;
        o0oooo1.f33160OooOOo0 = -1;
        o0oooo1.f33159OooOOo = -1;
        o0oooo1.f33161OooOOoo = ratio;
        o0oooo1.f33164OooOo00 = 8388611;
        o0oooo1.f33163OooOo0 = -1;
        o0oooo1.f33165OooOo0O = i5;
        o0oooo1.f33166OooOo0o = -1;
        o0oooo1.f33162OooOo = -1;
        o0oooo1.f33168OooOoO0 = -1;
        o0oooo1.f33169OooOoOO = true;
        o0oooo1.f33167OooOoO = iOooO0O0;
        OooOo.f33128OooO0Oo = o0oooo1;
        OooOo.f33126OooO0O0 = new OooO0OO();
        OooOo.f33125OooO00o = new OooO0O0();
        OooOo.f33127OooO0OO = new OooO0o();
    }
}
