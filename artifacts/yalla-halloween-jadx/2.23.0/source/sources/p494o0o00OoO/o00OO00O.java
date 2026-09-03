package p494o0o00OoO;

import android.text.TextUtils;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import com.yalla.yalla.ui.dialog.PasswordSettingDialog;
import com.yalla.yalla.ui.view.pop.passwordSettingPop.PasswordSettingModel;
import com.yalla.yalla.ui.view.pop.roomExitPop.RoomExitTag;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p382o0OOoo0o.o00O0O;
import p519o0o0O0oO.o0O00O0o;
import p561o0oOo00O.oo000o;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;
import p629o0ooO0O0.o0000Ooo;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public PasswordSettingDialog f48752OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MixedRoomActivity f48753OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oo000o f48754OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PasswordSettingModel f48755OooO0Oo;

    public class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            o00OO00O.this.OooO00o();
        }
    }

    public class OooO0O0 implements o0000Ooo<PasswordSettingModel, AbsListenerTag> {
        public OooO0O0() {
        }

        @Override // p629o0ooO0O0.o0000Ooo
        public final void OooO00o(int i, Object obj, Object obj2) {
            PasswordSettingModel passwordSettingModel = (PasswordSettingModel) obj;
            if (((AbsListenerTag) obj2) != AbsListenerTag.Ok || passwordSettingModel == null || TextUtils.isEmpty(passwordSettingModel.getBarId())) {
                return;
            }
            if ("".equals(passwordSettingModel.getPassword())) {
                OooOOO0.OooO0O0("解锁");
            } else {
                OooOOO0.OooO0O0("加锁");
            }
            o00OO00O o00oo00o = o00OO00O.this;
            o00oo00o.getClass();
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            String barId = passwordSettingModel.getBarId();
            String password = passwordSettingModel.getPassword();
            o00OO0OO o00oo0oo = new o00OO0OO(o00oo00o, passwordSettingModel);
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("barid", barId);
            linkedHashMapOooO00o.put("roompassword", password);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(o0000O.f44100OooOoo, o0000O.f44116OoooO0, linkedHashMapOooO00o, o00oo0oo);
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f48758OooO00o;

        static {
            int[] iArr = new int[RoomExitTag.values().length];
            f48758OooO00o = iArr;
            try {
                iArr[RoomExitTag.exit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48758OooO00o[RoomExitTag.keep.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o00OO00O(MixedRoomActivity mixedRoomActivity) {
        this.f48753OooO0O0 = mixedRoomActivity;
        LiveEventBus.get("USER_CHANGE_COUNTRY").observe(mixedRoomActivity, new OooO00o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Model, com.yalla.yalla.ui.view.pop.passwordSettingPop.PasswordSettingModel] */
    public final void OooO00o() {
        if (this.f48755OooO0Oo == null) {
            this.f48755OooO0Oo = new PasswordSettingModel(String.valueOf(com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.OooO0o0()));
        }
        PasswordSettingDialog passwordSettingDialog = this.f48752OooO00o;
        MixedRoomActivity mixedRoomActivity = this.f48753OooO0O0;
        if (passwordSettingDialog == null) {
            o0O00O0o.OooO00o().getClass();
            PasswordSettingDialog passwordSettingDialog2 = new PasswordSettingDialog(mixedRoomActivity);
            passwordSettingDialog2.f44397OooO0o = new OooO0O0();
            this.f48752OooO00o = passwordSettingDialog2;
        }
        PasswordSettingDialog passwordSettingDialog3 = this.f48752OooO00o;
        passwordSettingDialog3.f44398OooO0o0 = this.f48755OooO0Oo;
        passwordSettingDialog3.OooO0O0();
        if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47485OooO.getValue()).booleanValue()) {
            this.f48752OooO00o.OooOOOO(PasswordSettingDialog.PasswordDialogType.PasswordChange);
        } else {
            if (o00O0O.f44281OooO00o.contains(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25024OooOoo.getValue())) {
                o0OO00O o0oo00o2 = new o0OO00O(mixedRoomActivity);
                o0oo00o2.OooOOoo(oO00OOo0.psd_room_limited);
                o0oo00o2.OooOOOO(oO00OOo0.Change_Country);
                o0oo00o2.OooOo0(new Function0() { // from class: o0o00OoO.o00OO000
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        o00OO00O o00oo00o = this.f48751OooO0Oo;
                        o00oo00o.getClass();
                        int i = UserCountrySelectActivity.f27200OooOoOO;
                        UserCountrySelectActivity.OooO00o.OooO00o(o00oo00o.f48753OooO0O0, true, true);
                        return null;
                    }
                });
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOO0o();
                return;
            }
            this.f48752OooO00o.OooOOOO(PasswordSettingDialog.PasswordDialogType.PasswordAdd);
        }
        this.f48752OooO00o.show();
    }
}
