package com.yalla.yalla.ui.activity;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;
import p650o0ooo.o0OOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public abstract class BaseActivityK extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public o0OOO00 f24675OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final long f24676OooOOo0 = 700;

    public static /* synthetic */ void OooOo0o(BaseActivityK baseActivityK, String str, long j, int i) {
        if ((i & 1) != 0) {
            str = o0000.OooO0OO(o000000.loading);
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        baseActivityK.OooOo0O(j, str);
    }

    public final void OooOo0() {
        o0OOO00 o0ooo00 = this.f24675OooOOo;
        if (o0ooo00 != null) {
            o0ooo00.dismiss();
        }
    }

    public final void OooOo0O(long j, @Nullable String str) {
        if (this.f24675OooOOo == null) {
            this.f24675OooOOo = new o0OOO00(this);
        }
        o0OOO00 o0ooo00 = this.f24675OooOOo;
        if (o0ooo00 != null) {
            o0ooo00.OooO0o0(j, str);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o0OOO00 o0ooo00 = this.f24675OooOOo;
        if (o0ooo00 != null) {
            o0ooo00.dismiss();
        }
        this.f24675OooOOo = null;
    }
}
