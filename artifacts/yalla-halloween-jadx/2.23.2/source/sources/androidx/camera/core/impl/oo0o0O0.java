package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ArrayList f3781OooO00o;

    public oo0o0O0(@NonNull ArrayList arrayList) {
        this.f3781OooO00o = new ArrayList(arrayList);
    }

    public final boolean OooO00o(@NonNull Class<? extends o00O0OO0> cls) {
        Iterator it = this.f3781OooO00o.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((o00O0OO0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final <T extends o00O0OO0> T OooO0O0(@NonNull Class<T> cls) {
        for (T t : this.f3781OooO00o) {
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    public final ArrayList OooO0OO(@NonNull Class cls) {
        ArrayList arrayList = new ArrayList();
        for (o00O0OO0 o00o0oo1 : this.f3781OooO00o) {
            if (cls.isAssignableFrom(o00o0oo1.getClass())) {
                arrayList.add(o00o0oo1);
            }
        }
        return arrayList;
    }
}
