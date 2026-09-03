package p163o00OoOoo;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f38514OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f38515OooO0O0;

    public o000Oo0(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
        this.f38514OooO00o = obj;
        this.f38515OooO0O0 = new ArrayList();
    }

    public final void OooO00o(Object obj, String str) {
        ArrayList arrayList = this.f38515OooO0O0;
        String str2 = str + "=" + obj;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        arrayList.add(str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f38514OooO00o.getClass().getSimpleName());
        sb.append('{');
        ArrayList arrayList = this.f38515OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) arrayList.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
