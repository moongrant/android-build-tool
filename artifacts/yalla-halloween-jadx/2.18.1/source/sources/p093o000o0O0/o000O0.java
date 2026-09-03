package p093o000o0O0;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o00O0;
import p089o000o000.o00O00o0;
import p091o000o00o.o00000O0;
import p091o000o00o.o0000O0;
import p091o000o00o.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class o000O0<Value> extends o00O00o0<Integer, Value> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0000O0 f29270OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f29271OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f29272OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f29273OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO00o f29274OooO0o0;

    public static final class OooO00o extends o00000O0.OooO0OO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o000O0<Value> f29275OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String[] strArr, o000O0<Value> o000o0) {
            super(strArr);
            this.f29275OooO0O0 = o000o0;
        }

        @Override // o000o00o.o00000O0.OooO0OO
        public final void OooO00o(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f29275OooO0O0.OooO0OO();
        }
    }

    public o000O0(@NotNull o0000O0 sourceQuery, @NotNull RoomDatabase db, @NotNull String... tables) {
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.f29270OooO0O0 = sourceQuery;
        this.f29271OooO0OO = db;
        this.f29272OooO0Oo = new AtomicInteger(-1);
        this.f29274OooO0o0 = new OooO00o(tables, this);
        this.f29273OooO0o = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    public static final Object OooO0o0(o000O0 o000o0, o00O00o0.OooO00o oooO00o, int i) {
        int i2;
        int i3;
        o0000O0 o0000o0OooO0o;
        Cursor cursorOooOOO;
        List<Value> listOooO0o;
        Integer numBoxInt;
        Integer numBoxInt2;
        Objects.requireNonNull(o000o0);
        Integer num = (Integer) oooO00o.OooO00o();
        int iIntValue = num == null ? 0 : num.intValue();
        boolean z = oooO00o instanceof o00O00o0.OooO00o.OooO0O0;
        if (z) {
            i2 = oooO00o.f28942OooO00o;
            if (iIntValue < i2) {
                i2 = iIntValue;
            }
        } else {
            i2 = oooO00o.f28942OooO00o;
        }
        try {
            if (z) {
                int i4 = oooO00o.f28942OooO00o;
                if (iIntValue < i4) {
                    i3 = 0;
                } else {
                    iIntValue -= i4;
                }
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SELECT * FROM ( ");
                sbOooO0o0.append((Object) o000o0.f29270OooO0O0.f29164Oooo0o);
                sbOooO0o0.append(" ) LIMIT ");
                sbOooO0o0.append(i2);
                sbOooO0o0.append(" OFFSET ");
                sbOooO0o0.append(i3);
                o0000o0OooO0o = o0000O0.OooO0o(sbOooO0o0.toString(), o000o0.f29270OooO0O0.f29167OoooO);
                Intrinsics.checkNotNullExpressionValue(o0000o0OooO0o, "acquire(\n            lim…eQuery.argCount\n        )");
                o0000o0OooO0o.OooO0oo(o000o0.f29270OooO0O0);
                cursorOooOOO = o000o0.f29271OooO0OO.OooOOO(o0000o0OooO0o);
                Intrinsics.checkNotNullExpressionValue(cursorOooOOO, "db.query(sqLiteQuery)");
                listOooO0o = o000o0.OooO0o(cursorOooOOO);
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                int size = listOooO0o.size() + i3;
                if (!listOooO0o.isEmpty() || listOooO0o.size() < i2 || size >= i) {
                    numBoxInt = null;
                } else {
                    numBoxInt = Boxing.boxInt(size);
                }
                if (i3 > 0 || listOooO0o.isEmpty()) {
                    numBoxInt2 = null;
                } else {
                    numBoxInt2 = Boxing.boxInt(i3);
                }
                return new o00O00o0.OooO0O0.OooO0OO(listOooO0o, numBoxInt2, numBoxInt, i3, Math.max(0, i - size));
            }
            if (!(oooO00o instanceof o00O00o0.OooO00o.C0311OooO00o)) {
                if (!(oooO00o instanceof o00O00o0.OooO00o.OooO0OO)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (iIntValue >= i) {
                    iIntValue = Math.max(0, i - oooO00o.f28942OooO00o);
                }
            }
            listOooO0o = o000o0.OooO0o(cursorOooOOO);
            cursorOooOOO.close();
            o0000o0OooO0o.release();
            int size2 = listOooO0o.size() + i3;
            if (listOooO0o.isEmpty()) {
                numBoxInt = null;
            } else {
                numBoxInt = null;
            }
            if (i3 > 0) {
                numBoxInt2 = null;
            } else {
                numBoxInt2 = null;
            }
            return new o00O00o0.OooO0O0.OooO0OO(listOooO0o, numBoxInt2, numBoxInt, i3, Math.max(0, i - size2));
        } catch (Throwable th) {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
            throw th;
        }
        i3 = iIntValue;
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("SELECT * FROM ( ");
        sbOooO0o1.append((Object) o000o0.f29270OooO0O0.f29164Oooo0o);
        sbOooO0o1.append(" ) LIMIT ");
        sbOooO0o1.append(i2);
        sbOooO0o1.append(" OFFSET ");
        sbOooO0o1.append(i3);
        o0000o0OooO0o = o0000O0.OooO0o(sbOooO0o1.toString(), o000o0.f29270OooO0O0.f29167OoooO);
        Intrinsics.checkNotNullExpressionValue(o0000o0OooO0o, "acquire(\n            lim…eQuery.argCount\n        )");
        o0000o0OooO0o.OooO0oo(o000o0.f29270OooO0O0);
        cursorOooOOO = o000o0.f29271OooO0OO.OooOOO(o0000o0OooO0o);
        Intrinsics.checkNotNullExpressionValue(cursorOooOOO, "db.query(sqLiteQuery)");
    }

    @Override // p089o000o000.o00O00o0
    public final boolean OooO00o() {
        return true;
    }

    @Override // p089o000o000.o00O00o0
    public final Integer OooO0O0(o00O0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = state.f28903OooO0OO.f28928OooO0Oo;
        Integer num = state.f28902OooO0O0;
        if (num == null) {
            return null;
        }
        Intrinsics.checkNotNull(num);
        return Integer.valueOf(Math.max(0, num.intValue() - (i / 2)));
    }

    @Override // p089o000o000.o00O00o0
    @Nullable
    public final Object OooO0Oo(@NotNull o00O00o0.OooO00o<Integer> oooO00o, @NotNull Continuation<? super o00O00o0.OooO0O0<Integer, Value>> continuation) {
        return BuildersKt.withContext(o0OO00O.OooO00o(this.f29271OooO0OO), new o000O00O(this, oooO00o, null), continuation);
    }

    @NonNull
    @NotNull
    public abstract List<Value> OooO0o(@NotNull Cursor cursor);
}
