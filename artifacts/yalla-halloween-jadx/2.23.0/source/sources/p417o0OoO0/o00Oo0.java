package p417o0OoO0;

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
import p100o000oOoo.o0000O0;
import p100o000oOoo.o000O00O;
import p396o0Oo0O.OooOOO;
import p520o0o0O0oo.r6;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCoilImageRequestExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoilImageRequestExt.kt\ncom/yalla/yalla/ext/CoilImageRequestExtKt\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n489#2,11:93\n76#3:104\n76#3:106\n76#3:107\n76#3:108\n1#4:105\n*S KotlinDebug\n*F\n+ 1 CoilImageRequestExt.kt\ncom/yalla/yalla/ext/CoilImageRequestExtKt\n*L\n19#1:93,11\n40#1:104\n54#1:106\n69#1:107\n84#1:108\n*E\n"})
public final class o00Oo0 {
    @Composable
    @NotNull
    public static final o0000O0 OooO00o(@Nullable String str, @Nullable r6 r6Var, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1772315081);
        if ((i2 & 1) != 0) {
            r6Var = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1772315081, i, -1, "com.yalla.yalla.ext.netImageGiftPainter (CoilImageRequestExt.kt:80)");
        }
        OooO00o.C0170OooO00o c0170OooO00o = new OooO00o.C0170OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0170OooO00o.f8590OooO0OO = str;
        int i3 = oOo00OO0.icon_gift_default_gray;
        c0170OooO00o.OooO0OO(i3);
        c0170OooO00o.OooO0Oo(i3);
        if (r6Var != null) {
            r6Var.invoke(c0170OooO00o);
        }
        o0000O0 o0000o0OooO00o = o000O00O.OooO00o(c0170OooO00o.OooO00o(), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000o0OooO00o;
    }

    @Composable
    @NotNull
    public static final o0000O0 OooO0O0(@Nullable String str, @Nullable Function1<? super OooO00o.C0170OooO00o, Unit> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-404892806);
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-404892806, i, -1, "com.yalla.yalla.ext.netImageHeaderPainter (CoilImageRequestExt.kt:50)");
        }
        OooO00o.C0170OooO00o c0170OooO00o = new OooO00o.C0170OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0170OooO00o.f8590OooO0OO = OooOOO.OooO00o(str);
        int i3 = oOo00OO0.icon_head_default;
        c0170OooO00o.OooO0OO(i3);
        c0170OooO00o.OooO0Oo(i3);
        if (function1 != null) {
            function1.invoke(c0170OooO00o);
        }
        o0000O0 o0000o0OooO00o = o000O00O.OooO00o(c0170OooO00o.OooO00o(), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000o0OooO00o;
    }

    @Composable
    @NotNull
    public static final o0000O0 OooO0OO(@Nullable String str, @Nullable Function1<? super OooO00o.C0170OooO00o, Unit> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1745065735);
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745065735, i, -1, "com.yalla.yalla.ext.netImagePainter (CoilImageRequestExt.kt:36)");
        }
        OooO00o.C0170OooO00o c0170OooO00o = new OooO00o.C0170OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0170OooO00o.f8590OooO0OO = str;
        if (function1 != null) {
            function1.invoke(c0170OooO00o);
        }
        o0000O0 o0000o0OooO00o = o000O00O.OooO00o(c0170OooO00o.OooO00o(), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000o0OooO00o;
    }

    @Composable
    @NotNull
    public static final o0000O0 OooO0Oo(@Nullable String str, @Nullable Function1<? super OooO00o.C0170OooO00o, Unit> function1, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-940437661);
        if ((i2 & 1) != 0) {
            function1 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-940437661, i, -1, "com.yalla.yalla.ext.netImagePicturePainter (CoilImageRequestExt.kt:65)");
        }
        OooO00o.C0170OooO00o c0170OooO00o = new OooO00o.C0170OooO00o((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        c0170OooO00o.f8590OooO0OO = str;
        int i3 = oOo00OO0.icon_picture_default;
        c0170OooO00o.OooO0OO(i3);
        c0170OooO00o.OooO0Oo(i3);
        if (function1 != null) {
            function1.invoke(c0170OooO00o);
        }
        o0000O0 o0000o0OooO00o = o000O00O.OooO00o(c0170OooO00o.OooO00o(), composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return o0000o0OooO00o;
    }

    @NotNull
    public static final void OooO0o(@NotNull OooO00o.C0170OooO00o c0170OooO00o, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(c0170OooO00o, "<this>");
        c0170OooO00o.f8620Oooo00O = drawable;
        c0170OooO00o.f8619Oooo000 = 0;
        c0170OooO00o.f8617OooOooo = drawable;
        c0170OooO00o.f8616OooOooO = 0;
    }

    @NotNull
    public static final void OooO0o0(@NotNull OooO00o.C0170OooO00o c0170OooO00o, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(c0170OooO00o, "<this>");
        c0170OooO00o.OooO0OO(i);
        c0170OooO00o.OooO0Oo(i);
    }
}
