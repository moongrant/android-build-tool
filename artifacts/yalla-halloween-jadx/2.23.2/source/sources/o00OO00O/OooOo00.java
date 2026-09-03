package o00OO00O;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import coil.decode.DataSource;
import coil.size.Scale;
import java.io.Closeable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p120o00O0OoO.o00000OO;
import p130o00O0oo.o000Oo0;
import p131o00O0oo0.o00000O;
import p641o0ooOO0o.o0O000;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "-Utils")
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Bitmap.Config[] f37081OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Bitmap.Config f37082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o0O000 f37083OooO0OO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
            int[] iArr3 = new int[Scale.values().length];
            iArr3[Scale.FILL.ordinal()] = 1;
            iArr3[Scale.FIT.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f37081OooO00o = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f37082OooO0O0 = i >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f37083OooO0OO = new o0O000.OooO00o().OooO0OO();
    }

    public static final void OooO00o(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @Nullable
    public static final String OooO0O0(@NotNull MimeTypeMap mimeTypeMap, @Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt__StringsKt.substringAfterLast(StringsKt__StringsKt.substringAfterLast$default(StringsKt__StringsKt.substringBeforeLast$default(StringsKt__StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    @NotNull
    public static final o00000O OooO0OO(@NotNull View view) {
        int i = o00000OO.coil_request_manager;
        Object tag = view.getTag(i);
        o00000O o00000o = tag instanceof o00000O ? (o00000O) tag : null;
        if (o00000o == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i);
                o00000O o00000o2 = tag2 instanceof o00000O ? (o00000O) tag2 : null;
                if (o00000o2 != null) {
                    o00000o = o00000o2;
                } else {
                    o00000o = new o00000O(view);
                    view.addOnAttachStateChangeListener(o00000o);
                    view.setTag(i, o00000o);
                }
            }
        }
        return o00000o;
    }

    public static final int OooO0Oo(@NotNull o000Oo0 o000oo1, @NotNull Scale scale) {
        if (o000oo1 instanceof o000Oo0.OooO00o) {
            return ((o000Oo0.OooO00o) o000oo1).f36777OooO00o;
        }
        int i = OooO00o.$EnumSwitchMapping$2[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
