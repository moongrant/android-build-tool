package com.yalla.yalla.ui.activity.moment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Property;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.o000OO00;
import com.app.selectPicture.model.ImageLocationInfo;
import com.app.selectPicture.view.HackyViewPager;
import com.app.selectPicture.view.photoview.PhotoView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.abs.AbsListener.AbsListenerTag;
import com.yalla.yalla.base.activity.BaseFixOrientationActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.adapter.showImageUrlMore.ShowImageUrlMoreHolderView;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p485o0o00O0.o0OO0;
import p485o0o00O0.o0OO00OO;
import p485o0o00O0.o0OO00o0;
import p485o0o00O0.o0OO0O0;
import p485o0o00O0.o0OOooO0;
import p506o0o00ooO.oOO0OO;
import p519o0o0O0oO.x2;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p629o0ooO0O0.o0000Ooo;
import p641o0ooOOOO.z5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/ShowImageActivity;", "Lcom/yalla/yalla/base/activity/BaseFixOrientationActivity;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class ShowImageActivity extends BaseFixOrientationActivity {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final /* synthetic */ int f26251Oooo00o = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f26254OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f26255OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public String f26259OooOo0o;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f26263OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f26265OooOooO;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f26267Oooo000;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f26253OooOOo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList<ImageLocationInfo> f26252OooOOo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f26257OooOo00 = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f26256OooOo0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f26258OooOo0O = true;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public ArrayList<Bitmap> f26261OooOoO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f26260OooOoO = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f26262OooOoOO = new OooO0OO();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final OooOO0O f26264OooOoo0 = new OooOO0O();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final Lazy f26266OooOooo = LazyKt.lazy(OooOOO0.f26274OooO0Oo);

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f26268Oooo00O = LazyKt.lazy(new OooOO0());

    public static final class OooO extends Lambda implements Function0<p117o00O0Oo.OooOOOO> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p117o00O0Oo.OooOOOO invoke() {
            return new p117o00O0Oo.OooOOOO(ShowImageActivity.this.getApplicationContext());
        }
    }

    @SourceDebugExtension({"SMAP\nShowImageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowImageActivity.kt\ncom/yalla/yalla/ui/activity/moment/ShowImageActivity$Companion\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,583:1\n215#2,2:584\n*S KotlinDebug\n*F\n+ 1 ShowImageActivity.kt\ncom/yalla/yalla/ui/activity/moment/ShowImageActivity$Companion\n*L\n552#1:584,2\n*E\n"})
    public static final class OooO00o {
        @JvmStatic
        public static void OooO00o(@NotNull Activity activity, @NotNull String imageUrl, @NotNull NetImageView imageView, @Nullable String str, boolean z) {
            Rect rect;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            ArrayList arrayList = new ArrayList();
            arrayList.add(imageUrl);
            ArrayList<ImageView> arrayList2 = new ArrayList();
            arrayList2.add(imageView);
            Intrinsics.checkNotNullParameter(activity, "activity");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (ImageView imageView2 : arrayList2) {
                ImageLocationInfo imageLocationInfo = new ImageLocationInfo();
                if (imageView2 == null || imageView2.getDrawable() == null) {
                    rect = null;
                } else {
                    Drawable drawable = imageView2.getDrawable();
                    rect = new Rect();
                    imageView2.getGlobalVisibleRect(rect);
                    Rect bounds = drawable.getBounds();
                    Matrix imageMatrix = imageView2.getImageMatrix();
                    float[] fArr = new float[9];
                    if (imageMatrix != null) {
                        imageMatrix.getValues(fArr);
                    }
                    int i = rect.left + ((int) fArr[2]);
                    rect.left = i;
                    rect.top += (int) fArr[5];
                    float f = i;
                    float fWidth = bounds.width();
                    float f2 = fArr[0];
                    if (f2 == 0.0f) {
                        f2 = 1.0f;
                    }
                    rect.right = (int) ((fWidth * f2) + f);
                    float f3 = rect.top;
                    float fHeight = bounds.height();
                    float f4 = fArr[4];
                    rect.bottom = (int) ((fHeight * (f4 != 0.0f ? f4 : 1.0f)) + f3);
                }
                if (rect != null) {
                    imageLocationInfo.f9781OooO0Oo = rect.height();
                    imageLocationInfo.f9783OooO0o0 = rect.width();
                    imageLocationInfo.f9782OooO0o = rect.left;
                    imageLocationInfo.f9784OooO0oO = rect.top;
                }
                arrayList3.add(imageLocationInfo);
                Drawable drawable2 = imageView2.getDrawable();
                Intrinsics.checkNotNullExpressionValue(drawable2, "item.drawable");
                Intrinsics.checkNotNullParameter(drawable2, "drawable");
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = drawable2.getIntrinsicHeight();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable2.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(w, h, config)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable2.draw(canvas);
                arrayList4.add(bitmapCreateBitmap);
            }
            LiveEventBus.get("EVENTMSG_ShowImageBitmap").post(arrayList4);
            if (!p382o0OOoo0o.o00Ooo.OooO0o0()) {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append("\n" + ((String) it.next()));
                }
                p592o0oo00O.OooOOO0.OooO0O0("ShowImageUrls : " + ((Object) stringBuffer));
            }
            Intent intent = new Intent(activity, (Class<?>) ShowImageActivity.class);
            intent.putExtra("image_index", 0);
            intent.putExtra("image_url_list", arrayList);
            intent.putExtra("image_info_list", arrayList3);
            intent.putExtra("IsHeadUrl", z);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("Image_WatermarkText", str);
            }
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<z5> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z5 invoke() {
            z5 z5VarInflate = z5.inflate(LayoutInflater.from(ShowImageActivity.this));
            Intrinsics.checkNotNullExpressionValue(z5VarInflate, "inflate(LayoutInflater.from(this))");
            return z5VarInflate;
        }
    }

    public static final class OooO0OO implements Animator.AnimatorListener {
        public OooO0OO() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ShowImageActivity showImageActivity = ShowImageActivity.this;
            showImageActivity.finish();
            showImageActivity.overridePendingTransition(0, 0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    public static final class OooO0o extends Lambda implements Function0<oOO0OO> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOO0OO invoke() {
            ShowImageActivity showImageActivity = ShowImageActivity.this;
            return new oOO0OO(showImageActivity, showImageActivity.f26253OooOOo0);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<x2> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x2 invoke() {
            final ShowImageActivity showImageActivity = ShowImageActivity.this;
            x2 x2Var = new x2(showImageActivity);
            x2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o00O0.o0OO0o00
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ShowImageActivity this$0 = showImageActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.f26267Oooo000 = false;
                    this$0.OooOo0o().f59458OooO0o0.setCanScroll(true);
                }
            });
            return x2Var;
        }
    }

    public static final class OooOO0O implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<p116o00O0OOo.OooOOO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f26274OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p116o00O0OOo.OooOOO invoke() {
            return new p116o00O0OOo.OooOOO();
        }
    }

    public static final void OooOo0O(ShowImageActivity showImageActivity, MotionEvent event, float f) {
        if (showImageActivity.f26267Oooo000) {
            showImageActivity.OooOoOO();
            return;
        }
        ShowImageUrlMoreHolderView showImageUrlMoreHolderViewOooOOo0 = showImageActivity.OooOoO0().OooOOo0(Integer.valueOf(showImageActivity.f26254OooOOoo));
        Intrinsics.checkNotNullExpressionValue(showImageUrlMoreHolderViewOooOOo0, "mAdapter.getCurrentView(mCurrentIndex)");
        PhotoView photoView = showImageUrlMoreHolderViewOooOOo0.f27778OooOO0o;
        Intrinsics.checkNotNullExpressionValue(photoView, "it.imageView");
        if (photoView.getScale() == 1.0f) {
            float fAbs = 1 - Math.abs(f / p417o0OoO0.o0ooOOo.f45530OooO0O0);
            showImageActivity.OooOo0o().f59456OooO0OO.getBackground().setAlpha((int) (255 * fAbs));
            Lazy lazy = showImageActivity.f26266OooOooo;
            ((p116o00O0OOo.OooOOO) lazy.getValue()).getClass();
            photoView.setScaleY(fAbs);
            photoView.setScaleX(fAbs);
            p116o00O0OOo.OooOOO oooOOO = (p116o00O0OOo.OooOOO) lazy.getValue();
            oooOOO.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            float y = event.getY() - oooOOO.f36568OooO0OO;
            photoView.setTranslationY(y);
            showImageActivity.f26265OooOooO = y;
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity
    public final boolean OooOOOo() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    public final void OooOo(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final String strOooO0Oo = p139o00OOooO.OooO0o.OooO0Oo(str);
        String content = this.f26259OooOo0o;
        if (content != null) {
            Intrinsics.checkNotNullParameter(content, "content");
            if (str != null) {
                String strOooO0Oo2 = p139o00OOooO.OooO0o.OooO0Oo(str);
                if (!StringsKt.OooO0o(strOooO0Oo2, "?watermark/2")) {
                    strOooO0Oo2 = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO0Oo2, "?watermark/2");
                }
                Charset charset = Charsets.UTF_8;
                byte[] bytes = content.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strEncodeToString = Base64.encodeToString(bytes, 10);
                byte[] bytes2 = "#FFFFFF".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                str2 = strOooO0Oo2 + "/text/" + strEncodeToString + "/fill/" + Base64.encodeToString(bytes2, 10) + "/fontsize/1000/dx/10/dy/10";
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            strOooO0Oo = str2;
        }
        if (isDestroyed() || isFinishing()) {
            return;
        }
        if (!z) {
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32884OooO0o0, null, new o0OO00OO(this, strOooO0Oo));
            return;
        }
        x2 x2Var = (x2) this.f26268Oooo00O.getValue();
        x2Var.f44397OooO0o = new o0000Ooo() { // from class: o0o00O0.oo0ooO
            @Override // p629o0ooO0O0.o0000Ooo
            public final void OooO00o(int i, Object obj, Object obj2) {
                AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
                int i2 = ShowImageActivity.f26251Oooo00o;
                ShowImageActivity this$0 = this.f48228OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String finalOriginalImage = strOooO0Oo;
                Intrinsics.checkNotNullParameter(finalOriginalImage, "$finalOriginalImage");
                if (absListenerTag == AbsListenerTag.Ok) {
                    String string = Uri.parse(finalOriginalImage).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "parse(finalOriginalImage).toString()");
                    this$0.getClass();
                    OooO00o.OooO0OO(this$0, PermissionGroupReveal.f32884OooO0o0, null, new o0OO00OO(this$0, string));
                }
            }
        };
        x2Var.show();
        OooOo0o().f59458OooO0o0.setCanScroll(false);
        this.f26267Oooo000 = true;
        OooOoOO();
    }

    public final z5 OooOo0o() {
        return (z5) this.f26260OooOoO.getValue();
    }

    public final void OooOoO() {
        float f;
        float fOooO0OO;
        OooOo0o().f59456OooO0OO.getBackground().setAlpha(127);
        ArrayList<ImageLocationInfo> arrayList = this.f26252OooOOo;
        if (arrayList.size() <= this.f26254OooOOoo) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        p117o00O0Oo.OooOOOO oooOOOO = (p117o00O0Oo.OooOOOO) this.f26256OooOo0.getValue();
        PhotoView photoView = OooOoO0().OooOOo0(Integer.valueOf(this.f26254OooOOoo)).f27778OooOO0o;
        float fOooO0O0 = p117o00O0Oo.OooOo00.OooO0O0(this, arrayList.get(this.f26254OooOOoo));
        ImageLocationInfo imageLocationInfo = arrayList.get(this.f26254OooOOoo);
        oooOOOO.getClass();
        int i = imageLocationInfo.f9783OooO0o0;
        int i2 = imageLocationInfo.f9781OooO0Oo;
        int i3 = imageLocationInfo.f9782OooO0o;
        int i4 = imageLocationInfo.f9784OooO0oO;
        Context context = oooOOOO.f36575OooO00o;
        float f2 = i;
        float f3 = i2;
        if ((f2 * 1.0f) / f3 >= (p117o00O0Oo.OooOo00.OooO0Oo(context) * 1.0f) / p117o00O0Oo.OooOo00.OooO0OO(context)) {
            float f4 = 1.0f - fOooO0O0;
            f = i3 / f4;
            fOooO0OO = (i4 - (((p117o00O0Oo.OooOo00.OooO0OO(context) * fOooO0O0) - f3) / 2.0f)) / f4;
        } else {
            float fOooO0Oo = i3 - (((p117o00O0Oo.OooOo00.OooO0Oo(context) * fOooO0O0) - f2) / 2.0f);
            float f5 = 1.0f - fOooO0O0;
            f = fOooO0Oo / f5;
            fOooO0OO = i4 / f5;
        }
        photoView.setPivotX(f);
        photoView.setPivotY(fOooO0OO);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.SCALE_X, photoView.getScaleX(), fOooO0O0);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.SCALE_Y, photoView.getScaleY(), fOooO0O0);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.TRANSLATION_X, (((1.0f - photoView.getScaleX()) * (p117o00O0Oo.OooOo00.OooO0Oo(context) / 2)) - ((1.0f - photoView.getScaleX()) * photoView.getPivotX())) + photoView.getTranslationX(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.TRANSLATION_Y, (((1.0f - photoView.getScaleY()) * (p117o00O0Oo.OooOo00.OooO0OO(context) / 2)) - ((1.0f - photoView.getScaleY()) * photoView.getPivotY())) + photoView.getTranslationY(), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.setDuration(300L);
        animatorSet.start();
        animatorSet.addListener(this.f26262OooOoOO);
    }

    public final oOO0OO OooOoO0() {
        return (oOO0OO) this.f26257OooOo00.getValue();
    }

    public final void OooOoOO() {
        ShowImageUrlMoreHolderView showImageUrlMoreHolderViewOooOOo0 = OooOoO0().OooOOo0(Integer.valueOf(this.f26254OooOOoo));
        Intrinsics.checkNotNullExpressionValue(showImageUrlMoreHolderViewOooOOo0, "mAdapter.getCurrentView(mCurrentIndex)");
        PhotoView photoView = showImageUrlMoreHolderViewOooOOo0.f27778OooOO0o;
        Intrinsics.checkNotNullExpressionValue(photoView, "it.imageView");
        if (photoView.getScale() == 1.0f) {
            OooOo0o().f59456OooO0OO.getBackground().setAlpha(255);
            ((p116o00O0OOo.OooOOO) this.f26266OooOooo.getValue()).getClass();
            photoView.setTranslationY(0.0f);
            photoView.setScaleY(1.0f);
            photoView.setScaleX(1.0f);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        OooOoO();
    }

    @Override // com.yalla.yalla.base.activity.BaseFixOrientationActivity, com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m4213constructorimpl(Boolean.valueOf(requestWindowFeature(1)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        o000OO00.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(o0000.OooO00o(oO00O0o.transparent));
        setContentView(OooOo0o().f59454OooO00o);
        this.f26254OooOOoo = getIntent().getIntExtra("image_index", 0);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("image_url_list");
        ArrayList<String> arrayList = this.f26253OooOOo0;
        if (stringArrayListExtra != null) {
            arrayList.addAll(stringArrayListExtra);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("image_info_list");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.app.selectPicture.model.ImageLocationInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.app.selectPicture.model.ImageLocationInfo> }");
        this.f26252OooOOo.addAll((ArrayList) serializableExtra);
        this.f26255OooOo = getIntent().getBooleanExtra("IsHeadUrl", false);
        String stringExtra = getIntent().hasExtra("Image_WatermarkText") ? getIntent().getStringExtra("Image_WatermarkText") : "";
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f26259OooOo0o = o0000O.OooO00o(getString(oO00OOo0.single_Yalla_ID), stringExtra);
        }
        if (arrayList.isEmpty() || this.f26254OooOOoo >= arrayList.size()) {
            finish();
        } else {
            LiveEventBus.get("EVENTMSG_ShowImageBitmap").observeSticky(this, new o0OO00o0(this));
            if (!p382o0OOoo0o.o00Ooo.OooO0o0()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    p592o0oo00O.OooOOO0.OooO0O0("ImageUrl_[" + i + "]:" + ((Object) arrayList.get(i)));
                }
            }
        }
        if (this.f26255OooOo) {
            OooOo0o().f59455OooO0O0.setVisibility(8);
        } else {
            OooOo0o().f59455OooO0O0.setVisibility(0);
        }
        HackyViewPager hackyViewPager = OooOo0o().f59458OooO0o0;
        p116o00O0OOo.OooOOO oooOOO = (p116o00O0OOo.OooOOO) this.f26266OooOooo.getValue();
        o0OO0 o0oo1 = new o0OO0(this);
        oooOOO.f36570OooO0o0 = false;
        oooOOO.f36569OooO0Oo = o0oo1;
        hackyViewPager.setTouchManage(oooOOO);
        OooOo0o().f59458OooO0o0.setGestureDetector(new GestureDetector(this, new o0OO0O0(this)));
        OooOo0o().f59458OooO0o0.OooO0O0(new o0OOooO0(this));
        OooOo0o().f59455OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o00O0.oo0oO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ShowImageActivity.f26251Oooo00o;
                ShowImageActivity this$0 = this.f48226OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String str = this$0.f26253OooOOo0.get(this$0.OooOo0o().f59458OooO0o0.getCurrentItem());
                Intrinsics.checkNotNullExpressionValue(str, "mImageUrlList[bind.viewPager.currentItem]");
                this$0.OooOo(str, false);
            }
        });
        OooOo0o().f59458OooO0o0.setAdapter(OooOoO0());
        OooOo0o().f59458OooO0o0.setCurrentItem(this.f26254OooOOoo);
        OooOoO0().f49727OooO0oo = this.f26261OooOoO0;
        if (OooOoO0().OooO0OO() > 1) {
            OooOo0o().f59457OooO0Oo.setText((this.f26254OooOOoo + 1) + "/" + OooOoO0().OooO0OO());
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        float f;
        float fOooO0OO;
        super.onResume();
        if (this.f26258OooOo0O) {
            ArrayList<ImageLocationInfo> arrayList = this.f26252OooOOo;
            if (arrayList.size() > this.f26254OooOOoo) {
                Lazy lazy = this.f26256OooOo0;
                p117o00O0Oo.OooOOOO oooOOOO = (p117o00O0Oo.OooOOOO) lazy.getValue();
                HackyViewPager hackyViewPager = OooOo0o().f59458OooO0o0;
                float fOooO0O0 = p117o00O0Oo.OooOo00.OooO0O0(this, arrayList.get(this.f26254OooOOoo));
                ImageLocationInfo imageLocationInfo = arrayList.get(this.f26254OooOOoo);
                oooOOOO.getClass();
                int i = imageLocationInfo.f9783OooO0o0;
                int i2 = imageLocationInfo.f9781OooO0Oo;
                int i3 = imageLocationInfo.f9782OooO0o;
                int i4 = imageLocationInfo.f9784OooO0oO;
                Context context = oooOOOO.f36575OooO00o;
                float f2 = i;
                float f3 = i2;
                if ((f2 * 1.0f) / f3 >= (p117o00O0Oo.OooOo00.OooO0Oo(context) * 1.0f) / p117o00O0Oo.OooOo00.OooO0OO(context)) {
                    float f4 = i3;
                    float f5 = 1.0f - fOooO0O0;
                    f = f4 / f5;
                    fOooO0OO = (i4 - (((p117o00O0Oo.OooOo00.OooO0OO(context) * fOooO0O0) - f3) / 2.0f)) / f5;
                } else {
                    float fOooO0Oo = i3 - (((p117o00O0Oo.OooOo00.OooO0Oo(context) * fOooO0O0) - f2) / 2.0f);
                    float f6 = 1.0f - fOooO0O0;
                    f = fOooO0Oo / f6;
                    fOooO0OO = i4 / f6;
                }
                hackyViewPager.setPivotX(f);
                hackyViewPager.setPivotY(fOooO0OO);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(hackyViewPager, (Property<HackyViewPager, Float>) View.SCALE_X, fOooO0O0, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(hackyViewPager, (Property<HackyViewPager, Float>) View.SCALE_Y, fOooO0O0, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.setDuration(300L);
                animatorSet.start();
                animatorSet.addListener(this.f26264OooOoo0);
                p117o00O0Oo.OooOOOO oooOOOO2 = (p117o00O0Oo.OooOOOO) lazy.getValue();
                ConstraintLayout constraintLayout = OooOo0o().f59456OooO0OO;
                float fOooO0O1 = p117o00O0Oo.OooOo00.OooO0O0(this, arrayList.get(this.f26254OooOOoo));
                oooOOOO2.getClass();
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(300L);
                valueAnimator.setFloatValues(fOooO0O1, 1.0f);
                valueAnimator.addUpdateListener(new p117o00O0Oo.OooOOO(constraintLayout));
                valueAnimator.start();
            } else {
                OooOo0o().f59456OooO0OO.setBackgroundColor(Color.parseColor(p117o00O0Oo.OooOo00.OooO00o(oO00O0o.black)));
                OooOo0o().f59456OooO0OO.getBackground().setAlpha(255);
            }
            this.f26258OooOo0O = false;
        }
    }
}
