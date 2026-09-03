package p506o0o00oO0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p190o00o00oo.o000000O;
import p207o00o0oO.o00O0;
import p494o0o00OO0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO.OooO00o f41646Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ View f41647Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(o00OO.OooO00o oooO00o, View view) {
        super(1);
        this.f41646Oooo0o = oooO00o;
        this.f41647Oooo0oO = view;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[Catch: all -> 0x004f, Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:11:0x0048, B:20:0x0056, B:22:0x0073, B:24:0x0082, B:25:0x0085), top: B:34:0x0048, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[Catch: all -> 0x004f, Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:11:0x0048, B:20:0x0056, B:22:0x0073, B:24:0x0082, B:25:0x0085), top: B:34:0x0048, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[Catch: all -> 0x004f, Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:11:0x0048, B:20:0x0056, B:22:0x0073, B:24:0x0082, B:25:0x0085), top: B:34:0x0048, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0056, please report this as an issue */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Bitmap bitmapCreateBitmap;
        String str;
        File file;
        if (bool.booleanValue()) {
            o00OO.OooO00o oooO00o = this.f41646Oooo0o;
            View view = this.f41647Oooo0oO;
            boolean z = false;
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
            o00OO.OooO00o oooO00o2 = this.f41646Oooo0o;
            String str2 = oooO00o2.f41637o000oOoO;
            o00OOO00 o00ooo01 = new o00OOO00(oooO00o2);
            Objects.requireNonNull(oooO00o);
            String str3 = "";
            if (bitmapCreateBitmap != null) {
                if (str2 != null) {
                    try {
                        try {
                            if (str2.length() == 0) {
                                z = true;
                                if (!z) {
                                    str = o000000O.OooO00o(str2) + o00O0.OooO0O0(str2);
                                    if (!TextUtils.isEmpty(str)) {
                                        OooO0o oooO0o = OooO0o.f41155OooO00o;
                                        file = new File(OooO0o.f41158OooO0Oo, str);
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
                                str = o000000O.OooO00o(str2) + o00O0.OooO0O0(str2);
                                if (!TextUtils.isEmpty(str)) {
                                    OooO0o oooO0o2 = OooO0o.f41155OooO00o;
                                    file = new File(OooO0o.f41158OooO0Oo, str);
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
                        o00ooo01.invoke("");
                    }
                } else {
                    z = true;
                    if (!z) {
                        str = o000000O.OooO00o(str2) + o00O0.OooO0O0(str2);
                        if (!TextUtils.isEmpty(str)) {
                            OooO0o oooO0o3 = OooO0o.f41155OooO00o;
                            file = new File(OooO0o.f41158OooO0Oo, str);
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
