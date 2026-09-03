package p579o0oOoo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import com.code.android.util.o000O0;
import com.yalla.yalla.util.FileProviderUtils;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMediaUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaUtils.kt\ncom/yalla/yalla/util/MediaUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,222:1\n11335#2:223\n11670#2,3:224\n*S KotlinDebug\n*F\n+ 1 MediaUtils.kt\ncom/yalla/yalla/util/MediaUtils\n*L\n183#1:223\n183#1:224,3\n*E\n"})
public final class oOo00ooO {
    @NotNull
    public static Uri OooO00o(@Nullable String str) {
        Uri uriForFile;
        if (str == null) {
            Uri EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            return EMPTY;
        }
        try {
            Context contextOooO00o = o000O0.OooO00o();
            File file = new File(str);
            int i = FileProviderUtils.f32792OooO0Oo;
            if (contextOooO00o == null || !file.exists()) {
                uriForFile = null;
            } else {
                uriForFile = FileProvider.getUriForFile(contextOooO00o, contextOooO00o.getPackageName() + ".baseProvider", file);
            }
            Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(Utils.context, File(path))");
            return uriForFile;
        } catch (Exception unused) {
            Uri EMPTY2 = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY2, "EMPTY");
            return EMPTY2;
        }
    }

    @Nullable
    public static Bitmap OooO0O0(@NotNull String mediaUri) {
        Intrinsics.checkNotNullParameter(mediaUri, "mediaUri");
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(o000O0.OooO00o(), OooO00o(mediaUri));
            byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
            if (embeddedPicture != null) {
                return BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
