package com.yalla.yalla.ui.activity.moment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Property;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.o00000O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.adapter.showImageUrlMore.ShowImageUrlMoreHolderView;
import com.app.base.base.activity.BaseFixOrientationActivity;
import com.app.selectPicture.model.ImageLocationInfo;
import com.app.selectPicture.view.HackyViewPager;
import com.app.selectPicture.view.photoview.PhotoView;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032OoooO0.o0O000Oo;
import p074o000O0oo.OooOOO;
import p135o00OO0o0.o00OOOO0;
import p139o00OOOo0.o00O0OO;
import p190o00o00oo.o000000O;
import p199o00o0Oo.oOO00O;
import p206o00o0o0o.o000O0;
import p206o00o0o0o.o000O0Oo;
import p206o00o0o0o.o000OO0O;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p478o0OooooO.oO0OoOO0;
import p487o0o000oO.o0OOO0o;
import p494o0o00OO0.OooO0o;
import p501o0o00o.o0000oo;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O0;
import p538o0o0Oo0.o0;
import p538o0o0Oo0.o0O0o;
import p538o0o0Oo0.o0oOOo;
import p538o0o0Oo0.oo00oO;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;
import p649o0ooOOoo.uc;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/ShowImageActivity;", "Lcom/app/base/base/activity/BaseFixOrientationActivity;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ShowImageActivity extends BaseFixOrientationActivity {

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22515o00o0O = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f22518OoooOoo;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public String f22522OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f22523OooooOo;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f22529o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f22531o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public float f22532ooOO;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList<String> f22516OoooOo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final ArrayList<ImageLocationInfo> f22517OoooOoO = new ArrayList<>();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f22519Ooooo00 = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22520Ooooo0o = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f22521OooooO0 = true;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public ArrayList<Bitmap> f22525Oooooo0 = new ArrayList<>();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22524Oooooo = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public final OooO0OO f22526OoooooO = new OooO0OO();

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public final OooOO0O f22527Ooooooo = new OooOO0O();

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    @NotNull
    public final Lazy f22528o00O0O = LazyKt.lazy(OooOOO0.f22538Oooo0o);

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22530o00Ooo = LazyKt.lazy(new OooOO0());

    public static final class OooO extends Lambda implements Function0<o000O0Oo> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O0Oo invoke() {
            return new o000O0Oo(ShowImageActivity.this.getApplicationContext());
        }
    }

    public static final class OooO00o {
        @JvmStatic
        public final void OooO00o(@NotNull Activity activity, int i, @Nullable ArrayList<String> arrayList, @Nullable ArrayList<ImageView> arrayList2, @Nullable String str, boolean z) {
            Rect rect;
            Intrinsics.checkNotNullParameter(activity, "activity");
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (arrayList2 != null) {
                for (ImageView imageView : arrayList2) {
                    ImageLocationInfo imageLocationInfo = new ImageLocationInfo();
                    if (imageView == null || imageView.getDrawable() == null) {
                        rect = null;
                    } else {
                        Drawable drawable = imageView.getDrawable();
                        rect = new Rect();
                        imageView.getGlobalVisibleRect(rect);
                        Rect bounds = drawable.getBounds();
                        Matrix imageMatrix = imageView.getImageMatrix();
                        float[] fArr = new float[9];
                        if (imageMatrix != null) {
                            imageMatrix.getValues(fArr);
                        }
                        int i2 = rect.left + ((int) fArr[2]);
                        rect.left = i2;
                        rect.top += (int) fArr[5];
                        rect.right = (int) ((bounds.width() * (fArr[0] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1.0f : fArr[0])) + i2);
                        rect.bottom = (int) ((bounds.height() * (fArr[4] != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? fArr[4] : 1.0f)) + rect.top);
                    }
                    if (rect != null) {
                        imageLocationInfo.f12314Oooo0o = rect.height();
                        imageLocationInfo.f12315Oooo0oO = rect.width();
                        imageLocationInfo.f12316Oooo0oo = rect.left;
                        imageLocationInfo.f12313Oooo = rect.top;
                    }
                    arrayList3.add(imageLocationInfo);
                    Drawable drawable2 = imageView.getDrawable();
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
            }
            LiveEventBus.get("EVENTMSG_ShowImageBitmap").post(arrayList4);
            if (arrayList != null && !o0OOO0o.OooO0OO()) {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    stringBuffer.append('\n' + it.next());
                }
                o00O00.OooO0O0("ShowImageUrls : " + ((Object) stringBuffer));
            }
            Intent intent = new Intent(activity, (Class<?>) ShowImageActivity.class);
            intent.putExtra("image_index", i);
            intent.putExtra("image_url_list", arrayList);
            intent.putExtra("image_info_list", arrayList3);
            intent.putExtra("IsHeadUrl", z);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra("Image_WatermarkText", str);
            }
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }

        @JvmStatic
        public final void OooO0O0(@NotNull Activity activity, @NotNull String imageUrl, @NotNull ImageView imageView, @Nullable String str, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(imageView, "imageView");
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(imageUrl);
            ArrayList<ImageView> arrayList2 = new ArrayList<>();
            arrayList2.add(imageView);
            OooO00o(activity, 0, arrayList, arrayList2, str, z);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<uc> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final uc invoke() {
            uc ucVarInflate = uc.inflate(LayoutInflater.from(ShowImageActivity.this));
            Intrinsics.checkNotNullExpressionValue(ucVarInflate, "inflate(LayoutInflater.from(this))");
            return ucVarInflate;
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
            ShowImageActivity.this.finish();
            ShowImageActivity.this.overridePendingTransition(0, 0);
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

    public static final class OooO0o extends Lambda implements Function0<o00OOOO0> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OOOO0 invoke() {
            ShowImageActivity showImageActivity = ShowImageActivity.this;
            return new o00OOOO0(showImageActivity, showImageActivity.f22516OoooOo0);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o00O0OO> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0OO invoke() {
            o00O0OO o00o0oo2 = new o00O0OO(ShowImageActivity.this);
            final ShowImageActivity showImageActivity = ShowImageActivity.this;
            o00o0oo2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o0Oo0.o0O00000
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ShowImageActivity this$0 = showImageActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    this$0.f22529o00Oo0 = false;
                    this$0.OooOoo().f50708OooO0o0.setCanScroll(true);
                }
            });
            return o00o0oo2;
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

    public static final class OooOOO0 extends Lambda implements Function0<oOO00O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f22538Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOO00O invoke() {
            return new oOO00O();
        }
    }

    public static final void OooOoOO(ShowImageActivity showImageActivity, MotionEvent event, float f) {
        if (showImageActivity.f22529o00Oo0) {
            showImageActivity.Oooo0O0();
            return;
        }
        ShowImageUrlMoreHolderView showImageUrlMoreHolderViewOooOOOo = showImageActivity.OooOooo().OooOOOo(Integer.valueOf(showImageActivity.f22518OoooOoo));
        Intrinsics.checkNotNullExpressionValue(showImageUrlMoreHolderViewOooOOOo, "mAdapter.getCurrentView(mCurrentIndex)");
        PhotoView photoView = showImageUrlMoreHolderViewOooOOOo.f11452OoooOO0;
        Intrinsics.checkNotNullExpressionValue(photoView, "it.imageView");
        if (photoView.getScale() == 1.0f) {
            float fAbs = 1 - Math.abs(f / p522o0o0O0o.o000O0Oo.f42986OooO0O0);
            showImageActivity.OooOoo().f50706OooO0OO.getBackground().setAlpha((int) (KotlinVersion.MAX_COMPONENT_VALUE * fAbs));
            Objects.requireNonNull(showImageActivity.Oooo00O());
            photoView.setScaleY(fAbs);
            photoView.setScaleX(fAbs);
            oOO00O ooo00oOooo00O = showImageActivity.Oooo00O();
            Objects.requireNonNull(ooo00oOooo00O);
            Intrinsics.checkNotNullParameter(event, "event");
            float y = event.getY() - ooo00oOooo00O.f33217OooO0OO;
            photoView.setTranslationY(y);
            showImageActivity.f22532ooOO = y;
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final boolean OooOo0() {
        return false;
    }

    public final uc OooOoo() {
        return (uc) this.f22524Oooooo.getValue();
    }

    public final void OooOoo0(String str) {
        o00O00.OooO0O0("downloadImage urlImage = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o000000O o000000oOooO0OO = o0O000Oo.OooO0OO(p494o0o00OO0.OooO0o.f41155OooO00o.OooO0Oo());
        o000000oOooO0OO.f33055OooO0Oo = new p179o00o0.o00O0O() { // from class: o0o0Oo0.o0O00o0
            @Override // p179o00o0.o00O0O
            public final void result(boolean z, Object obj) {
                String str2 = (String) obj;
                ShowImageActivity.OooO00o oooO00o = ShowImageActivity.f22515o00o0O;
                if (!z || str2 == null) {
                    return;
                }
                String strValueOf = String.valueOf(OooO0o.f41155OooO00o.OooO0o(new File(str2)));
                if ((strValueOf.length() == 0) || Intrinsics.areEqual("null", o00O0.OooO0o(strValueOf))) {
                    return;
                }
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (StringsKt.isBlank(strValueOf)) {
                    return;
                }
                o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strValueOf, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o0o0oooOooO0O0.run();
                } else {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                }
            }
        };
        o000000oOooO0OO.OooO0O0(str);
    }

    public final void OooOooO(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strImgFormat = CloudImageUtilKt.imgFormat(str);
        String str2 = this.f22522OooooOO;
        if (str2 != null) {
            strImgFormat = CloudImageUtilKt.imgWaterMark(str, str2);
        }
        if (isDestroyed() || isFinishing()) {
            return;
        }
        if (!z) {
            Oooo0(strImgFormat);
            return;
        }
        o00O0OO o00o0oo2 = (o00O0OO) this.f22530o00Ooo.getValue();
        o00o0oo2.f32154Oooo0oo = new com.facebook.login.OooOO0O(this, strImgFormat);
        o00o0oo2.show();
        OooOoo().f50708OooO0o0.setCanScroll(false);
        this.f22529o00Oo0 = true;
        Oooo0O0();
    }

    public final o00OOOO0 OooOooo() {
        return (o00OOOO0) this.f22519Ooooo00.getValue();
    }

    public final void Oooo0(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            OooOoo0(str);
        } else {
            o0O0O00.OooO0OO(this, oo0o0Oo.f48608OooO0OO, null, new oo00oO(this, str));
        }
    }

    public final o000O0Oo Oooo000() {
        return (o000O0Oo) this.f22520Ooooo0o.getValue();
    }

    public final oOO00O Oooo00O() {
        return (oOO00O) this.f22528o00O0O.getValue();
    }

    public final void Oooo00o() {
        float f;
        float fOooO0Oo;
        OooOoo().f50706OooO0OO.getBackground().setAlpha(127);
        if (this.f22517OoooOoO.size() <= this.f22518OoooOoo) {
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        o000O0Oo o000o0ooOooo000 = Oooo000();
        PhotoView photoView = OooOooo().OooOOOo(Integer.valueOf(this.f22518OoooOoo)).f11452OoooOO0;
        float fOooO0O0 = o000OO0O.OooO0O0(this, this.f22517OoooOoO.get(this.f22518OoooOoo));
        ImageLocationInfo imageLocationInfo = this.f22517OoooOoO.get(this.f22518OoooOoo);
        OooO0OO oooO0OO = this.f22526OoooooO;
        Objects.requireNonNull(o000o0ooOooo000);
        int i = imageLocationInfo.f12315Oooo0oO;
        int i2 = imageLocationInfo.f12314Oooo0o;
        int i3 = imageLocationInfo.f12316Oooo0oo;
        int i4 = imageLocationInfo.f12313Oooo;
        float f2 = i;
        float f3 = i2;
        if ((f2 * 1.0f) / f3 >= o000OO0O.OooO0o0(o000o0ooOooo000.f33255OooO00o)) {
            float f4 = 1.0f - fOooO0O0;
            f = i3 / f4;
            fOooO0Oo = (i4 - (((o000OO0O.OooO0Oo(o000o0ooOooo000.f33255OooO00o) * fOooO0O0) - f3) / 2.0f)) / f4;
        } else {
            float fOooO0o = i3 - (((o000OO0O.OooO0o(o000o0ooOooo000.f33255OooO00o) * fOooO0O0) - f2) / 2.0f);
            float f5 = 1.0f - fOooO0O0;
            f = fOooO0o / f5;
            fOooO0Oo = i4 / f5;
        }
        photoView.setPivotX(f);
        photoView.setPivotY(fOooO0Oo);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.SCALE_X, photoView.getScaleX(), fOooO0O0);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.SCALE_Y, photoView.getScaleY(), fOooO0O0);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.TRANSLATION_X, (((1.0f - photoView.getScaleX()) * (o000OO0O.OooO0o(o000o0ooOooo000.f33255OooO00o) / 2)) - ((1.0f - photoView.getScaleX()) * photoView.getPivotX())) + photoView.getTranslationX(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(photoView, (Property<PhotoView, Float>) View.TRANSLATION_Y, (((1.0f - photoView.getScaleY()) * (o000OO0O.OooO0Oo(o000o0ooOooo000.f33255OooO00o) / 2)) - ((1.0f - photoView.getScaleY()) * photoView.getPivotY())) + photoView.getTranslationY(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        animatorSet.setDuration(300L);
        animatorSet.start();
        animatorSet.addListener(oooO0OO);
    }

    public final void Oooo0O0() {
        ShowImageUrlMoreHolderView showImageUrlMoreHolderViewOooOOOo = OooOooo().OooOOOo(Integer.valueOf(this.f22518OoooOoo));
        Intrinsics.checkNotNullExpressionValue(showImageUrlMoreHolderViewOooOOOo, "mAdapter.getCurrentView(mCurrentIndex)");
        PhotoView photoView = showImageUrlMoreHolderViewOooOOOo.f11452OoooOO0;
        Intrinsics.checkNotNullExpressionValue(photoView, "it.imageView");
        if (photoView.getScale() == 1.0f) {
            OooOoo().f50706OooO0OO.getBackground().setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            Objects.requireNonNull(Oooo00O());
            photoView.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            photoView.setScaleY(1.0f);
            photoView.setScaleX(1.0f);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Oooo00o();
    }

    @Override // com.app.base.base.activity.BaseFixOrientationActivity, com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        setContentView(OooOoo().f50704OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        this.f22518OoooOoo = getIntent().getIntExtra("image_index", 0);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("image_url_list");
        if (stringArrayListExtra != null) {
            this.f22516OoooOo0.addAll(stringArrayListExtra);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("image_info_list");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.app.selectPicture.model.ImageLocationInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.app.selectPicture.model.ImageLocationInfo> }");
        this.f22517OoooOoO.addAll((ArrayList) serializableExtra);
        this.f22523OooooOo = getIntent().getBooleanExtra("IsHeadUrl", false);
        String stringExtra = getIntent().hasExtra("Image_WatermarkText") ? getIntent().getStringExtra("Image_WatermarkText") : "";
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f22522OooooOO = com.yalla.support.common.util.OooOo.OooO00o(getString(R.string.single_Yalla_ID), stringExtra);
        }
        if (this.f22516OoooOo0.isEmpty() || this.f22518OoooOoo >= this.f22516OoooOo0.size()) {
            finish();
        } else {
            LiveEventBus.get("EVENTMSG_ShowImageBitmap").observeSticky(this, new o0000oo(this, 4));
            if (!o0OOO0o.OooO0OO()) {
                int size = this.f22516OoooOo0.size();
                for (int i = 0; i < size; i++) {
                    StringBuilder sbOooO00o = o00000O0.OooO00o("ImageUrl_[", i, "]:");
                    sbOooO00o.append(this.f22516OoooOo0.get(i));
                    o00O00.OooO0O0(sbOooO00o.toString());
                }
            }
        }
        if (this.f22523OooooOo) {
            OooOoo().f50705OooO0O0.setVisibility(8);
        } else {
            OooOoo().f50705OooO0O0.setVisibility(0);
        }
        HackyViewPager hackyViewPager = OooOoo().f50708OooO0o0;
        oOO00O ooo00oOooo00O = Oooo00O();
        o0oOOo o0oooo2 = new o0oOOo(this);
        ooo00oOooo00O.f33219OooO0o0 = false;
        ooo00oOooo00O.f33218OooO0Oo = o0oooo2;
        hackyViewPager.setTouchManage(ooo00oOooo00O);
        OooOoo().f50708OooO0o0.setGestureDetector(new GestureDetector(this, new o0O0o(this)));
        OooOoo().f50708OooO0o0.OooO0O0(new o0(this));
        OooOoo().f50705OooO0O0.setOnClickListener(new o00OO0O.OooO0o(this, 3));
        OooOoo().f50708OooO0o0.setAdapter(OooOooo());
        OooOoo().f50708OooO0o0.setCurrentItem(this.f22518OoooOoo);
        OooOooo().f31641OooO0oo = this.f22525Oooooo0;
        if (OooOooo().OooO0OO() > 1) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o0.append(this.f22518OoooOoo + 1);
            sbOooO0o0.append('/');
            sbOooO0o0.append(OooOooo().OooO0OO());
            OooOoo().f50707OooO0Oo.setText(sbOooO0o0.toString());
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        float f;
        float fOooO0Oo;
        super.onResume();
        if (this.f22521OooooO0) {
            if (this.f22517OoooOoO.size() > this.f22518OoooOoo) {
                o000O0Oo o000o0ooOooo000 = Oooo000();
                HackyViewPager hackyViewPager = OooOoo().f50708OooO0o0;
                float fOooO0O0 = o000OO0O.OooO0O0(this, this.f22517OoooOoO.get(this.f22518OoooOoo));
                ImageLocationInfo imageLocationInfo = this.f22517OoooOoO.get(this.f22518OoooOoo);
                OooOO0O oooOO0O = this.f22527Ooooooo;
                Objects.requireNonNull(o000o0ooOooo000);
                int i = imageLocationInfo.f12315Oooo0oO;
                int i2 = imageLocationInfo.f12314Oooo0o;
                int i3 = imageLocationInfo.f12316Oooo0oo;
                int i4 = imageLocationInfo.f12313Oooo;
                float f2 = i;
                float f3 = i2;
                if ((f2 * 1.0f) / f3 >= o000OO0O.OooO0o0(o000o0ooOooo000.f33255OooO00o)) {
                    float f4 = i3;
                    float f5 = 1.0f - fOooO0O0;
                    f = f4 / f5;
                    fOooO0Oo = (i4 - (((o000OO0O.OooO0Oo(o000o0ooOooo000.f33255OooO00o) * fOooO0O0) - f3) / 2.0f)) / f5;
                } else {
                    float fOooO0o = i3 - (((o000OO0O.OooO0o(o000o0ooOooo000.f33255OooO00o) * fOooO0O0) - f2) / 2.0f);
                    float f6 = 1.0f - fOooO0O0;
                    f = fOooO0o / f6;
                    fOooO0Oo = i4 / f6;
                }
                hackyViewPager.setPivotX(f);
                hackyViewPager.setPivotY(fOooO0Oo);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(hackyViewPager, (Property<HackyViewPager, Float>) View.SCALE_X, fOooO0O0, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(hackyViewPager, (Property<HackyViewPager, Float>) View.SCALE_Y, fOooO0O0, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet.setDuration(300L);
                animatorSet.start();
                animatorSet.addListener(oooOO0O);
                o000O0Oo o000o0ooOooo001 = Oooo000();
                FrameLayout frameLayout = OooOoo().f50706OooO0OO;
                float fOooO0O1 = o000OO0O.OooO0O0(this, this.f22517OoooOoO.get(this.f22518OoooOoo));
                Objects.requireNonNull(o000o0ooOooo001);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(300L);
                valueAnimator.setFloatValues(fOooO0O1, 1.0f);
                valueAnimator.addUpdateListener(new o000O0(frameLayout));
                valueAnimator.start();
            } else {
                OooOoo().f50706OooO0OO.setBackgroundColor(Color.parseColor(o000OO0O.OooO00o(2.13109965E9f)));
                OooOoo().f50706OooO0OO.getBackground().setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            }
            this.f22521OooooO0 = false;
        }
    }
}
