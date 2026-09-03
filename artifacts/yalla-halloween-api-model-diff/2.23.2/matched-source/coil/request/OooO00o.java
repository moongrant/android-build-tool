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
import coil.memory.MemoryCache;
import coil.size.Precision;
import coil.size.Scale;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o00O.OooO0OO;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.OooOOOO;
import p125o00O0o0O.o0ooOOo;
import p130o00O0oo.o000O0;
import p130o00O0oo.o000O00;
import p130o00O0oo.o000O00O;
import p130o00O0oo.o000O0O0;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000OO0O;
import p131o00O0oo0.o00000;
import p131o00O0oo0.o000OOo;
import p131o00O0oo0.o00Oo0;
import p131o00O0oo0.o00Ooo;
import p131o00O0oo0.o0OO00O;
import p131o00O0oo0.o0OOO0o;
import p132o00O0ooo.o00O00;
import p132o00O0ooo.o00O000o;
import p641o0ooOO0o.o0O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Precision f11638OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f11639OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Object f11640OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o00O000o f11641OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f11642OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f11643OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final MemoryCache.Key f11644OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f11645OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final ColorSpace f11646OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Pair<o0ooOOo.OooO00o<?>, Class<?>> f11647OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final OooOOOO.OooO00o f11648OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final List<OooO0OO> f11649OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o0O000 f11650OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o00OO000.OooO0OO.OooO00o f11651OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o00000 f11652OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f11653OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f11654OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f11655OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f11656OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11657OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f11658OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final CachePolicy f11659OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final CachePolicy f11660OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11661OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11662OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11663OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final Lifecycle f11664OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final Scale f11665OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final o000OO0O f11666OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final o000OOo f11667OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public final MemoryCache.Key f11668OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public final Drawable f11669Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final Integer f11670Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public final Drawable f11671Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public final Integer f11672Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public final Integer f11673Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public final Drawable f11674Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f11675Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @NotNull
    public final o00Ooo f11676Oooo0o0;

    public interface OooO0O0 {
        @MainThread
        void onCancel();

        @MainThread
        void onError();

        @MainThread
        void onStart();

        @MainThread
        void onSuccess();
    }

    public OooO00o() {
        throw null;
    }

    public OooO00o(Context context, Object obj, o00O000o o00o000o2, OooO0O0 oooO0O0, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, OooOOOO.OooO00o oooO00o, List list, o00OO000.OooO0OO.OooO00o oooO00o2, o0O000 o0o001, o00000 o00000Var, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, o000OO0O o000oo0o2, Scale scale, o000OOo o000ooo2, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, o00Ooo o00ooo2, o00Oo0 o00oo1) {
        this.f11639OooO00o = context;
        this.f11640OooO0O0 = obj;
        this.f11641OooO0OO = o00o000o2;
        this.f11642OooO0Oo = oooO0O0;
        this.f11644OooO0o0 = key;
        this.f11643OooO0o = str;
        this.f11645OooO0oO = config;
        this.f11646OooO0oo = colorSpace;
        this.f11638OooO = precision;
        this.f11647OooOO0 = pair;
        this.f11648OooOO0O = oooO00o;
        this.f11649OooOO0o = list;
        this.f11651OooOOO0 = oooO00o2;
        this.f11650OooOOO = o0o001;
        this.f11652OooOOOO = o00000Var;
        this.f11653OooOOOo = z;
        this.f11655OooOOo0 = z2;
        this.f11654OooOOo = z3;
        this.f11656OooOOoo = z4;
        this.f11659OooOo00 = cachePolicy;
        this.f11658OooOo0 = cachePolicy2;
        this.f11660OooOo0O = cachePolicy3;
        this.f11661OooOo0o = coroutineDispatcher;
        this.f11657OooOo = coroutineDispatcher2;
        this.f11663OooOoO0 = coroutineDispatcher3;
        this.f11662OooOoO = coroutineDispatcher4;
        this.f11664OooOoOO = lifecycle;
        this.f11666OooOoo0 = o000oo0o2;
        this.f11665OooOoo = scale;
        this.f11667OooOooO = o000ooo2;
        this.f11668OooOooo = key2;
        this.f11670Oooo000 = num;
        this.f11671Oooo00O = drawable;
        this.f11672Oooo00o = num2;
        this.f11669Oooo0 = drawable2;
        this.f11673Oooo0O0 = num3;
        this.f11674Oooo0OO = drawable3;
        this.f11676Oooo0o0 = o00ooo2;
        this.f11675Oooo0o = o00oo1;
    }

    public static C0189OooO00o OooO00o(OooO00o oooO00o) {
        Context context = oooO00o.f11639OooO00o;
        oooO00o.getClass();
        return new C0189OooO00o(oooO00o, context);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            if (Intrinsics.areEqual(this.f11639OooO00o, oooO00o.f11639OooO00o) && Intrinsics.areEqual(this.f11640OooO0O0, oooO00o.f11640OooO0O0) && Intrinsics.areEqual(this.f11641OooO0OO, oooO00o.f11641OooO0OO) && Intrinsics.areEqual(this.f11642OooO0Oo, oooO00o.f11642OooO0Oo) && Intrinsics.areEqual(this.f11644OooO0o0, oooO00o.f11644OooO0o0) && Intrinsics.areEqual(this.f11643OooO0o, oooO00o.f11643OooO0o) && this.f11645OooO0oO == oooO00o.f11645OooO0oO && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f11646OooO0oo, oooO00o.f11646OooO0oo)) && this.f11638OooO == oooO00o.f11638OooO && Intrinsics.areEqual(this.f11647OooOO0, oooO00o.f11647OooOO0) && Intrinsics.areEqual(this.f11648OooOO0O, oooO00o.f11648OooOO0O) && Intrinsics.areEqual(this.f11649OooOO0o, oooO00o.f11649OooOO0o) && Intrinsics.areEqual(this.f11651OooOOO0, oooO00o.f11651OooOOO0) && Intrinsics.areEqual(this.f11650OooOOO, oooO00o.f11650OooOOO) && Intrinsics.areEqual(this.f11652OooOOOO, oooO00o.f11652OooOOOO) && this.f11653OooOOOo == oooO00o.f11653OooOOOo && this.f11655OooOOo0 == oooO00o.f11655OooOOo0 && this.f11654OooOOo == oooO00o.f11654OooOOo && this.f11656OooOOoo == oooO00o.f11656OooOOoo && this.f11659OooOo00 == oooO00o.f11659OooOo00 && this.f11658OooOo0 == oooO00o.f11658OooOo0 && this.f11660OooOo0O == oooO00o.f11660OooOo0O && Intrinsics.areEqual(this.f11661OooOo0o, oooO00o.f11661OooOo0o) && Intrinsics.areEqual(this.f11657OooOo, oooO00o.f11657OooOo) && Intrinsics.areEqual(this.f11663OooOoO0, oooO00o.f11663OooOoO0) && Intrinsics.areEqual(this.f11662OooOoO, oooO00o.f11662OooOoO) && Intrinsics.areEqual(this.f11668OooOooo, oooO00o.f11668OooOooo) && Intrinsics.areEqual(this.f11670Oooo000, oooO00o.f11670Oooo000) && Intrinsics.areEqual(this.f11671Oooo00O, oooO00o.f11671Oooo00O) && Intrinsics.areEqual(this.f11672Oooo00o, oooO00o.f11672Oooo00o) && Intrinsics.areEqual(this.f11669Oooo0, oooO00o.f11669Oooo0) && Intrinsics.areEqual(this.f11673Oooo0O0, oooO00o.f11673Oooo0O0) && Intrinsics.areEqual(this.f11674Oooo0OO, oooO00o.f11674Oooo0OO) && Intrinsics.areEqual(this.f11664OooOoOO, oooO00o.f11664OooOoOO) && Intrinsics.areEqual(this.f11666OooOoo0, oooO00o.f11666OooOoo0) && this.f11665OooOoo == oooO00o.f11665OooOoo && Intrinsics.areEqual(this.f11667OooOooO, oooO00o.f11667OooOooO) && Intrinsics.areEqual(this.f11676Oooo0o0, oooO00o.f11676Oooo0o0) && Intrinsics.areEqual(this.f11675Oooo0o, oooO00o.f11675Oooo0o))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11640OooO0O0.hashCode() + (this.f11639OooO00o.hashCode() * 31)) * 31;
        o00O000o o00o000o2 = this.f11641OooO0OO;
        int iHashCode2 = (iHashCode + (o00o000o2 != null ? o00o000o2.hashCode() : 0)) * 31;
        OooO0O0 oooO0O0 = this.f11642OooO0Oo;
        int iHashCode3 = (iHashCode2 + (oooO0O0 != null ? oooO0O0.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f11644OooO0o0;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f11643OooO0o;
        int iHashCode5 = (this.f11645OooO0oO.hashCode() + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ColorSpace colorSpace = this.f11646OooO0oo;
        int iHashCode6 = (this.f11638OooO.hashCode() + ((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31;
        Pair<o0ooOOo.OooO00o<?>, Class<?>> pair = this.f11647OooOO0;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        OooOOOO.OooO00o oooO00o = this.f11648OooOO0O;
        int iHashCode8 = (this.f11667OooOooO.hashCode() + ((this.f11665OooOoo.hashCode() + ((this.f11666OooOoo0.hashCode() + ((this.f11664OooOoOO.hashCode() + ((this.f11662OooOoO.hashCode() + ((this.f11663OooOoO0.hashCode() + ((this.f11657OooOo.hashCode() + ((this.f11661OooOo0o.hashCode() + ((this.f11660OooOo0O.hashCode() + ((this.f11658OooOo0.hashCode() + ((this.f11659OooOo00.hashCode() + ((((((((((this.f11652OooOOOO.hashCode() + ((this.f11650OooOOO.hashCode() + ((this.f11651OooOOO0.hashCode() + ((this.f11649OooOO0o.hashCode() + ((iHashCode7 + (oooO00o != null ? oooO00o.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f11653OooOOOo ? 1231 : 1237)) * 31) + (this.f11655OooOOo0 ? 1231 : 1237)) * 31) + (this.f11654OooOOo ? 1231 : 1237)) * 31) + (this.f11656OooOOoo ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        MemoryCache.Key key2 = this.f11668OooOooo;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.f11670Oooo000;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f11671Oooo00O;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f11672Oooo00o;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f11669Oooo0;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.f11673Oooo0O0;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f11674Oooo0OO;
        return this.f11675Oooo0o.hashCode() + ((this.f11676Oooo0o0.hashCode() + ((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: coil.request.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0189OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final ColorSpace f11677OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f11678OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o00Oo0 f11679OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Object f11680OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o00O000o f11681OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final MemoryCache.Key f11682OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public OooO0O0 f11683OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final String f11684OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final Bitmap.Config f11685OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public Precision f11686OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final Pair<? extends o0ooOOo.OooO00o<?>, ? extends Class<?>> f11687OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO00o f11688OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public o00OO000.OooO0OO.OooO00o f11689OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @NotNull
        public List<? extends OooO0OO> f11690OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public final o0O000.OooO00o f11691OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public final Map<Class<?>, Object> f11692OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @Nullable
        public final Boolean f11693OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final boolean f11694OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @Nullable
        public final Boolean f11695OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f11696OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public final CachePolicy f11697OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final boolean f11698OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public final CachePolicy f11699OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        @Nullable
        public final CachePolicy f11700OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f11701OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f11702OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f11703OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        @Nullable
        public final MemoryCache.Key f11704OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        @Nullable
        public o000OOo.OooO00o f11705OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f11706OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        @Nullable
        public Drawable f11707OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        @Nullable
        public Drawable f11708Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f11709Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        @Nullable
        public Drawable f11710Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f11711Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        @Nullable
        public final Lifecycle f11712Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        @Nullable
        public o000OO0O f11713Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Nullable
        public Lifecycle f11714Oooo0o;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        @Nullable
        public Scale f11715Oooo0o0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public o000OO0O f11716Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public Scale f11717Oooo0oo;

        public C0189OooO00o(@NotNull Context context) {
            this.f11678OooO00o = context;
            this.f11679OooO0O0 = o00OO00O.OooOOOO.f37078OooO00o;
            this.f11680OooO0OO = null;
            this.f11681OooO0Oo = null;
            this.f11683OooO0o0 = null;
            this.f11682OooO0o = null;
            this.f11684OooO0oO = null;
            this.f11685OooO0oo = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f11677OooO = null;
            }
            this.f11686OooOO0 = null;
            this.f11687OooOO0O = null;
            this.f11688OooOO0o = null;
            this.f11690OooOOO0 = CollectionsKt.emptyList();
            this.f11689OooOOO = null;
            this.f11691OooOOOO = null;
            this.f11692OooOOOo = null;
            this.f11694OooOOo0 = true;
            this.f11693OooOOo = null;
            this.f11695OooOOoo = null;
            this.f11698OooOo00 = true;
            this.f11697OooOo0 = null;
            this.f11699OooOo0O = null;
            this.f11700OooOo0o = null;
            this.f11696OooOo = null;
            this.f11702OooOoO0 = null;
            this.f11701OooOoO = null;
            this.f11703OooOoOO = null;
            this.f11705OooOoo0 = null;
            this.f11704OooOoo = null;
            this.f11706OooOooO = null;
            this.f11707OooOooo = null;
            this.f11709Oooo000 = null;
            this.f11710Oooo00O = null;
            this.f11711Oooo00o = null;
            this.f11708Oooo0 = null;
            this.f11712Oooo0O0 = null;
            this.f11713Oooo0OO = null;
            this.f11715Oooo0o0 = null;
            this.f11714Oooo0o = null;
            this.f11716Oooo0oO = null;
            this.f11717Oooo0oo = null;
        }

        public static void OooO0o(C0189OooO00o c0189OooO00o, String str, Serializable serializable) {
            String string = serializable != null ? serializable.toString() : null;
            o000OOo.OooO00o oooO00o = c0189OooO00o.f11705OooOoo0;
            if (oooO00o == null) {
                oooO00o = new o000OOo.OooO00o();
                c0189OooO00o.f11705OooOoo0 = oooO00o;
            }
            oooO00o.f36801OooO00o.put(str, new o000OOo.OooO0O0(serializable, string));
        }

        /* JADX WARN: Code duplicated, block: B:93:0x0144  */
        @NotNull
        public final OooO00o OooO00o() {
            Lifecycle lifecycle;
            View view;
            Lifecycle lifecycle2;
            Context context = this.f11678OooO00o;
            Object obj = this.f11680OooO0OO;
            if (obj == null) {
                obj = o0OO00O.f36852OooO00o;
            }
            Object obj2 = obj;
            o00O000o o00o000o2 = this.f11681OooO0Oo;
            OooO0O0 oooO0O0 = this.f11683OooO0o0;
            MemoryCache.Key key = this.f11682OooO0o;
            String str = this.f11684OooO0oO;
            Bitmap.Config config = this.f11685OooO0oo;
            if (config == null) {
                config = this.f11679OooO0O0.f36811OooO0oO;
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f11677OooO;
            Precision precision = this.f11686OooOO0;
            if (precision == null) {
                precision = this.f11679OooO0O0.f36809OooO0o;
            }
            Precision precision2 = precision;
            Pair<? extends o0ooOOo.OooO00o<?>, ? extends Class<?>> pair = this.f11687OooOO0O;
            OooOOOO.OooO00o oooO00o = this.f11688OooOO0o;
            List<? extends OooO0OO> list = this.f11690OooOOO0;
            o00OO000.OooO0OO.OooO00o oooO00o2 = this.f11689OooOOO;
            if (oooO00o2 == null) {
                oooO00o2 = this.f11679OooO0O0.f36810OooO0o0;
            }
            o00OO000.OooO0OO.OooO00o oooO00o3 = oooO00o2;
            o0O000.OooO00o oooO00o4 = this.f11691OooOOOO;
            o0O000 o0o000OooO0OO = oooO00o4 != null ? oooO00o4.OooO0OO() : null;
            if (o0o000OooO0OO == null) {
                o0o000OooO0OO = OooOo00.f37083OooO0OO;
            } else {
                Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
            }
            Map<Class<?>, Object> map = this.f11692OooOOOo;
            o00000 o00000Var = map != null ? new o00000(o00OO00O.OooO0O0.OooO0O0(map)) : null;
            o00000 o00000Var2 = o00000Var == null ? o00000.f36779OooO0O0 : o00000Var;
            boolean z = this.f11694OooOOo0;
            Boolean bool = this.f11693OooOOo;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f11679OooO0O0.f36812OooO0oo;
            Boolean bool2 = this.f11695OooOOoo;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.f11679OooO0O0.f36804OooO;
            boolean z2 = this.f11698OooOo00;
            CachePolicy cachePolicy = this.f11697OooOo0;
            if (cachePolicy == null) {
                cachePolicy = this.f11679OooO0O0.f36817OooOOO0;
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.f11699OooOo0O;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.f11679OooO0O0.f36816OooOOO;
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.f11700OooOo0o;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.f11679OooO0O0.f36818OooOOOO;
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineDispatcher coroutineDispatcher = this.f11696OooOo;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.f11679OooO0O0.f36805OooO00o;
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.f11702OooOoO0;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.f11679OooO0O0.f36806OooO0O0;
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.f11701OooOoO;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.f11679OooO0O0.f36807OooO0OO;
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.f11703OooOoOO;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.f11679OooO0O0.f36808OooO0Oo;
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Context context2 = this.f11678OooO00o;
            Lifecycle lifecycle3 = this.f11712Oooo0O0;
            if (lifecycle3 == null && (lifecycle3 = this.f11714Oooo0o) == null) {
                o00O000o o00o000o3 = this.f11681OooO0Oo;
                Object context3 = o00o000o3 instanceof o00O00 ? ((o00O00) o00o000o3).getView().getContext() : context2;
                while (true) {
                    if (context3 instanceof LifecycleOwner) {
                        lifecycle2 = ((LifecycleOwner) context3).getLifecycle();
                        break;
                    }
                    if (!(context3 instanceof ContextWrapper)) {
                        lifecycle2 = null;
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
                if (lifecycle2 == null) {
                    lifecycle2 = o0OOO0o.f36853OooO00o;
                }
                lifecycle = lifecycle2;
            } else {
                lifecycle = lifecycle3;
            }
            o000OO0O o000o01 = this.f11713Oooo0OO;
            if (o000o01 == null && (o000o01 = this.f11716Oooo0oO) == null) {
                o00O000o o00o000o4 = this.f11681OooO0Oo;
                if (o00o000o4 instanceof o00O00) {
                    View view2 = ((o00O00) o00o000o4).getView();
                    if (view2 instanceof ImageView) {
                        ImageView.ScaleType scaleType = ((ImageView) view2).getScaleType();
                        if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                            o000o01 = new o000O00O(o000O0Oo.f36770OooO0OO);
                        } else {
                            o000o01 = new o000O0(view2, true);
                        }
                    } else {
                        o000o01 = new o000O0(view2, true);
                    }
                } else {
                    o000o01 = new o000O00(context2);
                }
            }
            o000OO0O o000oo0o2 = o000o01;
            Scale scale = this.f11715Oooo0o0;
            if (scale == null && (scale = this.f11717Oooo0oo) == null) {
                o000OO0O o000oo0o3 = this.f11713Oooo0OO;
                o000O0O0 o000o0o1 = o000oo0o3 instanceof o000O0O0 ? (o000O0O0) o000oo0o3 : null;
                if (o000o0o1 == null || (view = o000o0o1.getView()) == null) {
                    o00O000o o00o000o5 = this.f11681OooO0Oo;
                    o00O00 o00o01 = o00o000o5 instanceof o00O00 ? (o00O00) o00o000o5 : null;
                    view = o00o01 != null ? o00o01.getView() : null;
                }
                if (view instanceof ImageView) {
                    Bitmap.Config[] configArr2 = OooOo00.f37081OooO00o;
                    ImageView.ScaleType scaleType2 = ((ImageView) view).getScaleType();
                    int i = scaleType2 == null ? -1 : OooOo00.OooO00o.$EnumSwitchMapping$1[scaleType2.ordinal()];
                    scale = (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
                } else {
                    scale = Scale.FIT;
                }
            }
            Scale scale2 = scale;
            o000OOo.OooO00o oooO00o5 = this.f11705OooOoo0;
            o000OOo o000ooo2 = oooO00o5 != null ? new o000OOo(o00OO00O.OooO0O0.OooO0O0(oooO00o5.f36801OooO00o)) : null;
            if (o000ooo2 == null) {
                o000ooo2 = o000OOo.f36799OooO0o0;
            }
            return new OooO00o(context, obj2, o00o000o2, oooO0O0, key, str, config2, colorSpace, precision2, pair, oooO00o, list, oooO00o3, o0o000OooO0OO, o00000Var2, z, zBooleanValue, zBooleanValue2, z2, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle, o000oo0o2, scale2, o000ooo2, this.f11704OooOoo, this.f11706OooOooO, this.f11707OooOooo, this.f11709Oooo000, this.f11710Oooo00O, this.f11711Oooo00o, this.f11708Oooo0, new o00Ooo(this.f11712Oooo0O0, this.f11713Oooo0OO, this.f11715Oooo0o0, this.f11696OooOo, this.f11702OooOoO0, this.f11701OooOoO, this.f11703OooOoOO, this.f11689OooOOO, this.f11686OooOO0, this.f11685OooO0oo, this.f11693OooOOo, this.f11695OooOOoo, this.f11697OooOo0, this.f11699OooOo0O, this.f11700OooOo0o), this.f11679OooO0O0);
        }

        @NotNull
        public final void OooO0O0() {
            this.f11689OooOOO = new o00OO000.OooO00o.C0419OooO00o(100, 2);
        }

        @NotNull
        public final void OooO0OO(@DrawableRes int i) {
            this.f11709Oooo000 = Integer.valueOf(i);
            this.f11710Oooo00O = null;
        }

        @NotNull
        public final void OooO0Oo(@DrawableRes int i) {
            this.f11706OooOooO = Integer.valueOf(i);
            this.f11707OooOooo = null;
        }

        public final void OooO0o0() {
            this.f11714Oooo0o = null;
            this.f11716Oooo0oO = null;
            this.f11717Oooo0oo = null;
        }

        @JvmOverloads
        public C0189OooO00o(@NotNull OooO00o oooO00o, @NotNull Context context) {
            this.f11678OooO00o = context;
            this.f11679OooO0O0 = oooO00o.f11675Oooo0o;
            this.f11680OooO0OO = oooO00o.f11640OooO0O0;
            this.f11681OooO0Oo = oooO00o.f11641OooO0OO;
            this.f11683OooO0o0 = oooO00o.f11642OooO0Oo;
            this.f11682OooO0o = oooO00o.f11644OooO0o0;
            this.f11684OooO0oO = oooO00o.f11643OooO0o;
            o00Ooo o00ooo2 = oooO00o.f11676Oooo0o0;
            this.f11685OooO0oo = o00ooo2.f36828OooOO0;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f11677OooO = oooO00o.f11646OooO0oo;
            }
            this.f11686OooOO0 = o00ooo2.f36819OooO;
            this.f11687OooOO0O = oooO00o.f11647OooOO0;
            this.f11688OooOO0o = oooO00o.f11648OooOO0O;
            this.f11690OooOOO0 = oooO00o.f11649OooOO0o;
            this.f11689OooOOO = o00ooo2.f36827OooO0oo;
            this.f11691OooOOOO = oooO00o.f11650OooOOO.OooO0Oo();
            this.f11692OooOOOo = MapsKt.toMutableMap(oooO00o.f11652OooOOOO.f36780OooO00o);
            this.f11694OooOOo0 = oooO00o.f11653OooOOOo;
            this.f11693OooOOo = o00ooo2.f36829OooOO0O;
            this.f11695OooOOoo = o00ooo2.f36830OooOO0o;
            this.f11698OooOo00 = oooO00o.f11656OooOOoo;
            this.f11697OooOo0 = o00ooo2.f36832OooOOO0;
            this.f11699OooOo0O = o00ooo2.f36831OooOOO;
            this.f11700OooOo0o = o00ooo2.f36833OooOOOO;
            this.f11696OooOo = o00ooo2.f36823OooO0Oo;
            this.f11702OooOoO0 = o00ooo2.f36825OooO0o0;
            this.f11701OooOoO = o00ooo2.f36824OooO0o;
            this.f11703OooOoOO = o00ooo2.f36826OooO0oO;
            o000OOo o000ooo2 = oooO00o.f11667OooOooO;
            o000ooo2.getClass();
            this.f11705OooOoo0 = new o000OOo.OooO00o(o000ooo2);
            this.f11704OooOoo = oooO00o.f11668OooOooo;
            this.f11706OooOooO = oooO00o.f11670Oooo000;
            this.f11707OooOooo = oooO00o.f11671Oooo00O;
            this.f11709Oooo000 = oooO00o.f11672Oooo00o;
            this.f11710Oooo00O = oooO00o.f11669Oooo0;
            this.f11711Oooo00o = oooO00o.f11673Oooo0O0;
            this.f11708Oooo0 = oooO00o.f11674Oooo0OO;
            this.f11712Oooo0O0 = o00ooo2.f36820OooO00o;
            this.f11713Oooo0OO = o00ooo2.f36821OooO0O0;
            this.f11715Oooo0o0 = o00ooo2.f36822OooO0OO;
            if (oooO00o.f11639OooO00o == context) {
                this.f11714Oooo0o = oooO00o.f11664OooOoOO;
                this.f11716Oooo0oO = oooO00o.f11666OooOoo0;
                this.f11717Oooo0oo = oooO00o.f11665OooOoo;
            } else {
                this.f11714Oooo0o = null;
                this.f11716Oooo0oO = null;
                this.f11717Oooo0oo = null;
            }
        }
    }
}
