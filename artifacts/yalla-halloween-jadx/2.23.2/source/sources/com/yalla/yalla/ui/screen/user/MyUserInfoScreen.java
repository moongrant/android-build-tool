package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p543o0o0Ooo0.oo000000;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u0006H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\u0003R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R4\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@FX\u0086\u008e\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R4\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001a8F@FX\u0086\u008e\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/MyUserInfoScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "navigate", "", "", "languageMap", "Ljava/util/Map;", "getLanguageMap", "()Ljava/util/Map;", "Landroidx/compose/ui/unit/IntOffset;", "<set-?>", "languageLocation$delegate", "Landroidx/compose/runtime/MutableState;", "getLanguageLocation-nOcc-ac", "()J", "setLanguageLocation--gyyYBs", "(J)V", "languageLocation", "Landroidx/compose/ui/unit/IntSize;", "languageSize$delegate", "getLanguageSize-YbymL2g", "setLanguageSize-ozmzZPI", "languageSize", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMyUserInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/MyUserInfoScreen\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1073:1\n81#2:1074\n107#2,2:1075\n81#2:1077\n107#2,2:1078\n*S KotlinDebug\n*F\n+ 1 MyUserInfoScreen.kt\ncom/yalla/yalla/ui/screen/user/MyUserInfoScreen\n*L\n108#1:1074\n108#1:1075,2\n109#1:1077\n109#1:1078,2\n*E\n"})
public final class MyUserInfoScreen extends o000O0 {
    public static final int $stable;

    @NotNull
    public static final MyUserInfoScreen INSTANCE = new MyUserInfoScreen();

    /* JADX INFO: renamed from: languageLocation$delegate, reason: from kotlin metadata */
    @NotNull
    private static final MutableState languageLocation;

    @NotNull
    private static final Map<Integer, Integer> languageMap;

    /* JADX INFO: renamed from: languageSize$delegate, reason: from kotlin metadata */
    @NotNull
    private static final MutableState languageSize;

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29413OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29414OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29414OooO0o0 = columnScope;
            this.f29413OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29413OooO0o | 1);
            MyUserInfoScreen.this.Content(this.f29414OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, Integer.valueOf(o000000.single_language_English));
        linkedHashMap.put(1, Integer.valueOf(o000000.single_language_Arabic));
        linkedHashMap.put(2, Integer.valueOf(o000000.single_language_Turkish));
        linkedHashMap.put(3, Integer.valueOf(o000000.single_language_Indonesia));
        linkedHashMap.put(4, Integer.valueOf(o000000.single_language_Japanese));
        linkedHashMap.put(5, Integer.valueOf(o000000.single_language_Portugal));
        linkedHashMap.put(6, Integer.valueOf(o000000.single_language_Espana));
        linkedHashMap.put(7, Integer.valueOf(o000000.single_language_Hindi));
        linkedHashMap.put(8, Integer.valueOf(o000000.single_language_Urdu));
        languageMap = linkedHashMap;
        languageLocation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m3884boximpl(IntOffsetKt.IntOffset(0, 0)), null, 2, null);
        languageSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3927boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
        $stable = 8;
    }

    private MyUserInfoScreen() {
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493619649);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493619649, i, -1, "com.yalla.yalla.ui.screen.user.MyUserInfoScreen.Content (MyUserInfoScreen.kt:84)");
            }
            oo000000.OooOOO0(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getLanguageLocation-nOcc-ac, reason: not valid java name */
    public final long m4204getLanguageLocationnOccac() {
        return ((IntOffset) languageLocation.getValue()).getPackedValue();
    }

    @NotNull
    public final Map<Integer, Integer> getLanguageMap() {
        return languageMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getLanguageSize-YbymL2g, reason: not valid java name */
    public final long m4205getLanguageSizeYbymL2g() {
        return ((IntSize) languageSize.getValue()).getPackedValue();
    }

    @Override // p532o0o0OOo0.o000O0
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4200getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2126270202);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2126270202, i, -1, "com.yalla.yalla.ui.screen.user.MyUserInfoScreen.getWindowBackgroundColor (MyUserInfoScreen.kt:89)");
        }
        long j = o0000oo.OooO0OO(composer).f38619OooO0OO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate() {
        o00O00.OooO0o0(INSTANCE, null, false, null, 14);
    }

    /* JADX INFO: renamed from: setLanguageLocation--gyyYBs, reason: not valid java name */
    public final void m4206setLanguageLocationgyyYBs(long j) {
        languageLocation.setValue(IntOffset.m3884boximpl(j));
    }

    /* JADX INFO: renamed from: setLanguageSize-ozmzZPI, reason: not valid java name */
    public final void m4207setLanguageSizeozmzZPI(long j) {
        languageSize.setValue(IntSize.m3927boximpl(j));
    }
}
