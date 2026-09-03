package p544o0o0OoOO;

import android.text.TextUtils;
import android.view.View;
import com.yalla.yalla.ui.activity.room.RoomReNameActivity;
import java.util.Map;
import java.util.Objects;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p516o0o0O000.o000oOoO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class z5 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomReNameActivity f44355Oooo;

    public z5(RoomReNameActivity roomReNameActivity) {
        this.f44355Oooo = roomReNameActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        String strTrim = this.f44355Oooo.f22960OoooOoO.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        RoomReNameActivity roomReNameActivity = this.f44355Oooo;
        Objects.requireNonNull(roomReNameActivity);
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        String barid = roomReNameActivity.f22959OoooOo0.getBarid();
        a6 a6Var = new a6(roomReNameActivity, strTrim);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", barid);
        mapOooO0O0.put("barname", o000oOoO.OooO0O0(strTrim));
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32260OoooO0, mapOooO0O0, a6Var);
    }
}
