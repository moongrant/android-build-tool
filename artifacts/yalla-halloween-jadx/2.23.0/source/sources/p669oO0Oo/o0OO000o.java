package p669oO0Oo;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.service.room.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p433o0OoOOo.o00OO;
import p433o0OoOOo.o00OO0OO;
import p433o0OoOOo.o00OOO00;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f60695OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f60695OooO0Oo = mixedRoomActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("102225");
        OooO00o.f24991OooOo0.f47432OooO0O0.setValue(Boolean.FALSE);
        MixedRoomActivity mixedRoomActivity = this.f60695OooO0Oo;
        if (mixedRoomActivity != null) {
            o00OOO00 o00ooo01 = new o00OOO00(mixedRoomActivity);
            try {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                T value = ((MutableLiveData) o000000O.f46694OooOo00.getValue()).getValue();
                Intrinsics.checkNotNull(value);
                if (((Number) value).intValue() >= 5) {
                    com.yalla.yalla.util.permission.OooO00o.OooO0OO(o00ooo01.f46003OooO00o, PermissionGroupReveal.f32883OooO0o, o00OO0OO.f46001OooO0Oo, new o00OO(o00ooo01));
                } else {
                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.send_img_toast));
                }
            } catch (Exception e) {
                e.printStackTrace();
                o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.send_img_toast));
            }
        }
        return Unit.INSTANCE;
    }
}
