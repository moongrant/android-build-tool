package p203o00o0o00;

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
public final class o000O0o {
    @Nullable
    public static final NinePatchDrawable OooO00o(@NotNull Context context, int i, @NotNull List<o000Oo0> xList, @NotNull List<o000Oo0> yList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xList, "xList");
        Intrinsics.checkNotNullParameter(yList, "yList");
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        Intrinsics.checkNotNull(bitmapDecodeResource);
        return OooO0O0(bitmapDecodeResource, context, xList, yList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, android.graphics.drawable.NinePatchDrawable] */
    @Nullable
    public static final NinePatchDrawable OooO0O0(@NotNull Bitmap bitmap, @NotNull Context context, @NotNull List<o000Oo0> xList, @NotNull List<o000Oo0> yList) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xList, "xList");
        Intrinsics.checkNotNullParameter(yList, "yList");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        try {
            Result.Companion companion = Result.INSTANCE;
            context.getResources();
            o000O000 o000o001 = new o000O000(bitmap);
            for (o000Oo0 o000oo1 : xList) {
                int i = o000oo1.f39358OooO0O0;
                if (i > 0) {
                    int i2 = o000oo1.f39357OooO00o;
                    ArrayList<Integer> arrayList = o000o001.f39355OooO0OO;
                    arrayList.add(Integer.valueOf(i2));
                    arrayList.add(Integer.valueOf(i2 + i));
                }
            }
            for (o000Oo0 o000oo2 : yList) {
                int i3 = o000oo2.f39358OooO0O0;
                if (i3 > 0) {
                    int i4 = o000oo2.f39357OooO00o;
                    ArrayList<Integer> arrayList2 = o000o001.f39356OooO0Oo;
                    arrayList2.add(Integer.valueOf(i4));
                    arrayList2.add(Integer.valueOf(i4 + i3));
                }
            }
            ?? ninePatchDrawable = new NinePatchDrawable(context.getResources(), bitmap, o000o001.OooO00o(), new Rect(), null);
            ninePatchDrawable.setAutoMirrored(true);
            objectRef.element = ninePatchDrawable;
            Result.m4215constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
        return (NinePatchDrawable) objectRef.element;
    }
}
