package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p101o000oOoo.oO00OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f9525OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final boolean f9526OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f9527OooO0OO;

    public static class OooO00o implements TypeEvaluator<Matrix> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float[] f9528OooO00o = new float[9];

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f9529OooO0O0 = new float[9];

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Matrix f9530OooO0OO = new Matrix();

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f9528OooO00o);
            matrix2.getValues(this.f9529OooO0O0);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f9529OooO0O0;
                float f2 = fArr[i];
                float[] fArr2 = this.f9528OooO00o;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f9530OooO0OO.setValues(this.f9529OooO0O0);
            return this.f9530OooO0OO;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f9525OooO00o = true;
        f9526OooO0O0 = true;
        f9527OooO0OO = i >= 28;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0100  */
    public static View OooO00o(ViewGroup viewGroup, View view, View view2) {
        boolean z;
        boolean zIsAttachedToWindow;
        ViewGroup viewGroup2;
        int iIndexOfChild;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        oO00OO0O.OooO0o0(view, matrix);
        oO00OO0O.OooO0o(viewGroup, matrix);
        RectF rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (f9525OooO00o) {
            z = !view.isAttachedToWindow();
            zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        } else {
            z = false;
            zIsAttachedToWindow = false;
        }
        boolean z2 = f9526OooO0O0;
        Bitmap bitmapCreateBitmap = null;
        if (z2 && z) {
            if (zIsAttachedToWindow) {
                viewGroup2 = (ViewGroup) view.getParent();
                iIndexOfChild = viewGroup2.indexOfChild(view);
                viewGroup.getOverlay().add(view);
            }
            if (bitmapCreateBitmap != null) {
                imageView.setImageBitmap(bitmapCreateBitmap);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
            imageView.layout(iRound, iRound2, iRound3, iRound4);
            return imageView;
        }
        viewGroup2 = null;
        iIndexOfChild = 0;
        int iRound5 = Math.round(rectF.width());
        int iRound6 = Math.round(rectF.height());
        if (iRound5 > 0 && iRound6 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
            int iRound7 = Math.round(iRound5 * fMin);
            int iRound8 = Math.round(iRound6 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            if (f9527OooO0OO) {
                Picture picture = new Picture();
                Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                canvasBeginRecording.concat(matrix);
                view.draw(canvasBeginRecording);
                picture.endRecording();
                bitmapCreateBitmap = Bitmap.createBitmap(picture);
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                canvas.concat(matrix);
                view.draw(canvas);
                bitmapCreateBitmap = bitmapCreateBitmap2;
            }
        }
        if (z2 && z) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        if (bitmapCreateBitmap != null) {
            imageView.setImageBitmap(bitmapCreateBitmap);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    public static Animator OooO0O0(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
