package p648o0ooo;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0OO0.OooO00o;
import p120o00O0Ooo.o0OO00O;
import p416o0Oo0ooo.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o.OooO00o f59782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f59783OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(oo000o.OooO00o oooO00o, ConstraintLayout constraintLayout) {
        super(1);
        this.f59782OooO0Oo = oooO00o;
        this.f59783OooO0o0 = constraintLayout;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[Catch: all -> 0x004a, Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:11:0x0043, B:20:0x0051, B:22:0x006e, B:24:0x007b, B:25:0x007e), top: B:34:0x0043, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e A[Catch: all -> 0x004a, Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:11:0x0043, B:20:0x0051, B:22:0x006e, B:24:0x007b, B:25:0x007e), top: B:34:0x0043, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[Catch: all -> 0x004a, Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:11:0x0043, B:20:0x0051, B:22:0x006e, B:24:0x007b, B:25:0x007e), top: B:34:0x0043, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0051, please report this as an issue */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Bitmap bitmapCreateBitmap;
        String str;
        File file;
        if (bool.booleanValue()) {
            boolean z = false;
            View view = this.f59783OooO0o0;
            if (view != null) {
                view.setDrawingCacheEnabled(true);
                view.buildDrawingCache();
                Bitmap drawingCache = view.getDrawingCache();
                Rect rect = new Rect();
                view.getWindowVisibleDisplayFrame(rect);
                int i = rect.top;
                bitmapCreateBitmap = Bitmap.createBitmap(drawingCache, 0, i, view.getWidth(), view.getHeight() - i);
                view.destroyDrawingCache();
            } else {
                bitmapCreateBitmap = null;
            }
            oo000o.OooO00o oooO00o = this.f59782OooO0Oo;
            String str2 = oooO00o.f59792OooOOO0;
            o00oO0o o00oo0o2 = new o00oO0o(oooO00o);
            String str3 = "";
            if (bitmapCreateBitmap != null) {
                if (str2 != null) {
                    try {
                        try {
                            if (str2.length() == 0) {
                                z = true;
                                if (!z) {
                                    str = OooO00o.OooO00o(str2) + o0OO00O.OooO0O0(str2);
                                    if (!TextUtils.isEmpty(str)) {
                                        file = new File(y0.f45410OooO0Oo, str);
                                        if (!file.exists()) {
                                            file.createNewFile();
                                        }
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        String absolutePath = file.getAbsolutePath();
                                        Intrinsics.checkNotNullExpressionValue(absolutePath, "newFilePath.absolutePath");
                                        str3 = absolutePath;
                                    }
                                }
                            } else if (!z) {
                                str = OooO00o.OooO00o(str2) + o0OO00O.OooO0O0(str2);
                                if (!TextUtils.isEmpty(str)) {
                                    file = new File(y0.f45410OooO0Oo, str);
                                    if (!file.exists()) {
                                        file.createNewFile();
                                    }
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                                    fileOutputStream2.flush();
                                    fileOutputStream2.close();
                                    String absolutePath2 = file.getAbsolutePath();
                                    Intrinsics.checkNotNullExpressionValue(absolutePath2, "newFilePath.absolutePath");
                                    str3 = absolutePath2;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return Unit.INSTANCE;
                        }
                    } finally {
                        o00oo0o2.invoke("");
                    }
                } else {
                    z = true;
                    if (!z) {
                        str = OooO00o.OooO00o(str2) + o0OO00O.OooO0O0(str2);
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(y0.f45410OooO0Oo, str);
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                            String absolutePath3 = file.getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath3, "newFilePath.absolutePath");
                            str3 = absolutePath3;
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
