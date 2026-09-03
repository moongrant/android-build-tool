package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ArrayList f3637OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Set<Size> f3638OooO0O0;

    public o000(@Nullable ArrayList arrayList) {
        Set<Size> setEmptySet;
        ArrayList arrayList2 = new ArrayList();
        this.f3637OooO00o = arrayList2;
        arrayList2.addAll(arrayList);
        if (arrayList.isEmpty()) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(((p032OoooO00.OooO0OO) arrayList.get(0)).OooO00o());
            for (int i = 1; i < arrayList.size(); i++) {
                hashSet.retainAll(((p032OoooO00.OooO0OO) arrayList.get(i)).OooO00o());
            }
            setEmptySet = hashSet;
        }
        this.f3638OooO0O0 = setEmptySet;
    }
}
