package p358o0OOOooO;

import android.content.Context;
import com.common.support.imagepicker.album.config.Album;
import com.yalla.album.AlbumActivity;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooO0OO;
import o0OO0.OooO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 implements Function3<Context, Album, Integer, Boolean> {
    @NotNull
    public static Boolean OooO00o(@NotNull Context context, @NotNull Album album, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(album, "album");
        int size = album.getMultiSelectedData().size();
        AlbumActivity albumActivity = context instanceof AlbumActivity ? (AlbumActivity) context : null;
        boolean z = false;
        if (size + (albumActivity != null ? albumActivity.f22492OooO : 0) >= i) {
            OooO0OO.OooO00o().OooO00o(com.android.billingclient.api.o000Oo0.OooO00o(context.getString(OooO.select_picture_string_Select_a_maximum_of_xxx_photos), String.valueOf(i)));
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Boolean invoke(Context context, Album album, Integer num) {
        return OooO00o(context, album, num.intValue());
    }
}
