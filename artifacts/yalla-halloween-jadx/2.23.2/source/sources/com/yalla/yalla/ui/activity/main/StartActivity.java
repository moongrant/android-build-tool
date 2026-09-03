package com.yalla.yalla.ui.activity.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.storage.Configuration;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p475o0Ooooo0.o0o0000;
import p475o0Ooooo0.oO0Oo;
import p487o0o00O.o000OO;
import p562o0oOo000.oo000o;
import p590o0oOooo0.oO;
import p590o0oOooo0.oOo0o00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/StartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartActivity.kt\ncom/yalla/yalla/ui/activity/main/StartActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
public final class StartActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f25081OooO0o0 = 0;

    @SourceDebugExtension({"SMAP\nStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartActivity.kt\ncom/yalla/yalla/ui/activity/main/StartActivity$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context, @Nullable Uri uri, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            PackageManager packageManager = o000O00O.OooO00o().getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("yalla://launch"));
            intent.setPackage(o000O00O.OooO00o().getPackageName());
            if (uri != null) {
                intent.putExtra("extraData", uri.toString());
            }
            if (z) {
                intent.setFlags(268468224);
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
            if (!listQueryIntentActivities.isEmpty()) {
                context.startActivity(intent);
                ((Activity) context).overridePendingTransition(oo000o.alpha_in, oo000o.anim_empty);
            }
        }

        public static void OooO0O0(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            oo0o0Oo.f43510OooO0Oo = false;
            OooO00o(context, null, true);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.StartActivity$onCreate$1", f = "StartActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return StartActivity.this.new OooO0O0(continuation);
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
            int i = MainActivity.f24940OooOoo;
            StartActivity startActivity = StartActivity.this;
            MainActivity.OooO00o.OooO00o(startActivity, 0, 6);
            startActivity.finish();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        String stringExtra;
        Object obj;
        super.onCreate(bundle);
        boolean z = false;
        if (!oO.OooO00o()) {
            finish();
            o0000O00.OooO0OO("AppComplianceCheck", "killApp exitProcess");
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        Intrinsics.checkNotNullParameter("StartActivity onCreate before await", ViewHierarchyConstants.TEXT_KEY);
        o0000O00.OooO0OO("TaskDispatcher", "StartActivity onCreate before await  " + (System.currentTimeMillis() - oOo0o00.f57239OooO00o));
        try {
            if (p189o00o00oo.o000O00O.f38526OooOO0.get() > 0) {
                CountDownLatch countDownLatch = p189o00o00oo.o000O00O.f38517OooO;
                Intrinsics.checkNotNull(countDownLatch);
                countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused) {
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOOo0().observeForever(new o0O00oO0.o0000O00(o0o0000.f48068OooO0Oo));
        o0O00oO0.OooOOo().observeForever(new o0O00oO0.o0000O00(oO0Oo.f48112OooO0Oo));
        oOo0o00.OooO00o("StartActivity onCreate after await");
        Bundle extras = getIntent().getExtras();
        if (extras != null && (obj = extras.get("extra")) != null) {
            LiveEventBus.get("INTENT_FIREBASE").post(obj);
        }
        if (getIntent().hasExtra("extraData") && (stringExtra = getIntent().getStringExtra("extraData")) != null && getIntent().getData() != null) {
            LiveEventBus.get("INTENT_SCHEME").post(Uri.parse(stringExtra));
        }
        if (oo0o0Oo.f43510OooO0Oo || (getIntent().getFlags() & Configuration.BLOCK_SIZE) != 0) {
            oOo0o00.OooO00o("StartActivity onCreate finish()");
            finish();
            return;
        }
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l == null || l.longValue() != 0) {
            CharSequence charSequence = (CharSequence) o0O00oO0.OooOOOO().getValue();
            if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
                z = true;
            }
        }
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(null), 3, null);
        } else {
            p010OooOOoo.Oooo0.OooO00o(this, o000OO.f48782OooO0O0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        finish();
    }
}
