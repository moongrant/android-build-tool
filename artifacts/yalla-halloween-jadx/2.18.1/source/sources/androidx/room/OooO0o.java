package androidx.room;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {
    @NonNull
    public static <T extends RoomDatabase> RoomDatabase.OooO00o<T> OooO00o(@NonNull Context context, @NonNull Class<T> cls, @NonNull String str) {
        if (str.trim().length() != 0) {
            return new RoomDatabase.OooO00o<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
