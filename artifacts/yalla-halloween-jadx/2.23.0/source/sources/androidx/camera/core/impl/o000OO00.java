package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000OO00 implements p028Oooo0oO.o000O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f3705OooO0O0;

    public o000OO00(int i) {
        this.f3705OooO0O0 = i;
    }

    @Override // p028Oooo0oO.o000O
    public final OooOOO0 OooO00o() {
        return p028Oooo0oO.o000O.f1108OooO00o;
    }

    @Override // p028Oooo0oO.o000O
    @NonNull
    public final ArrayList OooO0O0(@NonNull List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            o000OO.OooOOO0.OooO0O0(cameraInfo instanceof o0Oo0oo, "The camera info doesn't contain internal implementation.");
            if (cameraInfo.OooO0o0() == this.f3705OooO0O0) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }
}
