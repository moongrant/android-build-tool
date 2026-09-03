package com.yalla.yalla.ui.activity.user;

import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.impl.o00OOO00;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.user.UserInfoApiModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0o.o000000;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p426o0OoOO.o0OOO0o;
import p464o0Oooo.o000000O;
import p474o0o00.o0O0000O;
import p496o0o00o.oO0O0O00;
import p496o0o00o.oO0O0O0o;
import p500o0o00oO.o00000O0;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.ja;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserRoomsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserRoomsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRoomsActivity.kt\ncom/yalla/yalla/ui/activity/user/UserRoomsActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,185:1\n22#2,2:186\n*S KotlinDebug\n*F\n+ 1 UserRoomsActivity.kt\ncom/yalla/yalla/ui/activity/user/UserRoomsActivity\n*L\n38#1:186,2\n*E\n"})
public final class UserRoomsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f27361OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f27364OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public String f27365OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public o00000O0<RoomIndexModel> f27366OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27362OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(ja.class), this, null);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f27367OooOo0o = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public String f27363OooOo = "";

    public static final class OooO00o {
        public static void OooO00o(@NotNull FragmentActivity activity, @NotNull String userID, @Nullable UserInfoApiModel userInfoApiModel) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(userID, "userID");
            if (com.code.android.util.OooOo00.OooO00o(userID) || userInfoApiModel == null) {
                return;
            }
            o0OO000.OooO00o("105075");
            Intent intent = new Intent(activity, (Class<?>) UserRoomsActivity.class);
            intent.putExtra("userId", userInfoApiModel.getId());
            intent.putExtra("sex", userInfoApiModel.getSex());
            intent.putExtra("barName", o0000.OooO0OO(oO00OOo0.room));
            intent.putExtra("joinNum", userInfoApiModel.getRjoinNum());
            activity.startActivity(intent);
        }
    }

    public final ja OooOo() {
        return (ja) this.f27362OooOOoo.getValue();
    }

    public final void OooOoO0(final boolean z) {
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        String str = this.f27365OooOo00;
        String strOooO00o = o0OOO0o.OooO00o(this.f27367OooOo0o);
        int i = this.f27364OooOo0;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.user.UserRoomsActivity$loadData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.f27369OooO0o0);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                int i2 = UserRoomsActivity.f27361OooOoO0;
                UserRoomsActivity userRoomsActivity = this.f27369OooO0o0;
                XRefreshLayout xRefreshLayout = userRoomsActivity.OooOo().f58201OooO0OO;
                boolean z2 = z;
                xRefreshLayout.OooOooO(z2, false);
                o00000O0<RoomIndexModel> o00000o1 = userRoomsActivity.f27366OooOo0O;
                Intrinsics.checkNotNull(o00000o1);
                o00000o1.Oooo0(Boolean.valueOf(z2), Boolean.FALSE, Boolean.TRUE);
            }

            /* JADX WARN: Failed to clean up code after switch over string restore
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 int, still in use, count: 2, list:
              (r8v0 int) from 0x006a: IF  (r8v0 int) == (53 int)  -> B:49:0x00e1 A[HIDDEN] (LINE:107)
              (r8v0 int) from 0x006e: IF  (r8v0 int) != (57 int)  -> B:19:0x0070 A[HIDDEN] (LINE:111)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
            	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
             */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                String strOooO0OO;
                Intrinsics.checkNotNullParameter(response, "response");
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) oOo00OO0.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexModel>>() { // from class: com.yalla.yalla.ui.activity.user.UserRoomsActivity$loadData$1$onFinish$model$1
                }.getType());
                boolean z2 = z;
                UserRoomsActivity userRoomsActivity = this.f27369OooO0o0;
                if (commonParseMultiListModel == null || com.code.android.util.OooOo00.OooO00o(commonParseMultiListModel.data)) {
                    int i2 = UserRoomsActivity.f27361OooOoO0;
                    userRoomsActivity.OooOo().f58201OooO0OO.setLoadComplete(z2);
                    o00000O0<RoomIndexModel> o00000o1 = userRoomsActivity.f27366OooOo0O;
                    Intrinsics.checkNotNull(o00000o1);
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    Boolean bool = Boolean.TRUE;
                    o00000o1.Oooo0(boolValueOf, bool, bool);
                    return;
                }
                if (z2) {
                    o00000O0<RoomIndexModel> o00000o2 = userRoomsActivity.f27366OooOo0O;
                    Intrinsics.checkNotNull(o00000o2);
                    o00000o2.OooOoO0(commonParseMultiListModel.data);
                } else {
                    o00000O0<RoomIndexModel> o00000o3 = userRoomsActivity.f27366OooOo0O;
                    Intrinsics.checkNotNull(o00000o3);
                    o00000o3.OooO0O0(commonParseMultiListModel.data);
                }
                o00000O0<RoomIndexModel> o00000o4 = userRoomsActivity.f27366OooOo0O;
                Intrinsics.checkNotNull(o00000o4);
                int size = o00000o4.f10111OooOOoo.size();
                for (int i3 = 0; i3 < size; i3++) {
                    o00000O0<RoomIndexModel> o00000o5 = userRoomsActivity.f27366OooOo0O;
                    Intrinsics.checkNotNull(o00000o5);
                    RoomIndexModel roomIndexModel = o00000o5.f10111OooOOoo.get(i3);
                    String str2 = roomIndexModel.positionid;
                    Intrinsics.checkNotNullExpressionValue(str2, "roomIndexModel.positionid");
                    String str3 = "";
                    if (i3 == 0) {
                        userRoomsActivity.f27363OooOo = "";
                    }
                    if (iHashCode == 53) {
                        strOooO0OO = !str2.equals(FeedbackType.Others) ? "" : o0000.OooO0OO(oO00OOo0.room_type_follow);
                    } else if (iHashCode != 57) {
                        switch (str2) {
                            case "0":
                                String str4 = userRoomsActivity.f27365OooOo00;
                                o000000O o000000o2 = o000000O.f46674OooO00o;
                                strOooO0OO = o0000.OooO0OO(o00OOO00.OooO0O0(str4) ? oO00OOo0.my_room : oO00OOo0.room);
                                break;
                            case "1":
                                String str5 = userRoomsActivity.f27365OooOo00;
                                o000000O o000000o3 = o000000O.f46674OooO00o;
                                strOooO0OO = o0000.OooO0OO(o00OOO00.OooO0O0(str5) ? oO00OOo0.my_room : oO00OOo0.room);
                                break;
                            case "2":
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.room_type_add);
                                break;
                            case "3":
                                strOooO0OO = o0000.OooO0OO(oO00OOo0.room_type_add);
                                break;
                            default:
                                strOooO0OO = "";
                                break;
                        }
                    } else {
                        strOooO0OO = !str2.equals("9") ? "" : o0000.OooO0OO(oO00OOo0.room_type_follow);
                    }
                    if (!Intrinsics.areEqual(userRoomsActivity.f27363OooOo, strOooO0OO)) {
                        userRoomsActivity.f27363OooOo = strOooO0OO;
                        str3 = strOooO0OO;
                    }
                    roomIndexModel.relatedType = str3;
                }
                o00000O0<RoomIndexModel> o00000o6 = userRoomsActivity.f27366OooOo0O;
                Intrinsics.checkNotNull(o00000o6);
                o00000o6.notifyDataSetChanged();
                userRoomsActivity.f27367OooOo0o = commonParseMultiListModel.index + 1;
                userRoomsActivity.OooOo().f58201OooO0OO.OooOooO(z2, true);
                o00000O0<RoomIndexModel> o00000o7 = userRoomsActivity.f27366OooOo0O;
                Intrinsics.checkNotNull(o00000o7);
                o00000o7.Oooo0(Boolean.valueOf(z2), Boolean.TRUE, Boolean.valueOf(commonParseMultiListModel.data.size() < Integer.parseInt("15")));
            }
        };
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("touserid", str);
        linkedHashMapOooO00o.put("pageindex", strOooO00o);
        linkedHashMapOooO00o.put("num", i + "");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44112Oooo0o0, linkedHashMapOooO00o, oooO0O0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58199OooO00o);
        this.f27365OooOo00 = getIntent().getStringExtra("userId");
        getIntent().getStringExtra("sex");
        this.f27364OooOo0 = (int) getIntent().getLongExtra("joinNum", 0L);
        OooOo00(getIntent().getStringExtra("barName"));
        OooOo().f58201OooO0OO.setOnRefreshListener(new o000000(this, 1));
        o00000O0<RoomIndexModel> o00000o1 = new o00000O0<>(this, oO00OO0O.item_room_related);
        this.f27366OooOo0O = o00000o1;
        Intrinsics.checkNotNull(o00000o1);
        o00000o1.f27704OooOooo = EnterRoomParentPage.Me_profile_room;
        o00000O0<RoomIndexModel> o00000o2 = this.f27366OooOo0O;
        Intrinsics.checkNotNull(o00000o2);
        o00000o2.Oooo000(oO00OOo0.blank_ta_no_rooms);
        o00000O0<RoomIndexModel> o00000o3 = this.f27366OooOo0O;
        Intrinsics.checkNotNull(o00000o3);
        o00000o3.OooOooo(p584o0oOooO0.oOo00OO0.ic_empty_room);
        o00000O0<RoomIndexModel> o00000o4 = this.f27366OooOo0O;
        Intrinsics.checkNotNull(o00000o4);
        o00000o4.Oooo0OO(new oO0O0O0o(this));
        o00000O0<RoomIndexModel> o00000o5 = this.f27366OooOo0O;
        Intrinsics.checkNotNull(o00000o5);
        o00000o5.OooOoO(new oO0O0O00(this, 0), OooOo().f58200OooO0O0);
        OooOo().f58200OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOo().f58200OooO0O0.setAdapter(this.f27366OooOo0O);
        o00000O0<RoomIndexModel> o00000o6 = this.f27366OooOo0O;
        Intrinsics.checkNotNull(o00000o6);
        o00000o6.f10098OooO0o = new o0O0000O(this);
        this.f27367OooOo0o = 1;
        OooOoO0(true);
    }
}
