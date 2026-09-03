package o000OO;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public final class OooO0OO {
    @DoNotInline
    public static boolean OooO00o(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    @DoNotInline
    public static int OooO0O0(Object... objArr) {
        return Objects.hash(objArr);
    }
}
