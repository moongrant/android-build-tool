package p361o0OOOooo;

import android.content.Context;
import com.common.support.imagepicker.album.config.Album;
import com.yalla.album.AlbumActivity;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooO;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 implements Function3<Context, Album, Integer, Boolean> {
    @NotNull
    public static Boolean OooO00o(@NotNull Context context, @NotNull Album album, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(album, "album");
        int size = album.getMultiSelectedData().size();
        AlbumActivity albumActivity = context instanceof AlbumActivity ? (AlbumActivity) context : null;
        boolean z = false;
        if (size + (albumActivity != null ? albumActivity.f22019OooO : 0) >= i) {
            OooOO0.OooO00o().OooO00o(com.google.gson.internal.OooOO0.OooO0O0(context.getString(OooO.select_picture_string_Select_a_maximum_of_xxx_photos), String.valueOf(i)));
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Boolean invoke(Context context, Album album, Integer num) {
        return OooO00o(context, album, num.intValue());
    }
}
