package p102o000oo;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;
import o00O000.OooO0O0;
import p107o000ooO0.o000oOoO;
import p107o000ooO0.o00oO0o;
import p326o0O0ooO.o00O000;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class o0ooOOo {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o0ooOOo() {
    }

    @NonNull
    public final o00Oo0 OooO00o(@NonNull o0OOO0o o0ooo0o2) {
        List listSingletonList = Collections.singletonList(o0ooo0o2);
        o00oO0o o00oo0o2 = (o00oO0o) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        o000oOoO o000oooo2 = new o000oOoO(o00oo0o2, listSingletonList);
        if (o000oooo2.f29967OooO0oo) {
            o0OoOo0.OooO0OO().OooO0o(o000oOoO.f29958OooOO0, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", o000oooo2.f29965OooO0o0)), new Throwable[0]);
        } else {
            o00O000 o00o001 = new o00O000(o000oooo2);
            ((OooO0O0) o00oo0o2.f29977OooO0Oo).OooO00o(o00o001);
            o000oooo2.f29959OooO = o00o001.f36981Oooo0oO;
        }
        return o000oooo2.f29959OooO;
    }
}
