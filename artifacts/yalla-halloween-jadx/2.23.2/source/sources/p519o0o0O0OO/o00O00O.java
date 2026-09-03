package p519o0o0O0OO;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000O;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p384o0OOoo0O.o000oOoO;
import p476o0OooooO.o0OOo000;
import p521o0o0O0o0.o0000oo;
import p521o0o0O0o0.oo000o;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentContentComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentContentComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentContentCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n76#2:215\n76#2:216\n76#2:257\n76#2:258\n76#2:266\n76#2:267\n76#2:268\n76#2:336\n72#3,6:217\n78#3:251\n82#3:256\n78#4,11:223\n91#4:255\n78#4,11:290\n91#4:323\n456#5,8:234\n464#5,3:248\n467#5,3:252\n25#5:259\n36#5:269\n36#5:276\n456#5,8:301\n464#5,3:315\n467#5,3:320\n4144#6,6:242\n4144#6,6:309\n1097#7,6:260\n1097#7,6:270\n1097#7,6:277\n154#8:283\n154#8:319\n73#9,6:284\n79#9:318\n83#9:324\n81#10,11:325\n81#11:337\n107#11,2:338\n*S KotlinDebug\n*F\n+ 1 MomentContentComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentContentCompKt\n*L\n54#1:215\n56#1:216\n84#1:257\n86#1:258\n91#1:266\n93#1:267\n95#1:268\n157#1:336\n64#1:217,6\n64#1:251\n64#1:256\n64#1:223,11\n64#1:255\n126#1:290,11\n126#1:323\n64#1:234,8\n64#1:248,3\n64#1:252,3\n89#1:259\n108#1:269\n111#1:276\n126#1:301,8\n126#1:315,3\n126#1:320,3\n64#1:242,6\n126#1:309,6\n89#1:260,6\n108#1:270,6\n111#1:277,6\n127#1:283\n141#1:319\n126#1:284,6\n126#1:318\n126#1:324\n153#1:325,11\n89#1:337\n89#1:338,2\n*E\n"})
public final class o00O00O {

    public static final class OooO extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f52026OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MutableState<Boolean> mutableState) {
            super(1);
            this.f52026OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(TextLayoutResult textLayoutResult) {
            TextLayoutResult textLayoutResult2 = textLayoutResult;
            Intrinsics.checkNotNullParameter(textLayoutResult2, "textLayoutResult");
            this.f52026OooO0Oo.setValue(Boolean.valueOf(textLayoutResult2.isLineEllipsized(textLayoutResult2.getLineCount() - 1)));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f52027OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f52028OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52029OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52030OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52031OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Modifier modifier, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, Function1<? super String, Unit> function1, int i, int i2) {
            super(2);
            this.f52027OooO0Oo = modifier;
            this.f52029OooO0o0 = function2;
            this.f52028OooO0o = function1;
            this.f52030OooO0oO = i;
            this.f52031OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00O00O.OooO00o(this.f52027OooO0Oo, this.f52029OooO0o0, this.f52028OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52030OooO0oO | 1), this.f52031OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f52032OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f52033OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52034OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f52035OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52036OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Modifier modifier, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, Function1<? super String, Unit> function1, int i, int i2) {
            super(2);
            this.f52032OooO0Oo = modifier;
            this.f52034OooO0o0 = function2;
            this.f52033OooO0o = function1;
            this.f52035OooO0oO = i;
            this.f52036OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00O00O.OooO00o(this.f52032OooO0Oo, this.f52034OooO0o0, this.f52033OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52035OooO0oO | 1), this.f52036OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<AnnotatedString.Builder, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f52037OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52038OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentDetailModel momentDetailModel, boolean z) {
            super(1);
            this.f52037OooO0Oo = z;
            this.f52038OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AnnotatedString.Builder builder) {
            AnnotatedString.Builder MomentRichText = builder;
            Intrinsics.checkNotNullParameter(MomentRichText, "$this$MomentRichText");
            if (this.f52037OooO0Oo) {
                MomentDetailModel momentDetailModel = this.f52038OooO0o0;
                String nickName = momentDetailModel.getNickName();
                Long lValueOf = Long.valueOf(momentDetailModel.getUserId());
                Lazy lazy = oo000o.f52995OooO00o;
                oo000o.OooO0o0(MomentRichText, nickName, lValueOf, o0OOo000.f48186Ooooo0o, true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52039OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(Function2<? super PostDetailHeaderViewTag, Object, Unit> function2) {
            super(1);
            this.f52039OooO0Oo = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            Function2<PostDetailHeaderViewTag, Object, Unit> function2 = this.f52039OooO0Oo;
            if (function2 != null) {
                function2.invoke(PostDetailHeaderViewTag.PostDetailContentCompose, it);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f52040OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f52041OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52042OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f52043OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z) {
            super(0);
            this.f52040OooO0Oo = context;
            this.f52042OooO0o0 = momentDetailModel;
            this.f52041OooO0o = momentAdapterTag;
            this.f52043OooO0oO = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000oo.OooO00o(this.f52040OooO0Oo, this.f52042OooO0o0, this.f52041OooO0o, this.f52043OooO0oO, 0, false, 48);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f52044OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f52045OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f52046OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52047OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<PostDetailHeaderViewTag, Object, Unit> f52048OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f52049OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0O(String str, MomentDetailModel momentDetailModel, Function1<? super String, Unit> function1, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, int i, int i2) {
            super(2);
            this.f52045OooO0Oo = str;
            this.f52047OooO0o0 = momentDetailModel;
            this.f52046OooO0o = function1;
            this.f52048OooO0oO = function2;
            this.f52049OooO0oo = i;
            this.f52044OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00O00O.OooO0O0(this.f52045OooO0Oo, this.f52047OooO0o0, this.f52046OooO0o, this.f52048OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52049OooO0oo | 1), this.f52044OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52050OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f52051OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MomentDetailModel momentDetailModel, int i) {
            super(2);
            this.f52050OooO0Oo = momentDetailModel;
            this.f52051OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52051OooO0o0 | 1);
            o00O00O.OooO0OO(this.f52050OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ AnnotatedString f52052OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ YallaChatVM f52053OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f52054OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f52055OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(AnnotatedString annotatedString, MomentDetailModel momentDetailModel, YallaChatVM yallaChatVM, LifecycleOwner lifecycleOwner) {
            super(1);
            this.f52052OooO0Oo = annotatedString;
            this.f52054OooO0o0 = momentDetailModel;
            this.f52053OooO0o = yallaChatVM;
            this.f52055OooO0oO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            if (((AnnotatedString.Range) CollectionsKt.firstOrNull((List) this.f52052OooO0Oo.getStringAnnotations(iIntValue, iIntValue))) != null) {
                MomentDetailModel momentDetailModel = this.f52054OooO0o0;
                MomentSendContentModel content = momentDetailModel.getContent();
                Intrinsics.checkNotNull(content);
                long circleId = content.getCircleId();
                MomentSendContentModel content2 = momentDetailModel.getContent();
                Intrinsics.checkNotNull(content2);
                String strOooOOO = o0OoOo0.OooOOO(content2.getCircleName(), "");
                this.f52053OooO0o.getGroupInfo(circleId).observe(this.f52055OooO0oO, new o000oOoO(new oOO00O(circleId, strOooOOO), null, null, false, 14));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:79:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x0154  */
    /* JADX WARN: Code duplicated, block: B:88:0x0174  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b5  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @Nullable Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, @Nullable Function1<? super String, Unit> function1, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super String, Unit> function3;
        Modifier modifier3;
        Unit unit;
        Function1<? super String, Unit> function4;
        MomentDetailModel momentDetailModel;
        MomentSendContentModel content;
        String content2;
        Modifier modifier4;
        Function1<? super String, Unit> function5;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        MomentSendContentModel content3;
        String content4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1779179342);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 896) == 0) {
                function3 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i3 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                unit = null;
                if (i5 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1779179342, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentContentComp (MomentContentComp.kt:52)");
                }
                momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0OOoo.f52733OooO0Oo);
                if (!((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52734OooO0o)).booleanValue()) {
                    content3 = momentDetailModel.getContent();
                    if (content3 != null) {
                        content4 = content3.getContent();
                    } else {
                        content4 = null;
                    }
                    if (TextUtils.isEmpty(content4)) {
                        if (function2 != null) {
                            function2.invoke(PostDetailHeaderViewTag.PostDetailContentCompose, "");
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier3, function2, function4, i, i2));
                        return;
                    }
                }
                content = momentDetailModel.getContent();
                if (content != null) {
                    content2 = content.getContent();
                } else {
                    content2 = null;
                }
                if (content2 != null) {
                    Modifier modifierThen = Modifier.INSTANCE.then(modifier3);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                    if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (momentDetailModel.getType() == MomentType.YallaChatGroup.getValue()) {
                        composerStartRestartGroup.startReplaceableGroup(875739522);
                        OooO0OO(momentDetailModel, composerStartRestartGroup, 8);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(875739614);
                        OooO0O0(content2, momentDetailModel, function4, function2, composerStartRestartGroup, (i3 & 896) | 64 | ((i3 << 6) & 7168), 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    o0ooOOo.OooO00o(composerStartRestartGroup);
                    unit = Unit.INSTANCE;
                }
                if (unit == null && function2 != null) {
                    function2.invoke(PostDetailHeaderViewTag.PostDetailContentCompose, "");
                    Unit unit2 = Unit.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                function5 = function4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                function5 = function3;
            }
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(modifier4, function2, function5, i, i2));
        }
        i3 |= 384;
        function3 = function1;
        if ((i3 & 731) == 146) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            unit = null;
            if (i5 != 0) {
                function4 = null;
            } else {
                function4 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1779179342, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentContentComp (MomentContentComp.kt:52)");
            }
            momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0OOoo.f52733OooO0Oo);
            if (!((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52734OooO0o)).booleanValue()) {
                content3 = momentDetailModel.getContent();
                if (content3 != null) {
                    content4 = content3.getContent();
                } else {
                    content4 = null;
                }
                if (TextUtils.isEmpty(content4)) {
                    if (function2 != null) {
                        function2.invoke(PostDetailHeaderViewTag.PostDetailContentCompose, "");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier3, function2, function4, i, i2));
                    return;
                }
            }
            content = momentDetailModel.getContent();
            if (content != null) {
                content2 = content.getContent();
            } else {
                content2 = null;
            }
            if (content2 != null) {
                Modifier modifierThen2 = Modifier.INSTANCE.then(modifier3);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierThen2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O1, composerM1320constructorimpl, currentCompositionLocalMap2);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                if (momentDetailModel.getType() == MomentType.YallaChatGroup.getValue()) {
                    composerStartRestartGroup.startReplaceableGroup(875739522);
                    OooO0OO(momentDetailModel, composerStartRestartGroup, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(875739614);
                    OooO0O0(content2, momentDetailModel, function4, function2, composerStartRestartGroup, (i3 & 896) | 64 | ((i3 << 6) & 7168), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                o0ooOOo.OooO00o(composerStartRestartGroup);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                function2.invoke(PostDetailHeaderViewTag.PostDetailContentCompose, "");
                Unit unit3 = Unit.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            function5 = function4;
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            unit = null;
            if (i5 != 0) {
                function4 = null;
            } else {
                function4 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1779179342, i3, -1, "com.yalla.yalla.ui.composable.moment.MomentContentComp (MomentContentComp.kt:52)");
            }
            momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0OOoo.f52733OooO0Oo);
            if (!((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52734OooO0o)).booleanValue()) {
                content3 = momentDetailModel.getContent();
                if (content3 != null) {
                    content4 = content3.getContent();
                } else {
                    content4 = null;
                }
                if (TextUtils.isEmpty(content4)) {
                    if (function2 != null) {
                        function2.invoke(PostDetailHeaderViewTag.PostDetailContentCompose, "");
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier3, function2, function4, i, i2));
                    return;
                }
            }
            content = momentDetailModel.getContent();
            if (content != null) {
                content2 = content.getContent();
            } else {
                content2 = null;
            }
            if (content2 != null) {
                Modifier modifierThen3 = Modifier.INSTANCE.then(modifier3);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O2 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierThen3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O2, composerM1320constructorimpl, currentCompositionLocalMap3);
                if (composerM1320constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                if (momentDetailModel.getType() == MomentType.YallaChatGroup.getValue()) {
                    composerStartRestartGroup.startReplaceableGroup(875739522);
                    OooO0OO(momentDetailModel, composerStartRestartGroup, 8);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(875739614);
                    OooO0O0(content2, momentDetailModel, function4, function2, composerStartRestartGroup, (i3 & 896) | 64 | ((i3 << 6) & 7168), 0);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                o0ooOOo.OooO00o(composerStartRestartGroup);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                function2.invoke(PostDetailHeaderViewTag.PostDetailContentCompose, "");
                Unit unit4 = Unit.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            function5 = function4;
        }
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(modifier4, function2, function5, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(String str, MomentDetailModel momentDetailModel, Function1<? super String, Unit> function1, Function2<? super PostDetailHeaderViewTag, Object, Unit> function2, Composer composer, int i, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1780845989);
        Function1<? super String, Unit> function3 = (i2 & 4) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1780845989, i, -1, "com.yalla.yalla.ui.composable.moment.NormalTextContent (MomentContentComp.kt:82)");
        }
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52730OooO00o)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52734OooO0o)).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        MomentAdapterTag momentAdapterTag = (MomentAdapterTag) composerStartRestartGroup.consume(oo0OOoo.f52731OooO0O0);
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zBooleanValue3 = ((Boolean) composerStartRestartGroup.consume(oo0OOoo.f52729OooO)).booleanValue();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MomentSendContentModel content = momentDetailModel.getContent();
        List<MomentSendContentAtModel> at = content != null ? content.getAt() : null;
        int i3 = (zBooleanValue || momentAdapterTag == MomentAdapterTag.MomentEditRecord) ? Integer.MAX_VALUE : 6;
        TextStyle textStyle = new TextStyle(p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, OooOo00.OooO0o0() ? null : TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco()), 0L, (TextIndent) null, new PlatformTextStyle(true), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16187388, (DefaultConstructorMarker) null);
        OooO0OO oooO0OO = new OooO0OO(momentDetailModel, zBooleanValue2);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function2);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new OooO0o(function2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Function1 function4 = (Function1) objRememberedValue2;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new OooO(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        oo000o.OooO00o(companion2, str, zBooleanValue3, at, null, oooO0OO, textStyle, false, 0, i3, function4, (Function1) objRememberedValue3, function3, new OooOO0(context, momentDetailModel, momentAdapterTag, zBooleanValue), composerStartRestartGroup, ((i << 3) & 112) | 4102, i & 896, 400);
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, Dp.m3775constructorimpl(4), 0.0f, 0.0f, 13, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.button_more, composerStartRestartGroup, 0), (Modifier) null, p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38629OooOOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65522);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_more_moment_content, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0Oo(SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(12)), composerStartRestartGroup, 6), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            o0ooOOo.OooO00o(composerStartRestartGroup);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(str, momentDetailModel, function3, function2, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(MomentDetailModel momentDetailModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(756660434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(756660434, i, -1, "com.yalla.yalla.ui.composable.moment.TopicYallaChat (MomentContentComp.kt:151)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(YallaChatVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        YallaChatVM yallaChatVM = (YallaChatVM) viewModel;
        MomentSendContentModel content = momentDetailModel.getContent();
        Lazy lazy = oo000o.f52995OooO00o;
        composerStartRestartGroup.startReplaceableGroup(-2140960484);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2140960484, 8, -1, "com.yalla.yalla.ui.composable.moment.utils.topicYallaChat (MomentContentUtils.kt:462)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String strStringResource = StringResources_androidKt.stringResource(o000000.topic_group_create_success_message_xxx, composerStartRestartGroup, 0);
        String[] strArr = new String[1];
        strArr[0] = o0OoOo0.OooOOO(content != null ? content.getCircleName() : null, "");
        String strOooO00o = o0000O.OooO00o(strStringResource, strArr);
        String strStringResource2 = StringResources_androidKt.stringResource(o000000.topic_group_create_success_message_Highlight, composerStartRestartGroup, 0);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO00o, strStringResource2, 0, false, 6, (Object) null);
        int length = strStringResource2.length() + iIndexOf$default;
        builder.append(strOooO00o);
        builder.addStyle(new SpanStyle(p193o00o0O0O.o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), 0, strOooO00o.length());
        builder.addStyle(new SpanStyle(o0OOo000.f48186Ooooo0o, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), iIndexOf$default, length);
        builder.addStringAnnotation("", "", iIndexOf$default, length);
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composerStartRestartGroup.endReplaceableGroup();
        ClickableTextKt.m741ClickableText4YKlhWE(annotatedString, null, new TextStyle(0L, TextUnitKt.getSp(15), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(true), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252925, (DefaultConstructorMarker) null), false, 0, 0, null, new OooOOO0(annotatedString, momentDetailModel, yallaChatVM, (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())), composerStartRestartGroup, 0, 122);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(momentDetailModel, i));
    }
}
