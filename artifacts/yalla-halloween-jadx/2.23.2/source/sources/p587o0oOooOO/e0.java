package p587o0oOooOO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.OooO0o;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.ui.view.GifFaceView;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nGifFaceTopBuyContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifFaceTopBuyContainer.kt\ncom/yalla/yalla/ui/view/GifFaceTopBuyContainer$initData$2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,312:1\n66#2,6:313\n72#2:347\n76#2:382\n78#3,11:319\n91#3:381\n456#4,8:330\n464#4,3:344\n36#4:371\n467#4,3:378\n4144#5,6:338\n76#6:348\n81#7,11:349\n81#7,11:360\n1097#8,6:372\n*S KotlinDebug\n*F\n+ 1 GifFaceTopBuyContainer.kt\ncom/yalla/yalla/ui/view/GifFaceTopBuyContainer$initData$2$1\n*L\n89#1:313,6\n89#1:347\n89#1:382\n89#1:319,11\n89#1:381\n89#1:330,8\n89#1:344,3\n130#1:371\n89#1:378,3\n89#1:338,6\n93#1:348\n94#1:349,11\n95#1:360,11\n130#1:372,6\n*E\n"})
public final class e0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ q f56781OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ComposeView f56782OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GifFaceView f56783OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(q qVar, GifFaceView gifFaceView, ComposeView composeView) {
        super(2);
        this.f56781OooO0Oo = qVar;
        this.f56783OooO0o0 = gifFaceView;
        this.f56782OooO0o = composeView;
    }

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
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462553007, iIntValue, -1, "com.yalla.yalla.ui.view.GifFaceTopBuyContainer.initData.<anonymous>.<anonymous> (GifFaceTopBuyContainer.kt:86)");
            }
            GifListJson gifListJson = (GifListJson) LiveDataAdapterKt.observeAsState(this.f56781OooO0Oo.f56935OooO0O0, composer2, 8).getValue();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposeView composeView = this.f56782OooO0o;
            q qVar = this.f56781OooO0Oo;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Intrinsics.checkNotNull(gifListJson);
            if (gifListJson.isCanUse()) {
                composer2.startReplaceableGroup(1463673158);
                i0.OooO0O0(gifListJson, composer2, 8);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1463673244);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                composer2.startReplaceableGroup(1729797275);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer2, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel = ViewModelKt.viewModel(LiveRoomVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                LiveRoomVM liveRoomVM = (LiveRoomVM) viewModel;
                composer2.startReplaceableGroup(1729797275);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer2, 6);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                ViewModel viewModel2 = ViewModelKt.viewModel(o0oOo0O0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
                composer2.endReplaceableGroup();
                d0 d0Var = new d0(composeView, gifListJson, liveRoomVM, (o0oOo0O0) viewModel2, lifecycleOwner, qVar);
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(d0Var);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new z(d0Var);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                this.f56783OooO0o0.setBuyGifCallBack((Function0) objRememberedValue);
                i0.OooO00o(gifListJson, d0Var, composer2, 8);
                composer2.endReplaceableGroup();
            }
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
