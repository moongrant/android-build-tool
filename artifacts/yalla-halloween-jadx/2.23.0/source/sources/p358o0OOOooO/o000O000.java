package p358o0OOOooO;

import android.content.Context;
import com.android.billingclient.api.o000Oo0;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.yalla.album.AlbumActivity;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooO00o;
import o00O0OO.OooO0OO;
import o0OO0.OooO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 implements Function4<Context, AlbumItem, Album, Integer, Boolean> {
    @NotNull
    public static Boolean OooO00o(@NotNull Context context, @NotNull AlbumItem data, @NotNull Album album, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(album, "album");
        int size = album.getMultiSelectedData().size();
        AlbumActivity albumActivity = context instanceof AlbumActivity ? (AlbumActivity) context : null;
        int i2 = size + (albumActivity != null ? albumActivity.f22492OooO : 0);
        boolean z2 = true;
        if (i2 < i || album.isMultiModeItemSelected(data.getId())) {
            z = false;
        } else {
            OooO0OO.OooO00o().OooO00o(o000Oo0.OooO00o(context.getString(OooO.select_picture_string_Select_a_maximum_of_xxx_photos), String.valueOf(i)));
            z = true;
        }
        if (data.isGif()) {
            if (new BigDecimal((((double) data.getSize()) / 1024.0d) / 1024.0d).setScale(2, RoundingMode.UP).doubleValue() > ((double) 2)) {
                OooO0OO.OooO00o().OooO00o(context.getString(OooO.select_picture_string_GIF_too_large));
                z = true;
            }
        }
        if (OooO00o.OooO0O0(context, data.getContentUri())) {
            z2 = z;
        } else {
            OooO0OO.OooO00o().OooO00o(context.getString(OooO.select_picture_string_is_not_image_file_format));
        }
        return Boolean.valueOf(z2);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ Boolean invoke(Context context, AlbumItem albumItem, Album album, Integer num) {
        return OooO00o(context, albumItem, album, num.intValue());
    }
}
