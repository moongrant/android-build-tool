package p119o00O0Oo0;

import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import coil.decode.DataSource;
import coil.size.Scale;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import o00O0O0O.o00oO0o;
import o00O0O0O.oo000o;
import o00O0OO.OooO0O0;
import o00O0OO.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00O;

/* JADX INFO: loaded from: classes.dex */
@JvmName(name = "-Extensions")
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O f30749OooO00o;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DataSource.values().length];
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            iArr[DataSource.MEMORY.ordinal()] = 2;
            iArr[DataSource.DISK.ordinal()] = 3;
            iArr[DataSource.NETWORK.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Object[] array = new ArrayList(20).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        f30749OooO00o = new o00O((String[]) array);
    }

    @Nullable
    public static final String OooO00o(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments");
        return (String) CollectionsKt.firstOrNull((List) pathSegments);
    }

    @Nullable
    public static final String OooO0O0(@NotNull MimeTypeMap mimeTypeMap, @Nullable String str) {
        Intrinsics.checkNotNullParameter(mimeTypeMap, "<this>");
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    @NotNull
    public static final o00oO0o OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int i = o00O00OO.OooO00o.coil_request_manager;
        Object tag = view.getTag(i);
        o00oO0o o00oo0o2 = tag instanceof o00oO0o ? (o00oO0o) tag : null;
        if (o00oo0o2 == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i);
                o00oO0o o00oo0o3 = tag2 instanceof o00oO0o ? (o00oO0o) tag2 : null;
                if (o00oo0o3 == null) {
                    o00oo0o2 = new o00oO0o();
                    view.addOnAttachStateChangeListener(o00oo0o2);
                    view.setTag(i, o00oo0o2);
                } else {
                    o00oo0o2 = o00oo0o3;
                }
            }
        }
        return o00oo0o2;
    }

    @NotNull
    public static final Scale OooO0Oo(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : OooO00o.$EnumSwitchMapping$1[scaleType.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
    }

    public static final void OooO0o0(@NotNull oo000o oo000oVar) {
        Intrinsics.checkNotNullParameter(oo000oVar, "<this>");
        OooO0O0 oooO0O0OooO0OO = oo000oVar.OooO0OO();
        OooO0OO oooO0OO = oooO0O0OooO0OO instanceof OooO0OO ? (OooO0OO) oooO0O0OooO0OO : null;
        View view = oooO0OO != null ? oooO0OO.getView() : null;
        if (view == null) {
            return;
        }
        OooO0OO(view);
    }
}
