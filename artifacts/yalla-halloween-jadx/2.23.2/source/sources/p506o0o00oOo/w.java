package p506o0o00oOo;

import android.app.DatePickerDialog;
import android.content.res.Configuration;
import android.view.View;
import android.widget.DatePicker;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50597OooO0oO;

    public w(UserInfoEditActivity userInfoEditActivity) {
        this.f50597OooO0oO = userInfoEditActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final UserInfoEditActivity userInfoEditActivity = this.f50597OooO0oO;
        userInfoEditActivity.OooOoo();
        userInfoEditActivity.getClass();
        Locale locale = new Locale(OooOo00.OooO0O0());
        Locale.setDefault(locale);
        Configuration configuration = userInfoEditActivity.getBaseContext().getResources().getConfiguration();
        configuration.setLocale(locale);
        userInfoEditActivity.createConfigurationContext(configuration);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(userInfoEditActivity.f26821OooOo0);
        DatePickerDialog datePickerDialog = new DatePickerDialog(userInfoEditActivity, new DatePickerDialog.OnDateSetListener() { // from class: o0o00oOo.b
            /* JADX WARN: Code duplicated, block: B:14:0x0088  */
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                String str;
                int i4 = UserInfoEditActivity.f26818Oooo0oO;
                UserInfoEditActivity this$0 = userInfoEditActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(datePicker, "<anonymous parameter 0>");
                Object objClone = this$0.f26823OooOo0O.clone();
                Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
                Calendar calendar2 = (Calendar) objClone;
                calendar2.set(1, i);
                calendar2.set(2, i2);
                calendar2.set(5, i3);
                Date time = calendar2.getTime();
                this$0.f26821OooOo0 = time;
                Intrinsics.checkNotNullParameter("dd-MM-yyyy", "formatString");
                String str2 = "";
                if (time != null) {
                    str = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(time);
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                } else {
                    str = "";
                }
                Date date = this$0.f26821OooOo0;
                Intrinsics.checkNotNullParameter("yyyy-MM-dd", "formatString");
                if (date != null) {
                    str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(date);
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                }
                if (com.code.android.util.OooOo00.OooO0O0(str)) {
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (Intrinsics.areEqual(str, String.valueOf(o0O00oO0.OooO0OO().getValue()))) {
                        this$0.f26829OooOoo0 = null;
                    } else {
                        this$0.f26829OooOoo0 = str2;
                        this$0.OooOoO().f45655OooO.setText(str);
                    }
                } else {
                    this$0.f26829OooOoo0 = null;
                }
                this$0.Oooo000();
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(userInfoEditActivity.f26823OooOo0O.getTimeInMillis());
        datePickerDialog.show();
    }
}
