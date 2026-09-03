package p526o0o0OO0O;

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
import o00OOOOo.OooO00o;
import p146o00Oo000.OooOOO0;
import p466o0OooOoo.o0O0o00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000O0.OooO00o f53326OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f53327OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(o0000O0.OooO00o oooO00o, ConstraintLayout constraintLayout) {
        super(1);
        this.f53326OooO0Oo = oooO00o;
        this.f53327OooO0o0 = constraintLayout;
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
            View view = this.f53327OooO0o0;
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
            o0000O0.OooO00o oooO00o = this.f53326OooO0Oo;
            String str2 = oooO00o.f53280OooOOO0;
            o0000O0O o0000o0o2 = new o0000O0O(oooO00o);
            String str3 = "";
            if (bitmapCreateBitmap != null) {
                if (str2 != null) {
                    try {
                        try {
                            if (str2.length() == 0) {
                                z = true;
                                if (!z) {
                                    str = OooO00o.OooO00o(str2) + OooOOO0.OooO0O0(str2);
                                    if (!TextUtils.isEmpty(str)) {
                                        file = new File(o0O0o00O.f47847OooO0Oo, str);
                                        if (!file.exists()) {
                                            file.createNewFile();
                                        }
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                        String absolutePath = file.getAbsolutePath();
                                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                        str3 = absolutePath;
                                    }
                                }
                            } else if (!z) {
                                str = OooO00o.OooO00o(str2) + OooOOO0.OooO0O0(str2);
                                if (!TextUtils.isEmpty(str)) {
                                    file = new File(o0O0o00O.f47847OooO0Oo, str);
                                    if (!file.exists()) {
                                        file.createNewFile();
                                    }
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                                    fileOutputStream2.flush();
                                    fileOutputStream2.close();
                                    String absolutePath2 = file.getAbsolutePath();
                                    Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                                    str3 = absolutePath2;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return Unit.INSTANCE;
                        }
                    } finally {
                        o0000o0o2.invoke("");
                    }
                } else {
                    z = true;
                    if (!z) {
                        str = OooO00o.OooO00o(str2) + OooOOO0.OooO0O0(str2);
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(o0O0o00O.f47847OooO0Oo, str);
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream3);
                            fileOutputStream3.flush();
                            fileOutputStream3.close();
                            String absolutePath3 = file.getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath3, "getAbsolutePath(...)");
                            str3 = absolutePath3;
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
