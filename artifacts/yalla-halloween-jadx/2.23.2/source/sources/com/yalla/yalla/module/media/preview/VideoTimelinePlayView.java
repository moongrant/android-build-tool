package com.yalla.yalla.module.media.preview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.Job;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p456o0Ooo00o.oo000o;
import p460o0Ooo0o.o00O0;
import p460o0Ooo0o.o00OOOO0;
import p460o0Ooo0o.o0o0Oo;
import p460o0Ooo0o.oo00o;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003,-.B'\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rR$\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010 ¨\u0006/"}, d2 = {"Lcom/yalla/yalla/module/media/preview/VideoTimelinePlayView;", "Landroid/view/View;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setMinProgressDiff", "", "mode", "setMode", "setMaxProgressDiff", "", "show", "setShowProgress", "Lcom/yalla/yalla/module/media/preview/VideoTimelinePlayView$OooO0OO;", "delegate", "setDelegate", "<set-?>", "OooO0oO", "F", "getLeftProgress", "()F", "leftProgress", "Landroid/graphics/Paint;", "Oooo0o", "Landroid/graphics/Paint;", "getBitmapPaint", "()Landroid/graphics/Paint;", "setBitmapPaint", "(Landroid/graphics/Paint;)V", "bitmapPaint", "getProgress", "setProgress", "(F)V", "progress", "getRightProgress", "setRightProgress", "rightProgress", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "OooO0OO", "Media_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class VideoTimelinePlayView extends View {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public static final Object f24166Ooooo00 = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Paint f24167OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f24168OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f24169OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f24170OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public float leftProgress;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f24172OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f24173OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f24174OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f24175OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f24176OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f24177OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f24178OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public MediaMetadataRetriever f24179OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList<OooO00o> f24180OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public OooO0OO f24181OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooO0o f24182OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f24183OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f24184OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f24185OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f24186OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f24187OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final RectF f24188OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f24189OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f24190OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final int f24191OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f24192OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f24193OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public final Drawable f24194OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Job f24195Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final int f24196Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final Drawable f24197Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final int f24198Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final int f24199Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int f24200Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f24201Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Paint bitmapPaint;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f24203Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList<Rect> f24204Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Rect f24205Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f24206OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f24207OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f24208OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f24209OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f24210OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final int f24211OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final int f24212OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f24213OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final Rect f24214OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final Rect f24215OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int f24216o000oOoO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Bitmap f24217OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f24218OooO0O0;

        public OooO00o(@Nullable Bitmap bitmap) {
            this.f24217OooO00o = bitmap;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final File f24219OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f24220OooO0O0;

        public OooO0O0(@Nullable Uri uri) {
            String strJoinToString$default;
            String string;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            File file = oo00o.f47806OooO00o;
            if (file != null) {
                file.mkdirs();
            } else {
                file = new File(context.getApplicationContext().getCacheDir(), "edit");
                file.mkdirs();
                oo00o.f47806OooO00o = file;
            }
            this.f24219OooO00o = file;
            if (uri == null || (string = uri.toString()) == null) {
                strJoinToString$default = null;
            } else {
                int i = o00OOOO0.f47804OooO00o;
                Intrinsics.checkNotNullParameter(string, "<this>");
                if (string.length() == 0) {
                    strJoinToString$default = "";
                } else {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
                        byte[] bytes = string.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                        byte[] bArrDigest = messageDigest.digest(bytes);
                        Intrinsics.checkNotNull(bArrDigest);
                        strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) o0o0Oo.f47805OooO0Oo, 30, (Object) null);
                    } catch (NoSuchAlgorithmException unused) {
                        strJoinToString$default = "";
                    }
                }
            }
            this.f24220OooO0O0 = strJoinToString$default;
        }

        public final void OooO00o(int i, @NotNull Bitmap bitmap) {
            FileOutputStream fileOutputStream;
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            String str = this.f24220OooO0O0;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                fileOutputStream = new FileOutputStream(new File(this.f24219OooO00o, str + "_" + i));
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                    oO000o00.OooO0OO(fileOutputStream);
                } catch (Exception unused) {
                    if (fileOutputStream != null) {
                        oO000o00.OooO0OO(fileOutputStream);
                    }
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
            }
        }
    }

    public interface OooO0OO {
        void OooO00o();

        void OooO0O0();

        void OooO0OO(boolean z);

        void OooO0Oo(boolean z);

        void OooO0o0();
    }

    public static final class OooO0o extends AsyncTask<Integer, Integer, Bitmap> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f24221OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ int f24223OooO0OO;

        public OooO0o(int i) {
            this.f24223OooO0OO = i;
        }

        @Override // android.os.AsyncTask
        public final Bitmap doInBackground(Integer[] numArr) {
            File file;
            Bitmap frameAtTime;
            Bitmap bitmap;
            OooO0O0 oooO0O0;
            Integer[] objects = numArr;
            VideoTimelinePlayView videoTimelinePlayView = VideoTimelinePlayView.this;
            Intrinsics.checkNotNullParameter(objects, "objects");
            boolean z = true;
            if (objects.length == 0) {
                return null;
            }
            Integer num = objects[0];
            this.f24221OooO00o = num != null ? num.intValue() : 0;
            if (isCancelled()) {
                return null;
            }
            try {
                OooO0O0 oooO0O1 = videoTimelinePlayView.f24207OoooO0;
                int i = this.f24223OooO0OO;
                if (oooO0O1 != null) {
                    String str = oooO0O1.f24220OooO0O0;
                    if (TextUtils.isEmpty(str)) {
                        file = null;
                    } else {
                        file = new File(oooO0O1.f24219OooO00o, str + "_" + i);
                    }
                } else {
                    file = null;
                }
                if (file == null || !file.exists()) {
                    z = false;
                }
                if (z) {
                    frameAtTime = BitmapFactory.decodeFile(file.getAbsolutePath());
                } else {
                    MediaMetadataRetriever mediaMetadataRetriever = videoTimelinePlayView.f24179OooOOOo;
                    Intrinsics.checkNotNull(mediaMetadataRetriever);
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(videoTimelinePlayView.f24185OooOo00 * ((long) i) * ((long) 1000), 2);
                    try {
                        if (isCancelled()) {
                            return null;
                        }
                        if (frameAtTime != null) {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(videoTimelinePlayView.f24184OooOo0, videoTimelinePlayView.f24186OooOo0O, frameAtTime.getConfig());
                            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            float fMax = Math.max(videoTimelinePlayView.f24184OooOo0 / frameAtTime.getWidth(), videoTimelinePlayView.f24186OooOo0O / frameAtTime.getHeight());
                            int width = (int) (frameAtTime.getWidth() * fMax);
                            int height = (int) (frameAtTime.getHeight() * fMax);
                            canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((videoTimelinePlayView.f24184OooOo0 - width) / 2, (videoTimelinePlayView.f24186OooOo0O - height) / 2, width, height), (Paint) null);
                            frameAtTime.recycle();
                            bitmap = bitmapCreateBitmap;
                        } else {
                            bitmap = frameAtTime;
                        }
                        if (bitmap == null || (oooO0O0 = videoTimelinePlayView.f24207OoooO0) == null) {
                            return bitmap;
                        }
                        oooO0O0.OooO00o(i, bitmap);
                        return bitmap;
                    } catch (Exception unused) {
                    }
                }
                return frameAtTime;
            } catch (Exception unused2) {
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (isCancelled()) {
                return;
            }
            VideoTimelinePlayView videoTimelinePlayView = VideoTimelinePlayView.this;
            videoTimelinePlayView.f24180OooOOo.add(new OooO00o(bitmap2));
            videoTimelinePlayView.invalidate();
            int i = this.f24221OooO00o;
            if (i < videoTimelinePlayView.f24187OooOo0o) {
                videoTimelinePlayView.OooO00o(i + 1);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoTimelinePlayView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(int i) {
        if (this.f24208OoooO00.get() && this.f24179OooOOOo != null) {
            if (i == 0) {
                this.f24186OooOo0O = this.f24206OoooO;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                float f = displayMetrics.widthPixels * 1.0f;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                Intrinsics.checkNotNullParameter(context2, "context");
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                ((Activity) context2).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
                int i2 = displayMetrics2.heightPixels;
                Intrinsics.checkNotNullParameter(context2, "context");
                int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : 0;
                if (dimensionPixelSize == 0) {
                    dimensionPixelSize = (int) ((context2.getApplicationContext().getResources().getDisplayMetrics().density * 25.0f) + 0.5f);
                }
                float f2 = f / (i2 - dimensionPixelSize);
                this.f24184OooOo0 = (int) Math.ceil(this.f24186OooOo0O * Math.min(Math.max(f2, (this.f24170OooO0o0 * 1.0f) / this.f24169OooO0o), 1.0f / f2));
                int measuredWidth = getMeasuredWidth();
                int i3 = this.f24191OooOoo * 2;
                int iMax = Math.max(1, (measuredWidth - i3) / this.f24184OooOo0);
                this.f24187OooOo0o = iMax;
                if (iMax > 13 || iMax < 5) {
                    this.f24187OooOo0o = Math.min(Math.max(iMax, 5), 13);
                    this.f24184OooOo0 = (int) Math.ceil((getMeasuredWidth() - i3) / this.f24187OooOo0o);
                }
                this.f24185OooOo00 = this.f24168OooO0Oo / ((long) this.f24187OooOo0o);
            }
            OooO0o oooO0o = new OooO0o(i);
            this.f24182OooOOoo = oooO0o;
            oooO0o.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
        }
    }

    @NotNull
    public final Paint getBitmapPaint() {
        return this.bitmapPaint;
    }

    public final float getLeftProgress() {
        return this.leftProgress;
    }

    /* JADX INFO: renamed from: getProgress, reason: from getter */
    public final float getF24176OooOOO() {
        return this.f24176OooOOO;
    }

    /* JADX INFO: renamed from: getRightProgress, reason: from getter */
    public final float getF24172OooO0oo() {
        return this.f24172OooO0oo;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01a5  */
    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        ArrayList<OooO00o> arrayList;
        int i;
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int measuredWidth = getMeasuredWidth();
        int i2 = this.f24191OooOoo;
        int i3 = measuredWidth - (i2 * 2);
        float f3 = i3;
        int i4 = ((int) (this.leftProgress * f3)) + i2;
        int i5 = ((int) (this.f24172OooO0oo * f3)) + i2;
        int i6 = 0;
        boolean z = this.f24175OooOO0o || this.f24173OooOO0 || this.f24174OooOO0O;
        Paint paint = this.f24167OooO;
        paint.setColor(0);
        float f4 = this.f24190OooOoOO;
        int i7 = this.f24209OoooO0O;
        float f5 = i7;
        float measuredWidth2 = getMeasuredWidth() - f4;
        int i8 = this.f24206OoooO;
        float f6 = i8;
        canvas.drawRect(f4, f5, measuredWidth2, f6, paint);
        canvas.save();
        float f7 = 0;
        canvas.clipRect(i2, o0000O0.OooO00o(f7) + i7, i3 + i2, o0000O0.OooO00o(f7) + i8);
        ArrayList<OooO00o> arrayList2 = this.f24180OooOOo;
        if (arrayList2.isEmpty() && this.f24182OooOOoo == null) {
            OooO00o(0);
        } else {
            int size = arrayList2.size();
            int i9 = 0;
            while (i6 < size) {
                OooO00o oooO00o = arrayList2.get(i6);
                Intrinsics.checkNotNullExpressionValue(oooO00o, "get(...)");
                OooO00o oooO00o2 = oooO00o;
                Bitmap bitmap = oooO00o2.f24217OooO00o;
                if (bitmap != null) {
                    int i10 = (this.f24184OooOo0 * i6) + i2;
                    arrayList = arrayList2;
                    Rect rect = this.f24214OoooOoO;
                    rect.left = i9;
                    rect.top = i9;
                    Integer numValueOf = Integer.valueOf(bitmap.getWidth());
                    Intrinsics.checkNotNull(numValueOf);
                    rect.right = numValueOf.intValue();
                    Bitmap bitmap2 = oooO00o2.f24217OooO00o;
                    Integer numValueOf2 = bitmap2 != null ? Integer.valueOf(bitmap2.getHeight()) : null;
                    Intrinsics.checkNotNull(numValueOf2);
                    rect.bottom = numValueOf2.intValue();
                    Rect rect2 = this.f24215OoooOoo;
                    rect2.left = i10;
                    rect2.top = i7;
                    i = size;
                    rect2.right = i10 + this.f24184OooOo0;
                    rect2.bottom = i7 + i8;
                    float f8 = oooO00o2.f24218OooO0O0;
                    if (f8 == 1.0f) {
                        Intrinsics.checkNotNull(bitmap2);
                        o00O0.OooO00o(canvas, bitmap2, rect, rect2, null);
                    } else {
                        float f9 = f8 + 0.16f;
                        oooO00o2.f24218OooO0O0 = f9;
                        if (f9 > 1.0f) {
                            oooO00o2.f24218OooO0O0 = 1.0f;
                        } else {
                            invalidate();
                        }
                        this.bitmapPaint.setAlpha((int) (255 * oooO00o2.f24218OooO0O0));
                        Intrinsics.checkNotNull(bitmap2);
                        o00O0.OooO00o(canvas, bitmap2, rect, rect2, this.bitmapPaint);
                    }
                } else {
                    arrayList = arrayList2;
                    i = size;
                }
                i6++;
                i9 = 0;
                arrayList2 = arrayList;
                size = i;
            }
        }
        if (z) {
            paint.setColor(this.f24198Oooo00O);
            int i11 = this.f24216o000oOoO;
            paint.setStrokeWidth(i11);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAlpha(128);
            float f10 = i2;
            float f11 = i11 / 2;
            f2 = f5;
            f = f6;
            canvas.drawRect(f10 + f11, f2 + f11, (this.f24213OoooOo0 - f10) - f11, f - f11, paint);
        } else {
            f = f6;
            f2 = f5;
        }
        paint.setAlpha(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        paint.setStyle(Paint.Style.FILL);
        if (!z) {
            paint.setColor(this.f24200Oooo0O0);
            float f12 = i2;
            float f13 = f2;
            float f14 = f;
            canvas.drawRect(f12, f13, i4, f14, paint);
            canvas.drawRect(i5, f13, f3 + f12, f14, paint);
        }
        canvas.restore();
        boolean z2 = this.leftProgress == 0.0f;
        int i12 = this.f24196Oooo0;
        if (z2) {
            if (this.f24172OooO0oo == 1.0f) {
                paint.setColor(i12);
            } else {
                paint.setColor(i12);
            }
        } else {
            paint.setColor(i12);
        }
        float f15 = i4;
        float f16 = i5;
        float f17 = this.f24210OoooOO0;
        canvas.drawRect(f15, f2, f16, f2 + f17, paint);
        canvas.drawRect(f15, f - f17, f16, f, paint);
        RectF rectF = this.f24188OooOoO;
        float f18 = this.f24192OooOoo0;
        rectF.set(f15 - f18, f2, f15, f);
        canvas.drawRect(rectF, paint);
        int i13 = this.f24193OooOooO;
        int iOooO00o = androidx.appcompat.widget.OooO00o.OooO00o(i8 - i7, i13, 2, i7);
        Drawable drawable = this.f24194OooOooo;
        if (drawable != null) {
            drawable.setBounds(i4 - i13, iOooO00o, i4, iOooO00o + i13);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        rectF.set(f16, f2, f18 + f16, f);
        canvas.drawRect(rectF, paint);
        Drawable drawable2 = this.f24197Oooo000;
        if (drawable2 != null) {
            drawable2.setBounds(i5, iOooO00o, i5 + i13, i13 + iOooO00o);
        }
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (this.f24177OooOOO0) {
            float f19 = (f3 * this.f24176OooOOO) + i2;
            paint.setColor(this.f24199Oooo00o);
            float f20 = this.f24211OoooOOO;
            paint.setStrokeWidth(f20);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawLine(f19, f20 / 2.0f, f19, this.f24212OoooOOo - f20, paint);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.f24205Oooo0oo.set(i, 0, i3, getMeasuredHeight());
            setSystemGestureExclusionRects(this.f24204Oooo0oO);
        }
        this.f24213OoooOo0 = i3;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.f24201Oooo0OO != size) {
            ArrayList<OooO00o> arrayList = this.f24180OooOOo;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                OooO00o oooO00o = arrayList.get(i3);
                Intrinsics.checkNotNullExpressionValue(oooO00o, "get(...)");
                Bitmap bitmap = oooO00o.f24217OooO00o;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            arrayList.clear();
            OooO0o oooO0o = this.f24182OooOOoo;
            if (oooO0o != null) {
                Intrinsics.checkNotNull(oooO0o);
                oooO0o.cancel(true);
                this.f24182OooOOoo = null;
            }
            invalidate();
            this.f24201Oooo0OO = size;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float x = event.getX();
        float y = event.getY();
        int measuredWidth = getMeasuredWidth();
        int i = this.f24191OooOoo;
        int i2 = measuredWidth - (i * 2);
        float f = i2;
        int i3 = ((int) (this.leftProgress * f)) + i;
        int i4 = ((int) (this.f24172OooO0oo * f)) + i;
        if (event.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.f24179OooOOOo == null) {
                return false;
            }
            int iOooO00o = o0000O0.OooO00o(16);
            o0000O0.OooO00o(8);
            if (i3 - iOooO00o <= x && x <= Math.min(i3 + iOooO00o, i4) && y >= 0.0f && y <= getMeasuredHeight()) {
                OooO0OO oooO0OO = this.f24181OooOOo0;
                if (oooO0OO != null) {
                    Intrinsics.checkNotNull(oooO0OO);
                    oooO0OO.OooO0O0();
                }
                this.f24173OooOO0 = true;
                this.f24178OooOOOO = x - i3;
                invalidate();
                return true;
            }
            if (i4 - iOooO00o <= x && x <= iOooO00o + i4 && y >= 0.0f && y <= getMeasuredHeight()) {
                OooO0OO oooO0OO2 = this.f24181OooOOo0;
                if (oooO0OO2 != null) {
                    Intrinsics.checkNotNull(oooO0OO2);
                    oooO0OO2.OooO0O0();
                }
                this.f24174OooOO0O = true;
                this.f24178OooOOOO = x - i4;
                invalidate();
                return true;
            }
            if (i3 <= x && x <= i4 && y >= 0.0f && y <= getMeasuredHeight()) {
                OooO0OO oooO0OO3 = this.f24181OooOOo0;
                if (oooO0OO3 != null) {
                    Intrinsics.checkNotNull(oooO0OO3);
                    oooO0OO3.OooO0O0();
                }
                this.f24175OooOO0o = true;
                this.f24178OooOOOO = x;
                invalidate();
                return true;
            }
        } else if (event.getAction() == 1 || event.getAction() == 3) {
            if (this.f24173OooOO0) {
                OooO0OO oooO0OO4 = this.f24181OooOOo0;
                if (oooO0OO4 != null) {
                    Intrinsics.checkNotNull(oooO0OO4);
                    oooO0OO4.OooO0o0();
                }
                this.f24173OooOO0 = false;
                invalidate();
                return true;
            }
            if (this.f24174OooOO0O) {
                OooO0OO oooO0OO5 = this.f24181OooOOo0;
                if (oooO0OO5 != null) {
                    Intrinsics.checkNotNull(oooO0OO5);
                    oooO0OO5.OooO0o0();
                }
                this.f24174OooOO0O = false;
                invalidate();
                return true;
            }
            if (this.f24175OooOO0o) {
                OooO0OO oooO0OO6 = this.f24181OooOOo0;
                if (oooO0OO6 != null) {
                    Intrinsics.checkNotNull(oooO0OO6);
                    oooO0OO6.OooO0o0();
                }
                this.f24175OooOO0o = false;
                invalidate();
            }
        } else if (event.getAction() == 2) {
            if (this.f24175OooOO0o) {
                float fMin = Math.min(Math.max(((int) (x - this.f24178OooOOOO)) / f, 0 - this.leftProgress), 1 - getF24172OooO0oo());
                this.leftProgress += fMin;
                this.f24172OooO0oo += fMin;
                OooO0OO oooO0OO7 = this.f24181OooOOo0;
                if (oooO0OO7 != null) {
                    Intrinsics.checkNotNull(oooO0OO7);
                    oooO0OO7.OooO0OO(true);
                    OooO0OO oooO0OO8 = this.f24181OooOOo0;
                    Intrinsics.checkNotNull(oooO0OO8);
                    oooO0OO8.OooO0Oo(true);
                }
                float f2 = this.leftProgress;
                float f3 = this.f24176OooOOO;
                if (f2 > f3) {
                    this.f24176OooOOO = f2;
                    OooO0OO oooO0OO9 = this.f24181OooOOo0;
                    if (oooO0OO9 != null) {
                        oooO0OO9.OooO00o();
                    }
                } else {
                    float f4 = this.f24172OooO0oo;
                    if (f4 < f3) {
                        this.f24176OooOOO = f4;
                        OooO0OO oooO0OO10 = this.f24181OooOOo0;
                        if (oooO0OO10 != null) {
                            oooO0OO10.OooO00o();
                        }
                    }
                }
                this.f24178OooOOOO = x;
                invalidate();
                return true;
            }
            if (this.f24173OooOO0) {
                int i5 = (int) (x - this.f24178OooOOOO);
                if (i5 < i) {
                    i4 = i;
                } else if (i5 <= i4) {
                    i4 = i5;
                }
                float f5 = (i4 - i) / f;
                this.leftProgress = f5;
                float f6 = this.f24172OooO0oo;
                float f7 = f6 - f5;
                float f8 = this.f24183OooOo;
                if (f7 > f8) {
                    this.f24172OooO0oo = f5 + f8;
                } else {
                    float f9 = this.f24189OooOoO0;
                    if (!(f9 == 0.0f) && f7 < f9) {
                        float f10 = f6 - f9;
                        this.leftProgress = f10;
                        if (f10 < 0.0f) {
                            this.leftProgress = 0.0f;
                        }
                    }
                }
                float f11 = this.leftProgress;
                float f12 = this.f24176OooOOO;
                if (f11 > f12) {
                    this.f24176OooOOO = f11;
                    OooO0OO oooO0OO11 = this.f24181OooOOo0;
                    if (oooO0OO11 != null) {
                        oooO0OO11.OooO00o();
                    }
                } else {
                    float f13 = this.f24172OooO0oo;
                    if (f13 < f12) {
                        this.f24176OooOOO = f13;
                        OooO0OO oooO0OO12 = this.f24181OooOOo0;
                        if (oooO0OO12 != null) {
                            oooO0OO12.OooO00o();
                        }
                    }
                }
                OooO0OO oooO0OO13 = this.f24181OooOOo0;
                if (oooO0OO13 != null) {
                    Intrinsics.checkNotNull(oooO0OO13);
                    oooO0OO13.OooO0Oo(false);
                }
                invalidate();
                return true;
            }
            if (this.f24174OooOO0O) {
                int i6 = (int) (x - this.f24178OooOOOO);
                if (i6 >= i3 && i6 <= (i3 = i2 + i)) {
                    i3 = i6;
                }
                float f14 = (i3 - i) / f;
                this.f24172OooO0oo = f14;
                float f15 = this.leftProgress;
                float f16 = f14 - f15;
                float f17 = this.f24183OooOo;
                if (f16 > f17) {
                    this.leftProgress = f14 - f17;
                } else {
                    float f18 = this.f24189OooOoO0;
                    if (!(f18 == 0.0f) && f16 < f18) {
                        float f19 = f15 + f18;
                        this.f24172OooO0oo = f19;
                        if (f19 > 1.0f) {
                            this.f24172OooO0oo = 1.0f;
                        }
                    }
                }
                float f20 = this.leftProgress;
                float f21 = this.f24176OooOOO;
                if (f20 > f21) {
                    this.f24176OooOOO = f20;
                    OooO0OO oooO0OO14 = this.f24181OooOOo0;
                    if (oooO0OO14 != null) {
                        oooO0OO14.OooO00o();
                    }
                } else {
                    float f22 = this.f24172OooO0oo;
                    if (f22 < f21) {
                        this.f24176OooOOO = f22;
                        OooO0OO oooO0OO15 = this.f24181OooOOo0;
                        if (oooO0OO15 != null) {
                            oooO0OO15.OooO00o();
                        }
                    }
                }
                OooO0OO oooO0OO16 = this.f24181OooOOo0;
                if (oooO0OO16 != null) {
                    Intrinsics.checkNotNull(oooO0OO16);
                    oooO0OO16.OooO0OO(false);
                }
                invalidate();
                return true;
            }
        }
        return true;
    }

    public final void setBitmapPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.bitmapPaint = paint;
    }

    public final void setDelegate(@Nullable OooO0OO delegate) {
        this.f24181OooOOo0 = delegate;
    }

    public final void setMaxProgressDiff(float value) {
        this.f24183OooOo = value;
        float f = this.f24172OooO0oo;
        float f2 = this.leftProgress;
        if (f - f2 > value) {
            this.f24172OooO0oo = f2 + value;
            invalidate();
        }
    }

    public final void setMinProgressDiff(float value) {
        this.f24189OooOoO0 = value;
    }

    public final void setMode(int mode) {
        if (this.f24203Oooo0o0 == mode) {
            return;
        }
        this.f24203Oooo0o0 = mode;
        invalidate();
    }

    public final void setProgress(float f) {
        this.f24176OooOOO = f;
        invalidate();
    }

    public final void setRightProgress(float f) {
        this.f24172OooO0oo = f;
        OooO0OO oooO0OO = this.f24181OooOOo0;
        if (oooO0OO != null) {
            Intrinsics.checkNotNull(oooO0OO);
            oooO0OO.OooO0O0();
        }
        OooO0OO oooO0OO2 = this.f24181OooOOo0;
        if (oooO0OO2 != null) {
            Intrinsics.checkNotNull(oooO0OO2);
            oooO0OO2.OooO0OO(false);
        }
        OooO0OO oooO0OO3 = this.f24181OooOOo0;
        if (oooO0OO3 != null) {
            Intrinsics.checkNotNull(oooO0OO3);
            oooO0OO3.OooO0o0();
        }
        invalidate();
    }

    public final void setShowProgress(boolean show) {
        if (this.f24177OooOOO0 == show) {
            return;
        }
        this.f24177OooOOO0 = show;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoTimelinePlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VideoTimelinePlayView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VideoTimelinePlayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24170OooO0o0 = 1;
        this.f24169OooO0o = 1;
        this.f24172OooO0oo = 1.0f;
        Paint paint = new Paint(1);
        this.f24167OooO = paint;
        this.f24180OooOOo = new ArrayList<>();
        this.f24183OooOo = 1.0f;
        this.f24188OooOoO = new RectF();
        int iOooO00o = o0000O0.OooO00o(0);
        this.f24190OooOoOO = iOooO00o;
        int iOooO00o2 = o0000O0.OooO00o(15);
        float f = 12;
        int iOooO00o3 = o0000O0.OooO00o(f);
        this.f24192OooOoo0 = iOooO00o3;
        this.f24191OooOoo = iOooO00o + iOooO00o2 + iOooO00o3;
        this.f24193OooOooO = o0000O0.OooO00o(f);
        this.f24198Oooo00O = Color.parseColor("#FFD20C");
        this.f24199Oooo00o = Color.parseColor("#00D8C9");
        this.f24196Oooo0 = -1;
        Color.parseColor("#101317");
        this.f24200Oooo0O0 = Color.parseColor("#4D000000");
        this.bitmapPaint = new Paint();
        ArrayList<Rect> arrayList = new ArrayList<>();
        this.f24204Oooo0oO = arrayList;
        Rect rect = new Rect();
        this.f24205Oooo0oo = rect;
        this.f24208OoooO00 = new AtomicBoolean(false);
        this.f24209OoooO0O = o0000O0.OooO00o(5);
        this.f24206OoooO = o0000O0.OooO00o(48);
        this.f24210OoooOO0 = o0000O0.OooO00o(4);
        float f2 = 2;
        this.f24216o000oOoO = o0000O0.OooO00o(f2);
        this.f24211OoooOOO = o0000O0.OooO00o(f2);
        this.f24212OoooOOo = o0000O0.OooO00o(58);
        paint.setColor(-1);
        int i2 = oo000o.ic_choose_video_range;
        Object obj = ContextCompat.f5281OooO00o;
        this.f24194OooOooo = ContextCompat.OooO0OO.OooO0O0(context, i2);
        this.f24197Oooo000 = ContextCompat.OooO0OO.OooO0O0(context, i2);
        arrayList.add(rect);
        this.f24214OoooOoO = new Rect();
        this.f24215OoooOoo = new Rect();
    }
}
