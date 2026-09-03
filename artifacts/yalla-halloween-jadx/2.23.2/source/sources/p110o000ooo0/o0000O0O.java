package p110o000ooo0;

import android.content.Context;
import androidx.room.RoomDatabase;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O {
    @JvmStatic
    @NotNull
    public static final <T extends RoomDatabase> RoomDatabase.OooO00o<T> OooO00o(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (!(StringsKt.isBlank(str))) {
            return new RoomDatabase.OooO00o<>(context, klass, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
    }
}
