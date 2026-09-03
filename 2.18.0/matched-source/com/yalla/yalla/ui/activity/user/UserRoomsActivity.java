package com.yalla.yalla.ui.activity.user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.UserInfoApiModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooO.o0000O;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p154o00Oo0oO.o0ooOOo;
import p154o00Oo0oO.oo0o0Oo;
import p161o00OoOO0.o00OO0OO;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p390o0OOooO.o00000O0;
import p393o0OOooOo.o0O00000;
import p537o0o0OOoO.oOo00ooO;
import p568o0oOo00O.oO0000Oo;
import p651o0ooOOoo.sh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserRoomsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserRoomsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23580Ooooooo = new OooO00o();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public String f23582OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f23583OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public o00OO0.OooOO0O<RoomIndexModel> f23585Oooooo0;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f23581OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(sh.class), this, null);

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public int f23584Oooooo = 1;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public String f23586OoooooO = "";

    public static final class OooO00o {
        public final void OooO00o(@NotNull Activity activity, @NotNull String userID, @Nullable UserInfoApiModel userInfoApiModel) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(userID, "userID");
            if (com.yalla.support.common.util.OooO0OO.OooO00o(userID) || userInfoApiModel == null) {
                return;
            }
            o0O00000.OooO0OO("Me_profile_room");
            Intent intent = new Intent(activity, (Class<?>) UserRoomsActivity.class);
            intent.putExtra("userId", userInfoApiModel.getId());
            intent.putExtra("sex", userInfoApiModel.getSex());
            intent.putExtra("barName", o000O0O0.OooO0OO(R.string.room));
            intent.putExtra("joinNum", userInfoApiModel.getRjoinNum());
            activity.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends o00OO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f23588OooO0O0;

        public static final class OooO00o extends o00000O0<CommonParseMultiListModel<RoomIndexModel>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(UserRoomsActivity.this);
            this.f23588OooO0O0 = z;
        }

        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            UserRoomsActivity userRoomsActivity = UserRoomsActivity.this;
            OooO00o oooO00o = UserRoomsActivity.f23580Ooooooo;
            userRoomsActivity.OooOoo().f50608OooO0OO.Oooo0OO(this.f23588OooO0O0, false);
            o00OO0.OooOO0O<RoomIndexModel> oooOO0O = UserRoomsActivity.this.f23585Oooooo0;
            Intrinsics.checkNotNull(oooOO0O);
            oooOO0O.setLoadComplete(Boolean.valueOf(this.f23588OooO0O0), Boolean.FALSE, Boolean.TRUE);
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 int, still in use, count: 2, list:
          (r7v0 int) from 0x007c: IF  (r7v0 int) == (53 int)  -> B:51:0x00f1 A[HIDDEN]
          (r7v0 int) from 0x0080: IF  (r7v0 int) != (57 int)  -> B:20:0x0082 A[HIDDEN]
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
        @Override // o00OoOO0.o00OO0OO.OooO0O0, o00OoOO0.o00OO0OO.OooO00o
        public final void onFinish(@NotNull String response) {
            String strOooO0OO;
            Intrinsics.checkNotNullParameter(response, "response");
            CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
            if (commonParseMultiListModel == null || com.yalla.support.common.util.OooO0OO.OooO00o(commonParseMultiListModel.data)) {
                UserRoomsActivity userRoomsActivity = UserRoomsActivity.this;
                OooO00o oooO00o = UserRoomsActivity.f23580Ooooooo;
                userRoomsActivity.OooOoo().f50608OooO0OO.setLoadComplete(this.f23588OooO0O0);
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O = UserRoomsActivity.this.f23585Oooooo0;
                Intrinsics.checkNotNull(oooOO0O);
                Boolean boolValueOf = Boolean.valueOf(this.f23588OooO0O0);
                Boolean bool = Boolean.TRUE;
                oooOO0O.setLoadComplete(boolValueOf, bool, bool);
                return;
            }
            if (this.f23588OooO0O0) {
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O2 = UserRoomsActivity.this.f23585Oooooo0;
                Intrinsics.checkNotNull(oooOO0O2);
                oooOO0O2.setNewData(commonParseMultiListModel.data);
            } else {
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O3 = UserRoomsActivity.this.f23585Oooooo0;
                Intrinsics.checkNotNull(oooOO0O3);
                oooOO0O3.addData(commonParseMultiListModel.data);
            }
            o00OO0.OooOO0O<RoomIndexModel> oooOO0O4 = UserRoomsActivity.this.f23585Oooooo0;
            Intrinsics.checkNotNull(oooOO0O4);
            int size = oooOO0O4.getData().size();
            for (int i = 0; i < size; i++) {
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O5 = UserRoomsActivity.this.f23585Oooooo0;
                Intrinsics.checkNotNull(oooOO0O5);
                RoomIndexModel roomIndexModel = oooOO0O5.getData().get(i);
                UserRoomsActivity userRoomsActivity2 = UserRoomsActivity.this;
                String str = roomIndexModel.positionid;
                Intrinsics.checkNotNullExpressionValue(str, "roomIndexModel.positionid");
                Objects.requireNonNull(userRoomsActivity2);
                String str2 = "";
                if (i == 0) {
                    userRoomsActivity2.f23586OoooooO = "";
                }
                if (iHashCode == 53) {
                    strOooO0OO = !str.equals(FeedbackType.Others) ? "" : o000O0O0.OooO0OO(R.string.room_type_follow);
                } else if (iHashCode != 57) {
                    int i2 = R.string.my_room;
                    switch (str) {
                        case "0":
                            if (!o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, userRoomsActivity2.f23582OooooOO)) {
                                i2 = R.string.room;
                            }
                            strOooO0OO = o000O0O0.OooO0OO(i2);
                            break;
                        case "1":
                            if (!o0000O.OooO00o(p500o0o00Oo0.OooOOO.f41235OooO00o, userRoomsActivity2.f23582OooooOO)) {
                                i2 = R.string.room;
                            }
                            strOooO0OO = o000O0O0.OooO0OO(i2);
                            break;
                        case "2":
                            strOooO0OO = o000O0O0.OooO0OO(R.string.room_type_add);
                            break;
                        case "3":
                            strOooO0OO = o000O0O0.OooO0OO(R.string.room_type_add);
                            break;
                        default:
                            strOooO0OO = "";
                            break;
                    }
                } else {
                    strOooO0OO = !str.equals("9") ? "" : o000O0O0.OooO0OO(R.string.room_type_follow);
                }
                if (!Intrinsics.areEqual(userRoomsActivity2.f23586OoooooO, strOooO0OO)) {
                    userRoomsActivity2.f23586OoooooO = strOooO0OO;
                    str2 = strOooO0OO;
                }
                roomIndexModel.relatedType = str2;
            }
            o00OO0.OooOO0O<RoomIndexModel> oooOO0O6 = UserRoomsActivity.this.f23585Oooooo0;
            Intrinsics.checkNotNull(oooOO0O6);
            oooOO0O6.notifyDataSetChanged();
            UserRoomsActivity userRoomsActivity3 = UserRoomsActivity.this;
            userRoomsActivity3.f23584Oooooo = commonParseMultiListModel.index + 1;
            userRoomsActivity3.OooOoo().f50608OooO0OO.Oooo0OO(this.f23588OooO0O0, true);
            o00OO0.OooOO0O<RoomIndexModel> oooOO0O7 = UserRoomsActivity.this.f23585Oooooo0;
            Intrinsics.checkNotNull(oooOO0O7);
            oooOO0O7.setLoadComplete(Boolean.valueOf(this.f23588OooO0O0), Boolean.TRUE, Boolean.valueOf(commonParseMultiListModel.data.size() < Integer.parseInt("15")));
        }
    }

    public final sh OooOoo() {
        return (sh) this.f23581OooooO0.getValue();
    }

    public final void OooOooO(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32231OooO0Oo;
        String str = this.f23582OooooOO;
        String strOooO0O0 = OooO0o.OooO0OO.OooO0O0(new StringBuilder(), this.f23584Oooooo, "");
        int i = this.f23583OooooOo;
        OooO0O0 oooO0O0 = new OooO0O0(z);
        Map<String, String> mapOooO0O0 = o00OO0OO.OooO0O0();
        mapOooO0O0.put("touserid", str);
        mapOooO0O0.put("pageindex", strOooO0O0);
        mapOooO0O0.put("num", i + "");
        o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
        o00OO0OO.OooO0OO(null, o0ooOOo.f32265OooOoo, o0ooOOo.f32277Oooo0o0, mapOooO0O0, oooO0O0);
    }

    public final void OooOooo() {
        this.f23584Oooooo = 1;
        OooOooO(true);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50606OooO00o);
        this.f23582OooooOO = getIntent().getStringExtra("userId");
        getIntent().getStringExtra("sex");
        this.f23583OooooOo = (int) getIntent().getLongExtra("joinNum", 0L);
        OooOoO0(getIntent().getStringExtra("barName"));
        OooOoo().f50608OooO0OO.setOnRefreshListener(new p442o0OoOOo0.o00000O0(this, 2));
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O = new o00OO0.OooOO0O<>(this);
        this.f23585Oooooo0 = oooOO0O;
        Intrinsics.checkNotNull(oooOO0O);
        oooOO0O.f11378OooO0Oo = EnterRoomParentPage.Me_profile_room;
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O2 = this.f23585Oooooo0;
        Intrinsics.checkNotNull(oooOO0O2);
        oooOO0O2.setEmptyText(R.string.blank_ta_no_rooms);
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O3 = this.f23585Oooooo0;
        Intrinsics.checkNotNull(oooOO0O3);
        oooOO0O3.setEmptyImageRes(R.drawable.ic_empty_room);
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O4 = this.f23585Oooooo0;
        Intrinsics.checkNotNull(oooOO0O4);
        oooOO0O4.setLoadErrorClickListener(new oO0000Oo(this));
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O5 = this.f23585Oooooo0;
        Intrinsics.checkNotNull(oooOO0O5);
        oooOO0O5.setOnLoadMoreListener(new oOo00ooO(this, 2), OooOoo().f50607OooO0O0);
        OooOoo().f50607OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoo().f50607OooO0O0.setAdapter(this.f23585Oooooo0);
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O6 = this.f23585Oooooo0;
        Intrinsics.checkNotNull(oooOO0O6);
        oooOO0O6.setOnItemClickListener(new o00OOO00.OooO0O0(this, 3));
        OooOooo();
    }
}
