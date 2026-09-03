package p361o0OOOooo;

import android.content.Context;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooO;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.OooO0O0;
import p139o00OOOo0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 implements Function2<Context, AlbumItem, Boolean> {
    @NotNull
    public static Boolean OooO00o(@NotNull Context context, @NotNull AlbumItem data) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        if (OooO0O0.OooO0O0(context, data.getContentUri())) {
            z = false;
        } else {
            OooOO0.OooO00o().OooO00o(context.getString(OooO.select_picture_string_is_not_image_file_format));
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Boolean invoke(Context context, AlbumItem albumItem) {
        return OooO00o(context, albumItem);
    }
}
