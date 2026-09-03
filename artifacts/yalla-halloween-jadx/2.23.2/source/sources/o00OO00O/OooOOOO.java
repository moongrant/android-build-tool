package o00OO00O;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import coil.size.Precision;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p130o00O0oo.o000O00;
import p130o00O0oo.o000O0O0;
import p130o00O0oo.o000OO0O;
import p132o00O0ooo.o00O00;
import p132o00O0ooo.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "-Requests")
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final p131o00O0oo0.o00Oo0 f37078OooO00o = new p131o00O0oo0.o00Oo0(0);

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
        int i = OooO00o.$EnumSwitchMapping$0[oooO00o.f11638OooO.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            o000OO0O o000oo0o2 = oooO00o.f11676Oooo0o0.f36821OooO0O0;
            o000OO0O o000oo0o3 = oooO00o.f11666OooOoo0;
            if (o000oo0o2 == null && (o000oo0o3 instanceof o000O00)) {
                return true;
            }
            o00O000o o00o000o2 = oooO00o.f11641OooO0OO;
            if ((o00o000o2 instanceof o00O00) && (o000oo0o3 instanceof o000O0O0)) {
                o00O00 o00o01 = (o00O00) o00o000o2;
                if ((o00o01.getView() instanceof ImageView) && o00o01.getView() == ((o000O0O0) o000oo0o3).getView()) {
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
        return OooO0OO.OooO00o(num.intValue(), oooO00o.f11639OooO00o);
    }
}
