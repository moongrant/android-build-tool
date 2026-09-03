package p321o0O0ooO;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import coil.size.Precision;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p109o000ooo.o000oOoO;
import p111o000oooO.o00O00O;
import p111o000oooO.o00oOoo;
import p111o000oooO.oOO00O;
import p112o000oooo.o00O0;
import p112o000oooo.oo00o;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "-Requests")
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000oOoO f42849OooO00o = new o000oOoO(0);

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Precision.values().length];
            iArr[Precision.EXACT.ordinal()] = 1;
            iArr[Precision.INEXACT.ordinal()] = 2;
            iArr[Precision.AUTOMATIC.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean OooO00o(@NotNull coil.request.OooO00o oooO00o) {
        int i = OooO00o.$EnumSwitchMapping$0[oooO00o.f8548OooO.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            o00O00O o00o00o2 = oooO00o.f8586Oooo0o0.f35879OooO0O0;
            o00O00O o00o00o3 = oooO00o.f8576OooOoo0;
            if (o00o00o2 == null && (o00o00o3 instanceof o00oOoo)) {
                return true;
            }
            oo00o oo00oVar = oooO00o.f8551OooO0OO;
            if ((oo00oVar instanceof o00O0) && (o00o00o3 instanceof oOO00O)) {
                o00O0 o00o1 = (o00O0) oo00oVar;
                if ((o00o1.getView() instanceof ImageView) && o00o1.getView() == ((oOO00O) o00o00o3).getView()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public static final Drawable OooO0O0(@NotNull coil.request.OooO00o oooO00o, @Nullable Drawable drawable, @DrawableRes @Nullable Integer num, @Nullable Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return o000O000.OooO00o(num.intValue(), oooO00o.f8549OooO00o);
    }
}
