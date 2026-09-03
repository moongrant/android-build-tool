package o0OO0O0O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends OooO0O0<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f43131OooO00o = new OooO0OO();

    @Override // o0OO0O0O.OooO0O0
    public final Bitmap OooO0O0(String str, BitmapFactory.Options ops) {
        String data = str;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ops, "ops");
        return BitmapFactory.decodeFile(data, ops);
    }
}
