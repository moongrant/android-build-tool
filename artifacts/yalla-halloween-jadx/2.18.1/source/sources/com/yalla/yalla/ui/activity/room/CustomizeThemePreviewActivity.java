package com.yalla.yalla.ui.activity.room;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p478o0OooooO.oO0OoOO0;
import p522o0o0O0o.o000O0Oo;
import p544o0o0OoOO.o3;
import p649o0ooOOoo.je;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/CustomizeThemePreviewActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class CustomizeThemePreviewActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22786Ooooo0o = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22787OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(je.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f22788Ooooo00 = LazyKt.lazy(new OooO0O0());

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<Uri> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Uri invoke() {
            Intent intent = CustomizeThemePreviewActivity.this.getIntent();
            if (intent != null) {
                return (Uri) intent.getParcelableExtra("THEME_PREVIEW_IMAGE_PATH");
            }
            return null;
        }
    }

    public final je OooOoo() {
        return (je) this.f22787OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f49766OooO0Oo)) {
            finish();
        } else if (Intrinsics.areEqual(view, OooOoo().f49767OooO0o0)) {
            BaseActivityK.OooOoo0(this, o000O0O0.OooO0OO(R.string.room_theme_customize_cropping), 0L, 2, null);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new o3(this, null), 2, null);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) throws IOException {
        super.onCreate(bundle);
        setContentView(OooOoo().f49763OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        int i = 0;
        oO0OoOO0.OooO0Oo(window, 0);
        ConstraintLayout constraintLayout = OooOoo().f49764OooO0O0;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clContent");
        oO0OoOO0.OooO0O0(constraintLayout, true, 2);
        OooOoo().f49766OooO0Oo.setOnClickListener(this);
        OooOoo().f49767OooO0o0.setOnClickListener(this);
        try {
            Uri uri = (Uri) this.f22788Ooooo00.getValue();
            if (uri != null) {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                File fileOooO0OO = o00OOO0O.OooO00o.OooO0OO(this, uri);
                Bitmap bitmapCreateBitmap = null;
                String absolutePath = fileOooO0OO != null ? fileOooO0OO.getAbsolutePath() : null;
                try {
                    if (absolutePath == null) {
                        absolutePath = "";
                    }
                    int attributeInt = new ExifInterface(absolutePath).getAttributeInt("Orientation", 1);
                    if (attributeInt == 3) {
                        i = 180;
                    } else if (attributeInt == 6) {
                        i = 90;
                    } else if (attributeInt == 8) {
                        i = 270;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                Matrix matrix = new Matrix();
                matrix.postRotate(i);
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                } catch (OutOfMemoryError unused) {
                }
                if (bitmapCreateBitmap == null) {
                    bitmapCreateBitmap = bitmap;
                }
                if (!Intrinsics.areEqual(bitmap, bitmapCreateBitmap)) {
                    bitmap.recycle();
                }
                if (bitmapCreateBitmap == null) {
                    return;
                }
                float fMax = Math.max(o000O0Oo.f42985OooO00o / bitmapCreateBitmap.getWidth(), o000O0Oo.f42986OooO0O0 / bitmapCreateBitmap.getHeight());
                OooOoo().f49765OooO0OO.setMinScale(1.1f * fMax);
                OooOoo().f49765OooO0OO.setMaxScale(2 * fMax);
                OooOoo().f49765OooO0OO.setMinimumScaleType(3);
                OooOoo().f49765OooO0OO.setImage(new p509o0o00oo.OooOo00(bitmapCreateBitmap));
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            finish();
        }
    }
}
