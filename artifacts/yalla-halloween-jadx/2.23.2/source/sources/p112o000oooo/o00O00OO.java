package p112o000oooo;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.paging.o0O0O00;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import java.util.List;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O00.OooO0O0.C0175OooO0O0<Object, Object> f35979OooO00o = new o0O0O00.OooO0O0.C0175OooO0O0<>();

    public static o0O0O00.OooO0O0.OooO0OO OooO00o(o0O0O00.OooO00o params, RoomSQLiteQuery sourceQuery, RoomDatabase db, int i, Function1 convertRows) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(convertRows, "convertRows");
        Integer num = (Integer) params.OooO00o();
        int iIntValue = num != null ? num.intValue() : 0;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z = params instanceof o0O0O00.OooO00o.OooO0O0;
        int i2 = params.f10443OooO00o;
        int i3 = (!z || iIntValue >= i2) ? i2 : iIntValue;
        Intrinsics.checkNotNullParameter(params, "params");
        if (z) {
            iIntValue = iIntValue < i2 ? 0 : iIntValue - i2;
        } else if (!(params instanceof o0O0O00.OooO00o.C0174OooO00o)) {
            if (!(params instanceof o0O0O00.OooO00o.OooO0OO)) {
                throw new NoWhenBranchMatchedException();
            }
            if (iIntValue >= i) {
                iIntValue = Math.max(0, i - i2);
            }
        }
        String str = "SELECT * FROM ( " + sourceQuery.OooO0oO() + " ) LIMIT " + i3 + " OFFSET " + iIntValue;
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(sourceQuery.f11015OooOO0O, str);
        roomSQLiteQueryOooO00o.OooOo00(sourceQuery);
        Integer numValueOf = null;
        Cursor cursorOooOO0o = db.OooOO0o(roomSQLiteQueryOooO00o, null);
        try {
            List list = (List) convertRows.invoke(cursorOooOO0o);
            cursorOooOO0o.close();
            roomSQLiteQueryOooO00o.release();
            int size = list.size() + iIntValue;
            Integer numValueOf2 = (list.isEmpty() || list.size() < i3 || size >= i) ? null : Integer.valueOf(size);
            if (iIntValue > 0 && !list.isEmpty()) {
                numValueOf = Integer.valueOf(iIntValue);
            }
            return new o0O0O00.OooO0O0.OooO0OO(list, numValueOf, numValueOf2, iIntValue, Math.max(0, i - size));
        } catch (Throwable th) {
            cursorOooOO0o.close();
            roomSQLiteQueryOooO00o.release();
            throw th;
        }
    }
}
