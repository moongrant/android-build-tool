package p361o0OOOooo;

import android.content.Context;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.yalla.album.AlbumActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooO;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.OooO0O0;
import p139o00OOOo0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O implements Function4<Context, AlbumItem, Album, Integer, Boolean> {
    @NotNull
    public static Boolean OooO00o(@NotNull Context context, @NotNull AlbumItem data, @NotNull Album album, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(album, "album");
        int size = album.getMultiSelectedData().size();
        AlbumActivity albumActivity = context instanceof AlbumActivity ? (AlbumActivity) context : null;
        int i2 = size + (albumActivity != null ? albumActivity.f22019OooO : 0);
        boolean z2 = true;
        if (i2 < i || album.isMultiModeItemSelected(data.getId())) {
            z = false;
        } else {
            OooOO0.OooO00o().OooO00o(com.google.gson.internal.OooOO0.OooO0O0(context.getString(OooO.select_picture_string_Select_a_maximum_of_xxx_photos), String.valueOf(i)));
            z = true;
        }
        if (data.isGif()) {
            if (new BigDecimal((((double) data.getSize()) / 1024.0d) / 1024.0d).setScale(2, RoundingMode.UP).doubleValue() > ((double) 2)) {
                OooOO0.OooO00o().OooO00o(context.getString(OooO.select_picture_string_GIF_too_large));
                z = true;
            }
        }
        if (OooO0O0.OooO0O0(context, data.getContentUri())) {
            z2 = z;
        } else {
            OooOO0.OooO00o().OooO00o(context.getString(OooO.select_picture_string_is_not_image_file_format));
        }
        return Boolean.valueOf(z2);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ Boolean invoke(Context context, AlbumItem albumItem, Album album, Integer num) {
        return OooO00o(context, albumItem, album, num.intValue());
    }
}
