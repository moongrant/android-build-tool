package o0oo0000;

import androidx.compose.runtime.internal.StabilityInferred;
import com.weieyu.yalla.R;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f47649OooO00o = new OooO0O0();

    @NotNull
    public final Pair<String, String> OooO00o(int i, @Nullable Integer num, @Nullable Integer num2) {
        String strOooO0OO;
        String strOooO0OO2;
        switch (i) {
            case 1:
                strOooO0OO = o000O0O0.OooO0OO(R.string.report_title_room);
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_room);
                break;
            case 2:
                strOooO0OO = o000O0O0.OooO0OO(R.string.report_title_user);
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_user);
                break;
            case 3:
                strOooO0OO = o000O0O0.OooO0OO(R.string.report_title_topic);
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_topic);
                break;
            case 4:
                strOooO0OO = o000O0O0.OooO0OO(R.string.report_title_post);
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_post);
                break;
            case 5:
                strOooO0OO = o000O0O0.OooO0OO(R.string.report_title_comment);
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_comment);
                break;
            case 6:
                strOooO0OO = o000O0O0.OooO0OO(R.string.report_title_event);
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_event);
                break;
            case 7:
                strOooO0OO = o000O0O0.OooO0OO(R.string.room_chat_report_title);
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_room_chat);
                break;
            case 8:
                if (num2 == null || num2.intValue() != 1) {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.Report_Chat);
                    strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_private_chat_messages);
                } else {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.Report_Message);
                    strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_new_description_private_chat_item_message);
                }
                break;
            default:
                strOooO0OO = o000O0O0.OooO0OO(R.string.report);
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_description);
                break;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_user_title_bullying_or_harassment);
            } else if (num.intValue() == 2) {
                strOooO0OO2 = o000O0O0.OooO0OO(R.string.report_user_title_impersonating_a_user);
            }
        }
        return new Pair<>(strOooO0OO, strOooO0OO2);
    }
}
