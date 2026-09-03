package p511o0o0O;

import android.webkit.JavascriptInterface;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;
import p576o0oOoOOo.oO0o0000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends oO0o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Integer f50910OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f50911OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f50912OooO0OO;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftFailedToSave$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f50913OooO0Oo;

        /* JADX INFO: renamed from: o0o0O.OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0469OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ GiftCustomMadeWebManager f50914OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0469OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
                super(0);
                this.f50914OooO0Oo = giftCustomMadeWebManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                o0oo0000.OooO00o.OooO0O0("102222");
                this.f50914OooO0Oo.OooO00o();
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ GiftCustomMadeWebManager f50915OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(GiftCustomMadeWebManager giftCustomMadeWebManager) {
                super(0);
                this.f50915OooO0Oo = giftCustomMadeWebManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                o0oo0000.OooO00o.OooO0O0("102221");
                this.f50915OooO0Oo.OooO0O0();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f50913OooO0Oo = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f50913OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            GiftCustomMadeWebManager giftCustomMadeWebManager = this.f50913OooO0Oo;
            SVGAView svgaLoading = giftCustomMadeWebManager.f27526OooO0OO.f44108OooO0OO;
            Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
            o000O.OooO0O0(svgaLoading);
            TextView tvSaving = giftCustomMadeWebManager.f27526OooO0OO.f44109OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(tvSaving, "tvSaving");
            o000O.OooO0O0(tvSaving);
            o0oo0000.OooO00o.OooO0O0("202024");
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(giftCustomMadeWebManager.f27524OooO00o);
            o000o.OooOo00(o0000.OooO0OO(o000000.failed_save_try_again));
            o000o.OooO0o(false);
            o000o.OooOo0o(o0000.OooO0OO(o000000.Cancel));
            o000o.OooOo0O(new C0469OooO00o(giftCustomMadeWebManager));
            o000o.OooOOOo(o0000.OooO0OO(o000000.try_again));
            o000o.OooOo0(new OooO0O0(giftCustomMadeWebManager));
            o000o.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftOpenRules$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f50916OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f50916OooO0Oo = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f50916OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(this.f50916OooO0Oo.f27524OooO00o);
            o000o.OooOoOO();
            o000o.OooOoO(o0000.OooO0OO(o000000.Instructions));
            o000o.OooOo00(o0000.OooO0OO(o000000.Room_gifts_custom_made_content));
            o000o.OooOOo0(false);
            o000o.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftSuccesToSave$1$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f50917OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f50918OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooOO0 f50919OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ GiftPropModel f50920OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(GiftCustomMadeWebManager giftCustomMadeWebManager, OooOO0 oooOO1, String str, GiftPropModel giftPropModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f50917OooO0Oo = giftCustomMadeWebManager;
            this.f50919OooO0o0 = oooOO1;
            this.f50918OooO0o = str;
            this.f50920OooO0oO = giftPropModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f50917OooO0Oo, this.f50919OooO0o0, this.f50918OooO0o, this.f50920OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Function3<? super Integer, ? super String, ? super GiftPropModel, Unit> function3 = this.f50917OooO0Oo.f27523OooO;
            if (function3 != null) {
                Integer num = this.f50919OooO0o0.f50910OooO00o;
                GiftPropModel giftPropModel = this.f50920OooO0oO;
                Intrinsics.checkNotNull(giftPropModel);
                function3.invoke(num, this.f50918OooO0o, giftPropModel);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftSuccesToSave$2", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f50921OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f50921OooO0Oo = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f50921OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            GiftCustomMadeWebManager giftCustomMadeWebManager = this.f50921OooO0Oo;
            SVGAView svgaLoading = giftCustomMadeWebManager.f27526OooO0OO.f44108OooO0OO;
            Intrinsics.checkNotNullExpressionValue(svgaLoading, "svgaLoading");
            o000O.OooO0O0(svgaLoading);
            TextView tvSaving = giftCustomMadeWebManager.f27526OooO0OO.f44109OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(tvSaving, "tvSaving");
            o000O.OooO0O0(tvSaving);
            giftCustomMadeWebManager.f27531OooO0oo = false;
            Function0<Unit> function0 = giftCustomMadeWebManager.f27530OooO0oO;
            if (function0 != null) {
                function0.invoke();
                giftCustomMadeWebManager.f27530OooO0oO = null;
            }
            return Unit.INSTANCE;
        }
    }

    public OooOO0(GiftCustomMadeWebManager giftCustomMadeWebManager, GiftPropModel giftPropModel) {
        this.f50911OooO0O0 = giftCustomMadeWebManager;
        this.f50912OooO0OO = giftPropModel;
    }

    @JavascriptInterface
    public final void customGiftFailedToSave() {
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f50911OooO0O0;
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27524OooO00o), new OooO00o(giftCustomMadeWebManager, null));
    }

    @JavascriptInterface
    public final void customGiftOpenRules() {
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f50911OooO0O0;
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27524OooO00o), new OooO0O0(giftCustomMadeWebManager, null));
    }

    @JavascriptInterface
    public final void customGiftShowToast(int i) {
        if (i == 1) {
            showToastMsg(o0000.OooO0OO(o000000.gift_toast_pp));
        } else {
            if (i != 2) {
                return;
            }
            o0oo0000.OooO00o.OooO0O0("102220");
            showToastMsg(o0000.OooO0OO(o000000.ResetSucceeded));
        }
    }

    @JavascriptInterface
    public final void customGiftSuccesToSave(@Nullable String str) {
        o0000O00.OooO0O0("customGiftSuccesToSave    savePrice:  " + this.f50910OooO00o + "    ");
        StringBuilder sb = new StringBuilder("customGiftSuccesToSave    picUrl:     ");
        sb.append(str);
        o0000O00.OooO0O0(sb.toString());
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f50911OooO0O0;
        if (str != null) {
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27524OooO00o), new OooO0OO(giftCustomMadeWebManager, this, str, this.f50912OooO0OO, null));
        }
        o0oo0000.OooO00o.OooO0O0("202023");
        if (giftCustomMadeWebManager.f27531OooO0oo) {
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27524OooO00o), new OooO0o(giftCustomMadeWebManager, null));
        } else {
            giftCustomMadeWebManager.OooO00o();
        }
    }

    @JavascriptInterface
    public final void customGiftSuccesToSavePre(int i) {
        this.f50910OooO00o = Integer.valueOf(i);
    }

    @Override // p576o0oOoOOo.oO0o0000
    public final void onClosePage() {
        this.f50911OooO0O0.OooO0O0();
    }

    @JavascriptInterface
    public final void webEventLog(@Nullable String str, @Nullable String str2) {
        HashMap mapOooO0O0 = str2 != null ? com.code.android.json.OooO00o.OooO0O0(str2) : null;
        if (str != null) {
            o0oo0000.OooO00o.OooO0OO(str, mapOooO0O0);
        }
        StringBuilder sbOooO00o = androidx.compose.compiler.plugins.kotlin.OooO0OO.OooO00o("webEventLog:     ", str, "        ", str2, "          ");
        sbOooO00o.append(mapOooO0O0);
        o0000O00.OooO0O0(sbOooO00o.toString());
    }
}
