package p105o000oo0o;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103o000oo00.OooOOO0;
import p103o000oo00.o000O000;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O0O0;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Uri f35767OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35768OooO0O0;

    public static final class OooO00o implements o00O0OO0.OooO00o<Uri> {
        @Override // o000oo0o.o00O0OO0.OooO00o
        public final o00O0OO0 OooO00o(Object obj, o0Oo0oo o0oo0oo2) {
            Uri uri = (Uri) obj;
            Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
            if (Intrinsics.areEqual(uri.getScheme(), ShareInternalUtility.STAGING_PARAM) && Intrinsics.areEqual((String) CollectionsKt.firstOrNull((List) uri.getPathSegments()), "android_asset")) {
                return new o00O00OO(uri, o0oo0oo2);
            }
            return null;
        }
    }

    public o00O00OO(@NotNull Uri uri, @NotNull o0Oo0oo o0oo0oo2) {
        this.f35767OooO00o = uri;
        this.f35768OooO0O0 = o0oo0oo2;
    }

    @Override // p105o000oo0o.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00O0O0O> continuation) {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.drop(this.f35767OooO00o.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        o0Oo0oo o0oo0oo2 = this.f35768OooO0O0;
        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000O0Oo.OooO0oo(o0oo0oo2.f35863OooO00o.getAssets().open(strJoinToString$default)));
        OooOOO0 oooOOO0 = new OooOOO0(strJoinToString$default);
        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
        File cacheDir = o0oo0oo2.f35863OooO00o.getCacheDir();
        cacheDir.mkdirs();
        return new oo0oOO0(new o000O000(o00o0000OooO0O0, cacheDir, oooOOO0), o000O0O0.OooO0O0(MimeTypeMap.getSingleton(), strJoinToString$default), DataSource.DISK);
    }
}
