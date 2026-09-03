package p566o0oOo00O;

import android.app.DatePickerDialog;
import android.content.res.Configuration;
import android.view.View;
import android.widget.DatePicker;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.oo000o;
import p498o0o00Oo0.OooOOO;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO0o00 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45327Oooo;

    public o0OO0o00(UserInfoEditActivity userInfoEditActivity) {
        this.f45327Oooo = userInfoEditActivity;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f45327Oooo.Oooo00o();
        final UserInfoEditActivity userInfoEditActivity = this.f45327Oooo;
        Objects.requireNonNull(userInfoEditActivity);
        Locale locale = new Locale(oo000o.OooO00o());
        Locale.setDefault(locale);
        Configuration configuration = userInfoEditActivity.getBaseContext().getResources().getConfiguration();
        configuration.setLocale(locale);
        userInfoEditActivity.createConfigurationContext(configuration);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(userInfoEditActivity.f23496Ooooo0o);
        DatePickerDialog datePickerDialog = new DatePickerDialog(userInfoEditActivity, new DatePickerDialog.OnDateSetListener() { // from class: o0oOo00O.oo0OOoo
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                String str;
                UserInfoEditActivity this$0 = userInfoEditActivity;
                UserInfoEditActivity.OooO00o oooO00o = UserInfoEditActivity.f23493o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(datePicker, "<anonymous parameter 0>");
                Object objClone = this$0.f23497OooooO0.clone();
                Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
                Calendar calendar2 = (Calendar) objClone;
                calendar2.set(1, i);
                calendar2.set(2, i2);
                calendar2.set(5, i3);
                Date time = calendar2.getTime();
                this$0.f23496Ooooo0o = time;
                Intrinsics.checkNotNullParameter("dd-MM-yyyy", "formatString");
                String str2 = "";
                if (time != null) {
                    str = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(time);
                    Intrinsics.checkNotNullExpressionValue(str, "format.format(value)");
                } else {
                    str = "";
                }
                Date date = this$0.f23496Ooooo0o;
                Intrinsics.checkNotNullParameter("yyyy-MM-dd", "formatString");
                if (date != null) {
                    str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(date);
                    Intrinsics.checkNotNullExpressionValue(str2, "format.format(value)");
                }
                if (!OooO0OO.OooO0O0(str) || Intrinsics.areEqual(str, String.valueOf(OooOOO.f41216OooO00o.OooO0Oo().getValue()))) {
                    this$0.f23503Ooooooo = null;
                } else {
                    this$0.f23503Ooooooo = str2;
                    this$0.OooOooo().f50491OooO.setText(str);
                }
                this$0.Oooo0o0();
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(userInfoEditActivity.f23497OooooO0.getTimeInMillis());
        datePickerDialog.show();
    }
}
