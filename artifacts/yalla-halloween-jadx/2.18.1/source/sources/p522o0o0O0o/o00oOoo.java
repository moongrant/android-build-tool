package p522o0o0O0o;

import com.app.base.protobuf.room.Room;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo {
    public static final <T> boolean OooO00o(@Nullable ArrayList<T> arrayList, int i) {
        return (arrayList != null ? arrayList.size() : 0) < i;
    }

    public static boolean OooO0O0(ArrayList arrayList) {
        return OooO00o(arrayList, Integer.parseInt("15"));
    }

    public static final <T> boolean OooO0OO(@NotNull List<T> list, @NotNull o00O000<T> listToCompareCallback) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(listToCompareCallback, "listToCompareCallback");
        Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((o000O00O.OooO00o) listToCompareCallback).f32448OooO00o.getBonusid() == ((Room.EnvelopInfo) it.next()).getBonusid()) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return false;
        }
        list.remove(i);
        return true;
    }
}
