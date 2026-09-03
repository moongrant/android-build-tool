package p579o0oOoOoO;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.http.Response;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import p424o0OoO0Oo.o00OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O000 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f56530OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO000<String> f56531OooO0o0;

    public oOO0O000(o00OO000<String> o00oo001, String str) {
        this.f56531OooO0o0 = o00oo001;
        this.f56530OooO0o = str;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@Nullable String str, @Nullable String str2) {
        super.OooO0O0(str, str2);
        boolean z = true;
        if (!(str == null || str.length() == 0) && o000000.OooO0o0(str) == 1038) {
            String strOooO0OO = o0000.OooO0OO(p562o0oOo000.o000000.room_ban_toast);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@Nullable String str) {
        this.f56531OooO0o0.postValue(new Response(true, this.f56530OooO0o, false, null, 12, null));
    }
}
