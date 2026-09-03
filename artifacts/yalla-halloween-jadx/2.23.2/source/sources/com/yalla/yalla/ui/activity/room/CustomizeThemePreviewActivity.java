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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oOOO0OOO;
import p556o0oOOoo0.oO0O0Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/CustomizeThemePreviewActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCustomizeThemePreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomizeThemePreviewActivity.kt\ncom/yalla/yalla/ui/activity/room/CustomizeThemePreviewActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,110:1\n22#2,2:111\n*S KotlinDebug\n*F\n+ 1 CustomizeThemePreviewActivity.kt\ncom/yalla/yalla/ui/activity/room/CustomizeThemePreviewActivity\n*L\n38#1:111,2\n*E\n"})
public final class CustomizeThemePreviewActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f26062OooOo0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26063OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oOOO0OOO.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f26064OooOo00 = LazyKt.lazy(new OooO00o());

    public static final class OooO00o extends Lambda implements Function0<Uri> {
        public OooO00o() {
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

    public final oOOO0OOO OooOo() {
        return (oOOO0OOO) this.f26063OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f45174OooO0Oo)) {
            finish();
        } else if (Intrinsics.areEqual(view, OooOo().f45175OooO0o0)) {
            BaseActivityK.OooOo0o(this, com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_theme_customize_cropping), 0L, 2);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new o0Oo0oo(this, null), 2, null);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) throws IOException {
        super.onCreate(bundle);
        setContentView(OooOo().f45171OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        int i = 0;
        p379o0OOoOOO.oOO00O.OooO0OO(window, 0);
        ConstraintLayout clContent = OooOo().f45172OooO0O0;
        Intrinsics.checkNotNullExpressionValue(clContent, "clContent");
        p379o0OOoOOO.oOO00O.OooO00o(clContent, true, 2);
        OooOo().f45174OooO0Oo.setOnClickListener(this);
        OooOo().f45175OooO0o0.setOnClickListener(this);
        try {
            Uri uri = (Uri) this.f26064OooOo00.getValue();
            if (uri != null) {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                File fileOooO0O0 = com.code.android.util.Oooo000.OooO0O0(this, uri);
                Bitmap bitmapCreateBitmap = null;
                String absolutePath = fileOooO0O0 != null ? fileOooO0O0.getAbsolutePath() : null;
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
                Intrinsics.checkNotNull(bitmap);
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
                float fMax = Math.max(p423o0OoO0OO.o000O000.f46650OooO00o / bitmapCreateBitmap.getWidth(), p423o0OoO0OO.o000O000.f46651OooO0O0 / bitmapCreateBitmap.getHeight());
                OooOo().f45173OooO0OO.setMinScale(1.1f * fMax);
                OooOo().f45173OooO0OO.setMaxScale(2 * fMax);
                OooOo().f45173OooO0OO.setMinimumScaleType(3);
                OooOo().f45173OooO0OO.setImage(new oO0O0Oo0(bitmapCreateBitmap));
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            finish();
        }
    }
}
