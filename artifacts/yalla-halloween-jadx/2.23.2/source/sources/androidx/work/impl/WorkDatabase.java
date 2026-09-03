package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.OooO0O0;
import kotlin.Metadata;
import o00O0OO.OooO;
import o00O0OO.OooO00o;
import o00O0OO.OooO0o;
import o00O0OO.OooOOO;
import o00O0OO.OooOOOO;
import o00O0OO.Oooo0;
import o00O0OO.Oooo000;
import o00O0OO.o00O0O;
import o00O0OO.o00Ooo;
import o00O0OO.o0OOO0o;
import o00O0OO.o0Oo0oo;
import o00O0OO.o0OoOo0;
import o00O0OO.oo000o;
import o00O0OO.oo0o0Oo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@TypeConverters({OooO0O0.class, oo0o0Oo.class})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
@Database(autoMigrations = {@AutoMigration(from = 13, to = 14), @AutoMigration(from = 14, spec = oo00o.OooO0O0.class, to = 15)}, entities = {OooO00o.class, o00Ooo.class, o0OOO0o.class, OooOOO.class, Oooo000.class, o0OoOo0.class, OooO0o.class}, version = 16)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class WorkDatabase extends RoomDatabase {
    @NotNull
    public abstract o00O0OO.OooO0O0 OooOOOo();

    @NotNull
    public abstract OooOOOO OooOOo();

    @NotNull
    public abstract OooO OooOOo0();

    @NotNull
    public abstract Oooo0 OooOOoo();

    @NotNull
    public abstract oo000o OooOo0();

    @NotNull
    public abstract o00O0O OooOo00();

    @NotNull
    public abstract o0Oo0oo OooOo0O();
}
