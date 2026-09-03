package p022Oooo00O;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000OO0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f499OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f500OooO0o0;

    public /* synthetic */ o0000OO0(Object obj, int i) {
        this.f499OooO0Oo = i;
        this.f500OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f499OooO0Oo;
        Object obj2 = this.f500OooO0o0;
        switch (i) {
            case 0:
                ((o000.OooO00o) obj2).setValue(obj);
                break;
            default:
                RoomSettingActivity this$0 = (RoomSettingActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i2 = RoomSettingActivity.f26193Oooo00O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    String strOooO0OO = o0000.OooO0OO(o000OOo.Success);
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                    OooO0O0.f24541OoooOOO.OooO00o().f24567OooOoO.getValue();
                    this$0.f26207Oooo000 = false;
                }
                break;
        }
    }
}
