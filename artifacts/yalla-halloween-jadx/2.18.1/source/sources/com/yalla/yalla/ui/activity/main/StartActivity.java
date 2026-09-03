package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p487o0o000oO.o0ooOOo;
import p515o0o0O00.o00O00;
import p617o0oo0o.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/StartActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class StartActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Object obj;
        super.onResume();
        o0ooOOo o0ooooo2 = o0ooOOo.f40960OooO00o;
        if (!o0ooOOo.f40961OooO0O0 && (getIntent().getFlags() & 4194304) == 0) {
            Intrinsics.checkNotNullParameter("StartActivity onResume before await", ViewHierarchyConstants.TEXT_KEY);
            o00O00.OooO0OO("TaskDispatcher", "StartActivity onResume before await  " + (System.currentTimeMillis() - o00000O.f48475OooO00o));
            o0O0o.OooO0O0 oooO0O0 = o0O0o.OooO0O0.f36054OooO00o;
            try {
                if (o0O0o.OooO0O0.f36062OooOO0.get() > 0) {
                    CountDownLatch countDownLatch = o0O0o.OooO0O0.f36053OooO;
                    Intrinsics.checkNotNull(countDownLatch);
                    countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException unused) {
            }
            Intrinsics.checkNotNullParameter("StartActivity onResume after await", ViewHierarchyConstants.TEXT_KEY);
            o00O00.OooO0OO("TaskDispatcher", "StartActivity onResume after await  " + (System.currentTimeMillis() - o00000O.f48475OooO00o));
            Intent intent = getIntent();
            if ((24 & 4) != 0) {
                intent = null;
            }
            int i = (24 & 8) != 0 ? -1 : 0;
            int i2 = (24 & 16) == 0 ? 0 : -1;
            Intrinsics.checkNotNullParameter(this, "context");
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClass(this, MainActivity.class);
            intent.putExtra("page", i);
            intent.putExtra("INTENT_CHILD_PAGE", i2);
            startActivity(intent);
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null && (obj = extras.get("extra")) != null) {
            LiveEventBus.get("INTENT_FIREBASE").post(obj);
        }
        Uri data = getIntent().getData();
        if (data != null) {
            LiveEventBus.get("INTENT_SCHEME").post(data);
        }
        finish();
    }
}
