package com.app.base.app.appConfig.apiDataModela;

import com.android.billingclient.api.o00000O;
import com.app.base.application.App;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import java.util.ArrayList;
import java.util.List;
import p034OoooO0O.o0Oo0oo;
import p140o00OOOoO.OooO0OO;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p160o00OoOO0.o00OO0O0;
import p166o00OoOoo.o0O00O0o;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public class ApiUserFriendsUtils {
    private static ApiUserFriendsUtils instance;
    private final int mPageSizeFriends = 100;
    private boolean loadingAll = true;

    private ApiUserFriendsUtils() {
    }

    public static ApiUserFriendsUtils getInstance() {
        if (instance == null) {
            instance = new ApiUserFriendsUtils();
        }
        return instance;
    }

    @Deprecated
    public void getUserFriends() {
        o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("First_Friends");
        sbOooO0o0.append(OooOOO.f41216OooO00o.OooOo().getValue());
        o0o00o0oOooO0O0.OooO0Oo(sbOooO0o0.toString(), false);
    }

    public void toDBUserFriends(final List<FriendsModel> list) {
        final OooO0OO oooO0OO = new OooO0OO();
        if (list != null && !list.isEmpty()) {
            new Thread(new Runnable() { // from class: com.app.base.app.appConfig.apiDataModela.ApiUserFriendsUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    for (int i = 0; i < list.size(); i++) {
                        try {
                            FriendsTableOld friendsTableOld = new FriendsTableOld();
                            friendsTableOld.userid = ((FriendsModel) list.get(i)).getUserid();
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
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    OooO0OO oooO0OO2 = oooO0OO;
                    oooO0OO2.f31885OooO00o = 3;
                    o0Oo0oo.OooO0o(oooO0OO2);
                }
            }).start();
        } else {
            oooO0OO.f31885OooO00o = 35;
            o0Oo0oo.OooO0o(oooO0OO);
        }
    }

    public void getUserFriends(int i, long j) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32208OooO0O0.OooO00o(i + "", "100", j + "", new o00OO0O0.OooO0O0(App.f11458Oooo0oO) { // from class: com.app.base.app.appConfig.apiDataModela.ApiUserFriendsUtils.1
            @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
            public void onError(String str, String str2) {
                super.onError(str, str2);
                o0Oo0oo.OooO0o0(35, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
            public void onFinish(String str) {
                FriendsModelBean friendsModelBean = (FriendsModelBean) com.android.billingclient.api.o0Oo0oo.OooO0O0(str, FriendsModelBean.class);
                if (friendsModelBean == null) {
                    o0Oo0oo.OooO0o0(35, null);
                    return;
                }
                ApiUserFriendsUtils.this.toDBUserFriends(friendsModelBean.getData());
                if (((ArrayList) friendsModelBean.data).size() == 100) {
                    ApiUserFriendsUtils apiUserFriendsUtils = ApiUserFriendsUtils.this;
                    Model model = friendsModelBean.data;
                    apiUserFriendsUtils.getUserFriends(1, ((FriendsModel) ((ArrayList) model).get(((ArrayList) model).size() - 1)).getCreatetime());
                }
            }
        });
    }
}
