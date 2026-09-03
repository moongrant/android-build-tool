package p590o0oOooo0;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.google.logging.type.LogSeverity;
import java.util.TimeZone;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class ooooO000 {
    @RequiresApi(api = 24)
    public static void OooO00o(@NotNull Context context, @NotNull String title, @NotNull String description, long j, long j2, @NotNull Function1 isSuccess) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        int iOooO0O0 = OooO0O0(context);
        if (iOooO0O0 < 0) {
            TimeZone timeZone = TimeZone.getDefault();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", "yalla");
            contentValues.put("account_name", "yalla@yalla.live");
            contentValues.put("account_type", "com.android.yalla");
            contentValues.put("calendar_displayName", "yallaAccount");
            contentValues.put("visible", (Integer) 1);
            contentValues.put("calendar_color", (Integer) (-16776961));
            contentValues.put("calendar_access_level", Integer.valueOf(LogSeverity.ALERT_VALUE));
            contentValues.put("sync_events", (Integer) 1);
            contentValues.put("calendar_timezone", timeZone.getID());
            contentValues.put("ownerAccount", "yalla@yalla.live");
            contentValues.put("canOrganizerRespond", (Integer) 0);
            Uri uriInsert = context.getContentResolver().insert(Uri.parse("content://com.android.calendar/calendars").buildUpon().appendQueryParameter("caller_is_syncadapter", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE).appendQueryParameter("account_name", "yalla@yalla.live").appendQueryParameter("account_type", "com.android.yalla").build(), contentValues);
            iOooO0O0 = (uriInsert == null ? -1L : ContentUris.parseId(uriInsert)) >= 0 ? OooO0O0(context) : -1;
        }
        if (iOooO0O0 < 0) {
            return;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, title);
        contentValues2.put("description", description);
        contentValues2.put("calendar_id", Integer.valueOf(iOooO0O0));
        contentValues2.put("dtstart", Long.valueOf(j));
        contentValues2.put("dtend", Long.valueOf(j2));
        contentValues2.put("hasAlarm", (Integer) 1);
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
        contentValues2.put("eventTimezone", id);
        Uri uriInsert2 = context.getContentResolver().insert(Uri.parse("content://com.android.calendar/events"), contentValues2);
        if (uriInsert2 == null) {
            isSuccess.invoke(Boolean.FALSE);
            return;
        }
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put("event_id", Long.valueOf(ContentUris.parseId(uriInsert2)));
        contentValues3.put("minutes", (Long) 5L);
        contentValues3.put("method", (Integer) 1);
        if (context.getContentResolver().insert(Uri.parse("content://com.android.calendar/reminders"), contentValues3) != null) {
            isSuccess.invoke(Boolean.TRUE);
        }
    }

    @SuppressLint({"Range"})
    public static int OooO0O0(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.android.calendar/calendars"), null, null, null, null);
        int i = -1;
        if (cursorQuery == null) {
            CloseableKt.closeFinally(cursorQuery, null);
            return -1;
        }
        try {
            if (cursorQuery.getCount() > 0) {
                cursorQuery.moveToFirst();
                i = cursorQuery.getInt(cursorQuery.getColumnIndex("_id"));
            }
            CloseableKt.closeFinally(cursorQuery, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursorQuery, th);
                throw th2;
            }
        }
    }
}
