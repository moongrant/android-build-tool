package p506o0o00oOo;

import android.text.TextUtils;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.oOOO0O0o;
import p606o0oo0O0o.o0O0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50513OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50513OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        int iCurrentTimeMillis;
        long time;
        String date = str;
        UserInfoActivity userInfoActivity = this.f50513OooO0Oo;
        String str2 = userInfoActivity.f26780OooOo0O;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oOOO0O0o.OooO00o(str2)) {
            TextView textView = userInfoActivity.OooOooO().f45621OooO0Oo.f45409OooO0Oo.f45460OooOoO;
            int i = o0O0OO0.f57399OooO00o;
            Intrinsics.checkNotNull(date);
            Intrinsics.checkNotNullParameter(date, "date");
            if (TextUtils.isEmpty(date) || Intrinsics.areEqual("-1", date)) {
                iCurrentTimeMillis = 0;
            } else {
                Intrinsics.checkNotNullParameter(date, "date");
                if (TextUtils.isEmpty(date) || Intrinsics.areEqual("-1", date)) {
                    time = 0;
                } else {
                    try {
                        time = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(date).getTime();
                    } catch (ParseException e) {
                        e.printStackTrace();
                        time = -1;
                    }
                }
                iCurrentTimeMillis = (int) (((System.currentTimeMillis() - time) / ((long) 86400000)) / ((long) 365));
            }
            textView.setText(String.valueOf(iCurrentTimeMillis));
        }
        return Unit.INSTANCE;
    }
}
