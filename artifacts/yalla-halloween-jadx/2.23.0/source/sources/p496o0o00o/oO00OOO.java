package p496o0o00o;

import android.app.DatePickerDialog;
import android.content.res.Configuration;
import android.view.View;
import android.widget.DatePicker;
import com.code.android.util.OooOo00;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOO extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49142OooO0oO;

    public oO00OOO(UserInfoEditActivity userInfoEditActivity) {
        this.f49142OooO0oO = userInfoEditActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        final UserInfoEditActivity userInfoEditActivity = this.f49142OooO0oO;
        userInfoEditActivity.OooOoo();
        userInfoEditActivity.getClass();
        Locale locale = new Locale(OooO.OooO0O0());
        Locale.setDefault(locale);
        Configuration configuration = userInfoEditActivity.getBaseContext().getResources().getConfiguration();
        configuration.setLocale(locale);
        userInfoEditActivity.createConfigurationContext(configuration);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(userInfoEditActivity.f27286OooOo0);
        DatePickerDialog datePickerDialog = new DatePickerDialog(userInfoEditActivity, new DatePickerDialog.OnDateSetListener() { // from class: o0o00o.oO0000O
            /* JADX WARN: Code duplicated, block: B:14:0x0088  */
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                String str;
                int i4 = UserInfoEditActivity.f27283Oooo0oO;
                UserInfoEditActivity this$0 = userInfoEditActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(datePicker, "<anonymous parameter 0>");
                Object objClone = this$0.f27288OooOo0O.clone();
                Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
                Calendar calendar2 = (Calendar) objClone;
                calendar2.set(1, i);
                calendar2.set(2, i2);
                calendar2.set(5, i3);
                Date time = calendar2.getTime();
                this$0.f27286OooOo0 = time;
                Intrinsics.checkNotNullParameter("dd-MM-yyyy", "formatString");
                String str2 = "";
                if (time != null) {
                    str = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(time);
                    Intrinsics.checkNotNullExpressionValue(str, "format.format(value)");
                } else {
                    str = "";
                }
                Date date = this$0.f27286OooOo0;
                Intrinsics.checkNotNullParameter("yyyy-MM-dd", "formatString");
                if (date != null) {
                    str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(date);
                    Intrinsics.checkNotNullExpressionValue(str2, "format.format(value)");
                }
                if (OooOo00.OooO0O0(str)) {
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    if (Intrinsics.areEqual(str, String.valueOf(o000000O.OooO0OO().getValue()))) {
                        this$0.f27294OooOoo0 = null;
                    } else {
                        this$0.f27294OooOoo0 = str2;
                        this$0.OooOoO().f58075OooO.setText(str);
                    }
                } else {
                    this$0.f27294OooOoo0 = null;
                }
                this$0.Oooo000();
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(userInfoEditActivity.f27288OooOo0O.getTimeInMillis());
        datePickerDialog.show();
    }
}
