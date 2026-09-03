package p650o0ooo;

import androidx.lifecycle.Observer;
import com.code.android.util.o000000;
import com.yalla.yalla.model.SignTaskModel;
import com.yalla.yalla.model.TaskModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p590o0oOooo0.x0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0O00oO f58848OooO0Oo;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        LinkedHashMap<Integer, TaskModel.TaskInfo> linkedHashMap;
        ApiResult apiResult = (ApiResult) obj;
        oO0O00oO this$0 = this.f58848OooO0Oo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (apiResult.isSuccess() && apiResult.getData() != null) {
            Object data = apiResult.getData();
            Intrinsics.checkNotNull(data);
            if (((List) data).size() > 0) {
                oO0O00oO.OooOOOO oooOOOO = this$0.f58868OooOOoo;
                oO0O00oO.OooOOOO oooOOOO2 = null;
                if (oooOOOO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooOOOO = null;
                }
                LinkedHashMap<Integer, TaskModel.TaskInfo> linkedHashMap2 = x0.f57306OooO00o;
                Object data2 = apiResult.getData();
                Intrinsics.checkNotNull(data2);
                List data3 = (List) data2;
                Intrinsics.checkNotNullParameter(data3, "data");
                ArrayList<SignTaskModel> arrayList = new ArrayList();
                Iterator it = data3.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashMap = x0.f57306OooO00o;
                    if (!zHasNext) {
                        break;
                    }
                    Object next = it.next();
                    SignTaskModel signTaskModel = (SignTaskModel) next;
                    if (!o000000.OooO00o(Integer.valueOf(signTaskModel.isOneTime())) && linkedHashMap.containsKey(Integer.valueOf(signTaskModel.getTakeId()))) {
                        arrayList.add(next);
                    }
                }
                for (SignTaskModel signTaskModel2 : arrayList) {
                    TaskModel.TaskInfo taskInfo = linkedHashMap.get(Integer.valueOf(signTaskModel2.getTakeId()));
                    Intrinsics.checkNotNull(taskInfo);
                    signTaskModel2.setIcon(taskInfo.icon);
                    TaskModel.TaskInfo taskInfo2 = linkedHashMap.get(Integer.valueOf(signTaskModel2.getTakeId()));
                    Intrinsics.checkNotNull(taskInfo2);
                    signTaskModel2.setName(taskInfo2.name);
                    TaskModel.TaskInfo taskInfo3 = linkedHashMap.get(Integer.valueOf(signTaskModel2.getTakeId()));
                    Intrinsics.checkNotNull(taskInfo3);
                    signTaskModel2.setSubtitle(taskInfo3.subtitle);
                }
                oooOOOO.OooOoO0(arrayList);
                oO0O00oO.OooOOOO oooOOOO3 = this$0.f58868OooOOoo;
                if (oooOOOO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooOOOO2 = oooOOOO3;
                }
                oooOOOO2.Oooo00o();
                return;
            }
        }
        this$0.OooOOOo();
    }
}
