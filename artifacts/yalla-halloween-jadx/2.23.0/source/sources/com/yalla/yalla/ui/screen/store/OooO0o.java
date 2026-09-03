package com.yalla.yalla.ui.screen.store;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.ui.activity.room.CustomizeThemePreviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f29692OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(AppCompatActivity appCompatActivity) {
        super(1);
        this.f29692OooO0Oo = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri imagePath;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (imagePath = selectImageData2.OooO0O0()) != null) {
            int i = CustomizeThemePreviewActivity.f26514OooOo0;
            AppCompatActivity context = this.f29692OooO0Oo;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intent intent = new Intent(context, (Class<?>) CustomizeThemePreviewActivity.class);
            intent.putExtra("THEME_PREVIEW_IMAGE_PATH", imagePath);
            context.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
