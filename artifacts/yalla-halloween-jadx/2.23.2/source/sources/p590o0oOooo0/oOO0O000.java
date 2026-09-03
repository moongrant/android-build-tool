package p590o0oOooo0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.util.DeleteNotificationType;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0O000 {
    @NotNull
    public static final String OooO00o(@Nullable Integer num) {
        int deleteType = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_10.getDeleteType();
        if (num != null && num.intValue() == deleteType) {
            return o0000.OooO0OO(o000000.pornography_or_violence);
        }
        int deleteType2 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_20.getDeleteType();
        if (num != null && num.intValue() == deleteType2) {
            return o0000.OooO0OO(o000000.terrorism_or_bloodiness);
        }
        int deleteType3 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_30.getDeleteType();
        if (num != null && num.intValue() == deleteType3) {
            return o0000.OooO0OO(o000000.deception_or_illegal_action);
        }
        int deleteType4 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_50.getDeleteType();
        if (num != null && num.intValue() == deleteType4) {
            return o0000.OooO0OO(o000000.advertisements);
        }
        int deleteType5 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_55.getDeleteType();
        if (num != null && num.intValue() == deleteType5) {
            return o0000.OooO0OO(o000000.copying_another_person_s_post);
        }
        int deleteType6 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_57.getDeleteType();
        if (num != null && num.intValue() == deleteType6) {
            return o0000.OooO0OO(o000000.abusing_or_insulting_others);
        }
        int deleteType7 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_58.getDeleteType();
        if (num != null && num.intValue() == deleteType7) {
            return o0000.OooO0OO(o000000.Contains_special_sensitive_information);
        }
        int deleteType8 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_60.getDeleteType();
        if (num != null && num.intValue() == deleteType8) {
            return o0000.OooO0OO(o000000.moment_delete_type_other);
        }
        int deleteType9 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_101.getDeleteType();
        if (num != null && num.intValue() == deleteType9) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_nudity_or_sexual_activity);
        }
        int deleteType10 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_102.getDeleteType();
        if (num != null && num.intValue() == deleteType10) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_violence);
        }
        int deleteType11 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_103.getDeleteType();
        if (num != null && num.intValue() == deleteType11) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_hate_speech);
        }
        int deleteType12 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_104.getDeleteType();
        if (num != null && num.intValue() == deleteType12) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_bullying_or_harassment);
        }
        int deleteType13 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_105.getDeleteType();
        if (num != null && num.intValue() == deleteType13) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_false_information);
        }
        int deleteType14 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_106.getDeleteType();
        if (num != null && num.intValue() == deleteType14) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_fraud);
        }
        int deleteType15 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_107.getDeleteType();
        if (num != null && num.intValue() == deleteType15) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_spam);
        }
        int deleteType16 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_108.getDeleteType();
        if (num != null && num.intValue() == deleteType16) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_impersonation);
        }
        int deleteType17 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_109.getDeleteType();
        if (num != null && num.intValue() == deleteType17) {
            return o0000.OooO0OO(o000000.report_delete_post_reply_sale_or_use_of_illegal_or_regulated_goods);
        }
        int deleteType18 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_110.getDeleteType();
        if (num != null && num.intValue() == deleteType18) {
            return o0000.OooO0OO(o000000.sale_yalla_golds_accounts);
        }
        int deleteType19 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_111.getDeleteType();
        if (num != null && num.intValue() == deleteType19) {
            return o0000.OooO0OO(o000000.Religion_Politics);
        }
        int deleteType20 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_112.getDeleteType();
        if (num != null && num.intValue() == deleteType20) {
            return o0000.OooO0OO(o000000.pretend_official);
        }
        int deleteType21 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_113.getDeleteType();
        if (num != null && num.intValue() == deleteType21) {
            return o0000.OooO0OO(o000000.Promote_competitive_apps);
        }
        int deleteType22 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_114.getDeleteType();
        if (num != null && num.intValue() == deleteType22) {
            return o0000.OooO0OO(o000000.Junk);
        }
        int deleteType23 = DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_115.getDeleteType();
        if (num != null && num.intValue() == deleteType23) {
            return o0000.OooO0OO(o000000.Advertisement);
        }
        return (num != null && num.intValue() == DeleteNotificationType.CODE_POST_OFFICIAL_DELETE_Type_116.getDeleteType()) ? o0000.OooO0OO(o000000.Others) : o0000.OooO0OO(o000000.report_delete_post_reply_common_msg);
    }

    public static boolean OooO0O0(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 16384);
            if (!Intrinsics.areEqual(packageName, "com.android.vending")) {
                return packageInfo != null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.example.android"));
            intent.setPackage("com.android.vending");
            return (packageInfo == null || packageManager.resolveActivity(intent, 65536) == null) ? false : true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void OooO0OO(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Uri uri = Uri.parse("market://details?id=" + packageName);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
