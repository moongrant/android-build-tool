package com.google.accompanist.navigation.animation;

import Oooo000.o000;
import Oooo000.o000000;
import Oooo000.o0000OO0;
import Oooo000.o000O000;
import Oooo000.o000oOoO;
import Oooo000.o00Ooo;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.animation.ExperimentalAnimationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.platform.o0O0O00;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021OooOooo.o00O0O;
import p023Oooo00O.o00oO0o;
import p023Oooo00O.oo00o;
import p023Oooo00O.oo0oOO0;
import p043OooooO0.o00O0000;
import p045OooooOo.o00O0O00;
import p045OooooOo.oo0o0O0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p070o0000ooO.o000OO;
import p086o000OooO.o0000;
import p086o000OooO.o00000;
import p086o000OooO.o00000O;
import p086o000OooO.o000OOo;
import p086o000OooO.o00Oo0;
import p086o000OooO.o0ooOOo;
import p086o000OooO.oo0o0Oo;
import p087o000Oooo.o000O0;
import p087o000Oooo.o000O00O;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class AnimatedNavHostKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Map<String, Function1<o000oOoO<NavBackStackEntry>, o0000OO0>> f12898OooO00o = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Map<String, Function1<o000oOoO<NavBackStackEntry>, o000O000>> f12899OooO0O0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Map<String, Function1<o000oOoO<NavBackStackEntry>, o0000OO0>> f12900OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Map<String, Function1<o000oOoO<NavBackStackEntry>, o000O000>> f12901OooO0Oo = new LinkedHashMap();

    public static final class OooO extends Lambda implements Function1<o000oOoO<NavBackStackEntry>, o0000OO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f12907Oooo0o = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0000OO0 invoke(o000oOoO<NavBackStackEntry> o000oooo2) {
            Intrinsics.checkNotNullParameter(o000oooo2, "$this$null");
            return o000000.OooO0Oo(o00oO0o.OooO0Oo(700, 0, null, 6), 2);
        }
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f12908Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p086o000OooO.o000000 f12909Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.OooO0OO f12910Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f12911Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12912OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12913OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12914OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12915OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f12916OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f12917o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(p086o000OooO.o000000 o000000Var, androidx.navigation.OooO0OO oooO0OO, o00OOOO0 o00oooo1, o00OO0O0 o00oo0o1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function2, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function3, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function4, int i, int i2) {
            super(2);
            this.f12909Oooo0o = o000000Var;
            this.f12910Oooo0oO = oooO0OO;
            this.f12911Oooo0oo = o00oooo1;
            this.f12908Oooo = o00oo0o1;
            this.f12914OoooO00 = function1;
            this.f12913OoooO0 = function2;
            this.f12915OoooO0O = function3;
            this.f12912OoooO = function4;
            this.f12916OoooOO0 = i;
            this.f12917o000oOoO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            AnimatedNavHostKt.OooO00o(this.f12909Oooo0o, this.f12910Oooo0oO, this.f12911Oooo0oo, this.f12908Oooo, this.f12914OoooO00, this.f12913OoooO0, this.f12915OoooO0O, this.f12912OoooO, ooo00o, this.f12916OoooOO0 | 1, this.f12917o000oOoO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o000oOoO<NavBackStackEntry>, o0000OO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f12918Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0000OO0 invoke(o000oOoO<NavBackStackEntry> o000oooo2) {
            Intrinsics.checkNotNullParameter(o000oooo2, "$this$null");
            return o000000.OooO0Oo(o00oO0o.OooO0Oo(700, 0, null, 6), 2);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o000oOoO<NavBackStackEntry>, o000O000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f12919Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o000O000 invoke(o000oOoO<NavBackStackEntry> o000oooo2) {
            Intrinsics.checkNotNullParameter(o000oooo2, "$this$null");
            return o000000.OooO0o0(o00oO0o.OooO0Oo(700, 0, null, 6), 2);
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f12920Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p086o000OooO.o000000 f12921Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f12922Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f12923Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12924OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12925OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f12926OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12927OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12928OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ int f12929OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public final /* synthetic */ int f12930OoooOOo;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ Function1<o000OOo, Unit> f12931o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(p086o000OooO.o000000 o000000Var, String str, o00OOOO0 o00oooo1, o00OO0O0 o00oo0o1, String str2, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function2, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function3, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function4, Function1<? super o000OOo, Unit> function5, int i, int i2) {
            super(2);
            this.f12921Oooo0o = o000000Var;
            this.f12922Oooo0oO = str;
            this.f12923Oooo0oo = o00oooo1;
            this.f12920Oooo = o00oo0o1;
            this.f12926OoooO00 = str2;
            this.f12925OoooO0 = function1;
            this.f12927OoooO0O = function2;
            this.f12924OoooO = function3;
            this.f12928OoooOO0 = function4;
            this.f12931o000oOoO = function5;
            this.f12929OoooOOO = i;
            this.f12930OoooOOo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            AnimatedNavHostKt.OooO0O0(this.f12921Oooo0o, this.f12922Oooo0oO, this.f12923Oooo0oo, this.f12920Oooo, this.f12926OoooO00, this.f12925OoooO0, this.f12927OoooO0O, this.f12924OoooO, this.f12928OoooOO0, this.f12931o000oOoO, ooo00o, this.f12929OoooOOO | 1, this.f12930OoooOOo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<o000oOoO<NavBackStackEntry>, o000O000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f12932Oooo0o = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o000O000 invoke(o000oOoO<NavBackStackEntry> o000oooo2) {
            Intrinsics.checkNotNullParameter(o000oooo2, "$this$null");
            return o000000.OooO0o0(o00oO0o.OooO0Oo(700, 0, null, 6), 2);
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<o000oOoO<NavBackStackEntry>, Oooo000.o000OOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12933Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12934Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<List<NavBackStackEntry>> f12935Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function2, oO0Oo<? extends List<NavBackStackEntry>> oo0oo) {
            super(1);
            this.f12933Oooo0o = function1;
            this.f12934Oooo0oO = function2;
            this.f12935Oooo0oo = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Oooo000.o000OOo invoke(o000oOoO<NavBackStackEntry> o000oooo2) {
            o000oOoO<NavBackStackEntry> AnimatedContent = o000oooo2;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (this.f12935Oooo0oo.getValue().contains(AnimatedContent.OooO00o())) {
                return Oooo000.OooO.OooO0O0(this.f12933Oooo0o.invoke(AnimatedContent), this.f12934Oooo0oO.invoke(AnimatedContent));
            }
            o0000OO0.OooO00o oooO00o = o0000OO0.f856OooO00o;
            o000 o000Var = o0000OO0.f857OooO0O0;
            o000O000.OooO00o oooO00o2 = o000O000.f869OooO00o;
            return Oooo000.OooO.OooO0O0(o000Var, o000O000.f870OooO0O0);
        }
    }

    public static final class OooOOO extends Lambda implements Function4<o00Ooo, NavBackStackEntry, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f12936Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ oO0Oo<List<NavBackStackEntry>> f12937Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOO(o00O0O00 o00o0o01, oO0Oo<? extends List<NavBackStackEntry>> oo0oo) {
            super(4);
            this.f12936Oooo0o = o00o0o01;
            this.f12937Oooo0oO = oo0oo;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(o00Ooo o00ooo2, NavBackStackEntry navBackStackEntry, oOO00O ooo00o, Integer num) {
            NavBackStackEntry navBackStackEntryPrevious;
            o00Ooo AnimatedContent = o00ooo2;
            NavBackStackEntry it = navBackStackEntry;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(it, "it");
            List<NavBackStackEntry> value = this.f12937Oooo0oO.getValue();
            ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
            do {
                if (!listIterator.hasPrevious()) {
                    navBackStackEntryPrevious = null;
                    break;
                }
                navBackStackEntryPrevious = listIterator.previous();
            } while (!Intrinsics.areEqual(it, navBackStackEntryPrevious));
            NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
            if (navBackStackEntry2 != null) {
                o000O0.OooO00o(navBackStackEntry2, this.f12936Oooo0o, o00O0000.OooO00o(ooo00o2, 158545465, new com.google.accompanist.navigation.animation.OooO00o(navBackStackEntry2, AnimatedContent)), ooo00o2, 456);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<NavBackStackEntry, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f12938Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(NavBackStackEntry navBackStackEntry) {
            NavBackStackEntry it = navBackStackEntry;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f12939Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p086o000OooO.o000000 f12940Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.OooO0OO f12941Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f12942Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12943OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12944OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12945OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12946OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f12947OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f12948o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOOOO(p086o000OooO.o000000 o000000Var, androidx.navigation.OooO0OO oooO0OO, o00OOOO0 o00oooo1, o00OO0O0 o00oo0o1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function2, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function3, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function4, int i, int i2) {
            super(2);
            this.f12940Oooo0o = o000000Var;
            this.f12941Oooo0oO = oooO0OO;
            this.f12942Oooo0oo = o00oooo1;
            this.f12939Oooo = o00oo0o1;
            this.f12945OoooO00 = function1;
            this.f12944OoooO0 = function2;
            this.f12946OoooO0O = function3;
            this.f12943OoooO = function4;
            this.f12947OoooOO0 = i;
            this.f12948o000oOoO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            AnimatedNavHostKt.OooO00o(this.f12940Oooo0o, this.f12941Oooo0oO, this.f12942Oooo0oo, this.f12939Oooo, this.f12945OoooO00, this.f12944OoooO0, this.f12946OoooO0O, this.f12943OoooO, ooo00o, this.f12947OoooOO0 | 1, this.f12948o000oOoO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<o000oOoO<NavBackStackEntry>, o0000OO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0.OooO00o f12949Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12950Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12951Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo(o0O00oO0.OooO00o oooO00o, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function2) {
            super(1);
            this.f12949Oooo0o = oooO00o;
            this.f12950Oooo0oO = function1;
            this.f12951Oooo0oo = function2;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<Oooo000.o000oOoO<androidx.navigation.NavBackStackEntry>, Oooo000.o0000OO0>>] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<Oooo000.o000oOoO<androidx.navigation.NavBackStackEntry>, Oooo000.o0000OO0>>] */
        @Override // kotlin.jvm.functions.Function1
        public final o0000OO0 invoke(o000oOoO<NavBackStackEntry> o000oooo2) {
            o000oOoO<NavBackStackEntry> o000oooo3 = o000oooo2;
            Intrinsics.checkNotNullParameter(o000oooo3, "$this$null");
            NavDestination destination = o000oooo3.OooO0OO().getDestination();
            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type com.google.accompanist.navigation.animation.AnimatedComposeNavigator.Destination");
            o0O00oO0.OooO00o.C0359OooO00o c0359OooO00o = (o0O00oO0.OooO00o.C0359OooO00o) destination;
            o0000OO0 o0000oo1 = null;
            if (this.f12949Oooo0o.f35222OooO0OO.getValue().booleanValue()) {
                Iterator<NavDestination> it = NavDestination.f8629OoooOO0.OooO0OO(c0359OooO00o).iterator();
                while (it.hasNext()) {
                    Function1 function1 = (Function1) AnimatedNavHostKt.f12900OooO0OO.get(it.next().f8634OoooO);
                    o0000OO0 o0000oo2 = function1 != null ? (o0000OO0) function1.invoke(o000oooo3) : null;
                    if (o0000oo2 != null) {
                        o0000oo1 = o0000oo2;
                        break;
                    }
                }
                return o0000oo1 == null ? this.f12950Oooo0oO.invoke(o000oooo3) : o0000oo1;
            }
            Iterator<NavDestination> it2 = NavDestination.f8629OoooOO0.OooO0OO(c0359OooO00o).iterator();
            while (it2.hasNext()) {
                Function1 function2 = (Function1) AnimatedNavHostKt.f12898OooO00o.get(it2.next().f8634OoooO);
                o0000OO0 o0000oo3 = function2 != null ? (o0000OO0) function2.invoke(o000oooo3) : null;
                if (o0000oo3 != null) {
                    o0000oo1 = o0000oo3;
                    break;
                }
            }
            return o0000oo1 == null ? this.f12951Oooo0oo.invoke(o000oooo3) : o0000oo1;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o00OO0O0 f12952Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ p086o000OooO.o000000 f12953Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ androidx.navigation.OooO0OO f12954Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00OOOO0 f12955Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12956OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12957OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12958OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o0000OO0> f12959OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ int f12960OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f12961o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOo00(p086o000OooO.o000000 o000000Var, androidx.navigation.OooO0OO oooO0OO, o00OOOO0 o00oooo1, o00OO0O0 o00oo0o1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function2, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function3, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function4, int i, int i2) {
            super(2);
            this.f12953Oooo0o = o000000Var;
            this.f12954Oooo0oO = oooO0OO;
            this.f12955Oooo0oo = o00oooo1;
            this.f12952Oooo = o00oo0o1;
            this.f12958OoooO00 = function1;
            this.f12957OoooO0 = function2;
            this.f12959OoooO0O = function3;
            this.f12956OoooO = function4;
            this.f12960OoooOO0 = i;
            this.f12961o000oOoO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            AnimatedNavHostKt.OooO00o(this.f12953Oooo0o, this.f12954Oooo0oO, this.f12955Oooo0oo, this.f12952Oooo, this.f12958OoooO00, this.f12957OoooO0, this.f12959OoooO0O, this.f12956OoooO, ooo00o, this.f12960OoooOO0 | 1, this.f12961o000oOoO);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<o000oOoO<NavBackStackEntry>, o000O000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O00oO0.OooO00o f12962Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12963Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<o000oOoO<NavBackStackEntry>, o000O000> f12964Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Oooo000(o0O00oO0.OooO00o oooO00o, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function1, Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function2) {
            super(1);
            this.f12962Oooo0o = oooO00o;
            this.f12963Oooo0oO = function1;
            this.f12964Oooo0oo = function2;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<Oooo000.o000oOoO<androidx.navigation.NavBackStackEntry>, Oooo000.o000O000>>] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, kotlin.jvm.functions.Function1<Oooo000.o000oOoO<androidx.navigation.NavBackStackEntry>, Oooo000.o000O000>>] */
        @Override // kotlin.jvm.functions.Function1
        public final o000O000 invoke(o000oOoO<NavBackStackEntry> o000oooo2) {
            o000oOoO<NavBackStackEntry> o000oooo3 = o000oooo2;
            Intrinsics.checkNotNullParameter(o000oooo3, "$this$null");
            NavDestination destination = o000oooo3.OooO00o().getDestination();
            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type com.google.accompanist.navigation.animation.AnimatedComposeNavigator.Destination");
            o0O00oO0.OooO00o.C0359OooO00o c0359OooO00o = (o0O00oO0.OooO00o.C0359OooO00o) destination;
            o000O000 o000o001 = null;
            if (this.f12962Oooo0o.f35222OooO0OO.getValue().booleanValue()) {
                Iterator<NavDestination> it = NavDestination.f8629OoooOO0.OooO0OO(c0359OooO00o).iterator();
                while (it.hasNext()) {
                    Function1 function1 = (Function1) AnimatedNavHostKt.f12901OooO0Oo.get(it.next().f8634OoooO);
                    o000O000 o000o002 = function1 != null ? (o000O000) function1.invoke(o000oooo3) : null;
                    if (o000o002 != null) {
                        o000o001 = o000o002;
                        break;
                    }
                }
                return o000o001 == null ? this.f12963Oooo0oO.invoke(o000oooo3) : o000o001;
            }
            Iterator<NavDestination> it2 = NavDestination.f8629OoooOO0.OooO0OO(c0359OooO00o).iterator();
            while (it2.hasNext()) {
                Function1 function2 = (Function1) AnimatedNavHostKt.f12899OooO0O0.get(it2.next().f8634OoooO);
                o000O000 o000o003 = function2 != null ? (o000O000) function2.invoke(o000oooo3) : null;
                if (o000o003 != null) {
                    o000o001 = o000o003;
                    break;
                }
            }
            return o000o001 == null ? this.f12964Oooo0oo.invoke(o000oooo3) : o000o001;
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x033d  */
    /* JADX WARN: Code duplicated, block: B:147:0x034d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0361  */
    /* JADX WARN: Code duplicated, block: B:153:0x036c  */
    /* JADX WARN: Code duplicated, block: B:158:0x037b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x0394 A[LOOP:15: B:160:0x038e->B:162:0x0394, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:168:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:262:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:387:0x037d A[ADDED_TO_REGION, EDGE_INSN: B:387:0x037d->B:159:0x037d BREAK  A[LOOP:14: B:148:0x0358->B:167:0x03b5], REMOVE, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r13v33, types: [java.util.LinkedHashMap, java.util.Map, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.util.LinkedHashMap, java.util.Map<androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>, o000OooO.o00Oo0$OooO00o>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalAnimationApi
    public static final void OooO00o(@NotNull p086o000OooO.o000000 navController, @NotNull androidx.navigation.OooO0OO graph, @Nullable o00OOOO0 o00oooo1, @Nullable o00OO0O0 o00oo0o1, @Nullable Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function1, @Nullable Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function2, @Nullable Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function3, @Nullable Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function4, @Nullable oOO00O ooo00o, int i, int i2) {
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function5;
        int i3;
        int i4;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function6;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function7;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function8;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function9;
        Object obj;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function10;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function11;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function12;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        Activity activity;
        NavDestination.OooO0O0 OooO0o1;
        ArrayDeque arrayDeque;
        NavDestination navDestination;
        androidx.navigation.OooO0OO oooO0OO;
        ArrayList arrayList;
        Iterator it;
        Bundle bundleOooO0O0;
        String strOooO0O0;
        boolean z2;
        NavDestination navDestinationOooO0oo;
        boolean z3;
        Bundle bundle;
        NavDestination navDestinationOooO0oo2;
        androidx.navigation.OooO0OO oooO0OO2;
        Object obj5;
        ArrayList<String> stringArrayList;
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(graph, "graph");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1872959790);
        o00OOOO0 o00oooo2 = (i2 & 4) != 0 ? o00OOOO0.OooO00o.f4198Oooo0o : o00oooo1;
        o00OO0O0 o00oo0o2 = (i2 & 8) != 0 ? o00OO0O0.OooO00o.f4175OooO0o : o00oo0o1;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function13 = (i2 & 16) != 0 ? OooO.f12907Oooo0o : function1;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function14 = (i2 & 32) != 0 ? OooOO0.f12932Oooo0o : function2;
        if ((i2 & 64) != 0) {
            i3 = i & (-3670017);
            function5 = function13;
        } else {
            function5 = function3;
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            i4 = i3 & (-29360129);
            function6 = function14;
        } else {
            i4 = i3;
            function6 = function4;
        }
        LifecycleOwner owner = (LifecycleOwner) ooo00oOooOOo.OooOO0o(o0O0O00.f6593OooO0Oo);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(ooo00oOooOOo, 8);
        if (current == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
        }
        androidx.activity.OooOOOO oooOOOOOooO00o = p010OooOOo0.OooO.f182OooO00o.OooO00o(ooo00oOooOOo);
        OnBackPressedDispatcher dispatcher = oooOOOOOooO00o != null ? oooOOOOOooO00o.getOnBackPressedDispatcher() : null;
        Objects.requireNonNull(navController);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!Intrinsics.areEqual(owner, navController.f28463OooOOO)) {
            LifecycleOwner lifecycleOwner = navController.f28463OooOOO;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(navController.f28469OooOOoo);
            }
            navController.f28463OooOOO = owner;
            owner.getLifecycle().addObserver(navController.f28469OooOOoo);
        }
        ViewModelStore viewModelStore = current.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStoreOwner.viewModelStore");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        o0ooOOo o0ooooo2 = navController.f28466OooOOOo;
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        int i5 = i4;
        o0ooOOo.OooO00o oooO00o = o0ooOOo.f28531OooO0O0;
        if (!Intrinsics.areEqual(o0ooooo2, (o0ooOOo) new ViewModelProvider(viewModelStore, oooO00o, null, 4, null).get(o0ooOOo.class))) {
            if (!navController.f28458OooO0oO.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            navController.f28466OooOOOo = (o0ooOOo) new ViewModelProvider(viewModelStore, oooO00o, null, 4, null).get(o0ooOOo.class);
        }
        if (dispatcher != null) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            if (!Intrinsics.areEqual(dispatcher, navController.f28465OooOOOO)) {
                LifecycleOwner lifecycleOwner2 = navController.f28463OooOOO;
                if (lifecycleOwner2 == null) {
                    throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
                }
                navController.f28472OooOo00.OooO0O0();
                navController.f28465OooOOOO = dispatcher;
                dispatcher.OooO00o(lifecycleOwner2, navController.f28472OooOo00);
                Lifecycle lifecycle2 = lifecycleOwner2.getLifecycle();
                lifecycle2.removeObserver(navController.f28469OooOOoo);
                lifecycle2.addObserver(navController.f28469OooOOoo);
            }
        }
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(graph, "graph");
        boolean z4 = true;
        if (Intrinsics.areEqual(navController.f28454OooO0OO, graph)) {
            function7 = function14;
            function8 = function5;
            function9 = function6;
            int iOooOO0o = graph.f8656o000oOoO.OooOO0o();
            for (int i6 = 0; i6 < iOooOO0o; i6++) {
                NavDestination newDestination = graph.f8656o000oOoO.OooOOO0(i6);
                androidx.navigation.OooO0OO oooO0OO3 = navController.f28454OooO0OO;
                Intrinsics.checkNotNull(oooO0OO3);
                p021OooOooo.o0ooOOo<NavDestination> o0ooooo3 = oooO0OO3.f8656o000oOoO;
                if (o0ooooo3.f436Oooo0o) {
                    o0ooooo3.OooO0o();
                }
                int iOooO0O0 = o00O0O.OooO0O0(o0ooooo3.f437Oooo0oO, o0ooooo3.f435Oooo, i6);
                if (iOooO0O0 >= 0) {
                    Object[] objArr = o0ooooo3.f438Oooo0oo;
                    Object obj6 = objArr[iOooO0O0];
                    objArr[iOooO0O0] = newDestination;
                }
                ArrayDeque<NavBackStackEntry> arrayDeque2 = navController.f28458OooO0oO;
                ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
                for (NavBackStackEntry navBackStackEntry : arrayDeque2) {
                    if (newDestination != null && navBackStackEntry.getDestination().f8637OoooO0O == newDestination.f8637OoooO0O) {
                        arrayList2.add(navBackStackEntry);
                    }
                }
                for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
                    Intrinsics.checkNotNullExpressionValue(newDestination, "newDestination");
                    navBackStackEntry2.setDestination(newDestination);
                }
            }
        } else {
            androidx.navigation.OooO0OO oooO0OO4 = navController.f28454OooO0OO;
            if (oooO0OO4 != null) {
                for (Integer id : new ArrayList(navController.f28462OooOO0o.keySet())) {
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    int iIntValue = id.intValue();
                    Iterator it2 = navController.f28474OooOo0o.values().iterator();
                    while (it2.hasNext()) {
                        ((o00Oo0.OooO00o) it2.next()).f28436OooO0Oo = z4;
                    }
                    boolean zOooOOo = navController.OooOOo(iIntValue, null, null, null);
                    Iterator it3 = navController.f28474OooOo0o.values().iterator();
                    while (it3.hasNext()) {
                        ((o00Oo0.OooO00o) it3.next()).f28436OooO0Oo = false;
                    }
                    if (zOooOOo) {
                        navController.OooOOO(iIntValue, true, false);
                    }
                    z4 = true;
                }
                navController.OooOOO(oooO0OO4.f8637OoooO0O, z4, false);
            }
            navController.f28454OooO0OO = graph;
            Bundle bundle2 = navController.f28455OooO0Oo;
            if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                for (String name : stringArrayList) {
                    o0000 o0000Var = navController.f28473OooOo0O;
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    o0000Var.OooO0O0(name);
                    Bundle savedState = bundle2.getBundle(name);
                    if (savedState != null) {
                        Intrinsics.checkNotNullParameter(savedState, "savedState");
                    }
                }
            }
            Parcelable[] parcelableArr = navController.f28457OooO0o0;
            if (parcelableArr != null) {
                int length = parcelableArr.length;
                int i7 = 0;
                while (i7 < length) {
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelableArr[i7];
                    NavDestination navDestinationOooO0OO = navController.OooO0OO(navBackStackEntryState.f8627Oooo0oO);
                    if (navDestinationOooO0OO == null) {
                        StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("Restoring the Navigation back stack failed: destination ", NavDestination.f8629OoooOO0.OooO0O0(navController.f28452OooO00o, navBackStackEntryState.f8627Oooo0oO), " cannot be found from the current destination ");
                        sbOooO0OO.append(navController.OooO0oO());
                        throw new IllegalStateException(sbOooO0OO.toString());
                    }
                    Parcelable[] parcelableArr2 = parcelableArr;
                    int i8 = length;
                    NavBackStackEntry navBackStackEntryOooO00o = navBackStackEntryState.OooO00o(navController.f28452OooO00o, navDestinationOooO0OO, navController.OooO(), navController.f28466OooOOOo);
                    Navigator navigatorOooO0O0 = navController.f28473OooOo0O.OooO0O0(navDestinationOooO0OO.f8631Oooo0o);
                    ?? r13 = navController.f28474OooOo0o;
                    Object obj7 = r13.get(navigatorOooO0O0);
                    if (obj7 == null) {
                        obj5 = obj7;
                        o00Oo0.OooO00o oooO00o2 = new o00Oo0.OooO00o(navController, navigatorOooO0O0);
                        r13.put(navigatorOooO0O0, oooO00o2);
                        obj5 = oooO00o2;
                    }
                    obj5 = obj7;
                    navController.f28458OooO0oO.add(navBackStackEntryOooO00o);
                    ((o00Oo0.OooO00o) obj5).OooO0oo(navBackStackEntryOooO00o);
                    androidx.navigation.OooO0OO oooO0OO5 = navBackStackEntryOooO00o.getDestination().f8632Oooo0oO;
                    if (oooO0OO5 != null) {
                        navController.OooOO0O(navBackStackEntryOooO00o, navController.OooO0o0(oooO0OO5.f8637OoooO0O));
                    }
                    i7++;
                    parcelableArr = parcelableArr2;
                    length = i8;
                }
                navController.OooOo0();
                navController.f28457OooO0o0 = null;
            }
            Collection collectionValues = MapsKt.toMap(navController.f28473OooOo0O.f28407OooO00o).values();
            ArrayList<Navigator> arrayList3 = new ArrayList();
            for (Object obj8 : collectionValues) {
                if (!((Navigator) obj8).f8645OooO0O0) {
                    arrayList3.add(obj8);
                }
            }
            for (Navigator navigator : arrayList3) {
                ?? r12 = navController.f28474OooOo0o;
                Object oooO00o3 = r12.get(navigator);
                if (oooO00o3 == null) {
                    oooO00o3 = new o00Oo0.OooO00o(navController, navigator);
                    r12.put(navigator, oooO00o3);
                }
                o00Oo0.OooO00o state = (o00Oo0.OooO00o) oooO00o3;
                Objects.requireNonNull(navigator);
                Intrinsics.checkNotNullParameter(state, "state");
                navigator.f8644OooO00o = state;
                navigator.f8645OooO0O0 = true;
            }
            if (navController.f28454OooO0OO == null || !navController.f28458OooO0oO.isEmpty()) {
                function7 = function14;
                function8 = function5;
                function9 = function6;
                navController.OooO0O0();
            } else {
                if (navController.f28456OooO0o || (activity = navController.f28453OooO0O0) == null) {
                    function7 = function14;
                    function8 = function5;
                    function9 = function6;
                } else {
                    Intrinsics.checkNotNull(activity);
                    Intent intent = activity.getIntent();
                    if (intent == null) {
                        function7 = function14;
                        function8 = function5;
                        function9 = function6;
                    } else {
                        Bundle extras = intent.getExtras();
                        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
                        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                        Bundle bundle3 = new Bundle();
                        Bundle bundle4 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                        if (bundle4 != null) {
                            bundle3.putAll(bundle4);
                        }
                        if (intArray == null) {
                            androidx.navigation.OooO0OO oooO0OO6 = navController.f28454OooO0OO;
                            Intrinsics.checkNotNull(oooO0OO6);
                            OooO0o1 = oooO0OO6.OooO0o0(new oo0o0Oo(intent));
                            if (OooO0o1 != null) {
                                NavDestination navDestination2 = OooO0o1.f8640Oooo0o;
                                Objects.requireNonNull(navDestination2);
                                arrayDeque = new ArrayDeque();
                                navDestination = navDestination2;
                                while (true) {
                                    Intrinsics.checkNotNull(navDestination);
                                    function9 = function6;
                                    oooO0OO = navDestination.f8632Oooo0oO;
                                    if (oooO0OO != null) {
                                        function8 = function5;
                                        function7 = function14;
                                        if (oooO0OO.f8653OoooOOO != navDestination.f8637OoooO0O) {
                                        }
                                        if (!Intrinsics.areEqual(oooO0OO, (Object) null) || oooO0OO == null) {
                                            break;
                                        }
                                        function5 = function8;
                                        function14 = function7;
                                        navDestination = oooO0OO;
                                        function6 = function9;
                                    } else {
                                        function7 = function14;
                                        function8 = function5;
                                    }
                                    arrayDeque.addFirst(navDestination);
                                    if (!Intrinsics.areEqual(oooO0OO, (Object) null)) {
                                        break;
                                    }
                                    function5 = function8;
                                    function14 = function7;
                                    navDestination = oooO0OO;
                                    function6 = function9;
                                }
                                List list = CollectionsKt.toList(arrayDeque);
                                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Integer.valueOf(((NavDestination) it.next()).f8637OoooO0O));
                                }
                                intArray = CollectionsKt.toIntArray(arrayList);
                                bundleOooO0O0 = navDestination2.OooO0O0(OooO0o1.f8641Oooo0oO);
                                if (bundleOooO0O0 != null) {
                                    bundle3.putAll(bundleOooO0O0);
                                }
                                parcelableArrayList = null;
                            } else {
                                function7 = function14;
                                function8 = function5;
                                function9 = function6;
                            }
                        } else if (intArray.length == 0) {
                            androidx.navigation.OooO0OO oooO0OO7 = navController.f28454OooO0OO;
                            Intrinsics.checkNotNull(oooO0OO7);
                            OooO0o1 = oooO0OO7.OooO0o0(new oo0o0Oo(intent));
                            if (OooO0o1 != null) {
                                NavDestination navDestination3 = OooO0o1.f8640Oooo0o;
                                Objects.requireNonNull(navDestination3);
                                arrayDeque = new ArrayDeque();
                                navDestination = navDestination3;
                                while (true) {
                                    Intrinsics.checkNotNull(navDestination);
                                    function9 = function6;
                                    oooO0OO = navDestination.f8632Oooo0oO;
                                    if (oooO0OO != null) {
                                        function8 = function5;
                                        function7 = function14;
                                        if (oooO0OO.f8653OoooOOO != navDestination.f8637OoooO0O) {
                                        }
                                        if (!Intrinsics.areEqual(oooO0OO, (Object) null)) {
                                            break;
                                            break;
                                        }
                                        function5 = function8;
                                        function14 = function7;
                                        navDestination = oooO0OO;
                                        function6 = function9;
                                    } else {
                                        function7 = function14;
                                        function8 = function5;
                                    }
                                    arrayDeque.addFirst(navDestination);
                                    if (!Intrinsics.areEqual(oooO0OO, (Object) null)) {
                                        break;
                                        break;
                                    }
                                    function5 = function8;
                                    function14 = function7;
                                    navDestination = oooO0OO;
                                    function6 = function9;
                                }
                                List list2 = CollectionsKt.toList(arrayDeque);
                                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(Integer.valueOf(((NavDestination) it.next()).f8637OoooO0O));
                                }
                                intArray = CollectionsKt.toIntArray(arrayList);
                                bundleOooO0O0 = navDestination3.OooO0O0(OooO0o1.f8641Oooo0oO);
                                if (bundleOooO0O0 != null) {
                                    bundle3.putAll(bundleOooO0O0);
                                }
                                parcelableArrayList = null;
                            } else {
                                function7 = function14;
                                function8 = function5;
                                function9 = function6;
                            }
                        } else {
                            function7 = function14;
                            function8 = function5;
                            function9 = function6;
                        }
                        if (intArray != null) {
                            if (!(intArray.length == 0)) {
                                androidx.navigation.OooO0OO oooO0OO8 = navController.f28454OooO0OO;
                                int length2 = intArray.length;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= length2) {
                                        strOooO0O0 = null;
                                        break;
                                    }
                                    int i10 = intArray[i9];
                                    if (i9 == 0) {
                                        androidx.navigation.OooO0OO oooO0OO9 = navController.f28454OooO0OO;
                                        Intrinsics.checkNotNull(oooO0OO9);
                                        navDestinationOooO0oo2 = oooO0OO9.f8637OoooO0O == i10 ? navController.f28454OooO0OO : null;
                                    } else {
                                        Intrinsics.checkNotNull(oooO0OO8);
                                        navDestinationOooO0oo2 = oooO0OO8.OooO0oo(i10, true);
                                    }
                                    if (navDestinationOooO0oo2 == null) {
                                        strOooO0O0 = NavDestination.f8629OoooOO0.OooO0O0(navController.f28452OooO00o, i10);
                                        break;
                                    }
                                    if (i9 != intArray.length - 1 && (navDestinationOooO0oo2 instanceof androidx.navigation.OooO0OO)) {
                                        while (true) {
                                            oooO0OO2 = (androidx.navigation.OooO0OO) navDestinationOooO0oo2;
                                            Intrinsics.checkNotNull(oooO0OO2);
                                            if (!(oooO0OO2.OooO0oo(oooO0OO2.f8653OoooOOO, true) instanceof androidx.navigation.OooO0OO)) {
                                                break;
                                            } else {
                                                navDestinationOooO0oo2 = oooO0OO2.OooO0oo(oooO0OO2.f8653OoooOOO, true);
                                            }
                                        }
                                        oooO0OO8 = oooO0OO2;
                                    }
                                    i9++;
                                }
                                if (strOooO0O0 != null) {
                                    Log.i("NavController", "Could not find destination " + strOooO0O0 + " in the navigation graph, ignoring the deep link from " + intent);
                                } else {
                                    bundle3.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                    int length3 = intArray.length;
                                    Bundle[] bundleArr = new Bundle[length3];
                                    for (int i11 = 0; i11 < length3; i11++) {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putAll(bundle3);
                                        if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i11)) != null) {
                                            bundle5.putAll(bundle);
                                        }
                                        bundleArr[i11] = bundle5;
                                    }
                                    int flags = intent.getFlags();
                                    int i12 = 268435456 & flags;
                                    if (i12 == 0 || (flags & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0) {
                                        if (i12 != 0) {
                                            if (!navController.f28458OooO0oO.isEmpty()) {
                                                androidx.navigation.OooO0OO oooO0OO10 = navController.f28454OooO0OO;
                                                Intrinsics.checkNotNull(oooO0OO10);
                                                navController.OooOOO(oooO0OO10.f8637OoooO0O, true, false);
                                            }
                                            int i13 = 0;
                                            while (i13 < intArray.length) {
                                                int i14 = intArray[i13];
                                                int i15 = i13 + 1;
                                                Bundle bundle6 = bundleArr[i13];
                                                NavDestination navDestinationOooO0OO2 = navController.OooO0OO(i14);
                                                if (navDestinationOooO0OO2 == null) {
                                                    StringBuilder sbOooO0OO2 = OooO0o.OooO0o.OooO0OO("Deep Linking failed: destination ", NavDestination.f8629OoooOO0.OooO0O0(navController.f28452OooO00o, i14), " cannot be found from the current destination ");
                                                    sbOooO0OO2.append(navController.OooO0oO());
                                                    throw new IllegalStateException(sbOooO0OO2.toString());
                                                }
                                                navController.OooOO0o(navDestinationOooO0OO2, bundle6, o00000O.OooO00o(new p086o000OooO.o00oO0o(navDestinationOooO0OO2, navController)), null);
                                                i13 = i15;
                                            }
                                        } else {
                                            androidx.navigation.OooO0OO oooO0OO11 = navController.f28454OooO0OO;
                                            int length4 = intArray.length;
                                            for (int i16 = 0; i16 < length4; i16++) {
                                                int i17 = intArray[i16];
                                                Bundle bundle7 = bundleArr[i16];
                                                if (i16 == 0) {
                                                    navDestinationOooO0oo = navController.f28454OooO0OO;
                                                    z2 = true;
                                                } else {
                                                    Intrinsics.checkNotNull(oooO0OO11);
                                                    z2 = true;
                                                    navDestinationOooO0oo = oooO0OO11.OooO0oo(i17, true);
                                                }
                                                if (navDestinationOooO0oo == null) {
                                                    throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.f8629OoooOO0.OooO0O0(navController.f28452OooO00o, i17) + " cannot be found in graph " + oooO0OO11);
                                                }
                                                if (i16 == intArray.length - (z2 ? 1 : 0)) {
                                                    androidx.navigation.OooO0OO oooO0OO12 = navController.f28454OooO0OO;
                                                    Intrinsics.checkNotNull(oooO0OO12);
                                                    navController.OooOO0o(navDestinationOooO0oo, bundle7, new o00000(false, false, oooO0OO12.f8637OoooO0O, true, false, 0, 0, -1, -1), null);
                                                } else if (navDestinationOooO0oo instanceof androidx.navigation.OooO0OO) {
                                                    androidx.navigation.OooO0OO oooO0OO13 = (androidx.navigation.OooO0OO) navDestinationOooO0oo;
                                                    while (true) {
                                                        Intrinsics.checkNotNull(oooO0OO13);
                                                        if (!(oooO0OO13.OooO0oo(oooO0OO13.f8653OoooOOO, z2) instanceof androidx.navigation.OooO0OO)) {
                                                            break;
                                                        }
                                                        oooO0OO13 = (androidx.navigation.OooO0OO) oooO0OO13.OooO0oo(oooO0OO13.f8653OoooOOO, z2);
                                                        z2 = true;
                                                    }
                                                    oooO0OO11 = oooO0OO13;
                                                }
                                            }
                                            z = true;
                                            navController.f28456OooO0o = true;
                                        }
                                        z3 = true;
                                    } else {
                                        intent.addFlags(ShareRequest.THUMB_DATA_SIZE_LIMIT);
                                        o000OO o000oo2 = new o000OO(navController.f28452OooO00o);
                                        ComponentName component = intent.getComponent();
                                        if (component == null) {
                                            component = intent.resolveActivity(o000oo2.f27999Oooo0oO.getPackageManager());
                                        }
                                        if (component != null) {
                                            o000oo2.OooO00o(component);
                                        }
                                        o000oo2.f27998Oooo0o.add(intent);
                                        Intrinsics.checkNotNullExpressionValue(o000oo2, "create(context)\n        …ntWithParentStack(intent)");
                                        o000oo2.OooO0O0();
                                        Activity activity2 = navController.f28453OooO0O0;
                                        if (activity2 != null) {
                                            activity2.finish();
                                            activity2.overridePendingTransition(0, 0);
                                        }
                                    }
                                    z = true;
                                    z3 = true;
                                }
                            }
                        }
                        if (!z3) {
                        }
                        if (!z) {
                            NavDestination navDestination4 = navController.f28454OooO0OO;
                            Intrinsics.checkNotNull(navDestination4);
                            navController.OooOO0o(navDestination4, null, null, null);
                        }
                    }
                    z = true;
                    z3 = false;
                    if (!z3) {
                    }
                    if (!z) {
                        NavDestination navDestination5 = navController.f28454OooO0OO;
                        Intrinsics.checkNotNull(navDestination5);
                        navController.OooOO0o(navDestination5, null, null, null);
                    }
                }
                z = false;
                if (!z) {
                    NavDestination navDestination6 = navController.f28454OooO0OO;
                    Intrinsics.checkNotNull(navDestination6);
                    navController.OooOO0o(navDestination6, null, null, null);
                }
            }
        }
        o00O0O00 o00o0o00OooO00o = oo0o0O0.OooO00o(ooo00oOooOOo);
        Navigator navigatorOooO0O1 = navController.f28473OooOo0O.OooO0O0("animatedComposable");
        o0O00oO0.OooO00o oooO00o4 = navigatorOooO0O1 instanceof o0O00oO0.OooO00o ? (o0O00oO0.OooO00o) navigatorOooO0O1 : null;
        if (oooO00o4 == null) {
            oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo == null) {
                return;
            }
            oo0oooOooOo.OooO00o(new OooOOOO(navController, graph, o00oooo2, o00oo0o2, function13, function7, function8, function9, i, i2));
            return;
        }
        StateFlow<List<NavBackStackEntry>> stateFlow = navController.f28451OooO;
        ooo00oOooOOo.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(stateFlow);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            obj = objOooO0o;
            final StateFlow<List<NavBackStackEntry>> stateFlow2 = navController.f28451OooO;
            Flow<List<? extends NavBackStackEntry>> flow = new Flow<List<? extends NavBackStackEntry>>() { // from class: com.google.accompanist.navigation.animation.AnimatedNavHostKt$AnimatedNavHost$lambda-4$$inlined$map$1

                /* JADX INFO: renamed from: com.google.accompanist.navigation.animation.AnimatedNavHostKt$AnimatedNavHost$lambda-4$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector, SuspendFunction {

                    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f12903Oooo0o;

                    /* JADX INFO: renamed from: com.google.accompanist.navigation.animation.AnimatedNavHostKt$AnimatedNavHost$lambda-4$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    @DebugMetadata(c = "com.google.accompanist.navigation.animation.AnimatedNavHostKt$AnimatedNavHost$lambda-4$$inlined$map$1$2", f = "AnimatedNavHost.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                        public /* synthetic */ Object f12904Oooo0o;

                        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                        public int f12905Oooo0oO;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f12904Oooo0o = obj;
                            this.f12905Oooo0oO |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f12903Oooo0o = flowCollector;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.f12905Oooo0oO;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f12905Oooo0oO = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f12904Oooo0o;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.f12905Oooo0oO;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.f12903Oooo0o;
                            ArrayList arrayList = new ArrayList();
                            for (T t : (List) obj) {
                                if (Intrinsics.areEqual(((NavBackStackEntry) t).getDestination().f8631Oooo0o, "animatedComposable")) {
                                    arrayList.add(t);
                                }
                            }
                            anonymousClass1.f12905Oooo0oO = 1;
                            if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public final Object collect(@NotNull FlowCollector<? super List<? extends NavBackStackEntry>> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            ooo00oOooOOo.Oooo00o(flow);
            obj = flow;
        }
        obj = objOooO0o;
        ooo00oOooOOo.Oooo0o0();
        o000O00O o000o00o2 = null;
        oO0Oo oo0ooOooO00o = o0OOO00.OooO00o((Flow) obj, CollectionsKt.emptyList(), null, ooo00oOooOOo, 2);
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) CollectionsKt.lastOrNull((List) OooO0OO(oo0ooOooO00o));
        ooo00oOooOOo.OooO0o0(92481947);
        if (navBackStackEntry3 != null) {
            ooo00oOooOOo.OooO0o0(1618982084);
            Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function15 = function8;
            boolean zOooo0oo2 = ooo00oOooOOo.Oooo0oo(oooO00o4) | ooo00oOooOOo.Oooo0oo(function15) | ooo00oOooOOo.Oooo0oo(function13);
            Object objOooO0o2 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo2 || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                obj2 = objOooO0o2;
                OooOo oooOo = new OooOo(oooO00o4, function15, function13);
                ooo00oOooOOo.Oooo00o(oooOo);
                obj2 = oooOo;
            }
            obj2 = objOooO0o2;
            ooo00oOooOOo.Oooo0o0();
            Function1 function16 = (Function1) obj2;
            ooo00oOooOOo.OooO0o0(1618982084);
            Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function17 = function9;
            Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function18 = function7;
            boolean zOooo0oo3 = ooo00oOooOOo.Oooo0oo(oooO00o4) | ooo00oOooOOo.Oooo0oo(function17) | ooo00oOooOOo.Oooo0oo(function18);
            Object objOooO0o3 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo3 || objOooO0o3 == oOO00O.OooO00o.f29689OooO0O0) {
                obj3 = objOooO0o3;
                Oooo000 oooo000 = new Oooo000(oooO00o4, function17, function18);
                ooo00oOooOOo.Oooo00o(oooo000);
                obj3 = oooo000;
            }
            obj3 = objOooO0o3;
            ooo00oOooOOo.Oooo0o0();
            Function1 function19 = (Function1) obj3;
            oo00o oo00oVarOooO0OO = oo0oOO0.OooO0OO(navBackStackEntry3, "entry", ooo00oOooOOo, 56, 0);
            ooo00oOooOOo.OooO0o0(1618982084);
            boolean zOooo0oo4 = ooo00oOooOOo.Oooo0oo(oo0ooOooO00o) | ooo00oOooOOo.Oooo0oo(function16) | ooo00oOooOOo.Oooo0oo(function19);
            Object objOooO0o4 = ooo00oOooOOo.OooO0o();
            if (zOooo0oo4 || objOooO0o4 == oOO00O.OooO00o.f29689OooO0O0) {
                obj4 = objOooO0o4;
                OooOO0O oooOO0O = new OooOO0O(function16, function19, oo0ooOooO00o);
                ooo00oOooOOo.Oooo00o(oooOO0O);
                obj4 = oooOO0O;
            }
            obj4 = objOooO0o4;
            ooo00oOooOOo.Oooo0o0();
            function12 = function18;
            function10 = function17;
            function11 = function15;
            Oooo000.OooO.OooO00o(oo00oVarOooO0OO, o00oooo2, (Function1) obj4, o00oo0o2, OooOOO0.f12938Oooo0o, o00O0000.OooO00o(ooo00oOooOOo, 1242637642, new OooOOO(o00o0o00OooO00o, oo0ooOooO00o)), ooo00oOooOOo, 221184 | ((i5 >> 3) & 112) | (i5 & 7168), 0);
            if (Intrinsics.areEqual(oo00oVarOooO0OO.OooO0O0(), oo00oVarOooO0OO.OooO0o())) {
                for (NavBackStackEntry entry : (List) oo0ooOooO00o.getValue()) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    oooO00o4.OooO0O0().OooO0O0(entry);
                }
            }
            o000o00o2 = null;
        } else {
            function10 = function9;
            function11 = function8;
            function12 = function7;
        }
        ooo00oOooOOo.Oooo0o0();
        Navigator navigatorOooO0O2 = navController.f28473OooOo0O.OooO0O0("dialog");
        if (navigatorOooO0O2 instanceof o000O00O) {
            o000o00o2 = (o000O00O) navigatorOooO0O2;
        }
        if (o000o00o2 == null) {
            oo0ooO oo0oooOooOo2 = ooo00oOooOOo.OooOo();
            if (oo0oooOooOo2 == null) {
                return;
            }
            oo0oooOooOo2.OooO00o(new OooOo00(navController, graph, o00oooo2, o00oo0o2, function13, function12, function11, function10, i, i2));
            return;
        }
        p087o000Oooo.o0000OO0.OooO00o(o000o00o2, ooo00oOooOOo, 0);
        oo0ooO oo0oooOooOo3 = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo3 == null) {
            return;
        }
        oo0oooOooOo3.OooO00o(new OooO00o(navController, graph, o00oooo2, o00oo0o2, function13, function12, function11, function10, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalAnimationApi
    public static final void OooO0O0(@NotNull p086o000OooO.o000000 navController, @NotNull String startDestination, @Nullable o00OOOO0 o00oooo1, @Nullable o00OO0O0 o00oo0o1, @Nullable String str, @Nullable Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function1, @Nullable Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function2, @Nullable Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function3, @Nullable Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function4, @NotNull Function1<? super o000OOo, Unit> builder, @Nullable oOO00O ooo00o, int i, int i2) {
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function5;
        int i3;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function6;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1786657914);
        o00OOOO0 o00oooo2 = (i2 & 4) != 0 ? o00OOOO0.OooO00o.f4198Oooo0o : o00oooo1;
        o00OO0O0 o00oo0o2 = (i2 & 8) != 0 ? o00OO0O0.OooO00o.f4175OooO0o : o00oo0o1;
        String str2 = (i2 & 16) != 0 ? null : str;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o0000OO0> function7 = (i2 & 32) != 0 ? OooO0O0.f12918Oooo0o : function1;
        Function1<? super o000oOoO<NavBackStackEntry>, ? extends o000O000> function8 = (i2 & 64) != 0 ? OooO0OO.f12919Oooo0o : function2;
        if ((i2 & 128) != 0) {
            i3 = i & (-29360129);
            function5 = function7;
        } else {
            function5 = function3;
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            i3 &= -234881025;
            function6 = function8;
        } else {
            function6 = function4;
        }
        ooo00oOooOOo.OooO0o0(1618982084);
        boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(str2) | ooo00oOooOOo.Oooo0oo(startDestination) | ooo00oOooOOo.Oooo0oo(builder);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            o000OOo o000ooo2 = new o000OOo(navController.f28473OooOo0O, startDestination, str2);
            builder.invoke(o000ooo2);
            objOooO0o = o000ooo2.OooO00o();
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        androidx.navigation.OooO0OO oooO0OO = (androidx.navigation.OooO0OO) objOooO0o;
        int i4 = (i3 & 896) | 72 | (i3 & 7168);
        int i5 = i3 >> 3;
        String str3 = str2;
        OooO00o(navController, oooO0OO, o00oooo2, o00oo0o2, function7, function8, function5, function6, ooo00oOooOOo, i4 | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 0);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0o(navController, startDestination, o00oooo2, o00oo0o2, str3, function7, function8, function5, function6, builder, i, i2));
    }

    public static final List<NavBackStackEntry> OooO0OO(oO0Oo<? extends List<NavBackStackEntry>> oo0oo) {
        return oo0oo.getValue();
    }
}
