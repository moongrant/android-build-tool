package com.app.base.app.appConfig.apiDataModela;

import OooOOO.OooOOO0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0Oo0oo;
import p140o00OOOoO.OooO0OO;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JY\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u000627\u0010\n\u001a3\u0012)\u0012'\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000bJ\u0016\u0010\u0013\u001a\u00020\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0015¨\u0006\u0016"}, d2 = {"Lcom/app/base/app/appConfig/apiDataModela/FriendsRepository;", "", "()V", "loadFriendsData", "", "pageIndex", "", "time", "", "pageSize", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/yalla/yalla/common/model/Response;", "Ljava/util/ArrayList;", "Lcom/app/base/app/appConfig/apiDataModela/FriendsModel;", "Lkotlin/collections/ArrayList;", "Lkotlin/ParameterName;", "name", "response", "toDBUserFriends", "data", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FriendsRepository {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toDBUserFriends$lambda-0, reason: not valid java name */
    public static final void m10toDBUserFriends$lambda0(List list, OooO0OO message) {
        Intrinsics.checkNotNullParameter(message, "$message");
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                FriendsTableOld friendsTableOld = new FriendsTableOld();
                friendsTableOld.userid = String.valueOf(((FriendsModel) list.get(i)).getUserid());
                friendsTableOld.username = ((FriendsModel) list.get(i)).getNickname();
                friendsTableOld.headphoto = ((FriendsModel) list.get(i)).getImageurl();
                friendsTableOld.uservip = ((FriendsModel) list.get(i)).getVip();
                friendsTableOld.remarkname = "";
                friendsTableOld.supervip = ((FriendsModel) list.get(i)).getViplevel();
                friendsTableOld.standbyone = ((FriendsModel) list.get(i)).getPrettyid();
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                friendsTableOld.standbytwo = String.valueOf(oooOOO.OooOo().getValue());
                friendsTableOld.standbythree = ((FriendsModel) list.get(i)).getSex();
                friendsTableOld.standbyfour = "1";
                if (((FriendsModel) list.get(i)).getCreatetime() != 0) {
                    friendsTableOld.ctime = ((FriendsModel) list.get(i)).getCreatetime();
                } else {
                    friendsTableOld.ctime = System.currentTimeMillis();
                }
                friendsTableOld.role = ((FriendsModel) list.get(i)).getRole();
                friendsTableOld.sign = ((FriendsModel) list.get(i)).getSign();
                friendsTableOld.headframeurl = ((FriendsModel) list.get(i)).getHeadframeurl();
                friendsTableOld.memoName = ((FriendsModel) list.get(i)).getMemoName();
                FriendsTableOld friendsTableOldOooO0oO = p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO0oO(((FriendsModel) list.get(i)).getUserid(), String.valueOf(oooOOO.OooOo().getValue()));
                if (friendsTableOldOooO0oO != null) {
                    p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO0o0(friendsTableOldOooO0oO);
                }
                p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO0o(friendsTableOld);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            message.f31885OooO00o = 3;
            o0Oo0oo.OooO0o(message);
        }
    }

    public final void loadFriendsData(final int pageIndex, final long time, final int pageSize, @NotNull final Function1<? super Response<ArrayList<FriendsModel>>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32208OooO0O0.OooO00o(String.valueOf(pageIndex), String.valueOf(pageSize), String.valueOf(time), new o00OO0O0.OooO0O0() { // from class: com.app.base.app.appConfig.apiDataModela.FriendsRepository.loadFriendsData.1
            @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
            public void onError(@Nullable String code2, @Nullable String message) {
                super.onError(code2, message);
                listener.invoke(new Response<>(false, null, false, new Error(code2 != null ? Integer.valueOf(Integer.parseInt(code2)) : null, message), 6, null));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
            public void onFinish(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                super.onFinish(response);
                FriendsModelBean friendsModelBean = (FriendsModelBean) com.android.billingclient.api.o0Oo0oo.OooO0OO(response, new o00000O0<FriendsModelBean>() { // from class: com.app.base.app.appConfig.apiDataModela.FriendsRepository$loadFriendsData$1$onFinish$result$1
                }.getType());
                FriendsRepository.this.toDBUserFriends(friendsModelBean != null ? (ArrayList) friendsModelBean.data : null);
                if (friendsModelBean != null) {
                    int i = pageSize;
                    int i2 = pageIndex;
                    Function1<Response<ArrayList<FriendsModel>>, Unit> function1 = listener;
                    FriendsRepository friendsRepository = FriendsRepository.this;
                    long j = time;
                    Model model = friendsModelBean.data;
                    Response<ArrayList<FriendsModel>> response2 = new Response<>(true, model, o00oOoo.OooO00o((ArrayList) model, i), null, 8, null);
                    response2.getPage().setPageIndex(i2);
                    response2.getPage().setPageSize(i);
                    function1.invoke(response2);
                    if (o00oOoo.OooO00o((ArrayList) friendsModelBean.data, i)) {
                        return;
                    }
                    friendsRepository.loadFriendsData(response2.getPage().getPageIndex() + 1, j, i, function1);
                }
            }
        });
    }

    public final void toDBUserFriends(@Nullable List<FriendsModel> data) {
        OooO0OO oooO0OO = new OooO0OO();
        if (data != null && !data.isEmpty()) {
            new Thread(new OooOOO0(data, oooO0OO, 1)).start();
        } else {
            oooO0OO.f31885OooO00o = 35;
            o0Oo0oo.OooO0o(oooO0OO);
        }
    }
}
