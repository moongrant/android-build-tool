package p423o0OoO0OO;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.request.OooO00o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p121o00O0Ooo.o0000;
import p121o00O0Ooo.o000O0o;
import p403o0Oo0OO.OooO0OO;
import p511o0o0O.o0O0O00;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCoilImageRequestExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoilImageRequestExt.kt\ncom/yalla/yalla/ext/CoilImageRequestExtKt\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n489#2,11:93\n76#3:104\n76#3:106\n76#3:107\n76#3:108\n1#4:105\n*S KotlinDebug\n*F\n+ 1 CoilImageRequestExt.kt\ncom/yalla/yalla/ext/CoilImageRequestExtKt\n*L\n19#1:93,11\n40#1:104\n54#1:106\n69#1:107\n84#1:108\n*E\n"})
public final class o000OO {
    @Composable
    @NotNull
    public static final o0000 OooO00o(@Nullable String str, @Nullable o0O0O00 o0o0o00, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1772315081);
        if ((i2 & 1) != 0) {
            o0o0o00 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1772315081, i, -1, "com.yalla.yalla.ext.netImageGiftPainter (CoilImageRequestExt.kt:82)");
        }
        OooO00o.C0189OooO00o c0189OooO00o = new OooO00o.C0189OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0189OooO00o.f11680OooO0OO = str;
        int i3 = o0Oo0oo.icon_gift_default_gray;
        c0189OooO00o.OooO0OO(i3);
        c0189OooO00o.OooO0Oo(i3);
        if (o0o0o00 != null) {
            o0o0o00.invoke(c0189OooO00o);
        }
        o0000 o0000VarOooO00o = o000O0o.OooO00o(c0189OooO00o.OooO00o(), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000VarOooO00o;
    }

    @Composable
    @NotNull
    public static final o0000 OooO0O0(@Nullable String str, @Nullable Function1<? super OooO00o.C0189OooO00o, Unit> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-404892806);
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404892806, i, -1, "com.yalla.yalla.ext.netImageHeaderPainter (CoilImageRequestExt.kt:52)");
        }
        OooO00o.C0189OooO00o c0189OooO00o = new OooO00o.C0189OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0189OooO00o.f11680OooO0OO = OooO0OO.OooO00o(str);
        int i3 = o0Oo0oo.icon_head_default;
        c0189OooO00o.OooO0OO(i3);
        c0189OooO00o.OooO0Oo(i3);
        if (function1 != null) {
            function1.invoke(c0189OooO00o);
        }
        o0000 o0000VarOooO00o = o000O0o.OooO00o(c0189OooO00o.OooO00o(), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000VarOooO00o;
    }

    @Composable
    @NotNull
    public static final o0000 OooO0OO(@Nullable String str, @Nullable Function1<? super OooO00o.C0189OooO00o, Unit> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1745065735);
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745065735, i, -1, "com.yalla.yalla.ext.netImagePainter (CoilImageRequestExt.kt:38)");
        }
        OooO00o.C0189OooO00o c0189OooO00o = new OooO00o.C0189OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0189OooO00o.f11680OooO0OO = str;
        if (function1 != null) {
            function1.invoke(c0189OooO00o);
        }
        o0000 o0000VarOooO00o = o000O0o.OooO00o(c0189OooO00o.OooO00o(), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000VarOooO00o;
    }

    @Composable
    @NotNull
    public static final o0000 OooO0Oo(@Nullable String str, @Nullable Function1<? super OooO00o.C0189OooO00o, Unit> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-940437661);
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-940437661, i, -1, "com.yalla.yalla.ext.netImagePicturePainter (CoilImageRequestExt.kt:67)");
        }
        OooO00o.C0189OooO00o c0189OooO00o = new OooO00o.C0189OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0189OooO00o.f11680OooO0OO = str;
        int i3 = o0Oo0oo.icon_picture_default;
        c0189OooO00o.OooO0OO(i3);
        c0189OooO00o.OooO0Oo(i3);
        if (function1 != null) {
            function1.invoke(c0189OooO00o);
        }
        o0000 o0000VarOooO00o = o000O0o.OooO00o(c0189OooO00o.OooO00o(), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000VarOooO00o;
    }

    @NotNull
    public static final void OooO0o(@NotNull OooO00o.C0189OooO00o c0189OooO00o, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(c0189OooO00o, "<this>");
        c0189OooO00o.f11710Oooo00O = drawable;
        c0189OooO00o.f11709Oooo000 = 0;
        c0189OooO00o.f11707OooOooo = drawable;
        c0189OooO00o.f11706OooOooO = 0;
    }

    @NotNull
    public static final void OooO0o0(@NotNull OooO00o.C0189OooO00o c0189OooO00o, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(c0189OooO00o, "<this>");
        c0189OooO00o.OooO0OO(i);
        c0189OooO00o.OooO0Oo(i);
    }
}
