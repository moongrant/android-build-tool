package oo00o;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p109o000ooo.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends o00O0OO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Oooo000 f60210OooO0OO = new Oooo000();

    public Oooo000() {
        super(7, 8);
    }

    @Override // p109o000ooo.o00O0OO0
    public final void OooO00o(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
