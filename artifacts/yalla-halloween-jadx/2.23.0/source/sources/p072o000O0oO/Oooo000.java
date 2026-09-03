package p072o000O0oO;

import android.database.Cursor;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo000 extends FunctionReferenceImpl implements Function1<Cursor, List<Object>> {
    public Oooo000(Oooo0 oooo0) {
        super(1, oooo0, Oooo0.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<Object> invoke(Cursor cursor) {
        Cursor p0 = cursor;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Oooo0) this.receiver).OooO0o0(p0);
    }
}
