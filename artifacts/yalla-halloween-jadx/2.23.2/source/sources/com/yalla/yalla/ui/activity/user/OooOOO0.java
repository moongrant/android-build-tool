package com.yalla.yalla.ui.activity.user;

import com.yalla.yalla.model.user.UserHeaderFrameModel;
import com.yalla.yalla.model.user.UserHeaderFrameModelList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nUserHeaderFrameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserHeaderFrameActivity.kt\ncom/yalla/yalla/ui/activity/user/UserHeaderFrameActivity$loadHeadFrameList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1864#2,3:309\n*S KotlinDebug\n*F\n+ 1 UserHeaderFrameActivity.kt\ncom/yalla/yalla/ui/activity/user/UserHeaderFrameActivity$loadHeadFrameList$1\n*L\n237#1:309,3\n*E\n"})
public final class OooOOO0 extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f26666OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(UserHeaderFrameActivity userHeaderFrameActivity) {
        super(userHeaderFrameActivity);
        this.f26666OooO0o0 = userHeaderFrameActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        int i;
        Intrinsics.checkNotNullParameter(response, "response");
        UserHeaderFrameModelList userHeaderFrameModelList = (UserHeaderFrameModelList) oOOO00.OooO00o(response, UserHeaderFrameModelList.class);
        if (userHeaderFrameModelList != null) {
            if (com.code.android.util.OooOo00.OooO00o(userHeaderFrameModelList.getDataOfLock()) && com.code.android.util.OooOo00.OooO00o(userHeaderFrameModelList.getDataOfUnlock())) {
                return;
            }
            UserHeaderFrameActivity userHeaderFrameActivity = this.f26666OooO0o0;
            userHeaderFrameActivity.f26768OooOo00.clear();
            ArrayList arrayList = userHeaderFrameActivity.f26768OooOo00;
            UserHeaderFrameModel userHeaderFrameModel = new UserHeaderFrameModel();
            userHeaderFrameModel.setLocalTypeModel(2);
            arrayList.add(userHeaderFrameModel);
            ArrayList<UserHeaderFrameModel> dataOfUnlock = userHeaderFrameModelList.getDataOfUnlock();
            if (dataOfUnlock == null) {
                dataOfUnlock = new ArrayList<>();
            }
            Iterator<UserHeaderFrameModel> it = dataOfUnlock.iterator();
            while (it.hasNext()) {
                it.next().setLocalTypeModel(1);
            }
            arrayList.addAll(dataOfUnlock);
            UserHeaderFrameModel userHeaderFrameModel2 = new UserHeaderFrameModel();
            userHeaderFrameModel2.setLocalTypeModel(3);
            arrayList.add(userHeaderFrameModel2);
            ArrayList<UserHeaderFrameModel> dataOfLock = userHeaderFrameModelList.getDataOfLock();
            if (dataOfLock == null) {
                dataOfLock = new ArrayList<>();
            }
            Iterator<UserHeaderFrameModel> it2 = dataOfLock.iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                } else {
                    it2.next().setLocalTypeModel(0);
                }
            }
            arrayList.addAll(dataOfLock);
            UserHeaderFrameModel userHeaderFrameModel3 = new UserHeaderFrameModel();
            userHeaderFrameModel3.setLocalTypeModel(4);
            arrayList.add(userHeaderFrameModel3);
            ArrayList<UserHeaderFrameModel> dataOfUnlock2 = userHeaderFrameModelList.getDataOfUnlock();
            if (dataOfUnlock2 != null) {
                userHeaderFrameActivity.f26769OooOo0O = (UserHeaderFrameModel) p018OooOoo0.OooOOO.OooO00o(dataOfUnlock2, 1);
                for (Object obj : dataOfUnlock2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    UserHeaderFrameModel userHeaderFrameModel4 = (UserHeaderFrameModel) obj;
                    if (userHeaderFrameModel4.getIsweared() == 1) {
                        userHeaderFrameActivity.f26769OooOo0O = userHeaderFrameModel4;
                        userHeaderFrameActivity.f26770OooOo0o = i;
                    }
                    i = i2;
                }
                UserHeaderFrameModel userHeaderFrameModel5 = userHeaderFrameActivity.f26769OooOo0O;
                if (userHeaderFrameModel5 != null) {
                    userHeaderFrameModel5.setLocalIsSelect(true);
                }
            }
            UserHeaderFrameActivity.OooOo(userHeaderFrameActivity, userHeaderFrameActivity.f26769OooOo0O);
            ((OooOO0O) userHeaderFrameActivity.f26771OooOoO.getValue()).OooOoO0(arrayList);
        }
    }
}
