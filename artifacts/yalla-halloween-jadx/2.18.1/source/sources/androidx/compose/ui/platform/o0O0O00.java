package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0O0OO0;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0oo0000;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<Configuration> f6590OooO00o = (p100o000oOoO.o00OOOOo) p100o000oOoO.o00OO0O0.OooO0O0(p100o000oOoO.o0O00OOO.f29537OooO00o, OooO00o.f6597Oooo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<Context> f6591OooO0O0 = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO0O0.f6598Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o00000.OooO00o> f6592OooO0OO = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO0OO.f6599Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<LifecycleOwner> f6593OooO0Oo = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO0o.f6600Oooo0o);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<p094o000o0OO.o00Oo0> f6595OooO0o0 = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooO.f6596Oooo0o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<View> f6594OooO0o = (o0oo0000) p100o000oOoO.o00OO0O0.OooO0Oo(OooOO0.f6601Oooo0o);

    public static final class OooO extends Lambda implements Function0<p094o000o0OO.o00Oo0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f6596Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p094o000o0OO.o00Oo0 invoke() {
            o0O0O00.OooO0O0("LocalSavedStateRegistryOwner");
            throw null;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Configuration> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6597Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Configuration invoke() {
            o0O0O00.OooO0O0("LocalConfiguration");
            throw null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Context> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f6598Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            o0O0O00.OooO0O0("LocalContext");
            throw null;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o00000.OooO00o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f6599Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000.OooO00o invoke() {
            o0O0O00.OooO0O0("LocalImageVectorCache");
            throw null;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<LifecycleOwner> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f6600Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleOwner invoke() {
            o0O0O00.OooO0O0("LocalLifecycleOwner");
            throw null;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<View> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f6601Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            o0O0O00.OooO0O0("LocalView");
            throw null;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Configuration, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p100o000oOoO.o0O00OO<Configuration> f6602Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(p100o000oOoO.o0O00OO<Configuration> o0o00oo2) {
            super(1);
            this.f6602Oooo0o = o0o00oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Configuration configuration) {
            Configuration it = configuration;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f6602Oooo0o.setValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f6603Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f6604Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0000O00 f6605Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<p100o000oOoO.oOO00O, Integer, Unit> f6606Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO(AndroidComposeView androidComposeView, o0000O00 o0000o00, Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f6604Oooo0o = androidComposeView;
            this.f6605Oooo0oO = o0000o00;
            this.f6606Oooo0oo = function2;
            this.f6603Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            p100o000oOoO.oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                o000.OooO00o(this.f6604Oooo0o, this.f6605Oooo0oO, this.f6606Oooo0oo, ooo00o2, ((this.f6603Oooo << 3) & 896) | 72);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<p100o000oOoO.o00OOOO0, p100o000oOoO.o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O00 f6607Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o000O00 o000o01) {
            super(1);
            this.f6607Oooo0o = o000o01;
        }

        @Override // kotlin.jvm.functions.Function1
        public final p100o000oOoO.o0o0Oo invoke(p100o000oOoO.o00OOOO0 o00oooo1) {
            p100o000oOoO.o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new o000OOo(this.f6607Oooo0o);
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f6608Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<p100o000oOoO.oOO00O, Integer, Unit> f6609Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f6610Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(AndroidComposeView androidComposeView, Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> function2, int i) {
            super(2);
            this.f6608Oooo0o = androidComposeView;
            this.f6609Oooo0oO = function2;
            this.f6610Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
            num.intValue();
            o0O0O00.OooO00o(this.f6608Oooo0o, this.f6609Oooo0oO, ooo00o, this.f6610Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void OooO00o(@NotNull AndroidComposeView view, @NotNull Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> content, @Nullable p100o000oOoO.oOO00O ooo00o, int i) {
        T t;
        boolean z;
        Intrinsics.checkNotNullParameter(view, "owner");
        Intrinsics.checkNotNullParameter(content, "content");
        p100o000oOoO.oOO00O ooo00oOooOOo = ooo00o.OooOOo(1396852028);
        Context context = view.getContext();
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        o000oOoO.oOO00O.OooO00o.C0323OooO00o c0323OooO00o = o000oOoO.oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o0OOO00.OooO0OO(context.getResources().getConfiguration(), p100o000oOoO.o0O00OOO.f29537OooO00o);
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        p100o000oOoO.o0O00OO o0o00oo2 = (p100o000oOoO.o0O00OO) objOooO0o;
        ooo00oOooOOo.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(o0o00oo2);
        Object objOooO0o2 = ooo00oOooOOo.OooO0o();
        if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = new OooOO0O(o0o00oo2);
            ooo00oOooOOo.Oooo00o(objOooO0o2);
        }
        ooo00oOooOOo.Oooo0o0();
        view.setConfigurationChangeObserver((Function1) objOooO0o2);
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o3 = ooo00oOooOOo.OooO0o();
        if (objOooO0o3 == c0323OooO00o) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            objOooO0o3 = new o0000O00(context);
            ooo00oOooOOo.Oooo00o(objOooO0o3);
        }
        ooo00oOooOOo.Oooo0o0();
        o0000O00 o0000o00 = (o0000O00) objOooO0o3;
        AndroidComposeView.OooO0O0 viewTreeOwners = view.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o4 = ooo00oOooOOo.OooO0o();
        if (objOooO0o4 == c0323OooO00o) {
            p094o000o0OO.o00Oo0 savedStateRegistryOwner = viewTreeOwners.f6266OooO0O0;
            Class<? extends Object>[] clsArr = o000OO0O.f6444OooO00o;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "owner");
            Object parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            Object tag = view2.getTag(p048OoooooO.o0oOO.compose_view_saveable_id_tag);
            LinkedHashMap linkedHashMap = null;
            String id = tag instanceof String ? (String) tag : null;
            if (id == null) {
                id = String.valueOf(view2.getId());
            }
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            String str = p045OooooOo.o00O0OO.class.getSimpleName() + ':' + id;
            p094o000o0OO.o0OoOo0 savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            Bundle bundleOooO00o = savedStateRegistry.OooO00o(str);
            if (bundleOooO00o != null) {
                linkedHashMap = new LinkedHashMap();
                Set<String> setKeySet = bundleOooO00o.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "this.keySet()");
                for (String key : setKeySet) {
                    ArrayList parcelableArrayList = bundleOooO00o.getParcelableArrayList(key);
                    Objects.requireNonNull(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    linkedHashMap.put(key, parcelableArrayList);
                    bundleOooO00o = bundleOooO00o;
                }
            }
            o000O0Oo canBeSaved = o000O0Oo.f6439Oooo0o;
            o0O0O0o0<p045OooooOo.o00O0OO> o0o0o0o0 = p045OooooOo.oo0oOO0.f4048OooO00o;
            Intrinsics.checkNotNullParameter(canBeSaved, "canBeSaved");
            p045OooooOo.o00O0OOO o00o0ooo2 = new p045OooooOo.o00O0OOO(linkedHashMap, canBeSaved);
            try {
                savedStateRegistry.OooO0OO(str, new o000O0(o00o0ooo2));
                z = true;
            } catch (IllegalArgumentException unused) {
                z = false;
            }
            o000O00 o000o01 = new o000O00(o00o0ooo2, new o000O00O(z, savedStateRegistry, str));
            ooo00oOooOOo.Oooo00o(o000o01);
            objOooO0o4 = o000o01;
        }
        ooo00oOooOOo.Oooo0o0();
        o000O00 o000o02 = (o000O00) objOooO0o4;
        p100o000oOoO.o00Oo00.OooO0O0(Unit.INSTANCE, new OooOOO0(o000o02), ooo00oOooOOo);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Configuration configuration = (Configuration) o0o00oo2.getValue();
        Object objOooO0O0 = p023Oooo00O.o000O00.OooO0O0(ooo00oOooOOo, -485908294, -492369756);
        o000oOoO.oOO00O.OooO00o.C0323OooO00o c0323OooO00o2 = o000oOoO.oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0O0 == c0323OooO00o2) {
            objOooO0O0 = new o00000.OooO00o();
            ooo00oOooOOo.Oooo00o(objOooO0O0);
        }
        ooo00oOooOOo.Oooo0o0();
        o00000.OooO00o oooO00o = (o00000.OooO00o) objOooO0O0;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o5 = ooo00oOooOOo.OooO0o();
        if (objOooO0o5 == c0323OooO00o2) {
            ooo00oOooOOo.Oooo00o(configuration);
            t = configuration;
        } else {
            t = objOooO0o5;
        }
        ooo00oOooOOo.Oooo0o0();
        objectRef.element = t;
        ooo00oOooOOo.OooO0o0(-492369756);
        Object objOooO0o6 = ooo00oOooOOo.OooO0o();
        if (objOooO0o6 == c0323OooO00o2) {
            objOooO0o6 = new o00000(objectRef, oooO00o);
            ooo00oOooOOo.Oooo00o(objOooO0o6);
        }
        ooo00oOooOOo.Oooo0o0();
        p100o000oOoO.o00Oo00.OooO0O0(oooO00o, new o000000O(context, (o00000) objOooO0o6), ooo00oOooOOo);
        ooo00oOooOOo.Oooo0o0();
        o0O0O0o0<Configuration> o0o0o0o1 = f6590OooO00o;
        Configuration configuration2 = (Configuration) o0o00oo2.getValue();
        Intrinsics.checkNotNullExpressionValue(configuration2, "configuration");
        p100o000oOoO.o00OO0O0.OooO00o(new o0O0OO0[]{o0o0o0o1.OooO0O0(configuration2), f6591OooO0O0.OooO0O0(context), f6593OooO0Oo.OooO0O0(viewTreeOwners.f6265OooO00o), f6595OooO0o0.OooO0O0(viewTreeOwners.f6266OooO0O0), p045OooooOo.oo0oOO0.f4048OooO00o.OooO0O0(o000o02), f6594OooO0o.OooO0O0(view.getView()), f6592OooO0OO.OooO0O0(oooO00o)}, p043OooooO0.o00O0000.OooO00o(ooo00oOooOOo, 1471621628, new OooOOO(view, o0000o00, content, i)), ooo00oOooOOo, 56);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOOO(view, content, i));
    }

    public static final Void OooO0O0(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
