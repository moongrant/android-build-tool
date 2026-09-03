package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.CLASS)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003B\u0000¨\u0006\u0004"}, d2 = {"Landroidx/room/OnConflictStrategy;", "", "Companion", "OooO00o", "room-common"}, k = 1, mv = {1, 7, 1})
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface OnConflictStrategy {
    public static final int ABORT = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f10976OooO00o;
    public static final int FAIL = 4;
    public static final int IGNORE = 5;
    public static final int NONE = 0;
    public static final int REPLACE = 1;
    public static final int ROLLBACK = 2;

    /* JADX INFO: renamed from: androidx.room.OnConflictStrategy$OooO00o, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ Companion f10976OooO00o = new Companion();
    }
}
