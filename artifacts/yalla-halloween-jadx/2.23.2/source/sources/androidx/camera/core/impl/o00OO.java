package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f3725OooO00o = new ArrayList();

    public static void OooO0O0(ArrayList arrayList, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else {
                    if (i3 == iArr[i4]) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                OooO0O0(arrayList, i, iArr, i2 + 1);
            }
        }
    }

    public final void OooO00o(@NonNull Oooo000 oooo000) {
        this.f3725OooO00o.add(oooo000);
    }

    @Nullable
    public final List<SurfaceConfig> OooO0OO(@NonNull List<SurfaceConfig> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f3725OooO00o;
        if (size > arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList<int[]> arrayList2 = new ArrayList();
        boolean z = false;
        OooO0O0(arrayList2, size2, new int[size2], 0);
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        for (int[] iArr : arrayList2) {
            boolean z2 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    SurfaceConfig surfaceConfig = (SurfaceConfig) arrayList.get(i);
                    SurfaceConfig surfaceConfig2 = list.get(iArr[i]);
                    surfaceConfig.getClass();
                    z2 &= surfaceConfig2.OooO0O0().mId <= surfaceConfig.OooO0O0().mId && surfaceConfig2.OooO0OO() == surfaceConfig.OooO0OO();
                    if (!z2) {
                        break;
                    }
                    surfaceConfigArr[iArr[i]] = (SurfaceConfig) arrayList.get(i);
                }
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }
}
