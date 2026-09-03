package p211o00o0oo0;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f39644OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f39645OooO0O0;

    public o00(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
        this.f39644OooO00o = obj;
        this.f39645OooO0O0 = new ArrayList();
    }

    public final void OooO00o(Object obj, String str) {
        ArrayList arrayList = this.f39645OooO0O0;
        String str2 = str + "=" + obj;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        arrayList.add(str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f39644OooO00o.getClass().getSimpleName());
        sb.append('{');
        ArrayList arrayList = this.f39645OooO0O0;
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
