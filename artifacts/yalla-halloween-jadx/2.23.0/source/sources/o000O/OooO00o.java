package o000O;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p031OoooO0.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@JvmName(name = "CursorUtil")
public final class OooO00o {
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    public static final int OooO00o(@NotNull Cursor c, @NotNull String name) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c.getColumnIndex(name);
        if (columnIndex < 0) {
            columnIndex = c.getColumnIndex("`" + name + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25) {
                    if (name.length() == 0) {
                        columnIndex = -1;
                    } else {
                        String[] columnNames = c.getColumnNames();
                        Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
                        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
                        Intrinsics.checkNotNullParameter(name, "name");
                        String strConcat = ".".concat(name);
                        String str = "." + name + '`';
                        int length = columnNames.length;
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                String str2 = columnNames[i2];
                                int i3 = i + 1;
                                if (str2.length() < name.length() + 2 || !(StringsKt.OooOO0O(str2, strConcat) || (str2.charAt(0) == '`' && StringsKt.OooOO0O(str2, str)))) {
                                    i2++;
                                    i = i3;
                                } else {
                                    columnIndex = i;
                                }
                            } else {
                                columnIndex = -1;
                            }
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
            String[] columnNames2 = c.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames2, "c.columnNames");
            strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(columnNames2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strJoinToString$default = "unknown";
        }
        throw new IllegalArgumentException(o00Ooo.OooO00o("column '", name, "' does not exist. Available columns: ", strJoinToString$default));
    }
}
