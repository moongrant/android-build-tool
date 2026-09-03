package p111o000oooO;

import android.database.Cursor;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O00O extends FunctionReferenceImpl implements Function1<Cursor, List<Object>> {
    public o00O00O(oOO00O ooo00o) {
        super(1, ooo00o, oOO00O.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Object> invoke(Cursor cursor) {
        Cursor p0 = cursor;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((oOO00O) this.receiver).OooO0o0(p0);
    }
}
