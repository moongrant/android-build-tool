package p516o0o0O000;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.ImageView;
import androidx.annotation.ArrayRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f42077OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ImageView f42078OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f42079OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public int[] f42080OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f42081OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f42082OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f42083OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f42084OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f42085OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f42086OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f42087OooOO0O;

    public o00Oo0(@NotNull ImageView view, @ArrayRes int i, long j, boolean z) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f42078OooO00o = view;
        this.f42079OooO0O0 = z;
        this.f42081OooO0Oo = 1;
        this.f42083OooO0o0 = 2;
        this.f42082OooO0o = 2;
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "Utils.context.resources.obtainTypedArray(arrayId)");
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, -1);
        }
        typedArrayObtainTypedArray.recycle();
        this.f42080OooO0OO = iArr;
        this.f42084OooO0oO = j / ((long) length);
    }

    public static void OooO00o(o00Oo0 o00oo1, int i) {
        o00oo1.f42078OooO00o.postDelayed(new o00O0O(o00oo1, false, i), o00oo1.f42084OooO0oO);
    }

    public final void OooO0O0() {
        if (this.f42082OooO0o == 0) {
            return;
        }
        this.f42082OooO0o = 0;
        OooO00o(this, 0);
    }
}
