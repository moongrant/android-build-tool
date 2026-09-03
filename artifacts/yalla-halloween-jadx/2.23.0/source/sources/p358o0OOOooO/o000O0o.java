package p358o0OOOooO;

import android.content.Context;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooO00o;
import o00O0OO.OooO0OO;
import o0OO0.OooO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o implements Function2<Context, AlbumItem, Boolean> {
    @NotNull
    public static Boolean OooO00o(@NotNull Context context, @NotNull AlbumItem data) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        if (OooO00o.OooO0O0(context, data.getContentUri())) {
            z = false;
        } else {
            OooO0OO.OooO00o().OooO00o(context.getString(OooO.select_picture_string_is_not_image_file_format));
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Boolean invoke(Context context, AlbumItem albumItem) {
        return OooO00o(context, albumItem);
    }
}
