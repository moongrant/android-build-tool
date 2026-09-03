package p530o0o0OOoO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class Oo0000 {
    @NotNull
    public static Pair OooO00o(int i, @Nullable Integer num, @Nullable Integer num2) {
        String strOooO0OO;
        String strOooO0OO2;
        switch (i) {
            case 1:
                strOooO0OO = o0000.OooO0OO(oO00OOo0.report_title_room);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_room);
                break;
            case 2:
                strOooO0OO = o0000.OooO0OO(oO00OOo0.report_title_user);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_user);
                break;
            case 3:
                strOooO0OO = o0000.OooO0OO(oO00OOo0.report_title_topic);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_topic);
                break;
            case 4:
                strOooO0OO = o0000.OooO0OO(oO00OOo0.report_title_post);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_post);
                break;
            case 5:
                strOooO0OO = o0000.OooO0OO(oO00OOo0.report_title_comment);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_comment);
                break;
            case 6:
                strOooO0OO = o0000.OooO0OO(oO00OOo0.report_title_event);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_event);
                break;
            case 7:
                strOooO0OO = o0000.OooO0OO(oO00OOo0.room_chat_report_title);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_room_chat);
                break;
            case 8:
                if (num2 == null || num2.intValue() != 1) {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Report_Chat);
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_private_chat_messages);
                } else {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Report_Message);
                    strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_new_description_private_chat_item_message);
                }
                break;
            default:
                strOooO0OO = o0000.OooO0OO(oO00OOo0.Report);
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_description);
                break;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_user_title_bullying_or_harassment);
            } else if (num.intValue() == 2) {
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.report_user_title_impersonating_a_user);
            } else if (num.intValue() == 3) {
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.why_reporting_friend_request);
            }
        }
        return new Pair(strOooO0OO, strOooO0OO2);
    }
}
