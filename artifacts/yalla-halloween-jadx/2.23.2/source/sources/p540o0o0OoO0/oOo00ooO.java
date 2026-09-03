package p540o0o0OoO0;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p442o0OoOo0O.o0000O0O;
import p442o0OoOo0O.o0000oo;
import p442o0OoOo0O.o000OO;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00ooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MixedRoomActivity f55028OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00ooO(MixedRoomActivity mixedRoomActivity) {
        super(0);
        this.f55028OooO0Oo = mixedRoomActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("102225");
        com.yalla.yalla.service.room.OooO00o.f24529OooOo0.f48501OooO0O0.setValue(Boolean.FALSE);
        MixedRoomActivity mixedRoomActivity = this.f55028OooO0Oo;
        if (mixedRoomActivity != null) {
            o000OO o000oo2 = new o000OO(mixedRoomActivity);
            try {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                T value = ((MutableLiveData) o0O00oO0.f47956OooOo00.getValue()).getValue();
                Intrinsics.checkNotNull(value);
                if (((Number) value).intValue() >= 5) {
                    com.yalla.yalla.util.permission.OooO00o.OooO0OO(o000oo2.f47270OooO00o, PermissionGroupReveal.f32339OooO0o, o0000oo.f47269OooO0Oo, new o0000O0O(o000oo2));
                } else {
                    o000O00.OooO0O0(o0000.OooO0OO(o000000.send_img_toast));
                }
            } catch (Exception e) {
                e.printStackTrace();
                o000O00.OooO0O0(o0000.OooO0OO(o000000.send_img_toast));
            }
        }
        return Unit.INSTANCE;
    }
}
