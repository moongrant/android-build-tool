package p194o00o0OO;

import android.content.res.TypedArray;
import android.widget.ImageView;
import androidx.annotation.ArrayRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ImageView f38643OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f38644OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final int[] f38645OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38646OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f38647OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f38648OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f38649OooO0oO;

    public o00(@NotNull ImageView view, @ArrayRes int i, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f38643OooO00o = view;
        this.f38644OooO0O0 = true;
        this.f38646OooO0Oo = 1;
        this.f38648OooO0o0 = 2;
        this.f38647OooO0o = 2;
        TypedArray typedArrayObtainTypedArray = o000O00O.OooO00o().getResources().obtainTypedArray(i);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "obtainTypedArray(...)");
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, -1);
        }
        typedArrayObtainTypedArray.recycle();
        this.f38645OooO0OO = iArr;
        this.f38649OooO0oO = j / ((long) length);
    }
}
