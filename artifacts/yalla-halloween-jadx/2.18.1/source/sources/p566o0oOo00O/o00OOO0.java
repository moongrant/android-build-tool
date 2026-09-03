package p566o0oOo00O;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.UserHeaderFrameModel;
import com.app.base.model.UserHeaderFrameModelList;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.ui.activity.user.OooO0o;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f45277OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(UserHeaderFrameActivity userHeaderFrameActivity) {
        super(userHeaderFrameActivity);
        this.f45277OooO00o = userHeaderFrameActivity;
    }

    public final List<UserHeaderFrameModel> OooO00o(List<UserHeaderFrameModel> list, int i) {
        Iterator<UserHeaderFrameModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().setLocalTypeModel(i);
        }
        return list;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        UserHeaderFrameModelList userHeaderFrameModelList = (UserHeaderFrameModelList) o0Oo0oo.OooO0O0(response, UserHeaderFrameModelList.class);
        if (userHeaderFrameModelList != null) {
            if (OooO0OO.OooO00o(userHeaderFrameModelList.getDataOfLock()) && OooO0OO.OooO00o(userHeaderFrameModelList.getDataOfUnlock())) {
                return;
            }
            this.f45277OooO00o.f23443Ooooo00.clear();
            List<UserHeaderFrameModel> list = this.f45277OooO00o.f23443Ooooo00;
            UserHeaderFrameModel userHeaderFrameModel = new UserHeaderFrameModel();
            userHeaderFrameModel.setLocalTypeModel(2);
            list.add(userHeaderFrameModel);
            List<UserHeaderFrameModel> list2 = this.f45277OooO00o.f23443Ooooo00;
            ArrayList<UserHeaderFrameModel> dataOfUnlock = userHeaderFrameModelList.getDataOfUnlock();
            if (dataOfUnlock == null) {
                dataOfUnlock = new ArrayList<>();
            }
            OooO00o(dataOfUnlock, 1);
            list2.addAll(dataOfUnlock);
            List<UserHeaderFrameModel> list3 = this.f45277OooO00o.f23443Ooooo00;
            UserHeaderFrameModel userHeaderFrameModel2 = new UserHeaderFrameModel();
            userHeaderFrameModel2.setLocalTypeModel(3);
            list3.add(userHeaderFrameModel2);
            List<UserHeaderFrameModel> list4 = this.f45277OooO00o.f23443Ooooo00;
            ArrayList<UserHeaderFrameModel> dataOfLock = userHeaderFrameModelList.getDataOfLock();
            if (dataOfLock == null) {
                dataOfLock = new ArrayList<>();
            }
            int i = 0;
            OooO00o(dataOfLock, 0);
            list4.addAll(dataOfLock);
            List<UserHeaderFrameModel> list5 = this.f45277OooO00o.f23443Ooooo00;
            UserHeaderFrameModel userHeaderFrameModel3 = new UserHeaderFrameModel();
            userHeaderFrameModel3.setLocalTypeModel(4);
            list5.add(userHeaderFrameModel3);
            ArrayList<UserHeaderFrameModel> dataOfUnlock2 = userHeaderFrameModelList.getDataOfUnlock();
            if (dataOfUnlock2 != null) {
                UserHeaderFrameActivity userHeaderFrameActivity = this.f45277OooO00o;
                userHeaderFrameActivity.f23445OooooO0 = dataOfUnlock2.get(dataOfUnlock2.size() - 1);
                for (Object obj : dataOfUnlock2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    UserHeaderFrameModel userHeaderFrameModel4 = (UserHeaderFrameModel) obj;
                    if (userHeaderFrameModel4.getIsweared() == 1) {
                        userHeaderFrameActivity.f23445OooooO0 = userHeaderFrameModel4;
                        userHeaderFrameActivity.f23446OooooOO = i;
                    }
                    i = i2;
                }
                UserHeaderFrameModel userHeaderFrameModel5 = userHeaderFrameActivity.f23445OooooO0;
                if (userHeaderFrameModel5 != null) {
                    userHeaderFrameModel5.setLocalIsSelect(true);
                }
            }
            UserHeaderFrameActivity userHeaderFrameActivity2 = this.f45277OooO00o;
            UserHeaderFrameActivity.OooOoo(userHeaderFrameActivity2, userHeaderFrameActivity2.f23445OooooO0);
            ((OooO0o) this.f45277OooO00o.f23448Oooooo.getValue()).setNewData(this.f45277OooO00o.f23443Ooooo00);
        }
    }
}
