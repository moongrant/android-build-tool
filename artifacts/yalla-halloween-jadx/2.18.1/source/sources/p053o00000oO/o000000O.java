package p053o00000oO;

import android.graphics.Typeface;
import androidx.compose.ui.text.ExperimentalTextApi;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalTextApi
public final class o000000O implements o000OOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OO f27114OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0000O f27115OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000O00O f27116OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00000OO f27117OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Function1<o000Oo0, Object> f27118OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0000O0O f27119OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<Function1<? super o000O0, ? extends Unit>, o000O0> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000Oo0 f27121Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000Oo0 o000oo1) {
            super(1);
            this.f27121Oooo0oO = o000oo1;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0078 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x0079  */
        @Override // kotlin.jvm.functions.Function1
        public final o000O0 invoke(Function1<? super o000O0, ? extends Unit> function1) {
            Typeface typefaceOooO00o;
            Function1<? super o000O0, ? extends Unit> onAsyncCompletion = function1;
            Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
            o000000O o000000o2 = o000000O.this;
            o00000OO o00000oo2 = o000000o2.f27117OooO0Oo;
            o000Oo0 typefaceRequest = this.f27121Oooo0oO;
            o000OO platformFontLoader = o000000o2.f27114OooO00o;
            Function1<o000Oo0, Object> createDefaultTypeface = o000000o2.f27118OooO0o;
            Objects.requireNonNull(o00000oo2);
            Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
            Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
            Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
            Intrinsics.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
            o000OOo o000ooo2 = typefaceRequest.f27146OooO00o;
            o000O0.OooO00o oooO00o = null;
            if (o000ooo2 instanceof o00000O) {
                Objects.requireNonNull((o00000O) o000ooo2);
                o0000O00 fontWeight = typefaceRequest.f27147OooO0O0;
                Intrinsics.checkNotNullParameter(null, "fontList");
                Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
                throw null;
            }
            o000000O o000000o3 = o000000O.this;
            o0000O0O o0000o0o2 = o000000o3.f27119OooO0o0;
            o000Oo0 typefaceRequest2 = this.f27121Oooo0oO;
            o000OO platformFontLoader2 = o000000o3.f27114OooO00o;
            Function1<o000Oo0, Object> createDefaultTypeface2 = o000000o3.f27118OooO0o;
            Objects.requireNonNull(o0000o0o2);
            Intrinsics.checkNotNullParameter(typefaceRequest2, "typefaceRequest");
            Intrinsics.checkNotNullParameter(platformFontLoader2, "platformFontLoader");
            Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
            Intrinsics.checkNotNullParameter(createDefaultTypeface2, "createDefaultTypeface");
            o000OOo o000ooo3 = typefaceRequest2.f27146OooO00o;
            if (!(o000ooo3 == null ? true : o000ooo3 instanceof oo0o0Oo)) {
                if (o000ooo3 instanceof o0000oo) {
                    typefaceOooO00o = o0000o0o2.f27134OooO00o.OooO00o((o0000oo) o000ooo3, typefaceRequest2.f27147OooO0O0, typefaceRequest2.f27148OooO0OO);
                } else if (o000ooo3 instanceof o0000O0) {
                    Objects.requireNonNull((o0000O0) o000ooo3);
                    throw null;
                }
                if (oooO00o != null) {
                    return oooO00o;
                }
                throw new IllegalStateException("Could not load font");
            }
            typefaceOooO00o = o0000o0o2.f27134OooO00o.OooO0O0(typefaceRequest2.f27147OooO0O0, typefaceRequest2.f27148OooO0OO);
            oooO00o = new o000O0.OooO00o(typefaceOooO00o, true);
            if (oooO00o != null) {
                return oooO00o;
            }
            throw new IllegalStateException("Could not load font");
        }
    }

    public o000000O(o000OO platformFontLoader, o0000O platformResolveInterceptor) {
        o000O00O typefaceRequestCache = o00000.f27111OooO00o;
        o00000OO fontListFontFamilyTypefaceAdapter = new o00000OO(o00000.f27112OooO0O0);
        o0000O0O platformFamilyTypefaceAdapter = new o0000O0O();
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        Intrinsics.checkNotNullParameter(platformResolveInterceptor, "platformResolveInterceptor");
        Intrinsics.checkNotNullParameter(typefaceRequestCache, "typefaceRequestCache");
        Intrinsics.checkNotNullParameter(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        Intrinsics.checkNotNullParameter(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.f27114OooO00o = platformFontLoader;
        this.f27115OooO0O0 = platformResolveInterceptor;
        this.f27116OooO0OO = typefaceRequestCache;
        this.f27117OooO0Oo = fontListFontFamilyTypefaceAdapter;
        this.f27119OooO0o0 = platformFamilyTypefaceAdapter;
        this.f27118OooO0o = new o000000(this);
    }

    @Override // o00000oO.o000OOo.OooO0O0
    @NotNull
    public final oO0Oo<Object> OooO00o(@Nullable o000OOo o000ooo2, @NotNull o0000O00 fontWeight, int i, int i2) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        o000OOo o000oooOooO00o = this.f27115OooO0O0.OooO00o(o000ooo2);
        o0000O00 o0000o00OooO0O0 = this.f27115OooO0O0.OooO0O0(fontWeight);
        int iOooO0OO = this.f27115OooO0O0.OooO0OO(i);
        int iOooO0Oo = this.f27115OooO0O0.OooO0Oo(i2);
        this.f27114OooO00o.OooO00o();
        return OooO0O0(new o000Oo0(o000oooOooO00o, o0000o00OooO0O0, iOooO0OO, iOooO0Oo, null));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final oO0Oo<Object> OooO0O0(o000Oo0 typefaceRequest) {
        o000O0 o000o0OooO00o;
        o000O00O o000o00o2 = this.f27116OooO0OO;
        OooO00o resolveTypeface = new OooO00o(typefaceRequest);
        Objects.requireNonNull(o000o00o2);
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        synchronized (o000o00o2.f27142OooO00o) {
            o000o0OooO00o = o000o00o2.f27143OooO0O0.OooO00o(typefaceRequest);
            if (o000o0OooO00o == null) {
                try {
                    o000o0OooO00o = (o000O0) resolveTypeface.invoke(new o000O00(o000o00o2, typefaceRequest));
                    synchronized (o000o00o2.f27142OooO00o) {
                        if (o000o00o2.f27143OooO0O0.OooO00o(typefaceRequest) == null && o000o0OooO00o.OooO0O0()) {
                            o000o00o2.f27143OooO0O0.OooO0O0(typefaceRequest, o000o0OooO00o);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } else if (!o000o0OooO00o.OooO0O0()) {
                o000o00o2.f27143OooO0O0.OooO0OO(typefaceRequest);
                o000o0OooO00o = (o000O0) resolveTypeface.invoke(new o000O00(o000o00o2, typefaceRequest));
                synchronized (o000o00o2.f27142OooO00o) {
                    if (o000o00o2.f27143OooO0O0.OooO00o(typefaceRequest) == null) {
                        o000o00o2.f27143OooO0O0.OooO0O0(typefaceRequest, o000o0OooO00o);
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        return o000o0OooO00o;
    }
}
