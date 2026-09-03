package p286o0O0O0oO;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class o0OO00O {

    @AutoValue.Builder
    public static abstract class OooO00o {
        public abstract OooO00o OooO00o(String str);
    }

    public static OooO00o OooO00o() {
        o0OoOo0.OooO00o oooO00o = new o0OoOo0.OooO00o();
        oooO00o.OooO0OO(Priority.DEFAULT);
        return oooO00o;
    }

    public abstract String OooO0O0();

    @Nullable
    public abstract byte[] OooO0OO();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract Priority OooO0Oo();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = OooO0O0();
        objArr[1] = OooO0Oo();
        objArr[2] = OooO0OO() == null ? "" : Base64.encodeToString(OooO0OO(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
