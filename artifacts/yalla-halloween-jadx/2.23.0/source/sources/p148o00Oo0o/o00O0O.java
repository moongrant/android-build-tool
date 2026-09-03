package p148o00Oo0o;

import android.content.res.TypedArray;
import android.widget.ImageView;
import androidx.annotation.ArrayRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ImageView f37840OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f37841OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final int[] f37842OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f37843OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f37844OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f37845OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f37846OooO0oO;

    public o00O0O(@NotNull ImageView view, @ArrayRes int i, long j) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f37840OooO00o = view;
        this.f37841OooO0O0 = true;
        this.f37843OooO0Oo = 1;
        this.f37845OooO0o0 = 2;
        this.f37844OooO0o = 2;
        TypedArray typedArrayObtainTypedArray = o000O0.OooO00o().getResources().obtainTypedArray(i);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "Utils.context.resources.obtainTypedArray(arrayId)");
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, -1);
        }
        typedArrayObtainTypedArray.recycle();
        this.f37842OooO0OO = iArr;
        this.f37846OooO0oO = j / ((long) length);
    }
}
