package o0OO0OoO;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o extends OooO0O0<byte[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f42418OooO00o = new OooO00o();

    @Override // o0OO0OoO.OooO0O0
    public final Bitmap OooO0O0(byte[] bArr, BitmapFactory.Options ops) {
        byte[] data = bArr;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ops, "ops");
        return BitmapFactory.decodeByteArray(data, 0, data.length, ops);
    }
}
