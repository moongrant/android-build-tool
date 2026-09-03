package com.yalla.yalla.ui.activity.moment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
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
import androidx.core.view.o00oOoo;
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
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO;
import p423o0OoO0OO.o000O000;
import p492o0o00OO0.o0O0oo00;
import p492o0o00OO0.o0OO000o;
import p492o0o00OO0.o0OO00OO;
import p492o0o00OO0.o0OO00o0;
import p492o0o00OO0.o0oOo0O0;
import p492o0o00OO0.oo0oO0;
import p492o0o00OO0.oo0ooO;
import p598o0oo00Oo.o0000O00;
import p650o0ooo.x2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/ShowImageActivity;", "Lcom/yalla/yalla/base/activity/BaseFixOrientationActivity;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ShowImageActivity extends BaseFixOrientationActivity {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final /* synthetic */ int f25802Oooo00o = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f25805OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f25806OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public String f25810OooOo0o;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f25814OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f25816OooOooO;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f25818Oooo000;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f25804OooOOo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList<ImageLocationInfo> f25803OooOOo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f25808OooOo00 = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25807OooOo0 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f25809OooOo0O = true;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public ArrayList<Bitmap> f25812OooOoO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f25811OooOoO = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f25813OooOoOO = new OooO0OO();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final OooOO0O f25815OooOoo0 = new OooOO0O();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final Lazy f25817OooOooo = LazyKt.lazy(OooOOO0.f25825OooO0Oo);

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f25819Oooo00O = LazyKt.lazy(new OooOO0());

    public static final class OooO extends Lambda implements Function0<p143o00OOooo.OooOo00> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p143o00OOooo.OooOo00 invoke() {
            return new p143o00OOooo.OooOo00(ShowImageActivity.this.getApplicationContext());
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
                    imageLocationInfo.f12872OooO0Oo = rect.height();
                    imageLocationInfo.f12874OooO0o0 = rect.width();
                    imageLocationInfo.f12873OooO0o = rect.left;
                    imageLocationInfo.f12875OooO0oO = rect.top;
                }
                arrayList3.add(imageLocationInfo);
                Drawable drawable2 = imageView2.getDrawable();
                Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                Intrinsics.checkNotNullParameter(drawable2, "drawable");
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = drawable2.getIntrinsicHeight();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable2.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable2.draw(canvas);
                arrayList4.add(bitmapCreateBitmap);
            }
            LiveEventBus.get("EVENTMSG_ShowImageBitmap").post(arrayList4);
            if (!p386o0OOooO.oo0o0Oo.OooO0o0()) {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append("\n" + ((String) it.next()));
                }
                o0000O00.OooO0O0("ShowImageUrls : " + ((Object) stringBuffer));
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

    public static final class OooO0O0 extends Lambda implements Function0<oO> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO invoke() {
            oO oOVarInflate = oO.inflate(LayoutInflater.from(ShowImageActivity.this));
            Intrinsics.checkNotNullExpressionValue(oOVarInflate, "inflate(...)");
            return oOVarInflate;
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

    public static final class OooO0o extends Lambda implements Function0<p515o0o0O00O.o0ooOOo> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p515o0o0O00O.o0ooOOo invoke() {
            ShowImageActivity showImageActivity = ShowImageActivity.this;
            return new p515o0o0O00O.o0ooOOo(showImageActivity, showImageActivity.f25804OooOOo0);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<x2> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final x2 invoke() {
            ShowImageActivity showImageActivity = ShowImageActivity.this;
            x2 x2Var = new x2(showImageActivity);
            x2Var.setOnDismissListener(new o0OO00o0(showImageActivity, 0));
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

    public static final class OooOOO0 extends Lambda implements Function0<p140o00OOOoO.OooO0o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f25825OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p140o00OOOoO.OooO0o invoke() {
            return new p140o00OOOoO.OooO0o();
        }
    }

    public static final void OooOo0O(ShowImageActivity showImageActivity, MotionEvent event, float f) {
        if (showImageActivity.f25818Oooo000) {
            showImageActivity.OooOoOO();
            return;
        }
        ShowImageUrlMoreHolderView showImageUrlMoreHolderViewOooOOo0 = showImageActivity.OooOoO0().OooOOo0(Integer.valueOf(showImageActivity.f25805OooOOoo));
        Intrinsics.checkNotNullExpressionValue(showImageUrlMoreHolderViewOooOOo0, "getCurrentView(...)");
        PhotoView imageView = showImageUrlMoreHolderViewOooOOo0.f27316OooOO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        if (imageView.getScale() == 1.0f) {
            float fAbs = 1 - Math.abs(f / o000O000.f46651OooO0O0);
            showImageActivity.OooOo0o().f44716OooO0OO.getBackground().setAlpha((int) (255 * fAbs));
            Lazy lazy = showImageActivity.f25817OooOooo;
            ((p140o00OOOoO.OooO0o) lazy.getValue()).getClass();
            imageView.setScaleY(fAbs);
            imageView.setScaleX(fAbs);
            p140o00OOOoO.OooO0o oooO0o = (p140o00OOOoO.OooO0o) lazy.getValue();
            oooO0o.getClass();
            Intrinsics.checkNotNullParameter(event, "event");
            float y = event.getY() - oooO0o.f37510OooO0OO;
            imageView.setTranslationY(y);
            showImageActivity.f25816OooOooO = y;
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
        final String strOooO0Oo = p184o00o00O0.OooO0OO.OooO0Oo(str);
        String content = this.f25810OooOo0o;
        if (content != null) {
            Intrinsics.checkNotNullParameter(content, "content");
            if (str != null) {
                String strOooO0Oo2 = p184o00o00O0.OooO0OO.OooO0Oo(str);
                if (!StringsKt__StringsKt.contains$default(strOooO0Oo2, "?watermark/2", false, 2, (Object) null)) {
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
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(this, PermissionGroupReveal.f32340OooO0o0, null, new o0OO000o(this, strOooO0Oo));
            return;
        }
        x2 x2Var = (x2) this.f25819Oooo00O.getValue();
        x2Var.f43649OooO0o = new p400o0Oo0O0.OooOOO0() { // from class: o0o00OO0.o0O
            @Override // p400o0Oo0O0.OooOOO0
            public final void OooO00o(int i, Object obj, Object obj2) {
                AbsListenerTag absListenerTag = (AbsListenerTag) obj2;
                int i2 = ShowImageActivity.f25802Oooo00o;
                ShowImageActivity this$0 = this.f49201OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String finalOriginalImage = strOooO0Oo;
                Intrinsics.checkNotNullParameter(finalOriginalImage, "$finalOriginalImage");
                if (absListenerTag == AbsListenerTag.Ok) {
                    String string = Uri.parse(finalOriginalImage).toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    this$0.getClass();
                    OooO00o.OooO0OO(this$0, PermissionGroupReveal.f32340OooO0o0, null, new o0OO000o(this$0, string));
                }
            }
        };
        x2Var.show();
        OooOo0o().f44718OooO0o0.setCanScroll(false);
        this.f25818Oooo000 = true;
        OooOoOO();
    }

    public final oO OooOo0o() {
        return (oO) this.f25811OooOoO.getValue();
    }

    public final void OooOoO() {
        float f;
        float fOooO0Oo;
        OooOo0o().f44716OooO0OO.getBackground().setAlpha(127);
        ArrayList<ImageLocationInfo> arrayList = this.f25803OooOOo;
        if (arrayList.size() <= this.f25805OooOOoo) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        p143o00OOooo.OooOo00 oooOo00 = (p143o00OOooo.OooOo00) this.f25807OooOo0.getValue();
        PhotoView photoView = OooOoO0().OooOOo0(Integer.valueOf(this.f25805OooOOoo)).f27316OooOO0o;
        float fOooO0OO = com.google.gson.internal.OooO0o.OooO0OO(this, arrayList.get(this.f25805OooOOoo));
        ImageLocationInfo imageLocationInfo = arrayList.get(this.f25805OooOOoo);
        oooOo00.getClass();
        int i = imageLocationInfo.f12874OooO0o0;
        int i2 = imageLocationInfo.f12872OooO0Oo;
        int i3 = imageLocationInfo.f12873OooO0o;
        int i4 = imageLocationInfo.f12875OooO0oO;
        Context context = oooOo00.f37529OooO00o;
        float f2 = i;
        float f3 = i2;
        if ((f2 * 1.0f) / f3 >= (com.google.gson.internal.OooO0o.OooO0o0(context) * 1.0f) / com.google.gson.internal.OooO0o.OooO0Oo(context)) {
            float f4 = 1.0f - fOooO0OO;
            f = i3 / f4;
            fOooO0Oo = (i4 - (((com.google.gson.internal.OooO0o.OooO0Oo(context) * fOooO0OO) - f3) / 2.0f)) / f4;
        } else {
            float fOooO0o0 = i3 - (((com.google.gson.internal.OooO0o.OooO0o0(context) * fOooO0OO) - f2) / 2.0f);
            float f5 = 1.0f - fOooO0OO;
            f = fOooO0o0 / f5;
            fOooO0Oo = i4 / f5;
        }
        photoView.setPivotX(f);
        photoView.setPivotY(fOooO0Oo);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.SCALE_X, photoView.getScaleX(), fOooO0OO);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.SCALE_Y, photoView.getScaleY(), fOooO0OO);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.TRANSLATION_X, (((1.0f - photoView.getScaleX()) * (com.google.gson.internal.OooO0o.OooO0o0(context) / 2)) - ((1.0f - photoView.getScaleX()) * photoView.getPivotX())) + photoView.getTranslationX(), 0.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.TRANSLATION_Y, (((1.0f - photoView.getScaleY()) * (com.google.gson.internal.OooO0o.OooO0Oo(context) / 2)) - ((1.0f - photoView.getScaleY()) * photoView.getPivotY())) + photoView.getTranslationY(), 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.setDuration(300L);
        animatorSet.start();
        animatorSet.addListener(this.f25813OooOoOO);
    }

    public final p515o0o0O00O.o0ooOOo OooOoO0() {
        return (p515o0o0O00O.o0ooOOo) this.f25808OooOo00.getValue();
    }

    public final void OooOoOO() {
        ShowImageUrlMoreHolderView showImageUrlMoreHolderViewOooOOo0 = OooOoO0().OooOOo0(Integer.valueOf(this.f25805OooOOoo));
        Intrinsics.checkNotNullExpressionValue(showImageUrlMoreHolderViewOooOOo0, "getCurrentView(...)");
        PhotoView imageView = showImageUrlMoreHolderViewOooOOo0.f27316OooOO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        if (imageView.getScale() == 1.0f) {
            OooOo0o().f44716OooO0OO.getBackground().setAlpha(255);
            ((p140o00OOOoO.OooO0o) this.f25817OooOooo.getValue()).getClass();
            imageView.setTranslationY(0.0f);
            imageView.setScaleY(1.0f);
            imageView.setScaleX(1.0f);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        OooOoO();
    }

    @Override // com.yalla.yalla.base.activity.BaseFixOrientationActivity, com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        overridePendingTransition(0, 0);
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m4215constructorimpl(Boolean.valueOf(requestWindowFeature(1)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
        o00oOoo.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(o0000.OooO00o(p562o0oOo000.o0OOO0o.transparent));
        setContentView(OooOo0o().f44714OooO00o);
        this.f25805OooOOoo = getIntent().getIntExtra("image_index", 0);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("image_url_list");
        ArrayList<String> arrayList = this.f25804OooOOo0;
        if (stringArrayListExtra != null) {
            arrayList.addAll(stringArrayListExtra);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("image_info_list");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.app.selectPicture.model.ImageLocationInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.app.selectPicture.model.ImageLocationInfo> }");
        this.f25803OooOOo.addAll((ArrayList) serializableExtra);
        this.f25806OooOo = getIntent().getBooleanExtra("IsHeadUrl", false);
        String stringExtra = getIntent().hasExtra("Image_WatermarkText") ? getIntent().getStringExtra("Image_WatermarkText") : "";
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f25810OooOo0o = o0000O.OooO00o(getString(p562o0oOo000.o000000.single_Yalla_ID), stringExtra);
        }
        if (arrayList.isEmpty() || this.f25805OooOOoo >= arrayList.size()) {
            finish();
        } else {
            LiveEventBus.get("EVENTMSG_ShowImageBitmap").observeSticky(this, new o0oOo0O0(this, i));
            if (!p386o0OOooO.oo0o0Oo.OooO0o0()) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o0000O00.OooO0O0("ImageUrl_[" + i2 + "]:" + ((Object) arrayList.get(i2)));
                }
            }
        }
        if (this.f25806OooOo) {
            OooOo0o().f44715OooO0O0.setVisibility(8);
        } else {
            OooOo0o().f44715OooO0O0.setVisibility(0);
        }
        HackyViewPager hackyViewPager = OooOo0o().f44718OooO0o0;
        p140o00OOOoO.OooO0o oooO0o = (p140o00OOOoO.OooO0o) this.f25817OooOooo.getValue();
        oo0oO0 oo0oo0 = new oo0oO0(this);
        oooO0o.f37512OooO0o0 = false;
        oooO0o.f37511OooO0Oo = oo0oo0;
        hackyViewPager.setTouchManage(oooO0o);
        OooOo0o().f44718OooO0o0.setGestureDetector(new GestureDetector(this, new oo0ooO(this)));
        OooOo0o().f44718OooO0o0.OooO0O0(new o0OO00OO(this));
        OooOo0o().f44715OooO0O0.setOnClickListener(new o0O0oo00(0, this));
        OooOo0o().f44718OooO0o0.setAdapter(OooOoO0());
        OooOo0o().f44718OooO0o0.setCurrentItem(this.f25805OooOOoo);
        OooOoO0().f51092OooO0oo = this.f25812OooOoO0;
        if (OooOoO0().OooO0OO() > 1) {
            OooOo0o().f44717OooO0Oo.setText((this.f25805OooOOoo + 1) + "/" + OooOoO0().OooO0OO());
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        float f;
        float fOooO0Oo;
        super.onResume();
        if (this.f25809OooOo0O) {
            ArrayList<ImageLocationInfo> arrayList = this.f25803OooOOo;
            if (arrayList.size() > this.f25805OooOOoo) {
                Lazy lazy = this.f25807OooOo0;
                p143o00OOooo.OooOo00 oooOo00 = (p143o00OOooo.OooOo00) lazy.getValue();
                HackyViewPager hackyViewPager = OooOo0o().f44718OooO0o0;
                float fOooO0OO = com.google.gson.internal.OooO0o.OooO0OO(this, arrayList.get(this.f25805OooOOoo));
                ImageLocationInfo imageLocationInfo = arrayList.get(this.f25805OooOOoo);
                oooOo00.getClass();
                int i = imageLocationInfo.f12874OooO0o0;
                int i2 = imageLocationInfo.f12872OooO0Oo;
                int i3 = imageLocationInfo.f12873OooO0o;
                int i4 = imageLocationInfo.f12875OooO0oO;
                Context context = oooOo00.f37529OooO00o;
                float f2 = i;
                float f3 = i2;
                if ((f2 * 1.0f) / f3 >= (com.google.gson.internal.OooO0o.OooO0o0(context) * 1.0f) / com.google.gson.internal.OooO0o.OooO0Oo(context)) {
                    float f4 = i3;
                    float f5 = 1.0f - fOooO0OO;
                    f = f4 / f5;
                    fOooO0Oo = (i4 - (((com.google.gson.internal.OooO0o.OooO0Oo(context) * fOooO0OO) - f3) / 2.0f)) / f5;
                } else {
                    float fOooO0o0 = i3 - (((com.google.gson.internal.OooO0o.OooO0o0(context) * fOooO0OO) - f2) / 2.0f);
                    float f6 = 1.0f - fOooO0OO;
                    f = fOooO0o0 / f6;
                    fOooO0Oo = i4 / f6;
                }
                hackyViewPager.setPivotX(f);
                hackyViewPager.setPivotY(fOooO0Oo);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(hackyViewPager, (Property<HackyViewPager, Float>) View.SCALE_X, fOooO0OO, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(hackyViewPager, (Property<HackyViewPager, Float>) View.SCALE_Y, fOooO0OO, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.setDuration(300L);
                animatorSet.start();
                animatorSet.addListener(this.f25815OooOoo0);
                p143o00OOooo.OooOo00 oooOo01 = (p143o00OOooo.OooOo00) lazy.getValue();
                ConstraintLayout constraintLayout = OooOo0o().f44716OooO0OO;
                float fOooO0OO2 = com.google.gson.internal.OooO0o.OooO0OO(this, arrayList.get(this.f25805OooOOoo));
                oooOo01.getClass();
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(300L);
                valueAnimator.setFloatValues(fOooO0OO2, 1.0f);
                valueAnimator.addUpdateListener(new p143o00OOooo.OooOOOO(constraintLayout));
                valueAnimator.start();
            } else {
                OooOo0o().f44716OooO0OO.setBackgroundColor(Color.parseColor(com.google.gson.internal.OooO0o.OooO0O0(p562o0oOo000.o0OOO0o.black)));
                OooOo0o().f44716OooO0OO.getBackground().setAlpha(255);
            }
            this.f25809OooOo0O = false;
        }
    }
}
