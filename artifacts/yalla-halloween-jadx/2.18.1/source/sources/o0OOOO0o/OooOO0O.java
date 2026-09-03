package o0OOOO0o;

import com.google.common.annotations.GwtCompatible;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38237OooO00o;

    public OooOO0O() {
        this.f38237OooO00o = ", ";
    }

    public CharSequence OooO00o(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public OooOO0O(OooOO0O oooOO0O) {
        this.f38237OooO00o = oooOO0O.f38237OooO00o;
    }
}
