package p109o000ooo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import coil.request.CachePolicy;
import coil.request.NullRequestDataException;
import coil.request.OooO00o;
import coil.size.Scale;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p097o000o0oO.o000O000;
import p111o000oooO.o00O00;
import p112o000oooo.o00O0;
import p112o000oooo.oo00o;
import p321o0O0ooO.o00;
import p321o0O0ooO.o000O0O0;
import p321o0O0ooO.o000O0Oo;
import p321o0O0ooO.o000OO0O;
import p321o0O0ooO.o00O000o;
import p321o0O0ooO.o00oOoo;
import p321o0O0ooO.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O000 f35895OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O000o f35896OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00 f35897OooO0OO;

    public oo0o0Oo(@NotNull o000O000 o000o001, @NotNull o00O000o o00o000o2) {
        o00 o0o0ooo;
        this.f35895OooO00o = o000o001;
        this.f35896OooO0O0 = o00o000o2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (!o000O0Oo.f42848OooO00o) {
                o0o0ooo = (i == 26 || i == 27) ? new o00oOoo() : new o0O0ooO(true);
            }
            this.f35897OooO0OO = o0o0ooo;
        }
        boolean z = o000O0Oo.f42848OooO00o;
        o0o0ooo = new o0O0ooO(false);
        this.f35897OooO0OO = o0o0ooo;
    }

    @NotNull
    public static o00Oo0 OooO00o(@NotNull OooO00o oooO00o, @NotNull Throwable th) {
        Drawable drawableOooO0O0;
        if (th instanceof NullRequestDataException) {
            drawableOooO0O0 = o000OO0O.OooO0O0(oooO00o, oooO00o.f8584Oooo0OO, oooO00o.f8583Oooo0O0, oooO00o.f8585Oooo0o.f35842OooOO0o);
            if (drawableOooO0O0 == null) {
                drawableOooO0O0 = o000OO0O.OooO0O0(oooO00o, oooO00o.f8579Oooo0, oooO00o.f8582Oooo00o, oooO00o.f8585Oooo0o.f35841OooOO0O);
            }
        } else {
            drawableOooO0O0 = o000OO0O.OooO0O0(oooO00o, oooO00o.f8579Oooo0, oooO00o.f8582Oooo00o, oooO00o.f8585Oooo0o.f35841OooOO0O);
        }
        return new o00Oo0(drawableOooO0O0, oooO00o, th);
    }

    public static boolean OooO0O0(@NotNull OooO00o oooO00o, @NotNull Bitmap.Config config) {
        if (!(Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE)) {
            return true;
        }
        if (!oooO00o.f8565OooOOo0) {
            return false;
        }
        oo00o oo00oVar = oooO00o.f8551OooO0OO;
        if (oo00oVar instanceof o00O0) {
            View view = ((o00O0) oo00oVar).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    @NotNull
    public final o0Oo0oo OooO0OO(@NotNull OooO00o oooO00o, @NotNull o00O00 o00o01) {
        boolean z;
        if (oooO00o.f8559OooOO0o.isEmpty() || ArraysKt.contains(o000O0O0.f42845OooO00o, oooO00o.f8555OooO0oO)) {
            if (OooO0O0(oooO00o, oooO00o.f8555OooO0oO) && this.f35897OooO0OO.OooO00o(o00o01)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Bitmap.Config config = z ? oooO00o.f8555OooO0oO : Bitmap.Config.ARGB_8888;
        CachePolicy cachePolicy = this.f35896OooO0O0.f42868OooO0oO ? oooO00o.f8570OooOo0O : CachePolicy.DISABLED;
        boolean z2 = oooO00o.f8564OooOOo && oooO00o.f8559OooOO0o.isEmpty() && config != Bitmap.Config.ALPHA_8;
        p111o000oooO.o0O0ooO o0o0ooo = o00o01.f35924OooO00o;
        o000oooO.o0O0ooO.OooO0O0 oooO0O0 = o000oooO.o0O0ooO.OooO0O0.f35938OooO00o;
        return new o0Oo0oo(oooO00o.f8549OooO00o, config, oooO00o.f8556OooO0oo, o00o01, (Intrinsics.areEqual(o0o0ooo, oooO0O0) || Intrinsics.areEqual(o00o01.f35925OooO0O0, oooO0O0)) ? Scale.FIT : oooO00o.f8575OooOoo, o000OO0O.OooO00o(oooO00o), z2, oooO00o.f8566OooOOoo, oooO00o.f8553OooO0o, oooO00o.f8560OooOOO, oooO00o.f8562OooOOOO, oooO00o.f8577OooOooO, oooO00o.f8569OooOo00, oooO00o.f8568OooOo0, cachePolicy);
    }
}
