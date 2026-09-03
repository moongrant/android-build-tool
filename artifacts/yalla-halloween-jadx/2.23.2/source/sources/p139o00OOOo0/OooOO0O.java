package p139o00OOOo0;

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
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public static Function1<? super SelectImageData, Unit> f37477OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Function1<? super AlbumItem, Boolean> f37478OooO0O0;

    public static void OooO00o(OooOOO0 config, Function1 function1) {
        f37477OooO00o = function1;
        int i = AlbumActivity.f22018OooOo0;
        Intrinsics.checkNotNullParameter(config, "config");
        Bundle bundle = new Bundle();
        bundle.putInt("MaxCount", config.f37497OooO0O0);
        bundle.putBoolean("IsTakePhoto", config.f37498OooO0OO);
        bundle.putBoolean("IsClipPhoto", config.f37499OooO0Oo);
        bundle.putFloat("ClipWidthRatio", config.f37501OooO0o0);
        bundle.putFloat("ClipHeightRatio", config.f37500OooO0o);
        bundle.putBoolean("IsSupportGif", config.f37502OooO0oO);
        bundle.putBoolean("isSupportVideo", config.f37503OooO0oo);
        bundle.putBoolean("IsSupportGifClip", config.f37495OooO);
        bundle.putParcelableArrayList("selectData", config.f37504OooOO0.OooO00o());
        FragmentActivity fragmentActivity = config.f37496OooO00o;
        Intent intent = new Intent(fragmentActivity, (Class<?>) AlbumActivity.class);
        intent.putExtras(bundle);
        fragmentActivity.startActivity(intent);
    }

    public static void OooO0O0(@NotNull AppCompatActivity activity, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SelectImageData selectImageData = new SelectImageData();
        Intrinsics.checkNotNullParameter(activity, "activity");
        OooOOO0 oooOOO0 = new OooOOO0(activity);
        oooOOO0.f37497OooO0O0 = 1;
        oooOOO0.f37498OooO0OO = true;
        oooOOO0.f37499OooO0Oo = false;
        oooOOO0.f37501OooO0o0 = 1.0f;
        oooOOO0.f37500OooO0o = 1.0f;
        oooOOO0.f37502OooO0oO = false;
        oooOOO0.f37503OooO0oo = false;
        oooOOO0.f37495OooO = false;
        oooOOO0.f37504OooOO0 = selectImageData;
        OooO00o(oooOOO0, function1);
    }

    public static void OooO0OO(@NotNull FragmentActivity activity, float f, float f2, boolean z, boolean z2, @Nullable Function1 function1) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SelectImageData selectImageData = new SelectImageData();
        Intrinsics.checkNotNullParameter(activity, "activity");
        OooOOO0 oooOOO0 = new OooOOO0(activity);
        oooOOO0.f37497OooO0O0 = 1;
        oooOOO0.f37498OooO0OO = true;
        oooOOO0.f37499OooO0Oo = true;
        oooOOO0.f37501OooO0o0 = f;
        oooOOO0.f37500OooO0o = f2;
        oooOOO0.f37502OooO0oO = z;
        oooOOO0.f37503OooO0oo = false;
        oooOOO0.f37495OooO = z2;
        oooOOO0.f37504OooOO0 = selectImageData;
        OooO00o(oooOOO0, function1);
    }
}
