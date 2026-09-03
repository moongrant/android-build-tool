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
import p132o00O0ooo.o00O00O;
import p640o0ooO0oo.o0OOO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Precision f11649OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f11650OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Object f11651OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final o00O00 f11652OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f11653OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f11654OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final MemoryCache.Key f11655OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f11656OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final ColorSpace f11657OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Pair<o0ooOOo.OooO00o<?>, Class<?>> f11658OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final OooOOOO.OooO00o f11659OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final List<OooO0OO> f11660OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final o0OOO0OO f11661OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o00OO000.OooO0OO.OooO00o f11662OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o00000 f11663OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f11664OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f11665OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f11666OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f11667OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11668OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f11669OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final CachePolicy f11670OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final CachePolicy f11671OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11672OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11673OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f11674OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final Lifecycle f11675OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final Scale f11676OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final o000OO0O f11677OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final o000OOo f11678OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public final MemoryCache.Key f11679OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public final Drawable f11680Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final Integer f11681Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public final Drawable f11682Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public final Integer f11683Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public final Integer f11684Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public final Drawable f11685Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f11686Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @NotNull
    public final o00Ooo f11687Oooo0o0;

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

    public OooO00o(Context context, Object obj, o00O00 o00o01, OooO0O0 oooO0O0, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, OooOOOO.OooO00o oooO00o, List list, o00OO000.OooO0OO.OooO00o oooO00o2, o0OOO0OO o0ooo0oo2, o00000 o00000Var, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, o000OO0O o000oo0o2, Scale scale, o000OOo o000ooo2, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, o00Ooo o00ooo2, o00Oo0 o00oo1) {
        this.f11650OooO00o = context;
        this.f11651OooO0O0 = obj;
        this.f11652OooO0OO = o00o01;
        this.f11653OooO0Oo = oooO0O0;
        this.f11655OooO0o0 = key;
        this.f11654OooO0o = str;
        this.f11656OooO0oO = config;
        this.f11657OooO0oo = colorSpace;
        this.f11649OooO = precision;
        this.f11658OooOO0 = pair;
        this.f11659OooOO0O = oooO00o;
        this.f11660OooOO0o = list;
        this.f11662OooOOO0 = oooO00o2;
        this.f11661OooOOO = o0ooo0oo2;
        this.f11663OooOOOO = o00000Var;
        this.f11664OooOOOo = z;
        this.f11666OooOOo0 = z2;
        this.f11665OooOOo = z3;
        this.f11667OooOOoo = z4;
        this.f11670OooOo00 = cachePolicy;
        this.f11669OooOo0 = cachePolicy2;
        this.f11671OooOo0O = cachePolicy3;
        this.f11672OooOo0o = coroutineDispatcher;
        this.f11668OooOo = coroutineDispatcher2;
        this.f11674OooOoO0 = coroutineDispatcher3;
        this.f11673OooOoO = coroutineDispatcher4;
        this.f11675OooOoOO = lifecycle;
        this.f11677OooOoo0 = o000oo0o2;
        this.f11676OooOoo = scale;
        this.f11678OooOooO = o000ooo2;
        this.f11679OooOooo = key2;
        this.f11681Oooo000 = num;
        this.f11682Oooo00O = drawable;
        this.f11683Oooo00o = num2;
        this.f11680Oooo0 = drawable2;
        this.f11684Oooo0O0 = num3;
        this.f11685Oooo0OO = drawable3;
        this.f11687Oooo0o0 = o00ooo2;
        this.f11686Oooo0o = o00oo1;
    }

    public static C0189OooO00o OooO00o(OooO00o oooO00o) {
        Context context = oooO00o.f11650OooO00o;
        oooO00o.getClass();
        return new C0189OooO00o(oooO00o, context);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            if (Intrinsics.areEqual(this.f11650OooO00o, oooO00o.f11650OooO00o) && Intrinsics.areEqual(this.f11651OooO0O0, oooO00o.f11651OooO0O0) && Intrinsics.areEqual(this.f11652OooO0OO, oooO00o.f11652OooO0OO) && Intrinsics.areEqual(this.f11653OooO0Oo, oooO00o.f11653OooO0Oo) && Intrinsics.areEqual(this.f11655OooO0o0, oooO00o.f11655OooO0o0) && Intrinsics.areEqual(this.f11654OooO0o, oooO00o.f11654OooO0o) && this.f11656OooO0oO == oooO00o.f11656OooO0oO && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f11657OooO0oo, oooO00o.f11657OooO0oo)) && this.f11649OooO == oooO00o.f11649OooO && Intrinsics.areEqual(this.f11658OooOO0, oooO00o.f11658OooOO0) && Intrinsics.areEqual(this.f11659OooOO0O, oooO00o.f11659OooOO0O) && Intrinsics.areEqual(this.f11660OooOO0o, oooO00o.f11660OooOO0o) && Intrinsics.areEqual(this.f11662OooOOO0, oooO00o.f11662OooOOO0) && Intrinsics.areEqual(this.f11661OooOOO, oooO00o.f11661OooOOO) && Intrinsics.areEqual(this.f11663OooOOOO, oooO00o.f11663OooOOOO) && this.f11664OooOOOo == oooO00o.f11664OooOOOo && this.f11666OooOOo0 == oooO00o.f11666OooOOo0 && this.f11665OooOOo == oooO00o.f11665OooOOo && this.f11667OooOOoo == oooO00o.f11667OooOOoo && this.f11670OooOo00 == oooO00o.f11670OooOo00 && this.f11669OooOo0 == oooO00o.f11669OooOo0 && this.f11671OooOo0O == oooO00o.f11671OooOo0O && Intrinsics.areEqual(this.f11672OooOo0o, oooO00o.f11672OooOo0o) && Intrinsics.areEqual(this.f11668OooOo, oooO00o.f11668OooOo) && Intrinsics.areEqual(this.f11674OooOoO0, oooO00o.f11674OooOoO0) && Intrinsics.areEqual(this.f11673OooOoO, oooO00o.f11673OooOoO) && Intrinsics.areEqual(this.f11679OooOooo, oooO00o.f11679OooOooo) && Intrinsics.areEqual(this.f11681Oooo000, oooO00o.f11681Oooo000) && Intrinsics.areEqual(this.f11682Oooo00O, oooO00o.f11682Oooo00O) && Intrinsics.areEqual(this.f11683Oooo00o, oooO00o.f11683Oooo00o) && Intrinsics.areEqual(this.f11680Oooo0, oooO00o.f11680Oooo0) && Intrinsics.areEqual(this.f11684Oooo0O0, oooO00o.f11684Oooo0O0) && Intrinsics.areEqual(this.f11685Oooo0OO, oooO00o.f11685Oooo0OO) && Intrinsics.areEqual(this.f11675OooOoOO, oooO00o.f11675OooOoOO) && Intrinsics.areEqual(this.f11677OooOoo0, oooO00o.f11677OooOoo0) && this.f11676OooOoo == oooO00o.f11676OooOoo && Intrinsics.areEqual(this.f11678OooOooO, oooO00o.f11678OooOooO) && Intrinsics.areEqual(this.f11687Oooo0o0, oooO00o.f11687Oooo0o0) && Intrinsics.areEqual(this.f11686Oooo0o, oooO00o.f11686Oooo0o))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11651OooO0O0.hashCode() + (this.f11650OooO00o.hashCode() * 31)) * 31;
        o00O00 o00o01 = this.f11652OooO0OO;
        int iHashCode2 = (iHashCode + (o00o01 != null ? o00o01.hashCode() : 0)) * 31;
        OooO0O0 oooO0O0 = this.f11653OooO0Oo;
        int iHashCode3 = (iHashCode2 + (oooO0O0 != null ? oooO0O0.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f11655OooO0o0;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f11654OooO0o;
        int iHashCode5 = (this.f11656OooO0oO.hashCode() + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ColorSpace colorSpace = this.f11657OooO0oo;
        int iHashCode6 = (this.f11649OooO.hashCode() + ((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31;
        Pair<o0ooOOo.OooO00o<?>, Class<?>> pair = this.f11658OooOO0;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        OooOOOO.OooO00o oooO00o = this.f11659OooOO0O;
        int iHashCode8 = (this.f11678OooOooO.hashCode() + ((this.f11676OooOoo.hashCode() + ((this.f11677OooOoo0.hashCode() + ((this.f11675OooOoOO.hashCode() + ((this.f11673OooOoO.hashCode() + ((this.f11674OooOoO0.hashCode() + ((this.f11668OooOo.hashCode() + ((this.f11672OooOo0o.hashCode() + ((this.f11671OooOo0O.hashCode() + ((this.f11669OooOo0.hashCode() + ((this.f11670OooOo00.hashCode() + ((((((((((this.f11663OooOOOO.hashCode() + ((this.f11661OooOOO.hashCode() + ((this.f11662OooOOO0.hashCode() + ((this.f11660OooOO0o.hashCode() + ((iHashCode7 + (oooO00o != null ? oooO00o.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f11664OooOOOo ? 1231 : 1237)) * 31) + (this.f11666OooOOo0 ? 1231 : 1237)) * 31) + (this.f11665OooOOo ? 1231 : 1237)) * 31) + (this.f11667OooOOoo ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        MemoryCache.Key key2 = this.f11679OooOooo;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.f11681Oooo000;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f11682Oooo00O;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f11683Oooo00o;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f11680Oooo0;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.f11684Oooo0O0;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f11685Oooo0OO;
        return this.f11686Oooo0o.hashCode() + ((this.f11687Oooo0o0.hashCode() + ((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: coil.request.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0189OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final ColorSpace f11688OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f11689OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public o00Oo0 f11690OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Object f11691OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public o00O00 f11692OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final MemoryCache.Key f11693OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public OooO0O0 f11694OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final String f11695OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final Bitmap.Config f11696OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public Precision f11697OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final Pair<? extends o0ooOOo.OooO00o<?>, ? extends Class<?>> f11698OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public final OooOOOO.OooO00o f11699OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public o00OO000.OooO0OO.OooO00o f11700OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @NotNull
        public List<? extends OooO0OO> f11701OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public final o0OOO0OO.OooO00o f11702OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public final Map<Class<?>, Object> f11703OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @Nullable
        public final Boolean f11704OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final boolean f11705OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @Nullable
        public final Boolean f11706OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f11707OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public final CachePolicy f11708OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final boolean f11709OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public final CachePolicy f11710OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        @Nullable
        public final CachePolicy f11711OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f11712OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f11713OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f11714OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        @Nullable
        public final MemoryCache.Key f11715OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        @Nullable
        public o000OOo.OooO00o f11716OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f11717OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        @Nullable
        public Drawable f11718OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        @Nullable
        public Drawable f11719Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f11720Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        @Nullable
        public Drawable f11721Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f11722Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        @Nullable
        public final Lifecycle f11723Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        @Nullable
        public o000OO0O f11724Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Nullable
        public Lifecycle f11725Oooo0o;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        @Nullable
        public Scale f11726Oooo0o0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public o000OO0O f11727Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public Scale f11728Oooo0oo;

        public C0189OooO00o(@NotNull Context context) {
            this.f11689OooO00o = context;
            this.f11690OooO0O0 = o00OO00O.OooOOOO.f37074OooO00o;
            this.f11691OooO0OO = null;
            this.f11692OooO0Oo = null;
            this.f11694OooO0o0 = null;
            this.f11693OooO0o = null;
            this.f11695OooO0oO = null;
            this.f11696OooO0oo = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f11688OooO = null;
            }
            this.f11697OooOO0 = null;
            this.f11698OooOO0O = null;
            this.f11699OooOO0o = null;
            this.f11701OooOOO0 = CollectionsKt.emptyList();
            this.f11700OooOOO = null;
            this.f11702OooOOOO = null;
            this.f11703OooOOOo = null;
            this.f11705OooOOo0 = true;
            this.f11704OooOOo = null;
            this.f11706OooOOoo = null;
            this.f11709OooOo00 = true;
            this.f11708OooOo0 = null;
            this.f11710OooOo0O = null;
            this.f11711OooOo0o = null;
            this.f11707OooOo = null;
            this.f11713OooOoO0 = null;
            this.f11712OooOoO = null;
            this.f11714OooOoOO = null;
            this.f11716OooOoo0 = null;
            this.f11715OooOoo = null;
            this.f11717OooOooO = null;
            this.f11718OooOooo = null;
            this.f11720Oooo000 = null;
            this.f11721Oooo00O = null;
            this.f11722Oooo00o = null;
            this.f11719Oooo0 = null;
            this.f11723Oooo0O0 = null;
            this.f11724Oooo0OO = null;
            this.f11726Oooo0o0 = null;
            this.f11725Oooo0o = null;
            this.f11727Oooo0oO = null;
            this.f11728Oooo0oo = null;
        }

        public static void OooO0o(C0189OooO00o c0189OooO00o, String str, Serializable serializable) {
            String string = serializable != null ? serializable.toString() : null;
            o000OOo.OooO00o oooO00o = c0189OooO00o.f11716OooOoo0;
            if (oooO00o == null) {
                oooO00o = new o000OOo.OooO00o();
                c0189OooO00o.f11716OooOoo0 = oooO00o;
            }
            oooO00o.f36797OooO00o.put(str, new o000OOo.OooO0O0(serializable, string));
        }

        /* JADX WARN: Code duplicated, block: B:93:0x0144  */
        @NotNull
        public final OooO00o OooO00o() {
            Lifecycle lifecycle;
            View view;
            Lifecycle lifecycle2;
            Context context = this.f11689OooO00o;
            Object obj = this.f11691OooO0OO;
            if (obj == null) {
                obj = o0OO00O.f36848OooO00o;
            }
            Object obj2 = obj;
            o00O00 o00o01 = this.f11692OooO0Oo;
            OooO0O0 oooO0O0 = this.f11694OooO0o0;
            MemoryCache.Key key = this.f11693OooO0o;
            String str = this.f11695OooO0oO;
            Bitmap.Config config = this.f11696OooO0oo;
            if (config == null) {
                config = this.f11690OooO0O0.f36807OooO0oO;
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f11688OooO;
            Precision precision = this.f11697OooOO0;
            if (precision == null) {
                precision = this.f11690OooO0O0.f36805OooO0o;
            }
            Precision precision2 = precision;
            Pair<? extends o0ooOOo.OooO00o<?>, ? extends Class<?>> pair = this.f11698OooOO0O;
            OooOOOO.OooO00o oooO00o = this.f11699OooOO0o;
            List<? extends OooO0OO> list = this.f11701OooOOO0;
            o00OO000.OooO0OO.OooO00o oooO00o2 = this.f11700OooOOO;
            if (oooO00o2 == null) {
                oooO00o2 = this.f11690OooO0O0.f36806OooO0o0;
            }
            o00OO000.OooO0OO.OooO00o oooO00o3 = oooO00o2;
            o0OOO0OO.OooO00o oooO00o4 = this.f11702OooOOOO;
            o0OOO0OO o0ooo0ooOooO0OO = oooO00o4 != null ? oooO00o4.OooO0OO() : null;
            if (o0ooo0ooOooO0OO == null) {
                o0ooo0ooOooO0OO = OooOo00.f37079OooO0OO;
            } else {
                Bitmap.Config[] configArr = OooOo00.f37077OooO00o;
            }
            Map<Class<?>, Object> map = this.f11703OooOOOo;
            o00000 o00000Var = map != null ? new o00000(o00OO00O.OooO0O0.OooO0O0(map)) : null;
            o00000 o00000Var2 = o00000Var == null ? o00000.f36775OooO0O0 : o00000Var;
            boolean z = this.f11705OooOOo0;
            Boolean bool = this.f11704OooOOo;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f11690OooO0O0.f36808OooO0oo;
            Boolean bool2 = this.f11706OooOOoo;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.f11690OooO0O0.f36800OooO;
            boolean z2 = this.f11709OooOo00;
            CachePolicy cachePolicy = this.f11708OooOo0;
            if (cachePolicy == null) {
                cachePolicy = this.f11690OooO0O0.f36813OooOOO0;
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.f11710OooOo0O;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.f11690OooO0O0.f36812OooOOO;
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.f11711OooOo0o;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.f11690OooO0O0.f36814OooOOOO;
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineDispatcher coroutineDispatcher = this.f11707OooOo;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.f11690OooO0O0.f36801OooO00o;
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.f11713OooOoO0;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.f11690OooO0O0.f36802OooO0O0;
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.f11712OooOoO;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.f11690OooO0O0.f36803OooO0OO;
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.f11714OooOoOO;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.f11690OooO0O0.f36804OooO0Oo;
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Context context2 = this.f11689OooO00o;
            Lifecycle lifecycle3 = this.f11723Oooo0O0;
            if (lifecycle3 == null && (lifecycle3 = this.f11725Oooo0o) == null) {
                o00O00 o00o02 = this.f11692OooO0Oo;
                Object context3 = o00o02 instanceof o00O00O ? ((o00O00O) o00o02).getView().getContext() : context2;
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
                    lifecycle2 = o0OOO0o.f36849OooO00o;
                }
                lifecycle = lifecycle2;
            } else {
                lifecycle = lifecycle3;
            }
            o000OO0O o000o01 = this.f11724Oooo0OO;
            if (o000o01 == null && (o000o01 = this.f11727Oooo0oO) == null) {
                o00O00 o00o03 = this.f11692OooO0Oo;
                if (o00o03 instanceof o00O00O) {
                    View view2 = ((o00O00O) o00o03).getView();
                    if (view2 instanceof ImageView) {
                        ImageView.ScaleType scaleType = ((ImageView) view2).getScaleType();
                        if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                            o000o01 = new o000O00O(o000O0Oo.f36766OooO0OO);
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
            Scale scale = this.f11726Oooo0o0;
            if (scale == null && (scale = this.f11728Oooo0oo) == null) {
                o000OO0O o000oo0o3 = this.f11724Oooo0OO;
                o000O0O0 o000o0o1 = o000oo0o3 instanceof o000O0O0 ? (o000O0O0) o000oo0o3 : null;
                if (o000o0o1 == null || (view = o000o0o1.getView()) == null) {
                    o00O00 o00o04 = this.f11692OooO0Oo;
                    o00O00O o00o00o2 = o00o04 instanceof o00O00O ? (o00O00O) o00o04 : null;
                    view = o00o00o2 != null ? o00o00o2.getView() : null;
                }
                if (view instanceof ImageView) {
                    Bitmap.Config[] configArr2 = OooOo00.f37077OooO00o;
                    ImageView.ScaleType scaleType2 = ((ImageView) view).getScaleType();
                    int i = scaleType2 == null ? -1 : OooOo00.OooO00o.$EnumSwitchMapping$1[scaleType2.ordinal()];
                    scale = (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
                } else {
                    scale = Scale.FIT;
                }
            }
            Scale scale2 = scale;
            o000OOo.OooO00o oooO00o5 = this.f11716OooOoo0;
            o000OOo o000ooo2 = oooO00o5 != null ? new o000OOo(o00OO00O.OooO0O0.OooO0O0(oooO00o5.f36797OooO00o)) : null;
            if (o000ooo2 == null) {
                o000ooo2 = o000OOo.f36795OooO0o0;
            }
            return new OooO00o(context, obj2, o00o01, oooO0O0, key, str, config2, colorSpace, precision2, pair, oooO00o, list, oooO00o3, o0ooo0ooOooO0OO, o00000Var2, z, zBooleanValue, zBooleanValue2, z2, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle, o000oo0o2, scale2, o000ooo2, this.f11715OooOoo, this.f11717OooOooO, this.f11718OooOooo, this.f11720Oooo000, this.f11721Oooo00O, this.f11722Oooo00o, this.f11719Oooo0, new o00Ooo(this.f11723Oooo0O0, this.f11724Oooo0OO, this.f11726Oooo0o0, this.f11707OooOo, this.f11713OooOoO0, this.f11712OooOoO, this.f11714OooOoOO, this.f11700OooOOO, this.f11697OooOO0, this.f11696OooO0oo, this.f11704OooOOo, this.f11706OooOOoo, this.f11708OooOo0, this.f11710OooOo0O, this.f11711OooOo0o), this.f11690OooO0O0);
        }

        @NotNull
        public final void OooO0O0() {
            this.f11700OooOOO = new o00OO000.OooO00o.C0420OooO00o(100, 2);
        }

        @NotNull
        public final void OooO0OO(@DrawableRes int i) {
            this.f11720Oooo000 = Integer.valueOf(i);
            this.f11721Oooo00O = null;
        }

        @NotNull
        public final void OooO0Oo(@DrawableRes int i) {
            this.f11717OooOooO = Integer.valueOf(i);
            this.f11718OooOooo = null;
        }

        public final void OooO0o0() {
            this.f11725Oooo0o = null;
            this.f11727Oooo0oO = null;
            this.f11728Oooo0oo = null;
        }

        @JvmOverloads
        public C0189OooO00o(@NotNull OooO00o oooO00o, @NotNull Context context) {
            this.f11689OooO00o = context;
            this.f11690OooO0O0 = oooO00o.f11686Oooo0o;
            this.f11691OooO0OO = oooO00o.f11651OooO0O0;
            this.f11692OooO0Oo = oooO00o.f11652OooO0OO;
            this.f11694OooO0o0 = oooO00o.f11653OooO0Oo;
            this.f11693OooO0o = oooO00o.f11655OooO0o0;
            this.f11695OooO0oO = oooO00o.f11654OooO0o;
            o00Ooo o00ooo2 = oooO00o.f11687Oooo0o0;
            this.f11696OooO0oo = o00ooo2.f36824OooOO0;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f11688OooO = oooO00o.f11657OooO0oo;
            }
            this.f11697OooOO0 = o00ooo2.f36815OooO;
            this.f11698OooOO0O = oooO00o.f11658OooOO0;
            this.f11699OooOO0o = oooO00o.f11659OooOO0O;
            this.f11701OooOOO0 = oooO00o.f11660OooOO0o;
            this.f11700OooOOO = o00ooo2.f36823OooO0oo;
            this.f11702OooOOOO = oooO00o.f11661OooOOO.OooO0Oo();
            this.f11703OooOOOo = MapsKt.toMutableMap(oooO00o.f11663OooOOOO.f36776OooO00o);
            this.f11705OooOOo0 = oooO00o.f11664OooOOOo;
            this.f11704OooOOo = o00ooo2.f36825OooOO0O;
            this.f11706OooOOoo = o00ooo2.f36826OooOO0o;
            this.f11709OooOo00 = oooO00o.f11667OooOOoo;
            this.f11708OooOo0 = o00ooo2.f36828OooOOO0;
            this.f11710OooOo0O = o00ooo2.f36827OooOOO;
            this.f11711OooOo0o = o00ooo2.f36829OooOOOO;
            this.f11707OooOo = o00ooo2.f36819OooO0Oo;
            this.f11713OooOoO0 = o00ooo2.f36821OooO0o0;
            this.f11712OooOoO = o00ooo2.f36820OooO0o;
            this.f11714OooOoOO = o00ooo2.f36822OooO0oO;
            o000OOo o000ooo2 = oooO00o.f11678OooOooO;
            o000ooo2.getClass();
            this.f11716OooOoo0 = new o000OOo.OooO00o(o000ooo2);
            this.f11715OooOoo = oooO00o.f11679OooOooo;
            this.f11717OooOooO = oooO00o.f11681Oooo000;
            this.f11718OooOooo = oooO00o.f11682Oooo00O;
            this.f11720Oooo000 = oooO00o.f11683Oooo00o;
            this.f11721Oooo00O = oooO00o.f11680Oooo0;
            this.f11722Oooo00o = oooO00o.f11684Oooo0O0;
            this.f11719Oooo0 = oooO00o.f11685Oooo0OO;
            this.f11723Oooo0O0 = o00ooo2.f36816OooO00o;
            this.f11724Oooo0OO = o00ooo2.f36817OooO0O0;
            this.f11726Oooo0o0 = o00ooo2.f36818OooO0OO;
            if (oooO00o.f11650OooO00o == context) {
                this.f11725Oooo0o = oooO00o.f11675OooOoOO;
                this.f11727Oooo0oO = oooO00o.f11677OooOoo0;
                this.f11728Oooo0oo = oooO00o.f11676OooOoo;
            } else {
                this.f11725Oooo0o = null;
                this.f11727Oooo0oO = null;
                this.f11728Oooo0oo = null;
            }
        }
    }
}
