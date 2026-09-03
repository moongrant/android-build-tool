package p593o0oOooOo;

import Oooo000.o000OO0O;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.composable.event.EventKt;
import com.yalla.yalla.ui.vm.event.EventSettingViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.sqlcipher.database.SQLiteDatabase;
import o0000O0O.o00Oo0;
import o0O0O00.o000000;
import o0O0O00.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o0O000;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.o0oO0Ooo;
import p028Oooo0o0.oo00o;
import p031OoooO.o000Oo0;
import p033OoooO00.o00O0O;
import p043OooooO0.o00;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p074o000O0oo.OooOOO;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p146o00Oo0.o000O0Oo;
import p255o00ooO0O.o000O0o;
import p255o00ooO0O.o00O000;
import p262o00ooOoO.x;
import p393o0OOooOo.o0O00000;
import p509o0o00oOO.o0000O0;
import p551o0oO0O0o.o000O;
import p551o0oO0O0o.o000O0O0;
import p573o0oOo0o.o00O00o0;
import p573o0oOo0o.o00O0OO;
import p586o0oOoo.o0000O;
import p620o0oo0o0.o0O0O00;
import p620o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class c5 extends o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final c5 f47222OooO00o = new c5();

    public static final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f47224OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00O0O00 f47225OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o00O0O00 o00o0o01, int i) {
            super(2);
            this.f47225OoooO00 = o00o0o01;
            this.f47224OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            c5.this.OooO00o(this.f47225OoooO00, ooo00o, this.f47224OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventSettingViewModel f47226Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EventSettingViewModel eventSettingViewModel) {
            super(1);
            this.f47226Oooo = eventSettingViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            bool.booleanValue();
            o0O00000.OooO0OO("Room_explore_Everts_subscribe_view_switch");
            this.f47226Oooo.setEventSettingState();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f47228OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f47228OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            c5.this.OooO0o0(ooo00o, this.f47228OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<o00OOOO0, Lifecycle.State, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ EventSettingViewModel f47229Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(EventSettingViewModel eventSettingViewModel) {
            super(2);
            this.f47229Oooo = eventSettingViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(o00OOOO0 o00oooo1, Lifecycle.State state) {
            o00OOOO0 LifecycleEffect = o00oooo1;
            Lifecycle.State it = state;
            Intrinsics.checkNotNullParameter(LifecycleEffect, "$this$LifecycleEffect");
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == Lifecycle.State.RESUMED) {
                o0O00O<Boolean> hasPermissions = this.f47229Oooo.getHasPermissions();
                o00O000 o00o001 = o00O000.f34368OooO00o;
                hasPermissions.setValue(Boolean.valueOf(o0O0O00.OooO0O0(o00O000.OooO00o(), oo0o0Oo.f48625OooO0OO)));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Context f47230Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Context context) {
            super(0);
            this.f47230Oooo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = this.f47230Oooo;
            if (context instanceof FragmentActivity) {
                ((FragmentActivity) context).onBackPressed();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f47232OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i) {
            super(2);
            this.f47232OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            c5.this.OooO0o(ooo00o, this.f47232OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Context f47233Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Context context) {
            super(0);
            this.f47233Oooo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            try {
                Intent intent = new Intent();
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", this.f47233Oooo.getPackageName(), null));
                this.f47233Oooo.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f47235OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i) {
            super(2);
            this.f47235OoooO00 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            c5.this.OooO0o(ooo00o, this.f47235OoooO00 | 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @Override // p586o0oOoo.o0000O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@NotNull o00O0O00 o00o0o01, @Nullable oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(o00o0o01, "<this>");
        oOO00O composer = ooo00o.OooOOo(35060258);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            composer.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventSettingViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventSettingViewModel eventSettingViewModel = (EventSettingViewModel) viewModel;
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(eventSettingViewModel);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o = new OooO0OO(eventSettingViewModel);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            o00O00o0.OooO00o((Function2) objOooO0o, composer, 0);
            o000O0O0 o000o0o0OooO00o = o000O.OooO00o(composer);
            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
            o000o0o0OooO00o.OooO00o(o0000O0.f41711OooO0O0, true, o000O.f44617OooO0O0);
            p048OoooooO.o00OOOO0 o00oooo0OooO0O0 = BackgroundKt.OooO0O0(OoooooO.o00OOOO0.OooO00o.f4215Oooo, x.OooO0O0(composer).OooOo00(), o000O0Oo.f32120OooO00o);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2042OooO0Oo, o00OO0O0.OooO00o.f4199OooOOO, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Ooo.OooO0O0(o00oooo0OooO0O0);
            if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
                o00O00O.OooO00o();
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
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-1163856341);
            Context context = (Context) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6616OooO0O0);
            o00O0OO.OooO00o(o00000.OooO0OO.OooO00o(R.string.event_setting, composer), x.OooO0O0(composer).OooO0o(), 0, new OooO0o(context), null, null, x.OooO0O0(composer).OooO0Oo(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, false, composer, 0, 0, 1972);
            c5 c5Var = f47222OooO00o;
            c5Var.OooO0o(composer, 6);
            c5Var.OooO0o0(composer, 6);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO(o00o0o01, i));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O composer = ooo00o.OooOOo(-174317572);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            Context context = (Context) composer.OooOO0o(androidx.compose.ui.platform.o0O0O00.f6616OooO0O0);
            if (!(context instanceof FragmentActivity)) {
                oo0ooO oo0oooOooOo = composer.OooOo();
                if (oo0oooOooOo == null) {
                    return;
                }
                oo0oooOooOo.OooO00o(new OooOO0(i));
                return;
            }
            composer.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventSettingViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            if (!((EventSettingViewModel) viewModel).getHasPermissions().getValue().booleanValue()) {
                OoooooO.o00OOOO0.OooO00o oooO00o = OoooooO.o00OOOO0.OooO00o.f4215Oooo;
                p048OoooooO.o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
                o0000O0 o0000o1 = o0000O0.f41710OooO00o;
                long j = o0000O0.f41712OooO0OO;
                p048OoooooO.o00OOOO0 o00oooo0OooO = PaddingKt.OooO(BackgroundKt.OooO0O0(o00oooo0OooO0o, j, o000O0Oo.f32120OooO00o), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 13);
                o00OO0OO.OooO00o oooO00o2 = o00OO0O0.OooO00o.f4201OooOOOO;
                composer.OooO0o0(-483455358);
                p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
                o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2042OooO0Oo, oooO00o2, composer);
                composer.OooO0o0(-1323940314);
                o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6371OooO0o0);
                LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6375OooOO0O);
                o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6379OooOOOO);
                Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
                Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
                Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Ooo.OooO0O0(o00oooo0OooO);
                if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
                    o00O00O.OooO00o();
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
                oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26600OooO0o0);
                oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26598OooO0Oo);
                oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26599OooO0o);
                ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26601OooO0oO, composer, "composer", composer), composer, 0);
                p031OoooO.o000O0O0.OooO0OO(OooOOO.OooO00o(composer, 2058660585, -1163856341, R.string.event_setting_enable_desc, composer), null, x.OooO0O0(composer).OooO(), o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
                o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, 14), composer, 6);
                p031OoooO.o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_setting_enable, composer), o000O0o.OooO0O0(PaddingKt.OooO0oO(BackgroundKt.OooO0O0(PaddingKt.OooO0oO(SizeKt.OooO0o(oooO00o), 46, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), o0000O0.f41729OooOo0, o00O0O.f3445OooO00o), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 12, 1), false, false, null, new OooOO0O(context), 253), j, o00Oo0.OooO0OO(15), null, null, null, 0L, null, new o0000O0.OooO0o(3), 0L, 0, false, 0, null, null, composer, 3456, 0, 65008);
                o0O0OO0.OooO00o(SizeKt.OooO0oO(oooO00o, 19), composer, 6);
                EventKt.OooO0Oo(composer, 0);
                composer.Oooo0o0();
                composer.Oooo0o0();
                composer.Oooo0o();
                composer.Oooo0o0();
                composer.Oooo0o0();
            }
        }
        oo0ooO oo0oooOooOo2 = composer.OooOo();
        if (oo0oooOooOo2 == null) {
            return;
        }
        oo0oooOooOo2.OooO00o(new OooOOO0(i));
    }

    /* JADX WARN: Type inference failed for: r16v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0o0(oOO00O ooo00o, int i) {
        CreationExtras defaultViewModelCreationExtras;
        oOO00O composer = ooo00o.OooOOo(-1799433661);
        if ((i & 1) == 0 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<p100o000oOoO.o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29723OooO00o;
            composer.OooO0o0(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel(EventSettingViewModel.class, current, null, null, defaultViewModelCreationExtras, composer, 36936, 0);
            composer.Oooo0o0();
            EventSettingViewModel eventSettingViewModel = (EventSettingViewModel) viewModel;
            OoooooO.o00OOOO0.OooO00o oooO00o = OoooooO.o00OOOO0.OooO00o.f4215Oooo;
            p048OoooooO.o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
            o0000O0 o0000o1 = o0000O0.f41710OooO00o;
            float f = 14;
            p048OoooooO.o00OOOO0 o00oooo0OooO0oo = PaddingKt.OooO0oo(BackgroundKt.OooO0O0(o00oooo0OooO0o, o0000O0.f41712OooO0OO, o000O0Oo.f32120OooO00o), f, 12, f, 18);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2039OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2042OooO0Oo, o00OO0O0.OooO00o.f4199OooOOO, composer);
            composer.OooO0o0(-1323940314);
            o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6371OooO0o0;
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6375OooOO0O;
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6379OooOOOO;
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Objects.requireNonNull(o000000.OooO00o.f26594OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26596OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o00Ooo.OooO0O0(o00oooo0OooO0oo);
            if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
                o00O00O.OooO00o();
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
            ?? r2 = o000000.OooO00o.C0279OooO00o.f26600OooO0o0;
            oO00000o.OooO0O0(composer, o000000VarOooO00o, r2);
            ?? r3 = o000000.OooO00o.C0279OooO00o.f26598OooO0Oo;
            oO00000o.OooO0O0(composer, oooO, r3);
            ?? r4 = o000000.OooO00o.C0279OooO00o.f26599OooO0o;
            oO00000o.OooO0O0(composer, layoutDirection, r4);
            ?? r16 = o000000.OooO00o.C0279OooO00o.f26601OooO0oO;
            ((o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r16, composer, "composer", composer), composer, 0);
            p048OoooooO.o00OOOO0 o00oooo0OooO0O0 = o000OO0O.OooO0O0(composer, 2058660585, -1163856341, oooO00o);
            o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4198OooOO0o;
            composer.OooO0o0(693286680);
            o000000 o000000VarOooO00o2 = o0oO0Ooo.OooO00o(p028Oooo0o0.o00O000.f2040OooO0O0, oooO0O0, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o00Ooo.OooO0O0(o00oooo0OooO0O0);
            if (!(composer.OooOo0o() instanceof p100o000oOoO.o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            ((o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r2, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r16, composer, "composer", composer), composer, 0);
            p031OoooO.o000O0O0.OooO0OO(OooOOO.OooO00o(composer, 2058660585, -678309503, R.string.event_setting_auto_add_title, composer), null, x.OooO0O0(composer).OooO0o(), o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            if (!(((double) 1.0f) > 0.0d)) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
            }
            Function1<o00O000o, Unit> function1 = o00oOoo.f6585OooO00o;
            Function1<o00O000o, Unit> function2 = o00oOoo.f6585OooO00o;
            o0O000 o0o001 = new o0O000(true);
            oooO00o.OooOOoo(o0o001);
            o0O0OO0.OooO00o(o0o001, composer, 0);
            Boolean value = eventSettingViewModel.getSettingState().getValue();
            Intrinsics.checkNotNullExpressionValue(value, "vm.settingState.value");
            boolean zBooleanValue = value.booleanValue();
            composer.OooO0o0(1157296644);
            boolean zOooo0oo = composer.Oooo0oo(eventSettingViewModel);
            Object objOooO0o = composer.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29707OooO0O0) {
                objOooO0o = new OooO00o(eventSettingViewModel);
                composer.Oooo00o(objOooO0o);
            }
            composer.Oooo0o0();
            p031OoooO.o000O0o.OooO00o(zBooleanValue, (Function1) objOooO0o, null, false, null, null, composer, 0, 60);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            p031OoooO.o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.event_auto_add_calendar, composer), null, x.OooO0O0(composer).OooO(), o00Oo0.OooO0OO(12), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
            p028Oooo0o0.o0O0O0o0.OooO00o(composer);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(i));
    }
}
