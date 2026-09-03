package p084o000Ooo0;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import p085o000OooO.o000oOoO;
import p085o000OooO.o0OOO0o;
import p093o000o0OO.oo000o;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class o00oO0o {
    @NonNull
    public final void OooO00o(@NonNull o0OoOo0 o0oooo0) {
        List listSingletonList = Collections.singletonList(o0oooo0);
        o0OOO0o o0ooo0o2 = (o0OOO0o) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        o000oOoO o000oooo2 = new o000oOoO(o0ooo0o2, listSingletonList);
        if (!o000oooo2.f35148OooO0oo) {
            ((o0000O0O) o0ooo0o2.f35161OooO0Oo).OooO00o(new oo000o(o000oooo2));
            return;
        }
        o000oOoO.OooO0OO().OooO0o(o000oOoO.f35140OooO, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", o000oooo2.f35146OooO0o0)), new Throwable[0]);
    }
}
