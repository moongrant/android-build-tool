package p496o0o00o;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.camera.core.impl.o00OOO00;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;
import p601o0oo0O0.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49198OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0OOoo(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49198OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        int iCurrentTimeMillis;
        long time;
        String date = str;
        UserInfoActivity userInfoActivity = this.f49198OooO0Oo;
        String str2 = userInfoActivity.f27245OooOo0O;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (o00OOO00.OooO0O0(str2)) {
            TextView textView = userInfoActivity.OooOooO().f57992OooO0Oo.f57611OooO0Oo.f57696OooOoO;
            int i = o0000O0.f56870OooO00o;
            Intrinsics.checkNotNullExpressionValue(date, "birthday");
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
