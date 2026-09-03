package com.yalla.album;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.common.support.imagepicker.crop.YLCrop;
import com.common.support.imagepicker.crop.config.Crop;
import com.common.support.imagepicker.crop.config.CropConfig;
import com.common.support.imagepicker.mediaedit.YLMediaEdit;
import com.common.support.imagepicker.mediaedit.config.MediaEdit;
import com.common.support.imagepicker.mediaedit.entities.MediaEditConfig;
import com.common.support.imagepicker.mediaedit.entities.MediaEditSource;
import com.common.support.imagepicker.mediaedit.widget.MediaEditLayout;
import com.common.support.imagepicker.preview.YLPreview;
import com.common.support.imagepicker.preview.component.image.engine.impl.GlideEngine;
import com.common.support.imagepicker.preview.config.Preview;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o0OO0.OooO00o;
import o0OO0.OooO0o;
import org.jetbrains.annotations.Nullable;
import p118o00O0Oo0.OooO0OO;
import p358o0OOOooO.o000;
import p358o0OOOooO.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/album/CropImageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LibSelectPicture_release"}, k = 1, mv = {1, 8, 0})
public final class CropImageActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final /* synthetic */ int f22529OooOOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public MediaEditLayout f22530OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public MediaEditConfig f22531OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Uri f22532OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Preview f22533OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public MediaEdit f22534OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Crop f22535OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f22536OooOO0O = 1.0f;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f22537OooOO0o = 1.0f;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        MediaEdit mediaEdit;
        MediaEditLayout mediaEditLayout;
        Crop crop;
        super.onCreate(bundle);
        YLCrop.Companion companion = YLCrop.INSTANCE;
        int i = OooO00o.select_picture_color_FF00d8c9;
        Object obj = ContextCompat.f5271OooO00o;
        this.f22535OooOO0 = companion.create(this, new CropConfig(false, false, ContextCompat.OooO0o.OooO00o(this, i), 0));
        setContentView(OooO0o.crop_image_activity);
        OooO0OO oooO0OO = new OooO0OO(this);
        oooO0OO.f36580OooOO0.setVisibility(0);
        oooO0OO.f36587OooOOo0 = new p026Oooo0o.OooO0o(this);
        View viewFindViewById = findViewById(o0OO0.OooO0OO.layout_media_edit);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.layout_media_edit)");
        this.f22530OooO = (MediaEditLayout) viewFindViewById;
        Uri uri = (Uri) getIntent().getParcelableExtra("sourceData");
        this.f22532OooO0o0 = uri;
        if (uri == null) {
            finish();
        } else {
            this.f22531OooO0o = new MediaEditConfig("yalla", false, false, false, 14, null);
            this.f22536OooOO0O = getIntent().getFloatExtra(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 1.0f);
            this.f22537OooOO0o = getIntent().getFloatExtra(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 1.0f);
            getIntent().getIntExtra("origin_width", 0);
            getIntent().getIntExtra("origin_height", 0);
        }
        Uri uri2 = this.f22532OooO0o0;
        if (uri2 != null) {
            Preview imageEngine = YLPreview.Companion.create$default(YLPreview.INSTANCE, this, String.valueOf(uri2), 0, 0, null, 28, null).setImageEngine(GlideEngine.INSTANCE);
            this.f22533OooO0oO = imageEngine;
            YLMediaEdit.Companion companion2 = YLMediaEdit.INSTANCE;
            if (imageEngine == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPreview");
                imageEngine = null;
            }
            this.f22534OooO0oo = companion2.create(this, imageEngine, this.f22531OooO0o);
        }
        MediaEdit mediaEdit2 = this.f22534OooO0oo;
        if (mediaEdit2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEdit");
            mediaEdit = null;
        } else {
            mediaEdit = mediaEdit2;
        }
        MediaEditLayout mediaEditLayout2 = this.f22530OooO;
        if (mediaEditLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutMediaEdit");
            mediaEditLayout = null;
        } else {
            mediaEditLayout = mediaEditLayout2;
        }
        Preview preview = this.f22533OooO0oO;
        if (preview == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPreview");
            preview = null;
        }
        MediaEditSource mediaEditSource = new MediaEditSource(preview.getSingleDataSource());
        Crop crop2 = this.f22535OooOO0;
        if (crop2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("crop");
            crop = null;
        } else {
            crop = crop2;
        }
        mediaEdit.setDataSource(mediaEditLayout, mediaEditSource, crop, new o0000OO0(this), new o000(this));
    }
}
