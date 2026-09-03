package p058o0000Ooo;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f34237OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float[] f34238OooO0O0;

    public o00O0O(@NonNull ArrayList arrayList, @NonNull ArrayList arrayList2) {
        int size = arrayList.size();
        this.f34237OooO00o = new int[size];
        this.f34238OooO0O0 = new float[size];
        for (int i = 0; i < size; i++) {
            this.f34237OooO00o[i] = ((Integer) arrayList.get(i)).intValue();
            this.f34238OooO0O0[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public o00O0O(@ColorInt int i, @ColorInt int i2) {
        this.f34237OooO00o = new int[]{i, i2};
        this.f34238OooO0O0 = new float[]{0.0f, 1.0f};
    }

    public o00O0O(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        this.f34237OooO00o = new int[]{i, i2, i3};
        this.f34238OooO0O0 = new float[]{0.0f, 0.5f, 1.0f};
    }
}
