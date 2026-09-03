package o00O0;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.size.Size;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o00oO0o;
import p119o00O0Oo0.o00O0O;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooOO0O<Uri> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f30070OooO00o;

    public OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30070OooO00o = context;
    }

    @Override // o00O0.OooOO0O
    public final boolean OooO00o(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.areEqual(data.getScheme(), ShareInternalUtility.STAGING_PARAM) && Intrinsics.areEqual(o00O0O.OooO00o(data), "android_asset");
    }

    @Override // o00O0.OooOO0O
    public final String OooO0O0(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = data.toString();
        Intrinsics.checkNotNullExpressionValue(string, "data.toString()");
        return string;
    }

    @Override // o00O0.OooOO0O
    public final Object OooO0OO(p113o00O00Oo.OooO0O0 oooO0O0, Uri uri, Size size, o00oO0o o00oo0o2, Continuation continuation) throws IOException {
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "data.pathSegments");
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments, 1), "/", null, null, 0, null, null, 62, null);
        InputStream inputStreamOpen = this.f30070OooO00o.getAssets().open(strJoinToString$default);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(path)");
        o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(o0O000Oo.OooO(inputStreamOpen));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNullExpressionValue(singleton, "getSingleton()");
        return new Oooo0(o0ooooOooO0OO, o00O0O.OooO0O0(singleton, strJoinToString$default), DataSource.DISK);
    }
}
