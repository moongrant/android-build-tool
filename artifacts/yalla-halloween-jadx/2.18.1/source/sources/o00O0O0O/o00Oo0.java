package o00O0O0O;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import coil.request.NullRequestDataException;
import java.util.WeakHashMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o00000O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Bitmap.Config[] f30536OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0OO00O f30537OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOO0O f30538OooO0O0;

    static {
        f30536OooO0OO = Build.VERSION.SDK_INT >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
    }

    public o00Oo0() {
        int i = Build.VERSION.SDK_INT;
        this.f30538OooO0O0 = (i < 26 || OooOO0.f30475OooO00o) ? new OooOOO0(false) : (i == 26 || i == 27) ? OooOo00.f30495OooO00o : new OooOOO0(true);
    }

    @NotNull
    public final o00O0OO0.OooO OooO00o(@NotNull coil.request.OooO00o request, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new o00O0OO0.OooO(throwable instanceof NullRequestDataException ? p119o00O0Oo0.o0ooOOo.OooO0OO(request, request.f9906Oooo000, request.f9905OooOooo, request.f9908Oooo00o.f30556OooO) : p119o00O0Oo0.o0ooOOo.OooO0OO(request, request.f9904OooOooO, request.f9902OooOoo, request.f9908Oooo00o.f30564OooO0oo), request, throwable);
    }

    public final boolean OooO0O0(@NotNull coil.request.OooO00o request, @NotNull Bitmap.Config requestedConfig) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(requestedConfig, "requestedConfig");
        if (!p119o00O0Oo0.Oooo000.OooO0Oo(requestedConfig)) {
            return true;
        }
        if (!request.f9895OooOo0) {
            return false;
        }
        o00O0OO.OooO0O0 oooO0O0 = request.f9878OooO0OO;
        if (oooO0O0 instanceof o00O0OO.OooO0OO) {
            View view = ((o00O0OO.OooO0OO) oooO0O0).getView();
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(view) && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }
}
