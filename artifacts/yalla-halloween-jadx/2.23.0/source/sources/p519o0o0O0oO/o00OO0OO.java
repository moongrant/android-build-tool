package p519o0o0O0oO;

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
import p579o0oOoo.oOOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO implements Observer<ApiResult<List<SignTaskModel>>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0OOO f52600OooO0Oo;

    public o00OO0OO(o00O0OOO o00o0ooo2) {
        this.f52600OooO0Oo = o00o0ooo2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ApiResult<List<SignTaskModel>> apiResult) {
        LinkedHashMap<Integer, TaskModel.TaskInfo> linkedHashMap;
        ApiResult<List<SignTaskModel>> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        o00O0OOO o00o0ooo2 = this.f52600OooO0Oo;
        if (zIsSuccess && apiResult2.getData() != null) {
            List<SignTaskModel> data = apiResult2.getData();
            Intrinsics.checkNotNull(data);
            if (data.size() > 0) {
                o00O0OOO.OooOOOO oooOOOO = o00o0ooo2.f52574OooOOoo;
                o00O0OOO.OooOOOO oooOOOO2 = null;
                if (oooOOOO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooOOOO = null;
                }
                LinkedHashMap<Integer, TaskModel.TaskInfo> linkedHashMap2 = oOOO0OOO.f56682OooO00o;
                List<SignTaskModel> data2 = apiResult2.getData();
                Intrinsics.checkNotNull(data2);
                List<SignTaskModel> data3 = data2;
                Intrinsics.checkNotNullParameter(data3, "data");
                ArrayList<SignTaskModel> arrayList = new ArrayList();
                Iterator<T> it = data3.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    linkedHashMap = oOOO0OOO.f56682OooO00o;
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
                }
                oooOOOO.OooOoO0(arrayList);
                o00O0OOO.OooOOOO oooOOOO3 = o00o0ooo2.f52574OooOOoo;
                if (oooOOOO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    oooOOOO2 = oooOOOO3;
                }
                oooOOOO2.Oooo00o();
                return;
            }
        }
        o00o0ooo2.OooOOOo();
    }
}
