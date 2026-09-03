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
import o00.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103o000oo00.o000oOoO;
import p105o000oo0o.o00O0OO0;
import p109o000ooo.o000OOo;
import p109o000ooo.o0OO00O;
import p109o000ooo.o0OoOo0;
import p109o000ooo.o0ooOOo;
import p109o000ooo.oo000o;
import p111o000oooO.o00O00;
import p111o000oooO.o00O000;
import p111o000oooO.o00O000o;
import p111o000oooO.o00O00O;
import p111o000oooO.o00oOoo;
import p111o000oooO.oOO00O;
import p112o000oooo.o00O0;
import p112o000oooo.oo00o;
import p321o0O0ooO.o000;
import p321o0O0ooO.o000O0O0;
import p321o0O0ooO.o000OO0O;
import p634o0ooO0oO.oo0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Precision f8548OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f8549OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Object f8550OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final oo00o f8551OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f8552OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f8553OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final MemoryCache.Key f8554OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Bitmap.Config f8555OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final ColorSpace f8556OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Pair<o00O0OO0.OooO00o<?>, Class<?>> f8557OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o000oOoO.OooO00o f8558OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final List<OooO0OO> f8559OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final oo0O f8560OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o00O0000.OooO0OO.OooO00o f8561OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o000OOo f8562OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f8563OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f8564OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f8565OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f8566OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f8567OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final CachePolicy f8568OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final CachePolicy f8569OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final CachePolicy f8570OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f8571OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f8572OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f8573OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final Lifecycle f8574OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final Scale f8575OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final o00O00O f8576OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final o0OO00O f8577OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @Nullable
    public final MemoryCache.Key f8578OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @Nullable
    public final Drawable f8579Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public final Integer f8580Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public final Drawable f8581Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @Nullable
    public final Integer f8582Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @Nullable
    public final Integer f8583Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @Nullable
    public final Drawable f8584Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final p109o000ooo.o000oOoO f8585Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f8586Oooo0o0;

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

    public OooO00o(Context context, Object obj, oo00o oo00oVar, OooO0O0 oooO0O0, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, o000oOoO.OooO00o oooO00o, List list, o00O0000.OooO0OO.OooO00o oooO00o2, oo0O oo0o, o000OOo o000ooo2, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, o00O00O o00o00o2, Scale scale, o0OO00O o0oo00o2, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, o0OoOo0 o0oooo0, p109o000ooo.o000oOoO o000oooo2) {
        this.f8549OooO00o = context;
        this.f8550OooO0O0 = obj;
        this.f8551OooO0OO = oo00oVar;
        this.f8552OooO0Oo = oooO0O0;
        this.f8554OooO0o0 = key;
        this.f8553OooO0o = str;
        this.f8555OooO0oO = config;
        this.f8556OooO0oo = colorSpace;
        this.f8548OooO = precision;
        this.f8557OooOO0 = pair;
        this.f8558OooOO0O = oooO00o;
        this.f8559OooOO0o = list;
        this.f8561OooOOO0 = oooO00o2;
        this.f8560OooOOO = oo0o;
        this.f8562OooOOOO = o000ooo2;
        this.f8563OooOOOo = z;
        this.f8565OooOOo0 = z2;
        this.f8564OooOOo = z3;
        this.f8566OooOOoo = z4;
        this.f8569OooOo00 = cachePolicy;
        this.f8568OooOo0 = cachePolicy2;
        this.f8570OooOo0O = cachePolicy3;
        this.f8571OooOo0o = coroutineDispatcher;
        this.f8567OooOo = coroutineDispatcher2;
        this.f8573OooOoO0 = coroutineDispatcher3;
        this.f8572OooOoO = coroutineDispatcher4;
        this.f8574OooOoOO = lifecycle;
        this.f8576OooOoo0 = o00o00o2;
        this.f8575OooOoo = scale;
        this.f8577OooOooO = o0oo00o2;
        this.f8578OooOooo = key2;
        this.f8580Oooo000 = num;
        this.f8581Oooo00O = drawable;
        this.f8582Oooo00o = num2;
        this.f8579Oooo0 = drawable2;
        this.f8583Oooo0O0 = num3;
        this.f8584Oooo0OO = drawable3;
        this.f8586Oooo0o0 = o0oooo0;
        this.f8585Oooo0o = o000oooo2;
    }

    public static C0170OooO00o OooO00o(OooO00o oooO00o) {
        Context context = oooO00o.f8549OooO00o;
        oooO00o.getClass();
        return new C0170OooO00o(oooO00o, context);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) obj;
            if (Intrinsics.areEqual(this.f8549OooO00o, oooO00o.f8549OooO00o) && Intrinsics.areEqual(this.f8550OooO0O0, oooO00o.f8550OooO0O0) && Intrinsics.areEqual(this.f8551OooO0OO, oooO00o.f8551OooO0OO) && Intrinsics.areEqual(this.f8552OooO0Oo, oooO00o.f8552OooO0Oo) && Intrinsics.areEqual(this.f8554OooO0o0, oooO00o.f8554OooO0o0) && Intrinsics.areEqual(this.f8553OooO0o, oooO00o.f8553OooO0o) && this.f8555OooO0oO == oooO00o.f8555OooO0oO && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.f8556OooO0oo, oooO00o.f8556OooO0oo)) && this.f8548OooO == oooO00o.f8548OooO && Intrinsics.areEqual(this.f8557OooOO0, oooO00o.f8557OooOO0) && Intrinsics.areEqual(this.f8558OooOO0O, oooO00o.f8558OooOO0O) && Intrinsics.areEqual(this.f8559OooOO0o, oooO00o.f8559OooOO0o) && Intrinsics.areEqual(this.f8561OooOOO0, oooO00o.f8561OooOOO0) && Intrinsics.areEqual(this.f8560OooOOO, oooO00o.f8560OooOOO) && Intrinsics.areEqual(this.f8562OooOOOO, oooO00o.f8562OooOOOO) && this.f8563OooOOOo == oooO00o.f8563OooOOOo && this.f8565OooOOo0 == oooO00o.f8565OooOOo0 && this.f8564OooOOo == oooO00o.f8564OooOOo && this.f8566OooOOoo == oooO00o.f8566OooOOoo && this.f8569OooOo00 == oooO00o.f8569OooOo00 && this.f8568OooOo0 == oooO00o.f8568OooOo0 && this.f8570OooOo0O == oooO00o.f8570OooOo0O && Intrinsics.areEqual(this.f8571OooOo0o, oooO00o.f8571OooOo0o) && Intrinsics.areEqual(this.f8567OooOo, oooO00o.f8567OooOo) && Intrinsics.areEqual(this.f8573OooOoO0, oooO00o.f8573OooOoO0) && Intrinsics.areEqual(this.f8572OooOoO, oooO00o.f8572OooOoO) && Intrinsics.areEqual(this.f8578OooOooo, oooO00o.f8578OooOooo) && Intrinsics.areEqual(this.f8580Oooo000, oooO00o.f8580Oooo000) && Intrinsics.areEqual(this.f8581Oooo00O, oooO00o.f8581Oooo00O) && Intrinsics.areEqual(this.f8582Oooo00o, oooO00o.f8582Oooo00o) && Intrinsics.areEqual(this.f8579Oooo0, oooO00o.f8579Oooo0) && Intrinsics.areEqual(this.f8583Oooo0O0, oooO00o.f8583Oooo0O0) && Intrinsics.areEqual(this.f8584Oooo0OO, oooO00o.f8584Oooo0OO) && Intrinsics.areEqual(this.f8574OooOoOO, oooO00o.f8574OooOoOO) && Intrinsics.areEqual(this.f8576OooOoo0, oooO00o.f8576OooOoo0) && this.f8575OooOoo == oooO00o.f8575OooOoo && Intrinsics.areEqual(this.f8577OooOooO, oooO00o.f8577OooOooO) && Intrinsics.areEqual(this.f8586Oooo0o0, oooO00o.f8586Oooo0o0) && Intrinsics.areEqual(this.f8585Oooo0o, oooO00o.f8585Oooo0o))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8550OooO0O0.hashCode() + (this.f8549OooO00o.hashCode() * 31)) * 31;
        oo00o oo00oVar = this.f8551OooO0OO;
        int iHashCode2 = (iHashCode + (oo00oVar != null ? oo00oVar.hashCode() : 0)) * 31;
        OooO0O0 oooO0O0 = this.f8552OooO0Oo;
        int iHashCode3 = (iHashCode2 + (oooO0O0 != null ? oooO0O0.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f8554OooO0o0;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f8553OooO0o;
        int iHashCode5 = (this.f8555OooO0oO.hashCode() + ((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ColorSpace colorSpace = this.f8556OooO0oo;
        int iHashCode6 = (this.f8548OooO.hashCode() + ((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31;
        Pair<o00O0OO0.OooO00o<?>, Class<?>> pair = this.f8557OooOO0;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        o000oOoO.OooO00o oooO00o = this.f8558OooOO0O;
        int iHashCode8 = (this.f8577OooOooO.hashCode() + ((this.f8575OooOoo.hashCode() + ((this.f8576OooOoo0.hashCode() + ((this.f8574OooOoOO.hashCode() + ((this.f8572OooOoO.hashCode() + ((this.f8573OooOoO0.hashCode() + ((this.f8567OooOo.hashCode() + ((this.f8571OooOo0o.hashCode() + ((this.f8570OooOo0O.hashCode() + ((this.f8568OooOo0.hashCode() + ((this.f8569OooOo00.hashCode() + ((((((((((this.f8562OooOOOO.hashCode() + ((this.f8560OooOOO.hashCode() + ((this.f8561OooOOO0.hashCode() + ((this.f8559OooOO0o.hashCode() + ((iHashCode7 + (oooO00o != null ? oooO00o.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.f8563OooOOOo ? 1231 : 1237)) * 31) + (this.f8565OooOOo0 ? 1231 : 1237)) * 31) + (this.f8564OooOOo ? 1231 : 1237)) * 31) + (this.f8566OooOOoo ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        MemoryCache.Key key2 = this.f8578OooOooo;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.f8580Oooo000;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f8581Oooo00O;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f8582Oooo00o;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f8579Oooo0;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.f8583Oooo0O0;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f8584Oooo0OO;
        return this.f8585Oooo0o.hashCode() + ((this.f8586Oooo0o0.hashCode() + ((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: coil.request.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0170OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final ColorSpace f8587OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Context f8588OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public p109o000ooo.o000oOoO f8589OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public Object f8590OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public oo00o f8591OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final MemoryCache.Key f8592OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public OooO0O0 f8593OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final String f8594OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final Bitmap.Config f8595OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public Precision f8596OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final Pair<? extends o00O0OO0.OooO00o<?>, ? extends Class<?>> f8597OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        @Nullable
        public final o000oOoO.OooO00o f8598OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public o00O0000.OooO0OO.OooO00o f8599OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @NotNull
        public List<? extends OooO0OO> f8600OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public final oo0O.OooO00o f8601OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        @Nullable
        public final Map<Class<?>, Object> f8602OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @Nullable
        public final Boolean f8603OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public final boolean f8604OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @Nullable
        public final Boolean f8605OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f8606OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public final CachePolicy f8607OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public final boolean f8608OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @Nullable
        public final CachePolicy f8609OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        @Nullable
        public final CachePolicy f8610OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f8611OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f8612OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        @Nullable
        public final CoroutineDispatcher f8613OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        @Nullable
        public final MemoryCache.Key f8614OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        @Nullable
        public o0OO00O.OooO00o f8615OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f8616OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        @Nullable
        public Drawable f8617OooOooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        @Nullable
        public Drawable f8618Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f8619Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        @Nullable
        public Drawable f8620Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        @DrawableRes
        @Nullable
        public Integer f8621Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        @Nullable
        public final Lifecycle f8622Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        @Nullable
        public o00O00O f8623Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Nullable
        public Lifecycle f8624Oooo0o;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        @Nullable
        public Scale f8625Oooo0o0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public o00O00O f8626Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @Nullable
        public Scale f8627Oooo0oo;

        public C0170OooO00o(@NotNull Context context) {
            this.f8588OooO00o = context;
            this.f8589OooO0O0 = o000OO0O.f42849OooO00o;
            this.f8590OooO0OO = null;
            this.f8591OooO0Oo = null;
            this.f8593OooO0o0 = null;
            this.f8592OooO0o = null;
            this.f8594OooO0oO = null;
            this.f8595OooO0oo = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f8587OooO = null;
            }
            this.f8596OooOO0 = null;
            this.f8597OooOO0O = null;
            this.f8598OooOO0o = null;
            this.f8600OooOOO0 = CollectionsKt.emptyList();
            this.f8599OooOOO = null;
            this.f8601OooOOOO = null;
            this.f8602OooOOOo = null;
            this.f8604OooOOo0 = true;
            this.f8603OooOOo = null;
            this.f8605OooOOoo = null;
            this.f8608OooOo00 = true;
            this.f8607OooOo0 = null;
            this.f8609OooOo0O = null;
            this.f8610OooOo0o = null;
            this.f8606OooOo = null;
            this.f8612OooOoO0 = null;
            this.f8611OooOoO = null;
            this.f8613OooOoOO = null;
            this.f8615OooOoo0 = null;
            this.f8614OooOoo = null;
            this.f8616OooOooO = null;
            this.f8617OooOooo = null;
            this.f8619Oooo000 = null;
            this.f8620Oooo00O = null;
            this.f8621Oooo00o = null;
            this.f8618Oooo0 = null;
            this.f8622Oooo0O0 = null;
            this.f8623Oooo0OO = null;
            this.f8625Oooo0o0 = null;
            this.f8624Oooo0o = null;
            this.f8626Oooo0oO = null;
            this.f8627Oooo0oo = null;
        }

        public static void OooO0o(C0170OooO00o c0170OooO00o, String str, Serializable serializable) {
            String string = serializable != null ? serializable.toString() : null;
            o0OO00O.OooO00o oooO00o = c0170OooO00o.f8615OooOoo0;
            if (oooO00o == null) {
                oooO00o = new o0OO00O.OooO00o();
                c0170OooO00o.f8615OooOoo0 = oooO00o;
            }
            oooO00o.f35858OooO00o.put(str, new o0OO00O.OooO0O0(serializable, string));
        }

        /* JADX WARN: Code duplicated, block: B:93:0x0144  */
        @NotNull
        public final OooO00o OooO00o() {
            Lifecycle lifecycle;
            View view;
            Lifecycle lifecycle2;
            Context context = this.f8588OooO00o;
            Object obj = this.f8590OooO0OO;
            if (obj == null) {
                obj = o0ooOOo.f35892OooO00o;
            }
            Object obj2 = obj;
            oo00o oo00oVar = this.f8591OooO0Oo;
            OooO0O0 oooO0O0 = this.f8593OooO0o0;
            MemoryCache.Key key = this.f8592OooO0o;
            String str = this.f8594OooO0oO;
            Bitmap.Config config = this.f8595OooO0oo;
            if (config == null) {
                config = this.f8589OooO0O0.f35838OooO0oO;
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f8587OooO;
            Precision precision = this.f8596OooOO0;
            if (precision == null) {
                precision = this.f8589OooO0O0.f35836OooO0o;
            }
            Precision precision2 = precision;
            Pair<? extends o00O0OO0.OooO00o<?>, ? extends Class<?>> pair = this.f8597OooOO0O;
            o000oOoO.OooO00o oooO00o = this.f8598OooOO0o;
            List<? extends OooO0OO> list = this.f8600OooOOO0;
            o00O0000.OooO0OO.OooO00o oooO00o2 = this.f8599OooOOO;
            if (oooO00o2 == null) {
                oooO00o2 = this.f8589OooO0O0.f35837OooO0o0;
            }
            o00O0000.OooO0OO.OooO00o oooO00o3 = oooO00o2;
            oo0O.OooO00o oooO00o4 = this.f8601OooOOOO;
            oo0O oo0oOooO0OO = oooO00o4 != null ? oooO00o4.OooO0OO() : null;
            if (oo0oOooO0OO == null) {
                oo0oOooO0OO = o000O0O0.f42847OooO0OO;
            } else {
                Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
            }
            Map<Class<?>, Object> map = this.f8602OooOOOo;
            o000OOo o000ooo2 = map != null ? new o000OOo(o000.OooO0O0(map)) : null;
            o000OOo o000ooo3 = o000ooo2 == null ? o000OOo.f35829OooO0O0 : o000ooo2;
            boolean z = this.f8604OooOOo0;
            Boolean bool = this.f8603OooOOo;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f8589OooO0O0.f35839OooO0oo;
            Boolean bool2 = this.f8605OooOOoo;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.f8589OooO0O0.f35831OooO;
            boolean z2 = this.f8608OooOo00;
            CachePolicy cachePolicy = this.f8607OooOo0;
            if (cachePolicy == null) {
                cachePolicy = this.f8589OooO0O0.f35844OooOOO0;
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.f8609OooOo0O;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.f8589OooO0O0.f35843OooOOO;
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.f8610OooOo0o;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.f8589OooO0O0.f35845OooOOOO;
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            CoroutineDispatcher coroutineDispatcher = this.f8606OooOo;
            if (coroutineDispatcher == null) {
                coroutineDispatcher = this.f8589OooO0O0.f35832OooO00o;
            }
            CoroutineDispatcher coroutineDispatcher2 = coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcher3 = this.f8612OooOoO0;
            if (coroutineDispatcher3 == null) {
                coroutineDispatcher3 = this.f8589OooO0O0.f35833OooO0O0;
            }
            CoroutineDispatcher coroutineDispatcher4 = coroutineDispatcher3;
            CoroutineDispatcher coroutineDispatcher5 = this.f8611OooOoO;
            if (coroutineDispatcher5 == null) {
                coroutineDispatcher5 = this.f8589OooO0O0.f35834OooO0OO;
            }
            CoroutineDispatcher coroutineDispatcher6 = coroutineDispatcher5;
            CoroutineDispatcher coroutineDispatcher7 = this.f8613OooOoOO;
            if (coroutineDispatcher7 == null) {
                coroutineDispatcher7 = this.f8589OooO0O0.f35835OooO0Oo;
            }
            CoroutineDispatcher coroutineDispatcher8 = coroutineDispatcher7;
            Context context2 = this.f8588OooO00o;
            Lifecycle lifecycle3 = this.f8622Oooo0O0;
            if (lifecycle3 == null && (lifecycle3 = this.f8624Oooo0o) == null) {
                oo00o oo00oVar2 = this.f8591OooO0Oo;
                Object context3 = oo00oVar2 instanceof o00O0 ? ((o00O0) oo00oVar2).getView().getContext() : context2;
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
                    lifecycle2 = oo000o.f35893OooO00o;
                }
                lifecycle = lifecycle2;
            } else {
                lifecycle = lifecycle3;
            }
            o00O00O o00oooo2 = this.f8623Oooo0OO;
            if (o00oooo2 == null && (o00oooo2 = this.f8626Oooo0oO) == null) {
                oo00o oo00oVar3 = this.f8591OooO0Oo;
                if (oo00oVar3 instanceof o00O0) {
                    View view2 = ((o00O0) oo00oVar3).getView();
                    if (view2 instanceof ImageView) {
                        ImageView.ScaleType scaleType = ((ImageView) view2).getScaleType();
                        if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                            o00oooo2 = new o00O000(o00O00.f35923OooO0OO);
                        } else {
                            o00oooo2 = new o00O000o(view2, true);
                        }
                    } else {
                        o00oooo2 = new o00O000o(view2, true);
                    }
                } else {
                    o00oooo2 = new o00oOoo(context2);
                }
            }
            o00O00O o00o00o2 = o00oooo2;
            Scale scale = this.f8625Oooo0o0;
            if (scale == null && (scale = this.f8627Oooo0oo) == null) {
                o00O00O o00o00o3 = this.f8623Oooo0OO;
                oOO00O ooo00o = o00o00o3 instanceof oOO00O ? (oOO00O) o00o00o3 : null;
                if (ooo00o == null || (view = ooo00o.getView()) == null) {
                    oo00o oo00oVar4 = this.f8591OooO0Oo;
                    o00O0 o00o1 = oo00oVar4 instanceof o00O0 ? (o00O0) oo00oVar4 : null;
                    view = o00o1 != null ? o00o1.getView() : null;
                }
                if (view instanceof ImageView) {
                    Bitmap.Config[] configArr2 = o000O0O0.f42845OooO00o;
                    ImageView.ScaleType scaleType2 = ((ImageView) view).getScaleType();
                    int i = scaleType2 == null ? -1 : o000O0O0.OooO00o.$EnumSwitchMapping$1[scaleType2.ordinal()];
                    scale = (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
                } else {
                    scale = Scale.FIT;
                }
            }
            Scale scale2 = scale;
            o0OO00O.OooO00o oooO00o5 = this.f8615OooOoo0;
            o0OO00O o0oo00o2 = oooO00o5 != null ? new o0OO00O(o000.OooO0O0(oooO00o5.f35858OooO00o)) : null;
            if (o0oo00o2 == null) {
                o0oo00o2 = o0OO00O.f35856OooO0o0;
            }
            return new OooO00o(context, obj2, oo00oVar, oooO0O0, key, str, config2, colorSpace, precision2, pair, oooO00o, list, oooO00o3, oo0oOooO0OO, o000ooo3, z, zBooleanValue, zBooleanValue2, z2, cachePolicy2, cachePolicy4, cachePolicy6, coroutineDispatcher2, coroutineDispatcher4, coroutineDispatcher6, coroutineDispatcher8, lifecycle, o00o00o2, scale2, o0oo00o2, this.f8614OooOoo, this.f8616OooOooO, this.f8617OooOooo, this.f8619Oooo000, this.f8620Oooo00O, this.f8621Oooo00o, this.f8618Oooo0, new o0OoOo0(this.f8622Oooo0O0, this.f8623Oooo0OO, this.f8625Oooo0o0, this.f8606OooOo, this.f8612OooOoO0, this.f8611OooOoO, this.f8613OooOoOO, this.f8599OooOOO, this.f8596OooOO0, this.f8595OooO0oo, this.f8603OooOOo, this.f8605OooOOoo, this.f8607OooOo0, this.f8609OooOo0O, this.f8610OooOo0o), this.f8589OooO0O0);
        }

        @NotNull
        public final void OooO0O0() {
            this.f8599OooOOO = new o00O0000.OooO00o.C0419OooO00o(100, 2);
        }

        @NotNull
        public final void OooO0OO(@DrawableRes int i) {
            this.f8619Oooo000 = Integer.valueOf(i);
            this.f8620Oooo00O = null;
        }

        @NotNull
        public final void OooO0Oo(@DrawableRes int i) {
            this.f8616OooOooO = Integer.valueOf(i);
            this.f8617OooOooo = null;
        }

        public final void OooO0o0() {
            this.f8624Oooo0o = null;
            this.f8626Oooo0oO = null;
            this.f8627Oooo0oo = null;
        }

        @JvmOverloads
        public C0170OooO00o(@NotNull OooO00o oooO00o, @NotNull Context context) {
            this.f8588OooO00o = context;
            this.f8589OooO0O0 = oooO00o.f8585Oooo0o;
            this.f8590OooO0OO = oooO00o.f8550OooO0O0;
            this.f8591OooO0Oo = oooO00o.f8551OooO0OO;
            this.f8593OooO0o0 = oooO00o.f8552OooO0Oo;
            this.f8592OooO0o = oooO00o.f8554OooO0o0;
            this.f8594OooO0oO = oooO00o.f8553OooO0o;
            o0OoOo0 o0oooo0 = oooO00o.f8586Oooo0o0;
            this.f8595OooO0oo = o0oooo0.f35886OooOO0;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f8587OooO = oooO00o.f8556OooO0oo;
            }
            this.f8596OooOO0 = o0oooo0.f35877OooO;
            this.f8597OooOO0O = oooO00o.f8557OooOO0;
            this.f8598OooOO0o = oooO00o.f8558OooOO0O;
            this.f8600OooOOO0 = oooO00o.f8559OooOO0o;
            this.f8599OooOOO = o0oooo0.f35885OooO0oo;
            this.f8601OooOOOO = oooO00o.f8560OooOOO.OooO0Oo();
            this.f8602OooOOOo = MapsKt.toMutableMap(oooO00o.f8562OooOOOO.f35830OooO00o);
            this.f8604OooOOo0 = oooO00o.f8563OooOOOo;
            this.f8603OooOOo = o0oooo0.f35887OooOO0O;
            this.f8605OooOOoo = o0oooo0.f35888OooOO0o;
            this.f8608OooOo00 = oooO00o.f8566OooOOoo;
            this.f8607OooOo0 = o0oooo0.f35890OooOOO0;
            this.f8609OooOo0O = o0oooo0.f35889OooOOO;
            this.f8610OooOo0o = o0oooo0.f35891OooOOOO;
            this.f8606OooOo = o0oooo0.f35881OooO0Oo;
            this.f8612OooOoO0 = o0oooo0.f35883OooO0o0;
            this.f8611OooOoO = o0oooo0.f35882OooO0o;
            this.f8613OooOoOO = o0oooo0.f35884OooO0oO;
            o0OO00O o0oo00o2 = oooO00o.f8577OooOooO;
            o0oo00o2.getClass();
            this.f8615OooOoo0 = new o0OO00O.OooO00o(o0oo00o2);
            this.f8614OooOoo = oooO00o.f8578OooOooo;
            this.f8616OooOooO = oooO00o.f8580Oooo000;
            this.f8617OooOooo = oooO00o.f8581Oooo00O;
            this.f8619Oooo000 = oooO00o.f8582Oooo00o;
            this.f8620Oooo00O = oooO00o.f8579Oooo0;
            this.f8621Oooo00o = oooO00o.f8583Oooo0O0;
            this.f8618Oooo0 = oooO00o.f8584Oooo0OO;
            this.f8622Oooo0O0 = o0oooo0.f35878OooO00o;
            this.f8623Oooo0OO = o0oooo0.f35879OooO0O0;
            this.f8625Oooo0o0 = o0oooo0.f35880OooO0OO;
            if (oooO00o.f8549OooO00o == context) {
                this.f8624Oooo0o = oooO00o.f8574OooOoOO;
                this.f8626Oooo0oO = oooO00o.f8576OooOoo0;
                this.f8627Oooo0oo = oooO00o.f8575OooOoo;
            } else {
                this.f8624Oooo0o = null;
                this.f8626Oooo0oO = null;
                this.f8627Oooo0oo = null;
            }
        }
    }
}
