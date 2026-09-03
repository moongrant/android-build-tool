package p502o0o00o0O;

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
import p205o00o0o0o.o000O;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p386o0OOooO.o0Oo0oo;
import p400o0Oo0O0.OooOOO0;
import p426o0OoO0o0.OooOOOO;
import p562o0oOo000.o000000;
import p567o0oOo0Oo.o0O000Oo;
import p598o0oo00Oo.o0000O00;
import p650o0ooo.o00O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public PasswordSettingDialog f50169OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MixedRoomActivity f50170OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0O000Oo f50171OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public PasswordSettingModel f50172OooO0Oo;

    public class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            o.this.OooO00o();
        }
    }

    public class OooO0O0 implements OooOOO0<PasswordSettingModel, AbsListenerTag> {
        public OooO0O0() {
        }

        @Override // p400o0Oo0O0.OooOOO0
        public final void OooO00o(int i, Object obj, Object obj2) {
            PasswordSettingModel passwordSettingModel = (PasswordSettingModel) obj;
            if (((AbsListenerTag) obj2) != AbsListenerTag.Ok || passwordSettingModel == null || TextUtils.isEmpty(passwordSettingModel.getBarId())) {
                return;
            }
            if ("".equals(passwordSettingModel.getPassword())) {
                o0000O00.OooO0O0("解锁");
            } else {
                o0000O00.OooO0O0("加锁");
            }
            o oVar = o.this;
            oVar.getClass();
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            String barId = passwordSettingModel.getBarId();
            String password = passwordSettingModel.getPassword();
            oO00000o oo00000o = new oO00000o(oVar, passwordSettingModel);
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("barid", barId);
            linkedHashMapOooO00o.put("roompassword", password);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(Oooo0.f43359OooOoo, Oooo0.f43375OoooO0, linkedHashMapOooO00o, oo00000o);
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f50175OooO00o;

        static {
            int[] iArr = new int[RoomExitTag.values().length];
            f50175OooO00o = iArr;
            try {
                iArr[RoomExitTag.exit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50175OooO00o[RoomExitTag.keep.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(MixedRoomActivity mixedRoomActivity) {
        this.f50170OooO0O0 = mixedRoomActivity;
        LiveEventBus.get("USER_CHANGE_COUNTRY").observe(mixedRoomActivity, new OooO00o());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Model, com.yalla.yalla.ui.view.pop.passwordSettingPop.PasswordSettingModel] */
    public final void OooO00o() {
        if (this.f50172OooO0Oo == null) {
            this.f50172OooO0Oo = new PasswordSettingModel(String.valueOf(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0()));
        }
        PasswordSettingDialog passwordSettingDialog = this.f50169OooO00o;
        MixedRoomActivity mixedRoomActivity = this.f50170OooO0O0;
        if (passwordSettingDialog == null) {
            o00O0OO0.OooO00o().getClass();
            PasswordSettingDialog passwordSettingDialog2 = new PasswordSettingDialog(mixedRoomActivity);
            passwordSettingDialog2.f43649OooO0o = new OooO0O0();
            this.f50169OooO00o = passwordSettingDialog2;
        }
        PasswordSettingDialog passwordSettingDialog3 = this.f50169OooO00o;
        passwordSettingDialog3.f43650OooO0o0 = this.f50172OooO0Oo;
        passwordSettingDialog3.OooO0O0();
        if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.f48458OooO.getValue()).booleanValue()) {
            this.f50169OooO00o.OooOOOO(PasswordSettingDialog.PasswordDialogType.PasswordChange);
        } else {
            if (o0Oo0oo.f43505OooO00o.contains(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24562OooOoo.getValue())) {
                o000O o000o = new o000O(mixedRoomActivity);
                o000o.OooOOoo(o000000.psd_room_limited);
                o000o.OooOOOO(o000000.Change_Country);
                o000o.OooOo0(new Function0() { // from class: o0o00o0O.ooo0Oo0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        o oVar = this.f50179OooO0Oo;
                        oVar.getClass();
                        int i = UserCountrySelectActivity.f26735OooOoOO;
                        UserCountrySelectActivity.OooO00o.OooO00o(oVar.f50170OooO0O0, true, true);
                        return null;
                    }
                });
                o000o.OooOo(true);
                o000o.OooOO0o();
                return;
            }
            this.f50169OooO00o.OooOOOO(PasswordSettingDialog.PasswordDialogType.PasswordAdd);
        }
        this.f50169OooO00o.show();
    }
}
