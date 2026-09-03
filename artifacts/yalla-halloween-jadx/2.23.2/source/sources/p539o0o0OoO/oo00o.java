package p539o0o0OoO;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.CategoryModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p193o00o0O0O.o0000oo;
import p423o0OoO0OO.o000OO;
import p476o0OooooO.o0OOo000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54600OooO00o = ComposableLambdaKt.composableLambdaInstance(-1269950199, false, OooO00o.f54613OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54601OooO0O0 = ComposableLambdaKt.composableLambdaInstance(2111179570, false, OooOO0.f54617OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54602OooO0OO = ComposableLambdaKt.composableLambdaInstance(1223142033, false, OooOO0O.f54618OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54603OooO0Oo = ComposableLambdaKt.composableLambdaInstance(335104496, false, OooOOO0.f54620OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54605OooO0o0 = ComposableLambdaKt.composableLambdaInstance(-552933041, false, OooOOO.f54619OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54604OooO0o = ComposableLambdaKt.composableLambdaInstance(-1440970578, false, OooOOOO.f54621OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54606OooO0oO = ComposableLambdaKt.composableLambdaInstance(1965959181, false, OooOo00.f54623OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54607OooO0oo = ComposableLambdaKt.composableLambdaInstance(1077921644, false, OooOo.f54622OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54599OooO = ComposableLambdaKt.composableLambdaInstance(189884107, false, Oooo000.f54624OooO0Oo);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54608OooOO0 = ComposableLambdaKt.composableLambdaInstance(-698153430, false, OooO0O0.f54614OooO0Oo);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54609OooOO0O = ComposableLambdaKt.composableLambdaInstance(477980334, false, OooO0OO.f54615OooO0Oo);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54610OooOO0o = ComposableLambdaKt.composableLambdaInstance(-410057203, false, OooO0o.f54616OooO0Oo);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f54611OooOOO0 = ComposableLambdaKt.composableLambdaInstance(-1298094740, false, OooO.f54612OooO0Oo);

    public static final class OooO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f54612OooO0Oo = new OooO();

        public OooO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1298094740, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-13.<anonymous> (RoomSettingScreen.kt:185)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,348:1\n154#2:349\n81#3:350\n*S KotlinDebug\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-1$1\n*L\n85#1:349\n82#1:350\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54613OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1269950199, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-1.<anonymous> (RoomSettingScreen.kt:81)");
                }
                ImageKt.Image(o000OO.OooO0O0((String) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24536OooO00o, composer2, 8).getValue(), null, composer2, 0, 1), (String) null, SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(40)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f54614OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-698153430, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-10.<anonymous> (RoomSettingScreen.kt:168)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f54615OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(477980334, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-11.<anonymous> (RoomSettingScreen.kt:172)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f54616OooO0Oo = new OooO0o();

        public OooO0o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-410057203, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-12.<anonymous> (RoomSettingScreen.kt:176)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-2$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,348:1\n81#2:349\n*S KotlinDebug\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-2$1\n*L\n91#1:349\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f54617OooO0Oo = new OooOO0();

        public OooOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2111179570, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-2.<anonymous> (RoomSettingScreen.kt:90)");
                }
                String str = (String) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24537OooO0O0, "", composer2, 56).getValue();
                if (str == null) {
                    str = "";
                }
                long sp = TextUnitKt.getSp(14);
                TextKt.m1261Text4IGK_g(str, (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-3$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,348:1\n81#2:349\n*S KotlinDebug\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-3$1\n*L\n98#1:349\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f54618OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1223142033, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-3.<anonymous> (RoomSettingScreen.kt:96)");
                }
                LiveDataAdapterKt.observeAsState(new MutableLiveData("1"), composer2, 8);
                TextKt.m1261Text4IGK_g((String) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.f48463OooO0o, null, composer2, 8, 1).getValue(), (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,348:1\n154#2:349\n154#2:350\n81#3:351\n*S KotlinDebug\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-5$1\n*L\n127#1:349\n129#1:350\n130#1:351\n*E\n"})
    public static final class OooOOO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f54619OooO0Oo = new OooOOO();

        public OooOOO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-552933041, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-5.<anonymous> (RoomSettingScreen.kt:123)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.icv_coin, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(2), null, composer2, 6, 2);
                TextKt.m1261Text4IGK_g(String.valueOf((Integer) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24552OooOOo0, 0, composer2, 56).getValue()), (Modifier) null, o0OOo000.f48213o0000OO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomSettingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-4$1\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,348:1\n81#2:349\n*S KotlinDebug\n*F\n+ 1 RoomSettingScreen.kt\ncom/yalla/yalla/ui/screen/room/ComposableSingletons$RoomSettingScreenKt$lambda-4$1\n*L\n112#1:349\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f54620OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(335104496, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-4.<anonymous> (RoomSettingScreen.kt:111)");
                }
                CategoryModel categoryModel = (CategoryModel) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24551OooOOo, composer2, 8).getValue();
                String str = categoryModel != null ? categoryModel.labelname : null;
                if (str == null) {
                    str = "";
                }
                TextKt.m1261Text4IGK_g(str, (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f54621OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1440970578, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-6.<anonymous> (RoomSettingScreen.kt:143)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f54622OooO0Oo = new OooOo();

        public OooOo() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1077921644, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-8.<anonymous> (RoomSettingScreen.kt:151)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f54623OooO0Oo = new OooOo00();

        public OooOo00() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1965959181, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-7.<anonymous> (RoomSettingScreen.kt:147)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f54624OooO0Oo = new Oooo000();

        public Oooo000() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope RoomSettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RoomSettingItem, "$this$RoomSettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(189884107, iIntValue, -1, "com.yalla.yalla.ui.screen.room.ComposableSingletons$RoomSettingScreenKt.lambda-9.<anonymous> (RoomSettingScreen.kt:159)");
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
