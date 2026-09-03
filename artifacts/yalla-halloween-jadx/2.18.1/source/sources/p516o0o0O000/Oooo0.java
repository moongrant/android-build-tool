package p516o0o0O000;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.annotation.ArrayRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {
    @NotNull
    public static final int[] OooO00o(@NotNull Context context, @ArrayRes int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int[] iArr = new int[0];
        try {
            TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(i);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainTypedArray, "this.resources.obtainTypedArray(arrayId)");
            int length = typedArrayObtainTypedArray.length();
            iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, -1);
            }
            typedArrayObtainTypedArray.recycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iArr;
    }
}
