package p029Oooo0oo;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.o00000;
import androidx.camera.core.impl.o000000;
import com.google.common.util.concurrent.OooO00o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0OO000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final OooO00o<Void> f1284OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final ImageCapture.OooOO0O f1285OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Rect f1286OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f1287OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1288OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final o0OO f1289OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final Matrix f1290OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final String f1291OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ArrayList f1292OooO0oo = new ArrayList();

    public o0OO000(@NonNull o000000 o000000Var, @Nullable ImageCapture.OooOO0O oooOO0O, @NonNull Rect rect, int i, int i2, @NonNull Matrix matrix, @NonNull o0OO00OO o0oo00oo2, @NonNull o00O000.OooO0o oooO0o) {
        this.f1285OooO00o = oooOO0O;
        this.f1288OooO0Oo = i2;
        this.f1287OooO0OO = i;
        this.f1286OooO0O0 = rect;
        this.f1290OooO0o0 = matrix;
        this.f1289OooO0o = o0oo00oo2;
        this.f1291OooO0oO = String.valueOf(o000000Var.hashCode());
        List<o00000> listOooO00o = o000000Var.OooO00o();
        Objects.requireNonNull(listOooO00o);
        for (o00000 o00000Var : listOooO00o) {
            ArrayList arrayList = this.f1292OooO0oo;
            o00000Var.getId();
            arrayList.add(0);
        }
        this.f1284OooO = oooO0o;
    }
}
