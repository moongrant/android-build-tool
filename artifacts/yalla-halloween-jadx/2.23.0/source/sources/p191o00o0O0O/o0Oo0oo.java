package p191o00o0O0O;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class o0Oo0oo {

    @AutoValue.Builder
    public static abstract class OooO00o {
    }

    public static Oooo0.OooO00o OooO00o() {
        Oooo0.OooO00o oooO00o = new Oooo0.OooO00o();
        oooO00o.OooO0OO(Priority.DEFAULT);
        return oooO00o;
    }

    public abstract String OooO0O0();

    @Nullable
    public abstract byte[] OooO0OO();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract Priority OooO0Oo();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Oooo0 OooO0o0(Priority priority) {
        Oooo0.OooO00o OooO00o2 = OooO00o();
        OooO00o2.OooO0O0(OooO0O0());
        OooO00o2.OooO0OO(priority);
        OooO00o2.f38911OooO0O0 = OooO0OO();
        return OooO00o2.OooO00o();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = OooO0O0();
        objArr[1] = OooO0Oo();
        objArr[2] = OooO0OO() == null ? "" : Base64.encodeToString(OooO0OO(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
