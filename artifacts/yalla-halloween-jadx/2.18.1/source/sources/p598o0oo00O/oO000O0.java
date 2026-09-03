package p598o0oo00O;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000O0 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f47784Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0(AppCompatActivity appCompatActivity) {
        super(1);
        this.f47784Oooo0o = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri imagePath;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (imagePath = selectImageData2.OooO0O0()) != null) {
            AppCompatActivity context = this.f47784Oooo0o;
            CustomizeThemePreviewActivity.OooO00o oooO00o = CustomizeThemePreviewActivity.f22786Ooooo0o;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intent intent = new Intent(context, (Class<?>) CustomizeThemePreviewActivity.class);
            intent.putExtra("THEME_PREVIEW_IMAGE_PATH", imagePath);
            context.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
