package coil.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil.memory.MemoryCache$Key;
import coil.size.OriginalSize;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.Size;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o00O0.OooOO0O;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOO;
import o00O0OO0.OooOOO0;
import o00O0OO0.OooOOOO;
import oo0o0O0.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115o00O00oO.Oooo0;
import p117o00O0OOo.OooO;
import p119o00O0Oo0.o00O0O;
import p660o0ooo0o0.o00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final Oooo0 f9875OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f9876OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Object f9877OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o00O0OO.OooO0O0 f9878OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f9879OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final MemoryCache$Key f9880OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final MemoryCache$Key f9881OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final ColorSpace f9882OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Pair<OooOO0O<?>, Class<?>> f9883OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final List<o00O0OOO.OooO0O0> f9884OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00O f9885OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final OooOOOO f9886OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final OooO0o f9887OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lifecycle f9888OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final Scale f9889OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f9890OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final Precision f9891OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final OooO f9892OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f9893OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final CachePolicy f9894OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final boolean f9895OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final boolean f9896OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final boolean f9897OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final boolean f9898OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final CachePolicy f9899OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f9900OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @Nullable
    public final Integer f9901OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public final Integer f9902OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public final Drawable f9903OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public final Drawable f9904OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public final Integer f9905OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final Drawable f9906Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final OooO0OO f9907Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public final o00O0OO0.OooO0O0 f9908Oooo00o;

    public interface OooO0O0 {
        @MainThread
        void OooO00o(@NotNull OooO00o oooO00o);

        @MainThread
        void OooO0O0(@NotNull OooO00o oooO00o);

        @MainThread
        void OooO0OO(@NotNull OooO00o oooO00o, @NotNull Throwable th);

        @MainThread
        void OooO0Oo(@NotNull OooO00o oooO00o, @NotNull OooOOO0.OooO00o oooO00o2);
    }

    public OooO00o(Context context, Object obj, o00O0OO.OooO0O0 oooO0O0, OooO0O0 oooO0O1, MemoryCache$Key memoryCache$Key, MemoryCache$Key memoryCache$Key2, ColorSpace colorSpace, Pair pair, Oooo0 oooo0, List list, o00O o00o2, OooOOOO oooOOOO, Lifecycle lifecycle, OooO0o oooO0o, Scale scale, CoroutineDispatcher coroutineDispatcher, OooO oooO, Precision precision, Bitmap.Config config, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, OooO0OO oooO0OO, o00O0OO0.OooO0O0 oooO0O2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9876OooO00o = context;
        this.f9877OooO0O0 = obj;
        this.f9878OooO0OO = oooO0O0;
        this.f9879OooO0Oo = oooO0O1;
        this.f9881OooO0o0 = memoryCache$Key;
        this.f9880OooO0o = memoryCache$Key2;
        this.f9882OooO0oO = colorSpace;
        this.f9883OooO0oo = pair;
        this.f9875OooO = oooo0;
        this.f9884OooOO0 = list;
        this.f9885OooOO0O = o00o2;
        this.f9886OooOO0o = oooOOOO;
        this.f9888OooOOO0 = lifecycle;
        this.f9887OooOOO = oooO0o;
        this.f9889OooOOOO = scale;
        this.f9890OooOOOo = coroutineDispatcher;
        this.f9892OooOOo0 = oooO;
        this.f9891OooOOo = precision;
        this.f9893OooOOoo = config;
        this.f9896OooOo00 = z;
        this.f9895OooOo0 = z2;
        this.f9897OooOo0O = z3;
        this.f9898OooOo0o = z4;
        this.f9894OooOo = cachePolicy;
        this.f9900OooOoO0 = cachePolicy2;
        this.f9899OooOoO = cachePolicy3;
        this.f9901OooOoOO = num;
        this.f9903OooOoo0 = drawable;
        this.f9902OooOoo = num2;
        this.f9904OooOooO = drawable2;
        this.f9905OooOooo = num3;
        this.f9906Oooo000 = drawable3;
        this.f9907Oooo00O = oooO0OO;
        this.f9908Oooo00o = oooO0O2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            if (Intrinsics.areEqual(this.f9876OooO00o, oooO00o.f9876OooO00o) && Intrinsics.areEqual(this.f9877OooO0O0, oooO00o.f9877OooO0O0) && Intrinsics.areEqual(this.f9878OooO0OO, oooO00o.f9878OooO0OO) && Intrinsics.areEqual(this.f9879OooO0Oo, oooO00o.f9879OooO0Oo) && Intrinsics.areEqual(this.f9881OooO0o0, oooO00o.f9881OooO0o0) && Intrinsics.areEqual(this.f9880OooO0o, oooO00o.f9880OooO0o) && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f9882OooO0oO, oooO00o.f9882OooO0oO)) && Intrinsics.areEqual(this.f9883OooO0oo, oooO00o.f9883OooO0oo) && Intrinsics.areEqual(this.f9875OooO, oooO00o.f9875OooO) && Intrinsics.areEqual(this.f9884OooOO0, oooO00o.f9884OooOO0) && Intrinsics.areEqual(this.f9885OooOO0O, oooO00o.f9885OooOO0O) && Intrinsics.areEqual(this.f9886OooOO0o, oooO00o.f9886OooOO0o) && Intrinsics.areEqual(this.f9888OooOOO0, oooO00o.f9888OooOOO0) && Intrinsics.areEqual(this.f9887OooOOO, oooO00o.f9887OooOOO) && this.f9889OooOOOO == oooO00o.f9889OooOOOO && Intrinsics.areEqual(this.f9890OooOOOo, oooO00o.f9890OooOOOo) && Intrinsics.areEqual(this.f9892OooOOo0, oooO00o.f9892OooOOo0) && this.f9891OooOOo == oooO00o.f9891OooOOo && this.f9893OooOOoo == oooO00o.f9893OooOOoo && this.f9896OooOo00 == oooO00o.f9896OooOo00 && this.f9895OooOo0 == oooO00o.f9895OooOo0 && this.f9897OooOo0O == oooO00o.f9897OooOo0O && this.f9898OooOo0o == oooO00o.f9898OooOo0o && this.f9894OooOo == oooO00o.f9894OooOo && this.f9900OooOoO0 == oooO00o.f9900OooOoO0 && this.f9899OooOoO == oooO00o.f9899OooOoO && Intrinsics.areEqual(this.f9901OooOoOO, oooO00o.f9901OooOoOO) && Intrinsics.areEqual(this.f9903OooOoo0, oooO00o.f9903OooOoo0) && Intrinsics.areEqual(this.f9902OooOoo, oooO00o.f9902OooOoo) && Intrinsics.areEqual(this.f9904OooOooO, oooO00o.f9904OooOooO) && Intrinsics.areEqual(this.f9905OooOooo, oooO00o.f9905OooOooo) && Intrinsics.areEqual(this.f9906Oooo000, oooO00o.f9906Oooo000) && Intrinsics.areEqual(this.f9907Oooo00O, oooO00o.f9907Oooo00O) && Intrinsics.areEqual(this.f9908Oooo00o, oooO00o.f9908Oooo00o))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f9877OooO0O0.hashCode() + (this.f9876OooO00o.hashCode() * 31)) * 31;
        o00O0OO.OooO0O0 oooO0O0 = this.f9878OooO0OO;
        int iHashCode2 = (iHashCode + (oooO0O0 == null ? 0 : oooO0O0.hashCode())) * 31;
        OooO0O0 oooO0O1 = this.f9879OooO0Oo;
        int iHashCode3 = (iHashCode2 + (oooO0O1 == null ? 0 : oooO0O1.hashCode())) * 31;
        MemoryCache$Key memoryCache$Key = this.f9881OooO0o0;
        int iHashCode4 = (iHashCode3 + (memoryCache$Key == null ? 0 : memoryCache$Key.hashCode())) * 31;
        MemoryCache$Key memoryCache$Key2 = this.f9880OooO0o;
        int iHashCode5 = (iHashCode4 + (memoryCache$Key2 == null ? 0 : memoryCache$Key2.hashCode())) * 31;
        ColorSpace colorSpace = this.f9882OooO0oO;
        int iHashCode6 = (iHashCode5 + (colorSpace == null ? 0 : colorSpace.hashCode())) * 31;
        Pair<OooOO0O<?>, Class<?>> pair = this.f9883OooO0oo;
        int iHashCode7 = (iHashCode6 + (pair == null ? 0 : pair.hashCode())) * 31;
        Oooo0 oooo0 = this.f9875OooO;
        int iHashCode8 = (this.f9899OooOoO.hashCode() + ((this.f9900OooOoO0.hashCode() + ((this.f9894OooOo.hashCode() + ((((((((((this.f9893OooOOoo.hashCode() + ((this.f9891OooOOo.hashCode() + ((this.f9892OooOOo0.hashCode() + ((this.f9890OooOOOo.hashCode() + ((this.f9889OooOOOO.hashCode() + ((this.f9887OooOOO.hashCode() + ((this.f9888OooOOO0.hashCode() + ((this.f9886OooOO0o.hashCode() + ((this.f9885OooOO0O.hashCode() + ((this.f9884OooOO0.hashCode() + ((iHashCode7 + (oooo0 == null ? 0 : oooo0.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f9896OooOo00 ? 1231 : 1237)) * 31) + (this.f9895OooOo0 ? 1231 : 1237)) * 31) + (this.f9897OooOo0O ? 1231 : 1237)) * 31) + (this.f9898OooOo0o ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31;
        Integer num = this.f9901OooOoOO;
        int iIntValue = (iHashCode8 + (num == null ? 0 : num.intValue())) * 31;
        Drawable drawable = this.f9903OooOoo0;
        int iHashCode9 = (iIntValue + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Integer num2 = this.f9902OooOoo;
        int iIntValue2 = (iHashCode9 + (num2 == null ? 0 : num2.intValue())) * 31;
        Drawable drawable2 = this.f9904OooOooO;
        int iHashCode10 = (iIntValue2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Integer num3 = this.f9905OooOooo;
        int iIntValue3 = (iHashCode10 + (num3 == null ? 0 : num3.intValue())) * 31;
        Drawable drawable3 = this.f9906Oooo000;
        return this.f9908Oooo00o.hashCode() + ((this.f9907Oooo00O.hashCode() + ((iIntValue3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ImageRequest(context=");
        sbOooO0o0.append(this.f9876OooO00o);
        sbOooO0o0.append(", data=");
        sbOooO0o0.append(this.f9877OooO0O0);
        sbOooO0o0.append(", target=");
        sbOooO0o0.append(this.f9878OooO0OO);
        sbOooO0o0.append(", listener=");
        sbOooO0o0.append(this.f9879OooO0Oo);
        sbOooO0o0.append(", memoryCacheKey=");
        sbOooO0o0.append(this.f9881OooO0o0);
        sbOooO0o0.append(", placeholderMemoryCacheKey=");
        sbOooO0o0.append(this.f9880OooO0o);
        sbOooO0o0.append(", colorSpace=");
        sbOooO0o0.append(this.f9882OooO0oO);
        sbOooO0o0.append(", fetcher=");
        sbOooO0o0.append(this.f9883OooO0oo);
        sbOooO0o0.append(", decoder=");
        sbOooO0o0.append(this.f9875OooO);
        sbOooO0o0.append(", transformations=");
        sbOooO0o0.append(this.f9884OooOO0);
        sbOooO0o0.append(", headers=");
        sbOooO0o0.append(this.f9885OooOO0O);
        sbOooO0o0.append(", parameters=");
        sbOooO0o0.append(this.f9886OooOO0o);
        sbOooO0o0.append(", lifecycle=");
        sbOooO0o0.append(this.f9888OooOOO0);
        sbOooO0o0.append(", sizeResolver=");
        sbOooO0o0.append(this.f9887OooOOO);
        sbOooO0o0.append(", scale=");
        sbOooO0o0.append(this.f9889OooOOOO);
        sbOooO0o0.append(", dispatcher=");
        sbOooO0o0.append(this.f9890OooOOOo);
        sbOooO0o0.append(", transition=");
        sbOooO0o0.append(this.f9892OooOOo0);
        sbOooO0o0.append(", precision=");
        sbOooO0o0.append(this.f9891OooOOo);
        sbOooO0o0.append(", bitmapConfig=");
        sbOooO0o0.append(this.f9893OooOOoo);
        sbOooO0o0.append(", allowConversionToBitmap=");
        sbOooO0o0.append(this.f9896OooOo00);
        sbOooO0o0.append(", allowHardware=");
        sbOooO0o0.append(this.f9895OooOo0);
        sbOooO0o0.append(", allowRgb565=");
        sbOooO0o0.append(this.f9897OooOo0O);
        sbOooO0o0.append(", premultipliedAlpha=");
        sbOooO0o0.append(this.f9898OooOo0o);
        sbOooO0o0.append(", memoryCachePolicy=");
        sbOooO0o0.append(this.f9894OooOo);
        sbOooO0o0.append(", diskCachePolicy=");
        sbOooO0o0.append(this.f9900OooOoO0);
        sbOooO0o0.append(", networkCachePolicy=");
        sbOooO0o0.append(this.f9899OooOoO);
        sbOooO0o0.append(", placeholderResId=");
        sbOooO0o0.append(this.f9901OooOoOO);
        sbOooO0o0.append(", placeholderDrawable=");
        sbOooO0o0.append(this.f9903OooOoo0);
        sbOooO0o0.append(", errorResId=");
        sbOooO0o0.append(this.f9902OooOoo);
        sbOooO0o0.append(", errorDrawable=");
        sbOooO0o0.append(this.f9904OooOooO);
        sbOooO0o0.append(", fallbackResId=");
        sbOooO0o0.append(this.f9905OooOooo);
        sbOooO0o0.append(", fallbackDrawable=");
        sbOooO0o0.append(this.f9906Oooo000);
        sbOooO0o0.append(", defined=");
        sbOooO0o0.append(this.f9907Oooo00O);
        sbOooO0o0.append(", defaults=");
        sbOooO0o0.append(this.f9908Oooo00o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    /* JADX INFO: renamed from: coil.request.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0072OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public Pair<? extends OooOO0O<?>, ? extends Class<?>> f9909OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f9910OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o00O0OO0.OooO0O0 f9911OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Object f9912OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o00O0OO.OooO0O0 f9913OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public MemoryCache$Key f9914OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public OooO0O0 f9915OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public MemoryCache$Key f9916OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public ColorSpace f9917OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public Oooo0 f9918OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @NotNull
        public List<? extends o00O0OOO.OooO0O0> f9919OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public o00O.OooO00o f9920OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public Lifecycle f9921OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public OooOOOO.OooO00o f9922OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public OooO0o f9923OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public Scale f9924OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @Nullable
        public OooO f9925OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public CoroutineDispatcher f9926OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @Nullable
        public Precision f9927OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f9928OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public Boolean f9929OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @Nullable
        public Bitmap.Config f9930OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public Boolean f9931OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f9932OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        @Nullable
        public CachePolicy f9933OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        @Nullable
        public CachePolicy f9934OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        @Nullable
        public CachePolicy f9935OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        @Nullable
        public Drawable f9936OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f9937OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f9938OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        @Nullable
        public Drawable f9939OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        @Nullable
        public OooO0o f9940Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f9941Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        @Nullable
        public Drawable f9942Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        @Nullable
        public Lifecycle f9943Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        @Nullable
        public Scale f9944Oooo0O0;

        public C0072OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f9910OooO00o = context;
            this.f9911OooO0O0 = o00O0OO0.OooO0O0.f30555OooOOO0;
            this.f9912OooO0OO = null;
            this.f9913OooO0Oo = null;
            this.f9915OooO0o0 = null;
            this.f9914OooO0o = null;
            this.f9916OooO0oO = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f9917OooO0oo = null;
            }
            this.f9909OooO = null;
            this.f9918OooOO0 = null;
            this.f9919OooOO0O = CollectionsKt.emptyList();
            this.f9920OooOO0o = null;
            this.f9922OooOOO0 = null;
            this.f9921OooOOO = null;
            this.f9923OooOOOO = null;
            this.f9924OooOOOo = null;
            this.f9926OooOOo0 = null;
            this.f9925OooOOo = null;
            this.f9927OooOOoo = null;
            this.f9930OooOo00 = null;
            this.f9929OooOo0 = null;
            this.f9931OooOo0O = null;
            this.f9932OooOo0o = true;
            this.f9928OooOo = true;
            this.f9934OooOoO0 = null;
            this.f9933OooOoO = null;
            this.f9935OooOoOO = null;
            this.f9937OooOoo0 = null;
            this.f9936OooOoo = null;
            this.f9938OooOooO = null;
            this.f9939OooOooo = null;
            this.f9941Oooo000 = null;
            this.f9942Oooo00O = null;
            this.f9943Oooo00o = null;
            this.f9940Oooo0 = null;
            this.f9944Oooo0O0 = null;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:70:0x0104  */
        /* JADX WARN: Code duplicated, block: B:71:0x010b  */
        @NotNull
        public final OooO00o OooO00o() {
            Lifecycle lifecycle;
            Lifecycle lifecycle2;
            OooO0o oooO0o;
            o00O0OO.OooO0O0 oooO0O0;
            View view;
            OooO0o oooO00o;
            Context context = this.f9910OooO00o;
            Object obj = this.f9912OooO0OO;
            if (obj == null) {
                obj = OooOOO.f30583OooO00o;
            }
            Object obj2 = obj;
            o00O0OO.OooO0O0 oooO0O1 = this.f9913OooO0Oo;
            OooO0O0 oooO0O2 = this.f9915OooO0o0;
            MemoryCache$Key memoryCache$Key = this.f9914OooO0o;
            MemoryCache$Key memoryCache$Key2 = this.f9916OooO0oO;
            ColorSpace colorSpace = this.f9917OooO0oo;
            Pair<? extends OooOO0O<?>, ? extends Class<?>> pair = this.f9909OooO;
            Oooo0 oooo0 = this.f9918OooOO0;
            List<? extends o00O0OOO.OooO0O0> list = this.f9919OooOO0O;
            o00O.OooO00o oooO00o2 = this.f9920OooOO0o;
            Lifecycle lifecycle3 = null;
            o00O o00oOooO0Oo = oooO00o2 == null ? null : oooO00o2.OooO0Oo();
            o00O o00o2 = o00O0O.f30749OooO00o;
            if (o00oOooO0Oo == null) {
                o00oOooO0Oo = o00O0O.f30749OooO00o;
            }
            o00O o00o3 = o00oOooO0Oo;
            OooOOOO.OooO00o oooO00o3 = this.f9922OooOOO0;
            OooOOOO oooOOOO = oooO00o3 == null ? null : new OooOOOO(MapsKt.toMap(oooO00o3.f30590OooO00o), null);
            if (oooOOOO == null) {
                oooOOOO = OooOOOO.f30588Oooo0oO;
            }
            Lifecycle lifecycle4 = this.f9921OooOOO;
            if (lifecycle4 == null && (lifecycle4 = this.f9943Oooo00o) == null) {
                o00O0OO.OooO0O0 oooO0O3 = this.f9913OooO0Oo;
                Object context2 = oooO0O3 instanceof o00O0OO.OooO0OO ? ((o00O0OO.OooO0OO) oooO0O3).getView().getContext() : this.f9910OooO00o;
                while (true) {
                    if (context2 instanceof LifecycleOwner) {
                        lifecycle3 = ((LifecycleOwner) context2).getLifecycle();
                        break;
                    }
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
                if (lifecycle3 == null) {
                    lifecycle3 = o00O0OO0.OooOO0O.f30581OooO00o;
                }
                lifecycle = lifecycle3;
            } else {
                lifecycle = lifecycle4;
            }
            OooO0o oooO0o2 = this.f9923OooOOOO;
            if (oooO0o2 == null && (oooO0o2 = this.f9940Oooo0) == null) {
                o00O0OO.OooO0O0 oooO0O4 = this.f9913OooO0Oo;
                if (oooO0O4 instanceof o00O0OO.OooO0OO) {
                    View view2 = ((o00O0OO.OooO0OO) oooO0O4).getView();
                    lifecycle2 = lifecycle;
                    if (view2 instanceof ImageView) {
                        ImageView.ScaleType scaleType = ((ImageView) view2).getScaleType();
                        if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                            int i = OooO0o.f53348OooO00o;
                            OriginalSize size = OriginalSize.f9945Oooo0o;
                            Intrinsics.checkNotNullParameter(size, "size");
                            oooO00o = new oo0o0O0.OooO0O0(size);
                        } else {
                            int i2 = oo0o0O0.OooO.f53343OooO0O0;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            oooO00o = new oo0o0O0.OooO0OO(view2, true);
                        }
                    } else {
                        int i3 = oo0o0O0.OooO.f53343OooO0O0;
                        Intrinsics.checkNotNullParameter(view2, "view");
                        oooO00o = new oo0o0O0.OooO0OO(view2, true);
                    }
                } else {
                    lifecycle2 = lifecycle;
                    oooO00o = new oo0o0O0.OooO00o(this.f9910OooO00o);
                }
                oooO0o = oooO00o;
            } else {
                lifecycle2 = lifecycle;
                oooO0o = oooO0o2;
            }
            Scale scaleOooO0Oo = this.f9924OooOOOo;
            if (scaleOooO0Oo == null && (scaleOooO0Oo = this.f9944Oooo0O0) == null) {
                OooO0o oooO0o3 = this.f9923OooOOOO;
                if (oooO0o3 instanceof oo0o0O0.OooO) {
                    View view3 = ((oo0o0O0.OooO) oooO0o3).getView();
                    if (view3 instanceof ImageView) {
                        scaleOooO0Oo = o00O0O.OooO0Oo((ImageView) view3);
                    } else {
                        oooO0O0 = this.f9913OooO0Oo;
                        if (oooO0O0 instanceof o00O0OO.OooO0OO) {
                            view = ((o00O0OO.OooO0OO) oooO0O0).getView();
                            if (view instanceof ImageView) {
                                scaleOooO0Oo = o00O0O.OooO0Oo((ImageView) view);
                            } else {
                                scaleOooO0Oo = Scale.FILL;
                            }
                        } else {
                            scaleOooO0Oo = Scale.FILL;
                        }
                    }
                } else {
                    oooO0O0 = this.f9913OooO0Oo;
                    if (oooO0O0 instanceof o00O0OO.OooO0OO) {
                        view = ((o00O0OO.OooO0OO) oooO0O0).getView();
                        if (view instanceof ImageView) {
                            scaleOooO0Oo = o00O0O.OooO0Oo((ImageView) view);
                        } else {
                            scaleOooO0Oo = Scale.FILL;
                        }
                    } else {
                        scaleOooO0Oo = Scale.FILL;
                    }
                }
            }
            Scale scale = scaleOooO0Oo;
            CoroutineDispatcher coroutineDispatcher = this.f9926OooOOo0;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.f9911OooO0O0.f30557OooO00o;
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            OooO oooO = this.f9925OooOOo;
            if (oooO == null) {
                oooO = this.f9911OooO0O0.f30558OooO0O0;
            }
            OooO oooO2 = oooO;
            Precision precision = this.f9927OooOOoo;
            if (precision == null) {
                precision = this.f9911OooO0O0.f30559OooO0OO;
            }
            Precision precision2 = precision;
            Bitmap.Config config = this.f9930OooOo00;
            if (config == null) {
                config = this.f9911OooO0O0.f30560OooO0Oo;
            }
            Bitmap.Config config2 = config;
            boolean z = this.f9928OooOo;
            Boolean bool = this.f9929OooOo0;
            boolean zBooleanValue = bool == null ? this.f9911OooO0O0.f30562OooO0o0 : bool.booleanValue();
            Boolean bool2 = this.f9931OooOo0O;
            boolean zBooleanValue2 = bool2 == null ? this.f9911OooO0O0.f30561OooO0o : bool2.booleanValue();
            boolean z2 = this.f9932OooOo0o;
            CachePolicy cachePolicy = this.f9934OooOoO0;
            CachePolicy cachePolicy2 = cachePolicy == null ? this.f9911OooO0O0.f30565OooOO0 : cachePolicy;
            CachePolicy cachePolicy3 = this.f9933OooOoO;
            OooO0o oooO0o4 = oooO0o;
            CachePolicy cachePolicy4 = cachePolicy3 == null ? this.f9911OooO0O0.f30566OooOO0O : cachePolicy3;
            CachePolicy cachePolicy5 = this.f9935OooOoOO;
            OooOOOO oooOOOO2 = oooOOOO;
            CachePolicy cachePolicy6 = cachePolicy5 == null ? this.f9911OooO0O0.f30567OooOO0o : cachePolicy5;
            OooO0OO oooO0OO = new OooO0OO(this.f9921OooOOO, this.f9923OooOOOO, this.f9924OooOOOo, this.f9926OooOOo0, this.f9925OooOOo, this.f9927OooOOoo, this.f9930OooOo00, this.f9929OooOo0, this.f9931OooOo0O, cachePolicy, cachePolicy3, cachePolicy5);
            o00O0OO0.OooO0O0 oooO0O5 = this.f9911OooO0O0;
            Integer num = this.f9937OooOoo0;
            Drawable drawable = this.f9936OooOoo;
            Integer num2 = this.f9938OooOooO;
            Drawable drawable2 = this.f9939OooOooo;
            Integer num3 = this.f9941Oooo000;
            Drawable drawable3 = this.f9942Oooo00O;
            Intrinsics.checkNotNullExpressionValue(o00o3, "orEmpty()");
            return new OooO00o(context, obj2, oooO0O1, oooO0O2, memoryCache$Key, memoryCache$Key2, colorSpace, pair, oooo0, list, o00o3, oooOOOO2, lifecycle2, oooO0o4, scale, coroutineDispatcher2, oooO2, precision2, config2, z, zBooleanValue, zBooleanValue2, z2, cachePolicy2, cachePolicy4, cachePolicy6, num, drawable, num2, drawable2, num3, drawable3, oooO0OO, oooO0O5, null);
        }

        @NotNull
        public final C0072OooO00o OooO0O0(boolean z) {
            int i = z ? 100 : 0;
            OooO transition = i > 0 ? new p117o00O0OOo.OooO0OO(i, 2) : p117o00O0OOo.OooO0o.f30606OooO00o;
            Intrinsics.checkNotNullParameter(transition, "transition");
            this.f9925OooOOo = transition;
            return this;
        }

        @NotNull
        public final C0072OooO00o OooO0OO(@DrawableRes int i) {
            this.f9938OooOooO = Integer.valueOf(i);
            this.f9939OooOooo = null;
            return this;
        }

        @NotNull
        public final C0072OooO00o OooO0Oo(@DrawableRes int i) {
            this.f9937OooOoo0 = Integer.valueOf(i);
            this.f9936OooOoo = null;
            return this;
        }

        @NotNull
        public final C0072OooO00o OooO0o0(@NotNull Size size) {
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(size, "size");
            oo0o0O0.OooO0O0 resolver = new oo0o0O0.OooO0O0(size);
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            this.f9923OooOOOO = resolver;
            this.f9943Oooo00o = null;
            this.f9940Oooo0 = null;
            this.f9944Oooo0O0 = null;
            return this;
        }

        @JvmOverloads
        public C0072OooO00o(@NotNull OooO00o request, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f9910OooO00o = context;
            this.f9911OooO0O0 = request.f9908Oooo00o;
            this.f9912OooO0OO = request.f9877OooO0O0;
            this.f9913OooO0Oo = request.f9878OooO0OO;
            this.f9915OooO0o0 = request.f9879OooO0Oo;
            this.f9914OooO0o = request.f9881OooO0o0;
            this.f9916OooO0oO = request.f9880OooO0o;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f9917OooO0oo = request.f9882OooO0oO;
            }
            this.f9909OooO = request.f9883OooO0oo;
            this.f9918OooOO0 = request.f9875OooO;
            this.f9919OooOO0O = request.f9884OooOO0;
            this.f9920OooOO0o = request.f9885OooOO0O.OooO0OO();
            this.f9922OooOOO0 = new OooOOOO.OooO00o(request.f9886OooOO0o);
            OooO0OO oooO0OO = request.f9907Oooo00O;
            this.f9921OooOOO = oooO0OO.f30569OooO00o;
            this.f9923OooOOOO = oooO0OO.f30570OooO0O0;
            this.f9924OooOOOo = oooO0OO.f30571OooO0OO;
            this.f9926OooOOo0 = oooO0OO.f30572OooO0Oo;
            this.f9925OooOOo = oooO0OO.f30574OooO0o0;
            this.f9927OooOOoo = oooO0OO.f30573OooO0o;
            this.f9930OooOo00 = oooO0OO.f30575OooO0oO;
            this.f9929OooOo0 = oooO0OO.f30576OooO0oo;
            this.f9931OooOo0O = oooO0OO.f30568OooO;
            this.f9932OooOo0o = request.f9898OooOo0o;
            this.f9928OooOo = request.f9896OooOo00;
            this.f9934OooOoO0 = oooO0OO.f30577OooOO0;
            this.f9933OooOoO = oooO0OO.f30578OooOO0O;
            this.f9935OooOoOO = oooO0OO.f30579OooOO0o;
            this.f9937OooOoo0 = request.f9901OooOoOO;
            this.f9936OooOoo = request.f9903OooOoo0;
            this.f9938OooOooO = request.f9902OooOoo;
            this.f9939OooOooo = request.f9904OooOooO;
            this.f9941Oooo000 = request.f9905OooOooo;
            this.f9942Oooo00O = request.f9906Oooo000;
            if (request.f9876OooO00o == context) {
                this.f9943Oooo00o = request.f9888OooOOO0;
                this.f9940Oooo0 = request.f9887OooOOO;
                this.f9944Oooo0O0 = request.f9889OooOOOO;
            } else {
                this.f9943Oooo00o = null;
                this.f9940Oooo0 = null;
                this.f9944Oooo0O0 = null;
            }
        }
    }
}
