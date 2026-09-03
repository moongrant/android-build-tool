package com.yalla.yalla.ui.activity.user;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.oo000o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
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
import p039OoooOoo.o0O000Oo;
import p039OoooOoo.o0O000o0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p405o0Oo0OOO.y1;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;
import p506o0o00oOo.v0;
import p506o0o00oOo.w0;
import p507o0o00oo.o0ooOOo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserRoomsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserRoomsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserRoomsActivity.kt\ncom/yalla/yalla/ui/activity/user/UserRoomsActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,185:1\n22#2,2:186\n*S KotlinDebug\n*F\n+ 1 UserRoomsActivity.kt\ncom/yalla/yalla/ui/activity/user/UserRoomsActivity\n*L\n38#1:186,2\n*E\n"})
public final class UserRoomsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f26896OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f26899OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public String f26900OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public o0ooOOo<RoomIndexModel> f26901OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26897OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(y1.class), this, null);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f26902OooOo0o = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public String f26898OooOo = "";

    public static final class OooO00o {
        public static void OooO00o(@NotNull FragmentActivity activity, @NotNull String userID, @Nullable UserInfoApiModel userInfoApiModel) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(userID, "userID");
            if (com.code.android.util.OooOo00.OooO00o(userID) || userInfoApiModel == null) {
                return;
            }
            o0oo0000.OooO00o.OooO0O0("105075");
            Intent intent = new Intent(activity, (Class<?>) UserRoomsActivity.class);
            intent.putExtra("userId", userInfoApiModel.getId());
            intent.putExtra("sex", userInfoApiModel.getSex());
            intent.putExtra("barName", o0000.OooO0OO(o000000.room));
            intent.putExtra("joinNum", userInfoApiModel.getRjoinNum());
            activity.startActivity(intent);
        }
    }

    public final y1 OooOo() {
        return (y1) this.f26897OooOOoo.getValue();
    }

    public final void OooOoO0(final boolean z) {
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        String str = this.f26900OooOo00;
        String strOooO00o = oo000o.OooO00o(this.f26902OooOo0o);
        int i = this.f26899OooOo0;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.user.UserRoomsActivity$loadData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.f26904OooO0o0);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                int i2 = UserRoomsActivity.f26896OooOoO0;
                UserRoomsActivity userRoomsActivity = this.f26904OooO0o0;
                XRefreshLayout xRefreshLayout = userRoomsActivity.OooOo().f45707OooO0OO;
                boolean z2 = z;
                xRefreshLayout.OooOooO(z2, false);
                o0ooOOo<RoomIndexModel> o0ooooo = userRoomsActivity.f26901OooOo0O;
                Intrinsics.checkNotNull(o0ooooo);
                o0ooooo.Oooo0(Boolean.valueOf(z2), Boolean.FALSE, Boolean.TRUE);
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
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) oOOO00.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexModel>>() { // from class: com.yalla.yalla.ui.activity.user.UserRoomsActivity$loadData$1$onFinish$model$1
                }.getType());
                boolean z2 = z;
                UserRoomsActivity userRoomsActivity = this.f26904OooO0o0;
                if (commonParseMultiListModel == null || com.code.android.util.OooOo00.OooO00o(commonParseMultiListModel.data)) {
                    int i2 = UserRoomsActivity.f26896OooOoO0;
                    userRoomsActivity.OooOo().f45707OooO0OO.setLoadComplete(z2);
                    o0ooOOo<RoomIndexModel> o0ooooo = userRoomsActivity.f26901OooOo0O;
                    Intrinsics.checkNotNull(o0ooooo);
                    Boolean boolValueOf = Boolean.valueOf(z2);
                    Boolean bool = Boolean.TRUE;
                    o0ooooo.Oooo0(boolValueOf, bool, bool);
                    return;
                }
                if (z2) {
                    o0ooOOo<RoomIndexModel> o0ooooo2 = userRoomsActivity.f26901OooOo0O;
                    Intrinsics.checkNotNull(o0ooooo2);
                    o0ooooo2.OooOoO0(commonParseMultiListModel.data);
                } else {
                    o0ooOOo<RoomIndexModel> o0ooooo3 = userRoomsActivity.f26901OooOo0O;
                    Intrinsics.checkNotNull(o0ooooo3);
                    o0ooooo3.OooO0O0(commonParseMultiListModel.data);
                }
                o0ooOOo<RoomIndexModel> o0ooooo4 = userRoomsActivity.f26901OooOo0O;
                Intrinsics.checkNotNull(o0ooooo4);
                int size = o0ooooo4.f13189OooOOoo.size();
                for (int i3 = 0; i3 < size; i3++) {
                    o0ooOOo<RoomIndexModel> o0ooooo5 = userRoomsActivity.f26901OooOo0O;
                    Intrinsics.checkNotNull(o0ooooo5);
                    RoomIndexModel roomIndexModel = o0ooooo5.f13189OooOOoo.get(i3);
                    String positionid = roomIndexModel.positionid;
                    Intrinsics.checkNotNullExpressionValue(positionid, "positionid");
                    String str2 = "";
                    if (i3 == 0) {
                        userRoomsActivity.f26898OooOo = "";
                    }
                    if (iHashCode == 53) {
                        strOooO0OO = !positionid.equals(FeedbackType.Others) ? "" : o0000.OooO0OO(o000000.room_type_follow);
                    } else if (iHashCode != 57) {
                        switch (positionid) {
                            case "0":
                                String str3 = userRoomsActivity.f26900OooOo00;
                                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                                strOooO0OO = o0000.OooO0OO(oOOO0O0o.OooO00o(str3) ? o000000.my_room : o000000.room);
                                break;
                            case "1":
                                String str4 = userRoomsActivity.f26900OooOo00;
                                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                                strOooO0OO = o0000.OooO0OO(oOOO0O0o.OooO00o(str4) ? o000000.my_room : o000000.room);
                                break;
                            case "2":
                                strOooO0OO = o0000.OooO0OO(o000000.room_type_add);
                                break;
                            case "3":
                                strOooO0OO = o0000.OooO0OO(o000000.room_type_add);
                                break;
                            default:
                                strOooO0OO = "";
                                break;
                        }
                    } else {
                        strOooO0OO = !positionid.equals("9") ? "" : o0000.OooO0OO(o000000.room_type_follow);
                    }
                    if (!Intrinsics.areEqual(userRoomsActivity.f26898OooOo, strOooO0OO)) {
                        userRoomsActivity.f26898OooOo = strOooO0OO;
                        str2 = strOooO0OO;
                    }
                    roomIndexModel.relatedType = str2;
                }
                o0ooOOo<RoomIndexModel> o0ooooo6 = userRoomsActivity.f26901OooOo0O;
                Intrinsics.checkNotNull(o0ooooo6);
                o0ooooo6.notifyDataSetChanged();
                userRoomsActivity.f26902OooOo0o = commonParseMultiListModel.index + 1;
                userRoomsActivity.OooOo().f45707OooO0OO.OooOooO(z2, true);
                o0ooOOo<RoomIndexModel> o0ooooo7 = userRoomsActivity.f26901OooOo0O;
                Intrinsics.checkNotNull(o0ooooo7);
                o0ooooo7.Oooo0(Boolean.valueOf(z2), Boolean.TRUE, Boolean.valueOf(commonParseMultiListModel.data.size() < Integer.parseInt("15")));
            }
        };
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("touserid", str);
        linkedHashMapOooO00o.put("pageindex", strOooO00o);
        linkedHashMapOooO00o.put("num", i + "");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43371Oooo0o0, linkedHashMapOooO00o, oooO0O0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f45705OooO00o);
        this.f26900OooOo00 = getIntent().getStringExtra("userId");
        getIntent().getStringExtra("sex");
        this.f26899OooOo0 = (int) getIntent().getLongExtra("joinNum", 0L);
        OooOo00(getIntent().getStringExtra("barName"));
        OooOo().f45707OooO0OO.setOnRefreshListener(new v0(this, 0));
        o0ooOOo<RoomIndexModel> o0ooooo = new o0ooOOo<>(this, oo0o0Oo.item_room_related);
        this.f26901OooOo0O = o0ooooo;
        Intrinsics.checkNotNull(o0ooooo);
        o0ooooo.f27242OooOooo = EnterRoomParentPage.Me_profile_room;
        o0ooOOo<RoomIndexModel> o0ooooo2 = this.f26901OooOo0O;
        Intrinsics.checkNotNull(o0ooooo2);
        o0ooooo2.Oooo000(o000000.blank_ta_no_rooms);
        o0ooOOo<RoomIndexModel> o0ooooo3 = this.f26901OooOo0O;
        Intrinsics.checkNotNull(o0ooooo3);
        o0ooooo3.OooOooo(o0Oo0oo.ic_empty_room);
        o0ooOOo<RoomIndexModel> o0ooooo4 = this.f26901OooOo0O;
        Intrinsics.checkNotNull(o0ooooo4);
        o0ooooo4.Oooo0OO(new w0(this));
        o0ooOOo<RoomIndexModel> o0ooooo5 = this.f26901OooOo0O;
        Intrinsics.checkNotNull(o0ooooo5);
        o0ooooo5.OooOoO(new o0O000Oo(this), OooOo().f45706OooO0O0);
        OooOo().f45706OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOo().f45706OooO0O0.setAdapter(this.f26901OooOo0O);
        o0ooOOo<RoomIndexModel> o0ooooo6 = this.f26901OooOo0O;
        Intrinsics.checkNotNull(o0ooooo6);
        o0ooooo6.f13176OooO0o = new o0O000o0(this);
        this.f26902OooOo0o = 1;
        OooOoO0(true);
    }
}
