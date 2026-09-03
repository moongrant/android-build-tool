package p092o000o0O;

import OooO0o.OooO0OO;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o00O0O {
    public static int OooO00o(@NonNull Cursor cursor, @NonNull String str) {
        String string;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + "`");
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    String strOooO0Oo = OooOo00.OooO0Oo(".", str);
                    String strOooO00o = OooO0OO.OooO00o(".", str, "`");
                    int i = 0;
                    while (true) {
                        if (i < columnNames.length) {
                            String str2 = columnNames[i];
                            if (str2.length() < str.length() + 2 || !(str2.endsWith(strOooO0Oo) || (str2.charAt(0) == '`' && str2.endsWith(strOooO00o)))) {
                                i++;
                            } else {
                                columnIndex = i;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            string = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            string = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }
}
