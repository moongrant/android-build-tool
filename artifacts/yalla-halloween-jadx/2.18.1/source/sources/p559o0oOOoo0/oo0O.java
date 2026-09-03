package p559o0oOOoo0;

import android.text.TextUtils;
import androidx.lifecycle.Observer;
import com.app.base.dialog.baseDialog.PasswordSettingDialog;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.view.pop.passwordSettingPop.PasswordSettingModel;
import com.app.base.view.pop.roomExitPop.RoomExitTag;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import java.util.Map;
import java.util.Objects;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p255o00ooO0o.oo0oOO0;
import p506o0o00oO0.o0O00o0;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;
import p544o0o0OoOO.p3;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public PasswordSettingDialog f44848OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public MixedRoomActivity f44849OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public RoomConfiguration f44850OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public p180o00o00.OooO0OO f44851OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0O00o0 f44852OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public PasswordSettingModel f44853OooO0o0;

    public class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            oo0O.this.OooO00o();
        }
    }

    public class OooO0O0 implements o00Oo00.OooO0O0<PasswordSettingModel, AbsListenerTag> {
        public OooO0O0() {
        }

        @Override // o00Oo00.OooO0O0
        public final void OooO0O0(PasswordSettingModel passwordSettingModel, int i, AbsListenerTag absListenerTag) {
            PasswordSettingModel passwordSettingModel2 = passwordSettingModel;
            if (absListenerTag != AbsListenerTag.Ok || passwordSettingModel2 == null || TextUtils.isEmpty(passwordSettingModel2.getBarId())) {
                return;
            }
            if ("".equals(passwordSettingModel2.getPassword())) {
                o00O00.OooO0O0("解锁");
            } else {
                o00O00.OooO0O0("加锁");
            }
            oo0O oo0o = oo0O.this;
            Objects.requireNonNull(oo0o);
            o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
            oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
            String barId = passwordSettingModel2.getBarId();
            String password = passwordSettingModel2.getPassword();
            o00OOO00 o00ooo01 = new o00OOO00(oo0o, passwordSettingModel2);
            Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
            mapOooO0O0.put("barid", barId);
            mapOooO0O0.put("roompassword", password);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0Oo(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32260OoooO0, mapOooO0O0, o00ooo01);
        }
    }

    public static /* synthetic */ class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f44856OooO00o;

        static {
            int[] iArr = new int[RoomExitTag.values().length];
            f44856OooO00o = iArr;
            try {
                iArr[RoomExitTag.exit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44856OooO00o[RoomExitTag.keep.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public oo0O(MixedRoomActivity mixedRoomActivity) {
        this.f44849OooO0O0 = mixedRoomActivity;
        LiveEventBus.get("USER_CHANGE_COUNTRY").observe(mixedRoomActivity, new OooO00o());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Model, com.app.base.view.pop.passwordSettingPop.PasswordSettingModel] */
    public final void OooO00o() {
        RoomConfiguration roomConfiguration = this.f44850OooO0OO;
        if (roomConfiguration == null) {
            return;
        }
        if (this.f44853OooO0o0 == null) {
            this.f44853OooO0o0 = new PasswordSettingModel(roomConfiguration.getBarid());
        }
        if (this.f44848OooO00o == null) {
            p139o00OOOo0.o0ooOOo o0oooooOooO00o = p139o00OOOo0.o0ooOOo.OooO00o();
            MixedRoomActivity mixedRoomActivity = this.f44849OooO0O0;
            Objects.requireNonNull(o0oooooOooO00o);
            PasswordSettingDialog passwordSettingDialog = new PasswordSettingDialog(mixedRoomActivity);
            passwordSettingDialog.f32154Oooo0oo = new OooO0O0();
            this.f44848OooO00o = passwordSettingDialog;
        }
        PasswordSettingDialog passwordSettingDialog2 = this.f44848OooO00o;
        passwordSettingDialog2.f32153Oooo0oO = this.f44853OooO0o0;
        passwordSettingDialog2.OooO0O0();
        if (this.f44850OooO0OO.getIsencrypt() == 4) {
            this.f44848OooO00o.OooOOo(PasswordSettingDialog.PasswordDialogType.PasswordChange);
        } else {
            p487o0o000oO.o0ooOOo o0ooooo2 = p487o0o000oO.o0ooOOo.f40960OooO00o;
            if (p487o0o000oO.o0ooOOo.f40962OooO0OO.contains(o00OO00O.f43313OooooOo.OooO00o().f43351Oooo0O0.getValue())) {
                oo0oOO0 oo0ooo0 = new oo0oOO0(this.f44849OooO0O0);
                oo0ooo0.OooOo0(R.string.psd_room_limited);
                oo0ooo0.OooOOOo(R.string.Change_Country);
                oo0ooo0.OooOo0o(new p3(this, 1));
                oo0ooo0.OooOoO();
                oo0ooo0.OooOOO0();
                return;
            }
            this.f44848OooO00o.OooOOo(PasswordSettingDialog.PasswordDialogType.PasswordAdd);
        }
        this.f44848OooO00o.show();
    }
}
