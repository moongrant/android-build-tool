package p169o00Ooo00;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p522o0o0O0o.o000O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOOO f32671OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList<MomentDetailModel> f32672OooO0O0 = new ArrayList<>();

    public static final class OooO00o extends Lambda implements Function1<MomentDetailModel, Long> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f32673Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentSendModel sendPostModel = it.getSendPostModel();
            if (sendPostModel != null) {
                return Long.valueOf(sendPostModel.getTaskId());
            }
            return null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<MomentDetailModel, Long> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f32674Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(MomentDetailModel momentDetailModel) {
            MomentDetailModel it = momentDetailModel;
            Intrinsics.checkNotNullParameter(it, "it");
            return Long.valueOf(it.getId());
        }
    }

    @NotNull
    public static final ArrayList OooO00o(@Nullable List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<MomentDetailModel> arrayList2 = f32672OooO0O0;
        CollectionsKt.sortWith(arrayList2, new Comparator() { // from class: o00Ooo00.OooOOO

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ boolean f32670Oooo0o = true;

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                boolean z = this.f32670Oooo0o;
                MomentSendModel sendPostModel = ((MomentDetailModel) obj2).getSendPostModel();
                Intrinsics.checkNotNull(sendPostModel);
                long taskId = sendPostModel.getTaskId();
                MomentSendModel sendPostModel2 = ((MomentDetailModel) obj).getSendPostModel();
                Intrinsics.checkNotNull(sendPostModel2);
                long taskId2 = taskId - sendPostModel2.getTaskId();
                if (taskId2 == 0) {
                    return 0;
                }
                if (z) {
                    if (taskId2 > 0) {
                        return 1;
                    }
                } else if (taskId2 < 0) {
                    return 1;
                }
                return -1;
            }
        });
        o000O0.OooO0Oo(arrayList2, OooO00o.f32673Oooo0o);
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MomentDetailModel momentDetailModel = (MomentDetailModel) it.next();
                if (momentDetailModel.getSendPostModel() == null) {
                    arrayList3.add(momentDetailModel);
                }
            }
        }
        o000O0.OooO0Oo(arrayList3, OooO0O0.f32674Oooo0o);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public static final int OooO0O0(@Nullable List list, @Nullable MomentSendModel momentSendModel) {
        if (list == null || momentSendModel == null) {
            return -1;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            MomentSendModel sendPostModel = ((MomentDetailModel) it.next()).getSendPostModel();
            if (sendPostModel != null && sendPostModel.getTaskId() == momentSendModel.getTaskId()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void OooO0OO(@NotNull MomentSendModel taskModel) {
        Intrinsics.checkNotNullParameter(taskModel, "taskModel");
        ArrayList<MomentDetailModel> arrayList = f32672OooO0O0;
        int iOooO0O0 = OooO0O0(arrayList, taskModel);
        if (iOooO0O0 != -1) {
            arrayList.remove(iOooO0O0);
        }
    }

    public static final void OooO0Oo(@NotNull MomentSendModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList<MomentDetailModel> arrayList = f32672OooO0O0;
        int iOooO0O0 = OooO0O0(arrayList, item);
        if (iOooO0O0 != -1) {
            MomentDetailModel momentDetailModel = new MomentDetailModel();
            momentDetailModel.setSendPostModel(item);
            Unit unit = Unit.INSTANCE;
            arrayList.set(iOooO0O0, momentDetailModel);
        }
    }
}
