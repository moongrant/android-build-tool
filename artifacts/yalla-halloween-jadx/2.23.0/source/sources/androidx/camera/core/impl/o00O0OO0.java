package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ArrayList f3724OooO00o;

    public o00O0OO0(@NonNull ArrayList arrayList) {
        this.f3724OooO00o = new ArrayList(arrayList);
    }

    public final boolean OooO00o(@NonNull Class<? extends o00O0O0O> cls) {
        Iterator it = this.f3724OooO00o.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((o00O0O0O) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final <T extends o00O0O0O> T OooO0O0(@NonNull Class<T> cls) {
        for (T t : this.f3724OooO00o) {
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    public final ArrayList OooO0OO(@NonNull Class cls) {
        ArrayList arrayList = new ArrayList();
        for (o00O0O0O o00o0o0o2 : this.f3724OooO00o) {
            if (cls.isAssignableFrom(o00o0o0o2.getClass())) {
                arrayList.add(o00o0o0o2);
            }
        }
        return arrayList;
    }
}
