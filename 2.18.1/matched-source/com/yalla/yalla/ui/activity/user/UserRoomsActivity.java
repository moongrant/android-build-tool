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
import o0O0O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o0000O;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p535o0o0OOoO.oO0OO00o;
import p566o0oOo00O.oO0000o0;
import p649o0ooOOoo.th;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserRoomsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserRoomsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23561Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public String f23563Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f23564Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public o00OO0.OooOO0O<RoomIndexModel> f23565OooooO0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23562OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(th.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f23566OooooOO = 1;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public String f23567OooooOo = "";

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

    public static final class OooO0O0 extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f23569OooO0O0;

        public static final class OooO00o extends o00000O0<CommonParseMultiListModel<RoomIndexModel>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(UserRoomsActivity.this);
            this.f23569OooO0O0 = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            UserRoomsActivity userRoomsActivity = UserRoomsActivity.this;
            OooO00o oooO00o = UserRoomsActivity.f23561Oooooo0;
            userRoomsActivity.OooOoo().f50671OooO0OO.Oooo0OO(this.f23569OooO0O0, false);
            o00OO0.OooOO0O<RoomIndexModel> oooOO0O = UserRoomsActivity.this.f23565OooooO0;
            Intrinsics.checkNotNull(oooOO0O);
            oooOO0O.setLoadComplete(Boolean.valueOf(this.f23569OooO0O0), Boolean.FALSE, Boolean.TRUE);
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
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            String strOooO0OO;
            Intrinsics.checkNotNullParameter(response, "response");
            CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
            if (commonParseMultiListModel == null || com.yalla.support.common.util.OooO0OO.OooO00o(commonParseMultiListModel.data)) {
                UserRoomsActivity userRoomsActivity = UserRoomsActivity.this;
                OooO00o oooO00o = UserRoomsActivity.f23561Oooooo0;
                userRoomsActivity.OooOoo().f50671OooO0OO.setLoadComplete(this.f23569OooO0O0);
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O = UserRoomsActivity.this.f23565OooooO0;
                Intrinsics.checkNotNull(oooOO0O);
                Boolean boolValueOf = Boolean.valueOf(this.f23569OooO0O0);
                Boolean bool = Boolean.TRUE;
                oooOO0O.setLoadComplete(boolValueOf, bool, bool);
                return;
            }
            if (this.f23569OooO0O0) {
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O2 = UserRoomsActivity.this.f23565OooooO0;
                Intrinsics.checkNotNull(oooOO0O2);
                oooOO0O2.setNewData(commonParseMultiListModel.data);
            } else {
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O3 = UserRoomsActivity.this.f23565OooooO0;
                Intrinsics.checkNotNull(oooOO0O3);
                oooOO0O3.addData(commonParseMultiListModel.data);
            }
            o00OO0.OooOO0O<RoomIndexModel> oooOO0O4 = UserRoomsActivity.this.f23565OooooO0;
            Intrinsics.checkNotNull(oooOO0O4);
            int size = oooOO0O4.getData().size();
            for (int i = 0; i < size; i++) {
                o00OO0.OooOO0O<RoomIndexModel> oooOO0O5 = UserRoomsActivity.this.f23565OooooO0;
                Intrinsics.checkNotNull(oooOO0O5);
                RoomIndexModel roomIndexModel = oooOO0O5.getData().get(i);
                UserRoomsActivity userRoomsActivity2 = UserRoomsActivity.this;
                String str = roomIndexModel.positionid;
                Intrinsics.checkNotNullExpressionValue(str, "roomIndexModel.positionid");
                Objects.requireNonNull(userRoomsActivity2);
                String str2 = "";
                if (i == 0) {
                    userRoomsActivity2.f23567OooooOo = "";
                }
                if (iHashCode == 53) {
                    strOooO0OO = !str.equals(FeedbackType.Others) ? "" : o000O0O0.OooO0OO(R.string.room_type_follow);
                } else if (iHashCode != 57) {
                    int i2 = R.string.my_room;
                    switch (str) {
                        case "0":
                            if (!o0000O.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, userRoomsActivity2.f23563Ooooo00)) {
                                i2 = R.string.room;
                            }
                            strOooO0OO = o000O0O0.OooO0OO(i2);
                            break;
                        case "1":
                            if (!o0000O.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, userRoomsActivity2.f23563Ooooo00)) {
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
                if (!Intrinsics.areEqual(userRoomsActivity2.f23567OooooOo, strOooO0OO)) {
                    userRoomsActivity2.f23567OooooOo = strOooO0OO;
                    str2 = strOooO0OO;
                }
                roomIndexModel.relatedType = str2;
            }
            o00OO0.OooOO0O<RoomIndexModel> oooOO0O6 = UserRoomsActivity.this.f23565OooooO0;
            Intrinsics.checkNotNull(oooOO0O6);
            oooOO0O6.notifyDataSetChanged();
            UserRoomsActivity userRoomsActivity3 = UserRoomsActivity.this;
            userRoomsActivity3.f23566OooooOO = commonParseMultiListModel.index + 1;
            userRoomsActivity3.OooOoo().f50671OooO0OO.Oooo0OO(this.f23569OooO0O0, true);
            o00OO0.OooOO0O<RoomIndexModel> oooOO0O7 = UserRoomsActivity.this.f23565OooooO0;
            Intrinsics.checkNotNull(oooOO0O7);
            oooOO0O7.setLoadComplete(Boolean.valueOf(this.f23569OooO0O0), Boolean.TRUE, Boolean.valueOf(commonParseMultiListModel.data.size() < Integer.parseInt("15")));
        }
    }

    public final th OooOoo() {
        return (th) this.f23562OoooOoo.getValue();
    }

    public final void OooOooO(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        String str = this.f23563Ooooo00;
        String strOooO00o = o0ooOOo.OooO00o(new StringBuilder(), this.f23566OooooOO, "");
        int i = this.f23564Ooooo0o;
        OooO0O0 oooO0O0 = new OooO0O0(z);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("touserid", str);
        mapOooO0O0.put("pageindex", strOooO00o);
        mapOooO0O0.put("num", i + "");
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32256Oooo0o0, mapOooO0O0, oooO0O0);
    }

    public final void OooOooo() {
        this.f23566OooooOO = 1;
        OooOooO(true);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50669OooO00o);
        this.f23563Ooooo00 = getIntent().getStringExtra("userId");
        getIntent().getStringExtra("sex");
        this.f23564Ooooo0o = (int) getIntent().getLongExtra("joinNum", 0L);
        OooOoO0(getIntent().getStringExtra("barName"));
        OooOoo().f50671OooO0OO.setOnRefreshListener(new p439o0OoOOo0.o00000O0(this, 2));
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O = new o00OO0.OooOO0O<>(this);
        this.f23565OooooO0 = oooOO0O;
        Intrinsics.checkNotNull(oooOO0O);
        oooOO0O.f11362OooO0Oo = EnterRoomParentPage.Me_profile_room;
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O2 = this.f23565OooooO0;
        Intrinsics.checkNotNull(oooOO0O2);
        oooOO0O2.setEmptyText(R.string.blank_ta_no_rooms);
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O3 = this.f23565OooooO0;
        Intrinsics.checkNotNull(oooOO0O3);
        oooOO0O3.setEmptyImageRes(R.drawable.ic_empty_room);
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O4 = this.f23565OooooO0;
        Intrinsics.checkNotNull(oooOO0O4);
        oooOO0O4.setLoadErrorClickListener(new oO0000o0(this));
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O5 = this.f23565OooooO0;
        Intrinsics.checkNotNull(oooOO0O5);
        oooOO0O5.setOnLoadMoreListener(new oO0OO00o(this, 2), OooOoo().f50670OooO0O0);
        OooOoo().f50670OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoo().f50670OooO0O0.setAdapter(this.f23565OooooO0);
        o00OO0.OooOO0O<RoomIndexModel> oooOO0O6 = this.f23565OooooO0;
        Intrinsics.checkNotNull(oooOO0O6);
        oooOO0O6.setOnItemClickListener(new o00OOO00.OooO0O0(this, 3));
        OooOooo();
    }
}
