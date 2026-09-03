package o00;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.compose.animation.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBlurTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlurTransformation.kt\ncoil/transform/MyBlurTransformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,108:1\n1#2:109\n95#3:110\n43#3,3:111\n*S KotlinDebug\n*F\n+ 1 BlurTransformation.kt\ncoil/transform/MyBlurTransformation\n*L\n49#1:110\n51#1:111,3\n*E\n"})
public final class OooO0O0 implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f33725OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f33726OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f33727OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f33728OooO0Oo;

    public OooO0O0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33725OooO00o = context;
        this.f33726OooO0O0 = 10.0f;
        this.f33727OooO0OO = 1.0f;
        double d = 10.0f;
        if (!(0.0d <= d && d <= 25.0d)) {
            throw new IllegalArgumentException("radius must be in [0, 25].".toString());
        }
        this.f33728OooO0Oo = OooO0O0.class.getName() + "-10.0-1.0";
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:? A[SYNTHETIC] */
    @Override // o00.OooO0OO
    @Nullable
    public final Bitmap OooO00o(@NotNull Bitmap bitmap) throws Throwable {
        Throwable th;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        Paint paint = new Paint(3);
        float width = bitmap.getWidth();
        float f = this.f33727OooO0OO;
        int i = (int) (width / f);
        int height = (int) (bitmap.getHeight() / f);
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, height, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f2 = 1 / f;
        canvas.scale(f2, f2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(this.f33725OooO00o);
            try {
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        scriptIntrinsicBlurCreate.setRadius(this.f33726OooO0O0);
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmapCreateBitmap);
                        if (renderScriptCreate != null) {
                            renderScriptCreate.destroy();
                        }
                        allocationCreateFromBitmap.destroy();
                        allocationCreateTyped.destroy();
                        scriptIntrinsicBlurCreate.destroy();
                        return bitmapCreateBitmap;
                    } catch (Throwable th2) {
                        th = th2;
                        scriptIntrinsicBlur = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        if (renderScript != null) {
                            renderScript.destroy();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocationCreateTyped != null) {
                            allocationCreateTyped.destroy();
                        }
                        if (scriptIntrinsicBlur != null) {
                            throw th;
                        }
                        scriptIntrinsicBlur.destroy();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    allocationCreateTyped = null;
                    renderScript = renderScriptCreate;
                    scriptIntrinsicBlur = null;
                    if (renderScript != null) {
                        renderScript.destroy();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (scriptIntrinsicBlur != null) {
                        throw th;
                    }
                    scriptIntrinsicBlur.destroy();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                allocationCreateFromBitmap = null;
            }
        } catch (Throwable th5) {
            th = th5;
            scriptIntrinsicBlur = null;
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO0O0) {
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            if (Intrinsics.areEqual(this.f33725OooO00o, oooO0O0.f33725OooO00o)) {
                if (this.f33726OooO0O0 == oooO0O0.f33726OooO0O0) {
                    if (this.f33727OooO0OO == oooO0O0.f33727OooO0OO) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // o00.OooO0OO
    @NotNull
    public final String getCacheKey() {
        return this.f33728OooO0Oo;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f33727OooO0OO) + Oooo0.OooO00o(this.f33726OooO0O0, this.f33725OooO00o.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "BlurTransformation(context=" + this.f33725OooO00o + ", radius=" + this.f33726OooO0O0 + ", sampling=" + this.f33727OooO0OO + ")";
    }
}
