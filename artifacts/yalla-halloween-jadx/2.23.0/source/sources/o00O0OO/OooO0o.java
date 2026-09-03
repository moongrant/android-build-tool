package o00O0OO;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.app.selectPicture.model.SelectImageData;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.yalla.album.AlbumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public static Function1<? super SelectImageData, Unit> f36540OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Function1<? super AlbumItem, Boolean> f36541OooO0O0;

    public static void OooO00o(OooO config, Function1 function1) {
        f36540OooO00o = function1;
        int i = AlbumActivity.f22491OooOo0;
        Intrinsics.checkNotNullParameter(config, "config");
        Bundle bundle = new Bundle();
        bundle.putInt("MaxCount", config.f36525OooO0O0);
        bundle.putBoolean("IsTakePhoto", config.f36526OooO0OO);
        bundle.putBoolean("IsClipPhoto", config.f36527OooO0Oo);
        bundle.putFloat("ClipWidthRatio", config.f36529OooO0o0);
        bundle.putFloat("ClipHeightRatio", config.f36528OooO0o);
        bundle.putBoolean("IsSupportGif", config.f36530OooO0oO);
        bundle.putBoolean("isSupportVideo", config.f36531OooO0oo);
        bundle.putBoolean("IsSupportGifClip", config.f36523OooO);
        bundle.putParcelableArrayList("selectData", config.f36532OooOO0.OooO00o());
        FragmentActivity fragmentActivity = config.f36524OooO00o;
        Intent intent = new Intent(fragmentActivity, (Class<?>) AlbumActivity.class);
        intent.putExtras(bundle);
        fragmentActivity.startActivity(intent);
    }

    public static void OooO0O0(@NotNull AppCompatActivity activity, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SelectImageData selectImageData = new SelectImageData();
        Intrinsics.checkNotNullParameter(activity, "activity");
        OooO oooO = new OooO(activity);
        oooO.f36525OooO0O0 = 1;
        oooO.f36526OooO0OO = true;
        oooO.f36527OooO0Oo = false;
        oooO.f36529OooO0o0 = 1.0f;
        oooO.f36528OooO0o = 1.0f;
        oooO.f36530OooO0oO = false;
        oooO.f36531OooO0oo = false;
        oooO.f36523OooO = false;
        oooO.f36532OooOO0 = selectImageData;
        OooO00o(oooO, function1);
    }

    public static void OooO0OO(@NotNull FragmentActivity activity, float f, float f2, boolean z, boolean z2, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SelectImageData selectImageData = new SelectImageData();
        Intrinsics.checkNotNullParameter(activity, "activity");
        OooO oooO = new OooO(activity);
        oooO.f36525OooO0O0 = 1;
        oooO.f36526OooO0OO = true;
        oooO.f36527OooO0Oo = true;
        oooO.f36529OooO0o0 = f;
        oooO.f36528OooO0o = f2;
        oooO.f36530OooO0oO = z;
        oooO.f36531OooO0oo = false;
        oooO.f36523OooO = z2;
        oooO.f36532OooOO0 = selectImageData;
        OooO00o(oooO, function1);
    }
}
