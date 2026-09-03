package oo00o;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p109o000ooo.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends o00O0OO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f60208OooO0OO = new OooOo00();

    public OooOo00() {
        super(4, 5);
    }

    @Override // p109o000ooo.o00O0OO0
    public final void OooO00o(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
