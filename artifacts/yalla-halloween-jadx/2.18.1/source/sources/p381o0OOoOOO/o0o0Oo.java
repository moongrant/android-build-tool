package p381o0OOoOOO;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class o0o0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("TopicsStore.class")
    public static WeakReference<o0o0Oo> f38820OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OOO00 f38821OooO00o;

    public o0o0Oo(SharedPreferences sharedPreferences, Executor executor) {
    }

    @Nullable
    public final synchronized o00OOO0O OooO00o() {
        String strPeek;
        o00OOO0O o00ooo0o2;
        o00OOO00 o00ooo01 = this.f38821OooO00o;
        synchronized (o00ooo01.f38783OooO0Oo) {
            strPeek = o00ooo01.f38783OooO0Oo.peek();
        }
        Pattern pattern = o00OOO0O.f38785OooO0Oo;
        o00ooo0o2 = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                o00ooo0o2 = new o00OOO0O(strArrSplit[0], strArrSplit[1]);
            }
        }
        return o00ooo0o2;
    }
}
