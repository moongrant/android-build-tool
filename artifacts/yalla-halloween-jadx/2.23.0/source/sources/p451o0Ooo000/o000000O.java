package p451o0Ooo000;

import android.content.Context;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import kotlin.jvm.internal.SourceDebugExtension;
import net.sqlcipher.database.SQLiteDatabase;
import p147o00Oo0Oo.o000OOo;
import p148o00Oo0o.o00000O0;
import p158o00OoOOO.oo000o;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.o1;
import p507o0o00ooo.t1;
import p507o0o00ooo.v;
import p573o0oOoOOO.oO0OO00;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingScreen.kt\ncom/yalla/yalla/module/main/ui/screen/SettingScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,163:1\n76#2:164\n76#2:176\n81#3,11:165\n81#3,11:177\n154#4:188\n154#4:189\n*S KotlinDebug\n*F\n+ 1 SettingScreen.kt\ncom/yalla/yalla/module/main/ui/screen/SettingScreenKt\n*L\n60#1:164\n90#1:176\n61#1:165,11\n91#1:177,11\n156#1:188\n159#1:189\n*E\n"})
public final class o000000O {
    public static final void OooO00o(ColumnScope columnScope, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1367652759);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1367652759, i, -1, "com.yalla.yalla.module.main.ui.screen.SettingScreenContent (SettingScreen.kt:83)");
            }
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Settings, composerStartRestartGroup, 0);
            long j = o000OOo.OooO0OO(composerStartRestartGroup).f37715OooOOOO;
            Modifier.Companion companion = Modifier.INSTANCE;
            t1.OooO00o(strStringResource, 0.0f, j, null, null, null, null, null, BackgroundKt.m169backgroundbw27NRU$default(companion, o000OOo.OooO0OO(composerStartRestartGroup).f37716OooOOOo, null, 2, null), composerStartRestartGroup, 0, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(oO0OO00.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            oO0OO00 oo0oo00 = (oO0OO00) viewModel;
            String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.Account, composerStartRestartGroup, 0);
            float f = v.f50296OooO0OO;
            o1.OooO00o(strStringResource2, 0L, 0.0f, null, null, false, true, null, null, false, f, null, o000oOoO.f46433OooO0Oo, composerStartRestartGroup, 1572864, 384, 3006);
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Setting_push_notifications, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, null, null, false, 0.0f, null, new o0OoOo0(context), composerStartRestartGroup, 1572864, 0, 4030);
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.my_privacy, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, null, null, false, 0.0f, null, new o00O0O(context), composerStartRestartGroup, 1572864, 0, 4030);
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Blocked_List, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, null, null, false, f, null, new o00Oo0(context), composerStartRestartGroup, 1572864, 0, 3006);
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.clear_cache, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, null, null, false, 0.0f, null, new oo000o(oo0oo00), composerStartRestartGroup, 1572864, 0, 4030);
            composer2 = composerStartRestartGroup;
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.clear_chat_msg, composer2, 0), 0L, 0.0f, null, null, false, true, null, null, false, f, null, new o00oO0o(oo0oo00), composer2, 1572864, 0, 3006);
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Network_Test, composer2, 0), 0L, 0.0f, null, null, false, true, null, null, false, 0.0f, null, o0ooOOo.f46443OooO0Oo, composer2, 1572864, 384, 4030);
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.about, composer2, 0), 0L, 0.0f, null, null, false, true, null, null, false, f, null, new o0OOO0o(context), composer2, 1572864, 0, 3006);
            o00000O0.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.logoup, composer2, 0), 0L, FontWeight.INSTANCE.getNormal(), null, Color.m1660boximpl(o0oO0O0o.f46994OoooOoO), Color.m1660boximpl(o000OOo.OooO0OO(composer2).f37703OooO0O0), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(0)), 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(50)), new o0Oo0oo(context), composer2, 384, 100663296, 262026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(columnScope, i));
    }

    public static final void OooO0O0(ColumnScope columnScope, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-854169740);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-854169740, i, -1, "com.yalla.yalla.module.main.ui.screen.SettingScreenDialog (SettingScreen.kt:58)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(oO0OO00.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            oO0OO00 oo0oo00 = (oO0OO00) viewModel;
            oo000o.OooO0Oo(oo0oo00.f56303OooO00o, OooOOOO.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.clear_cache, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(oO00OOo0.Question_mark, composerStartRestartGroup, 0)), StringResources_androidKt.stringResource(oO00OOo0.clear_cache_info, composerStartRestartGroup, 0), null, false, false, null, null, null, false, null, false, new o0OO00O(oo0oo00), null, false, false, null, oo0o0Oo.f46445OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913400);
            composer2 = composerStartRestartGroup;
            oo000o.OooO0Oo(oo0oo00.f56304OooO0O0, StringResources_androidKt.stringResource(oO00OOo0.clear_chat_dialog_title, composer2, 0), StringResources_androidKt.stringResource(oO00OOo0.clear_chat_dialog_info, composer2, 0), null, false, false, null, null, null, false, null, false, new o0O0O00(oo0oo00), null, false, false, null, o000OOo.f46432OooO0Oo, null, null, composer2, 0, 12582912, 913400);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000000(columnScope, i));
    }
}
