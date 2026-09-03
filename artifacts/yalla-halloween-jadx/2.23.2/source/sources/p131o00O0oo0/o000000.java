package p131o00O0oo0;

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
import o00OO00O.OooOOO;
import o00OO00O.OooOOOO;
import o00OO00O.OooOo00;
import o00OO00O.o000oOoO;
import o00OO00O.o00O0O;
import o00OO00O.o00Oo0;
import o00OO00O.oo000o;
import org.jetbrains.annotations.NotNull;
import p118o00O0Oo.o00000O;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000Oo0;
import p132o00O0ooo.o00O00;
import p132o00O0ooo.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00000O f36781OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final oo000o f36782OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000oOoO f36783OooO0OO;

    public o000000(@NotNull o00000O o00000o, @NotNull oo000o oo000oVar) {
        o000oOoO o00o0o2;
        this.f36781OooO00o = o00000o;
        this.f36782OooO0O0 = oo000oVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (!OooOOO.f37075OooO00o) {
                o00o0o2 = (i == 26 || i == 27) ? new o00Oo0() : new o00O0O(true);
            }
            this.f36783OooO0OO = o00o0o2;
        }
        boolean z = OooOOO.f37075OooO00o;
        o00o0o2 = new o00O0O(false);
        this.f36783OooO0OO = o00o0o2;
    }

    @NotNull
    public static o00oO0o OooO00o(@NotNull OooO00o oooO00o, @NotNull Throwable th) {
        Drawable drawableOooO0O0;
        if (th instanceof NullRequestDataException) {
            drawableOooO0O0 = OooOOOO.OooO0O0(oooO00o, oooO00o.f11674Oooo0OO, oooO00o.f11673Oooo0O0, oooO00o.f11675Oooo0o.f36815OooOO0o);
            if (drawableOooO0O0 == null) {
                drawableOooO0O0 = OooOOOO.OooO0O0(oooO00o, oooO00o.f11669Oooo0, oooO00o.f11672Oooo00o, oooO00o.f11675Oooo0o.f36814OooOO0O);
            }
        } else {
            drawableOooO0O0 = OooOOOO.OooO0O0(oooO00o, oooO00o.f11669Oooo0, oooO00o.f11672Oooo00o, oooO00o.f11675Oooo0o.f36814OooOO0O);
        }
        return new o00oO0o(drawableOooO0O0, oooO00o, th);
    }

    public static boolean OooO0O0(@NotNull OooO00o oooO00o, @NotNull Bitmap.Config config) {
        if (!(Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE)) {
            return true;
        }
        if (!oooO00o.f11655OooOOo0) {
            return false;
        }
        o00O000o o00o000o2 = oooO00o.f11641OooO0OO;
        if (o00o000o2 instanceof o00O00) {
            View view = ((o00O00) o00o000o2).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    @NotNull
    public final o0O0O00 OooO0OO(@NotNull OooO00o oooO00o, @NotNull o000O0Oo o000o0oo2) {
        boolean z;
        if (oooO00o.f11649OooOO0o.isEmpty() || ArraysKt.contains(OooOo00.f37081OooO00o, oooO00o.f11645OooO0oO)) {
            if (OooO0O0(oooO00o, oooO00o.f11645OooO0oO) && this.f36783OooO0OO.OooO00o(o000o0oo2)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        Bitmap.Config config = z ? oooO00o.f11645OooO0oO : Bitmap.Config.ARGB_8888;
        CachePolicy cachePolicy = this.f36782OooO0O0.f37102OooO0oO ? oooO00o.f11660OooOo0O : CachePolicy.DISABLED;
        boolean z2 = oooO00o.f11654OooOOo && oooO00o.f11649OooOO0o.isEmpty() && config != Bitmap.Config.ALPHA_8;
        o000Oo0 o000oo1 = o000o0oo2.f36771OooO00o;
        o000Oo0.OooO0O0 oooO0O0 = o000Oo0.OooO0O0.f36778OooO00o;
        return new o0O0O00(oooO00o.f11639OooO00o, config, oooO00o.f11646OooO0oo, o000o0oo2, (Intrinsics.areEqual(o000oo1, oooO0O0) || Intrinsics.areEqual(o000o0oo2.f36772OooO0O0, oooO0O0)) ? Scale.FIT : oooO00o.f11665OooOoo, OooOOOO.OooO00o(oooO00o), z2, oooO00o.f11656OooOOoo, oooO00o.f11643OooO0o, oooO00o.f11650OooOOO, oooO00o.f11652OooOOOO, oooO00o.f11667OooOooO, oooO00o.f11659OooOo00, oooO00o.f11658OooOo0, cachePolicy);
    }
}
