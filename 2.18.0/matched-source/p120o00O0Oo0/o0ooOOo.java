package p120o00O0Oo0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import coil.size.Precision;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import o00O0.OooOO0O;
import o00O0OO.OooO0O0;
import o00O0OO.OooO0OO;
import oo0o0O0.OooO;
import oo0o0O0.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "-Requests")
public final class o0ooOOo {

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

    @Nullable
    public static final <T> OooOO0O<T> OooO00o(@NotNull coil.request.OooO00o oooO00o, @NotNull T data) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Pair<OooOO0O<?>, Class<?>> pair = oooO00o.f9899OooO0oo;
        if (pair == null) {
            return null;
        }
        OooOO0O<T> oooOO0O = (OooOO0O) pair.component1();
        if (pair.component2().isAssignableFrom(data.getClass())) {
            return oooOO0O;
        }
        throw new IllegalStateException((((Object) oooOO0O.getClass().getName()) + " cannot handle data with type " + ((Object) data.getClass().getName()) + '.').toString());
    }

    public static final boolean OooO0O0(@NotNull coil.request.OooO00o oooO00o) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        int i = OooO00o.$EnumSwitchMapping$0[oooO00o.f9907OooOOo.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        OooO0O0 oooO0O0 = oooO00o.f9894OooO0OO;
        if ((oooO0O0 instanceof OooO0OO) && (((OooO0OO) oooO0O0).getView() instanceof ImageView)) {
            OooO0o oooO0o = oooO00o.f9903OooOOO;
            if ((oooO0o instanceof OooO) && ((OooO) oooO0o).getView() == ((OooO0OO) oooO00o.f9894OooO0OO).getView()) {
                return true;
            }
        }
        return oooO00o.f9923Oooo00O.f30588OooO0O0 == null && (oooO00o.f9903OooOOO instanceof oo0o0O0.OooO00o);
    }

    @Nullable
    public static final Drawable OooO0OO(@NotNull coil.request.OooO00o oooO00o, @Nullable Drawable drawable, @DrawableRes @Nullable Integer num, @Nullable Drawable drawable2) {
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return o000oOoO.OooO00o(oooO00o.f9892OooO00o, num.intValue());
    }
}
