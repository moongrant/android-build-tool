package p602o0oo00oo;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSendPostDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SendPostDataUtil.kt\ncom/yalla/yalla/util/sendPostTask/SendPostDataUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n350#2,7:75\n*S KotlinDebug\n*F\n+ 1 SendPostDataUtil.kt\ncom/yalla/yalla/util/sendPostTask/SendPostDataUtil\n*L\n67#1:75,7\n*E\n"})
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final SnapshotStateList<MomentDetailModel> f57385OooO00o = SnapshotStateKt.mutableStateListOf();

    public static int OooO00o(SnapshotStateList snapshotStateList, MomentSendModel momentSendModel) {
        if (snapshotStateList != null && momentSendModel != null) {
            Iterator<T> it = snapshotStateList.iterator();
            int i = 0;
            while (it.hasNext()) {
                MomentSendModel sendPostModel = ((MomentDetailModel) it.next()).getSendPostModel();
                if (sendPostModel != null && sendPostModel.getTaskId() == momentSendModel.getTaskId()) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static void OooO0O0(@NotNull MomentSendModel taskModel) {
        Intrinsics.checkNotNullParameter(taskModel, "taskModel");
        SnapshotStateList<MomentDetailModel> snapshotStateList = f57385OooO00o;
        int iOooO00o = OooO00o(snapshotStateList, taskModel);
        if (snapshotStateList.size() <= iOooO00o || iOooO00o == -1) {
            return;
        }
        snapshotStateList.remove(iOooO00o);
    }

    public static void OooO0OO(@NotNull MomentSendModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SnapshotStateList<MomentDetailModel> snapshotStateList = f57385OooO00o;
        int iOooO00o = OooO00o(snapshotStateList, item);
        if (snapshotStateList.size() <= iOooO00o || iOooO00o == -1) {
            return;
        }
        MomentDetailModel momentDetailModel = new MomentDetailModel();
        momentDetailModel.setSendPostModel(item);
        momentDetailModel.transformBySendModel(item);
        Unit unit = Unit.INSTANCE;
        snapshotStateList.set(iOooO00o, momentDetailModel);
    }
}
