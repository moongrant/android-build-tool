package p155o00OoO0o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNinePatchDrawableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NinePatchDrawableUtils.kt\ncom/code/android/util/ninedrawable/NinePatchDrawableUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1855#2,2:60\n1855#2,2:62\n*S KotlinDebug\n*F\n+ 1 NinePatchDrawableUtils.kt\ncom/code/android/util/ninedrawable/NinePatchDrawableUtilsKt\n*L\n29#1:60,2\n35#1:62,2\n*E\n"})
public final class OooOO0 {
    @Nullable
    public static final NinePatchDrawable OooO00o(@NotNull Context context, int i, @NotNull List<OooOO0O> xList, @NotNull List<OooOO0O> yList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xList, "xList");
        Intrinsics.checkNotNullParameter(yList, "yList");
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), i);
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return OooO0O0(bitmap, context, xList, yList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, android.graphics.drawable.NinePatchDrawable] */
    @Nullable
    public static final NinePatchDrawable OooO0O0(@NotNull Bitmap bitmap, @NotNull Context context, @NotNull List<OooOO0O> xList, @NotNull List<OooOO0O> yList) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xList, "xList");
        Intrinsics.checkNotNullParameter(yList, "yList");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            Result.Companion companion = Result.INSTANCE;
            context.getResources();
            OooO oooO = new OooO(bitmap);
            for (OooOO0O oooOO0O : xList) {
                int i = oooOO0O.f38215OooO0O0;
                if (i > 0) {
                    int i2 = oooOO0O.f38214OooO00o;
                    ArrayList<Integer> arrayList = oooO.f38212OooO0OO;
                    arrayList.add(Integer.valueOf(i2));
                    arrayList.add(Integer.valueOf(i2 + i));
                }
            }
            for (OooOO0O oooOO0O2 : yList) {
                int i3 = oooOO0O2.f38215OooO0O0;
                if (i3 > 0) {
                    int i4 = oooOO0O2.f38214OooO00o;
                    ArrayList<Integer> arrayList2 = oooO.f38213OooO0Oo;
                    arrayList2.add(Integer.valueOf(i4));
                    arrayList2.add(Integer.valueOf(i4 + i3));
                }
            }
            ?? ninePatchDrawable = new NinePatchDrawable(context.getResources(), bitmap, oooO.OooO00o(), new Rect(), null);
            ninePatchDrawable.setAutoMirrored(true);
            objectRef.element = ninePatchDrawable;
            Result.m4213constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        return (NinePatchDrawable) objectRef.element;
    }
}
