package p125o00O0o0O;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.OooO0OO;
import p124o00O0o00.o0000OO0;
import p131o00O0oo0.o0O0O00;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Uri f36597OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36598OooO0O0;

    public static final class OooO00o implements o0ooOOo.OooO00o<Uri> {
        @Override // o00O0o0O.o0ooOOo.OooO00o
        public final o0ooOOo OooO00o(Object obj, o0O0O00 o0o0o00) {
            Uri uri = (Uri) obj;
            Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
            if (Intrinsics.areEqual(uri.getScheme(), ShareInternalUtility.STAGING_PARAM) && Intrinsics.areEqual((String) CollectionsKt.firstOrNull((List) uri.getPathSegments()), "android_asset")) {
                return new Oooo0(uri, o0o0o00);
            }
            return null;
        }
    }

    public Oooo0(@NotNull Uri uri, @NotNull o0O0O00 o0o0o00) {
        this.f36597OooO00o = uri;
        this.f36598OooO0O0 = o0o0o00;
    }

    @Override // p125o00O0o0O.o0ooOOo
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00oO0o> continuation) {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.drop(this.f36597OooO00o.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        o0O0O00 o0o0o00 = this.f36598OooO0O0;
        o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(o0OO.OooO0oo(o0o0o00.f36838OooO00o.getAssets().open(strJoinToString$default)));
        OooO0OO oooO0OO = new OooO0OO(strJoinToString$default);
        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
        File cacheDir = o0o0o00.f36838OooO00o.getCacheDir();
        cacheDir.mkdirs();
        return new oo0o0Oo(new o0000OO0(o0o0000VarOooO0O0, cacheDir, oooO0OO), OooOo00.OooO0O0(MimeTypeMap.getSingleton(), strJoinToString$default), DataSource.DISK);
    }
}
