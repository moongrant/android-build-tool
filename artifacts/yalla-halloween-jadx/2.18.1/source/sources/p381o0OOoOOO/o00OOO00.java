package p381o0OOoOOO;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f38780OooO00o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f38784OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("internalQueue")
    @VisibleForTesting
    public final ArrayDeque<String> f38783OooO0Oo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38781OooO0O0 = "topic_operation_queue";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f38782OooO0OO = ",";

    public o00OOO00(SharedPreferences sharedPreferences, Executor executor) {
        this.f38780OooO00o = sharedPreferences;
        this.f38784OooO0o0 = executor;
    }

    @WorkerThread
    public static o00OOO00 OooO00o(SharedPreferences sharedPreferences, Executor executor) {
        o00OOO00 o00ooo01 = new o00OOO00(sharedPreferences, executor);
        synchronized (o00ooo01.f38783OooO0Oo) {
            o00ooo01.f38783OooO0Oo.clear();
            String string = o00ooo01.f38780OooO00o.getString(o00ooo01.f38781OooO0O0, "");
            if (!TextUtils.isEmpty(string) && string.contains(o00ooo01.f38782OooO0OO)) {
                String[] strArrSplit = string.split(o00ooo01.f38782OooO0OO, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        o00ooo01.f38783OooO0Oo.add(str);
                    }
                }
            }
        }
        return o00ooo01;
    }
}
