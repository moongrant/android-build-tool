package oo00o;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p109o000ooo.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends o00O0OO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f60209OooO0OO = new Oooo0();

    public Oooo0() {
        super(8, 9);
    }

    @Override // p109o000ooo.o00O0OO0
    public final void OooO00o(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
