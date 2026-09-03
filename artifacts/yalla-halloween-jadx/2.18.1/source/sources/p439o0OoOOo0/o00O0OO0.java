package p439o0OoOOo0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;
import java.util.Objects;
import p433o0OoOO0o.o0O0oo0o;
import p433o0OoOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o00O0OO0 f40173OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O0O00 f40174OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Picasso f40175OooO0O0;

    public o00O0OO0() {
        o0O0oo0o o0o0oo0oOooO0OO = o0O0oo0o.OooO0OO();
        o0oO0Ooo.OooO0O0().OooO00o("com.twitter.sdk.android:tweet-ui");
        Objects.requireNonNull(o0o0oo0oOooO0OO);
        o0o0oo0oOooO0OO.OooO0O0();
        this.f40174OooO00o = new o00O0O00(new Handler(Looper.getMainLooper()), o0o0oo0oOooO0OO.f39949OooO00o);
        this.f40175OooO0O0 = Picasso.OooO0o(o0oO0Ooo.OooO0O0().OooO00o("com.twitter.sdk.android:tweet-ui"));
    }

    public static o00O0OO0 OooO00o() {
        if (f40173OooO0OO == null) {
            synchronized (o00O0OO0.class) {
                if (f40173OooO0OO == null) {
                    f40173OooO0OO = new o00O0OO0();
                }
            }
        }
        return f40173OooO0OO;
    }
}
