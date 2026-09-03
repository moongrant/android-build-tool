package p423o0OoO0OO;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nListMapArrayFun.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListMapArrayFun.kt\ncom/yalla/yalla/ext/ListMapArrayFunKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n350#2,7:46\n*S KotlinDebug\n*F\n+ 1 ListMapArrayFun.kt\ncom/yalla/yalla/ext/ListMapArrayFunKt\n*L\n37#1:46,7\n*E\n"})
public final class o000OOo0 {
    public static boolean OooO00o(ArrayList arrayList) {
        return (arrayList != null ? arrayList.size() : 0) < Integer.parseInt("15");
    }

    public static final void OooO0O0(@NotNull SnapshotStateList snapshotStateList, @NotNull MixedRoomDataSource.OooO00o listToCompareCallback) {
        Intrinsics.checkNotNullParameter(snapshotStateList, "<this>");
        Intrinsics.checkNotNullParameter(listToCompareCallback, "listToCompareCallback");
        Iterator<T> it = snapshotStateList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else {
                if (listToCompareCallback.f23008OooO00o.getBonusid() == ((Room.EnvelopInfo) it.next()).getBonusid()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i >= 0) {
            snapshotStateList.remove(i);
        }
    }
}
