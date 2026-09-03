package p238o00oOooo;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class o0OO00OO {

    @AutoValue.Builder
    public static abstract class OooO00o {
    }

    public static o0O0o000.OooO00o OooO00o() {
        o0O0o000.OooO00o oooO00o = new o0O0o000.OooO00o();
        oooO00o.OooO0OO(Priority.DEFAULT);
        return oooO00o;
    }

    public abstract String OooO0O0();

    @Nullable
    public abstract byte[] OooO0OO();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract Priority OooO0Oo();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final o0O0o000 OooO0o0(Priority priority) {
        o0O0o000.OooO00o OooO00o2 = OooO00o();
        OooO00o2.OooO0O0(OooO0O0());
        OooO00o2.OooO0OO(priority);
        OooO00o2.f40009OooO0O0 = OooO0OO();
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
