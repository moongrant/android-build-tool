package p029Oooo0oo;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.o00000;
import androidx.camera.core.impl.o000000;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0OO000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final OooOO0O<Void> f1272OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final ImageCapture.OooOO0O f1273OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Rect f1274OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1275OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1276OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o0OO0oO0 f1277OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Matrix f1278OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final String f1279OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ArrayList f1280OooO0oo = new ArrayList();

    public o0OO000(@NonNull o000000 o000000Var, @Nullable ImageCapture.OooOO0O oooOO0O, @NonNull Rect rect, int i, int i2, @NonNull Matrix matrix, @NonNull oo0ooO oo0ooo, @NonNull o000Oo0.OooO0o oooO0o) {
        this.f1273OooO00o = oooOO0O;
        this.f1276OooO0Oo = i2;
        this.f1275OooO0OO = i;
        this.f1274OooO0O0 = rect;
        this.f1278OooO0o0 = matrix;
        this.f1277OooO0o = oo0ooo;
        this.f1279OooO0oO = String.valueOf(o000000Var.hashCode());
        List<o00000> listOooO00o = o000000Var.OooO00o();
        Objects.requireNonNull(listOooO00o);
        for (o00000 o00000Var : listOooO00o) {
            ArrayList arrayList = this.f1280OooO0oo;
            o00000Var.getId();
            arrayList.add(0);
        }
        this.f1272OooO = oooO0o;
    }
}
