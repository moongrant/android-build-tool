package p175o00OooOo;

import Oooo000.OooO0o;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.app.base.view.FacePanelView;
import com.app.base.view.GifFaceView;
import com.yalla.yalla.common.vm.LiveRoomVM;
import com.yalla.yalla.model.GifListJson;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000000.OooO00o;
import o0000O.OooO0OO;
import o0000O0O.OooO;
import o0O0O00.o000000;
import o0O0O00.o00Oo0;
import p028Oooo0o0.o0O0OO0;
import p043OooooO0.o00;
import p044OooooOO.o00O00O;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p604o0oo00oO.oO0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FacePanelView.OooO0O0 f32734Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ GifFaceView f32735Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ComposeView f32736Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000(FacePanelView.OooO0O0 oooO0O0, GifFaceView gifFaceView, ComposeView composeView) {
        super(2);
        this.f32734Oooo0o = oooO0O0;
        this.f32735Oooo0oO = gifFaceView;
        this.f32736Oooo0oo = composeView;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
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
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        CreationExtras defaultViewModelCreationExtras;
        CreationExtras creationExtras;
        oOO00O composer = ooo00o;
        if ((num.intValue() & 11) == 2 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            GifListJson gifListJson = (GifListJson) o00O00O.OooO0O0(this.f32734Oooo0o.f11973OooO0O0, composer).getValue();
            o00OOOO0 o00oooo0OooO0o0 = SizeKt.OooO0o0(o00OOOO0.OooO00o.f4198Oooo0o);
            GifFaceView gifFaceView = this.f32735Oooo0oO;
            ComposeView composeView = this.f32736Oooo0oo;
            FacePanelView.OooO0O0 oooO0O0 = this.f32734Oooo0o;
            composer.OooO0o0(733328855);
            o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
            composer.OooO0o0(-1323940314);
            OooO oooO = (OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(OooO00o.f26575OooO0Oo);
            Function0<OooO00o> function0 = OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Oo0.OooO0O0(o00oooo0OooO0o0);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                p100o000oOoO.o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO0Oo, OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, OooO00o.C0279OooO00o.f26580OooO0o);
            ((o00) function3OooO0O0).invoke(OooO0o.OooO00o(composer, o00ooooo2, OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            Intrinsics.checkNotNull(gifListJson);
            if (gifListJson.isCanUse()) {
                composer.OooO0o0(912643768);
                OooO0OO.OooO0O0(gifListJson, composer, 8);
                composer.Oooo0o0();
            } else {
                composer.OooO0o0(912643854);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.OooOO0o(o0O0O00.f6593OooO0Oo);
                composer.OooO0o0(1729797275);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composer, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel(LiveRoomVM.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
                composer.Oooo0o0();
                LiveRoomVM liveRoomVM = (LiveRoomVM) viewModel;
                composer.OooO0o0(1729797275);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composer, 6);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current2 instanceof HasDefaultViewModelProviderFactory) {
                    CreationExtras defaultViewModelCreationExtras2 = ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras2, "{\n        viewModelStore…ModelCreationExtras\n    }");
                    creationExtras = defaultViewModelCreationExtras2;
                } else {
                    creationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel2 = ViewModelKt.viewModel(oO0Oo0oo.class, current2, null, null, creationExtras, composer, 36936, 0);
                composer.Oooo0o0();
                o0O o0o = new o0O(composeView, gifListJson, liveRoomVM, (oO0Oo0oo) viewModel2, lifecycleOwner, oooO0O0);
                composer.OooO0o0(1157296644);
                boolean zOooo0oo = composer.Oooo0oo(o0o);
                Object objOooO0o = composer.OooO0o();
                if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o = new o0O0o00O(o0o);
                    composer.Oooo00o(objOooO0o);
                }
                composer.Oooo0o0();
                gifFaceView.setBuyGifCallBack((Function0) objOooO0o);
                OooO0OO.OooO00o(gifListJson, o0o, composer, 8);
                composer.Oooo0o0();
            }
            o0O0OO0.OooO00o(composer);
        }
        return Unit.INSTANCE;
    }
}
