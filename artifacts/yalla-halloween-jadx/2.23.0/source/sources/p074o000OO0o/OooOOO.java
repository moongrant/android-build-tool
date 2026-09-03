package p074o000OO0o;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements SupportSQLiteOpenHelper.OooO0O0 {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO0O0
    @NotNull
    public final SupportSQLiteOpenHelper create(@NotNull SupportSQLiteOpenHelper.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new FrameworkSQLiteOpenHelper(configuration.f7984OooO00o, configuration.f7985OooO0O0, configuration.f7986OooO0OO, configuration.f7987OooO0Oo, configuration.f7988OooO0o0);
    }
}
