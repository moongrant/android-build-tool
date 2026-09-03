package p520o0o0O0oo;

import android.webkit.JavascriptInterface;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
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
import p157o00OoOO0.o0OO00O;
import p572o0oOoOO0.oO000O0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class w5 extends oO000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Integer f53357OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ GiftCustomMadeWebManager f53358OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ GiftPropModel f53359OooO0OO;

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftFailedToSave$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f53360OooO0Oo;

        /* JADX INFO: renamed from: o0o0O0oo.w5$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0502OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ GiftCustomMadeWebManager f53361OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0502OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager) {
                super(0);
                this.f53361OooO0Oo = giftCustomMadeWebManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                o0OO000.OooO00o("102222");
                GiftCustomMadeWebManager.OooO00o(this.f53361OooO0Oo);
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ GiftCustomMadeWebManager f53362OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(GiftCustomMadeWebManager giftCustomMadeWebManager) {
                super(0);
                this.f53362OooO0Oo = giftCustomMadeWebManager;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                o0OO000.OooO00o("102221");
                this.f53362OooO0Oo.OooO0O0();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f53360OooO0Oo = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f53360OooO0Oo, continuation);
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
            GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53360OooO0Oo;
            SVGAView sVGAView = giftCustomMadeWebManager.f27998OooO0OO.f59336OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView);
            TextView textView = giftCustomMadeWebManager.f27998OooO0OO.f59337OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
            o000OO00.OooO0O0(textView);
            o0OO000.OooO00o("202024");
            o0OO00O o0oo00o2 = new o0OO00O(giftCustomMadeWebManager.f27996OooO00o);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.failed_save_try_again));
            o0oo00o2.OooO0o(false);
            o0oo00o2.OooOo0o(o0000.OooO0OO(oO00OOo0.Cancel));
            o0oo00o2.OooOo0O(new C0502OooO00o(giftCustomMadeWebManager));
            o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.try_again));
            o0oo00o2.OooOo0(new OooO0O0(giftCustomMadeWebManager));
            o0oo00o2.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftOpenRules$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f53363OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f53363OooO0Oo = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f53363OooO0Oo, continuation);
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
            o0OO00O o0oo00o2 = new o0OO00O(this.f53363OooO0Oo.f27996OooO00o);
            o0oo00o2.OooOoOO();
            o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.Instructions));
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.Room_gifts_custom_made_content));
            o0oo00o2.OooOOo0(false);
            o0oo00o2.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftSuccesToSave$1$1", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f53364OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f53365OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ w5 f53366OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ GiftPropModel f53367OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(GiftCustomMadeWebManager giftCustomMadeWebManager, w5 w5Var, String str, GiftPropModel giftPropModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f53364OooO0Oo = giftCustomMadeWebManager;
            this.f53366OooO0o0 = w5Var;
            this.f53365OooO0o = str;
            this.f53367OooO0oO = giftPropModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f53364OooO0Oo, this.f53366OooO0o0, this.f53365OooO0o, this.f53367OooO0oO, continuation);
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
            Function3<? super Integer, ? super String, ? super GiftPropModel, Unit> function3 = this.f53364OooO0Oo.f27995OooO;
            if (function3 != null) {
                Integer num = this.f53366OooO0o0.f53357OooO00o;
                GiftPropModel giftPropModel = this.f53367OooO0oO;
                Intrinsics.checkNotNull(giftPropModel);
                function3.invoke(num, this.f53365OooO0o, giftPropModel);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.giftDialog.GiftCustomMadeWebManager$showWebView$5$customGiftSuccesToSave$2", f = "GiftCustomMadeWebManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ GiftCustomMadeWebManager f53368OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(GiftCustomMadeWebManager giftCustomMadeWebManager, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f53368OooO0Oo = giftCustomMadeWebManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f53368OooO0Oo, continuation);
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
            GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53368OooO0Oo;
            SVGAView sVGAView = giftCustomMadeWebManager.f27998OooO0OO.f59336OooO0OO;
            Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaLoading");
            o000OO00.OooO0O0(sVGAView);
            TextView textView = giftCustomMadeWebManager.f27998OooO0OO.f59337OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSaving");
            o000OO00.OooO0O0(textView);
            giftCustomMadeWebManager.f28003OooO0oo = false;
            Function0<Unit> function0 = giftCustomMadeWebManager.f28002OooO0oO;
            if (function0 != null) {
                function0.invoke();
                giftCustomMadeWebManager.f28002OooO0oO = null;
            }
            return Unit.INSTANCE;
        }
    }

    public w5(GiftCustomMadeWebManager giftCustomMadeWebManager, GiftPropModel giftPropModel) {
        this.f53358OooO0O0 = giftCustomMadeWebManager;
        this.f53359OooO0OO = giftPropModel;
    }

    @JavascriptInterface
    public final void customGiftFailedToSave() {
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53358OooO0O0;
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27996OooO00o), new OooO00o(giftCustomMadeWebManager, null));
    }

    @JavascriptInterface
    public final void customGiftOpenRules() {
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53358OooO0O0;
        OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27996OooO00o), new OooO0O0(giftCustomMadeWebManager, null));
    }

    @JavascriptInterface
    public final void customGiftShowToast(int i) {
        if (i == 1) {
            showToastMsg(o0000.OooO0OO(oO00OOo0.gift_toast_pp));
        } else {
            if (i != 2) {
                return;
            }
            o0OO000.OooO00o("102220");
            showToastMsg(o0000.OooO0OO(oO00OOo0.ResetSucceeded));
        }
    }

    @JavascriptInterface
    public final void customGiftSuccesToSave(@Nullable String str) {
        OooOOO0.OooO0O0("customGiftSuccesToSave    savePrice:  " + this.f53357OooO00o + "    ");
        StringBuilder sb = new StringBuilder("customGiftSuccesToSave    picUrl:     ");
        sb.append(str);
        OooOOO0.OooO0O0(sb.toString());
        GiftCustomMadeWebManager giftCustomMadeWebManager = this.f53358OooO0O0;
        if (str != null) {
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27996OooO00o), new OooO0OO(giftCustomMadeWebManager, this, str, this.f53359OooO0OO, null));
        }
        o0OO000.OooO00o("202023");
        if (giftCustomMadeWebManager.f28003OooO0oo) {
            OooOOO.OooO0OO(LifecycleOwnerKt.getLifecycleScope(giftCustomMadeWebManager.f27996OooO00o), new OooO0o(giftCustomMadeWebManager, null));
        } else {
            GiftCustomMadeWebManager.OooO00o(giftCustomMadeWebManager);
        }
    }

    @JavascriptInterface
    public final void customGiftSuccesToSavePre(int i) {
        this.f53357OooO00o = Integer.valueOf(i);
    }

    @Override // p572o0oOoOO0.oO000O0
    public final void onClosePage() {
        this.f53358OooO0O0.OooO0O0();
    }

    @JavascriptInterface
    public final void webEventLog(@Nullable String str, @Nullable String str2) {
        HashMap mapOooO0O0 = str2 != null ? com.code.android.json.OooO00o.OooO0O0(str2) : null;
        if (str != null) {
            o0OO000.OooO0O0(str, mapOooO0O0);
        }
        StringBuilder sbOooO0OO = androidx.compose.compiler.plugins.kotlin.OooO0o.OooO0OO("webEventLog:     ", str, "        ", str2, "          ");
        sbOooO0OO.append(mapOooO0O0);
        OooOOO0.OooO0O0(sbOooO0OO.toString());
    }
}
